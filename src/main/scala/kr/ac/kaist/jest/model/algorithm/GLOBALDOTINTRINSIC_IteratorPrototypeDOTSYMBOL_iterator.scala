package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_IteratorPrototypeDOTSYMBOL_iterator extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_IteratorPrototypeDOTSYMBOL_iterator"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_IteratorPrototype.SYMBOL_iterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }"""), this)
}
