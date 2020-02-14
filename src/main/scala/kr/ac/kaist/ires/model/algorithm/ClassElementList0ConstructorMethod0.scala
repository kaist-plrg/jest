package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0ConstructorMethod0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0ConstructorMethod0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(ERef(RefId(Id("""CONST_empty""")))), ISeq(List())), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(ERef(RefId(Id("""CONST_empty""")))), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EStr("""constructor"""))), IReturn(ERef(RefId(Id("""CONST_empty""")))), ISeq(List())), IReturn(ERef(RefId(Id("""ClassElement""")))))))
  /* Beautified form:
  "ClassElementList0ConstructorMethod0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x0__ = (ClassElement "IsStatic")
    if (= __x0__ true) return CONST_empty else {}
    access __x1__ = (ClassElement "PropName")
    if (! (= __x1__ "constructor")) return CONST_empty else {}
    return ClassElement
  }
  */
}
