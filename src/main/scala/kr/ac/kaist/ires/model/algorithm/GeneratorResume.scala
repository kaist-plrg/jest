package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorResume {
  val length: Int = 2
  val func: Func = Func("""GeneratorResume""", List(Id("""generator"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""state"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedYield""")))), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAssign(RefId(Id("""GLOBAL_context""")), ENull), IAssign(RefId(Id("""methodContext""")), ENull), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))), IWithCont(Id("""__x4__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())), ISeq(List())), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x3__""")))))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "GeneratorResume" (generator, value) => {
    app __x0__ = (GeneratorValidate generator)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state "completed") {
      app __x1__ = (CreateIterResultObject undefined true)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    assert (|| (= state "suspendedStart") (= state "suspendedYield"))
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x3__ = (NormalCompletion value)
    withcont __x4__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x4__ -> genContext["ReturnCont"]
      app __x5__ = (genContext["ResumeCont"] __x3__)
    }
    app __x6__ = (Completion result)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
