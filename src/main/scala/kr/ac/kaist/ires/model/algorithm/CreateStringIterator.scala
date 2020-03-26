package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateStringIterator {
  val length: Int = 1
  val func: Func = Func("""CreateStringIterator""", List(Id("""string""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""string"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_StringIteratorPrototype"""))), EList(List(EStr("""IteratedString"""), EStr("""StringIteratorNextIndex"""))))), ILet(Id("""iterator"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedString""")), ERef(RefId(Id("""string""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""StringIteratorNextIndex""")), EINum(0L)), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "CreateStringIterator" (string) => {
    app __x0__ = (Type string)
    assert (= __x0__ String)
    app __x1__ = (ObjectCreate INTRINSIC_StringIteratorPrototype (new ["IteratedString", "StringIteratorNextIndex"]))
    let iterator = __x1__
    iterator["IteratedString"] = string
    iterator["StringIteratorNextIndex"] = 0i
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }
  */
}
