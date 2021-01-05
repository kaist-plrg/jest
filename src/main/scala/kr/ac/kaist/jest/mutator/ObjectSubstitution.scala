package kr.ac.kaist.jest.mutator

import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.AST
import kr.ac.kaist.jest.ir.Interp
import scala.collection.immutable.{ Set => ScalaSet }
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.sampler.ValidityChecker

case class ObjectSubstitution(script: Script) extends Mutator {
  val name = "Object Substitution"

  // get touched algorithm and filtering
  val interp = new Interp(timeLimit = Some(1))
  val initSt = ModelHelper.initState(script)
  interp(initSt)
  // TODO : filter out fully covered algorithm
  val targetProps: ScalaSet[ScalaSet[String]] =
    interp.visited.touchedAlgos.flatMap(name =>
      Algorithm.infos.get(name) match {
        case Some(info) if info.props.size != 0 => Some(info.props)
        case _ => None
      })
  val weight = if (targetProps.size > 0) IMPORTANT else 0

  // default value of property
  val defaultValues: List[String] = List(
    "true",
    "false",
    "''",
    "'0'",
    "function () { }",
    "function (x) { }",
    "function * () { }",
    "function * (x) { }",
    "async function () { }",
    "async function (x) { }",
    "async * function() { }",
    "async * function(x) { }",
    "0",
    "null",
    "() => { throw ''; }"
  )

  def mutateOption: Option[Script] = {
    var result: Option[Script] = None
    val parser = Parser.PrimaryExpression(List(true, true))
    // replace until success
    do {
      // select targetProp randomly
      val targetProp = choose(targetProps.toList)
      // generate object literal
      val obj = s"{ ${
        targetProp
          .map(propName => s"[$propName] : ${choose(defaultValues)}")
          .mkString(", ")
      } }"
      val parseResult = Parser.parse(parser, obj)
      if (parseResult.successful) {
        // insert object literal to PrimaryExpression
        val mutated = ObjectSubstitution(script, parseResult.get)
        // check if mutant is valid
        if (mutated != None && ValidityChecker(mutated.get.toString))
          result = mutated
      } else println(s"PARSE FAILED : ${obj}")
    } while (result == None)
    result
  }

}
object ObjectSubstitution extends Walker {
  var targetObj: Option[PrimaryExpression] = None
  def apply(script: Script, obj: PrimaryExpression): Option[Script] = {
    targetObj = Some(obj)
    Some(walk(script))
  }
  override def walk(expr: PrimaryExpression): PrimaryExpression =
    targetObj match {
      case Some(objExpr) if rand.nextBoolean => objExpr
      case _ => super.walk(expr)
    }
}
