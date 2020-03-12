package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIntrinsics {
  val length: Int = 1
  val func: Func = Func("""CreateIntrinsics""", List(Id("""realmRec""")), None, ISeq(List(ILet(Id("""intrinsics"""), EMap(Ty("""Record"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""Intrinsics""")), ERef(RefId(Id("""intrinsics""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)), ILet(Id("""objProto"""), ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ObjectPrototype""")), ERef(RefId(Id("""objProto""")))), ILet(Id("""throwerSteps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(0L)), (EStr("""step"""), ERef(RefId(Id("""INTRINSIC_ThrowTypeError"""))))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""throwerSteps"""))), EList(List()), ERef(RefId(Id("""realmRec"""))), ENull)), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""thrower"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ThrowTypeError""")), ERef(RefId(Id("""thrower""")))), ILet(Id("""noSteps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(0L)), (EStr("""step"""), ERef(RefId(Id("""EmptyFunction"""))))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""noSteps"""))), EList(List()), ERef(RefId(Id("""realmRec"""))), ERef(RefId(Id("""objProto"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""funcProto"""), ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_FunctionPrototype""")), ERef(RefId(Id("""funcProto""")))), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""thrower""")), EStr("""SetPrototypeOf"""))), List(ERef(RefId(Id("""thrower"""))), ERef(RefId(Id("""funcProto"""))))), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""AddRestrictedFunctionProperties"""))), List(ERef(RefId(Id("""funcProto"""))), ERef(RefId(Id("""realmRec"""))))), IExpr(ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""intrinsics"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "CreateIntrinsics" (realmRec) => {
    let intrinsics = (new Record("SubMap" -> (new SubMap())))
    realmRec["Intrinsics"] = intrinsics
    app __x0__ = (ObjectCreate null)
    let objProto = __x0__
    intrinsics["INTRINSIC_ObjectPrototype"] = objProto
    let throwerSteps = (new algorithm("name" -> "", "length" -> 0i, "step" -> INTRINSIC_ThrowTypeError))
    app __x1__ = (CreateBuiltinFunction throwerSteps (new []) realmRec null)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let thrower = __x1__
    intrinsics["INTRINSIC_ThrowTypeError"] = thrower
    let noSteps = (new algorithm("name" -> "", "length" -> 0i, "step" -> EmptyFunction))
    app __x2__ = (CreateBuiltinFunction noSteps (new []) realmRec objProto)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let funcProto = __x2__
    intrinsics["INTRINSIC_FunctionPrototype"] = funcProto
    app __x3__ = (thrower["SetPrototypeOf"] thrower funcProto)
    __x3__
    app __x4__ = (AddRestrictedFunctionProperties funcProto realmRec)
    __x4__
    app __x5__ = (WrapCompletion intrinsics)
    return __x5__
  }
  */
}
