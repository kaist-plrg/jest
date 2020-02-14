package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeReferencedBinding {
  val length: Int = 2
  val func: Func = Func("""InitializeReferencedBinding""", List(Id("""V"""), Id("""W""")), None, ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""V""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""V""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""V"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""V""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""W""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""W""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""W""")), ERef(RefProp(RefId(Id("""W""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""W"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""W""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))), ILet(Id("""base"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""W"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "InitializeReferencedBinding" (V, W) => {
    if (= (typeof V) "Completion") if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    if (= (typeof W) "Completion") if (= W["Type"] CONST_normal) W = W["Value"] else return W else {}
    W
    app __x0__ = (GetBase V)
    let base = __x0__
    app __x1__ = (GetReferencedName V)
    app __x2__ = (base["InitializeBinding"] base __x1__ W)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
