package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnumerateObjectProperties {
  val length: Int = 1
  val func: Func = Func("""EnumerateObjectProperties""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""EnumerateObjectPropertiesHelper"""))), List(ERef(RefId(Id("""O"""))), EList(List()), EList(List()))), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateListIteratorRecord"""))), List(ERef(RefId(Id("""__x1__"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "EnumerateObjectProperties" (O) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (EnumerateObjectPropertiesHelper O (new []) (new []))
    app __x2__ = (CreateListIteratorRecord __x1__)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
