package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CompletePropertyDescriptor extends Algorithm {
  val name: String = "CompletePropertyDescriptor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CompletePropertyDescriptor" (Desc) => {
    assert (= (typeof Desc) "PropertyDescriptor")
    let like = (new Record("Value" -> undefined, "Writable" -> false, "Get" -> undefined, "Set" -> undefined, "Enumerable" -> false, "Configurable" -> false))
    app __x0__ = (IsGenericDescriptor Desc)
    let __x1__ = (= __x0__ true)
    if __x1__ {} else {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    }
    if __x1__ {
      if (= Desc["Value"] absent) Desc["Value"] = like["Value"] else {}
      if (= Desc["Writable"] absent) Desc["Writable"] = like["Writable"] else {}
    } else {
      if (= Desc["Get"] absent) Desc["Get"] = like["Get"] else {}
      if (= Desc["Set"] absent) Desc["Set"] = like["Set"] else {}
    }
    if (= Desc["Enumerable"] absent) Desc["Enumerable"] = like["Enumerable"] else {}
    if (= Desc["Configurable"] absent) Desc["Configurable"] = like["Configurable"] else {}
    app __x3__ = (WrapCompletion Desc)
    return __x3__
  }"""), this)
}
