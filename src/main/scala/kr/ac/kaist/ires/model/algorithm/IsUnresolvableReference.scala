package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsUnresolvableReference {
  val length: Int = 1
  val func: Func = Func("""IsUnresolvableReference""", List(Id("""V""")), None, IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__"""))))))))
  /* Beautified form:
  "IsUnresolvableReference" (V) => if (= V["BaseValue"] undefined) {
    app __x0__ = (WrapCompletion true)
    return __x0__
  } else {
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
