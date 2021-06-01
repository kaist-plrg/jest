package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayCreate extends Algorithm {
  val name: String = "ArrayCreate"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayCreate" (length, proto) => {
    app __x0__ = (IsNonNegativeInteger length)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    assert (= __x0__ true)
    if (= length -0.0) length = 0i else {}
    if (< (- 4294967296i 1i) length) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= proto absent) proto = INTRINSIC_ArrayPrototype else {}
    app __x2__ = (MakeBasicObject (new ["Prototype", "Extensible"]))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let A = __x2__
    set-type A ArrayExoticObject
    A["Prototype"] = proto
    A["DefineOwnProperty"] = ArrayExoticObjectDOTDefineOwnProperty
    app __x3__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Value" -> length, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion A)
    return __x4__
  }"""), this)
}
