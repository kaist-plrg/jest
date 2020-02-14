package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0PrototypePropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0PrototypePropertyNameList0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(EList(List())), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EList(List())), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")), IReturn(EList(List(ERef(RefId(Id("""__x2__""")))))))))
  /* Beautified form:
  "ClassElementList0PrototypePropertyNameList0" (this, ClassElement) => {
    access __x0__ = (ClassElement "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return (new []) else {}
    access __x2__ = (ClassElement "PropName")
    return (new [__x2__])
  }
  */
}
