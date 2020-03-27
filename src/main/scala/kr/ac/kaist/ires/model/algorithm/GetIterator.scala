package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetIterator {
  val length: Int = 1
  val func: Func = Func("""GetIterator""", List(Id("""obj"""), Id("""hint"""), Id("""method""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EAbsent), IAssign(RefId(Id("""hint""")), ERef(RefId(Id("""CONST_sync""")))), ISeq(List())), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""hint"""))), ERef(RefId(Id("""CONST_sync""")))), EBOp(OEq, ERef(RefId(Id("""hint"""))), ERef(RefId(Id("""CONST_async""")))))), IIf(EBOp(OEq, ERef(RefId(Id("""method"""))), EAbsent), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_asyncIterator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IAssign(RefId(Id("""method""")), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""method"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""syncMethod"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""CONST_sync"""))), ERef(RefId(Id("""syncMethod"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""syncIteratorRecord"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateAsyncFromSyncIterator"""))), List(ERef(RefId(Id("""syncIteratorRecord"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IAssign(RefId(Id("""method""")), ERef(RefId(Id("""__x5__"""))))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""method"""))), ERef(RefId(Id("""obj"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""iterator"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""iterator"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""next"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x9__""")))), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""iterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "GetIterator" (obj, hint, method) => {
    if (= hint absent) hint = CONST_sync else {}
    assert (|| (= hint CONST_sync) (= hint CONST_async))
    if (= method absent) if (= hint CONST_async) {
      app __x0__ = (GetMethod obj SYMBOL_asyncIterator)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      method = __x0__
      if (= method undefined) {
        app __x1__ = (GetMethod obj SYMBOL_iterator)
        if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let syncMethod = __x1__
        app __x2__ = (GetIterator obj CONST_sync syncMethod)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let syncIteratorRecord = __x2__
        app __x3__ = (CreateAsyncFromSyncIterator syncIteratorRecord)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {
      app __x5__ = (GetMethod obj SYMBOL_iterator)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      method = __x5__
    } else {}
    app __x6__ = (Call method obj)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let iterator = __x6__
    app __x7__ = (Type iterator)
    if (! (= __x7__ Object)) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app __x9__ = (GetV iterator "next")
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let nextMethod = __x9__
    let iteratorRecord = (new Record("Iterator" -> iterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x10__ = (WrapCompletion iteratorRecord)
    return __x10__
  }
  */
}
