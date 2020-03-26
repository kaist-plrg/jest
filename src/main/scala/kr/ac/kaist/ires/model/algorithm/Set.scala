package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Set {
  val length: Int = 4
  val func: Func = Func("""Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Throw""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""Throw"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Boolean"""))))), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""success"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""success"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""Throw"""))), EBool(true))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""success"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "Set" (O, P, V, Throw) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (IsPropertyKey P)
    assert (= __x1__ true)
    app __x2__ = (Type Throw)
    assert (= __x2__ Boolean)
    app __x3__ = (O["Set"] O P V O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let success = __x3__
    if (&& (= success false) (= Throw true)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion success)
    return __x5__
  }
  */
}
