package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorYield {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorYield""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""CONST_async"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IAssign(RefId(Id("""value""")), ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedYield""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""resumptionValue"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Value"""))))), ILet(Id("""awaited"""), ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""awaited""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""awaited"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""awaited""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""awaited""")), EStr("""Value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))), IReturn(ERef(RefId(Id("""__x9__""")))))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""value"""))), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorYield" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x1__ = (GetGeneratorKind )
    assert (= __x1__ CONST_async)
    app __x2__ = (Await value)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    value = __x2__
    generator["AsyncGeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x3__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x3__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      if (! (= resumptionValue["Type"] CONST_return)) {
        app __x4__ = (Completion resumptionValue)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (Await resumptionValue["Value"])
      let awaited = __x6__
      if (= awaited["Type"] CONST_throw) {
        app __x7__ = (Completion awaited)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
      assert (= awaited["Type"] CONST_normal)
      app __x9__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> awaited["Value"], "Target" -> CONST_empty)))
      return __x9__
    }
    app __x10__ = (AsyncGeneratorResolve generator value false)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
