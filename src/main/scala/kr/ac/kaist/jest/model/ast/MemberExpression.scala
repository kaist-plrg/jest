package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MemberExpression extends AST {
  val kind: String = "MemberExpression"
}
case class MemberExpression0(x0: PrimaryExpression, parserParams: List[Boolean]) extends MemberExpression {
  x0.parent = Some(this)
  val name: String = "MemberExpression0"
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
  val fullList: List[(String, Value)] = l("PrimaryExpression", x0, Nil).reverse
  val info: ASTInfo = MemberExpression0
}
object MemberExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> MemberExpression0IsDestructuring0.func
  )
}
case class MemberExpression1(x0: MemberExpression, x2: Expression, parserParams: List[Boolean]) extends MemberExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "MemberExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "[", x2, "]")
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Expression", x2, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = MemberExpression1
}
object MemberExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> MemberExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> MemberExpression1HasCallInTailPosition0.func,
    "IsDestructuring0" -> MemberExpression1IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression1IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> MemberExpression1IsIdentifierRef0.func
  )
}
case class MemberExpression2(x0: MemberExpression, x2: Lexical, parserParams: List[Boolean]) extends MemberExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "MemberExpression2"
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
    s(x0, ".", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical", x2, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = MemberExpression2
}
object MemberExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> MemberExpression2Contains0.func,
    "Evaluation0" -> MemberExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> MemberExpression2HasCallInTailPosition0.func,
    "IsDestructuring0" -> MemberExpression2IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression2IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> MemberExpression2IsIdentifierRef0.func
  )
}
case class MemberExpression3(x0: MemberExpression, x1: TemplateLiteral, parserParams: List[Boolean]) extends MemberExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "MemberExpression3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("TemplateLiteral", x1, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = MemberExpression3
}
object MemberExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> MemberExpression3Evaluation0.func,
    "HasCallInTailPosition0" -> MemberExpression3HasCallInTailPosition0.func,
    "IsDestructuring0" -> MemberExpression3IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression3IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> MemberExpression3IsIdentifierRef0.func
  )
}
case class MemberExpression4(x0: SuperProperty, parserParams: List[Boolean]) extends MemberExpression {
  x0.parent = Some(this)
  val name: String = "MemberExpression4"
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
  val fullList: List[(String, Value)] = l("SuperProperty", x0, Nil).reverse
  val info: ASTInfo = MemberExpression4
}
object MemberExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> MemberExpression4HasCallInTailPosition0.func,
    "IsDestructuring0" -> MemberExpression4IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression4IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> MemberExpression4IsIdentifierRef0.func
  )
}
case class MemberExpression5(x0: MetaProperty, parserParams: List[Boolean]) extends MemberExpression {
  x0.parent = Some(this)
  val name: String = "MemberExpression5"
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
  val fullList: List[(String, Value)] = l("MetaProperty", x0, Nil).reverse
  val info: ASTInfo = MemberExpression5
}
object MemberExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> MemberExpression5HasCallInTailPosition0.func,
    "IsDestructuring0" -> MemberExpression5IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression5IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> MemberExpression5IsIdentifierRef0.func
  )
}
case class MemberExpression6(x1: MemberExpression, x2: Arguments, parserParams: List[Boolean]) extends MemberExpression {
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "MemberExpression6"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("new", x1, x2)
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Arguments", x2, l("MemberExpression", x1, Nil)).reverse
  val info: ASTInfo = MemberExpression6
}
object MemberExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> MemberExpression6Evaluation0.func,
    "HasCallInTailPosition0" -> MemberExpression6HasCallInTailPosition0.func,
    "IsDestructuring0" -> MemberExpression6IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression6IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> MemberExpression6IsIdentifierRef0.func
  )
}
