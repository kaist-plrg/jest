package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""ModuleNamespaceExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""exports"""), ECopy(ERef(RefProp(RefId(Id("""O""")), EStr("""Exports"""))))), IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryOwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""symbolKeys"""), ERef(RefId(Id("""__x0__""")))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""exports"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ModuleNamespaceExoticObject.OwnPropertyKeys" (O) => {
    let exports = (copy-obj O["Exports"])
    app __x0__ = (OrdinaryOwnPropertyKeys O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let symbolKeys = __x0__
    !!! "Etc"
    app __x1__ = (WrapCompletion exports)
    return __x1__
  }
  */
}
