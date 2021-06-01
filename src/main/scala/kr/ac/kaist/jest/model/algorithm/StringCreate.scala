package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StringCreate extends Algorithm {
  val name: String = "StringCreate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StringCreate" (value, prototype) => {
    app __x0__ = (Type value)
    assert (= __x0__ String)
    app __x1__ = (MakeBasicObject (new ["Prototype", "Extensible", "StringData"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    S["Prototype"] = prototype
    S["StringData"] = value
    S["GetOwnProperty"] = StringExoticObjectDOTGetOwnProperty
    S["DefineOwnProperty"] = StringExoticObjectDOTDefineOwnProperty
    S["OwnPropertyKeys"] = StringExoticObjectDOTOwnPropertyKeys
    let length = value["length"]
    app __x2__ = (DefinePropertyOrThrow S "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion S)
    return __x3__
  }"""), this)
}
