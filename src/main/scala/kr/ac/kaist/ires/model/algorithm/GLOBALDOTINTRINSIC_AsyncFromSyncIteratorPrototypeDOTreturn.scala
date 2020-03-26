package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord"""))), EAbsent)))), IApp(Id("""__x2__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x2__""")))), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""return"""))), ILet(Id("""return"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""return""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""return""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""return""")), ERef(RefProp(RefId(Id("""return""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""return""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x4__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""return""")))), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""iterResult"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iterResult"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))), ILet(Id("""result"""), ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x9__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""result""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x10__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x11__""")))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (Type O)
    assert (&& (= __x1__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x2__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let promiseCapability = __x2__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x3__ = (GetMethod syncIterator "return")
    let return = __x3__
    if (= (typeof return) "Completion") if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (= (typeof __x4__) "Completion") (! (= __x4__["Type"] CONST_normal))) return __x4__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x5__ = (CreateIterResultObject value true)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let iterResult = __x5__
      app __x6__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
      app __x7__ = (WrapCompletion promiseCapability["Promise"])
      return __x7__
    } else {}
    app __x8__ = (Call return syncIterator (new [value]))
    let result = __x8__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x9__) "Completion") (! (= __x9__["Type"] CONST_normal))) return __x9__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x10__ = (Type result)
    if (! (= __x10__ Object)) {
      app __x11__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      app __x12__ = (WrapCompletion promiseCapability["Promise"])
      return __x12__
    } else {}
    app __x13__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }
  */
}
