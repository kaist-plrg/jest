package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsStringPrefix {
  val length: Int = 2
  val func: Func = Func("""IsStringPrefix""", List(Id("""p"""), Id("""q""")), None, IExpr(ENotSupported("""Etc""")))
  /* Beautified form:
  "IsStringPrefix" (p, q) => !!! "Etc"
  */
}
