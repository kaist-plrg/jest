package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestElement1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement1ContainsExpression0""", List(Id("""this"""), Id("""BindingPattern""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""ContainsExpression""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "BindingRestElement1ContainsExpression0" (this, BindingPattern) => {
    access __x0__ = (BindingPattern "ContainsExpression")
    return __x0__
  }
  */
}
