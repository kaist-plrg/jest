package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakableStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""IterationStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""__x0__"""), ECopy(ERef(RefId(Id("""iterationSet"""))))), ILet(Id("""__x1__"""), ERef(RefId(Id("""labelSet""")))), ILet(Id("""__x2__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""__x0__""")))), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L)))))), ILet(Id("""newIterationSet"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""IterationStatement"""))), EStr("""ContainsUndefinedContinueTarget""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""newIterationSet"""))), EList(List()))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "BreakableStatement0ContainsUndefinedContinueTarget0" (this, IterationStatement, iterationSet, labelSet) => {
    let __x0__ = (copy-obj iterationSet)
    let __x1__ = labelSet
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> __x0__
      __x2__ = (+ __x2__ 1i)
    }
    let newIterationSet = __x0__
    access __x4__ = (IterationStatement "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ newIterationSet (new []))
    return __x5__
  }
  */
}
