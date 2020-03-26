package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGetOwnProperty {
  val length: Int = 2
  val func: Func = Func("""OrdinaryGetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(EUOp(ONot, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P"""))))), EAbsent))), IReturn(EUndef), ISeq(List())), ILet(Id("""D"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), ILet(Id("""X"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""X"""))))), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""D""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Value""")))), IAssign(RefProp(RefId(Id("""D""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Writable""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""X"""))))), IAssert(ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""D""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Get""")))), IAssign(RefProp(RefId(Id("""D""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Set"""))))))), IAssign(RefProp(RefId(Id("""D""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Enumerable""")))), IAssign(RefProp(RefId(Id("""D""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Configurable""")))), IReturn(ERef(RefId(Id("""D""")))))))
  /* Beautified form:
  "OrdinaryGetOwnProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (! (! (= O["SubMap"][P] absent))) return undefined else {}
    let D = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    let X = O["SubMap"][P]
    app __x1__ = (IsDataDescriptor X)
    if __x1__ {
      D["Value"] = X["Value"]
      D["Writable"] = X["Writable"]
    } else {
      app __x2__ = (IsAccessorDescriptor X)
      assert __x2__
      D["Get"] = X["Get"]
      D["Set"] = X["Set"]
    }
    D["Enumerable"] = X["Enumerable"]
    D["Configurable"] = X["Configurable"]
    return D
  }
  */
}
