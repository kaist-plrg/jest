package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""OrdinaryGetPrototypeOf""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""O""")), EStr("""Prototype"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "OrdinaryGetPrototypeOf" (O) => {
    app __x0__ = (WrapCompletion O["Prototype"])
    return __x0__
  }
  */
}
