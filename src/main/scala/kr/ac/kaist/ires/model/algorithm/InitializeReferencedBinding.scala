package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeReferencedBinding {
  val length: Int = 2
  val func: Func = Func("""InitializeReferencedBinding""", List(Id("""V"""), Id("""W""")), None, ISeq(List(IIf(EIsCompletion(ERef(RefId(Id("""V""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""V""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""V"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""V""")))), IIf(EIsCompletion(ERef(RefId(Id("""W""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""W""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""W""")), ERef(RefProp(RefId(Id("""W""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""W"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""W""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))), ILet(Id("""base"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""W"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "InitializeReferencedBinding" (V, W) => {
    if (is-completion V) if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    if (is-completion W) if (= W["Type"] CONST_normal) W = W["Value"] else return W else {}
    W
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (IsUnresolvableReference V)
    assert (= __x1__ false)
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (GetReferencedName V)
    app __x4__ = (base["InitializeBinding"] base __x3__ W)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
