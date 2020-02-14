package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""ownKeys"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""trapResultArray"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateListFromArrayLike"""))), List(ERef(RefId(Id("""trapResultArray"""))), EList(List(ERef(RefId(Id("""String"""))), ERef(RefId(Id("""Symbol"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""trapResult"""), ERef(RefId(Id("""__x5__""")))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""targetKeys"""), ERef(RefId(Id("""__x7__""")))), ILet(Id("""targetConfigurableKeys"""), EList(List())), ILet(Id("""targetNonconfigurableKeys"""), EList(List())), ILet(Id("""__x8__"""), ERef(RefId(Id("""targetKeys""")))), ILet(Id("""__x9__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x9__"""))), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x8__""")), ERef(RefId(Id("""__x9__""")))))), IApp(Id("""__x10__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""key"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""desc"""), ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Configurable"""))), EBool(false))), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""targetNonconfigurableKeys""")))), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""targetConfigurableKeys"""))))), IAssign(RefId(Id("""__x9__""")), EBOp(OPlus, ERef(RefId(Id("""__x9__"""))), EINum(1L)))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetNonconfigurableKeys""")), EStr("""length"""))), EINum(0L))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), ILet(Id("""__x12__"""), ERef(RefId(Id("""targetNonconfigurableKeys""")))), ILet(Id("""__x13__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x13__"""))), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x12__""")), ERef(RefId(Id("""__x13__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""uncheckedResultKeys"""))), ERef(RefId(Id("""key"""))))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""__x13__""")), EBOp(OPlus, ERef(RefId(Id("""__x13__"""))), EINum(1L)))))), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List())), ILet(Id("""__x16__"""), ERef(RefId(Id("""targetConfigurableKeys""")))), ILet(Id("""__x17__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x17__"""))), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x16__""")), ERef(RefId(Id("""__x17__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""uncheckedResultKeys"""))), ERef(RefId(Id("""key"""))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x18__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""__x17__""")), EBOp(OPlus, ERef(RefId(Id("""__x17__"""))), EINum(1L)))))), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""uncheckedResultKeys""")), EStr("""length""")))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x19__""")))))), ISeq(List())), IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))), IReturn(ERef(RefId(Id("""__x20__""")))))))
  /* Beautified form:
  "ProxyExoticObject.OwnPropertyKeys" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "ownKeys")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["OwnPropertyKeys"] target)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let trapResultArray = __x4__
    app __x5__ = (CreateListFromArrayLike trapResultArray (new [String, Symbol]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let trapResult = __x5__
    !!! "Etc"
    app __x6__ = (IsExtensible target)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let extensibleTarget = __x6__
    app __x7__ = (target["OwnPropertyKeys"] target)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let targetKeys = __x7__
    let targetConfigurableKeys = (new [])
    let targetNonconfigurableKeys = (new [])
    let __x8__ = targetKeys
    let __x9__ = 0i
    while (< __x9__ __x8__["length"]) {
      let key = __x8__[__x9__]
      app __x10__ = (target["GetOwnProperty"] target key)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let desc = __x10__
      if (&& (! (= desc undefined)) (= desc["Configurable"] false)) append key -> targetNonconfigurableKeys else append key -> targetConfigurableKeys
      __x9__ = (+ __x9__ 1i)
    }
    if (&& (= extensibleTarget true) (= targetNonconfigurableKeys["length"] 0i)) {
      app __x11__ = (WrapCompletion trapResult)
      return __x11__
    } else {}
    !!! "Etc"
    let __x12__ = targetNonconfigurableKeys
    let __x13__ = 0i
    while (< __x13__ __x12__["length"]) {
      let key = __x12__[__x13__]
      if (! (contains uncheckedResultKeys key)) {
        app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x14__
      } else {}
      !!! "Etc"
      __x13__ = (+ __x13__ 1i)
    }
    if (= extensibleTarget true) {
      app __x15__ = (WrapCompletion trapResult)
      return __x15__
    } else {}
    let __x16__ = targetConfigurableKeys
    let __x17__ = 0i
    while (< __x17__ __x16__["length"]) {
      let key = __x16__[__x17__]
      if (! (contains uncheckedResultKeys key)) {
        app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x18__
      } else {}
      !!! "Etc"
      __x17__ = (+ __x17__ 1i)
    }
    if (< 0i uncheckedResultKeys["length"]) {
      app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x19__
    } else {}
    app __x20__ = (WrapCompletion trapResult)
    return __x20__
  }
  */
}
