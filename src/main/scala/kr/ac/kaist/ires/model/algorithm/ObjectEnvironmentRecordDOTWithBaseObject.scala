package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTWithBaseObject {
  val length: Int = 0
  val func: Func = Func("""ObjectEnvironmentRecord.WithBaseObject""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""withEnvironment"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindingObject"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x1__"""))))))))))
  /* Beautified form:
  "ObjectEnvironmentRecord.WithBaseObject" (this) => {
    let envRec = this
    if (= envRec["withEnvironment"] true) {
      app __x0__ = (WrapCompletion envRec["BindingObject"])
      return __x0__
    } else {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    }
  }
  */
}
