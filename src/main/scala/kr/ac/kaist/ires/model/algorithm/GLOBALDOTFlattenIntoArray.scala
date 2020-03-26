package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFlattenIntoArray {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.FlattenIntoArray""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""target"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""source"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))), ILet(Id("""sourceLen"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(3L))), ILet(Id("""start"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(4L))), ILet(Id("""depth"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(5L))), ILet(Id("""mapperFunction"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(6L))), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""source"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""targetIndex"""), ERef(RefId(Id("""start""")))), ILet(Id("""sourceIndex"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""sourceLen""")))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sourceIndex"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""P"""), ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""exists"""), ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""element"""), ERef(RefId(Id("""__x11__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(5L))), EAbsent)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapperFunction"""))), ERef(RefId(Id("""thisArg"""))), EList(List(ERef(RefId(Id("""element"""))), ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""source"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IAssign(RefId(Id("""element""")), ERef(RefId(Id("""__x12__""")))))), ISeq(List())), ILet(Id("""shouldFlatten"""), EBool(false)), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""depth""")))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""element"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IAssign(RefId(Id("""shouldFlatten""")), ERef(RefId(Id("""__x13__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""shouldFlatten"""))), EBool(true)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""element"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), ILet(Id("""elementLen"""), ERef(RefId(Id("""__x14__""")))), IApp(Id("""__x15__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""element"""))), ERef(RefId(Id("""elementLen"""))), ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, ERef(RefId(Id("""depth"""))), EINum(1L)))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IAssign(RefId(Id("""targetIndex""")), ERef(RefId(Id("""__x15__""")))))), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""targetIndex"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), IApp(Id("""__x18__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""__x17__"""))), ERef(RefId(Id("""element"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x18__""")))), IAssign(RefId(Id("""targetIndex""")), EBOp(OPlus, ERef(RefId(Id("""targetIndex"""))), EINum(1L)))))))), ISeq(List())), IAssign(RefId(Id("""sourceIndex""")), EBOp(OPlus, ERef(RefId(Id("""sourceIndex"""))), EINum(1L)))))), IApp(Id("""__x19__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""targetIndex"""))))), IReturn(ERef(RefId(Id("""__x19__""")))))))
  /* Beautified form:
  "GLOBAL.FlattenIntoArray" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let source = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let sourceLen = __x2__
    app __x3__ = (GetArgument argumentsList 3i)
    let start = __x3__
    app __x4__ = (GetArgument argumentsList 4i)
    let depth = __x4__
    app __x5__ = (GetArgument argumentsList 5i)
    let mapperFunction = __x5__
    app __x6__ = (GetArgument argumentsList 6i)
    let thisArg = __x6__
    app __x7__ = (Type target)
    assert (= __x7__ Object)
    app __x8__ = (Type source)
    assert (= __x8__ Object)
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x9__ = (ToString sourceIndex)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let P = __x9__
      app __x10__ = (HasProperty source P)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let exists = __x10__
      if (= exists true) {
        app __x11__ = (Get source P)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let element = __x11__
        if (! (= argumentsList[5i] absent)) {
          app __x12__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          element = __x12__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x13__ = (IsArray element)
          if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          shouldFlatten = __x13__
        } else {}
        if (= shouldFlatten true) {
          app __x14__ = (LengthOfArrayLike element)
          if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
          let elementLen = __x14__
          app __x15__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          targetIndex = __x15__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x16__
          } else {}
          app __x17__ = (ToString targetIndex)
          if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
          app __x18__ = (CreateDataPropertyOrThrow target __x17__ element)
          if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
          __x18__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x19__ = (WrapCompletion targetIndex)
    return __x19__
  }
  */
}
