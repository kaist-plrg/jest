package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTfrom {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.from""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""items"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""mapfn"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x2__""")))), ILet(Id("""C"""), ERef(RefId(Id("""this""")))), IIf(EBOp(OEq, ERef(RefId(Id("""mapfn"""))), EUndef), ILet(Id("""mapping"""), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""mapfn"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(2L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))), ILet(Id("""T"""), EUndef)), ILet(Id("""mapping"""), EBool(true))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""items"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""usingIterator"""), ERef(RefId(Id("""__x5__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""usingIterator"""))), EUndef)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x7__""")))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x8__"""))))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""items"""))), ERef(RefId(Id("""CONST_sync"""))), ERef(RefId(Id("""usingIterator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x9__""")))), ILet(Id("""k"""), EINum(0L)), IWhile(EBool(true), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""k"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), ILet(Id("""error"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""error"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), ILet(Id("""Pk"""), ERef(RefId(Id("""__x13__""")))), IApp(Id("""__x14__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), ILet(Id("""next"""), ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""k"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x15__""")))), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""mapping"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""nextValue"""))), ERef(RefId(Id("""k"""))))))), ILet(Id("""mappedValue"""), ERef(RefId(Id("""__x18__""")))), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""mappedValue"""))))), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""mappedValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x20__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x20__"""))))), ISeq(List())), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x20__"""))))), IReturn(ERef(RefId(Id("""__x21__""")))))), ISeq(List())))), ILet(Id("""mappedValue"""), ERef(RefId(Id("""nextValue"""))))), IApp(Id("""__x22__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""mappedValue"""))))), ILet(Id("""defineStatus"""), ERef(RefId(Id("""__x22__""")))), IApp(Id("""__x23__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""defineStatus"""))))), IIf(ERef(RefId(Id("""__x23__"""))), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""defineStatus"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x24__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x24__""")), ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x24__"""))))), ISeq(List())), IApp(Id("""__x25__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x24__"""))))), IReturn(ERef(RefId(Id("""__x25__""")))))), ISeq(List())), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))))), ISeq(List())), IApp(Id("""__x26__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""items"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x26__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x26__"""))))), ISeq(List())), ILet(Id("""arrayLike"""), ERef(RefId(Id("""__x26__""")))), IApp(Id("""__x27__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""arrayLike"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x27__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x27__"""))))), ISeq(List())), ILet(Id("""len"""), ERef(RefId(Id("""__x27__""")))), IApp(Id("""__x28__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x28__"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""len"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x29__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x29__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x29__""")))))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""len"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x30__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x30__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x30__"""))))))), ILet(Id("""k"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x31__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x31__""")), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x31__"""))))), ISeq(List())), ILet(Id("""Pk"""), ERef(RefId(Id("""__x31__""")))), IApp(Id("""__x32__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""arrayLike"""))), ERef(RefId(Id("""Pk"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x32__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x32__""")), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x32__"""))))), ISeq(List())), ILet(Id("""kValue"""), ERef(RefId(Id("""__x32__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""mapping"""))), EBool(true)), ISeq(List(IApp(Id("""__x33__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x33__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x33__""")), ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x33__"""))))), ISeq(List())), ILet(Id("""mappedValue"""), ERef(RefId(Id("""__x33__""")))))), ILet(Id("""mappedValue"""), ERef(RefId(Id("""kValue"""))))), IApp(Id("""__x34__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""mappedValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x34__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x34__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x34__""")))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))), IApp(Id("""__x35__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""len"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x35__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x35__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x35__""")))), IApp(Id("""__x36__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x36__""")))))))
  /* Beautified form:
  "GLOBAL.Array.from" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let items = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let mapfn = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let thisArg = __x2__
    let C = this
    if (= mapfn undefined) let mapping = false else {
      app __x3__ = (IsCallable mapfn)
      if (= __x3__ false) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      if (! (= argumentsList[2i] absent)) let T = thisArg else let T = undefined
      let mapping = true
    }
    app __x5__ = (GetMethod items SYMBOL_iterator)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let usingIterator = __x5__
    if (! (= usingIterator undefined)) {
      app __x6__ = (IsConstructor C)
      if (= __x6__ true) {
        app __x7__ = (Construct C)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let A = __x7__
      } else {
        app __x8__ = (ArrayCreate 0i)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let A = __x8__
      }
      app __x9__ = (GetIterator items CONST_sync usingIterator)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let iteratorRecord = __x9__
      let k = 0i
      while true {
        if (! (< k (- 9007199254740992i 1i))) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          let error = __x10__
          app __x11__ = (IteratorClose iteratorRecord error)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          app __x12__ = (WrapCompletion __x11__)
          return __x12__
        } else {}
        app __x13__ = (ToString k)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        let Pk = __x13__
        app __x14__ = (IteratorStep iteratorRecord)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let next = __x14__
        if (= next false) {
          app __x15__ = (Set A "length" k true)
          if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          __x15__
          app __x16__ = (WrapCompletion A)
          return __x16__
        } else {}
        app __x17__ = (IteratorValue next)
        if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
        let nextValue = __x17__
        if (= mapping true) {
          app __x18__ = (Call mapfn T (new [nextValue, k]))
          let mappedValue = __x18__
          app __x19__ = (IsAbruptCompletion mappedValue)
          if __x19__ {
            app __x20__ = (IteratorClose iteratorRecord mappedValue)
            if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
            app __x21__ = (WrapCompletion __x20__)
            return __x21__
          } else {}
        } else let mappedValue = nextValue
        app __x22__ = (CreateDataPropertyOrThrow A Pk mappedValue)
        let defineStatus = __x22__
        app __x23__ = (IsAbruptCompletion defineStatus)
        if __x23__ {
          app __x24__ = (IteratorClose iteratorRecord defineStatus)
          if (is-completion __x24__) if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
          app __x25__ = (WrapCompletion __x24__)
          return __x25__
        } else {}
        k = (+ k 1i)
      }
    } else {}
    app __x26__ = (ToObject items)
    if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let arrayLike = __x26__
    app __x27__ = (LengthOfArrayLike arrayLike)
    if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
    let len = __x27__
    app __x28__ = (IsConstructor C)
    if (= __x28__ true) {
      app __x29__ = (Construct C (new [len]))
      if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      let A = __x29__
    } else {
      app __x30__ = (ArrayCreate len)
      if (is-completion __x30__) if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
      let A = __x30__
    }
    let k = 0i
    while (< k len) {
      app __x31__ = (ToString k)
      if (is-completion __x31__) if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
      let Pk = __x31__
      app __x32__ = (Get arrayLike Pk)
      if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
      let kValue = __x32__
      if (= mapping true) {
        app __x33__ = (Call mapfn T (new [kValue, k]))
        if (is-completion __x33__) if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
        let mappedValue = __x33__
      } else let mappedValue = kValue
      app __x34__ = (CreateDataPropertyOrThrow A Pk mappedValue)
      if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
      __x34__
      k = (+ k 1i)
    }
    app __x35__ = (Set A "length" len true)
    if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
    __x35__
    app __x36__ = (WrapCompletion A)
    return __x36__
  }
  */
}
