package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._

object SimpleExprReplacer extends Mutator with Walker {
  def apply(script: Script): Script = walk(script)
  lazy val exprList = NRSampler.origAssignmentExpression.toList
  override def walk(expr: AssignmentExpression): AssignmentExpression = {
    if (rand.nextBoolean) choose(exprList)
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
