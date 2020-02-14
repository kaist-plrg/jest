package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4ExpectedArgumentCount0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ExpectedArgumentCount""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "FormalParameters4ExpectedArgumentCount0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    return __x0__
  }
  */
}
