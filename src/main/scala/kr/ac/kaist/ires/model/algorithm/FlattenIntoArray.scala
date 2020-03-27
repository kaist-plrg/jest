package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FlattenIntoArray {
  val length: Int = 5
  val func: Func = Func("""FlattenIntoArray""", List(Id("""target"""), Id("""source"""), Id("""sourceLen"""), Id("""start"""), Id("""depth"""), Id("""mapperFunction"""), Id("""thisArg""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""source"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""targetIndex"""), ERef(RefId(Id("""start""")))), ILet(Id("""sourceIndex"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""sourceLen""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sourceIndex"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""P"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""exists"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""element"""), ERef(RefId(Id("""__x4__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""mapperFunction"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapperFunction"""))), ERef(RefId(Id("""thisArg"""))), EList(List(ERef(RefId(Id("""element"""))), ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""source"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IAssign(RefId(Id("""element""")), ERef(RefId(Id("""__x5__""")))))), ISeq(List())), ILet(Id("""shouldFlatten"""), EBool(false)), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""depth""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""element"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IAssign(RefId(Id("""shouldFlatten""")), ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""shouldFlatten"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""element"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""elementLen"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""element"""))), ERef(RefId(Id("""elementLen"""))), ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, ERef(RefId(Id("""depth"""))), EINum(1L)))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), IAssign(RefId(Id("""targetIndex""")), ERef(RefId(Id("""__x8__""")))))), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""targetIndex"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""__x10__"""))), ERef(RefId(Id("""element"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x11__""")))), IAssign(RefId(Id("""targetIndex""")), EBOp(OPlus, ERef(RefId(Id("""targetIndex"""))), EINum(1L)))))))), ISeq(List())), IAssign(RefId(Id("""sourceIndex""")), EBOp(OPlus, ERef(RefId(Id("""sourceIndex"""))), EINum(1L)))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""targetIndex"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "FlattenIntoArray" (target, source, sourceLen, start, depth, mapperFunction, thisArg) => {
    app __x0__ = (Type target)
    assert (= __x0__ Object)
    app __x1__ = (Type source)
    assert (= __x1__ Object)
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x2__ = (ToString sourceIndex)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let P = __x2__
      app __x3__ = (HasProperty source P)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let exists = __x3__
      if (= exists true) {
        app __x4__ = (Get source P)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let element = __x4__
        if (! (= mapperFunction absent)) {
          app __x5__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          element = __x5__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x6__ = (IsArray element)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          shouldFlatten = __x6__
        } else {}
        if (= shouldFlatten true) {
          app __x7__ = (LengthOfArrayLike element)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let elementLen = __x7__
          app __x8__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          targetIndex = __x8__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x9__
          } else {}
          app __x10__ = (ToString targetIndex)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          app __x11__ = (CreateDataPropertyOrThrow target __x10__ element)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          __x11__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x12__ = (WrapCompletion targetIndex)
    return __x12__
  }
  */
}
