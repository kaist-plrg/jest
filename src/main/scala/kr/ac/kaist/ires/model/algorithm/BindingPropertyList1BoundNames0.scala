package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingPropertyList1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingPropertyList1BoundNames0""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""BindingProperty""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""BoundNames""")), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingProperty"""))), EStr("""BoundNames""")), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))), IReturn(ERef(RefId(Id("""names""")))))))
  /* Beautified form:
  "BindingPropertyList1BoundNames0" (this, BindingPropertyList, BindingProperty) => {
    access __x0__ = (BindingPropertyList "BoundNames")
    let names = __x0__
    access __x1__ = (BindingProperty "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }
  */
}
