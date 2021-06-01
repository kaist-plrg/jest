package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTMap extends Algorithm {
  val name: String = "GLOBALDOTMap"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Map" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%Map.prototype%" (new ["MapData"]))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let map = __x2__
    map["MapData"] = (new [])
    if (|| (= iterable undefined) (= iterable null)) {
      app __x3__ = (WrapCompletion map)
      return __x3__
    } else {}
    app __x4__ = (Get map "set")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let adder = __x4__
    app __x5__ = (AddEntriesFromIterable map iterable adder)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
