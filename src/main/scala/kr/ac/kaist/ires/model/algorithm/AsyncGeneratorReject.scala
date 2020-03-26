package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorReject {
  val length: Int = 2
  val func: Func = Func("""AsyncGeneratorReject""", List(Id("""generator"""), Id("""exception""")), None, ISeq(List(ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))), IAssert(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""queue""")), EStr("""length"""))))), ILet(Id("""next"""), EPop(ERef(RefId(Id("""queue"""))), EINum(0L))), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Capability""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""exception"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "AsyncGeneratorReject" (generator, exception) => {
    let queue = generator["AsyncGeneratorQueue"]
    assert (< 0i queue["length"])
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x0__ = (Call promiseCapability["Reject"] undefined (new [exception]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (AsyncGeneratorResumeNext generator)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion undefined)
    return __x2__
  }
  */
}
