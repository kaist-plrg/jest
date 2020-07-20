package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.Useful._

object SimpleExprReplacer extends Mutator with Walker {
  def apply(script: Script): Script = walk(script)
  override def walk(expr: AssignmentExpression): AssignmentExpression = {
    if (rand.nextBoolean) choose(ValueSampler.assignExprs)
    else super.walk(expr)
  }
  override def walk(stmt: Statement): Statement = {
    if (rand.nextBoolean) LDSampler.origStatement
    else super.walk(stmt)
  }
  override def walk(decl: Declaration): Declaration = {
    if (rand.nextBoolean) LDSampler.origDeclaration
    else super.walk(decl)
  }
}
