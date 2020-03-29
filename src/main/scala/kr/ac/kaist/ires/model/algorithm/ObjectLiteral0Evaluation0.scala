package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectLiteral0Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ObjectLiteral0Evaluation0" (this) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
