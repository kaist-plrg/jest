package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""status"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(true)), ISeq(List(ILet(Id("""varNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))), ILet(Id("""__x5__"""), EINum(0L)), ILet(Id("""__x6__"""), ERef(RefProp(RefId(Id("""varNames""")), EStr("""length""")))), IWhile(EBOp(OAnd, EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""__x6__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""varNames""")), ERef(RefId(Id("""__x5__"""))))), ERef(RefId(Id("""N""")))))), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L)))), IIf(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""__x6__""")))), IExpr(EPop(ERef(RefId(Id("""varNames"""))), ERef(RefId(Id("""__x5__"""))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""status"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GlobalEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["DeleteBinding"] DclRec N)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x3__ = (HasOwnProperty globalObject N)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let existingProp = __x3__
    if (= existingProp true) {
      app __x4__ = (ObjRec["DeleteBinding"] ObjRec N)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let status = __x4__
      if (= status true) {
        let varNames = envRec["VarNames"]
        let __x5__ = 0i
        let __x6__ = varNames["length"]
        while (&& (< __x5__ __x6__) (! (= varNames[__x5__] N))) __x5__ = (+ __x5__ 1i)
        if (< __x5__ __x6__) (pop varNames __x5__) else {}
      } else {}
      app __x7__ = (WrapCompletion status)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion true)
    return __x8__
  }
  */
}
