package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetSuperConstructor {
  val length: Int = 0
  val func: Func = Func("""GetSuperConstructor""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()), ILet(Id("""envRec"""), ERef(RefId(Id("""__x0__""")))), IAssert(EBOp(OEq, ETypeOf(ERef(RefId(Id("""envRec""")))), EStr("""FunctionEnvironmentRecord"""))), ILet(Id("""activeFunction"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""FunctionObject""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""activeFunction""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""activeFunction"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""superConstructor"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""superConstructor"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""superConstructor"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "GetSuperConstructor" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    assert (= (typeof envRec) "FunctionEnvironmentRecord")
    let activeFunction = envRec["FunctionObject"]
    app __x1__ = (activeFunction["GetPrototypeOf"] activeFunction)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let superConstructor = __x1__
    app __x2__ = (IsConstructor superConstructor)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion superConstructor)
    return __x4__
  }
  */
}
