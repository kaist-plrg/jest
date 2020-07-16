package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.{ Parser, Sampler, Script }
import kr.ac.kaist.ires.model.{ Expression, Expression0, AssignmentExpression, AssignmentExpression0 }
import kr.ac.kaist.ires.model.{ StatementList, StatementList0, Statement, Statement2 }
import kr.ac.kaist.ires.sampler.ValueSampler._
import kr.ac.kaist.ires.util.Useful._

object LimitedDepthSampler extends Sampler {
  // depth of statements
  val STMT_DEPTH: Int = 4

  // depth of expressions
  val EXPR_DEPTH: Int = 2

  // number of samples
  val SIZE: Int = 1000

  // restricted sampler
  object BasicSampler extends Sampler {
    def oldStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement =
      super.Statement(depth, pYield, pAwait, pReturn)
    def oldAssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression =
      super.AssignmentExpression(depth, pIn, pYield, pAwait)

    val emptyStmtList = Parser.parse(Parser.StatementList(List(false, false, false)), ";").get
    override def StatementList(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementList = emptyStmtList
    val emptyStmt = Parser.parse(Parser.Statement(List(false, false, false)), ";").get
    override def Statement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement = emptyStmt

    val emptyString = Parser.parse(Parser.AssignmentExpression(List(false, false, false)), "''").get.asInstanceOf[AssignmentExpression0]
    override def AssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression = emptyString
    val emptyStringExpr = Expression0(emptyString, List(false, false, false))
    override def Expression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): Expression = emptyStringExpr
  }

  // get samples
  def getSample: List[Script] = getSample(false)
  def getSample(debug: Boolean): List[Script] = {
    var scripts = Set[String]()
    while (scripts.size < SIZE) {
      val script = if (randBool) {
        val expr = BasicSampler.oldAssignmentExpression(EXPR_DEPTH, false, false, false).toString
        s"var x = $expr"
      } else BasicSampler.oldStatement(STMT_DEPTH, false, false, false).toString
      if (!scripts.contains(script) && ValidityChecker(script)) {
        scripts += script
        if (debug) {
          if (scripts.size % (SIZE / 100) == 0) print("#")
          if (scripts.size % (SIZE / 10) == 0) println
        }
      }
    }
    val parser = Parser.Script(Nil)
    val result = scripts.toList.map(Parser.parse(parser, _).get)
    result
  }
}
