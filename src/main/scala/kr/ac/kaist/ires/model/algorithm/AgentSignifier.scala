package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentSignifier {
  val length: Int = 0
  val func: Func = Func("""AgentSignifier""", List(), None, ISeq(List(IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""AR""")), EStr("""Signifier"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "AgentSignifier" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["Signifier"])
    return __x0__
  }
  */
}
