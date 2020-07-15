package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.{ Parser, Sampler, Script }
import kr.ac.kaist.ires.model.{ Expression, Expression0, AssignmentExpression, AssignmentExpression0 }
import kr.ac.kaist.ires.model.{ StatementList, StatementList0, Statement, Statement2 }
import kr.ac.kaist.ires.sampler.ValueSampler._
import kr.ac.kaist.ires.util.Useful._

object LimitedDepthSampler extends Sampler {
  val STMT_DEPTH: Int = 4
  val EXPR_DEPTH: Int = 2
  val SIZE: Int = 10000

  object BasicSampler extends Sampler {
    def oldStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement =
      super.Statement(depth, pYield, pAwait, pReturn)
    def oldAssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression =
      super.AssignmentExpression(depth, pIn, pYield, pAwait)

    val emptyStmtList = Parser.parse(Parser.StatementList(List(false, false, false)), ";").get.asInstanceOf[StatementList0]
    override def StatementList(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementList = emptyStmtList
    val emptyStmt = Parser.parse(Parser.Statement(List(false, false, false, false)), ";").get.asInstanceOf[Statement2]
    override def Statement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement = emptyStmt

    override def AssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression = choose(assignExprs)
    override def Expression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): Expression = choose(exprs)
  }

  val scripts: List[String] = {
    var set = Set[String]()
    println("Sampling...")
    while (set.size < SIZE) {
      val script = if (randBool) {
        val expr = BasicSampler.oldAssignmentExpression(EXPR_DEPTH, false, false, false).toString
        s"var x = $expr"
      } else BasicSampler.oldStatement(STMT_DEPTH, false, false, false).toString
      if (!set.contains(script) && ValidityChecker(script)) {
        set += script
        if (set.size % (SIZE / 100) == 0) print("#")
        if (set.size % (SIZE / 10) == 0) println
      }
    }
    println("Finished Sampling")
    set.toList
  }
  def getSample: List[Script] = scripts.map(str => {
    Parser.parse(Parser.Script(Nil), str).get
  })
}
