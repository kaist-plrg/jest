package kr.ac.kaist.jest.mutator

import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.sampler._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.AST

case class RandomMutation(script: Script) extends Mutator with Walker {
  val name = "Random Mutation"
  val weight = IMPORTANT
  def mutateOption: Option[Script] = {
    var parseResult: Parser.ParseResult[Script] = Parser.Failure("", new util.parsing.input.CharSequenceReader(""));
    do {
      parseResult = Parser.parse(Parser.Script(Nil), RandomMutation.walk(script).toString())
    } while (!parseResult.successful)
    Some(parseResult.get)
  }
}
object RandomMutation extends Walker {
  def apply(script: AST): AST = walk(script)

  lazy val exprList1 = NRSampler.origAssignmentExpression.toList
  lazy val exprList2 = ValueSampler.assignExprs
  override def walk(expr: AssignmentExpression): AssignmentExpression = {
    if (rand.nextBoolean) choose(choose(List(exprList1, exprList2)))
    else super.walk(expr)
  }
  lazy val primExprList1 = {
    NRSampler.visited = scala.collection.immutable.Set()
    (
      NRSampler.PrimaryExpression(false, false) ++
      NRSampler.PrimaryExpression(false, true) ++
      NRSampler.PrimaryExpression(true, false) ++
      NRSampler.PrimaryExpression(true, true)
    ).toList
  }
  lazy val primExprList2 = ValueSampler.primExprs
  override def walk(expr: PrimaryExpression): PrimaryExpression = {
    if (rand.nextBoolean) choose(choose(List(primExprList1, primExprList2)))
    else super.walk(expr)
  }
  lazy val statementList = NRSampler.origStatement.toList
  override def walk(stmt: Statement): Statement = {
    if (rand.nextBoolean) choose(statementList)
    else super.walk(stmt)
  }
  lazy val declarationList = NRSampler.origDeclaration.toList
  override def walk(decl: Declaration): Declaration = {
    if (rand.nextBoolean) choose(declarationList)
    else super.walk(decl)
  }
}
