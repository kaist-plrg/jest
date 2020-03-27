package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAddEntriesFromIterable {
  val length: Int = 3
  val func: Func = Func("""GLOBAL.AddEntriesFromIterable""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""target"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""iterable"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))), ILet(Id("""adder"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""adder"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x5__""")))), IWhile(EBool(true), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""next"""), ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""nextItem"""), ERef(RefId(Id("""__x8__""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""nextItem"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), ILet(Id("""error"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""error"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""nextItem"""))), EStr("""0"""))), ILet(Id("""k"""), ERef(RefId(Id("""__x13__""")))), IApp(Id("""__x14__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""k"""))))), IIf(ERef(RefId(Id("""__x14__"""))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""k"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""nextItem"""))), EStr("""1"""))), ILet(Id("""v"""), ERef(RefId(Id("""__x17__""")))), IApp(Id("""__x18__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))), IIf(ERef(RefId(Id("""__x18__"""))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""v"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x19__"""))))), IReturn(ERef(RefId(Id("""__x20__""")))))), ISeq(List())), IApp(Id("""__x21__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""adder"""))), ERef(RefId(Id("""target"""))), EList(List(ERef(RefProp(RefId(Id("""k""")), EStr("""Value"""))), ERef(RefProp(RefId(Id("""v""")), EStr("""Value"""))))))), ILet(Id("""status"""), ERef(RefId(Id("""__x21__""")))), IApp(Id("""__x22__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))), IIf(ERef(RefId(Id("""__x22__"""))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x23__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x23__"""))))), ISeq(List())), IApp(Id("""__x24__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x23__"""))))), IReturn(ERef(RefId(Id("""__x24__""")))))), ISeq(List()))))))))
  /* Beautified form:
  "GLOBAL.AddEntriesFromIterable" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let iterable = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let adder = __x2__
    app __x3__ = (IsCallable adder)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (GetIterator iterable)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let iteratorRecord = __x5__
    while true {
      app __x6__ = (IteratorStep iteratorRecord)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let next = __x6__
      if (= next false) {
        app __x7__ = (WrapCompletion target)
        return __x7__
      } else {}
      app __x8__ = (IteratorValue next)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextItem = __x8__
      app __x9__ = (Type nextItem)
      if (! (= __x9__ Object)) {
        app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        let error = __x10__
        app __x11__ = (IteratorClose iteratorRecord error)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {}
      app __x13__ = (Get nextItem "0")
      let k = __x13__
      app __x14__ = (IsAbruptCompletion k)
      if __x14__ {
        app __x15__ = (IteratorClose iteratorRecord k)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (WrapCompletion __x15__)
        return __x16__
      } else {}
      app __x17__ = (Get nextItem "1")
      let v = __x17__
      app __x18__ = (IsAbruptCompletion v)
      if __x18__ {
        app __x19__ = (IteratorClose iteratorRecord v)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        app __x20__ = (WrapCompletion __x19__)
        return __x20__
      } else {}
      app __x21__ = (Call adder target (new [k["Value"], v["Value"]]))
      let status = __x21__
      app __x22__ = (IsAbruptCompletion status)
      if __x22__ {
        app __x23__ = (IteratorClose iteratorRecord status)
        if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
        app __x24__ = (WrapCompletion __x23__)
        return __x24__
      } else {}
    }
  }
  */
}
