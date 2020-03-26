package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayAssignmentPattern2DestructuringAssignmentEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""ArrayAssignmentPattern2DestructuringAssignmentEvaluation3""", List(Id("""this"""), Id("""AssignmentElementList"""), Id("""Elision"""), Id("""AssignmentRestElement"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentElementList"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), ILet(Id("""status"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent)), ISeq(List(IAccess(Id("""__x8__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IAssign(RefId(Id("""status""")), ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))), IIf(ERef(RefId(Id("""__x10__"""))), ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true))), IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""AssignmentRestElement"""))), EAbsent)), ISeq(List(IAccess(Id("""__x13__"""), ERef(RefId(Id("""AssignmentRestElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")), IApp(Id("""__x14__"""), ERef(RefId(Id("""__x13__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IAssign(RefId(Id("""status""")), ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))), IApp(Id("""__x18__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x17__"""))))), IReturn(ERef(RefId(Id("""__x18__""")))))))
  /* Beautified form:
  "ArrayAssignmentPattern2DestructuringAssignmentEvaluation3" (this, AssignmentElementList, Elision, AssignmentRestElement, value) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (AssignmentElementList "IteratorDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ iteratorRecord)
    let status = __x2__
    app __x3__ = (IsAbruptCompletion status)
    if __x3__ {
      if (= iteratorRecord["Done"] false) {
        app __x4__ = (IteratorClose iteratorRecord status)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (Completion status)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (! (= Elision absent)) {
      access __x8__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x9__ = (__x8__ iteratorRecord)
      status = __x9__
      app __x10__ = (IsAbruptCompletion status)
      if __x10__ {
        assert (= iteratorRecord["Done"] true)
        app __x11__ = (Completion status)
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {}
    } else {}
    if (! (= AssignmentRestElement absent)) {
      access __x13__ = (AssignmentRestElement "IteratorDestructuringAssignmentEvaluation")
      app __x14__ = (__x13__ iteratorRecord)
      status = __x14__
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x15__ = (IteratorClose iteratorRecord status)
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (WrapCompletion __x15__)
      return __x16__
    } else {}
    app __x17__ = (Completion status)
    app __x18__ = (WrapCompletion __x17__)
    return __x18__
  }
  */
}
