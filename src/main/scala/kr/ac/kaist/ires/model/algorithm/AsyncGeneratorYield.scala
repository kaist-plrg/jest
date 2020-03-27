package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorYield {
  val length: Int = 1
  val func: Func = Func("""AsyncGeneratorYield""", List(Id("""value""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""CONST_async"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IAssign(RefId(Id("""value""")), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedYield""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x2__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""resumptionValue"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Value"""))))), ILet(Id("""awaited"""), ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""awaited""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""awaited"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""awaited""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""awaited""")), EStr("""Value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))), IReturn(ERef(RefId(Id("""__x8__""")))))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""value"""))), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IApp(Id("""__x10__"""), EPop(ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EINum(0L)), List(ERef(RefId(Id("""__x9__"""))))))))
  /* Beautified form:
  "AsyncGeneratorYield" (value) => {
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x0__ = (GetGeneratorKind )
    assert (= __x0__ CONST_async)
    app __x1__ = (Await value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    value = __x1__
    generator["AsyncGeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x2__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x2__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      if (! (= resumptionValue["Type"] CONST_return)) {
        app __x3__ = (Completion resumptionValue)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (Await resumptionValue["Value"])
      let awaited = __x5__
      if (= awaited["Type"] CONST_throw) {
        app __x6__ = (Completion awaited)
        app __x7__ = (WrapCompletion __x6__)
        return __x7__
      } else {}
      assert (= awaited["Type"] CONST_normal)
      app __x8__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> awaited["Value"], "Target" -> CONST_empty)))
      return __x8__
    }
    app __x9__ = (AsyncGeneratorResolve generator value false)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    app __x10__ = ((pop genContext["ReturnCont"] 0i) __x9__)
  }
  */
}
