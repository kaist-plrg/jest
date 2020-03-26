package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvalDeclarationInstantiation {
  val length: Int = 4
  val func: Func = Func("""EvalDeclarationInstantiation""", List(Id("""body"""), Id("""varEnv"""), Id("""lexEnv"""), Id("""strict""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""body"""))), EStr("""VarDeclaredNames""")), ILet(Id("""varNames"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""body"""))), EStr("""VarScopedDeclarations""")), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""lexEnvRec"""), ERef(RefProp(RefId(Id("""lexEnv""")), EStr("""EnvironmentRecord""")))), ILet(Id("""varEnvRec"""), ERef(RefProp(RefId(Id("""varEnv""")), EStr("""EnvironmentRecord""")))), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(ILet(Id("""__x2__"""), ERef(RefId(Id("""varNames""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""name"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))))), ISeq(List())), ILet(Id("""thisLex"""), ERef(RefId(Id("""lexEnv""")))), IWhile(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""thisLex"""))), ERef(RefId(Id("""varEnv"""))))), ISeq(List(ILet(Id("""thisEnvRec"""), ERef(RefProp(RefId(Id("""thisLex""")), EStr("""EnvironmentRecord""")))), IIf(EUOp(ONot, EBOp(OEq, ETypeOf(ERef(RefId(Id("""thisEnvRec""")))), EStr("""ObjectEnvironmentRecord"""))), ISeq(List(ILet(Id("""__x6__"""), ERef(RefId(Id("""varNames""")))), ILet(Id("""__x7__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""thisEnvRec"""))), ERef(RefId(Id("""name"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L)))))))), ISeq(List())), IAssign(RefId(Id("""thisLex""")), ERef(RefProp(RefId(Id("""thisLex""")), EStr("""Outer"""))))))))), ISeq(List())), ILet(Id("""functionsToInitialize"""), EList(List())), ILet(Id("""declaredFunctionNames"""), EList(List())), ILet(Id("""__x10__"""), ERef(RefId(Id("""varDeclarations""")))), ILet(Id("""__x11__"""), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""length""")))), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x11__""")))), ISeq(List(IAssign(RefId(Id("""__x11__""")), EBOp(OSub, ERef(RefId(Id("""__x11__"""))), EINum(1L))), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x10__""")), ERef(RefId(Id("""__x11__""")))))), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAssert(EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """FunctionDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """GeneratorDeclaration""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """AsyncFunctionDeclaration""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """AsyncGeneratorDeclaration"""))), IAccess(Id("""__x12__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x12__""")), EINum(0L)))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CanDeclareGlobalFunction"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), ILet(Id("""fnDefinable"""), ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""fnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())))), ISeq(List())), IAppend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""declaredFunctionNames""")))), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))))), ISeq(List())))), ISeq(List()))))), ILet(Id("""declaredVarNames"""), EList(List())), ILet(Id("""__x15__"""), ERef(RefId(Id("""varDeclarations""")))), ILet(Id("""__x16__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x16__"""))), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x16__""")))))), IIf(EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier""")), ISeq(List(IAccess(Id("""__x17__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")), ILet(Id("""__x18__"""), ERef(RefId(Id("""__x17__""")))), ILet(Id("""__x19__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x19__"""))), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x18__""")), ERef(RefId(Id("""__x19__""")))))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""vn"""))))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x20__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CanDeclareGlobalVar"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x20__"""))))), ISeq(List())), ILet(Id("""vnDefinable"""), ERef(RefId(Id("""__x20__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""vnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x21__""")))))), ISeq(List())))), ISeq(List())), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredVarNames"""))), ERef(RefId(Id("""vn"""))))), IAppend(ERef(RefId(Id("""vn"""))), ERef(RefId(Id("""declaredVarNames""")))), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x19__""")), EBOp(OPlus, ERef(RefId(Id("""__x19__"""))), EINum(1L)))))))), ISeq(List())), IAssign(RefId(Id("""__x16__""")), EBOp(OPlus, ERef(RefId(Id("""__x16__"""))), EINum(1L)))))), IAccess(Id("""__x22__"""), ERef(RefId(Id("""body"""))), EStr("""LexicallyScopedDeclarations""")), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x22__""")))), ILet(Id("""__x23__"""), ERef(RefId(Id("""lexDeclarations""")))), ILet(Id("""__x24__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))), IAccess(Id("""__x25__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")), ILet(Id("""__x26__"""), ERef(RefId(Id("""__x25__""")))), ILet(Id("""__x27__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x27__"""))), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x26__""")), ERef(RefId(Id("""__x27__""")))))), IAccess(Id("""__x28__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x28__"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x29__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x29__""")))))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x30__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x30__"""))))))), IAssign(RefId(Id("""__x27__""")), EBOp(OPlus, ERef(RefId(Id("""__x27__"""))), EINum(1L)))))), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L)))))), ILet(Id("""__x31__"""), ERef(RefId(Id("""functionsToInitialize""")))), ILet(Id("""__x32__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x32__"""))), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x31__""")), ERef(RefId(Id("""__x32__""")))))), IAccess(Id("""__x33__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x33__""")), EINum(0L)))), IAccess(Id("""__x34__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")), IApp(Id("""__x35__"""), ERef(RefId(Id("""__x34__"""))), List(ERef(RefId(Id("""lexEnv"""))))), ILet(Id("""fo"""), ERef(RefId(Id("""__x35__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x36__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateGlobalFunctionBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x36__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x36__""")), ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x36__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x36__""")))))), ISeq(List(IApp(Id("""__x37__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))))), ILet(Id("""bindingExists"""), ERef(RefId(Id("""__x37__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""bindingExists"""))), EBool(false)), ISeq(List(IApp(Id("""__x38__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x38__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x38__""")), ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x38__"""))))), ISeq(List())), ILet(Id("""status"""), ERef(RefId(Id("""__x38__""")))), IApp(Id("""__x39__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x39__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x39__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x39__""")), ERef(RefProp(RefId(Id("""__x39__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x39__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x39__""")))))), ISeq(List(IApp(Id("""__x40__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x40__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x40__""")), ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x40__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x40__""")))))))))), IAssign(RefId(Id("""__x32__""")), EBOp(OPlus, ERef(RefId(Id("""__x32__"""))), EINum(1L)))))), ILet(Id("""__x41__"""), ERef(RefId(Id("""declaredVarNames""")))), ILet(Id("""__x42__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x42__"""))), ERef(RefProp(RefId(Id("""__x41__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x41__""")), ERef(RefId(Id("""__x42__""")))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x43__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateGlobalVarBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x43__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x43__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x43__""")), ERef(RefProp(RefId(Id("""__x43__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x43__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x43__""")))))), ISeq(List(IApp(Id("""__x44__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))))), ILet(Id("""bindingExists"""), ERef(RefId(Id("""__x44__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""bindingExists"""))), EBool(false)), ISeq(List(IApp(Id("""__x45__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x45__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x45__""")), ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x45__"""))))), ISeq(List())), ILet(Id("""status"""), ERef(RefId(Id("""__x45__""")))), IApp(Id("""__x46__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EUndef)), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x46__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x46__""")), ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x46__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x46__""")))))), ISeq(List()))))), IAssign(RefId(Id("""__x42__""")), EBOp(OPlus, ERef(RefId(Id("""__x42__"""))), EINum(1L)))))), IApp(Id("""__x47__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x48__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x47__"""))))), IReturn(ERef(RefId(Id("""__x48__""")))))))
  /* Beautified form:
  "EvalDeclarationInstantiation" (body, varEnv, lexEnv, strict) => {
    access __x0__ = (body "VarDeclaredNames")
    let varNames = __x0__
    access __x1__ = (body "VarScopedDeclarations")
    let varDeclarations = __x1__
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    let varEnvRec = varEnv["EnvironmentRecord"]
    if (= strict false) {
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        let __x2__ = varNames
        let __x3__ = 0i
        while (< __x3__ __x2__["length"]) {
          let name = __x2__[__x3__]
          app __x4__ = (varEnvRec["HasLexicalDeclaration"] varEnvRec name)
          if (= __x4__ true) {
            app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x5__
          } else {}
          __x3__ = (+ __x3__ 1i)
        }
      } else {}
      let thisLex = lexEnv
      while (! (= thisLex varEnv)) {
        let thisEnvRec = thisLex["EnvironmentRecord"]
        if (! (= (typeof thisEnvRec) "ObjectEnvironmentRecord")) {
          let __x6__ = varNames
          let __x7__ = 0i
          while (< __x7__ __x6__["length"]) {
            let name = __x6__[__x7__]
            app __x8__ = (thisEnvRec["HasBinding"] thisEnvRec name)
            if (= __x8__ true) {
              app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x9__
            } else {}
            __x7__ = (+ __x7__ 1i)
          }
        } else {}
        thisLex = thisLex["Outer"]
      }
    } else {}
    let functionsToInitialize = (new [])
    let declaredFunctionNames = (new [])
    let __x10__ = varDeclarations
    let __x11__ = __x10__["length"]
    while (< 0i __x11__) {
      __x11__ = (- __x11__ 1i)
      let d = __x10__[__x11__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        assert (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration))
        access __x12__ = (d "BoundNames")
        let fn = __x12__[0i]
        if (! (contains declaredFunctionNames fn)) {
          if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
            app __x13__ = (varEnvRec["CanDeclareGlobalFunction"] varEnvRec fn)
            if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
            let fnDefinable = __x13__
            if (= fnDefinable false) {
              app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x14__
            } else {}
          } else {}
          append fn -> declaredFunctionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let declaredVarNames = (new [])
    let __x15__ = varDeclarations
    let __x16__ = 0i
    while (< __x16__ __x15__["length"]) {
      let d = __x15__[__x16__]
      if (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier)) {
        access __x17__ = (d "BoundNames")
        let __x18__ = __x17__
        let __x19__ = 0i
        while (< __x19__ __x18__["length"]) {
          let vn = __x18__[__x19__]
          if (! (contains declaredFunctionNames vn)) {
            if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
              app __x20__ = (varEnvRec["CanDeclareGlobalVar"] varEnvRec vn)
              if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
              let vnDefinable = __x20__
              if (= vnDefinable false) {
                app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
                return __x21__
              } else {}
            } else {}
            if (! (contains declaredVarNames vn)) append vn -> declaredVarNames else {}
          } else {}
          __x19__ = (+ __x19__ 1i)
        }
      } else {}
      __x16__ = (+ __x16__ 1i)
    }
    access __x22__ = (body "LexicallyScopedDeclarations")
    let lexDeclarations = __x22__
    let __x23__ = lexDeclarations
    let __x24__ = 0i
    while (< __x24__ __x23__["length"]) {
      let d = __x23__[__x24__]
      access __x25__ = (d "BoundNames")
      let __x26__ = __x25__
      let __x27__ = 0i
      while (< __x27__ __x26__["length"]) {
        let dn = __x26__[__x27__]
        access __x28__ = (d "IsConstantDeclaration")
        if (= __x28__ true) {
          app __x29__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          __x29__
        } else {
          app __x30__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          __x30__
        }
        __x27__ = (+ __x27__ 1i)
      }
      __x24__ = (+ __x24__ 1i)
    }
    let __x31__ = functionsToInitialize
    let __x32__ = 0i
    while (< __x32__ __x31__["length"]) {
      let f = __x31__[__x32__]
      access __x33__ = (f "BoundNames")
      let fn = __x33__[0i]
      access __x34__ = (f "InstantiateFunctionObject")
      app __x35__ = (__x34__ lexEnv)
      let fo = __x35__
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        app __x36__ = (varEnvRec["CreateGlobalFunctionBinding"] varEnvRec fn fo true)
        if (= (typeof __x36__) "Completion") if (= __x36__["Type"] CONST_normal) __x36__ = __x36__["Value"] else return __x36__ else {}
        __x36__
      } else {
        app __x37__ = (varEnvRec["HasBinding"] varEnvRec fn)
        let bindingExists = __x37__
        if (= bindingExists false) {
          app __x38__ = (varEnvRec["CreateMutableBinding"] varEnvRec fn true)
          if (= (typeof __x38__) "Completion") if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
          let status = __x38__
          app __x39__ = (varEnvRec["InitializeBinding"] varEnvRec fn fo)
          if (= (typeof __x39__) "Completion") if (= __x39__["Type"] CONST_normal) __x39__ = __x39__["Value"] else return __x39__ else {}
          __x39__
        } else {
          app __x40__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
          if (= (typeof __x40__) "Completion") if (= __x40__["Type"] CONST_normal) __x40__ = __x40__["Value"] else return __x40__ else {}
          __x40__
        }
      }
      __x32__ = (+ __x32__ 1i)
    }
    let __x41__ = declaredVarNames
    let __x42__ = 0i
    while (< __x42__ __x41__["length"]) {
      let vn = __x41__[__x42__]
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        app __x43__ = (varEnvRec["CreateGlobalVarBinding"] varEnvRec vn true)
        if (= (typeof __x43__) "Completion") if (= __x43__["Type"] CONST_normal) __x43__ = __x43__["Value"] else return __x43__ else {}
        __x43__
      } else {
        app __x44__ = (varEnvRec["HasBinding"] varEnvRec vn)
        let bindingExists = __x44__
        if (= bindingExists false) {
          app __x45__ = (varEnvRec["CreateMutableBinding"] varEnvRec vn true)
          if (= (typeof __x45__) "Completion") if (= __x45__["Type"] CONST_normal) __x45__ = __x45__["Value"] else return __x45__ else {}
          let status = __x45__
          app __x46__ = (varEnvRec["InitializeBinding"] varEnvRec vn undefined)
          if (= (typeof __x46__) "Completion") if (= __x46__["Type"] CONST_normal) __x46__ = __x46__["Value"] else return __x46__ else {}
          __x46__
        } else {}
      }
      __x42__ = (+ __x42__ 1i)
    }
    app __x47__ = (NormalCompletion CONST_empty)
    app __x48__ = (WrapCompletion __x47__)
    return __x48__
  }
  */
}
