package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinarySetWithOwnDescriptor {
  val length: Int = 5
  val func: Func = Func("""OrdinarySetWithOwnDescriptor""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver"""), Id("""ownDesc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(EBOp(OEq, ERef(RefId(Id("""ownDesc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""parent"""), ERef(RefId(Id("""__x1__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""Set"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), IAssign(RefId(Id("""ownDesc""")), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(true)))))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""ownDesc"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ownDesc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""Receiver"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""Receiver""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""existingDescriptor"""), ERef(RefId(Id("""__x8__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""existingDescriptor"""))), EUndef)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""existingDescriptor"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""existingDescriptor""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), ILet(Id("""valueDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V"""))))))), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""Receiver""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""valueDesc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x14__"""))))), IReturn(ERef(RefId(Id("""__x15__"""))))))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""ownDesc"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x16__"""))), EBool(true))), ILet(Id("""setter"""), ERef(RefProp(RefId(Id("""ownDesc""")), EStr("""Set""")))), IIf(EBOp(OEq, ERef(RefId(Id("""setter"""))), EUndef), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x17__""")))))), ISeq(List())), IApp(Id("""__x18__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""setter"""))), ERef(RefId(Id("""Receiver"""))), EList(List(ERef(RefId(Id("""V"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x18__""")))), IApp(Id("""__x19__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x19__""")))))))
  /* Beautified form:
  "OrdinarySetWithOwnDescriptor" (O, P, V, Receiver, ownDesc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= ownDesc undefined) {
      app __x1__ = (O["GetPrototypeOf"] O)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let parent = __x1__
      if (! (= parent null)) {
        app __x2__ = (parent["Set"] parent P V Receiver)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        app __x3__ = (WrapCompletion __x2__)
        return __x3__
      } else ownDesc = (new PropertyDescriptor("Value" -> undefined, "Writable" -> true, "Enumerable" -> true, "Configurable" -> true))
    } else {}
    app __x4__ = (IsDataDescriptor ownDesc)
    if (= __x4__ true) {
      if (= ownDesc["Writable"] false) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      app __x6__ = (Type Receiver)
      if (! (= __x6__ Object)) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
      app __x8__ = (Receiver["GetOwnProperty"] Receiver P)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let existingDescriptor = __x8__
      if (! (= existingDescriptor undefined)) {
        app __x9__ = (IsAccessorDescriptor existingDescriptor)
        if (= __x9__ true) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        if (= existingDescriptor["Writable"] false) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
        let valueDesc = (new PropertyDescriptor("Value" -> V))
        app __x12__ = (Receiver["DefineOwnProperty"] Receiver P valueDesc)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (WrapCompletion __x12__)
        return __x13__
      } else {
        app __x14__ = (CreateDataProperty Receiver P V)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        app __x15__ = (WrapCompletion __x14__)
        return __x15__
      }
    } else {}
    app __x16__ = (IsAccessorDescriptor ownDesc)
    assert (= __x16__ true)
    let setter = ownDesc["Set"]
    if (= setter undefined) {
      app __x17__ = (WrapCompletion false)
      return __x17__
    } else {}
    app __x18__ = (Call setter Receiver (new [V]))
    if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
    __x18__
    app __x19__ = (WrapCompletion true)
    return __x19__
  }
  */
}
