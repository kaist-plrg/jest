package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""StringExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())), ILet(Id("""str"""), ERef(RefProp(RefId(Id("""O""")), EStr("""StringData""")))), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "StringExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let str = O["StringData"]
    let len = str["length"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }
  */
}
