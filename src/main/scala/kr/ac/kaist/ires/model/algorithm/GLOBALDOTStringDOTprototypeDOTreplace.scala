package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTreplace {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.replace""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""searchValue"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""replaceValue"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""searchValue"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""searchValue"""))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""searchValue"""))), ERef(RefId(Id("""SYMBOL_replace"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""replacer"""), ERef(RefId(Id("""__x3__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""replacer"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""replacer"""))), ERef(RefId(Id("""searchValue"""))), EList(List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""replaceValue"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""string"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""searchString"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""replaceValue"""))))), ILet(Id("""functionalReplace"""), ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""functionalReplace"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""replaceValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IAssign(RefId(Id("""replaceValue""")), ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, ERef(RefId(Id("""functionalReplace"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""replaceValue"""))), EUndef, EList(List(ERef(RefId(Id("""matched"""))), ERef(RefId(Id("""pos"""))), ERef(RefId(Id("""string"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""replValue"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""replValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""replStr"""), ERef(RefId(Id("""__x11__""")))))), ISeq(List(ILet(Id("""captures"""), EList(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""GetSubstitution"""))), List(ERef(RefId(Id("""matched"""))), ERef(RefId(Id("""string"""))), ERef(RefId(Id("""pos"""))), ERef(RefId(Id("""captures"""))), EUndef, ERef(RefId(Id("""replaceValue"""))))), ILet(Id("""replStr"""), ERef(RefId(Id("""__x12__"""))))))), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""pos"""))), ERef(RefProp(RefId(Id("""matched""")), EStr("""length"""))))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newString"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))))
  /* Beautified form:
  "GLOBAL.String.prototype.replace" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchValue = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let replaceValue = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= searchValue undefined) (= searchValue null))) {
      app __x3__ = (GetMethod searchValue SYMBOL_replace)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let replacer = __x3__
      if (! (= replacer undefined)) {
        app __x4__ = (Call replacer searchValue (new [O, replaceValue]))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let string = __x6__
    app __x7__ = (ToString searchValue)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let searchString = __x7__
    app __x8__ = (IsCallable replaceValue)
    let functionalReplace = __x8__
    if (= functionalReplace false) {
      app __x9__ = (ToString replaceValue)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      replaceValue = __x9__
    } else {}
    !!! "Etc"
    if (= functionalReplace true) {
      app __x10__ = (Call replaceValue undefined (new [matched, pos, string]))
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let replValue = __x10__
      app __x11__ = (ToString replValue)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let replStr = __x11__
    } else {
      let captures = (new [])
      app __x12__ = (GetSubstitution matched string pos captures undefined replaceValue)
      let replStr = __x12__
    }
    let tailPos = (+ pos matched["length"])
    !!! "Etc"
    app __x13__ = (WrapCompletion newString)
    return __x13__
  }
  */
}
