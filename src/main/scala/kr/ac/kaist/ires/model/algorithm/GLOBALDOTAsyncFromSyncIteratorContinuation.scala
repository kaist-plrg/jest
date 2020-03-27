package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncFromSyncIteratorContinuation {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncFromSyncIteratorContinuation""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""result"""))))), ILet(Id("""done"""), ERef(RefId(Id("""__x2__""")))), IIf(EIsCompletion(ERef(RefId(Id("""done""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""done""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""done""")), ERef(RefProp(RefId(Id("""done""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""done""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x3__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""done""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""result"""))))), ILet(Id("""value"""), ERef(RefId(Id("""__x4__""")))), IIf(EIsCompletion(ERef(RefId(Id("""value""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""value""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x5__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x5__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""value""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefId(Id("""value"""))))), ILet(Id("""valueWrapper"""), ERef(RefId(Id("""__x6__""")))), IIf(EIsCompletion(ERef(RefId(Id("""valueWrapper""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""valueWrapper""")), ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""__x7__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""valueWrapper""")))), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions"""))))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Done"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x8__""")))), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Done""")), ERef(RefId(Id("""done""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""valueWrapper"""))), ERef(RefId(Id("""onFulfilled"""))), EUndef, ERef(RefId(Id("""promiseCapability"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "GLOBAL.AsyncFromSyncIteratorContinuation" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let result = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let promiseCapability = __x1__
    app __x2__ = (IteratorComplete result)
    let done = __x2__
    if (is-completion done) if (= done["Type"] CONST_normal) done = done["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [done["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    done
    app __x4__ = (IteratorValue result)
    let value = __x4__
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [value["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    value
    app __x6__ = (PromiseResolve INTRINSIC_Promise value)
    let valueWrapper = __x6__
    if (is-completion valueWrapper) if (= valueWrapper["Type"] CONST_normal) valueWrapper = valueWrapper["Value"] else {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [valueWrapper["Value"]]))
      if (&& (is-completion __x7__) (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
      return promiseCapability["Promise"]
    } else {}
    valueWrapper
    let steps = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions))
    app __x8__ = (CreateBuiltinFunction steps (new ["Done"]))
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let onFulfilled = __x8__
    onFulfilled["Done"] = done
    app __x9__ = (PerformPromiseThen valueWrapper onFulfilled undefined promiseCapability)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (WrapCompletion promiseCapability["Promise"])
    return __x10__
  }
  */
}
