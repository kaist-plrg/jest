package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateArrayIterator extends Algorithm {
  val name: String = "CreateArrayIterator"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""CreateArrayIterator" (array, kind) => {
    app __x0__ = (Type array)
    assert (= __x0__ Object)
    assert (|| (|| (= kind CONST_keyPLUSvalue) (= kind CONST_key)) (= kind CONST_value))
    app __x1__ = (OrdinaryObjectCreate INTRINSIC_ArrayIteratorPrototype (new ["IteratedArrayLike", "ArrayLikeNextIndex", "ArrayLikeIterationKind"]))
    let iterator = __x1__
    iterator["IteratedArrayLike"] = array
    iterator["ArrayLikeNextIndex"] = 0i
    iterator["ArrayLikeIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }"""), this)
}
