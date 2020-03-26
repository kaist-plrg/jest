package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ListIteratornext {
  val length: Int = 0
  val func: Func = Func("""ListIteratornext""", List(Id("""this""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IAssert(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedList"""))), EAbsent))), ILet(Id("""list"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedList""")))), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")))), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""list""")), EStr("""length""")))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""list""")), ERef(RefId(Id("""index"""))))), EBool(false))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "ListIteratornext" (this) => {
    let O = this
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    assert (! (= O["IteratedList"] absent))
    let list = O["IteratedList"]
    let index = O["ListIteratorNextIndex"]
    let len = list["length"]
    if (! (< index len)) {
      app __x1__ = (CreateIterResultObject undefined true)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    O["ListIteratorNextIndex"] = (+ index 1i)
    app __x3__ = (CreateIterResultObject list[index] false)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
