package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryIsExtensible {
  val length: Int = 1
  val func: Func = Func("""OrdinaryIsExtensible""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""O""")), EStr("""Extensible"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "OrdinaryIsExtensible" (O) => {
    app __x0__ = (WrapCompletion O["Extensible"])
    return __x0__
  }
  */
}
