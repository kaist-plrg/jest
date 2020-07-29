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
  val MAX_ITER = 100
  val MAX_TRIAL = 500

  // generate JavaScript programs
  def generate: List[Script] = generate(false)
  def generate(debug: Boolean): List[Script] = {
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
      if (stdout && debug) print(any)
    }
    def logln(any: Any, stdout: Boolean = true): Unit = {
      nf.println(any)
      if (stdout && debug) println(any)
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
      loglnSimple("")
    }

    logln("Load Samples...")
    val samples = getSample
    logln(s"# of Samples: ${samples.size}")

    logln("Calculating syntax coverage...")
    val tracer = RHSTracer(samples)
    logln(tracer.summary)
    tracer.dump(s"$GEN_RES_DIR/syntax")

    logln("Running samples...")
    for (script <- samples) add(script)

    logln("Mutating samples...")
    for (k <- 0 until MAX_ITER) {
      val targetSeq = targets.toSeq
      val target = choose(targetSeq)
      val scriptString = totalVisited(target)
      val uid = target.uid
      val beautified = beautify(insts(uid), detail = false)
      val script = Parser.parse(Parser.Script(Nil), scriptString).get
      val replacer = SimpleReplacer
      // val replacer = NearSyntaxReplacer(uid, script)

      logln(s"${k + 1}th iteration: $scriptString")
      logln(s"target instruction: $uid", false)
      var trial = 0
      while (trial < MAX_TRIAL && !add(mutate(script, replacer))) trial += 1

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
        // dump generated
        dumpJson(generated, s"$dir/generated.json")
        }
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

  // mutate given JavaScript program
  def mutate(script: Script, replacer: Mutator): Script = {
    var mutated = script
    do mutated = replacer(script) while (!ValidityChecker(mutated.toString))
    mutated
  }
  def mutate(script: Script, mutators: List[Mutator]): Script = {
    var mutated = script
    do mutated = choose(mutators)(script) while (!ValidityChecker(mutated.toString))
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
