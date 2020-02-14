package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetThisValue {
  val length: Int = 1
  val func: Func = Func("""GetThisValue""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsSuperReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""thisValue"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "GetThisValue" (V) => {
    app __x0__ = (IsSuperReference V)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion V["thisValue"])
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
