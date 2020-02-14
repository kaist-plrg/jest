package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTPreventExtensions {
  val length: Int = 0
  val func: Func = Func("""ModuleNamespaceExoticObject.PreventExtensions""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ModuleNamespaceExoticObject.PreventExtensions" (O) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
