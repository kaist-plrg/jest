package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncIteratorPrototypeDOTSYMBOL_asyncIterator extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_AsyncIteratorPrototypeDOTSYMBOL_asyncIterator"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_AsyncIteratorPrototype.SYMBOL_asyncIterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }"""), this)
}
