package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetOwnPropertyKeys {
  val length: Int = 2
  val func: Func = Func("""GetOwnPropertyKeys""", List(Id("""O"""), Id("""type""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""obj"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""keys"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""nameList"""), EList(List())), ILet(Id("""__x2__"""), ERef(RefId(Id("""keys""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""nextKey"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""type""")))), IAppend(ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""nameList""")))), ISeq(List())), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""nameList"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "GetOwnPropertyKeys" (O, type) => {
    app __x0__ = (ToObject O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let obj = __x0__
    app __x1__ = (obj["OwnPropertyKeys"] obj)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let keys = __x1__
    let nameList = (new [])
    let __x2__ = keys
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let nextKey = __x2__[__x3__]
      app __x4__ = (Type nextKey)
      if (= __x4__ type) append nextKey -> nameList else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x5__ = (CreateArrayFromList nameList)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
