package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Statement extends AST {
  val kind: String = "Statement"
}
case class Statement0(x0: BlockStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement0"
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
  val fullList: List[(String, Value)] = l("BlockStatement", x0, Nil).reverse
  val info: ASTInfo = Statement0
}
object Statement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement1(x0: VariableStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement1"
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
  val fullList: List[(String, Value)] = l("VariableStatement", x0, Nil).reverse
  val info: ASTInfo = Statement1
}
object Statement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement1HasCallInTailPosition0.func
  )
}
case class Statement2(x0: EmptyStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement2"
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
  val fullList: List[(String, Value)] = l("EmptyStatement", x0, Nil).reverse
  val info: ASTInfo = Statement2
}
object Statement2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement2HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Statement2VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement2VarScopedDeclarations0.func
  )
}
case class Statement3(x0: ExpressionStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement3"
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
  val fullList: List[(String, Value)] = l("ExpressionStatement", x0, Nil).reverse
  val info: ASTInfo = Statement3
}
object Statement3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement3HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Statement3VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement3VarScopedDeclarations0.func
  )
}
case class Statement4(x0: IfStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement4"
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
  val fullList: List[(String, Value)] = l("IfStatement", x0, Nil).reverse
  val info: ASTInfo = Statement4
}
object Statement4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement5(x0: BreakableStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement5"
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
  val fullList: List[(String, Value)] = l("BreakableStatement", x0, Nil).reverse
  val info: ASTInfo = Statement5
}
object Statement5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement6(x0: ContinueStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement6"
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
  val fullList: List[(String, Value)] = l("ContinueStatement", x0, Nil).reverse
  val info: ASTInfo = Statement6
}
object Statement6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement6HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Statement6VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement6VarScopedDeclarations0.func
  )
}
case class Statement7(x0: BreakStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement7"
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
  val fullList: List[(String, Value)] = l("BreakStatement", x0, Nil).reverse
  val info: ASTInfo = Statement7
}
object Statement7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement7HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Statement7VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement7VarScopedDeclarations0.func
  )
}
case class Statement8(x0: ReturnStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement8"
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
  val fullList: List[(String, Value)] = l("ReturnStatement", x0, Nil).reverse
  val info: ASTInfo = Statement8
}
object Statement8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames0" -> Statement8VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement8VarScopedDeclarations0.func
  )
}
case class Statement9(x0: WithStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement9"
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
  val fullList: List[(String, Value)] = l("WithStatement", x0, Nil).reverse
  val info: ASTInfo = Statement9
}
object Statement9 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement10(x0: LabelledStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement10"
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
  val fullList: List[(String, Value)] = l("LabelledStatement", x0, Nil).reverse
  val info: ASTInfo = Statement10
}
object Statement10 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement11(x0: ThrowStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement11"
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
  val fullList: List[(String, Value)] = l("ThrowStatement", x0, Nil).reverse
  val info: ASTInfo = Statement11
}
object Statement11 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement11HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Statement11VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement11VarScopedDeclarations0.func
  )
}
case class Statement12(x0: TryStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement12"
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
  val fullList: List[(String, Value)] = l("TryStatement", x0, Nil).reverse
  val info: ASTInfo = Statement12
}
object Statement12 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement13(x0: DebuggerStatement, parserParams: List[Boolean]) extends Statement {
  x0.parent = Some(this)
  val name: String = "Statement13"
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
  val fullList: List[(String, Value)] = l("DebuggerStatement", x0, Nil).reverse
  val info: ASTInfo = Statement13
}
object Statement13 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Statement13HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Statement13VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement13VarScopedDeclarations0.func
  )
}
