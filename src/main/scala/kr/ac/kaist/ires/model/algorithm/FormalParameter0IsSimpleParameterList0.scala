package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameter0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameter0IsSimpleParameterList0""", List(Id("""this"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""IsSimpleParameterList""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "FormalParameter0IsSimpleParameterList0" (this, BindingElement) => {
    access __x0__ = (BindingElement "IsSimpleParameterList")
    return __x0__
  }
  */
}
