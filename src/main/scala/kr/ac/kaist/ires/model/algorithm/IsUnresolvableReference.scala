package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsUnresolvableReference {
  val length: Int = 1
  val func: Func = Func("""IsUnresolvableReference""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x2__"""))))))))))
  /* Beautified form:
  "IsUnresolvableReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    if (= V["BaseValue"] undefined) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion false)
      return __x2__
    }
  }
  */
}
