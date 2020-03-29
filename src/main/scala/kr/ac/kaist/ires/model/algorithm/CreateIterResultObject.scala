package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIterResultObject {
  val length: Int = 2
  val func: Func = parseFunc(""""CreateIterResultObject" (value, done) => {
    app __x0__ = (Type done)
    assert (= __x0__ Boolean)
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x1__
    app __x2__ = (CreateDataProperty obj "value" value)
    __x2__
    app __x3__ = (CreateDataProperty obj "done" done)
    __x3__
    app __x4__ = (WrapCompletion obj)
    return __x4__
  }""")
}
