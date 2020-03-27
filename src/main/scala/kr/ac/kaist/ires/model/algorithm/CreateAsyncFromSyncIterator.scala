package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateAsyncFromSyncIterator {
  val length: Int = 1
  val func: Func = Func("""CreateAsyncFromSyncIterator""", List(Id("""syncIteratorRecord""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncFromSyncIteratorPrototype"""))), EList(List(EStr("""SyncIteratorRecord"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""asyncIterator"""), ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""asyncIterator""")), EStr("""SyncIteratorRecord""")), ERef(RefId(Id("""syncIteratorRecord""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""asyncIterator"""))), EStr("""next"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""asyncIterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "CreateAsyncFromSyncIterator" (syncIteratorRecord) => {
    app __x0__ = (ObjectCreate INTRINSIC_AsyncFromSyncIteratorPrototype (new ["SyncIteratorRecord"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let asyncIterator = __x0__
    asyncIterator["SyncIteratorRecord"] = syncIteratorRecord
    app __x1__ = (Get asyncIterator "next")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let nextMethod = __x1__
    let iteratorRecord = (new Record("Iterator" -> asyncIterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x2__ = (WrapCompletion iteratorRecord)
    return __x2__
  }
  */
}
