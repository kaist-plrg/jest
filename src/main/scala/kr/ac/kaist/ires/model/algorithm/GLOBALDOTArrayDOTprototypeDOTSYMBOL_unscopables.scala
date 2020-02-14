package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTSYMBOL_unscopables {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.SYMBOL_unscopables""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)), ILet(Id("""unscopableList"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""copyWithin"""), EBool(true))), IExpr(ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""entries"""), EBool(true))), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""fill"""), EBool(true))), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""find"""), EBool(true))), IExpr(ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""findIndex"""), EBool(true))), IExpr(ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""flat"""), EBool(true))), IExpr(ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""flatMap"""), EBool(true))), IExpr(ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""includes"""), EBool(true))), IExpr(ERef(RefId(Id("""__x8__""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""keys"""), EBool(true))), IExpr(ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""values"""), EBool(true))), IExpr(ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""unscopableList"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))))
  /* Beautified form:
  "GLOBAL.Array.prototype.SYMBOL_unscopables" (this, argumentsList, NewTarget) => {
    app __x0__ = (ObjectCreate null)
    let unscopableList = __x0__
    app __x1__ = (CreateDataProperty unscopableList "copyWithin" true)
    __x1__
    app __x2__ = (CreateDataProperty unscopableList "entries" true)
    __x2__
    app __x3__ = (CreateDataProperty unscopableList "fill" true)
    __x3__
    app __x4__ = (CreateDataProperty unscopableList "find" true)
    __x4__
    app __x5__ = (CreateDataProperty unscopableList "findIndex" true)
    __x5__
    app __x6__ = (CreateDataProperty unscopableList "flat" true)
    __x6__
    app __x7__ = (CreateDataProperty unscopableList "flatMap" true)
    __x7__
    app __x8__ = (CreateDataProperty unscopableList "includes" true)
    __x8__
    app __x9__ = (CreateDataProperty unscopableList "keys" true)
    __x9__
    app __x10__ = (CreateDataProperty unscopableList "values" true)
    __x10__
    app __x11__ = (WrapCompletion unscopableList)
    return __x11__
  }
  */
}
