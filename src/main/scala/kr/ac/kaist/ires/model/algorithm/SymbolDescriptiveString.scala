package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SymbolDescriptiveString {
  val length: Int = 1
  val func: Func = Func("""SymbolDescriptiveString""", List(Id("""sym""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""sym"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol"""))))), ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""sym""")), EStr("""Description""")))), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), IAssign(RefId(Id("""desc""")), EStr("""""")), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""desc"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EStr("""Symbol("""), ERef(RefId(Id("""desc""")))), EStr(""")""")))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "SymbolDescriptiveString" (sym) => {
    app __x0__ = (Type sym)
    assert (= __x0__ Symbol)
    let desc = sym["Description"]
    if (= desc undefined) desc = "" else {}
    app __x1__ = (Type desc)
    assert (= __x1__ String)
    app __x2__ = (WrapCompletion (+ (+ "Symbol(" desc) ")"))
    return __x2__
  }
  */
}
