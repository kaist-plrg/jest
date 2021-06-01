package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateMappedArgumentsObject extends Algorithm {
  val name: String = "CreateMappedArgumentsObject"
  val length: Int = 4
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateMappedArgumentsObject" (func, formals, argumentsList, env) => {
    let len = argumentsList["length"]
    app __x0__ = (MakeBasicObject (new ["Prototype", "Extensible", "ParameterMap"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let obj = __x0__
    obj["GetOwnProperty"] = ArgumentsExoticObjectDOTGetOwnProperty
    obj["DefineOwnProperty"] = ArgumentsExoticObjectDOTDefineOwnProperty
    obj["Get"] = ArgumentsExoticObjectDOTGet
    obj["Set"] = ArgumentsExoticObjectDOTSet
    obj["Delete"] = ArgumentsExoticObjectDOTDelete
    obj.Prototype = INTRINSIC_ObjectPrototype
    app __x1__ = (OrdinaryObjectCreate null)
    let map = __x1__
    obj["ParameterMap"] = map
    access __x2__ = (formals "BoundNames")
    let parameterNames = __x2__
    let numberOfParameters = parameterNames["length"]
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x3__ = (ToString index)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (CreateDataPropertyOrThrow obj __x3__ val)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      index = (+ index 1i)
    }
    app __x5__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    let mappedNames = (new [])
    let index = (- numberOfParameters 1i)
    while (! (< index 0i)) {
      let name = parameterNames[index]
      if (! (contains mappedNames name)) {
        append name -> mappedNames
        if (< index len) {
          app __x6__ = (MakeArgGetter name env)
          let g = __x6__
          app __x7__ = (MakeArgSetter name env)
          let p = __x7__
          app __x8__ = (ToString index)
          if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          app __x9__ = (map["DefineOwnProperty"] map __x8__ (new PropertyDescriptor("Set" -> p, "Get" -> g, "Enumerable" -> false, "Configurable" -> true)))
          __x9__
        } else {}
      } else {}
      index = (- index 1i)
    }
    app result = (DefinePropertyOrThrow obj SYMBOL_iterator (new PropertyDescriptor ("Value" -> INTRINSIC_ArrayProto_values, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    ! result
    app __x10__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Value" -> func, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion obj)
    return __x11__
  }"""), this)
}
