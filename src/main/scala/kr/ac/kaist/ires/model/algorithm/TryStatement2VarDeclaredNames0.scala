package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2VarDeclaredNames0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarDeclaredNames""")), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""VarDeclaredNames""")), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Finally"""))), EStr("""VarDeclaredNames""")), ILet(Id("""__x6__"""), ERef(RefId(Id("""__x5__""")))), ILet(Id("""__x7__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x8__"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))), IAppend(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""names""")))), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L)))))), IReturn(ERef(RefId(Id("""names""")))))))
  /* Beautified form:
  "TryStatement2VarDeclaredNames0" (this, Block, Catch, Finally) => {
    access __x0__ = (Block "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (Catch "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    access __x5__ = (Finally "VarDeclaredNames")
    let __x6__ = __x5__
    let __x7__ = 0i
    while (< __x7__ __x6__["length"]) {
      let __x8__ = __x6__[__x7__]
      append __x8__ -> names
      __x7__ = (+ __x7__ 1i)
    }
    return names
  }
  */
}
