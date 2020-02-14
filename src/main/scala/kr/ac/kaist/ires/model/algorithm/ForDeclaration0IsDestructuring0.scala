package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForDeclaration0IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0IsDestructuring0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""IsDestructuring""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ForDeclaration0IsDestructuring0" (this, LetOrConst, ForBinding) => {
    access __x0__ = (ForBinding "IsDestructuring")
    return __x0__
  }
  */
}
