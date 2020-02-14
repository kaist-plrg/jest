package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition0DefineMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0DefineMethod0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody"""), Id("""object"""), Id("""functionPrototype""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""propKey"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""propKey""")))), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""functionPrototype"""))), EAbsent)), ISeq(List(ILet(Id("""kind"""), ERef(RefId(Id("""CONST_Normal""")))), ILet(Id("""prototype"""), ERef(RefId(Id("""functionPrototype""")))))), ISeq(List(ILet(Id("""kind"""), ERef(RefId(Id("""CONST_Method""")))), ILet(Id("""prototype"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype"""))))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""UniqueFormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))), ERef(RefId(Id("""prototype"""))))), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeMethod"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""object"""))))), IExpr(ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""propKey""")))), (EStr("""Closure"""), ERef(RefId(Id("""closure""")))))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "MethodDefinition0DefineMethod0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, functionPrototype) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    if (! (= functionPrototype absent)) {
      let kind = CONST_Normal
      let prototype = functionPrototype
    } else {
      let kind = CONST_Method
      let prototype = INTRINSIC_FunctionPrototype
    }
    app __x1__ = (FunctionCreate kind UniqueFormalParameters FunctionBody scope prototype)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion (new Record("Key" -> propKey, "Closure" -> closure)))
    return __x3__
  }
  */
}
