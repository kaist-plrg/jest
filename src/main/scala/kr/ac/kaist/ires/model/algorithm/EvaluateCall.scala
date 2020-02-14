package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvaluateCall {
  val length: Int = 4
  val func: Func = Func("""EvaluateCall""", List(Id("""func"""), Id("""ref"""), Id("""arguments"""), Id("""tailPosition""")), None, ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""ref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""ref"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""ref""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetThisValue"""))), List(ERef(RefId(Id("""ref"""))))), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))), ILet(Id("""refEnv"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""refEnv""")), EStr("""WithBaseObject"""))), List(ERef(RefId(Id("""refEnv"""))))), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x4__"""))))))))), ILet(Id("""thisValue"""), EUndef)), IAccess(Id("""__x5__"""), ERef(RefId(Id("""arguments"""))), EStr("""ArgumentListEvaluation""")), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""argList"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""func"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""tailPosition"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""PrepareForTailCall"""))), List()), IExpr(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""thisValue"""))), ERef(RefId(Id("""argList"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x11__""")))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "EvaluateCall" (func, ref, arguments, tailPosition) => {
    if (= (typeof ref) "Completion") if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x0__ = (Type ref)
    if (= __x0__ Reference) {
      app __x1__ = (IsPropertyReference ref)
      if (= __x1__ true) {
        app __x2__ = (GetThisValue ref)
        let thisValue = __x2__
      } else {
        app __x3__ = (GetBase ref)
        let refEnv = __x3__
        app __x4__ = (refEnv["WithBaseObject"] refEnv)
        let thisValue = __x4__
      }
    } else let thisValue = undefined
    access __x5__ = (arguments "ArgumentListEvaluation")
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let argList = __x5__
    app __x6__ = (Type func)
    if (! (= __x6__ Object)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (IsCallable func)
    if (= __x8__ false) {
      app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x9__
    } else {}
    if (= tailPosition true) {
      app __x10__ = (PrepareForTailCall )
      __x10__
    } else {}
    app __x11__ = (Call func thisValue argList)
    let result = __x11__
    app __x12__ = (WrapCompletion result)
    return __x12__
  }
  */
}
