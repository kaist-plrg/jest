package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseResolveFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.PromiseResolveFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""resolution"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)), IApp(Id("""__x2__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""promise"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(ILet(Id("""selfResolutionError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""selfResolutionError"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""resolution"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""resolution"""))), EStr("""then"""))), ILet(Id("""then"""), ERef(RefId(Id("""__x8__""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""then"""))))), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefProp(RefId(Id("""then""")), EStr("""Value"""))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), ILet(Id("""thenAction"""), ERef(RefProp(RefId(Id("""then""")), EStr("""Value""")))), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""thenAction"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(false)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""FulfillPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))))), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseResolveThenableJob"""))), EList(List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""resolution"""))), ERef(RefId(Id("""thenAction"""))))))), IExpr(ERef(RefId(Id("""__x15__""")))), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x16__""")))))))
  /* Beautified form:
  "GLOBAL.PromiseResolveFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let resolution = __x0__
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    alreadyResolved["Value"] = true
    app __x2__ = (SameValue resolution promise)
    if (= __x2__ true) {
      let selfResolutionError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x3__ = (RejectPromise promise selfResolutionError)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (Type resolution)
    if (! (= __x5__ Object)) {
      app __x6__ = (FulfillPromise promise resolution)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (Get resolution "then")
    let then = __x8__
    app __x9__ = (IsAbruptCompletion then)
    if __x9__ {
      app __x10__ = (RejectPromise promise then["Value"])
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    let thenAction = then["Value"]
    app __x12__ = (IsCallable thenAction)
    if (= __x12__ false) {
      app __x13__ = (FulfillPromise promise resolution)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (EnqueueJob "PromiseJobs" PromiseResolveThenableJob (new [promise, resolution, thenAction]))
    __x15__
    app __x16__ = (WrapCompletion undefined)
    return __x16__
  }
  */
}
