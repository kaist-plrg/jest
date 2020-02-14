package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclaration1BoundNames0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "VariableDeclaration1BoundNames0" (this, BindingPattern, Initializer) => {
    access __x0__ = (BindingPattern "BoundNames")
    return __x0__
  }
  */
}
