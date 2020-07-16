package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.GENERATE_DIR
import kr.ac.kaist.ires.error.{ NotSupported, Timeout }
import kr.ac.kaist.ires.ir.Interp
import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.model.{ Script, ModelHelper }
import kr.ac.kaist.ires.coverage.Visited
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._

object Generator {
  // max iteration
  val MAX_ITER = 100
  val MAX_TRIAL = 100
  val MAX_TRIAL_ITER = 10

  // generate JavaScript programs
  def generate: List[Script] = generate(false)
  def generate(debug: Boolean): List[Script] = {
    // log file
    val nf = getPrintWriter(s"$GENERATE_DIR/log")

    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited
    var condMap: Map[(Int, Boolean), Script] = Map()
    var targets: Set[(Int, Boolean)] = Set()
    var count: Int = 0

    def log(any: Any): Unit = {
      nf.print(any)
      if (debug) print(any)
    }
    def logln(any: Any): Unit = {
      nf.println(any)
      if (debug) println(any)
    }

    def add(script: Script): Boolean = {
      count += 1
      log(f"$script%-80s")
      getVisited(script) match {
        case Left(visited) if !(visited subsetOf totalVisited) =>
          logln(": PASS")
          val newCondCovered = visited.getCondCovered -- totalVisited.getCondCovered
          for (cond <- newCondCovered) {
            val (x, b) = cond
            val neg = (x, !b)
            if (targets contains neg) targets -= neg
            else targets += cond
            condMap += cond -> script
          }
          totalVisited ++= visited
          total ::= script
          true
        case Left(_) =>
          logln(": FAIL")
          false
        case Right(msg) =>
          logln(s": $msg")
          false
      }
    }

    val samples = getSample
    println("Running samples...")
    for (script <- samples) add(script)

    println("Mutating samples...")
    for (k <- 0 until MAX_ITER) {
      log(s"${k + 1}th iteration: ")
      var iter = 0
      var trial = 0
      val targetSeq = targets.toSeq

      do {
        iter += 1
        trial = 0
        // val target = condMap(choose(targetSeq))
        val target = choose(total)
        while (trial < MAX_TRIAL && !add(mutate(target))) trial += 1
      } while (iter < MAX_TRIAL_ITER && trial == MAX_TRIAL)

      if (iter == MAX_TRIAL_ITER) logln("FAILED")
      else logln(totalVisited.getCondCovered.size)
    }

    val coverage = totalVisited.getCoverage

    println
    total.foreach(println _)
    println(s"TOTAL: ${total.length} / $count")
    println(coverage.summary)

    // dump coverage
    coverage.dump(GENERATE_DIR)

    // close PrintWriter for the log file
    nf.close()

    total
  }

  // random sampling
  def getSample: List[Script] = LimitedDepthSampler.getSample

  // mutate given JavaScript program
  def mutate(script: Script): Script = SimpleExprReplacer(script)

  // get visited points in ECMAScript
  def getVisited(script: Script): Either[Visited, String] = try {
    val interp = new Interp(timeLimit = Some(1))
    val initSt = ModelHelper.initState(script)
    val st = interp(initSt)
    Left(interp.visited)
  } catch {
    case Timeout => Right("TIMEOUT")
    case NotSupported(msg) => Right(s"NOT-SUPPORTED [$msg]")
  }
}
