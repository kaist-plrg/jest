package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorMethod0PropName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorMethod0PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "AsyncGeneratorMethod0PropName0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
