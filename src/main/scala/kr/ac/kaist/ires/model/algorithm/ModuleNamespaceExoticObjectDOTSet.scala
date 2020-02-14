package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""ModuleNamespaceExoticObject.Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ModuleNamespaceExoticObject.Set" (O, P, V, Receiver) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
