package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PromiseResolveThenableJob {
  val length: Int = 3
  val func: Func = Func("""PromiseResolveThenableJob""", List(Id("""promiseToResolve"""), Id("""thenable"""), Id("""then""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateResolvingFunctions"""))), List(ERef(RefId(Id("""promiseToResolve"""))))), ILet(Id("""resolvingFunctions"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""then"""))), ERef(RefId(Id("""thenable"""))), EList(List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))))))), ILet(Id("""thenCallResult"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""thenCallResult"""))))), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""thenCallResult""")), EStr("""Value"""))))))), ILet(Id("""status"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""thenCallResult"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "PromiseResolveThenableJob" (promiseToResolve, thenable, then) => {
    app __x0__ = (CreateResolvingFunctions promiseToResolve)
    let resolvingFunctions = __x0__
    app __x1__ = (Call then thenable (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let thenCallResult = __x1__
    app __x2__ = (IsAbruptCompletion thenCallResult)
    if __x2__ {
      app __x3__ = (Call resolvingFunctions["Reject"] undefined (new [thenCallResult["Value"]]))
      let status = __x3__
      app __x4__ = (Completion status)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Completion thenCallResult)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
