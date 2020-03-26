package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsPropertyReference {
  val length: Int = 1
  val func: Func = Func("""IsPropertyReference""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""HasPrimitiveBase"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EStr("""Object""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x4__"""))))))))))
  /* Beautified form:
  "IsPropertyReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (Type V["BaseValue"])
    app __x2__ = (HasPrimitiveBase V)
    if (|| (= __x1__ "Object") (= __x2__ true)) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {
      app __x4__ = (WrapCompletion false)
      return __x4__
    }
  }
  */
}
