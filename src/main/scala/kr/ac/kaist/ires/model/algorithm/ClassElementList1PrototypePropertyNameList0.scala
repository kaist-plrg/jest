package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList1PrototypePropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList1PrototypePropertyNameList0""", List(Id("""this"""), Id("""ClassElementList"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElementList"""))), EStr("""PrototypePropertyNameList""")), ILet(Id("""list"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(ERef(RefId(Id("""list""")))), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), IReturn(ERef(RefId(Id("""list""")))), ISeq(List())), IAccess(Id("""__x3__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""list""")))), IReturn(ERef(RefId(Id("""list""")))))))
  /* Beautified form:
  "ClassElementList1PrototypePropertyNameList0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "PrototypePropertyNameList")
    let list = __x0__
    access __x1__ = (ClassElement "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (ClassElement "IsStatic")
    if (= __x2__ true) return list else {}
    access __x3__ = (ClassElement "PropName")
    append __x3__ -> list
    return list
  }
  */
}
