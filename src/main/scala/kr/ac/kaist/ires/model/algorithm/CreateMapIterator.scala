package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMapIterator {
  val length: Int = 2
  val func: Func = Func("""CreateMapIterator""", List(Id("""map"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""map"""))), EStr("""MapData"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_MapIteratorPrototype"""))), EList(List(EStr("""Map"""), EStr("""MapNextIndex"""), EStr("""MapIterationKind"""))))), ILet(Id("""iterator"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""Map""")), ERef(RefId(Id("""map""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""MapNextIndex""")), EINum(0L)), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""MapIterationKind""")), ERef(RefId(Id("""kind""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "CreateMapIterator" (map, kind) => {
    app __x0__ = (RequireInternalSlot map "MapData")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (ObjectCreate INTRINSIC_MapIteratorPrototype (new ["Map", "MapNextIndex", "MapIterationKind"]))
    let iterator = __x1__
    iterator["Map"] = map
    iterator["MapNextIndex"] = 0i
    iterator["MapIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }
  */
}
