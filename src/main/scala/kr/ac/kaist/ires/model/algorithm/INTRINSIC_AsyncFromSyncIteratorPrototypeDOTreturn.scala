package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""INTRINSIC_AsyncFromSyncIteratorPrototype.return""", List(Id("""value""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord"""))), EAbsent)))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""return"""))), ILet(Id("""return"""), ERef(RefId(Id("""__x2__""")))), IIf(EIsCompletion(ERef(RefId(Id("""return""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""return""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""return""")), ERef(RefProp(RefId(Id("""return""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""return""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x3__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""return""")))), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""iterResult"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iterResult"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))), ILet(Id("""result"""), ERef(RefId(Id("""__x7__""")))), IIf(EIsCompletion(ERef(RefId(Id("""result""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x8__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x8__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""result""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))))
  /* Beautified form:
  "INTRINSIC_AsyncFromSyncIteratorPrototype.return" (value) => {
    let O = this
    app __x0__ = (Type O)
    assert (&& (= __x0__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x2__ = (GetMethod syncIterator "return")
    let return = __x2__
    if (is-completion return) if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x4__ = (CreateIterResultObject value true)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let iterResult = __x4__
      app __x5__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      __x5__
      app __x6__ = (WrapCompletion promiseCapability["Promise"])
      return __x6__
    } else {}
    app __x7__ = (Call return syncIterator (new [value]))
    let result = __x7__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x8__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x8__) (! (= __x8__["Type"] CONST_normal))) return __x8__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x9__ = (Type result)
    if (! (= __x9__ Object)) {
      app __x10__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      __x10__
      app __x11__ = (WrapCompletion promiseCapability["Promise"])
      return __x11__
    } else {}
    app __x12__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
