package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForDeclaration0BindingInstantiation0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0BindingInstantiation0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding"""), Id("""environment""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""environment""")), EStr("""EnvironmentRecord""")))), IAssert(EBOp(OEq, ETypeOf(ERef(RefId(Id("""envRec""")))), EStr("""DeclarativeEnvironmentRecord"""))), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""__x2__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IAccess(Id("""__x3__"""), ERef(RefId(Id("""LetOrConst"""))), EStr("""IsConstantDeclaration""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x4__""")))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x5__"""))))))), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L)))))))))
  /* Beautified form:
  "ForDeclaration0BindingInstantiation0" (this, LetOrConst, ForBinding, environment) => {
    let envRec = environment["EnvironmentRecord"]
    assert (= (typeof envRec) "DeclarativeEnvironmentRecord")
    access __x0__ = (ForBinding "BoundNames")
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let name = __x1__[__x2__]
      access __x3__ = (LetOrConst "IsConstantDeclaration")
      if (= __x3__ true) {
        app __x4__ = (envRec["CreateImmutableBinding"] envRec name true)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      } else {
        app __x5__ = (envRec["CreateMutableBinding"] envRec name false)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      }
      __x2__ = (+ __x2__ 1i)
    }
  }
  */
}
