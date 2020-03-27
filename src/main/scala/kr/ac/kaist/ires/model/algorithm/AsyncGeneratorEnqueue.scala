package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorEnqueue {
  val length: Int = 2
  val func: Func = Func("""AsyncGeneratorEnqueue""", List(Id("""generator"""), Id("""completion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""generator"""))))), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EAbsent)), ISeq(List(ILet(Id("""badGeneratorError"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""badGeneratorError"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))), ILet(Id("""request"""), EMap(Ty("""AsyncGeneratorRequest"""), List((EStr("""Completion"""), ERef(RefId(Id("""completion""")))), (EStr("""Capability"""), ERef(RefId(Id("""promiseCapability"""))))))), IAppend(ERef(RefId(Id("""request"""))), ERef(RefId(Id("""queue""")))), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""executing"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "AsyncGeneratorEnqueue" (generator, completion) => {
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (Type generator)
    if (|| (! (= __x1__ Object)) (= generator["AsyncGeneratorState"] absent)) {
      let badGeneratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [badGeneratorError]))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion promiseCapability["Promise"])
      return __x3__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    let request = (new AsyncGeneratorRequest("Completion" -> completion, "Capability" -> promiseCapability))
    append request -> queue
    let state = generator["AsyncGeneratorState"]
    if (! (= state "executing")) {
      app __x4__ = (AsyncGeneratorResumeNext generator)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    } else {}
    app __x5__ = (WrapCompletion promiseCapability["Promise"])
    return __x5__
  }
  */
}
