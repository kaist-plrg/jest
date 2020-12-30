package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArgumentList extends AST {
  val kind: String = "ArgumentList"
}
case class ArgumentList0(x0: AssignmentExpression, parserParams: List[Boolean]) extends ArgumentList {
  x0.parent = Some(this)
  val name: String = "ArgumentList0"
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
  val fullList: List[(String, Value)] = l("AssignmentExpression", x0, Nil).reverse
  val info: ASTInfo = ArgumentList0
}
object ArgumentList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> ArgumentList0ArgumentListEvaluation0.func
  )
}
case class ArgumentList1(x1: AssignmentExpression, parserParams: List[Boolean]) extends ArgumentList {
  x1.parent = Some(this)
  val name: String = "ArgumentList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("...", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = ArgumentList1
}
object ArgumentList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> ArgumentList1ArgumentListEvaluation0.func
  )
}
case class ArgumentList2(x0: ArgumentList, x2: AssignmentExpression, parserParams: List[Boolean]) extends ArgumentList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ArgumentList2"
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
    s(x0, ",", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, l("ArgumentList", x0, Nil)).reverse
  val info: ASTInfo = ArgumentList2
}
object ArgumentList2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> ArgumentList2ArgumentListEvaluation0.func
  )
}
case class ArgumentList3(x0: ArgumentList, x3: AssignmentExpression, parserParams: List[Boolean]) extends ArgumentList {
  x0.parent = Some(this)
  x3.parent = Some(this)
  val name: String = "ArgumentList3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(end + 3)
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", "...", x3)
  }
  val k: Int = d(x3, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x3, l("ArgumentList", x0, Nil)).reverse
  val info: ASTInfo = ArgumentList3
}
object ArgumentList3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> ArgumentList3ArgumentListEvaluation0.func
  )
}
