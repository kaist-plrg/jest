package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMappedArgumentsObject {
  val length: Int = 4
  val func: Func = Func("""CreateMappedArgumentsObject""", List(Id("""func"""), Id("""formals"""), Id("""argumentsList"""), Id("""env""")), None, ISeq(List(ILet(Id("""len"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), ILet(Id("""obj"""), EMap(Ty("""ArgumentsExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""ParameterMap"""), EUndef)))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTGetOwnProperty""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTDefineOwnProperty""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTGet""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTSet""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTDelete""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Prototype""")), ERef(RefId(Id("""INTRINSIC_ObjectPrototype""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Extensible""")), EBool(true)), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)), ILet(Id("""map"""), ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""ParameterMap""")), ERef(RefId(Id("""map""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""BoundNames""")), ILet(Id("""parameterNames"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""numberOfParameters"""), ERef(RefProp(RefId(Id("""parameterNames""")), EStr("""length""")))), ILet(Id("""index"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))), ISeq(List(ILet(Id("""val"""), ERef(RefProp(RefId(Id("""argumentsList""")), ERef(RefId(Id("""index""")))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""val"""))))), IExpr(ERef(RefId(Id("""__x3__""")))), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L)))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""len""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IExpr(ERef(RefId(Id("""__x4__""")))), ILet(Id("""mappedNames"""), EList(List())), ILet(Id("""index"""), EBOp(OSub, ERef(RefId(Id("""numberOfParameters"""))), EINum(1L))), IWhile(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""parameterNames""")), ERef(RefId(Id("""index""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""mappedNames"""))), ERef(RefId(Id("""name"""))))), ISeq(List(IAppend(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""mappedNames""")))), IIf(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""MakeArgGetter"""))), List(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""env"""))))), ILet(Id("""g"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""MakeArgSetter"""))), List(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""env"""))))), ILet(Id("""p"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""__x7__"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Set"""), ERef(RefId(Id("""p""")))), (EStr("""Get"""), ERef(RefId(Id("""g""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IExpr(ERef(RefId(Id("""__x8__""")))))), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""index""")), EBOp(OSub, ERef(RefId(Id("""index"""))), EINum(1L)))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""INTRINSIC_ArrayProto_values""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), EStr("""callee"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""func""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))))
  /* Beautified form:
  "CreateMappedArgumentsObject" (func, formals, argumentsList, env) => {
    let len = argumentsList["length"]
    let obj = (new ArgumentsExoticObject("SubMap" -> (new SubMap()), "ParameterMap" -> undefined))
    if (= obj["HasProperty"] absent) obj["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= obj["DefineOwnProperty"] absent) obj["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= obj["Set"] absent) obj["Set"] = OrdinaryObjectDOTSet else {}
    if (= obj["SetPrototypeOf"] absent) obj["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= obj["Get"] absent) obj["Get"] = OrdinaryObjectDOTGet else {}
    if (= obj["PreventExtensions"] absent) obj["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= obj["Delete"] absent) obj["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= obj["GetOwnProperty"] absent) obj["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= obj["OwnPropertyKeys"] absent) obj["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= obj["GetPrototypeOf"] absent) obj["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= obj["IsExtensible"] absent) obj["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    obj["GetOwnProperty"] = ArgumentsExoticObjectDOTGetOwnProperty
    obj["DefineOwnProperty"] = ArgumentsExoticObjectDOTDefineOwnProperty
    obj["Get"] = ArgumentsExoticObjectDOTGet
    obj["Set"] = ArgumentsExoticObjectDOTSet
    obj["Delete"] = ArgumentsExoticObjectDOTDelete
    obj["Prototype"] = INTRINSIC_ObjectPrototype
    obj["Extensible"] = true
    app __x0__ = (ObjectCreate null)
    let map = __x0__
    obj["ParameterMap"] = map
    access __x1__ = (formals "BoundNames")
    let parameterNames = __x1__
    let numberOfParameters = parameterNames["length"]
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x2__ = (ToString index)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (CreateDataProperty obj __x2__ val)
      __x3__
      index = (+ index 1i)
    }
    app __x4__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    __x4__
    let mappedNames = (new [])
    let index = (- numberOfParameters 1i)
    while (! (< index 0i)) {
      let name = parameterNames[index]
      if (! (contains mappedNames name)) {
        append name -> mappedNames
        if (< index len) {
          app __x5__ = (MakeArgGetter name env)
          let g = __x5__
          app __x6__ = (MakeArgSetter name env)
          let p = __x6__
          app __x7__ = (ToString index)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          app __x8__ = (map["DefineOwnProperty"] map __x7__ (new PropertyDescriptor("Set" -> p, "Get" -> g, "Enumerable" -> false, "Configurable" -> true)))
          __x8__
        } else {}
      } else {}
      index = (- index 1i)
    }
    app __x9__ = (DefinePropertyOrThrow obj SYMBOL_iterator (new PropertyDescriptor("Value" -> INTRINSIC_ArrayProto_values, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Value" -> func, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion obj)
    return __x11__
  }
  */
}
