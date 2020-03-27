package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Object.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""[object Undefined]"""))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ENull), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""[object Null]"""))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""isArray"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""isArray"""))), EBool(true)), ILet(Id("""builtinTag"""), EStr("""Array""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""ParameterMap"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Arguments""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""Call"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Function""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""ErrorData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Error""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""BooleanData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Boolean""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""NumberData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Number""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""StringData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""String""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""DateValue"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Date""")), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""RegExpMatcher"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""RegExp""")), ILet(Id("""builtinTag"""), EStr("""Object"""))))))))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""SYMBOL_toStringTag"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""tag"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""tag"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""String"""))))), IAssign(RefId(Id("""tag""")), ERef(RefId(Id("""builtinTag""")))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EStr("""[object """), ERef(RefId(Id("""tag""")))), EStr("""]""")))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "GLOBAL.Object.prototype.toString" (this, argumentsList, NewTarget) => {
    if (= this undefined) {
      app __x0__ = (WrapCompletion "[object Undefined]")
      return __x0__
    } else {}
    if (= this null) {
      app __x1__ = (WrapCompletion "[object Null]")
      return __x1__
    } else {}
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (IsArray O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let isArray = __x3__
    if (= isArray true) let builtinTag = "Array" else if (! (= O["ParameterMap"] absent)) let builtinTag = "Arguments" else if (! (= O["Call"] absent)) let builtinTag = "Function" else if (! (= O["ErrorData"] absent)) let builtinTag = "Error" else if (! (= O["BooleanData"] absent)) let builtinTag = "Boolean" else if (! (= O["NumberData"] absent)) let builtinTag = "Number" else if (! (= O["StringData"] absent)) let builtinTag = "String" else if (! (= O["DateValue"] absent)) let builtinTag = "Date" else if (! (= O["RegExpMatcher"] absent)) let builtinTag = "RegExp" else let builtinTag = "Object"
    app __x4__ = (Get O SYMBOL_toStringTag)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let tag = __x4__
    app __x5__ = (Type tag)
    if (! (= __x5__ String)) tag = builtinTag else {}
    app __x6__ = (WrapCompletion (+ (+ "[object " tag) "]"))
    return __x6__
  }
  */
}
