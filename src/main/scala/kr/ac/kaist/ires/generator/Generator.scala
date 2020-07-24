package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.GEN_RES_DIR
import kr.ac.kaist.ires.error.{ NotSupported, Timeout, IRError }
import kr.ac.kaist.ires.ir.{ Interp, CondInst, beautify }
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.model.{ Script, ModelHelper, Parser }
import kr.ac.kaist.ires.coverage.Visited
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.LINE_SEP

object Generator {
  // max iteration
  val MAX_ITER = 100
  val MAX_TRIAL = 500

  // generate JavaScript programs
  def generate: List[Script] = generate(false)
  def generate(debug: Boolean): List[Script] = {
    // log file
    mkdir(GEN_RES_DIR)
    val nf = getPrintWriter(s"$GEN_RES_DIR/log")

    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited
    var targets: Set[(Int, Boolean)] = Set()
    var failed: Set[(Int, Boolean)] = Set()
    var generated: Set[String] = Set()

    def log(any: Any, stdout: Boolean = true): Unit = {
      nf.print(any)
      if (stdout && debug) print(any)
    }
    def logln(any: Any, stdout: Boolean = true): Unit = {
      nf.println(any)
      if (stdout && debug) println(any)
    }

    def add(script: Script): Boolean = {
      val str = script.toString
      if (generated contains str) return false
      generated += str
      log(f"$script%-80s", false)
      getVisited(script) match {
        case Left(visited) if !(visited subsetOf totalVisited) =>
          logln(": PASS", false)
          val visitedCond = visited.getCondCovered.keySet
          val totalCond = totalVisited.getCondCovered.keySet
          val newCondCovered = visitedCond -- totalCond
          for (cond <- newCondCovered) {
            val (x, b) = cond
            val neg = (x, !b)
            if (targets contains neg) targets -= neg
            else targets += cond
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

    logln("Sampling...")
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
      val cond = choose(targetSeq)
      val target = totalVisited.getCondCovered(cond)
      val (uid, _) = cond
      val beautified = beautify(insts(uid), detail = false)
      val replacer: Mutator = if (beautified contains "CONST_normal") ErrorExprReplacer.apply else SimpleExprReplacer.apply

      var trial = 0
      while (trial < MAX_TRIAL && !add(mutate(target, replacer))) trial += 1

      log(s"${k + 1}th iteration: ")
      if (trial == MAX_TRIAL) {
        logln("FAILED")
        failed += cond
      } else {
        failed -= cond
        logln(totalVisited.simpleString)
      }
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
    dumpFile(algoSummaryContent, s"$GEN_RES_DIR/semantics/algoSummary")
    algoCoverages.foreach(cov => cov.dump(s"$GEN_RES_DIR/semantics/algorithm"))

    // dump failed
    dumpJson(failed.toList.map {
      case pair @ (uid, bool) => FailedCase(totalVisited.getCondCovered(pair), uid, bool)
    }, s"$GEN_RES_DIR/failed.json")

    // close PrintWriter for the log file
    nf.close()

    total
  }

  // random sampling
  def getSample: List[Script] = NRSampler.getSample ++ ManualSampler.getSample

  // mutate given JavaScript program
  def mutate(str: String, replacer: Mutator): Script = {
    val script = Parser.parse(Parser.Script(Nil), str).get
    var mutated = script
    do mutated = replacer(script) while (!ValidityChecker(mutated.toString))
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
