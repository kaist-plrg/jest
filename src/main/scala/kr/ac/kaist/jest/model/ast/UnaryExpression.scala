package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait UnaryExpression extends AST {
  val kind: String = "UnaryExpression"
}
case class UnaryExpression0(x0: UpdateExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x0.parent = Some(this)
  val name: String = "UnaryExpression0"
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
  val fullList: List[(String, Value)] = l("UpdateExpression", x0, Nil).reverse
  val info: ASTInfo = UnaryExpression0
}
object UnaryExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class UnaryExpression1(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("delete", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression1
}
object UnaryExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression1IsFunctionDefinition0.func
  )
}
case class UnaryExpression2(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 4)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("void", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression2
}
object UnaryExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression2IsFunctionDefinition0.func
  )
}
case class UnaryExpression3(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("typeof", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression3
}
object UnaryExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression3Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression3HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression3IsFunctionDefinition0.func
  )
}
case class UnaryExpression4(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression4"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("+", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression4
}
object UnaryExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression4Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression4HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression4IsFunctionDefinition0.func
  )
}
case class UnaryExpression5(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression5"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("-", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression5
}
object UnaryExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression5Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression5HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression5IsFunctionDefinition0.func
  )
}
case class UnaryExpression6(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression6"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("~", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression6
}
object UnaryExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression6Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression6HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression6IsFunctionDefinition0.func
  )
}
case class UnaryExpression7(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x1.parent = Some(this)
  val name: String = "UnaryExpression7"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("!", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression7
}
object UnaryExpression7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> UnaryExpression7Evaluation0.func,
    "HasCallInTailPosition0" -> UnaryExpression7HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression7IsFunctionDefinition0.func
  )
}
case class UnaryExpression8(x0: AwaitExpression, parserParams: List[Boolean]) extends UnaryExpression {
  x0.parent = Some(this)
  val name: String = "UnaryExpression8"
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
  val fullList: List[(String, Value)] = l("AwaitExpression", x0, Nil).reverse
  val info: ASTInfo = UnaryExpression8
}
object UnaryExpression8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> UnaryExpression8HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> UnaryExpression8IsFunctionDefinition0.func
  )
}
