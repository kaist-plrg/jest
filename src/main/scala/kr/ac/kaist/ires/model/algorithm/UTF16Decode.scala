package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UTF16Decode {
  val length: Int = 2
  val func: Func = Func("""UTF16Decode""", List(Id("""lead"""), Id("""trail""")), None, ISeq(List(ILet(Id("""cp"""), EBOp(OPlus, EBOp(OPlus, EBOp(OMul, EBOp(OSub, ERef(RefId(Id("""lead"""))), EINum(55296L)), EINum(1024L)), EBOp(OSub, ERef(RefId(Id("""trail"""))), EINum(56320L))), EINum(65536L))), IExpr(ENotSupported("""Etc""")))))
  /* Beautified form:
  "UTF16Decode" (lead, trail) => {
    let cp = (+ (+ (* (- lead 55296i) 1024i) (- trail 56320i)) 65536i)
    !!! "Etc"
  }
  */
}
