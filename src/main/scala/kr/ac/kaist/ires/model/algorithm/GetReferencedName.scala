package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetReferencedName {
  val length: Int = 1
  val func: Func = Func("""GetReferencedName""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""ReferencedName"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "GetReferencedName" (V) => {
    app __x0__ = (WrapCompletion V["ReferencedName"])
    return __x0__
  }
  */
}
