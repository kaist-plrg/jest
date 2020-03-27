package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateListIteratorRecord {
  val length: Int = 1
  val func: Func = Func("""CreateListIteratorRecord""", List(Id("""list""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_IteratorPrototype"""))), EList(List(EStr("""IteratedList"""), EStr("""ListIteratorNextIndex"""))))), ILet(Id("""iterator"""), ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedList""")), ERef(RefId(Id("""list""")))), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""ListIteratorNextIndex""")), EINum(0L)), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""next""")), (EStr("""length"""), EINum(0L)), (EStr("""step"""), ERef(RefId(Id("""ListIteratornext"""))))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List()))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""iterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""next""")))), (EStr("""Done"""), EBool(false)))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "CreateListIteratorRecord" (list) => {
    app __x0__ = (ObjectCreate INTRINSIC_IteratorPrototype (new ["IteratedList", "ListIteratorNextIndex"]))
    let iterator = __x0__
    iterator["IteratedList"] = list
    iterator["ListIteratorNextIndex"] = 0i
    let steps = (new algorithm("name" -> "next", "length" -> 0i, "step" -> ListIteratornext))
    app __x1__ = (CreateBuiltinFunction steps (new []))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let next = __x1__
    app __x2__ = (WrapCompletion (new Record("Iterator" -> iterator, "NextMethod" -> next, "Done" -> false)))
    return __x2__
  }
  */
}
