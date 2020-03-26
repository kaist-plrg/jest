package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handler"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""ownKeys"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""trap"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""trapResultArray"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateListFromArrayLike"""))), List(ERef(RefId(Id("""trapResultArray"""))), EList(List(ERef(RefId(Id("""String"""))), ERef(RefId(Id("""Symbol"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""trapResult"""), ERef(RefId(Id("""__x6__""")))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""targetKeys"""), ERef(RefId(Id("""__x8__""")))), ILet(Id("""targetConfigurableKeys"""), EList(List())), ILet(Id("""targetNonconfigurableKeys"""), EList(List())), ILet(Id("""__x9__"""), ERef(RefId(Id("""targetKeys""")))), ILet(Id("""__x10__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x10__"""))), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x9__""")), ERef(RefId(Id("""__x10__""")))))), IApp(Id("""__x11__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""key"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""desc"""), ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Configurable"""))), EBool(false))), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""targetNonconfigurableKeys""")))), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""targetConfigurableKeys"""))))), IAssign(RefId(Id("""__x10__""")), EBOp(OPlus, ERef(RefId(Id("""__x10__"""))), EINum(1L)))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetNonconfigurableKeys""")), EStr("""length"""))), EINum(0L))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), ILet(Id("""__x13__"""), ERef(RefId(Id("""targetNonconfigurableKeys""")))), ILet(Id("""__x14__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x14__"""))), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x13__""")), ERef(RefId(Id("""__x14__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""uncheckedResultKeys"""))), ERef(RefId(Id("""key"""))))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""__x14__""")), EBOp(OPlus, ERef(RefId(Id("""__x14__"""))), EINum(1L)))))), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), ILet(Id("""__x17__"""), ERef(RefId(Id("""targetConfigurableKeys""")))), ILet(Id("""__x18__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x18__"""))), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x17__""")), ERef(RefId(Id("""__x18__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""uncheckedResultKeys"""))), ERef(RefId(Id("""key"""))))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x19__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""__x18__""")), EBOp(OPlus, ERef(RefId(Id("""__x18__"""))), EINum(1L)))))), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""uncheckedResultKeys""")), EStr("""length""")))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x20__""")))))), ISeq(List())), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))), IReturn(ERef(RefId(Id("""__x21__""")))))))
  /* Beautified form:
  "ProxyExoticObject.OwnPropertyKeys" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (Type handler)
    assert (= __x1__ Object)
    let target = O["ProxyTarget"]
    app __x2__ = (GetMethod handler "ownKeys")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trap = __x2__
    if (= trap undefined) {
      app __x3__ = (target["OwnPropertyKeys"] target)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (Call trap handler (new [target]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let trapResultArray = __x5__
    app __x6__ = (CreateListFromArrayLike trapResultArray (new [String, Symbol]))
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let trapResult = __x6__
    !!! "Etc"
    app __x7__ = (IsExtensible target)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let extensibleTarget = __x7__
    app __x8__ = (target["OwnPropertyKeys"] target)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let targetKeys = __x8__
    let targetConfigurableKeys = (new [])
    let targetNonconfigurableKeys = (new [])
    let __x9__ = targetKeys
    let __x10__ = 0i
    while (< __x10__ __x9__["length"]) {
      let key = __x9__[__x10__]
      app __x11__ = (target["GetOwnProperty"] target key)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let desc = __x11__
      if (&& (! (= desc undefined)) (= desc["Configurable"] false)) append key -> targetNonconfigurableKeys else append key -> targetConfigurableKeys
      __x10__ = (+ __x10__ 1i)
    }
    if (&& (= extensibleTarget true) (= targetNonconfigurableKeys["length"] 0i)) {
      app __x12__ = (WrapCompletion trapResult)
      return __x12__
    } else {}
    !!! "Etc"
    let __x13__ = targetNonconfigurableKeys
    let __x14__ = 0i
    while (< __x14__ __x13__["length"]) {
      let key = __x13__[__x14__]
      if (! (contains uncheckedResultKeys key)) {
        app __x15__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x15__
      } else {}
      !!! "Etc"
      __x14__ = (+ __x14__ 1i)
    }
    if (= extensibleTarget true) {
      app __x16__ = (WrapCompletion trapResult)
      return __x16__
    } else {}
    let __x17__ = targetConfigurableKeys
    let __x18__ = 0i
    while (< __x18__ __x17__["length"]) {
      let key = __x17__[__x18__]
      if (! (contains uncheckedResultKeys key)) {
        app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x19__
      } else {}
      !!! "Etc"
      __x18__ = (+ __x18__ 1i)
    }
    if (< 0i uncheckedResultKeys["length"]) {
      app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x20__
    } else {}
    app __x21__ = (WrapCompletion trapResult)
    return __x21__
  }
  */
}
