package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SplitMatch {
  val length: Int = 3
  val func: Func = Func("""SplitMatch""", List(Id("""S"""), Id("""q"""), Id("""R""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""R"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ILet(Id("""r"""), ERef(RefProp(RefId(Id("""R""")), EStr("""length""")))), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))), IIf(EBOp(OLt, ERef(RefId(Id("""s"""))), EBOp(OPlus, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""r"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IExpr(ENotSupported("""NumberOp""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""r""")))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "SplitMatch" (S, q, R) => {
    app __x0__ = (Type R)
    assert (= __x0__ String)
    let r = R["length"]
    let s = S["length"]
    if (< s (+ q r)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    !!! "NumberOp"
    app __x2__ = (WrapCompletion (+ q r))
    return __x2__
  }
  */
}
