package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.{ Parser, NonRecursiveSampler, Script }
import kr.ac.kaist.ires.model.{ Expression, Expression0, AssignmentExpression }
import kr.ac.kaist.ires.model.{ StatementList, Statement, Declaration }
import kr.ac.kaist.ires.model.{ IdentifierReference, BindingIdentifier, LabelIdentifier }
import kr.ac.kaist.ires.sampler.ValueSampler._
import kr.ac.kaist.ires.util.Useful._

object NRSampler extends NonRecursiveSampler with Sampler {
  // original samplers
  def origStatement: Set[Statement] = {
    visited = Set()
    super.Statement(false, false, false)
  }
  def origDeclaration: Set[Declaration] = {
    visited = Set()
    super.Declaration(false, false)
  }
  def origAssignmentExpression: Set[AssignmentExpression] = {
    visited = Set()
    super.AssignmentExpression(false, false, false)
  }

  // hooking statements
  val emptyStmtList = Set(Parser.parse(Parser.StatementList(List(false, false, false)), ";").get)
  override def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Set[StatementList] = emptyStmtList
  val emptyStmt = Set(Parser.parse(Parser.Statement(List(false, false, false)), ";").get)
  override def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Set[Statement] = emptyStmt
  val basicDeclaration = Set(Parser.parse(Parser.Declaration(List(false, false)), "let x;").get)
  override def Declaration(pYield: Boolean, pAwait: Boolean): Set[Declaration] = basicDeclaration

  // hooking expressions
  val emptyString = Set(Parser.parse(Parser.AssignmentExpression(List(false, false, false)), "''").get)
  override def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Set[AssignmentExpression] = emptyString
  val emptyStringExpr = Set(Parser.parse(Parser.Expression(List(false, false, false)), "''").get)
  override def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Set[Expression] = emptyStringExpr

  // hooking identifiers
  override def IdentifierReference(pYield: Boolean, pAwait: Boolean): Set[IdentifierReference] =
    Set(Parser.parse(Parser.IdentifierReference(List(pYield, pAwait)), "a").get)
  override def BindingIdentifier(pYield: Boolean, pAwait: Boolean): Set[BindingIdentifier] =
    Set(Parser.parse(Parser.BindingIdentifier(List(pYield, pAwait)), "a").get)
  override def LabelIdentifier(pYield: Boolean, pAwait: Boolean): Set[LabelIdentifier] =
    Set(Parser.parse(Parser.LabelIdentifier(List(pYield, pAwait)), "a").get)

  // get samples
  def getSample: List[Script] = {
    var scripts = origStatement.toList.map(_.toString)
    //val parser = Parser.Script(Nil)
    //val result = scripts.map(Parser.parse(parser, _).get)
    List()
  }

  def getSample2: List[Statement] = {
    //visited = Set()
    origStatement.toList
  }
  def getSample3: List[Declaration] = {
    origDeclaration.toList
  }
  def getSample4: List[AssignmentExpression] = {
    origAssignmentExpression.toList
  }
}
