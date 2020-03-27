package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCreateAsyncFromSyncIterator {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.CreateAsyncFromSyncIterator""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""syncIteratorRecord"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncFromSyncIteratorPrototype"""))), EList(List(EStr("""SyncIteratorRecord"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""asyncIterator"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""asyncIterator""")), EStr("""SyncIteratorRecord""")), ERef(RefId(Id("""syncIteratorRecord""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""asyncIterator"""))), EStr("""next"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x2__""")))), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""asyncIterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "GLOBAL.CreateAsyncFromSyncIterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let syncIteratorRecord = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_AsyncFromSyncIteratorPrototype (new ["SyncIteratorRecord"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let asyncIterator = __x1__
    asyncIterator["SyncIteratorRecord"] = syncIteratorRecord
    app __x2__ = (Get asyncIterator "next")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let nextMethod = __x2__
    let iteratorRecord = (new Record("Iterator" -> asyncIterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x3__ = (WrapCompletion iteratorRecord)
    return __x3__
  }
  */
}
