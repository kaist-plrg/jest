package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait UpdateExpression extends AST {
  val kind: String = "UpdateExpression"
}
case class UpdateExpression0(x0: LeftHandSideExpression, parserParams: List[Boolean]) extends UpdateExpression {
  x0.parent = Some(this)
  val name: String = "UpdateExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LeftHandSideExpression", x0, Nil).reverse
  val info: ASTInfo = UpdateExpression0
}
object UpdateExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class UpdateExpression1(x0: LeftHandSideExpression, parserParams: List[Boolean]) extends UpdateExpression {
  x0.parent = Some(this)
  val name: String = "UpdateExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "++")
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LeftHandSideExpression", x0, Nil).reverse
  val info: ASTInfo = UpdateExpression1
}
object UpdateExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UpdateExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> UpdateExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UpdateExpression1IsFunctionDefinition0.func
  )
}
case class UpdateExpression2(x0: LeftHandSideExpression, parserParams: List[Boolean]) extends UpdateExpression {
  x0.parent = Some(this)
  val name: String = "UpdateExpression2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "--")
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LeftHandSideExpression", x0, Nil).reverse
  val info: ASTInfo = UpdateExpression2
}
object UpdateExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UpdateExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> UpdateExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UpdateExpression2IsFunctionDefinition0.func
  )
}
case class UpdateExpression3(x1: UnaryExpression, parserParams: List[Boolean]) extends UpdateExpression {
  x1.parent = Some(this)
  val name: String = "UpdateExpression3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 2)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("++", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UpdateExpression3
}
object UpdateExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UpdateExpression3Evaluation0.func,
    "HasCallInTailPosition0" -> UpdateExpression3HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UpdateExpression3IsFunctionDefinition0.func
  )
}
case class UpdateExpression4(x1: UnaryExpression, parserParams: List[Boolean]) extends UpdateExpression {
  x1.parent = Some(this)
  val name: String = "UpdateExpression4"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 2)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("--", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UpdateExpression4
}
object UpdateExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UpdateExpression4Evaluation0.func,
    "HasCallInTailPosition0" -> UpdateExpression4HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UpdateExpression4IsFunctionDefinition0.func
  )
}
