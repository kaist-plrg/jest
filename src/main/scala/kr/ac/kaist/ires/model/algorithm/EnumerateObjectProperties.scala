package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnumerateObjectProperties {
  val length: Int = 1
  val func: Func = Func("""EnumerateObjectProperties""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""EnumerateObjectPropertiesHelper"""))), List(ERef(RefId(Id("""O"""))), EList(List()), EList(List()))), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateListIteratorRecord"""))), List(ERef(RefId(Id("""__x0__"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "EnumerateObjectProperties" (O) => {
    app __x0__ = (EnumerateObjectPropertiesHelper O (new []) (new []))
    app __x1__ = (CreateListIteratorRecord __x0__)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
