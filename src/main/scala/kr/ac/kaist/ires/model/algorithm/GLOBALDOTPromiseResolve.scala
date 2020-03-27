package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseResolve {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.PromiseResolve""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""C"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""C"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsPromise"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""x"""))), EStr("""constructor"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""xConstructor"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""xConstructor"""))), ERef(RefId(Id("""C"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""x"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""x"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x8__""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "GLOBAL.PromiseResolve" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let C = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let x = __x1__
    app __x2__ = (Type C)
    assert (= __x2__ Object)
    app __x3__ = (IsPromise x)
    if (= __x3__ true) {
      app __x4__ = (Get x "constructor")
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let xConstructor = __x4__
      app __x5__ = (SameValue xConstructor C)
      if (= __x5__ true) {
        app __x6__ = (WrapCompletion x)
        return __x6__
      } else {}
    } else {}
    app __x7__ = (NewPromiseCapability C)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let promiseCapability = __x7__
    app __x8__ = (Call promiseCapability["Resolve"] undefined (new [x]))
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    __x8__
    app __x9__ = (WrapCompletion promiseCapability["Promise"])
    return __x9__
  }
  */
}
