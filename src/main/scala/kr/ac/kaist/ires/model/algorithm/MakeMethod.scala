package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeMethod {
  val length: Int = 2
  val func: Func = Func("""MakeMethod""", List(Id("""F"""), Id("""homeObject""")), None, ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""HomeObject""")), ERef(RefId(Id("""homeObject""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "MakeMethod" (F, homeObject) => {
    F["HomeObject"] = homeObject
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
