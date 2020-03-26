package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeMethod {
  val length: Int = 2
  val func: Func = Func("""MakeMethod""", List(Id("""F"""), Id("""homeObject""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""homeObject"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IAssign(RefProp(RefId(Id("""F""")), EStr("""HomeObject""")), ERef(RefId(Id("""homeObject""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "MakeMethod" (F, homeObject) => {
    app __x0__ = (Type homeObject)
    assert (= __x0__ Object)
    F["HomeObject"] = homeObject
    app __x1__ = (NormalCompletion undefined)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
