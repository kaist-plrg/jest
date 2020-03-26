package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = Func("""INTRINSIC_AsyncFromSyncIteratorPrototype.throw""", List(Id("""value""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord"""))), EAbsent)))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""throw"""))), ILet(Id("""throw"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""throw""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""throw""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""throw""")), ERef(RefProp(RefId(Id("""throw""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""throw""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""throw""")))), IIf(EBOp(OEq, ERef(RefId(Id("""throw"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""throw"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))), ILet(Id("""result"""), ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""result""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "INTRINSIC_AsyncFromSyncIteratorPrototype.throw" (value) => {
    let O = this
    app __x0__ = (Type O)
    assert (&& (= __x0__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x2__ = (GetMethod syncIterator "throw")
    let throw = __x2__
    if (= (typeof throw) "Completion") if (= throw["Type"] CONST_normal) throw = throw["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [throw["Value"]]))
      if (&& (= (typeof __x3__) "Completion") (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    throw
    if (= throw undefined) {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [value]))
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      app __x5__ = (WrapCompletion promiseCapability["Promise"])
      return __x5__
    } else {}
    app __x6__ = (Call throw syncIterator (new [value]))
    let result = __x6__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x7__) "Completion") (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x8__ = (Type result)
    if (! (= __x8__ Object)) {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      __x9__
      app __x10__ = (WrapCompletion promiseCapability["Promise"])
      return __x10__
    } else {}
    app __x11__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
