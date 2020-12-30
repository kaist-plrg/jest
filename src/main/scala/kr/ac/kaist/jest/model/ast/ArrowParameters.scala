package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArrowParameters extends AST {
  val kind: String = "ArrowParameters"
}
case class ArrowParameters0(x0: BindingIdentifier, parserParams: List[Boolean]) extends ArrowParameters {
  x0.parent = Some(this)
  val name: String = "ArrowParameters0"
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
  val fullList: List[(String, Value)] = l("BindingIdentifier", x0, Nil).reverse
  val info: ASTInfo = ArrowParameters0
}
object ArrowParameters0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsExpression0" -> ArrowParameters0ContainsExpression0.func,
    "CoveredFormalsList0" -> ArrowParameters0CoveredFormalsList0.func,
    "ExpectedArgumentCount0" -> ArrowParameters0ExpectedArgumentCount0.func,
    "IsSimpleParameterList0" -> ArrowParameters0IsSimpleParameterList0.func,
    "IteratorBindingInitialization0" -> ArrowParameters0IteratorBindingInitialization0.func
  )
}
case class ArrowParameters1(x0: CoverParenthesizedExpressionAndArrowParameterList, parserParams: List[Boolean]) extends ArrowParameters {
  x0.parent = Some(this)
  val name: String = "ArrowParameters1"
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
  val fullList: List[(String, Value)] = l("CoverParenthesizedExpressionAndArrowParameterList", x0, Nil).reverse
  val info: ASTInfo = ArrowParameters1
}
object ArrowParameters1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> ArrowParameters1BoundNames0.func,
    "Contains0" -> ArrowParameters1Contains0.func,
    "ContainsExpression0" -> ArrowParameters1ContainsExpression0.func,
    "ExpectedArgumentCount0" -> ArrowParameters1ExpectedArgumentCount0.func,
    "IsSimpleParameterList0" -> ArrowParameters1IsSimpleParameterList0.func,
    "IteratorBindingInitialization0" -> ArrowParameters1IteratorBindingInitialization0.func
  )
}
