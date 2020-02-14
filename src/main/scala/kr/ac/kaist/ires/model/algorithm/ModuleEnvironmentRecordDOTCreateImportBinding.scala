package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTCreateImportBinding {
  val length: Int = 3
  val func: Func = Func("""ModuleEnvironmentRecord.CreateImportBinding""", List(Id("""this"""), Id("""N"""), Id("""M"""), Id("""N2""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ModuleEnvironmentRecord.CreateImportBinding" (this, N, M, N2) => {
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
