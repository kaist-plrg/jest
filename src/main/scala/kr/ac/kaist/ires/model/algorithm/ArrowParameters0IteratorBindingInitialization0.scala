package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowParameters0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false))), IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""next"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""v"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""v"""))))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef), ISeq(List())), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "ArrowParameters0IteratorBindingInitialization0" (this, BindingIdentifier, iteratorRecord, environment) => {
    assert (= iteratorRecord["Done"] false)
    app __x0__ = (IteratorStep iteratorRecord)
    let next = __x0__
    app __x1__ = (IsAbruptCompletion next)
    if __x1__ iteratorRecord["Done"] = true else {}
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    if (= next false) iteratorRecord["Done"] = true else {
      app __x2__ = (IteratorValue next)
      let v = __x2__
      app __x3__ = (IsAbruptCompletion v)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof v) "Completion") if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
      v
    }
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    access __x4__ = (BindingIdentifier "BindingInitialization")
    app __x5__ = (__x4__ v environment)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
