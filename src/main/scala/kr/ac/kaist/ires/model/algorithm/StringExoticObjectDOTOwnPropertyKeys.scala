package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""StringExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())), ILet(Id("""str"""), ERef(RefProp(RefId(Id("""O""")), EStr("""StringData""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""str"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "StringExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let str = O["StringData"]
    app __x0__ = (Type str)
    assert (= __x0__ String)
    let len = str["length"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x1__ = (WrapCompletion keys)
    return __x1__
  }
  */
}
