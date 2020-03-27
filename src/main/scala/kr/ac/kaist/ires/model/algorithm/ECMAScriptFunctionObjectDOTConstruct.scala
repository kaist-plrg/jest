package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ECMAScriptFunctionObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""ECMAScriptFunctionObject.Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""newTarget"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""kind"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ObjectPrototype%"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""thisArgument"""), ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""PrepareForOrdinaryCall"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))), ILet(Id("""calleeContext"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryCallBindThis"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""thisArgument"""))))), IExpr(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IAccess(Id("""__x4__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")), ILet(Id("""constructorEnv"""), ERef(RefId(Id("""__x4__""")))), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""constructorEnv""")), EStr("""EnvironmentRecord""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""OrdinaryCallEvaluateBody"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""calleeContext""")))), ISeq(List(IAssign(RefId(Id("""__x6__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x6__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""thisArgument"""))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), EUndef)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())))), ISeq(List(IIf(EIsCompletion(ERef(RefId(Id("""result""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""result"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""result"""))))))), IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))))
  /* Beautified form:
  "ECMAScriptFunctionObject.Construct" (F, argumentsList, newTarget) => {
    app __x0__ = (Type newTarget)
    assert (= __x0__ Object)
    let callerContext = GLOBAL_context
    let kind = F["ConstructorKind"]
    if (= kind "base") {
      app __x1__ = (OrdinaryCreateFromConstructor newTarget "%ObjectPrototype%")
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let thisArgument = __x1__
    } else {}
    app __x2__ = (PrepareForOrdinaryCall F newTarget)
    let calleeContext = __x2__
    if (= kind "base") {
      app __x3__ = (OrdinaryCallBindThis F calleeContext thisArgument)
      __x3__
    } else {}
    access __x4__ = (calleeContext "LexicalEnvironment")
    let constructorEnv = __x4__
    let envRec = constructorEnv["EnvironmentRecord"]
    app __x5__ = (OrdinaryCallEvaluateBody F argumentsList)
    let result = __x5__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x6__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x6__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    if (= result["Type"] CONST_return) {
      app __x7__ = (Type result["Value"])
      if (= __x7__ Object) {
        app __x8__ = (NormalCompletion result["Value"])
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      if (= kind "base") {
        app __x10__ = (NormalCompletion thisArgument)
        app __x11__ = (WrapCompletion __x10__)
        return __x11__
      } else {}
      if (! (= result["Value"] undefined)) {
        app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x12__
      } else {}
    } else {
      if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else return result else {}
      result
    }
    app __x13__ = (envRec["GetThisBinding"] envRec)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }
  */
}
