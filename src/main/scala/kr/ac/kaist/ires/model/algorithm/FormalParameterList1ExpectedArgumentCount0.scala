package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1ExpectedArgumentCount0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ExpectedArgumentCount""")), ILet(Id("""count"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""HasInitializer""")), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List()), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""HasInitializer""")), IAssign(RefId(Id("""__x2__""")), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)))))), IIf(ERef(RefId(Id("""__x2__"""))), IReturn(ERef(RefId(Id("""count""")))), ISeq(List())), IReturn(EBOp(OPlus, ERef(RefId(Id("""count"""))), EINum(1L))))))
  /* Beautified form:
  "FormalParameterList1ExpectedArgumentCount0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    let count = __x0__
    access __x1__ = (FormalParameterList "HasInitializer")
    let __x2__ = (= __x1__ true)
    if __x2__ {} else {
      access __x3__ = (FormalParameter "HasInitializer")
      __x2__ = (= __x3__ true)
    }
    if __x2__ return count else {}
    return (+ count 1i)
  }
  */
}
