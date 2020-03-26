package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsStringPrefix {
  val length: Int = 2
  val func: Func = Func("""IsStringPrefix""", List(Id("""p"""), Id("""q""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""p"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""q"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String"""))))), IExpr(ENotSupported("""Etc""")))))
  /* Beautified form:
  "IsStringPrefix" (p, q) => {
    app __x0__ = (Type p)
    assert (= __x0__ String)
    app __x1__ = (Type q)
    assert (= __x1__ String)
    !!! "Etc"
  }
  */
}
