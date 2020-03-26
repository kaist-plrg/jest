package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSharedByteDataBlock {
  val length: Int = 1
  val func: Func = Func("""CreateSharedByteDataBlock""", List(Id("""size""")), None, ISeq(List(IAssert(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""size"""))), EINum(0L)))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), ILet(Id("""zero"""), EList(List(EINum(0L)))), ILet(Id("""__x0__"""), ERef(RefId(Id("""db""")))), ILet(Id("""__x1__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""i"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))), IAppend(EMap(Ty("""WriteSharedMemory"""), List((EStr("""Order"""), EStr("""Init""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""db""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""i""")))), (EStr("""ElementSize"""), EINum(1L)), (EStr("""Payload"""), ERef(RefId(Id("""zero""")))))), ERef(RefId(Id("""eventList""")))), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L)))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""db"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "CreateSharedByteDataBlock" (size) => {
    assert (! (< size 0i))
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    let zero = (new [0i])
    let __x0__ = db
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let i = __x0__[__x1__]
      append (new WriteSharedMemory("Order" -> "Init", "NoTear" -> true, "Block" -> db, "ByteIndex" -> i, "ElementSize" -> 1i, "Payload" -> zero)) -> eventList
      __x1__ = (+ __x1__ 1i)
    }
    app __x2__ = (WrapCompletion db)
    return __x2__
  }
  */
}
