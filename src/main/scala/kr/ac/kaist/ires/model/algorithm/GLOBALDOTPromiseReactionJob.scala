package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseReactionJob {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.PromiseReactionJob""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""reaction"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""argument"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Capability""")))), ILet(Id("""type"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Type""")))), ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Handler""")))), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), EUndef), IIf(EBOp(OEq, ERef(RefId(Id("""type"""))), EStr("""Fulfill""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""argument"""))))), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x2__""")))))), ISeq(List(IAssert(EBOp(OEq, ERef(RefId(Id("""type"""))), EStr("""Reject"""))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""argument"""))))), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x3__"""))))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""handler"""))), EUndef, EList(List(ERef(RefId(Id("""argument"""))))))), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x4__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""promiseCapability"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""handlerResult"""))))), IAssert(EUOp(ONot, ERef(RefId(Id("""__x5__"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""handlerResult"""))))), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))), ILet(Id("""status"""), ERef(RefId(Id("""__x9__""")))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))), ILet(Id("""status"""), ERef(RefId(Id("""__x10__"""))))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "GLOBAL.PromiseReactionJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reaction = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argument = __x1__
    let promiseCapability = reaction["Capability"]
    let type = reaction["Type"]
    let handler = reaction["Handler"]
    if (= handler undefined) if (= type "Fulfill") {
      app __x2__ = (NormalCompletion argument)
      let handlerResult = __x2__
    } else {
      assert (= type "Reject")
      app __x3__ = (ThrowCompletion argument)
      let handlerResult = __x3__
    } else {
      app __x4__ = (Call handler undefined (new [argument]))
      let handlerResult = __x4__
    }
    if (= promiseCapability undefined) {
      app __x5__ = (IsAbruptCompletion handlerResult)
      assert (! __x5__)
      app __x6__ = (NormalCompletion CONST_empty)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (IsAbruptCompletion handlerResult)
    if __x8__ {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [handlerResult["Value"]]))
      let status = __x9__
    } else {
      app __x10__ = (Call promiseCapability["Resolve"] undefined (new [handlerResult["Value"]]))
      let status = __x10__
    }
    app __x11__ = (Completion status)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
