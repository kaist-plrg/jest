package kr.ac.kaist.jest.mutator

import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.sampler._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.AST

case class StatementAppender(script: Script) extends Mutator {
  val name = "StatementAppender"
  val weight = NORMAL
  def mutateOption: Option[Script] = Some(StatementAppender.walk(script))
}

object StatementAppender extends Walker {
  def apply(script: AST): AST = walk(script)

  val parser = Parser.StatementListItem(List(true, true, true))
  val emptyStmt = Parser.parse(parser, ";").get

  lazy val stmts = NRSampler.getRawSample.toList.map(Parser.parse(parser, _).getOrElse(emptyStmt))
  lazy val manualStmts = List(
    "x ( ) ;",
    "x ( 42 ) ;",
    "return ;",
    "return 42 ;",
    "throw 42 ;",
    "yield 42 ;",
    "await x ( ) ;",
    "yield * x ( ) ;",
    "new x ( ) ;",
    "break ;",
    "continue ;"
  ).map(Parser.parse(parser, _).get)

  override def walk(stmtList: StatementList): StatementList = {
    if (rand.nextBoolean) StatementList1(stmtList, choose(choose(List(stmts, manualStmts))), List(false, false))
    else super.walk(stmtList)
  }

  val emptyStmtList = Parser.parse(Parser.StatementList(List(false, false, false)), ";").get
  override def walk(block: Block): Block = (rand.nextBoolean, block) match {
    case (true, Block0(None, ps)) => super.walk(Block0(Some(emptyStmtList), ps))
    case _ => super.walk(block)
  }
  override def walk(caseClause: CaseClause): CaseClause = (rand.nextBoolean, caseClause) match {
    case (true, CaseClause0(e, None, ps)) => super.walk(CaseClause0(e, Some(emptyStmtList), ps))
    case _ => super.walk(caseClause)
  }
  override def walk(defaultClause: DefaultClause): DefaultClause = (rand.nextBoolean, defaultClause) match {
    case (true, DefaultClause0(None, ps)) => super.walk(DefaultClause0(Some(emptyStmtList), ps))
    case _ => super.walk(defaultClause)
  }
  override def walk(functionStatementList: FunctionStatementList): FunctionStatementList = (rand.nextBoolean, functionStatementList) match {
    case (true, FunctionStatementList0(None, ps)) => super.walk(FunctionStatementList0(Some(emptyStmtList), ps))
    case _ => super.walk(functionStatementList)
  }

}
