package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BoundFunctionCreate extends Algorithm {
  val name: String = "BoundFunctionCreate"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BoundFunctionCreate" (targetFunction, boundThis, boundArgs) => {
    app __x0__ = (Type targetFunction)
    assert (= __x0__ Object)
    app __x1__ = (targetFunction["GetPrototypeOf"] targetFunction)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let proto = __x1__
    let internalSlotsList = (new ["BoundTargetFunction", "BoundThis", "BoundArguments", "Prototype", "Extensible"])
    app __x2__ = (MakeBasicObject internalSlotsList)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let obj = __x2__
    set-type obj BoundFunctionExoticObject
    obj["Prototype"] = proto
    obj["Call"] = BoundFunctionExoticObjectDOTCall
    app __x3__ = (IsConstructor targetFunction)
    if (= __x3__ true) obj["Construct"] = BoundFunctionExoticObjectDOTConstruct else {}
    obj["BoundTargetFunction"] = targetFunction
    obj["BoundThis"] = boundThis
    obj["BoundArguments"] = boundArgs
    app __x4__ = (WrapCompletion obj)
    return __x4__
  }"""), this)
}
