package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToPropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""ToPropertyDescriptor""", List(Id("""Obj""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""Obj"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""enumerable"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""hasEnumerable"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasEnumerable"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""enumerable"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x3__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""enumerable"""), ERef(RefId(Id("""__x4__""")))), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Enumerable""")), ERef(RefId(Id("""enumerable""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""configurable"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""hasConfigurable"""), ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasConfigurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""configurable"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x6__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""configurable"""), ERef(RefId(Id("""__x7__""")))), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Configurable""")), ERef(RefId(Id("""configurable""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""value"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""hasValue"""), ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasValue"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""value"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x9__""")))), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Value""")), ERef(RefId(Id("""value""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""writable"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""hasWritable"""), ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasWritable"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""writable"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x11__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""writable"""), ERef(RefId(Id("""__x12__""")))), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Writable""")), ERef(RefId(Id("""writable""")))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""get"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), ILet(Id("""hasGet"""), ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasGet"""))), EBool(true)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""get"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), ILet(Id("""getter"""), ERef(RefId(Id("""__x14__""")))), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""getter"""))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x15__"""))), EBool(false)), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""getter"""))), EUndef))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Get""")), ERef(RefId(Id("""getter""")))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""set"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), ILet(Id("""hasSet"""), ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasSet"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""set"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), ILet(Id("""setter"""), ERef(RefId(Id("""__x18__""")))), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""setter"""))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x19__"""))), EBool(false)), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""setter"""))), EUndef))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x20__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Set""")), ERef(RefId(Id("""setter""")))))), ISeq(List())), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Get"""))), EAbsent)), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Set"""))), EAbsent))), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Value"""))), EAbsent)), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Writable"""))), EAbsent))), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x21__""")))))), ISeq(List())), ISeq(List())), IApp(Id("""__x22__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))), IReturn(ERef(RefId(Id("""__x22__""")))))))
  /* Beautified form:
  "ToPropertyDescriptor" (Obj) => {
    app __x0__ = (Type Obj)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    let desc = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    app __x2__ = (HasProperty Obj "enumerable")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let hasEnumerable = __x2__
    if (= hasEnumerable true) {
      app __x3__ = (Get Obj "enumerable")
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (ToBoolean __x3__)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let enumerable = __x4__
      desc["Enumerable"] = enumerable
    } else {}
    app __x5__ = (HasProperty Obj "configurable")
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let hasConfigurable = __x5__
    if (= hasConfigurable true) {
      app __x6__ = (Get Obj "configurable")
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (ToBoolean __x6__)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let configurable = __x7__
      desc["Configurable"] = configurable
    } else {}
    app __x8__ = (HasProperty Obj "value")
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let hasValue = __x8__
    if (= hasValue true) {
      app __x9__ = (Get Obj "value")
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let value = __x9__
      desc["Value"] = value
    } else {}
    app __x10__ = (HasProperty Obj "writable")
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let hasWritable = __x10__
    if (= hasWritable true) {
      app __x11__ = (Get Obj "writable")
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (ToBoolean __x11__)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let writable = __x12__
      desc["Writable"] = writable
    } else {}
    app __x13__ = (HasProperty Obj "get")
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let hasGet = __x13__
    if (= hasGet true) {
      app __x14__ = (Get Obj "get")
      if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let getter = __x14__
      app __x15__ = (IsCallable getter)
      if (&& (= __x15__ false) (! (= getter undefined))) {
        app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x16__
      } else {}
      desc["Get"] = getter
    } else {}
    app __x17__ = (HasProperty Obj "set")
    if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    let hasSet = __x17__
    if (= hasSet true) {
      app __x18__ = (Get Obj "set")
      if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      let setter = __x18__
      app __x19__ = (IsCallable setter)
      if (&& (= __x19__ false) (! (= setter undefined))) {
        app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x20__
      } else {}
      desc["Set"] = setter
    } else {}
    if (|| (! (= desc["Get"] absent)) (! (= desc["Set"] absent))) if (|| (! (= desc["Value"] absent)) (! (= desc["Writable"] absent))) {
      app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x21__
    } else {} else {}
    app __x22__ = (WrapCompletion desc)
    return __x22__
  }
  */
}
