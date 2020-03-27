package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition0PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""DefineMethod""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""object"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""methodDef"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Closure"""))), ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Key"""))))), IExpr(ERef(RefId(Id("""__x2__""")))), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Closure""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), ERef(RefId(Id("""enumerable""")))), (EStr("""Configurable"""), EBool(true))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Key"""))), ERef(RefId(Id("""desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "MethodDefinition0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, enumerable) => {
    access __x0__ = (this "DefineMethod")
    app __x1__ = (__x0__ object)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let methodDef = __x1__
    app __x2__ = (SetFunctionName methodDef["Closure"] methodDef["Key"])
    __x2__
    let desc = (new PropertyDescriptor("Value" -> methodDef["Closure"], "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x3__ = (DefinePropertyOrThrow object methodDef["Key"] desc)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
