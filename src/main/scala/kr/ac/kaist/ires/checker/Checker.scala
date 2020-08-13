package kr.ac.kaist.ires.checker

import scala.collection.mutable.Map

import spray.json._
/*
import kr.ac.kaist.ires.model.{ Parser, NonRecursiveSampler, Script, Script0 }
import kr.ac.kaist.ires.model.{ Expression, Expression0, AssignmentExpression }
import kr.ac.kaist.ires.model.{ StatementList, Block, Statement, Declaration }
import kr.ac.kaist.ires.model.{ IdentifierReference, BindingIdentifier, LabelIdentifier }
import kr.ac.kaist.ires.sampler.ValueSampler._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires
*/

case class Result(a: Int, b: Int)
object ResultJsonProtocol extends DefaultJsonProtocol {
  implicit val ResultFormat = jsonFormat2(Result)
}

class Checker() {
  val result: Map[String, Result] = ???
}
object Checker {
  def apply(a: Any, b: Any, c: Any): Checker = ???
}

