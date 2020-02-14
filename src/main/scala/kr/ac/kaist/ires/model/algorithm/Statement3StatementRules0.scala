package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement3StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement3StatementRules0""", List(Id("""this"""), Id("""ExpressionStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "Statement3StatementRules0" (this, ExpressionStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
