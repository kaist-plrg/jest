package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsPropertyReference {
  val length: Int = 1
  val func: Func = Func("""IsPropertyReference""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""HasPrimitiveBase"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EStr("""Object""")), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x3__"""))))))))))
  /* Beautified form:
  "IsPropertyReference" (V) => {
    app __x0__ = (Type V["BaseValue"])
    app __x1__ = (HasPrimitiveBase V)
    if (|| (= __x0__ "Object") (= __x1__ true)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion false)
      return __x3__
    }
  }
  */
}
