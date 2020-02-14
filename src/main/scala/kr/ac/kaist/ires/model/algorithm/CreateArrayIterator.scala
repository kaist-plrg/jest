package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateArrayIterator {
  val length: Int = 2
  val func: Func = Func("""CreateArrayIterator""", List(Id("""array"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ArrayIteratorPrototype"""))), EList(List(EStr("""IteratedObject"""), EStr("""ArrayIteratorNextIndex"""), EStr("""ArrayIterationKind"""))))), ILet(Id("""iterator"""), ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedObject""")), ERef(RefId(Id("""array""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""ArrayIteratorNextIndex""")), EINum(0L)), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""ArrayIterationKind""")), ERef(RefId(Id("""kind""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "CreateArrayIterator" (array, kind) => {
    app __x0__ = (ObjectCreate INTRINSIC_ArrayIteratorPrototype (new ["IteratedObject", "ArrayIteratorNextIndex", "ArrayIterationKind"]))
    let iterator = __x0__
    iterator["IteratedObject"] = array
    iterator["ArrayIteratorNextIndex"] = 0i
    iterator["ArrayIterationKind"] = kind
    app __x1__ = (WrapCompletion iterator)
    return __x1__
  }
  */
}
