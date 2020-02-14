package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ClassDeclaration0BoundNames0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
