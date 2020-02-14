package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsCompatiblePropertyDescriptor {
  val length: Int = 3
  val func: Func = Func("""IsCompatiblePropertyDescriptor""", List(Id("""Extensible"""), Id("""Desc"""), Id("""Current""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ValidateAndApplyPropertyDescriptor"""))), List(EUndef, EUndef, ERef(RefId(Id("""Extensible"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""Current"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "IsCompatiblePropertyDescriptor" (Extensible, Desc, Current) => {
    app __x0__ = (ValidateAndApplyPropertyDescriptor undefined undefined Extensible Desc Current)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
