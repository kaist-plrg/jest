package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object YieldExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""YieldExpression2Evaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""generatorKind"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""generatorKind"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""iterator"""), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), ILet(Id("""received"""), ERef(RefId(Id("""__x4__""")))), IWhile(EBool(true), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""received""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""NextMethod"""))), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))), EList(List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IAssign(RefId(Id("""innerResult""")), ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""done"""), ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""__x12__"""))))), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x13__""")))))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""innerResult"""))))), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x14__"""))))))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""received""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""throw"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), ILet(Id("""throw"""), ERef(RefId(Id("""__x15__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""throw"""))), EUndef)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""throw"""))), ERef(RefId(Id("""iterator"""))), EList(List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), IAssign(RefId(Id("""innerResult""")), ERef(RefId(Id("""__x17__""")))))), ISeq(List())), IApp(Id("""__x18__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x19__""")))))), ISeq(List())), IApp(Id("""__x20__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x20__"""))))), ISeq(List())), ILet(Id("""done"""), ERef(RefId(Id("""__x20__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x21__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x21__""")), ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x21__"""))))), ISeq(List())), IApp(Id("""__x22__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x21__"""))))), IReturn(ERef(RefId(Id("""__x22__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x23__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x23__"""))))), ISeq(List())), IApp(Id("""__x24__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""__x23__"""))))), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x24__""")))))), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""innerResult"""))))), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x25__"""))))))))), ISeq(List(ILet(Id("""closeCompletion"""), EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_normal""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""AsyncIteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""closeCompletion"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x26__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x26__""")))))), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""closeCompletion"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x27__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x27__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x27__"""))))))), IApp(Id("""__x28__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x28__"""))))))))), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""return"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x29__"""))))), ISeq(List())), ILet(Id("""return"""), ERef(RefId(Id("""__x29__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x30__"""))))), ISeq(List())), IAssign(RefProp(RefId(Id("""received""")), EStr("""Value""")), ERef(RefId(Id("""__x30__""")))))), ISeq(List())), IApp(Id("""__x31__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""received"""))))), IApp(Id("""__x32__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x31__"""))))), IReturn(ERef(RefId(Id("""__x32__""")))))), ISeq(List())), IApp(Id("""__x33__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""iterator"""))), EList(List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x33__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x33__""")), ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x33__"""))))), ISeq(List())), ILet(Id("""innerReturnResult"""), ERef(RefId(Id("""__x33__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x34__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""innerReturnResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x34__"""))))), ISeq(List())), IAssign(RefId(Id("""innerReturnResult""")), ERef(RefId(Id("""__x34__""")))))), ISeq(List())), IApp(Id("""__x35__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""innerReturnResult"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x35__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x36__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x36__""")))))), ISeq(List())), IApp(Id("""__x37__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""innerReturnResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x37__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x37__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x37__""")), ERef(RefProp(RefId(Id("""__x37__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x37__"""))))), ISeq(List())), ILet(Id("""done"""), ERef(RefId(Id("""__x37__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x38__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerReturnResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x38__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x38__""")), ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x38__"""))))), ISeq(List())), ILet(Id("""value"""), ERef(RefId(Id("""__x38__""")))), IApp(Id("""__x39__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))), IReturn(ERef(RefId(Id("""__x39__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x40__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerReturnResult"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x40__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x40__""")), ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x40__"""))))), ISeq(List())), IApp(Id("""__x41__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""__x40__"""))))), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x41__""")))))), ISeq(List(IApp(Id("""__x42__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""innerReturnResult"""))))), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x42__""")))))))))))))))
  /* Beautified form:
  "YieldExpression2Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetGeneratorKind )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    app __x3__ = (GetIterator value generatorKind)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorRecord = __x3__
    let iterator = iteratorRecord["Iterator"]
    app __x4__ = (NormalCompletion undefined)
    let received = __x4__
    while true if (= received["Type"] CONST_normal) {
      app __x5__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"] (new [received["Value"]]))
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let innerResult = __x5__
      if (= generatorKind CONST_async) {
        app __x6__ = (Await innerResult)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        innerResult = __x6__
      } else {}
      app __x7__ = (Type innerResult)
      if (! (= __x7__ Object)) {
        app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x8__
      } else {}
      app __x9__ = (IteratorComplete innerResult)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let done = __x9__
      if (= done true) {
        app __x10__ = (IteratorValue innerResult)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        app __x11__ = (WrapCompletion __x10__)
        return __x11__
      } else {}
      if (= generatorKind CONST_async) {
        app __x12__ = (IteratorValue innerResult)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (AsyncGeneratorYield __x12__)
        received = __x13__
      } else {
        app __x14__ = (GeneratorYield innerResult)
        received = __x14__
      }
    } else if (= received["Type"] CONST_throw) {
      app __x15__ = (GetMethod iterator "throw")
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      let throw = __x15__
      if (! (= throw undefined)) {
        app __x16__ = (Call throw iterator (new [received["Value"]]))
        if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        let innerResult = __x16__
        if (= generatorKind CONST_async) {
          app __x17__ = (Await innerResult)
          if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
          innerResult = __x17__
        } else {}
        app __x18__ = (Type innerResult)
        if (! (= __x18__ Object)) {
          app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x19__
        } else {}
        app __x20__ = (IteratorComplete innerResult)
        if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let done = __x20__
        if (= done true) {
          app __x21__ = (IteratorValue innerResult)
          if (= (typeof __x21__) "Completion") if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
          app __x22__ = (WrapCompletion __x21__)
          return __x22__
        } else {}
        if (= generatorKind CONST_async) {
          app __x23__ = (IteratorValue innerResult)
          if (= (typeof __x23__) "Completion") if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          app __x24__ = (AsyncGeneratorYield __x23__)
          received = __x24__
        } else {
          app __x25__ = (GeneratorYield innerResult)
          received = __x25__
        }
      } else {
        let closeCompletion = (new Completion("Type" -> CONST_normal, "Value" -> CONST_empty, "Target" -> CONST_empty))
        if (= generatorKind CONST_async) {
          app __x26__ = (AsyncIteratorClose iteratorRecord closeCompletion)
          if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
          __x26__
        } else {
          app __x27__ = (IteratorClose iteratorRecord closeCompletion)
          if (= (typeof __x27__) "Completion") if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
          __x27__
        }
        app __x28__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x28__
      }
    } else {
      app __x29__ = (GetMethod iterator "return")
      if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      let return = __x29__
      if (= return undefined) {
        if (= generatorKind CONST_async) {
          app __x30__ = (Await received["Value"])
          if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          received["Value"] = __x30__
        } else {}
        app __x31__ = (Completion received)
        app __x32__ = (WrapCompletion __x31__)
        return __x32__
      } else {}
      app __x33__ = (Call return iterator (new [received["Value"]]))
      if (= (typeof __x33__) "Completion") if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      let innerReturnResult = __x33__
      if (= generatorKind CONST_async) {
        app __x34__ = (Await innerReturnResult)
        if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
        innerReturnResult = __x34__
      } else {}
      app __x35__ = (Type innerReturnResult)
      if (! (= __x35__ Object)) {
        app __x36__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x36__
      } else {}
      app __x37__ = (IteratorComplete innerReturnResult)
      if (= (typeof __x37__) "Completion") if (= __x37__["Type"] CONST_normal) __x37__ = __x37__["Value"] else return __x37__ else {}
      let done = __x37__
      if (= done true) {
        app __x38__ = (IteratorValue innerReturnResult)
        if (= (typeof __x38__) "Completion") if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
        let value = __x38__
        app __x39__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> value, "Target" -> CONST_empty)))
        return __x39__
      } else {}
      if (= generatorKind CONST_async) {
        app __x40__ = (IteratorValue innerReturnResult)
        if (= (typeof __x40__) "Completion") if (= __x40__["Type"] CONST_normal) __x40__ = __x40__["Value"] else return __x40__ else {}
        app __x41__ = (AsyncGeneratorYield __x40__)
        received = __x41__
      } else {
        app __x42__ = (GeneratorYield innerReturnResult)
        received = __x42__
      }
    }
  }
  */
}
