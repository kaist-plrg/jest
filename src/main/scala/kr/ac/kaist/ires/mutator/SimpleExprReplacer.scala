package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.util.Useful._

object SimpleExprReplacer extends Mutator with Walker {
  def apply(script: Script): Script = walk(script)

  val exprs = List(
    "0", "-0", "42", "{p:42}", "[42]", "'asdf'", "Infinity", "-Infinity", "NaN",
    "0n", "42n", "true", "false", "null", "undefined", "() => {}"
  )
  def getRandExprStr: String = choose(exprs)
  override def walk(ast: AssignmentExpression): AssignmentExpression = {
    if (rand.nextBoolean)
      Parser.parse(Parser.AssignmentExpression(ast.parserParams), getRandExprStr).get
    else
      super.walk(ast)
  }
}
