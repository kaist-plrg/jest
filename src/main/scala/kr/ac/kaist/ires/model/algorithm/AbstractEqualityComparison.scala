package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AbstractEqualityComparison {
  val length: Int = 0
  val func: Func = Func("""AbstractEqualityComparison""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENull), EBOp(OEq, ERef(RefId(Id("""y"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""y"""))), ENull)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), ILet(Id("""__x7__"""), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Number"""))))), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""String"""))))))), ISeq(List())), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""y"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""__x9__"""))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), ILet(Id("""__x13__"""), EBOp(OEq, ERef(RefId(Id("""__x12__"""))), ERef(RefId(Id("""String"""))))), IIf(ERef(RefId(Id("""__x13__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))), IAssign(RefId(Id("""__x13__""")), EBOp(OEq, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""Number"""))))))), ISeq(List())), IIf(ERef(RefId(Id("""__x13__"""))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""x"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""y"""))))), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))), IReturn(ERef(RefId(Id("""__x17__""")))))), ISeq(List())), IApp(Id("""__x18__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""Boolean""")))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""x"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IApp(Id("""__x20__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""__x19__"""))), ERef(RefId(Id("""y"""))))), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x20__"""))))), IReturn(ERef(RefId(Id("""__x21__""")))))), ISeq(List())), IApp(Id("""__x22__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x22__"""))), ERef(RefId(Id("""Boolean""")))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""y"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x23__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x23__"""))))), ISeq(List())), IApp(Id("""__x24__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""__x23__"""))))), IApp(Id("""__x25__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x24__"""))))), IReturn(ERef(RefId(Id("""__x25__""")))))), ISeq(List())), IApp(Id("""__x26__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), ILet(Id("""__x27__"""), EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x26__"""))), ERef(RefId(Id("""String""")))), EBOp(OEq, ERef(RefId(Id("""__x26__"""))), ERef(RefId(Id("""Number"""))))), EBOp(OEq, ERef(RefId(Id("""__x26__"""))), ERef(RefId(Id("""Symbol""")))))), IIf(ERef(RefId(Id("""__x27__"""))), ISeq(List(IApp(Id("""__x28__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))), IAssign(RefId(Id("""__x27__""")), EBOp(OEq, ERef(RefId(Id("""__x28__"""))), ERef(RefId(Id("""Object"""))))))), ISeq(List())), IIf(ERef(RefId(Id("""__x27__"""))), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""y"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x29__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x29__"""))))), ISeq(List())), IApp(Id("""__x30__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""__x29__"""))))), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x30__"""))))), IReturn(ERef(RefId(Id("""__x31__""")))))), ISeq(List())), IApp(Id("""__x32__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), ILet(Id("""__x33__"""), EBOp(OEq, ERef(RefId(Id("""__x32__"""))), ERef(RefId(Id("""Object"""))))), IIf(ERef(RefId(Id("""__x33__"""))), ISeq(List(IApp(Id("""__x34__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))), IAssign(RefId(Id("""__x33__""")), EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x34__"""))), ERef(RefId(Id("""String""")))), EBOp(OEq, ERef(RefId(Id("""__x34__"""))), ERef(RefId(Id("""Number"""))))), EBOp(OEq, ERef(RefId(Id("""__x34__"""))), ERef(RefId(Id("""Symbol""")))))))), ISeq(List())), IIf(ERef(RefId(Id("""__x33__"""))), ISeq(List(IApp(Id("""__x35__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""x"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x35__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x35__"""))))), ISeq(List())), IApp(Id("""__x36__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""__x35__"""))), ERef(RefId(Id("""y"""))))), IApp(Id("""__x37__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x36__"""))))), IReturn(ERef(RefId(Id("""__x37__""")))))), ISeq(List())), IApp(Id("""__x38__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x38__""")))))))
  /* Beautified form:
  "AbstractEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (= __x0__ __x1__) {
      app __x2__ = (StrictEqualityComparison x y)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (&& (= x null) (= y undefined)) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= x undefined) (= y null)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (Type x)
    let __x7__ = (= __x6__ Number)
    if __x7__ {
      app __x8__ = (Type y)
      __x7__ = (= __x8__ String)
    } else {}
    if __x7__ {
      app __x9__ = (ToNumber y)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (AbstractEqualityComparison x __x9__)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (Type x)
    let __x13__ = (= __x12__ String)
    if __x13__ {
      app __x14__ = (Type y)
      __x13__ = (= __x14__ Number)
    } else {}
    if __x13__ {
      app __x15__ = (ToNumber x)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (AbstractEqualityComparison __x15__ y)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    app __x18__ = (Type x)
    if (= __x18__ Boolean) {
      app __x19__ = (ToNumber x)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      app __x20__ = (AbstractEqualityComparison __x19__ y)
      app __x21__ = (WrapCompletion __x20__)
      return __x21__
    } else {}
    app __x22__ = (Type y)
    if (= __x22__ Boolean) {
      app __x23__ = (ToNumber y)
      if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
      app __x24__ = (AbstractEqualityComparison x __x23__)
      app __x25__ = (WrapCompletion __x24__)
      return __x25__
    } else {}
    app __x26__ = (Type x)
    let __x27__ = (|| (|| (= __x26__ String) (= __x26__ Number)) (= __x26__ Symbol))
    if __x27__ {
      app __x28__ = (Type y)
      __x27__ = (= __x28__ Object)
    } else {}
    if __x27__ {
      app __x29__ = (ToPrimitive y)
      if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      app __x30__ = (AbstractEqualityComparison x __x29__)
      app __x31__ = (WrapCompletion __x30__)
      return __x31__
    } else {}
    app __x32__ = (Type x)
    let __x33__ = (= __x32__ Object)
    if __x33__ {
      app __x34__ = (Type y)
      __x33__ = (|| (|| (= __x34__ String) (= __x34__ Number)) (= __x34__ Symbol))
    } else {}
    if __x33__ {
      app __x35__ = (ToPrimitive x)
      if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
      app __x36__ = (AbstractEqualityComparison __x35__ y)
      app __x37__ = (WrapCompletion __x36__)
      return __x37__
    } else {}
    app __x38__ = (WrapCompletion false)
    return __x38__
  }
  */
}
