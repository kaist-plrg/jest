package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.sampler.ValueSampler
import kr.ac.kaist.ires.util.Useful._

object SimpleExprReplacer extends Mutator with Walker {
  def apply(script: Script): Script = walk(script)
  override def walk(ast: AssignmentExpression): AssignmentExpression = {
    if (rand.nextBoolean) choose(ValueSampler.assignExprs)
    else super.walk(ast)
  }
}
