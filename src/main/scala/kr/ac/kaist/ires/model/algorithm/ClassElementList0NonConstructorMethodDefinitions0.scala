package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0NonConstructorMethodDefinitions0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0NonConstructorMethodDefinitions0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(EList(List())), ISeq(List())), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false))), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EStr("""constructor"""))))), ISeq(List())), IIf(ERef(RefId(Id("""__x1__"""))), IReturn(EList(List())), ISeq(List())), IReturn(EList(List(ERef(RefId(Id("""ClassElement""")))))))))
  /* Beautified form:
  "ClassElementList0NonConstructorMethodDefinitions0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return (new []) else {}
    access __x0__ = (ClassElement "IsStatic")
    let __x1__ = (= __x0__ false)
    if __x1__ {
      access __x2__ = (ClassElement "PropName")
      __x1__ = (= __x2__ "constructor")
    } else {}
    if __x1__ return (new []) else {}
    return (new [ClassElement])
  }
  */
}
