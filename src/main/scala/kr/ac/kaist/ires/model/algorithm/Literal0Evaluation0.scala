package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Literal0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Literal0Evaluation0""", List(Id("""this"""), Id("""NullLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENull)), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "Literal0Evaluation0" (this, NullLiteral) => {
    app __x0__ = (WrapCompletion null)
    return __x0__
  }
  */
}
