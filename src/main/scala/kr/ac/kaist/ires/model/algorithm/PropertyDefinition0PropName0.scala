package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition0PropName0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition0PropName0""", List(Id("""this"""), Id("""IdentifierReference""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierReference"""))), EStr("""StringValue""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "PropertyDefinition0PropName0" (this, IdentifierReference) => {
    access __x0__ = (IdentifierReference "StringValue")
    return __x0__
  }
  */
}
