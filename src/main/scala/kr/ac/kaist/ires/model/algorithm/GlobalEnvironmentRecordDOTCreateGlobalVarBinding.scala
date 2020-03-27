package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTCreateGlobalVarBinding {
  val length: Int = 2
  val func: Func = Func("""GlobalEnvironmentRecord.CreateGlobalVarBinding""", List(Id("""this"""), Id("""N"""), Id("""D""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""hasProperty"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""globalObject"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""extensible"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""hasProperty"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(true))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""D"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), EUndef)), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""varDeclaredNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""varDeclaredNames"""))), ERef(RefId(Id("""N"""))))), IAppend(ERef(RefId(Id("""N"""))), ERef(RefId(Id("""varDeclaredNames""")))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "GlobalEnvironmentRecord.CreateGlobalVarBinding" (this, N, D) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (HasOwnProperty globalObject N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasProperty = __x0__
    app __x1__ = (IsExtensible globalObject)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    if (&& (= hasProperty false) (= extensible true)) {
      app __x2__ = (ObjRec["CreateMutableBinding"] ObjRec N D)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (ObjRec["InitializeBinding"] ObjRec N undefined)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    let varDeclaredNames = envRec["VarNames"]
    if (! (contains varDeclaredNames N)) append N -> varDeclaredNames else {}
    app __x4__ = (NormalCompletion CONST_empty)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
