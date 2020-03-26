package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HasPrimitiveBase {
  val length: Int = 1
  val func: Func = Func("""HasPrimitiveBase""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))))), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Boolean""")))), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String"""))))), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Symbol"""))))), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x3__"""))))))))))
  /* Beautified form:
  "HasPrimitiveBase" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (Type V["BaseValue"])
    if (|| (|| (|| (= __x1__ Boolean) (= __x1__ String)) (= __x1__ Symbol)) (= __x1__ Number)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion false)
      return __x3__
    }
  }
  */
}
