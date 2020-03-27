package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ValidateAndApplyPropertyDescriptor {
  val length: Int = 5
  val func: Func = Func("""ValidateAndApplyPropertyDescriptor""", List(Id("""O"""), Id("""P"""), Id("""extensible"""), Id("""Desc"""), Id("""current""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""current"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IAssert(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List()), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IAssign(RefId(Id("""__x2__""")), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)))))), IIf(ERef(RefId(Id("""__x2__"""))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(IAssign(RefId(Id("""dp""")), EMap(Ty("""DataProperty"""), List())), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Value""")), EUndef)), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Writable""")), EBool(false))), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), EBool(false))), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), EBool(false))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""dp""")))))), ISeq(List())), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IAssert(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(IAssign(RefId(Id("""dp""")), EMap(Ty("""AccessorProperty"""), List())), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Get""")), EUndef)), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Set""")), EUndef)), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), EBool(false))), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), EBool(false))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""dp""")))))), ISeq(List()))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), ILet(Id("""__x8__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent))), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Enumerable"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), IAssign(RefId(Id("""__x8__""")), EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(true)), ISeq(List()), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IApp(Id("""__x14__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""__x12__"""))), ERef(RefId(Id("""__x13__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x14__"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x16__"""))), EBool(true)), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x17__"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), EMap(Ty("""AccessorProperty"""), List((EStr("""Get"""), EUndef), (EStr("""Set"""), EUndef), (EStr("""Enumerable"""), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Enumerable""")))), (EStr("""Configurable"""), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Configurable"""))))))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x18__"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), EMap(Ty("""DataProperty"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Enumerable""")))), (EStr("""Configurable"""), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Configurable"""))))))))), ISeq(List()))))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IApp(Id("""__x20__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x19__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x20__"""))), EBool(true))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(true))), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x21__""")))))), ISeq(List())), ILet(Id("""__x22__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent))), IIf(ERef(RefId(Id("""__x22__"""))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Value"""))))), IAssign(RefId(Id("""__x22__""")), EBOp(OEq, ERef(RefId(Id("""__x23__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x22__"""))), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x24__""")))))), ISeq(List())), IApp(Id("""__x25__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x25__""")))))), ISeq(List())), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x26__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x26__"""))))), ISeq(List())), IApp(Id("""__x27__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x27__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x27__"""))))), ISeq(List())), IAssert(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x26__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x27__"""))), EBool(true)))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(ILet(Id("""__x28__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent))), IIf(ERef(RefId(Id("""__x28__"""))), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Set"""))))), IAssign(RefId(Id("""__x28__""")), EBOp(OEq, ERef(RefId(Id("""__x29__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x28__"""))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x30__""")))))), ISeq(List())), ILet(Id("""__x31__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent))), IIf(ERef(RefId(Id("""__x31__"""))), ISeq(List(IApp(Id("""__x32__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Get"""))))), IAssign(RefId(Id("""__x31__""")), EBOp(OEq, ERef(RefId(Id("""__x32__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x31__"""))), ISeq(List(IApp(Id("""__x33__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x33__""")))))), ISeq(List())), IApp(Id("""__x34__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x34__""")))))), ISeq(List()))))))))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x35__"""), EKeys(ERef(RefId(Id("""Desc"""))))), ILet(Id("""__x36__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x36__"""))), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x37__"""), ERef(RefProp(RefId(Id("""__x35__""")), ERef(RefId(Id("""__x36__""")))))), IAssign(RefProp(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""__x37__""")))), ERef(RefProp(RefId(Id("""Desc""")), ERef(RefId(Id("""__x37__""")))))), IAssign(RefId(Id("""__x36__""")), EBOp(OPlus, ERef(RefId(Id("""__x36__"""))), EINum(1L)))))))), ISeq(List())), IApp(Id("""__x38__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x38__""")))))))
  /* Beautified form:
  "ValidateAndApplyPropertyDescriptor" (O, P, extensible, Desc, current) => {
    if (= current undefined) {
      if (= extensible false) {
        app __x0__ = (WrapCompletion false)
        return __x0__
      } else {}
      assert (= extensible true)
      app __x1__ = (IsGenericDescriptor Desc)
      let __x2__ = (= __x1__ true)
      if __x2__ {} else {
        app __x3__ = (IsDataDescriptor Desc)
        __x2__ = (= __x3__ true)
      }
      if __x2__ if (! (= O undefined)) {
        dp = (new DataProperty())
        if (! (= absent Desc["Value"])) dp["Value"] = Desc["Value"] else dp["Value"] = undefined
        if (! (= absent Desc["Writable"])) dp["Writable"] = Desc["Writable"] else dp["Writable"] = false
        if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
        if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
        O["SubMap"][P] = dp
      } else {} else {
        app __x4__ = (IsAccessorDescriptor Desc)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        assert (= __x4__ true)
        if (! (= O undefined)) {
          dp = (new AccessorProperty())
          if (! (= absent Desc["Get"])) dp["Get"] = Desc["Get"] else dp["Get"] = undefined
          if (! (= absent Desc["Set"])) dp["Set"] = Desc["Set"] else dp["Set"] = undefined
          if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
          if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
          O["SubMap"][P] = dp
        } else {}
      }
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (&& (= absent Desc["Value"]) (&& (= absent Desc["Writable"]) (&& (= absent Desc["Get"]) (&& (= absent Desc["Set"]) (&& (= absent Desc["Enumerable"]) (= absent Desc["Configurable"])))))) {
      app __x6__ = (WrapCompletion true)
      return __x6__
    } else {}
    if (= current["Configurable"] false) {
      if (= Desc["Configurable"] true) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
      let __x8__ = (! (= Desc["Enumerable"] absent))
      if __x8__ {
        app __x9__ = (SameValue Desc["Enumerable"] current["Enumerable"])
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x8__ = (= __x9__ false)
      } else {}
      if __x8__ {
        app __x10__ = (WrapCompletion false)
        return __x10__
      } else {}
    } else {}
    app __x11__ = (IsGenericDescriptor Desc)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    if (= __x11__ true) {} else {
      app __x12__ = (IsDataDescriptor current)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      app __x13__ = (IsDataDescriptor Desc)
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      app __x14__ = (SameValue __x12__ __x13__)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      if (= __x14__ false) {
        if (= current["Configurable"] false) {
          app __x15__ = (WrapCompletion false)
          return __x15__
        } else {}
        app __x16__ = (IsDataDescriptor current)
        if (= __x16__ true) if (! (= O undefined)) {
          let __x17__ = O["SubMap"][P]
          O["SubMap"][P] = (new AccessorProperty("Get" -> undefined, "Set" -> undefined, "Enumerable" -> __x17__["Enumerable"], "Configurable" -> __x17__["Configurable"]))
        } else {} else if (! (= O undefined)) {
          let __x18__ = O["SubMap"][P]
          O["SubMap"][P] = (new DataProperty("Value" -> undefined, "Writable" -> false, "Enumerable" -> __x18__["Enumerable"], "Configurable" -> __x18__["Configurable"]))
        } else {}
      } else {
        app __x19__ = (IsDataDescriptor current)
        app __x20__ = (IsDataDescriptor Desc)
        if (&& (= __x19__ true) (= __x20__ true)) if (&& (= current["Configurable"] false) (= current["Writable"] false)) {
          if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] true)) {
            app __x21__ = (WrapCompletion false)
            return __x21__
          } else {}
          let __x22__ = (! (= Desc["Value"] absent))
          if __x22__ {
            app __x23__ = (SameValue Desc["Value"] current["Value"])
            __x22__ = (= __x23__ false)
          } else {}
          if __x22__ {
            app __x24__ = (WrapCompletion false)
            return __x24__
          } else {}
          app __x25__ = (WrapCompletion true)
          return __x25__
        } else {} else {
          app __x26__ = (IsAccessorDescriptor current)
          if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
          app __x27__ = (IsAccessorDescriptor Desc)
          if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
          assert (&& (= __x26__ true) (= __x27__ true))
          if (= current["Configurable"] false) {
            let __x28__ = (! (= Desc["Set"] absent))
            if __x28__ {
              app __x29__ = (SameValue Desc["Set"] current["Set"])
              __x28__ = (= __x29__ false)
            } else {}
            if __x28__ {
              app __x30__ = (WrapCompletion false)
              return __x30__
            } else {}
            let __x31__ = (! (= Desc["Get"] absent))
            if __x31__ {
              app __x32__ = (SameValue Desc["Get"] current["Get"])
              __x31__ = (= __x32__ false)
            } else {}
            if __x31__ {
              app __x33__ = (WrapCompletion false)
              return __x33__
            } else {}
            app __x34__ = (WrapCompletion true)
            return __x34__
          } else {}
        }
      }
    }
    if (! (= O undefined)) {
      let __x35__ = (map-keys Desc)
      let __x36__ = 0i
      while (< __x36__ __x35__["length"]) {
        let __x37__ = __x35__[__x36__]
        O["SubMap"][P][__x37__] = Desc[__x37__]
        __x36__ = (+ __x36__ 1i)
      }
    } else {}
    app __x38__ = (WrapCompletion true)
    return __x38__
  }
  */
}
