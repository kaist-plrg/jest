package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.GEN_RES_DIR
import kr.ac.kaist.ires.error.{ NotSupported, Timeout, IRError }
import kr.ac.kaist.ires.ir.{ Interp, CondInst }
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.model.{ Script, ModelHelper, Parser }
import kr.ac.kaist.ires.coverage.Visited
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.LINE_SEP

object Generator {
  // max iteration
  val MAX_ITER = 10
  val MAX_TRIAL = 100
  val MAX_TRIAL_ITER = 10

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
      var iter = 0
      var trial = 0
      var cond = (0, true)
      val targetSeq = targets.toSeq

      do {
        iter += 1
        trial = 0
        cond = choose(targetSeq)
        val target = totalVisited.getCondCovered(cond)
        val (uid, _) = cond
        val targetMutate = if (insts(uid).toString contains "CONST_normal") mutateWithError(_) else mutate(_)
        while (trial < MAX_TRIAL && !add(targetMutate(target))) trial += 1
        if (trial == MAX_TRIAL) failed += cond
      } while (iter < MAX_TRIAL_ITER && trial == MAX_TRIAL)

      log(s"${k + 1}th iteration: ")
      if (iter == MAX_TRIAL_ITER) logln("FAILED")
      else {
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
  def mutate(str: String): Script = {
    val script = Parser.parse(Parser.Script(Nil), str).get
    var mutated = script
    do mutated = SimpleExprReplacer(script) while (!ValidityChecker(mutated.toString))
    mutated
  }

  def mutateWithError(script: Script): Script = {
    val str = script.toString
    var mutated = script
    do mutated = ErrorExprReplacer(script) while (!ValidityChecker(mutated.toString))
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
