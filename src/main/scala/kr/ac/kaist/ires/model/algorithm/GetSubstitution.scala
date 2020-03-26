package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetSubstitution {
  val length: Int = 6
  val func: Func = Func("""GetSubstitution""", List(Id("""matched"""), Id("""str"""), Id("""position"""), Id("""captures"""), Id("""namedCaptures"""), Id("""replacement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""matched"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ILet(Id("""matchLength"""), ERef(RefProp(RefId(Id("""matched""")), EStr("""length""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""str"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String"""))))), ILet(Id("""stringLength"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))), IAssert(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""stringLength"""))), ERef(RefId(Id("""position""")))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""replacement"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""String"""))))), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""matchLength"""))))), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""captures""")), EStr("""length""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""namedCaptures"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""namedCaptures"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IAssign(RefId(Id("""namedCaptures""")), ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "GetSubstitution" (matched, str, position, captures, namedCaptures, replacement) => {
    app __x0__ = (Type matched)
    assert (= __x0__ String)
    let matchLength = matched["length"]
    app __x1__ = (Type str)
    assert (= __x1__ String)
    let stringLength = str["length"]
    assert (! (< stringLength position))
    app __x2__ = (Type replacement)
    assert (= __x2__ String)
    let tailPos = (+ position matchLength)
    let m = captures["length"]
    if (! (= namedCaptures undefined)) {
      app __x3__ = (ToObject namedCaptures)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      namedCaptures = __x3__
    } else {}
    !!! "Etc"
    app __x4__ = (WrapCompletion result)
    return __x4__
  }
  */
}
