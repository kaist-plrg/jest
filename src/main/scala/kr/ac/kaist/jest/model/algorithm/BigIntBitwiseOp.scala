package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntBitwiseOp extends Algorithm {
  val name: String = "BigIntBitwiseOp"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntBitwiseOp" (op, x, y) => {
    assert (|| (|| (= op "&") (= op "|")) (= op "^"))
    let result = 0n
    let shift = 0i
    if (= op "&") return (& x y)
    else if (= op "|") return (| x y)
    else return (^ x y)
  }"""), this)
}
