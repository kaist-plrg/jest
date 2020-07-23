package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._

object ErrorExprReplacer extends Mutator with Walker {
  def apply(script: Script): Script = walk(script)
  override def walk(expr: PrimaryExpression): PrimaryExpression = {
    if (rand.nextBoolean) Parser.parse(Parser.PrimaryExpression(List(false, false)), "(0())").get
    else super.walk(expr)
  }

  lazy val exprList = NRSampler.origAssignmentExpression.toList ++ ValueSampler.assignExprs
  override def walk(expr: AssignmentExpression): AssignmentExpression = {
    if (rand.nextBoolean && rand.nextBoolean) choose(exprList)
    else super.walk(expr)
  }
  lazy val statementList = NRSampler.origStatement.toList
  override def walk(stmt: Statement): Statement = {
    if (rand.nextBoolean && rand.nextBoolean) choose(statementList)
    else super.walk(stmt)
  }
  lazy val declarationList = NRSampler.origDeclaration.toList
  override def walk(decl: Declaration): Declaration = {
    if (rand.nextBoolean && rand.nextBoolean) choose(declarationList)
    else super.walk(decl)
  }
}
