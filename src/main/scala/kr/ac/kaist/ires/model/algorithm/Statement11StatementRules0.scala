package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement11StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement11StatementRules0""", List(Id("""this"""), Id("""ThrowStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "Statement11StatementRules0" (this, ThrowStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
