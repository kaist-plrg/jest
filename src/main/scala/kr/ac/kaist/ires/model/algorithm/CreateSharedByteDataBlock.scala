package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSharedByteDataBlock extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateSharedByteDataBlock" (size) => {
    assert (! (< size 0i))
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    let zero = (new [0i])
    let __x0__ = db
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let i = __x0__[__x1__]
      append (new WriteSharedMemory("Order" -> "Init", "NoTear" -> true, "Block" -> db, "ByteIndex" -> i, "ElementSize" -> 1i, "Payload" -> zero)) -> eventList
      __x1__ = (+ __x1__ 1i)
    }
    app __x2__ = (WrapCompletion db)
    return __x2__
  }"""))
}
