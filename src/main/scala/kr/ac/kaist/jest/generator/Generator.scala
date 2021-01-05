package kr.ac.kaist.jest.generator

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.error.{ NotSupported, Timeout, IRError }
import kr.ac.kaist.jest.ir.{ Interp, CondInst, beautify }
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.mutator._
import kr.ac.kaist.jest.model.{ Script, ModelHelper, Parser }
import kr.ac.kaist.jest.coverage._
import kr.ac.kaist.jest.sampler._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.LINE_SEP
import spray.json._

object Generator extends DefaultJsonProtocol {
  // max iteration
  val MAX_TRIAL = 500
  var recentMutator: Option[Mutator] = None
  var recentNewCovered: Set[Target] = Set()
  var recentInterp: Option[Interp] = None

  // generate JavaScript programs
  def generate(maxIter: Int, loadDir: Option[String]): List[Script] = {
    val runtime = Runtime.getRuntime()

    // log file
    mkdir(GENERATE_DIR)
    val nf = getPrintWriter(s"$GENERATE_DIR/log")
    val nfSimple = getPrintWriter(s"$GENERATE_DIR/simple_log")
    val exceptionDirectory = s"$GENERATE_DIR/exceptions"
    mkdir(exceptionDirectory)

    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited
    var targets: Set[Target] = Set()
    var failed: Set[Target] = Set()
    var generated: Set[String] = Set()
    var errors: Map[Int, String] = Map()

    def log(any: Any, stdout: Boolean = true): Unit = {
      nf.print(any)
      if (stdout) print(any)
    }
    def logln(any: Any, stdout: Boolean = true): Unit = {
      nf.println(any)
      if (stdout) println(any)
    }
    def logSimple(any: Any): Unit = nfSimple.print(any.toString + "\t")
    def loglnSimple(any: Any): Unit = nfSimple.println(any)
    def logFlush(): Unit = {
      nf.flush()
      nfSimple.flush()
    }

    def addScript(script: Script): Boolean = add(script.toString)

    def add(str: String): Boolean = {
      if (generated contains str) return false
      generated += str
      log(f"$str%-80s", false)
      val script = Parser.parse(Parser.Script(Nil), str) match {
        case Parser.Success(result, _) => result
        case _ => return false
      }
      getVisited(script) match {
        case Left(visited) if !(visited subsetOf totalVisited) =>
          logln(": PASS", false)
          val newCovered =
            visited.targetCovered.keySet -- totalVisited.targetCovered.keySet
          recentNewCovered = newCovered
          for (target <- newCovered) {
            val others = target.others
            if (others.forall(targets contains _)) targets --= others
            else targets += target
          }
          totalVisited ++= visited
          total ::= script
          true
        case Left(_) =>
          logln(": FAIL", false)
          false
        case Right(msg) =>
          logln(s": $msg", false)
          if (msg.startsWith("ERROR")) {
            val uid = recentInterp.get.recentInst.get.uid
            val origScript = errors.getOrElse(uid, "")
            if (origScript == "" || origScript.length > str.length)
              errors = errors + (uid -> str)
          }
          false
      }
    }

    lazy val st = System.currentTimeMillis
    def logIterationSummary(k: Int): Unit = {
      val coverage = totalVisited.getCoverage

      logSimple(k + 1)
      logSimple((System.currentTimeMillis - st) / 1000)
      logSimple(coverage.instCovered.size)
      logSimple(coverage.insts.size)
      logSimple(coverage.instCovered.size.toDouble / coverage.insts.size)
      // logSimple(getPercent(coverage.instCovered, coverage.insts))
      logSimple(coverage.condCovered.size)
      logSimple(coverage.conds.size)
      logSimple(coverage.condCovered.size.toDouble / coverage.conds.size)
      // logSimple(getPercent(coverage.condCovered, coverage.conds))
      logSimple(recentMutator.fold("Nothing")(_.name))
      logSimple(recentNewCovered.mkString(";"))
      logSimple(s"${runtime.totalMemory() - runtime.freeMemory()}/${runtime.totalMemory()}")
      val tracer = RHSTracer(total)
      logSimple(tracer.summary)
      loglnSimple("")
    }

    def dumpStatus = {
      val dir = GENERATE_DIR
      mkdir(dir)

      //dump syntax
      val tracer = RHSTracer(total)
      tracer.dump(s"$dir/syntax")

      // dump coverage
      totalVisited.getCoverage.dump(s"$dir/semantics")

      // dump algorithm coverages
      val algoCoverages = totalVisited.getAlgoCoverages
      val algoSummaryContent = algoCoverages.map(cov => cov.summary).mkString(LINE_SEP)
      dumpFile(algoSummaryContent, s"$dir/semantics/algoSummary")
      algoCoverages.foreach(cov => cov.dump(s"$dir/semantics/algorithm"))

      // dump failed
      dumpJson(failed.toList.map {
        case target => FailedCase(totalVisited(target), target.uid)
      }, s"$dir/failed.json")

      //dump scripts
      mkdir(s"$PROGRAMS_DIR")
      for ((script, k) <- total.toList.sortWith(cmp).zipWithIndex) {
        dumpFile(script, s"$PROGRAMS_DIR/$k.js")
      }

      // dump generated
      dumpJson(generated, s"$dir/generated.json")

      // dump error
      dumpJson(errors.toList, s"$dir/errors.json")
      mkdir(s"$dir/errors")
      for (((uid, script), k) <- errors.toList.zipWithIndex) {
        dumpFile(s"// IRError: $uid$LINE_SEP$script", s"$dir/errors/IRError$k.js")
      }
    }

    logln("Load Samples...")
    val samples = loadDir match {
      case Some(directory) => getSample(s"$directory/scripts/")
      case None => getSample()
    }
    logln(s"# of Samples: ${samples.size}")

    logln("Running samples...")
    for (script <- samples) addScript(script)

    loadDir.foreach((directory) => {
      logln("Loading generated scripts...")
      generated = readJson[Set[String]](s"$directory/generated.json")
    })

    logln("Mutating samples...")
    var scriptString = ""
    var uid = -1

    logIterationSummary(-1)
    for (k <- 0 until maxIter) {
      try {
        val targetSeq = targets.toSeq
        val target = choose(targetSeq)
        scriptString = totalVisited(target)
        uid = target.uid

        logln(s"${k + 1}th iteration: $scriptString")
        logln(s"target instruction: $uid", false)

        val beautified = beautify(insts(uid), detail = false)
        val script = Parser.parse(Parser.Script(Nil), scriptString).get
        val mutators = List[Mutator](
          RandomMutation(script),
          NearestSyntaxTreeMutation(uid, script),
          StringSubstitution(uid, script),
          ObjectSubstitution(script),
          StatementInsertion(script)
        )

        var trial = 0
        while (trial < MAX_TRIAL && !add(mutateString(mutators))) trial += 1

        log("result: ")
        if (trial == MAX_TRIAL) {
          logln("FAILED")
          failed += target
        } else {
          failed -= target
          logln(totalVisited.simpleString)
          logIterationSummary(k)
        }
      } catch {
        case e: Throwable => {
          logln(e.getStackTrace.mkString(LINE_SEP))

          val nfException = getPrintWriter(s"$exceptionDirectory/$k.json")
          val result = Map(
            ("message" -> e.getMessage()),
            ("stackTrace" -> e.getStackTrace().mkString(LINE_SEP)),
            ("originalScript" -> scriptString),
            ("recentMutator" -> recentMutator.fold("Nothing")(_.name)),
            ("targetUid" -> uid.toString()),
          )
          nfException.println(result.toJson)
          nfException.close()
        }
      }

      if (((k + 1) % 100) == 0) dumpStatus

      logFlush()
    }

    val coverage = totalVisited.getCoverage
    val algoCoverages = totalVisited.getAlgoCoverages

    logln(s"TOTAL: ${total.length} / ${generated.size}")
    logln(coverage.summary)
    algoCoverages.foreach(cov => logln(cov.summary, false))

    dumpStatus

    // close PrintWriter for the log file
    nf.close()
    nfSimple.close()

    total
  }

