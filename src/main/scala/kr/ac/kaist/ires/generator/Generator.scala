package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.error.{ NotSupported, Timeout }
import kr.ac.kaist.ires.ir.Interp
import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.coverage.Visited
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._
import scala.util.Random

object Generator {
  // max iteration
  val MAX_ITER = 10000
  val rand: Random = new Random

  // generate JavaScript programs
  def generate: List[Script] = {
    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited
    var condMap: Map[(Int, Boolean), Script] = Map()

    def add(script: Script): Unit = {
      print(f"$script%-80s")
      getVisited(script) match {
        case Left(visited) if !(visited subsetOf totalVisited) =>
          println(": PASS")
          val newCondCovered = visited.getCondCovered -- totalVisited.getCondCovered
          for (cond <- newCondCovered) condMap += cond -> script
          totalVisited ++= visited
          total ::= script
        case Left(_) => println(": FAIL")
        case Right(msg) => println(s": $msg")
      }
    }

    for (script <- getSample) add(script)
    // TODO for (_ <- 0 until MAX_ITER) add(mutate(choose(total)))

    val coverage = totalVisited.getCoverage

    println
    total.foreach(println _)
    println(s"TOTAL: ${total.length}")
    println(coverage.summary)

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
