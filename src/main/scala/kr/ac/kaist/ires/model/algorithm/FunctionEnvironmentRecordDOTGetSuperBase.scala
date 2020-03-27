package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTGetSuperBase {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.GetSuperBase""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))), ILet(Id("""home"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject""")))), IIf(EBOp(OEq, ERef(RefId(Id("""home"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""home"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""home""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""home"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "FunctionEnvironmentRecord.GetSuperBase" (this) => {
    let envRec = this
    let home = envRec["HomeObject"]
    if (= home undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app __x1__ = (Type home)
    assert (= __x1__ Object)
    app __x2__ = (home["GetPrototypeOf"] home)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
