package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetIdentifierReference {
  val length: Int = 3
  val func: Func = Func("""GetIdentifierReference""", List(Id("""lex"""), Id("""name"""), Id("""strict""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""lex"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), EUndef), (EStr("""ReferencedName"""), ERef(RefId(Id("""name""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""EnvironmentRecord""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""exists"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""envRec""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""name""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(ILet(Id("""outer"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""Outer""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetIdentifierReference"""))), List(ERef(RefId(Id("""outer"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""strict"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__"""))))))))))
  /* Beautified form:
  "GetIdentifierReference" (lex, name, strict) => {
    if (= lex null) {
      app __x0__ = (WrapCompletion (new Reference("BaseValue" -> undefined, "ReferencedName" -> name, "StrictReference" -> strict)))
      return __x0__
    } else {}
    let envRec = lex["EnvironmentRecord"]
    app __x1__ = (envRec["HasBinding"] envRec name)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let exists = __x1__
    if (= exists true) {
      app __x2__ = (WrapCompletion (new Reference("BaseValue" -> envRec, "ReferencedName" -> name, "StrictReference" -> strict)))
      return __x2__
    } else {
      let outer = lex["Outer"]
      app __x3__ = (GetIdentifierReference outer name strict)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    }
  }
  */
}
