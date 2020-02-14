package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4PropName0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "MethodDefinition4PropName0" (this, PropertyName, FunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
