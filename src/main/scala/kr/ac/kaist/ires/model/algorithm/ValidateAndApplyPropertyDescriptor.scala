package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ValidateAndApplyPropertyDescriptor {
  val length: Int = 5
  val func: Func = Func("""ValidateAndApplyPropertyDescriptor""", List(Id("""O"""), Id("""P"""), Id("""extensible"""), Id("""Desc"""), Id("""current""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""current"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List()), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IAssign(RefId(Id("""__x2__""")), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)))))), IIf(ERef(RefId(Id("""__x2__"""))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(IAssign(RefId(Id("""dp""")), EMap(Ty("""DataProperty"""), List())), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Value""")), EUndef)), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Writable""")), EBool(false))), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), EBool(false))), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), EBool(false))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""dp""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(IAssign(RefId(Id("""dp""")), EMap(Ty("""AccessorProperty"""), List())), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Get""")), EUndef)), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Set""")), EUndef)), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), EBool(false))), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), EBool(false))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""dp""")))))), ISeq(List()))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""__x7__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent))), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Enumerable"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ISeq(List()), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""__x12__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x13__"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x15__"""))), EBool(true)), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x16__"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), EMap(Ty("""AccessorProperty"""), List((EStr("""Get"""), EUndef), (EStr("""Set"""), EUndef), (EStr("""Enumerable"""), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Enumerable""")))), (EStr("""Configurable"""), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Configurable"""))))))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x17__"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), EMap(Ty("""DataProperty"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Enumerable""")))), (EStr("""Configurable"""), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Configurable"""))))))))), ISeq(List()))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x18__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x19__"""))), EBool(true))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(true))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x20__""")))))), ISeq(List())), ILet(Id("""__x21__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent))), IIf(ERef(RefId(Id("""__x21__"""))), ISeq(List(IApp(Id("""__x22__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Value"""))))), IAssign(RefId(Id("""__x21__""")), EBOp(OEq, ERef(RefId(Id("""__x22__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x21__"""))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x23__""")))))), ISeq(List())), IApp(Id("""__x24__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x24__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(ILet(Id("""__x25__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent))), IIf(ERef(RefId(Id("""__x25__"""))), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Set"""))))), IAssign(RefId(Id("""__x25__""")), EBOp(OEq, ERef(RefId(Id("""__x26__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x25__"""))), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x27__""")))))), ISeq(List())), ILet(Id("""__x28__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent))), IIf(ERef(RefId(Id("""__x28__"""))), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Get"""))))), IAssign(RefId(Id("""__x28__""")), EBOp(OEq, ERef(RefId(Id("""__x29__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x28__"""))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x30__""")))))), ISeq(List())), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x31__""")))))), ISeq(List()))))))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x32__"""), EKeys(ERef(RefId(Id("""Desc"""))))), ILet(Id("""__x33__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x33__"""))), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x34__"""), ERef(RefProp(RefId(Id("""__x32__""")), ERef(RefId(Id("""__x33__""")))))), IAssign(RefProp(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""__x34__""")))), ERef(RefProp(RefId(Id("""Desc""")), ERef(RefId(Id("""__x34__""")))))), IAssign(RefId(Id("""__x33__""")), EBOp(OPlus, ERef(RefId(Id("""__x33__"""))), EINum(1L)))))))), ISeq(List())), IApp(Id("""__x35__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x35__""")))))))
  /* Beautified form:
  "ValidateAndApplyPropertyDescriptor" (O, P, extensible, Desc, current) => {
    if (= current undefined) {
      if (= extensible false) {
        app __x0__ = (WrapCompletion false)
        return __x0__
      } else {}
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
      } else {} else if (! (= O undefined)) {
        dp = (new AccessorProperty())
        if (! (= absent Desc["Get"])) dp["Get"] = Desc["Get"] else dp["Get"] = undefined
        if (! (= absent Desc["Set"])) dp["Set"] = Desc["Set"] else dp["Set"] = undefined
        if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
        if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
        O["SubMap"][P] = dp
      } else {}
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= absent Desc["Value"]) (&& (= absent Desc["Writable"]) (&& (= absent Desc["Get"]) (&& (= absent Desc["Set"]) (&& (= absent Desc["Enumerable"]) (= absent Desc["Configurable"])))))) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (= current["Configurable"] false) {
      if (= Desc["Configurable"] true) {
        app __x6__ = (WrapCompletion false)
        return __x6__
      } else {}
      let __x7__ = (! (= Desc["Enumerable"] absent))
      if __x7__ {
        app __x8__ = (SameValue Desc["Enumerable"] current["Enumerable"])
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        __x7__ = (= __x8__ false)
      } else {}
      if __x7__ {
        app __x9__ = (WrapCompletion false)
        return __x9__
      } else {}
    } else {}
    app __x10__ = (IsGenericDescriptor Desc)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    if (= __x10__ true) {} else {
      app __x11__ = (IsDataDescriptor current)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (IsDataDescriptor Desc)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      app __x13__ = (SameValue __x11__ __x12__)
      if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      if (= __x13__ false) {
        if (= current["Configurable"] false) {
          app __x14__ = (WrapCompletion false)
          return __x14__
        } else {}
        app __x15__ = (IsDataDescriptor current)
        if (= __x15__ true) if (! (= O undefined)) {
          let __x16__ = O["SubMap"][P]
          O["SubMap"][P] = (new AccessorProperty("Get" -> undefined, "Set" -> undefined, "Enumerable" -> __x16__["Enumerable"], "Configurable" -> __x16__["Configurable"]))
        } else {} else if (! (= O undefined)) {
          let __x17__ = O["SubMap"][P]
          O["SubMap"][P] = (new DataProperty("Value" -> undefined, "Writable" -> false, "Enumerable" -> __x17__["Enumerable"], "Configurable" -> __x17__["Configurable"]))
        } else {}
      } else {
        app __x18__ = (IsDataDescriptor current)
        app __x19__ = (IsDataDescriptor Desc)
        if (&& (= __x18__ true) (= __x19__ true)) if (&& (= current["Configurable"] false) (= current["Writable"] false)) {
          if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] true)) {
            app __x20__ = (WrapCompletion false)
            return __x20__
          } else {}
          let __x21__ = (! (= Desc["Value"] absent))
          if __x21__ {
            app __x22__ = (SameValue Desc["Value"] current["Value"])
            __x21__ = (= __x22__ false)
          } else {}
          if __x21__ {
            app __x23__ = (WrapCompletion false)
            return __x23__
          } else {}
          app __x24__ = (WrapCompletion true)
          return __x24__
        } else {} else if (= current["Configurable"] false) {
          let __x25__ = (! (= Desc["Set"] absent))
          if __x25__ {
            app __x26__ = (SameValue Desc["Set"] current["Set"])
            __x25__ = (= __x26__ false)
          } else {}
          if __x25__ {
            app __x27__ = (WrapCompletion false)
            return __x27__
          } else {}
          let __x28__ = (! (= Desc["Get"] absent))
          if __x28__ {
            app __x29__ = (SameValue Desc["Get"] current["Get"])
            __x28__ = (= __x29__ false)
          } else {}
          if __x28__ {
            app __x30__ = (WrapCompletion false)
            return __x30__
          } else {}
          app __x31__ = (WrapCompletion true)
          return __x31__
        } else {}
      }
    }
    if (! (= O undefined)) {
      let __x32__ = (map-keys Desc)
      let __x33__ = 0i
      while (< __x33__ __x32__["length"]) {
        let __x34__ = __x32__[__x33__]
        O["SubMap"][P][__x34__] = Desc[__x34__]
        __x33__ = (+ __x33__ 1i)
      }
    } else {}
    app __x35__ = (WrapCompletion true)
    return __x35__
  }
  */
}
