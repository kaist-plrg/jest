package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""lexical""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__"""))))))))))
  /* Beautified form:
  "FunctionEnvironmentRecord.HasSuperBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "lexical") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= envRec["HomeObject"] undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion true)
      return __x2__
    }
  }
  */
}
