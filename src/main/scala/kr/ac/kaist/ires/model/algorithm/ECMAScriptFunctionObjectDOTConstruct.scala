package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ECMAScriptFunctionObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""ECMAScriptFunctionObject.Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""kind"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ObjectPrototype%"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""thisArgument"""), ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""PrepareForOrdinaryCall"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))), ILet(Id("""calleeContext"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCallBindThis"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""thisArgument"""))))), IExpr(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IAccess(Id("""__x3__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")), ILet(Id("""constructorEnv"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""constructorEnv""")), EStr("""EnvironmentRecord""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryCallEvaluateBody"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""calleeContext""")))), ISeq(List(IAssign(RefId(Id("""__x5__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x5__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""thisArgument"""))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), EUndef)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""result"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""result"""))))))), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))))
  /* Beautified form:
  "ECMAScriptFunctionObject.Construct" (F, argumentsList, newTarget) => {
    let callerContext = GLOBAL_context
    let kind = F["ConstructorKind"]
    if (= kind "base") {
      app __x0__ = (OrdinaryCreateFromConstructor newTarget "%ObjectPrototype%")
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let thisArgument = __x0__
    } else {}
    app __x1__ = (PrepareForOrdinaryCall F newTarget)
    let calleeContext = __x1__
    if (= kind "base") {
      app __x2__ = (OrdinaryCallBindThis F calleeContext thisArgument)
      __x2__
    } else {}
    access __x3__ = (calleeContext "LexicalEnvironment")
    let constructorEnv = __x3__
    let envRec = constructorEnv["EnvironmentRecord"]
    app __x4__ = (OrdinaryCallEvaluateBody F argumentsList)
    let result = __x4__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x5__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x5__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    if (= result["Type"] CONST_return) {
      app __x6__ = (Type result["Value"])
      if (= __x6__ Object) {
        app __x7__ = (NormalCompletion result["Value"])
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
      if (= kind "base") {
        app __x9__ = (NormalCompletion thisArgument)
        app __x10__ = (WrapCompletion __x9__)
        return __x10__
      } else {}
      if (! (= result["Value"] undefined)) {
        app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x11__
      } else {}
    } else {
      if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else return result else {}
      result
    }
    app __x12__ = (envRec["GetThisBinding"] envRec)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
