package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElisionElement0ContainsExpression1 {
  val length: Int = 0
  val func: Func = Func("""BindingElisionElement0ContainsExpression1""", List(Id("""this"""), Id("""Elision"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""ContainsExpression""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "BindingElisionElement0ContainsExpression1" (this, Elision, BindingElement) => {
    access __x0__ = (BindingElement "ContainsExpression")
    return __x0__
  }
  */
}
