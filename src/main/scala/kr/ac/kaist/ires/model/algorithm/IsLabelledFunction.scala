package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsLabelledFunction {
  val length: Int = 1
  val func: Func = Func("""IsLabelledFunction""", List(Id("""stmt""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")), IAccess(Id("""__x0__"""), ERef(RefId(Id("""stmt"""))), EStr("""LabelledItem""")), ILet(Id("""item"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsInstanceOf(ERef(RefId(Id("""item"""))), """LabelledItem1"""), ISeq(List(IAccess(Id("""FunctionDeclaration"""), ERef(RefId(Id("""item"""))), EStr("""FunctionDeclaration""")), IReturn(EBool(true)))), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""item"""))), EStr("""Statement""")), ILet(Id("""subStmt"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsLabelledFunction"""))), List(ERef(RefId(Id("""subStmt"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "IsLabelledFunction" (stmt) => {
    !!! "Etc"
    access __x0__ = (stmt "LabelledItem")
    let item = __x0__
    if (is-instance-of item LabelledItem1) {
      access FunctionDeclaration = (item "FunctionDeclaration")
      return true
    } else {}
    access __x1__ = (item "Statement")
    let subStmt = __x1__
    app __x2__ = (IsLabelledFunction subStmt)
    return __x2__
  }
  */
}
