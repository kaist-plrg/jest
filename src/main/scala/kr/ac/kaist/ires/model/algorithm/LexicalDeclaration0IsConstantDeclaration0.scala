package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""LexicalDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""BindingList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LetOrConst"""))), EStr("""IsConstantDeclaration""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "LexicalDeclaration0IsConstantDeclaration0" (this, LetOrConst, BindingList) => {
    access __x0__ = (LetOrConst "IsConstantDeclaration")
    return __x0__
  }
  */
}
