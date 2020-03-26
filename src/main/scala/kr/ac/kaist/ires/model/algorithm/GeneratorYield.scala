package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorYield {
  val length: Int = 1
  val func: Func = Func("""GeneratorYield""", List(Id("""iterNextObj""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""CONST_sync"""))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedYield""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""resumptionValue"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""iterNextObj"""))))), IApp(Id("""__x4__"""), EPop(ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EINum(0L)), List(ERef(RefId(Id("""__x3__"""))))))))
  /* Beautified form:
  "GeneratorYield" (iterNextObj) => {
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x0__ = (GetGeneratorKind )
    assert (= __x0__ CONST_sync)
    generator["GeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x1__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x1__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      app __x2__ = (WrapCompletion resumptionValue)
      return __x2__
    }
    app __x3__ = (NormalCompletion iterNextObj)
    app __x4__ = ((pop genContext["ReturnCont"] 0i) __x3__)
  }
  */
}
