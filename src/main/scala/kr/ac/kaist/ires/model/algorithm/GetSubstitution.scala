package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetSubstitution {
  val length: Int = 6
  val func: Func = Func("""GetSubstitution""", List(Id("""matched"""), Id("""str"""), Id("""position"""), Id("""captures"""), Id("""namedCaptures"""), Id("""replacement""")), None, ISeq(List(ILet(Id("""matchLength"""), ERef(RefProp(RefId(Id("""matched""")), EStr("""length""")))), ILet(Id("""stringLength"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""matchLength"""))))), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""captures""")), EStr("""length""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""namedCaptures"""))), EUndef)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""namedCaptures"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IAssign(RefId(Id("""namedCaptures""")), ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "GetSubstitution" (matched, str, position, captures, namedCaptures, replacement) => {
    let matchLength = matched["length"]
    let stringLength = str["length"]
    let tailPos = (+ position matchLength)
    let m = captures["length"]
    if (! (= namedCaptures undefined)) {
      app __x0__ = (ToObject namedCaptures)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      namedCaptures = __x0__
    } else {}
    !!! "Etc"
    app __x1__ = (WrapCompletion result)
    return __x1__
  }
  */
}
