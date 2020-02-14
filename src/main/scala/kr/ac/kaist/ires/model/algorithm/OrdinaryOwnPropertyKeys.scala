package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryOwnPropertyKeys {
  val length: Int = 1
  val func: Func = Func("""OrdinaryOwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())), ILet(Id("""__x0__"""), EKeys(ERef(RefProp(RefId(Id("""O""")), EStr("""SubMap"""))))), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""__x2__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""keys""")))), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L)))))), IReturn(ERef(RefId(Id("""keys""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "OrdinaryOwnPropertyKeys" (O) => {
    let keys = (new [])
    let __x0__ = (map-keys O["SubMap"])
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> keys
      __x2__ = (+ __x2__ 1i)
    }
    return keys
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (WrapCompletion keys)
    return __x4__
  }
  */
}
