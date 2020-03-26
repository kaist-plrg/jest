package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewFunctionEnvironment {
  val length: Int = 2
  val func: Func = Func("""NewFunctionEnvironment""", List(Id("""F"""), Id("""newTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""newTarget"""))))), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Undefined""")))), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))))), ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), ILet(Id("""envRec"""), EMap(Ty("""FunctionEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""FunctionObject""")), ERef(RefId(Id("""F""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""ThisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""lexical""")), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""uninitialized"""))), ILet(Id("""home"""), ERef(RefProp(RefId(Id("""F""")), EStr("""HomeObject""")))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject""")), ERef(RefId(Id("""home""")))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""NewTarget""")), ERef(RefId(Id("""newTarget""")))), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefProp(RefId(Id("""F""")), EStr("""Environment""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "NewFunctionEnvironment" (F, newTarget) => {
    app __x0__ = (Type newTarget)
    assert (|| (= __x0__ Undefined) (= __x0__ Object))
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new FunctionEnvironmentRecord("SubMap" -> (new SubMap())))
    envRec["FunctionObject"] = F
    if (= F["ThisMode"] CONST_lexical) envRec["ThisBindingStatus"] = "lexical" else envRec["ThisBindingStatus"] = "uninitialized"
    let home = F["HomeObject"]
    envRec["HomeObject"] = home
    envRec["NewTarget"] = newTarget
    env["EnvironmentRecord"] = envRec
    env["Outer"] = F["Environment"]
    app __x1__ = (WrapCompletion env)
    return __x1__
  }
  */
}
