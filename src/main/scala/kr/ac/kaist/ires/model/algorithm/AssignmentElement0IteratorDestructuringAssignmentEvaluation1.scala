package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElement0IteratorDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElement0IteratorDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""Initializer"""), Id("""iteratorRecord""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""lref""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""lref"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""lref""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))), IIf(ERef(RefId(Id("""__x2__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EIsCompletion(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""next"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""next""")))), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))), ILet(Id("""value"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""value"""))))), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)), ISeq(List())), IIf(EIsCompletion(ERef(RefId(Id("""value""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""value"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""value"""))))))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""value"""), EUndef), ISeq(List())), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))), IAccess(Id("""__x6__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""IsIdentifierRef""")), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))), IAccess(Id("""__x8__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(ERef(RefId(Id("""__x7__"""))))), ILet(Id("""v"""), ERef(RefId(Id("""__x9__""")))))), ISeq(List(IAccess(Id("""__x10__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""v"""), ERef(RefId(Id("""__x11__"""))))))))), ILet(Id("""v"""), ERef(RefId(Id("""value"""))))), IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral""")), ISeq(List(ILet(Id("""nestedAssignmentPattern"""), EParseSyntax(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""AssignmentPattern"""), List())), IAccess(Id("""__x12__"""), ERef(RefId(Id("""nestedAssignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""v"""))))), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""v"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))))
  /* Beautified form:
  "AssignmentElement0IteratorDestructuringAssignmentEvaluation1" (this, DestructuringAssignmentTarget, Initializer, iteratorRecord) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x1__ = (IteratorStep iteratorRecord)
      let next = __x1__
      app __x2__ = (IsAbruptCompletion next)
      if __x2__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x3__ = (IteratorValue next)
        let value = __x3__
        app __x4__ = (IsAbruptCompletion value)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
        value
      }
    } else {}
    if (= iteratorRecord["Done"] true) let value = undefined else {}
    if (&& (! (= Initializer absent)) (= value undefined)) {
      app __x5__ = (IsAnonymousFunctionDefinition Initializer)
      access __x6__ = (DestructuringAssignmentTarget "IsIdentifierRef")
      if (&& (= __x5__ true) (= __x6__ true)) {
        app __x7__ = (GetReferencedName lref)
        access __x8__ = (Initializer "NamedEvaluation")
        app __x9__ = (__x8__ __x7__)
        let v = __x9__
      } else {
        access __x10__ = (Initializer "Evaluation")
        let defaultValue = __x10__
        app __x11__ = (GetValue defaultValue)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let v = __x11__
      }
    } else let v = value
    if (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral)) {
      let nestedAssignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern" )
      access __x12__ = (nestedAssignmentPattern "DestructuringAssignmentEvaluation")
      app __x13__ = (__x12__ v)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (PutValue lref v)
    if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
