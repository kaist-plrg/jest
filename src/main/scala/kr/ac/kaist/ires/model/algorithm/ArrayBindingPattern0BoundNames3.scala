package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern0BoundNames3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0BoundNames3""", List(Id("""this"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ArrayBindingPattern0BoundNames3" (this, Elision, BindingRestElement) => {
    access __x0__ = (BindingRestElement "BoundNames")
    return __x0__
  }
  */
}
