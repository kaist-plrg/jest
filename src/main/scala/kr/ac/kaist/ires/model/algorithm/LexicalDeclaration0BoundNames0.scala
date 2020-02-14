package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""LexicalDeclaration0BoundNames0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""BindingList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingList"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "LexicalDeclaration0BoundNames0" (this, LetOrConst, BindingList) => {
    access __x0__ = (BindingList "BoundNames")
    return __x0__
  }
  */
}
