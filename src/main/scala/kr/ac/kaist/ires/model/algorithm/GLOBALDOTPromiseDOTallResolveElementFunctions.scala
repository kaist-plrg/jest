package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTallResolveElementFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Promise.allResolveElementFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""alreadyCalled"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyCalled""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyCalled""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""alreadyCalled""")), EStr("""Value""")), EBool(true)), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Index""")))), ILet(Id("""values"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Values""")))), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))), ILet(Id("""remainingElementsCount"""), ERef(RefProp(RefId(Id("""F""")), EStr("""RemainingElements""")))), IAssign(RefProp(RefId(Id("""values""")), ERef(RefId(Id("""index""")))), ERef(RefId(Id("""x""")))), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OSub, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(0L)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""values"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""valuesArray"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""valuesArray"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "GLOBAL.Promise.allResolveElementFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let alreadyCalled = F["AlreadyCalled"]
    if (= alreadyCalled["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyCalled["Value"] = true
    let index = F["Index"]
    let values = F["Values"]
    let promiseCapability = F["Capability"]
    let remainingElementsCount = F["RemainingElements"]
    values[index] = x
    remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
    if (= remainingElementsCount["Value"] 0i) {
      app __x1__ = (CreateArrayFromList values)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let valuesArray = __x1__
      app __x2__ = (Call promiseCapability["Resolve"] undefined (new [valuesArray]))
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }
  */
}
