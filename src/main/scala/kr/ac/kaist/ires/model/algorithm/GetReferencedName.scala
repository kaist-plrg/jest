package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetReferencedName {
  val length: Int = 1
  val func: Func = Func("""GetReferencedName""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""ReferencedName"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "GetReferencedName" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (WrapCompletion V["ReferencedName"])
    return __x1__
  }
  */
}
