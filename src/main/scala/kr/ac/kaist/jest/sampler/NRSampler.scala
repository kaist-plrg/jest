package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.model.{ Parser, NonRecursiveSampler, Script, Script0 }
import kr.ac.kaist.jest.model.{ Expression, Expression0, AssignmentExpression }
import kr.ac.kaist.jest.model.{ StatementList, Block, Statement, Declaration }
import kr.ac.kaist.jest.model.{ IdentifierReference, BindingIdentifier, LabelIdentifier }
import kr.ac.kaist.jest.sampler.ValueSampler._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.AST
import kr.ac.kaist.jest

object NRSampler extends NonRecursiveSampler with Sampler {
  // original samplers
  def origStatement: Set[Statement] = {
    visited = Set()
    super.Statement(false, false, false) ++
      super.Statement(false, false, true) ++
      super.Statement(false, true, true) ++
      super.Statement(true, false, true) ++
      super.Statement(true, true, true)
  }
  def origDeclaration: Set[Declaration] = {
    visited = Set()
    super.Declaration(false, false) ++
      super.Declaration(false, true) ++
      super.Declaration(true, false) ++
      super.Declaration(true, true)
  }
  def origAssignmentExpression: Set[AssignmentExpression] = {
    visited = Set()
    super.AssignmentExpression(false, false, false) ++
      super.AssignmentExpression(false, false, true) ++
      super.AssignmentExpression(false, true, false) ++
      super.AssignmentExpression(false, true, true) ++
      super.AssignmentExpression(true, false, false) ++
      super.AssignmentExpression(true, false, true) ++
      super.AssignmentExpression(true, true, false) ++
      super.AssignmentExpression(true, true, true)
  }

  // hooking statements
  val emptyStmtList = Set(
    Parser.parse(Parser.StatementList(List(false, false, false)), ";").get,
  )
  override def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Set[StatementList] = emptyStmtList
  val emptyStmt = Set(Parser.parse(Parser.Statement(List(false, false, false)), ";").get)
  override def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Set[Statement] = emptyStmt
  val basicDeclaration = Set(Parser.parse(Parser.Declaration(List(false, false)), "let x;").get)
  override def Declaration(pYield: Boolean, pAwait: Boolean): Set[Declaration] = basicDeclaration

  // hooking expressions
  val emptyString = Set(Parser.parse(Parser.AssignmentExpression(List(false, false, false)), "''").get)
  override def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Set[AssignmentExpression] = emptyString
  val emptyStringExpr = Set(
    Parser.parse(Parser.Expression(List(false, false, false)), "''").get,
    Parser.parse(Parser.Expression(List(false, false, false)), "'', ''").get
  )
  override def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Set[Expression] = emptyStringExpr

  // get samples
  def getSample: List[Script] = {
    val parser = Parser.Script(Nil)
    getRawSample
      .toList
      .map(rawSample =>
        if (ValidityChecker(rawSample)) rawSample
        else s"async function * x () { ${rawSample} }; x ( )")
      .filter(ValidityChecker(_))
      .map(Parser.parse(parser, _).getOrElse(Script0(None, Nil)))
  }

  def getRawSample: Set[String] = (
    origStatement.map(_.toString) ++
    origDeclaration.map(_.toString) ++
    origAssignmentExpression.map(e => s"var x = $e")
  )

  def getEvalSample: List[Script] = {
    val parser = Parser.Script(Nil)
    getRawSample.toList.map(s => "eval(\"" + s + "\")").map(Parser.parse(parser, _).get)
  }

  def getIndirectEvalSample: List[Script] = {
    val parser = Parser.Script(Nil)
    getRawSample.toList.map(s => "(0,eval)(\"" + s + "\")").map(Parser.parse(parser, _).get)
  }
}

