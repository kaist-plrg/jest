package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Decode {
  val length: Int = 2
  val func: Func = Func("""Decode""", List(Id("""string"""), Id("""reservedSet""")), None, ISeq(List(ILet(Id("""strLen"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))), ILet(Id("""R"""), EStr("""""")), ILet(Id("""k"""), EINum(0L)), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""strLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""C"""))), EStr("""%"""))), ILet(Id("""S"""), ENotSupported("""StringOp""")), ISeq(List(ILet(Id("""start"""), ERef(RefId(Id("""k""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(2L))), IIf(ENotSupported("""NumberOp"""), ISeq(List(IExpr(ENotSupported("""Etc""")), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""reservedSet"""))), ERef(RefId(Id("""C"""))))), ILet(Id("""S"""), ENotSupported("""StringOp""")), IExpr(ENotSupported("""Etc"""))))), ISeq(List(IExpr(ENotSupported("""Etc""")), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(1L)), EBOp(OLt, EINum(4L), ERef(RefId(Id("""n"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_URIErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAssign(RefProp(RefId(Id("""Octets""")), EINum(0L)), ERef(RefId(Id("""B""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""j"""), EINum(1L)), IWhile(EBOp(OLt, ERef(RefId(Id("""j"""))), ERef(RefId(Id("""n""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(2L))), IAssign(RefProp(RefId(Id("""Octets""")), ERef(RefId(Id("""j""")))), ERef(RefId(Id("""B""")))), IAssign(RefId(Id("""j""")), EBOp(OPlus, ERef(RefId(Id("""j"""))), EINum(1L)))))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), ILet(Id("""S"""), ENotSupported("""StringOp""")))))))), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""S"""))))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))))))
  /* Beautified form:
  "Decode" (string, reservedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (! (= C "%")) let S = !!! "StringOp" else {
        let start = k
        !!! "Etc"
        !!! "Etc"
        !!! "Etc"
        k = (+ k 2i)
        if !!! "NumberOp" {
          !!! "Etc"
          if (! (contains reservedSet C)) let S = !!! "StringOp" else !!! "Etc"
        } else {
          !!! "Etc"
          if (|| (= n 1i) (< 4i n)) {
            app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x1__
          } else {}
          !!! "Etc"
          Octets[0i] = B
          !!! "Etc"
          let j = 1i
          while (< j n) {
            k = (+ k 1i)
            !!! "Etc"
            !!! "Etc"
            !!! "Etc"
            !!! "Etc"
            k = (+ k 2i)
            Octets[j] = B
            j = (+ j 1i)
          }
          !!! "Etc"
          !!! "Etc"
          let S = !!! "StringOp"
        }
      }
      R = (+ R S)
      k = (+ k 1i)
    }
  }
  */
}
