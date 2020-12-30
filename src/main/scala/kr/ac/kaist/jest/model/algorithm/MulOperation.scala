package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MulOperation extends Algorithm {
  val name: String = "MulOperation"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MulOperation" (op, lnum, rnum) => {
    if (= op "*") {
      return ( * lnum rnum )
    } else if (= op "/") {
      return ( / lnum rnum )
    } else if (= op "%") {
      return ( % lnum rnum )
    } else {
      return undefined
    }
  }"""), this)
}
