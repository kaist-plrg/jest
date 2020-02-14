package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement2StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement2StatementRules0""", List(Id("""this"""), Id("""EmptyStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "Statement2StatementRules0" (this, EmptyStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
