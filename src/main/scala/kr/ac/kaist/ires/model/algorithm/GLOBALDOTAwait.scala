package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAwait {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Await""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))), ILet(Id("""completion"""), ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "GLOBAL.Await" (this, argumentsList, NewTarget) => {
    app __x0__ = (Await value)
    let completion = __x0__
  }
  */
}
