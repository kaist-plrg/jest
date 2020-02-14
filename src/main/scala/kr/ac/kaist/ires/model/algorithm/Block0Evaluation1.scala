package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Block0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""Block0Evaluation1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))), ILet(Id("""blockEnv"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""BlockDeclarationInstantiation"""))), List(ERef(RefId(Id("""StatementList"""))), ERef(RefId(Id("""blockEnv"""))))), IExpr(ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""blockEnv""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""StatementList"""))), EStr("""Evaluation""")), ILet(Id("""blockValue"""), ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""blockValue"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "Block0Evaluation1" (this, StatementList) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let blockEnv = __x0__
    app __x1__ = (BlockDeclarationInstantiation StatementList blockEnv)
    __x1__
    GLOBAL_context["LexicalEnvironment"] = blockEnv
    access __x2__ = (StatementList "Evaluation")
    let blockValue = __x2__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x3__ = (WrapCompletion blockValue)
    return __x3__
  }
  */
}
