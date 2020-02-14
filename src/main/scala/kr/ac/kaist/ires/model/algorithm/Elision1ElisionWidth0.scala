package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Elision1ElisionWidth0 {
  val length: Int = 0
  val func: Func = Func("""Elision1ElisionWidth0""", List(Id("""this"""), Id("""Elision""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")), ILet(Id("""preceding"""), ERef(RefId(Id("""__x0__""")))), IReturn(EBOp(OPlus, ERef(RefId(Id("""preceding"""))), EINum(1L))))))
  /* Beautified form:
  "Elision1ElisionWidth0" (this, Elision) => {
    access __x0__ = (Elision "ElisionWidth")
    let preceding = __x0__
    return (+ preceding 1i)
  }
  */
}