  // compare scripts
  def cmp(s1: Script, s2: Script): Boolean = {
    val str1 = s1.toString
    val str2 = s2.toString

    val len1 = str1.length
    val len2 = str2.length

    if (len1 == len2) str1 < str2 else len1 < len2
  }
  def cmpWithEval(s1: Script, s2: Script): Boolean = {
    val str1 = s1.toString
    val str2 = s2.toString

    val len1 = str1.length
    val len2 = str2.length

    val priority1 = if (str1.startsWith("( 0 , eval )")) 2 else if (str1.startsWith("eval")) 1 else 0
    val priority2 = if (str2.startsWith("( 0 , eval )")) 2 else if (str2.startsWith("eval")) 1 else 0

    if (priority1 == priority2) if (len1 == len2) str1 < str2 else len1 < len2 else priority1 < priority2
  }

  // random sampling
  def getSample(dir: String = SEED_DIR): List[Script] = (for {
    file <- walkTree(dir)
    filename = file.toString if jsFilter(filename)
    str = readFile(filename)
    script = Parser.parse(Parser.Script(Nil), str).get
  } yield script).toList.sortWith(cmp)

  // mutate given JavaScript program
  def mutate(mutators: List[Mutator]): Script =
    mutate(weightedChoose(mutators.map(m => (m, m.weight))))
  def mutate(mutator: Mutator): Script = {
    recentMutator = Some(mutator)
    var mutated = mutator.script
    do mutated = mutator.mutate while (!ValidityChecker(mutated.toString))
    mutated
  }

  // mutate given JavaScript program(return in String)
  def mutateString(mutators: List[Mutator]): String =
    mutateString(weightedChoose(mutators.map(m => (m, m.weight))))
  def mutateString(mutator: Mutator): String = {
    recentMutator = Some(mutator)
    var mutated = mutator.script
    do mutated = mutator.mutate while (!ValidityChecker(mutated.toString))
    mutated.toString
  }

  // get visited points in ECMAScript
  def getVisited(script: Script): Either[Visited, String] = try {
    val interp = new Interp(timeLimit = Some(1))
    recentInterp = Some(interp)
    val initSt = ModelHelper.initState(script)
    val st = interp(initSt)
    Left(interp.visited)
  } catch {
    case Timeout => Right("TIMEOUT")
    case NotSupported(msg) => Right(s"NOT-SUPPORTED [$msg]")
    case IRError(msg) => Right(s"ERROR [$msg]")
  }
}
