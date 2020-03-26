package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvaluateNew {
  val length: Int = 2
  val func: Func = Func("""EvaluateNew""", List(Id("""constructExpr"""), Id("""arguments""")), None, ISeq(List(IAssert(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""constructExpr"""))), """NewExpression"""), EIsInstanceOf(ERef(RefId(Id("""constructExpr"""))), """MemberExpression"""))), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""arguments"""))), ERef(RefId(Id("""CONST_empty""")))), EIsInstanceOf(ERef(RefId(Id("""arguments"""))), """Arguments"""))), IAccess(Id("""__x0__"""), ERef(RefId(Id("""constructExpr"""))), EStr("""Evaluation""")), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""constructor"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""arguments"""))), ERef(RefId(Id("""CONST_empty""")))), ILet(Id("""argList"""), EList(List())), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""arguments"""))), EStr("""ArgumentListEvaluation""")), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""argList"""), ERef(RefId(Id("""__x2__"""))))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""constructor"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""constructor"""))), ERef(RefId(Id("""argList"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "EvaluateNew" (constructExpr, arguments) => {
    assert (|| (is-instance-of constructExpr NewExpression) (is-instance-of constructExpr MemberExpression))
    assert (|| (= arguments CONST_empty) (is-instance-of arguments Arguments))
    access __x0__ = (constructExpr "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let constructor = __x1__
    if (= arguments CONST_empty) let argList = (new []) else {
      access __x2__ = (arguments "ArgumentListEvaluation")
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let argList = __x2__
    }
    app __x3__ = (IsConstructor constructor)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (Construct constructor argList)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
