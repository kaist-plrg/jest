package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1HasInitializer0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1HasInitializer0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""HasInitializer""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""HasInitializer""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "FormalParameterList1HasInitializer0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "HasInitializer")
    if (= __x0__ true) return true else {}
    access __x1__ = (FormalParameter "HasInitializer")
    return __x1__
  }
  */
}
