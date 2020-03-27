package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryCreateFromConstructor {
  val length: Int = 2
  val func: Func = Func("""OrdinaryCreateFromConstructor""", List(Id("""constructor"""), Id("""intrinsicDefaultProto"""), Id("""internalSlotsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""constructor"""))), ERef(RefId(Id("""intrinsicDefaultProto"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""proto"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""proto"""))), ERef(RefId(Id("""internalSlotsList"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "OrdinaryCreateFromConstructor" (constructor, intrinsicDefaultProto, internalSlotsList) => {
    app __x0__ = (GetPrototypeFromConstructor constructor intrinsicDefaultProto)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (ObjectCreate proto internalSlotsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
