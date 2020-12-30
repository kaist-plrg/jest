package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.model.{ Parser, LimitedDepthSampler, Script }
import kr.ac.kaist.jest.model.{ Expression, Expression0, AssignmentExpression }
import kr.ac.kaist.jest.model.{ StatementList, Statement, Declaration }
import kr.ac.kaist.jest.sampler.ValueSampler._
import kr.ac.kaist.jest.util.Useful._

object LDSampler extends LimitedDepthSampler with Sampler {
  // maximum depths
  val STMT_DEPTH: Int = 3
  val DECL_DEPTH: Int = 3
  val EXPR_DEPTH: Int = 3

  // number of samples
  val SIZE: Int = 1000

  // original samplers
  def origStatement: Statement = super.Statement(STMT_DEPTH, false, false, false)
  def origDeclaration: Declaration = super.Declaration(DECL_DEPTH, false, false)
  def origAssignmentExpression: AssignmentExpression =
    super.AssignmentExpression(EXPR_DEPTH, false, false, false)

  // hooking statements
  val emptyStmtList = Parser.parse(Parser.StatementList(List(false, false, false)), ";").get
  override def StatementList(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementList = emptyStmtList
  val emptyStmt = Parser.parse(Parser.Statement(List(false, false, false)), ";").get
  override def Statement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement = emptyStmt
  val basicDeclaration = Parser.parse(Parser.Declaration(List(false, false)), "let x;").get
  override def Declaration(depth: Int, pYield: Boolean, pAwait: Boolean): Declaration = basicDeclaration

  // hooking expressions
  val emptyString = Parser.parse(Parser.AssignmentExpression(List(false, false, false)), "''").get
  override def AssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression = emptyString
  val emptyStringExpr = Expression0(emptyString, List(false, false, false))
  override def Expression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): Expression = emptyStringExpr

  // get samples
  def getSample: List[Script] = getSample(false)
  def getSample(debug: Boolean): List[Script] = {
    var scripts = Set[String]()
    while (scripts.size < SIZE) {
      val script = choose(0 until 3) match {
        case 0 => s"var x = ${origAssignmentExpression}"
        case 1 => origStatement.toString
        case 2 => origDeclaration.toString
      }
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
