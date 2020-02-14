package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingIdentifier0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier0BoundNames0""", List(Id("""this"""), Id("""Identifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Identifier"""))), EStr("""StringValue""")), IReturn(EList(List(ERef(RefId(Id("""__x0__""")))))))))
  /* Beautified form:
  "BindingIdentifier0BoundNames0" (this, Identifier) => {
    access __x0__ = (Identifier "StringValue")
    return (new [__x0__])
  }
  */
}
