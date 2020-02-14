package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SymbolDescriptiveString {
  val length: Int = 1
  val func: Func = Func("""SymbolDescriptiveString""", List(Id("""sym""")), None, ISeq(List(ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""sym""")), EStr("""Description""")))), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), IAssign(RefId(Id("""desc""")), EStr("""""")), ISeq(List())), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EStr("""Symbol("""), ERef(RefId(Id("""desc""")))), EStr(""")""")))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "SymbolDescriptiveString" (sym) => {
    let desc = sym["Description"]
    if (= desc undefined) desc = "" else {}
    app __x0__ = (WrapCompletion (+ (+ "Symbol(" desc) ")"))
    return __x0__
  }
  */
}
