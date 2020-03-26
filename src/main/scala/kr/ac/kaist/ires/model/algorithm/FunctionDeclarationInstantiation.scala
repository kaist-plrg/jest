package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclarationInstantiation {
  val length: Int = 2
  val func: Func = Func("""FunctionDeclarationInstantiation""", List(Id("""func"""), Id("""argumentsList""")), None, ISeq(List(ILet(Id("""calleeContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAccess(Id("""__x0__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")), ILet(Id("""env"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")))), ILet(Id("""code"""), ERef(RefProp(RefId(Id("""func""")), EStr("""ECMAScriptCode""")))), ILet(Id("""strict"""), ERef(RefProp(RefId(Id("""func""")), EStr("""Strict""")))), ILet(Id("""formals"""), ERef(RefProp(RefId(Id("""func""")), EStr("""FormalParameters""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""BoundNames""")), ILet(Id("""parameterNames"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDuplicate"""))), List(ERef(RefId(Id("""parameterNames"""))))), IIf(ERef(RefId(Id("""__x2__"""))), ILet(Id("""hasDuplicates"""), EBool(true)), ILet(Id("""hasDuplicates"""), EBool(false))), IAccess(Id("""__x3__"""), ERef(RefId(Id("""formals"""))), EStr("""IsSimpleParameterList""")), ILet(Id("""simpleParameterList"""), ERef(RefId(Id("""__x3__""")))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""formals"""))), EStr("""ContainsExpression""")), ILet(Id("""hasParameterExpressions"""), ERef(RefId(Id("""__x4__""")))), IAccess(Id("""__x5__"""), ERef(RefId(Id("""code"""))), EStr("""VarDeclaredNames""")), ILet(Id("""varNames"""), ERef(RefId(Id("""__x5__""")))), IAccess(Id("""__x6__"""), ERef(RefId(Id("""code"""))), EStr("""VarScopedDeclarations""")), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x6__""")))), IAccess(Id("""__x7__"""), ERef(RefId(Id("""code"""))), EStr("""LexicallyDeclaredNames""")), ILet(Id("""lexicalNames"""), ERef(RefId(Id("""__x7__""")))), ILet(Id("""functionNames"""), EList(List())), ILet(Id("""functionsToInitialize"""), EList(List())), ILet(Id("""__x8__"""), ERef(RefId(Id("""varDeclarations""")))), ILet(Id("""__x9__"""), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""length""")))), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x9__""")))), ISeq(List(IAssign(RefId(Id("""__x9__""")), EBOp(OSub, ERef(RefId(Id("""__x9__"""))), EINum(1L))), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x8__""")), ERef(RefId(Id("""__x9__""")))))), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAssert(EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """FunctionDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """GeneratorDeclaration""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """AsyncFunctionDeclaration""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """AsyncGeneratorDeclaration"""))), IAccess(Id("""__x10__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x10__""")), EINum(0L)))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""functionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IPrepend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""functionNames""")))), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))))), ISeq(List())))), ISeq(List()))))), ILet(Id("""argumentsObjectNeeded"""), EBool(true)), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""func""")), EStr("""ThisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), IAssign(RefId(Id("""argumentsObjectNeeded""")), EBool(false)), IIf(EContains(ERef(RefId(Id("""parameterNames"""))), EStr("""arguments""")), IAssign(RefId(Id("""argumentsObjectNeeded""")), EBool(false)), IIf(EBOp(OEq, ERef(RefId(Id("""hasParameterExpressions"""))), EBool(false)), IIf(EBOp(OOr, EContains(ERef(RefId(Id("""functionNames"""))), EStr("""arguments""")), EContains(ERef(RefId(Id("""lexicalNames"""))), EStr("""arguments"""))), IAssign(RefId(Id("""argumentsObjectNeeded""")), EBool(false)), ISeq(List())), ISeq(List())))), ILet(Id("""__x11__"""), ERef(RefId(Id("""parameterNames""")))), ILet(Id("""__x12__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x12__"""))), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""length""")))), ISeq(List(ILet(Id("""paramName"""), ERef(RefProp(RefId(Id("""__x11__""")), ERef(RefId(Id("""__x12__""")))))), IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""paramName"""))))), ILet(Id("""alreadyDeclared"""), ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""alreadyDeclared"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""paramName"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""paramName"""))), EUndef)), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x15__""")))))), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x12__""")), EBOp(OPlus, ERef(RefId(Id("""__x12__"""))), EINum(1L)))))), IIf(EBOp(OEq, ERef(RefId(Id("""argumentsObjectNeeded"""))), EBool(true)), ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""simpleParameterList"""))), EBool(false))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateUnmappedArgumentsObject"""))), List(ERef(RefId(Id("""argumentsList"""))))), ILet(Id("""ao"""), ERef(RefId(Id("""__x16__""")))))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""CreateMappedArgumentsObject"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""formals"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""envRec"""))))), ILet(Id("""ao"""), ERef(RefId(Id("""__x17__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), EStr("""arguments"""), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x18__""")))))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), EStr("""arguments"""), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x19__"""))))))), IApp(Id("""__x20__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), EStr("""arguments"""), ERef(RefId(Id("""ao"""))))), IExpr(ERef(RefId(Id("""__x20__""")))), ILet(Id("""__x21__"""), ECopy(ERef(RefId(Id("""parameterNames"""))))), IAppend(EStr("""arguments"""), ERef(RefId(Id("""__x21__""")))), ILet(Id("""parameterBindings"""), ERef(RefId(Id("""__x21__""")))))), ILet(Id("""parameterBindings"""), ERef(RefId(Id("""parameterNames"""))))), IApp(Id("""__x22__"""), ERef(RefId(Id("""CreateListIteratorRecord"""))), List(ERef(RefId(Id("""argumentsList"""))))), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x22__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), ISeq(List(IAccess(Id("""__x23__"""), ERef(RefId(Id("""formals"""))), EStr("""IteratorBindingInitialization""")), IApp(Id("""__x24__"""), ERef(RefId(Id("""__x23__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), EUndef)), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x24__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x24__""")), ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x24__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x24__""")))))), ISeq(List(IAccess(Id("""__x25__"""), ERef(RefId(Id("""formals"""))), EStr("""IteratorBindingInitialization""")), IApp(Id("""__x26__"""), ERef(RefId(Id("""__x25__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""env"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x26__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x26__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""hasParameterExpressions"""))), EBool(false)), ISeq(List(ILet(Id("""instantiatedVarNames"""), ECopy(ERef(RefId(Id("""parameterBindings"""))))), ILet(Id("""__x27__"""), ERef(RefId(Id("""varNames""")))), ILet(Id("""__x28__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x28__"""))), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""length""")))), ISeq(List(ILet(Id("""n"""), ERef(RefProp(RefId(Id("""__x27__""")), ERef(RefId(Id("""__x28__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""instantiatedVarNames"""))), ERef(RefId(Id("""n"""))))), ISeq(List(IAppend(ERef(RefId(Id("""n"""))), ERef(RefId(Id("""instantiatedVarNames""")))), IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""n"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x29__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x29__""")))), IApp(Id("""__x30__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""n"""))), EUndef)), IExpr(ERef(RefId(Id("""__x30__""")))))), ISeq(List())), IAssign(RefId(Id("""__x28__""")), EBOp(OPlus, ERef(RefId(Id("""__x28__"""))), EINum(1L)))))), ILet(Id("""varEnv"""), ERef(RefId(Id("""env""")))), ILet(Id("""varEnvRec"""), ERef(RefId(Id("""envRec""")))))), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""env"""))))), ILet(Id("""varEnv"""), ERef(RefId(Id("""__x31__""")))), ILet(Id("""varEnvRec"""), ERef(RefProp(RefId(Id("""varEnv""")), EStr("""EnvironmentRecord""")))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""varEnv""")))), ILet(Id("""instantiatedVarNames"""), EList(List())), ILet(Id("""__x32__"""), ERef(RefId(Id("""varNames""")))), ILet(Id("""__x33__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x33__"""))), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""length""")))), ISeq(List(ILet(Id("""n"""), ERef(RefProp(RefId(Id("""__x32__""")), ERef(RefId(Id("""__x33__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""instantiatedVarNames"""))), ERef(RefId(Id("""n"""))))), ISeq(List(IAppend(ERef(RefId(Id("""n"""))), ERef(RefId(Id("""instantiatedVarNames""")))), IApp(Id("""__x34__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""n"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x34__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x34__""")))), IIf(EBOp(OOr, EUOp(ONot, EContains(ERef(RefId(Id("""parameterBindings"""))), ERef(RefId(Id("""n"""))))), EContains(ERef(RefId(Id("""functionNames"""))), ERef(RefId(Id("""n"""))))), ILet(Id("""initialValue"""), EUndef), ISeq(List(IApp(Id("""__x35__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""n"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x35__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x35__"""))))), ISeq(List())), ILet(Id("""initialValue"""), ERef(RefId(Id("""__x35__"""))))))), IApp(Id("""__x36__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""n"""))), ERef(RefId(Id("""initialValue"""))))), IExpr(ERef(RefId(Id("""__x36__""")))))), ISeq(List())), IAssign(RefId(Id("""__x33__""")), EBOp(OPlus, ERef(RefId(Id("""__x33__"""))), EINum(1L))))))))), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(false)), ISeq(List(IApp(Id("""__x37__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""varEnv"""))))), ILet(Id("""lexEnv"""), ERef(RefId(Id("""__x37__""")))))), ILet(Id("""lexEnv"""), ERef(RefId(Id("""varEnv"""))))), ILet(Id("""lexEnvRec"""), ERef(RefProp(RefId(Id("""lexEnv""")), EStr("""EnvironmentRecord""")))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lexEnv""")))), IAccess(Id("""__x38__"""), ERef(RefId(Id("""code"""))), EStr("""LexicallyScopedDeclarations""")), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x38__""")))), ILet(Id("""__x39__"""), ERef(RefId(Id("""lexDeclarations""")))), ILet(Id("""__x40__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x40__"""))), ERef(RefProp(RefId(Id("""__x39__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x39__""")), ERef(RefId(Id("""__x40__""")))))), IAccess(Id("""__x41__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")), ILet(Id("""__x42__"""), ERef(RefId(Id("""__x41__""")))), ILet(Id("""__x43__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x43__"""))), ERef(RefProp(RefId(Id("""__x42__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x42__""")), ERef(RefId(Id("""__x43__""")))))), IAccess(Id("""__x44__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x44__"""))), EBool(true)), ISeq(List(IApp(Id("""__x45__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x45__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x45__""")), ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x45__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x45__""")))))), ISeq(List(IApp(Id("""__x46__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x46__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x46__""")), ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x46__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x46__"""))))))), IAssign(RefId(Id("""__x43__""")), EBOp(OPlus, ERef(RefId(Id("""__x43__"""))), EINum(1L)))))), IAssign(RefId(Id("""__x40__""")), EBOp(OPlus, ERef(RefId(Id("""__x40__"""))), EINum(1L)))))), ILet(Id("""__x47__"""), ERef(RefId(Id("""functionsToInitialize""")))), ILet(Id("""__x48__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x48__"""))), ERef(RefProp(RefId(Id("""__x47__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x47__""")), ERef(RefId(Id("""__x48__""")))))), IAccess(Id("""__x49__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x49__""")), EINum(0L)))), IAccess(Id("""__x50__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")), IApp(Id("""__x51__"""), ERef(RefId(Id("""__x50__"""))), List(ERef(RefId(Id("""lexEnv"""))))), ILet(Id("""fo"""), ERef(RefId(Id("""__x51__""")))), IApp(Id("""__x52__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x52__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x52__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x52__""")), ERef(RefProp(RefId(Id("""__x52__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x52__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x52__""")))), IAssign(RefId(Id("""__x48__""")), EBOp(OPlus, ERef(RefId(Id("""__x48__"""))), EINum(1L)))))), IApp(Id("""__x53__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x54__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x53__"""))))), IReturn(ERef(RefId(Id("""__x54__""")))))))
  /* Beautified form:
  "FunctionDeclarationInstantiation" (func, argumentsList) => {
    let calleeContext = GLOBAL_context
    access __x0__ = (calleeContext "LexicalEnvironment")
    let env = __x0__
    let envRec = env["EnvironmentRecord"]
    let code = func["ECMAScriptCode"]
    let strict = func["Strict"]
    let formals = func["FormalParameters"]
    access __x1__ = (formals "BoundNames")
    let parameterNames = __x1__
    app __x2__ = (IsDuplicate parameterNames)
    if __x2__ let hasDuplicates = true else let hasDuplicates = false
    access __x3__ = (formals "IsSimpleParameterList")
    let simpleParameterList = __x3__
    access __x4__ = (formals "ContainsExpression")
    let hasParameterExpressions = __x4__
    access __x5__ = (code "VarDeclaredNames")
    let varNames = __x5__
    access __x6__ = (code "VarScopedDeclarations")
    let varDeclarations = __x6__
    access __x7__ = (code "LexicallyDeclaredNames")
    let lexicalNames = __x7__
    let functionNames = (new [])
    let functionsToInitialize = (new [])
    let __x8__ = varDeclarations
    let __x9__ = __x8__["length"]
    while (< 0i __x9__) {
      __x9__ = (- __x9__ 1i)
      let d = __x8__[__x9__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        assert (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration))
        access __x10__ = (d "BoundNames")
        let fn = __x10__[0i]
        if (! (contains functionNames fn)) {
          prepend fn -> functionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let argumentsObjectNeeded = true
    if (= func["ThisMode"] CONST_lexical) argumentsObjectNeeded = false else if (contains parameterNames "arguments") argumentsObjectNeeded = false else if (= hasParameterExpressions false) if (|| (contains functionNames "arguments") (contains lexicalNames "arguments")) argumentsObjectNeeded = false else {} else {}
    let __x11__ = parameterNames
    let __x12__ = 0i
    while (< __x12__ __x11__["length"]) {
      let paramName = __x11__[__x12__]
      app __x13__ = (envRec["HasBinding"] envRec paramName)
      let alreadyDeclared = __x13__
      if (= alreadyDeclared false) {
        app __x14__ = (envRec["CreateMutableBinding"] envRec paramName false)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        __x14__
        if (= hasDuplicates true) {
          app __x15__ = (envRec["InitializeBinding"] envRec paramName undefined)
          if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          __x15__
        } else {}
      } else {}
      __x12__ = (+ __x12__ 1i)
    }
    if (= argumentsObjectNeeded true) {
      if (|| (= strict true) (= simpleParameterList false)) {
        app __x16__ = (CreateUnmappedArgumentsObject argumentsList)
        let ao = __x16__
      } else {
        app __x17__ = (CreateMappedArgumentsObject func formals argumentsList envRec)
        let ao = __x17__
      }
      if (= strict true) {
        app __x18__ = (envRec["CreateImmutableBinding"] envRec "arguments" false)
        if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        __x18__
      } else {
        app __x19__ = (envRec["CreateMutableBinding"] envRec "arguments" false)
        if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
      }
      app __x20__ = (envRec["InitializeBinding"] envRec "arguments" ao)
      __x20__
      let __x21__ = (copy-obj parameterNames)
      append "arguments" -> __x21__
      let parameterBindings = __x21__
    } else let parameterBindings = parameterNames
    app __x22__ = (CreateListIteratorRecord argumentsList)
    let iteratorRecord = __x22__
    if (= hasDuplicates true) {
      access __x23__ = (formals "IteratorBindingInitialization")
      app __x24__ = (__x23__ iteratorRecord undefined)
      if (= (typeof __x24__) "Completion") if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
      __x24__
    } else {
      access __x25__ = (formals "IteratorBindingInitialization")
      app __x26__ = (__x25__ iteratorRecord env)
      if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
      __x26__
    }
    if (= hasParameterExpressions false) {
      let instantiatedVarNames = (copy-obj parameterBindings)
      let __x27__ = varNames
      let __x28__ = 0i
      while (< __x28__ __x27__["length"]) {
        let n = __x27__[__x28__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x29__ = (envRec["CreateMutableBinding"] envRec n false)
          if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          __x29__
          app __x30__ = (envRec["InitializeBinding"] envRec n undefined)
          __x30__
        } else {}
        __x28__ = (+ __x28__ 1i)
      }
      let varEnv = env
      let varEnvRec = envRec
    } else {
      app __x31__ = (NewDeclarativeEnvironment env)
      let varEnv = __x31__
      let varEnvRec = varEnv["EnvironmentRecord"]
      calleeContext["VariableEnvironment"] = varEnv
      let instantiatedVarNames = (new [])
      let __x32__ = varNames
      let __x33__ = 0i
      while (< __x33__ __x32__["length"]) {
        let n = __x32__[__x33__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x34__ = (varEnvRec["CreateMutableBinding"] varEnvRec n false)
          if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
          __x34__
          if (|| (! (contains parameterBindings n)) (contains functionNames n)) let initialValue = undefined else {
            app __x35__ = (envRec["GetBindingValue"] envRec n false)
            if (= (typeof __x35__) "Completion") if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
            let initialValue = __x35__
          }
          app __x36__ = (varEnvRec["InitializeBinding"] varEnvRec n initialValue)
          __x36__
        } else {}
        __x33__ = (+ __x33__ 1i)
      }
    }
    if (= strict false) {
      app __x37__ = (NewDeclarativeEnvironment varEnv)
      let lexEnv = __x37__
    } else let lexEnv = varEnv
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    calleeContext["LexicalEnvironment"] = lexEnv
    access __x38__ = (code "LexicallyScopedDeclarations")
    let lexDeclarations = __x38__
    let __x39__ = lexDeclarations
    let __x40__ = 0i
    while (< __x40__ __x39__["length"]) {
      let d = __x39__[__x40__]
      access __x41__ = (d "BoundNames")
      let __x42__ = __x41__
      let __x43__ = 0i
      while (< __x43__ __x42__["length"]) {
        let dn = __x42__[__x43__]
        access __x44__ = (d "IsConstantDeclaration")
        if (= __x44__ true) {
          app __x45__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (= (typeof __x45__) "Completion") if (= __x45__["Type"] CONST_normal) __x45__ = __x45__["Value"] else return __x45__ else {}
          __x45__
        } else {
          app __x46__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (= (typeof __x46__) "Completion") if (= __x46__["Type"] CONST_normal) __x46__ = __x46__["Value"] else return __x46__ else {}
          __x46__
        }
        __x43__ = (+ __x43__ 1i)
      }
      __x40__ = (+ __x40__ 1i)
    }
    let __x47__ = functionsToInitialize
    let __x48__ = 0i
    while (< __x48__ __x47__["length"]) {
      let f = __x47__[__x48__]
      access __x49__ = (f "BoundNames")
      let fn = __x49__[0i]
      access __x50__ = (f "InstantiateFunctionObject")
      app __x51__ = (__x50__ lexEnv)
      let fo = __x51__
      app __x52__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
      if (= (typeof __x52__) "Completion") if (= __x52__["Type"] CONST_normal) __x52__ = __x52__["Value"] else return __x52__ else {}
      __x52__
      __x48__ = (+ __x48__ 1i)
    }
    app __x53__ = (NormalCompletion CONST_empty)
    app __x54__ = (WrapCompletion __x53__)
    return __x54__
  }
  */
}
