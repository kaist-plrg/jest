package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.error.{ NotSupported, Timeout, IRError }
import kr.ac.kaist.ires.ir.{ Interp, CondInst, beautify }
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.model.{ Script, ModelHelper, Parser }
import kr.ac.kaist.ires.coverage._
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.LINE_SEP
import spray.json._

object Generator extends DefaultJsonProtocol {
  // max iteration
  val MAX_TRIAL = 500
  var recentMutator: Option[Mutator] = None
  var recentNewCovered: Set[Target] = Set()

  // generate JavaScript programs
  def generate(debug: Boolean, maxIter: Int, loadDir: Option[String]): List[Script] = {
    // log file
    mkdir(GEN_RES_DIR)
    val nf = getPrintWriter(s"$GEN_RES_DIR/log")
    val nfSimple = getPrintWriter(s"$GEN_RES_DIR/simple_log")

    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited
    var targets: Set[Target] = Set()
    var failed: Set[Target] = Set()
    var generated: Set[String] = Set()

    def log(any: Any, stdout: Boolean = true): Unit = {
      nf.print(any)
      if (debug || stdout) print(any)
    }
    def logln(any: Any, stdout: Boolean = true): Unit = {
      nf.println(any)
      if (debug || stdout) println(any)
    }
    def logSimple(any: Any): Unit = nfSimple.print(any.toString + "\t")
    def loglnSimple(any: Any): Unit = nfSimple.println(any)
    def logFlush(): Unit = {
      nf.flush()
      nfSimple.flush()
    }

    def add(script: Script): Boolean = {
      val str = script.toString
      if (generated contains str) return false
      generated += str
      log(f"$script%-80s", false)
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
          false
      }
    }

    lazy val st = System.currentTimeMillis
    def logIterationSummary(k: Int): Unit = {
      val coverage = totalVisited.getCoverage

      logSimple(k + 1)
      logSimple((System.currentTimeMillis - st) / 1000)
      logSimple(coverage.instCovered.size)
      logSimple(getPercent(coverage.instCovered, coverage.insts))
      logSimple(coverage.condCovered.size)
      logSimple(getPercent(coverage.condCovered, coverage.conds))
      logSimple(recentMutator.fold("Nothing")(_.name))
      logSimple(recentNewCovered.mkString(";"))
      loglnSimple("")
    }

    logln("Load Samples...")
    val samples = loadDir match {
      case Some(directory) => getSampleFrom(s"$directory/scripts/")
      case None => getSample
    }
    logln(s"# of Samples: ${samples.size}")

    logln("Calculating syntax coverage...")
    val tracer = RHSTracer(samples)
    logln(tracer.summary)
    tracer.dump(s"$GEN_RES_DIR/syntax")

    logln("Running samples...")
    for (script <- samples) add(script)

    loadDir.foreach((directory) => {
      logln("Loading generated scripts...")
      generated = readJson[Set[String]](s"$directory/generated.json")
    })

    logln("Mutating samples...")
    for (k <- 0 until maxIter) {
      val targetSeq = targets.toSeq
      val target = choose(targetSeq)
      val scriptString = totalVisited(target)
      val uid = target.uid
      val beautified = beautify(insts(uid), detail = false)
      val script = Parser.parse(Parser.Script(Nil), scriptString).get
      val mutators = List[Mutator](
        // StringLiteralReplacer(uid, script),
        // NearSyntaxReplacer(uid, script),
        // StatementAppender(script),
        SimpleReplacer(script),
        ObjectReplacer(script),
      )

      logln(s"${k + 1}th iteration: $scriptString")
      logln(s"target instruction: $uid", false)
      var trial = 0
      while (trial < MAX_TRIAL && !add(mutate(mutators))) trial += 1

      log("result: ")
      if (trial == MAX_TRIAL) {
        logln("FAILED")
        failed += target
      } else {
        failed -= target
        logln(totalVisited.simpleString)
        logIterationSummary(k)
      }

      if (((k + 1) % 100) == 0) {
        val dir = s"$GEN_RES_DIR/iteration/${k + 1}"
        mkdir(dir)
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
        mkdir(s"$dir/scripts")
        for ((script, k) <- total.zipWithIndex) {
          dumpFile(script, s"$dir/scripts/$k.js")
        }
        // dump generated
        dumpJson(generated, s"$dir/generated.json")
      }

      logFlush()
    }

    val coverage = totalVisited.getCoverage
    val algoCoverages = totalVisited.getAlgoCoverages

    logln(s"TOTAL: ${total.length} / ${generated.size}")
    logln(coverage.summary)
    algoCoverages.foreach(cov => logln(cov.summary, false))

    // dump coverage
    coverage.dump(s"$GEN_RES_DIR/semantics")

    // dump algorithm coverages
    val algoSummaryContent = algoCoverages.map(cov => cov.summary).mkString(LINE_SEP)
    dumpFile(algoSummaryContent + LINE_SEP, s"$GEN_RES_DIR/semantics/algoSummary")
    algoCoverages.foreach(cov => cov.dump(s"$GEN_RES_DIR/semantics/algorithm"))

    // dump failed
    dumpJson(failed.toList.map {
      case target => FailedCase(totalVisited(target), target.uid)
    }, s"$GEN_RES_DIR/failed.json")

    // dump generated
    dumpJson(generated, s"$GEN_RES_DIR/generated.json")

    // close PrintWriter for the log file
    nf.close()
    nfSimple.close()

    total
  }

  // random sampling
  def getSample: List[Script] = (for {
    file <- walkTree(SAMPLE_DIR)
    filename = file.toString if jsFilter(filename)
    str = readFile(filename)
    script = Parser.parse(Parser.Script(Nil), str).get
  } yield script).toList

  // random sampling from the given directory
  def getSampleFrom(dir: String): List[Script] = (for {
    file <- walkTree(dir)
    filename = file.toString if jsFilter(filename)
    str = readFile(filename)
    script = Parser.parse(Parser.Script(Nil), str).get
  } yield script).toList

  // mutate given JavaScript program
  def mutate(mutators: List[Mutator]): Script =
    mutate(weightedChoose(mutators.map(m => (m, m.weight))))
  def mutate(mutator: Mutator): Script = {
    recentMutator = Some(mutator)
    var mutated = mutator.script
    do mutated = mutator.mutate while (!ValidityChecker(mutated.toString))
    mutated
  }

  // get visited points in ECMAScript
  def getVisited(script: Script): Either[Visited, String] = try {
    val interp = new Interp(timeLimit = Some(1))
    val initSt = ModelHelper.initState(script)
    val st = interp(initSt)
    Left(interp.visited)
  } catch {
    case Timeout => Right("TIMEOUT")
    case NotSupported(msg) => Right(s"NOT-SUPPORTED [$msg]")
    case IRError(msg) => Right(s"ERROR [$msg]")
  }
}
