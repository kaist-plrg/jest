package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryPreventExtensions {
  val length: Int = 1
  val func: Func = Func("""OrdinaryPreventExtensions""", List(Id("""O""")), None, ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""Extensible""")), EBool(false)), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "OrdinaryPreventExtensions" (O) => {
    O["Extensible"] = false
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
