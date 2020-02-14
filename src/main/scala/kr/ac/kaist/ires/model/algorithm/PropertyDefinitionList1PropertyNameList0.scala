package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinitionList1PropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinitionList1PropertyNameList0""", List(Id("""this"""), Id("""PropertyDefinitionList"""), Id("""PropertyDefinition""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyDefinitionList"""))), EStr("""PropertyNameList""")), ILet(Id("""list"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropName""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(ERef(RefId(Id("""list""")))), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropName""")), IAppend(ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""list""")))), IReturn(ERef(RefId(Id("""list""")))))))
  /* Beautified form:
  "PropertyDefinitionList1PropertyNameList0" (this, PropertyDefinitionList, PropertyDefinition) => {
    access __x0__ = (PropertyDefinitionList "PropertyNameList")
    let list = __x0__
    access __x1__ = (PropertyDefinition "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (PropertyDefinition "PropName")
    append __x2__ -> list
    return list
  }
  */
}
