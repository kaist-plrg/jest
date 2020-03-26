package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SuperCall0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SuperCall0Evaluation0""", List(Id("""this"""), Id("""Arguments""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetNewTarget"""))), List()), ILet(Id("""newTarget"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""newTarget"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetSuperConstructor"""))), List()), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""func"""), ERef(RefId(Id("""__x2__""")))), IAccess(Id("""__x3__"""), ERef(RefId(Id("""Arguments"""))), EStr("""ArgumentListEvaluation""")), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""argList"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""argList"""))), ERef(RefId(Id("""newTarget"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()), ILet(Id("""thisER"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""thisER""")), EStr("""BindThisValue"""))), List(ERef(RefId(Id("""thisER"""))), ERef(RefId(Id("""result"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "SuperCall0Evaluation0" (this, Arguments) => {
    app __x0__ = (GetNewTarget )
    let newTarget = __x0__
    app __x1__ = (Type newTarget)
    assert (= __x1__ Object)
    app __x2__ = (GetSuperConstructor )
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let func = __x2__
    access __x3__ = (Arguments "ArgumentListEvaluation")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let argList = __x3__
    app __x4__ = (Construct func argList newTarget)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let result = __x4__
    app __x5__ = (GetThisEnvironment )
    let thisER = __x5__
    app __x6__ = (thisER["BindThisValue"] thisER result)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
