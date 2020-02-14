package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0BoundNames0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ForDeclaration0BoundNames0" (this, LetOrConst, ForBinding) => {
    access __x0__ = (ForBinding "BoundNames")
    return __x0__
  }
  */
}
