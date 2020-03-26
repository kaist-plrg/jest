package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIterResultObject {
  val length: Int = 2
  val func: Func = Func("""CreateIterResultObject""", List(Id("""value"""), Id("""done""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""done"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Boolean"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""value"""), ERef(RefId(Id("""value"""))))), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""done"""), ERef(RefId(Id("""done"""))))), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "CreateIterResultObject" (value, done) => {
    app __x0__ = (Type done)
    assert (= __x0__ Boolean)
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x1__
    app __x2__ = (CreateDataProperty obj "value" value)
    __x2__
    app __x3__ = (CreateDataProperty obj "done" done)
    __x3__
    app __x4__ = (WrapCompletion obj)
    return __x4__
  }
  */
}
