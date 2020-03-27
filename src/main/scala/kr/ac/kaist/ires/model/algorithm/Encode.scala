package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Encode {
  val length: Int = 2
  val func: Func = Func("""Encode""", List(Id("""string"""), Id("""unescapedSet""")), None, ISeq(List(ILet(Id("""strLen"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))), ILet(Id("""R"""), EStr("""""")), ILet(Id("""k"""), EINum(0L)), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""strLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IIf(EContains(ERef(RefId(Id("""unescapedSet"""))), ERef(RefId(Id("""C""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""C"""))))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CodePointAt"""))), List(ERef(RefId(Id("""string"""))), ERef(RefId(Id("""k"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""cp"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""cp""")), EStr("""IsUnpairedSurrogate"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_URIErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefProp(RefId(Id("""cp""")), EStr("""CodeUnitCount"""))))), IExpr(ENotSupported("""Etc""")), ILet(Id("""__x3__"""), ERef(RefId(Id("""Octets""")))), ILet(Id("""__x4__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""octet"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L)))))))))))))))
  /* Beautified form:
  "Encode" (string, unescapedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (contains unescapedSet C) {
        k = (+ k 1i)
        R = (+ R C)
      } else {
        app __x1__ = (CodePointAt string k)
        if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let cp = __x1__
        if (= cp["IsUnpairedSurrogate"] true) {
          app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x2__
        } else {}
        k = (+ k cp["CodeUnitCount"])
        !!! "Etc"
        let __x3__ = Octets
        let __x4__ = 0i
        while (< __x4__ __x3__["length"]) {
          let octet = __x3__[__x4__]
          !!! "Etc"
          __x4__ = (+ __x4__ 1i)
        }
      }
    }
  }
  */
}
