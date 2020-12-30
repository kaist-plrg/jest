package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait RelationalExpression extends AST {
  val kind: String = "RelationalExpression"
}
case class RelationalExpression0(x0: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  val name: String = "RelationalExpression0"
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
  val fullList: List[(String, Value)] = l("ShiftExpression", x0, Nil).reverse
  val info: ASTInfo = RelationalExpression0
}
object RelationalExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class RelationalExpression1(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "RelationalExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "<", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression1
}
object RelationalExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> RelationalExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> RelationalExpression1IsFunctionDefinition0.func
  )
}
case class RelationalExpression2(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "RelationalExpression2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ">", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression2
}
object RelationalExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> RelationalExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> RelationalExpression2IsFunctionDefinition0.func
  )
}
case class RelationalExpression3(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "RelationalExpression3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "<=", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression3
}
object RelationalExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression3Evaluation0.func,
    "HasCallInTailPosition0" -> RelationalExpression3HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> RelationalExpression3IsFunctionDefinition0.func
  )
}
case class RelationalExpression4(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "RelationalExpression4"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ">=", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression4
}
object RelationalExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression4Evaluation0.func,
    "HasCallInTailPosition0" -> RelationalExpression4HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> RelationalExpression4IsFunctionDefinition0.func
  )
}
case class RelationalExpression5(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "RelationalExpression5"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 10)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "instanceof", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression5
}
object RelationalExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression5Evaluation0.func,
    "HasCallInTailPosition0" -> RelationalExpression5HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> RelationalExpression5IsFunctionDefinition0.func
  )
}
case class RelationalExpression6(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "RelationalExpression6"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "in", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression6
}
object RelationalExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression6Evaluation0.func,
    "HasCallInTailPosition0" -> RelationalExpression6HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> RelationalExpression6IsFunctionDefinition0.func
  )
}
