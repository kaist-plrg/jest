package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.{ Parser, Sampler, Script }
import kr.ac.kaist.ires.model.{ Expression, Expression0, AssignmentExpression, AssignmentExpression0 }
import scala.util.Random

object LimitedDepthSampler extends Sampler {
  val MAX_DEPTH: Int = 2
  val SIZE: Int = 1000
  val rand: Random = new Random

  val basicSampler = new Sampler
  val assignExpr = Parser.parse(Parser.AssignmentExpression(List(false, false, false)), "''").get.asInstanceOf[AssignmentExpression0]
  val expr = Parser.parse(Parser.Expression(List(false, false, false)), "''").get.asInstanceOf[Expression0]
  val stmtSampler = new Sampler {
    override def AssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression =
      assignExpr.copy(parserParams = List(pIn, pYield, pAwait))
    override def Expression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): Expression =
      expr.copy(parserParams = List(pIn, pYield, pAwait))
  }

  val scripts: List[String] = {
    var set = Set[String]()
    println("Sampling...")
    while (set.size < SIZE) {
      val script = if (rand.nextBoolean) {
        val expr = basicSampler.AssignmentExpression(MAX_DEPTH, false, false, false).toString
        s"var x = $expr"
      } else stmtSampler.Statement(MAX_DEPTH, false, false, false).toString
      if (!set.contains(script) && ValidityChecker(script)) set += script
    }
    println("Finished Sampling")
    set.toList
  }
  def getSample: List[Script] = scripts.map(str => {
    Parser.parse(Parser.Script(Nil), str).get
  })
}
