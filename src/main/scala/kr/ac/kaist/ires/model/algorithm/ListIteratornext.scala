package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ListIteratornext {
  val length: Int = 0
  val func: Func = Func("""ListIteratornext""", List(Id("""this""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), ILet(Id("""list"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedList""")))), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")))), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""list""")), EStr("""length""")))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""list""")), ERef(RefId(Id("""index"""))))), EBool(false))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "ListIteratornext" (this) => {
    let O = this
    let list = O["IteratedList"]
    let index = O["ListIteratorNextIndex"]
    let len = list["length"]
    if (! (< index len)) {
      app __x0__ = (CreateIterResultObject undefined true)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    O["ListIteratorNextIndex"] = (+ index 1i)
    app __x2__ = (CreateIterResultObject list[index] false)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
