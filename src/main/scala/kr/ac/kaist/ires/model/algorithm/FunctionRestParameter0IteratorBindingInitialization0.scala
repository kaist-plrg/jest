package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionRestParameter0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""FunctionRestParameter0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingRestElement"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""ContainsExpression""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""IteratorBindingInitialization""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""currentContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""currentContext"""))), EStr("""VariableEnvironment""")), ILet(Id("""originalEnv"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""originalEnv"""))))), ILet(Id("""paramVarEnv"""), ERef(RefId(Id("""__x5__""")))), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""paramVarEnv""")))), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""paramVarEnv""")))), IAccess(Id("""__x6__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""IteratorBindingInitialization""")), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x7__""")))), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""originalEnv""")))), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""originalEnv""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "FunctionRestParameter0IteratorBindingInitialization0" (this, BindingRestElement, iteratorRecord, environment) => {
    access __x0__ = (BindingRestElement "ContainsExpression")
    if (= __x0__ false) {
      access __x1__ = (BindingRestElement "IteratorBindingInitialization")
      app __x2__ = (__x1__ iteratorRecord environment)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let currentContext = GLOBAL_context
    access __x4__ = (currentContext "VariableEnvironment")
    let originalEnv = __x4__
    app __x5__ = (NewDeclarativeEnvironment originalEnv)
    let paramVarEnv = __x5__
    currentContext["VariableEnvironment"] = paramVarEnv
    currentContext["LexicalEnvironment"] = paramVarEnv
    access __x6__ = (BindingRestElement "IteratorBindingInitialization")
    app __x7__ = (__x6__ iteratorRecord environment)
    let result = __x7__
    currentContext["VariableEnvironment"] = originalEnv
    currentContext["LexicalEnvironment"] = originalEnv
    app __x8__ = (WrapCompletion result)
    return __x8__
  }
  */
}
