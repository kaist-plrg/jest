package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.ir.Interp
import kr.ac.kaist.ires.model.{ Script, ModelHelper, Parser => JSParser }
import kr.ac.kaist.ires.coverage.Visited

object Generator {
  // max iteration
  val MAX_ITER = 100

  // generate JavaScript programs
  def generate: List[Script] = {
    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited

    for (_ <- 0 until MAX_ITER) {
      val script = getSample
      // TODO extend to use modify
      val visited = getVisited(script)
      if (!(visited subsetOf totalVisited)) {
        totalVisited ++= visited
        total ::= script
      }
    }

    total
  }

  // TODO random sampling
  def getSample: Script = JSParser.parse(JSParser.Script(Nil), "var x = 42").get

  // TODO modify given JavaScript program
  def modify(script: Script): Script = script

  // get visited points in ECMAScript
  def getVisited(script: Script): Visited = {
    val interp = new Interp
    val initSt = ModelHelper.initState(script)
    val st = interp(initSt)
    interp.visited
  }
}
