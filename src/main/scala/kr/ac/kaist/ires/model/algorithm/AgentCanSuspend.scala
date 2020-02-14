package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentCanSuspend {
  val length: Int = 0
  val func: Func = Func("""AgentCanSuspend""", List(), None, ISeq(List(IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""AR""")), EStr("""CanBlock"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "AgentCanSuspend" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["CanBlock"])
    return __x0__
  }
  */
}
