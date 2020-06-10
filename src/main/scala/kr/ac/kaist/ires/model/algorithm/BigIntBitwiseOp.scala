package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntBitwiseOp extends Algorithm {
  val name: String = "BigIntBitwiseOp"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntBitwiseOp" (op, x, y) => {
    assert (|| (|| (= op "&") (= op "|")) (= op "^"))
    let result = 0n
    let shift = 0i
    if (= op "&") return (& x y) else if (= op "|") return (| x y) else return (^ x y)
    if (= op "&") {
      app __x0__ = (BinaryAnd (%% x 2i) (%% y 2i))
      let tmp = __x0__
    } else if (= op "|") {
      app __x1__ = (BinaryOr (%% x 2i) (%% y 2i))
      let tmp = __x1__
    } else {
      assert (= op "^")
      app __x2__ = (BinaryXor (%% x 2i) (%% y 2i))
      let tmp = __x2__
    }
    if (! (== tmp 0i)) !!! "Let id:{result} be id:{result} - 2 sup:{id:{shift} } . NOTE : This extends the sign ." else {}
    app __x3__ = (WrapCompletion result)
    return __x3__
  }"""), this)
}
