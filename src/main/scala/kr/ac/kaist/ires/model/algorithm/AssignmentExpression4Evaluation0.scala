package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression4Evaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""LeftHandSideExpression"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""LeftHandSideExpression"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""Evaluation""")), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""lref"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""lref""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""AssignmentExpression"""))))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""IsIdentifierRef""")), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""NamedEvaluation""")), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""__x3__"""))))), ILet(Id("""rval"""), ERef(RefId(Id("""__x5__""")))))), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")), ILet(Id("""rref"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""rval"""), ERef(RefId(Id("""__x7__"""))))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""rval"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x8__""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""rval"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), ILet(Id("""assignmentPattern"""), EParseSyntax(ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""AssignmentPattern"""), List())), IAccess(Id("""__x10__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")), ILet(Id("""rref"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""rval"""), ERef(RefId(Id("""__x11__""")))), IAccess(Id("""__x12__"""), ERef(RefId(Id("""assignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""rval"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x13__""")))), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""rval"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))))
  /* Beautified form:
  "AssignmentExpression4Evaluation0" (this, LeftHandSideExpression, AssignmentExpression) => {
    if (! (|| (is-instance-of LeftHandSideExpression ObjectLiteral) (is-instance-of LeftHandSideExpression ArrayLiteral))) {
      access __x0__ = (LeftHandSideExpression "Evaluation")
      let lref = __x0__
      if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
      app __x1__ = (IsAnonymousFunctionDefinition AssignmentExpression)
      access __x2__ = (LeftHandSideExpression "IsIdentifierRef")
      if (&& (= __x1__ true) (= __x2__ true)) {
        app __x3__ = (GetReferencedName lref)
        access __x4__ = (AssignmentExpression "NamedEvaluation")
        app __x5__ = (__x4__ __x3__)
        let rval = __x5__
      } else {
        access __x6__ = (AssignmentExpression "Evaluation")
        let rref = __x6__
        app __x7__ = (GetValue rref)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let rval = __x7__
      }
      app __x8__ = (PutValue lref rval)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
      app __x9__ = (WrapCompletion rval)
      return __x9__
    } else {}
    let assignmentPattern = (parse-syntax LeftHandSideExpression "AssignmentPattern" )
    access __x10__ = (AssignmentExpression "Evaluation")
    let rref = __x10__
    app __x11__ = (GetValue rref)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let rval = __x11__
    access __x12__ = (assignmentPattern "DestructuringAssignmentEvaluation")
    app __x13__ = (__x12__ rval)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion rval)
    return __x14__
  }
  */
}
