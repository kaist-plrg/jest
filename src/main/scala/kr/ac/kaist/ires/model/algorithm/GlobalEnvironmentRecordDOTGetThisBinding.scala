package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val func: Func = Func("""GlobalEnvironmentRecord.GetThisBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""GlobalThisValue"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "GlobalEnvironmentRecord.GetThisBinding" (this) => {
    let envRec = this
    app __x0__ = (WrapCompletion envRec["GlobalThisValue"])
    return __x0__
  }
  */
}
