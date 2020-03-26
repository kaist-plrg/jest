package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetThisValue {
  val length: Int = 1
  val func: Func = Func("""GetThisValue""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsSuperReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""thisValue"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "GetThisValue" (V) => {
    app __x0__ = (IsPropertyReference V)
    assert (= __x0__ true)
    app __x1__ = (IsSuperReference V)
    if (= __x1__ true) {
      app __x2__ = (WrapCompletion V["thisValue"])
      return __x2__
    } else {}
    app __x3__ = (GetBase V)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
