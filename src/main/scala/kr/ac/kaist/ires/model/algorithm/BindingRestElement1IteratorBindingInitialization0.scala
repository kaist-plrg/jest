package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestElement1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement1IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""n"""), EINum(0L)), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))), IIf(ERef(RefId(Id("""__x2__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""next"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""environment"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))), IIf(ERef(RefId(Id("""__x7__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""nextValue"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""nextValue""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""nextValue"""))))), ILet(Id("""status"""), ERef(RefId(Id("""__x9__""")))), IAssert(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(true))), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L)))))))))
  /* Beautified form:
  "BindingRestElement1IteratorBindingInitialization0" (this, BindingPattern, iteratorRecord, environment) => {
    app __x0__ = (ArrayCreate 0i)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let A = __x0__
    let n = 0i
    while true {
      if (= iteratorRecord["Done"] false) {
        app __x1__ = (IteratorStep iteratorRecord)
        let next = __x1__
        app __x2__ = (IsAbruptCompletion next)
        if __x2__ iteratorRecord["Done"] = true else {}
        if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
        next
        if (= next false) iteratorRecord["Done"] = true else {}
      } else {}
      if (= iteratorRecord["Done"] true) {
        access __x3__ = (BindingPattern "BindingInitialization")
        app __x4__ = (__x3__ A environment)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      let nextValue = __x6__
      app __x7__ = (IsAbruptCompletion nextValue)
      if __x7__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x8__ = (ToString n)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (CreateDataProperty A __x8__ nextValue)
      let status = __x9__
      assert (= status true)
      n = (+ n 1i)
    }
  }
  */
}
