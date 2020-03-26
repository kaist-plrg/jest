package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateByteDataBlock {
  val length: Int = 1
  val func: Func = Func("""CreateByteDataBlock""", List(Id("""size""")), None, ISeq(List(IAssert(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""size"""))), EINum(0L)))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""db"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "CreateByteDataBlock" (size) => {
    assert (! (< size 0i))
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion db)
    return __x0__
  }
  */
}
