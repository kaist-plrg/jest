package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTall {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.all""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""C"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))), IIf(EIsCompletion(ERef(RefId(Id("""iteratorRecord""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""iteratorRecord""")), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x3__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""iteratorRecord""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""PerformPromiseAll"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""C"""))), ERef(RefId(Id("""promiseCapability"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""result"""))))), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EIsCompletion(ERef(RefId(Id("""result""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x7__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""result""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "GLOBAL.Promise.all" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    let C = this
    app __x1__ = (NewPromiseCapability C)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    app __x2__ = (GetIterator iterable)
    let iteratorRecord = __x2__
    if (is-completion iteratorRecord) if (= iteratorRecord["Type"] CONST_normal) iteratorRecord = iteratorRecord["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [iteratorRecord["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    iteratorRecord
    app __x4__ = (PerformPromiseAll iteratorRecord C promiseCapability)
    let result = __x4__
    app __x5__ = (IsAbruptCompletion result)
    if __x5__ {
      if (= iteratorRecord["Done"] false) {
        app __x6__ = (IteratorClose iteratorRecord result)
        result = __x6__
      } else {}
      if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
        app __x7__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (&& (is-completion __x7__) (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
        return promiseCapability["Promise"]
      } else {}
      result
    } else {}
    app __x8__ = (Completion result)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
