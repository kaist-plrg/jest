package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration0BoundNames0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "FunctionDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
