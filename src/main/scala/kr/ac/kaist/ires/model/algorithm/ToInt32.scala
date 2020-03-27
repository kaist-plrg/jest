package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToInt32 {
  val length: Int = 1
  val func: Func = Func("""ToInt32""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())), ILet(Id("""int32bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(4294967296L))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""int32bit"""))), EINum(2147483648L))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSub, ERef(RefId(Id("""int32bit"""))), EINum(4294967296L)))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int32bit"""))))), IReturn(ERef(RefId(Id("""__x3__"""))))))))))
  /* Beautified form:
  "ToInt32" (argument) => {
    app __x0__ = (ToNumber argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int32bit = (%% int 4294967296i)
    if (! (< int32bit 2147483648i)) {
      app __x2__ = (WrapCompletion (- int32bit 4294967296i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int32bit)
      return __x3__
    }
  }
  */
}
