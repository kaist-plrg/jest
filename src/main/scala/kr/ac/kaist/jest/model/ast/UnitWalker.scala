package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, Lexical }
import kr.ac.kaist.jest.ir._

trait UnitWalker {
  def beforeWalk[T <: AST](ast: T): Unit = {}
  private def id[T <: AST](ast: T, hook: T => Unit): T = { hook(ast); ast }
  def walk(str: String): Unit = {}
  def walk(bool: Boolean): Unit = {}
  def walkOpt[T](opt: Option[T], tWalk: T => Unit): Unit = opt.foreach(tWalk)
  def walkList[T](list: List[T], tWalk: T => Unit): Unit = list.foreach(tWalk)
  def walk(ast: AST): Unit = id(ast, beforeWalk) match {
    case ast: Lexical => walk(ast)
    case ast: IdentifierReference => walk(ast)
    case ast: BindingIdentifier => walk(ast)
    case ast: LabelIdentifier => walk(ast)
    case ast: Identifier => walk(ast)
    case ast: PrimaryExpression => walk(ast)
    case ast: CoverParenthesizedExpressionAndArrowParameterList => walk(ast)
    case ast: ParenthesizedExpression => walk(ast)
    case ast: Literal => walk(ast)
    case ast: ArrayLiteral => walk(ast)
    case ast: ElementList => walk(ast)
    case ast: Elision => walk(ast)
    case ast: SpreadElement => walk(ast)
    case ast: ObjectLiteral => walk(ast)
    case ast: PropertyDefinitionList => walk(ast)
    case ast: PropertyDefinition => walk(ast)
    case ast: PropertyName => walk(ast)
    case ast: LiteralPropertyName => walk(ast)
    case ast: ComputedPropertyName => walk(ast)
    case ast: CoverInitializedName => walk(ast)
    case ast: Initializer => walk(ast)
    case ast: TemplateLiteral => walk(ast)
    case ast: SubstitutionTemplate => walk(ast)
    case ast: TemplateSpans => walk(ast)
    case ast: TemplateMiddleList => walk(ast)
    case ast: MemberExpression => walk(ast)
    case ast: SuperProperty => walk(ast)
    case ast: MetaProperty => walk(ast)
    case ast: NewTarget => walk(ast)
    case ast: ImportMeta => walk(ast)
    case ast: NewExpression => walk(ast)
    case ast: CallExpression => walk(ast)
    case ast: CallMemberExpression => walk(ast)
    case ast: SuperCall => walk(ast)
    case ast: ImportCall => walk(ast)
    case ast: Arguments => walk(ast)
    case ast: ArgumentList => walk(ast)
    case ast: OptionalExpression => walk(ast)
    case ast: OptionalChain => walk(ast)
    case ast: LeftHandSideExpression => walk(ast)
    case ast: UpdateExpression => walk(ast)
    case ast: UnaryExpression => walk(ast)
    case ast: ExponentiationExpression => walk(ast)
    case ast: MultiplicativeExpression => walk(ast)
    case ast: MultiplicativeOperator => walk(ast)
    case ast: AdditiveExpression => walk(ast)
    case ast: ShiftExpression => walk(ast)
    case ast: RelationalExpression => walk(ast)
    case ast: EqualityExpression => walk(ast)
    case ast: BitwiseANDExpression => walk(ast)
    case ast: BitwiseXORExpression => walk(ast)
    case ast: BitwiseORExpression => walk(ast)
    case ast: LogicalANDExpression => walk(ast)
    case ast: LogicalORExpression => walk(ast)
    case ast: CoalesceExpression => walk(ast)
    case ast: CoalesceExpressionHead => walk(ast)
    case ast: ShortCircuitExpression => walk(ast)
    case ast: ConditionalExpression => walk(ast)
    case ast: AssignmentExpression => walk(ast)
    case ast: AssignmentOperator => walk(ast)
    case ast: AssignmentPattern => walk(ast)
    case ast: ObjectAssignmentPattern => walk(ast)
    case ast: ArrayAssignmentPattern => walk(ast)
    case ast: AssignmentRestProperty => walk(ast)
    case ast: AssignmentPropertyList => walk(ast)
    case ast: AssignmentElementList => walk(ast)
    case ast: AssignmentElisionElement => walk(ast)
    case ast: AssignmentProperty => walk(ast)
    case ast: AssignmentElement => walk(ast)
    case ast: AssignmentRestElement => walk(ast)
    case ast: DestructuringAssignmentTarget => walk(ast)
    case ast: Expression => walk(ast)
    case ast: Statement => walk(ast)
    case ast: Declaration => walk(ast)
    case ast: HoistableDeclaration => walk(ast)
    case ast: BreakableStatement => walk(ast)
    case ast: BlockStatement => walk(ast)
    case ast: Block => walk(ast)
    case ast: StatementList => walk(ast)
    case ast: StatementListItem => walk(ast)
    case ast: LexicalDeclaration => walk(ast)
    case ast: LetOrConst => walk(ast)
    case ast: BindingList => walk(ast)
    case ast: LexicalBinding => walk(ast)
    case ast: VariableStatement => walk(ast)
    case ast: VariableDeclarationList => walk(ast)
    case ast: VariableDeclaration => walk(ast)
    case ast: BindingPattern => walk(ast)
    case ast: ObjectBindingPattern => walk(ast)
    case ast: ArrayBindingPattern => walk(ast)
    case ast: BindingRestProperty => walk(ast)
    case ast: BindingPropertyList => walk(ast)
    case ast: BindingElementList => walk(ast)
    case ast: BindingElisionElement => walk(ast)
    case ast: BindingProperty => walk(ast)
    case ast: BindingElement => walk(ast)
    case ast: SingleNameBinding => walk(ast)
    case ast: BindingRestElement => walk(ast)
    case ast: EmptyStatement => walk(ast)
    case ast: ExpressionStatement => walk(ast)
    case ast: IfStatement => walk(ast)
    case ast: IterationStatement => walk(ast)
    case ast: ForDeclaration => walk(ast)
    case ast: ForBinding => walk(ast)
    case ast: ContinueStatement => walk(ast)
    case ast: BreakStatement => walk(ast)
    case ast: ReturnStatement => walk(ast)
    case ast: WithStatement => walk(ast)
    case ast: SwitchStatement => walk(ast)
    case ast: CaseBlock => walk(ast)
    case ast: CaseClauses => walk(ast)
    case ast: CaseClause => walk(ast)
    case ast: DefaultClause => walk(ast)
    case ast: LabelledStatement => walk(ast)
    case ast: LabelledItem => walk(ast)
    case ast: ThrowStatement => walk(ast)
    case ast: TryStatement => walk(ast)
    case ast: Catch => walk(ast)
    case ast: Finally => walk(ast)
    case ast: CatchParameter => walk(ast)
    case ast: DebuggerStatement => walk(ast)
    case ast: FunctionDeclaration => walk(ast)
    case ast: FunctionExpression => walk(ast)
    case ast: UniqueFormalParameters => walk(ast)
    case ast: FormalParameters => walk(ast)
    case ast: FormalParameterList => walk(ast)
    case ast: FunctionRestParameter => walk(ast)
    case ast: FormalParameter => walk(ast)
    case ast: FunctionBody => walk(ast)
    case ast: FunctionStatementList => walk(ast)
    case ast: ArrowFunction => walk(ast)
    case ast: ArrowParameters => walk(ast)
    case ast: ConciseBody => walk(ast)
    case ast: ExpressionBody => walk(ast)
    case ast: ArrowFormalParameters => walk(ast)
    case ast: AsyncArrowFunction => walk(ast)
    case ast: AsyncConciseBody => walk(ast)
    case ast: AsyncArrowBindingIdentifier => walk(ast)
    case ast: CoverCallExpressionAndAsyncArrowHead => walk(ast)
    case ast: AsyncArrowHead => walk(ast)
    case ast: MethodDefinition => walk(ast)
    case ast: PropertySetParameterList => walk(ast)
    case ast: GeneratorMethod => walk(ast)
    case ast: GeneratorDeclaration => walk(ast)
    case ast: GeneratorExpression => walk(ast)
    case ast: GeneratorBody => walk(ast)
    case ast: YieldExpression => walk(ast)
    case ast: AsyncGeneratorMethod => walk(ast)
    case ast: AsyncGeneratorDeclaration => walk(ast)
    case ast: AsyncGeneratorExpression => walk(ast)
    case ast: AsyncGeneratorBody => walk(ast)
    case ast: AsyncFunctionDeclaration => walk(ast)
    case ast: AsyncFunctionExpression => walk(ast)
    case ast: AsyncMethod => walk(ast)
    case ast: AsyncFunctionBody => walk(ast)
    case ast: AwaitExpression => walk(ast)
    case ast: ClassDeclaration => walk(ast)
    case ast: ClassExpression => walk(ast)
    case ast: ClassTail => walk(ast)
    case ast: ClassHeritage => walk(ast)
    case ast: ClassBody => walk(ast)
    case ast: ClassElementList => walk(ast)
    case ast: ClassElement => walk(ast)
    case ast: Script => walk(ast)
    case ast: ScriptBody => walk(ast)
    case ast: Module => walk(ast)
    case ast: ModuleBody => walk(ast)
    case ast: ModuleItemList => walk(ast)
    case ast: ModuleItem => walk(ast)
    case ast: ImportDeclaration => walk(ast)
    case ast: ImportClause => walk(ast)
    case ast: ImportedDefaultBinding => walk(ast)
    case ast: NameSpaceImport => walk(ast)
    case ast: NamedImports => walk(ast)
    case ast: FromClause => walk(ast)
    case ast: ImportsList => walk(ast)
    case ast: ImportSpecifier => walk(ast)
    case ast: ModuleSpecifier => walk(ast)
    case ast: ImportedBinding => walk(ast)
    case ast: ExportDeclaration => walk(ast)
    case ast: ExportFromClause => walk(ast)
    case ast: NamedExports => walk(ast)
    case ast: ExportsList => walk(ast)
    case ast: ExportSpecifier => walk(ast)
  }
  def walk(ast: Lexical): Unit = { walk(ast.kind); walk(ast.str) }
  def walk(ast: IdentifierReference): Unit = id(ast, beforeWalk) match {
    case IdentifierReference0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case IdentifierReference1(ps) => walkList[Boolean](ps, walk)
    case IdentifierReference2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingIdentifier): Unit = id(ast, beforeWalk) match {
    case BindingIdentifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingIdentifier1(ps) => walkList[Boolean](ps, walk)
    case BindingIdentifier2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: LabelIdentifier): Unit = id(ast, beforeWalk) match {
    case LabelIdentifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LabelIdentifier1(ps) => walkList[Boolean](ps, walk)
    case LabelIdentifier2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: Identifier): Unit = id(ast, beforeWalk) match {
    case Identifier0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: PrimaryExpression): Unit = id(ast, beforeWalk) match {
    case PrimaryExpression0(ps) => walkList[Boolean](ps, walk)
    case PrimaryExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression4(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression5(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression6(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression7(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression8(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression9(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression10(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression11(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PrimaryExpression12(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoverParenthesizedExpressionAndArrowParameterList): Unit = id(ast, beforeWalk) match {
    case CoverParenthesizedExpressionAndArrowParameterList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CoverParenthesizedExpressionAndArrowParameterList1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CoverParenthesizedExpressionAndArrowParameterList2(ps) => walkList[Boolean](ps, walk)
    case CoverParenthesizedExpressionAndArrowParameterList3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CoverParenthesizedExpressionAndArrowParameterList4(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CoverParenthesizedExpressionAndArrowParameterList5(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case CoverParenthesizedExpressionAndArrowParameterList6(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ParenthesizedExpression): Unit = id(ast, beforeWalk) match {
    case ParenthesizedExpression0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Literal): Unit = id(ast, beforeWalk) match {
    case Literal0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Literal1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Literal2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Literal3(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrayLiteral): Unit = id(ast, beforeWalk) match {
    case ArrayLiteral0(x0, ps) =>
      walkOpt[Elision](x0, walk); walkList[Boolean](ps, walk)
    case ArrayLiteral1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrayLiteral2(x0, x1, ps) => walk(x0); walkOpt[Elision](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ElementList): Unit = id(ast, beforeWalk) match {
    case ElementList0(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
    case ElementList1(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
    case ElementList2(x0, x1, x2, ps) =>
      walk(x0); walkOpt[Elision](x1, walk); walk(x2); walkList[Boolean](ps, walk)
    case ElementList3(x0, x1, x2, ps) => walk(x0); walkOpt[Elision](x1, walk); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: Elision): Unit = id(ast, beforeWalk) match {
    case Elision0(ps) => walkList[Boolean](ps, walk)
    case Elision1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: SpreadElement): Unit = id(ast, beforeWalk) match {
    case SpreadElement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ObjectLiteral): Unit = id(ast, beforeWalk) match {
    case ObjectLiteral0(ps) => walkList[Boolean](ps, walk)
    case ObjectLiteral1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectLiteral2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: PropertyDefinitionList): Unit = id(ast, beforeWalk) match {
    case PropertyDefinitionList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyDefinitionList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: PropertyDefinition): Unit = id(ast, beforeWalk) match {
    case PropertyDefinition0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyDefinition1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyDefinition2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case PropertyDefinition3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyDefinition4(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: PropertyName): Unit = id(ast, beforeWalk) match {
    case PropertyName0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyName1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: LiteralPropertyName): Unit = id(ast, beforeWalk) match {
    case LiteralPropertyName0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LiteralPropertyName1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LiteralPropertyName2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ComputedPropertyName): Unit = id(ast, beforeWalk) match {
    case ComputedPropertyName0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoverInitializedName): Unit = id(ast, beforeWalk) match {
    case CoverInitializedName0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: Initializer): Unit = id(ast, beforeWalk) match {
    case Initializer0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: TemplateLiteral): Unit = id(ast, beforeWalk) match {
    case TemplateLiteral0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case TemplateLiteral1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: SubstitutionTemplate): Unit = id(ast, beforeWalk) match {
    case SubstitutionTemplate0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: TemplateSpans): Unit = id(ast, beforeWalk) match {
    case TemplateSpans0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case TemplateSpans1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: TemplateMiddleList): Unit = id(ast, beforeWalk) match {
    case TemplateMiddleList0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case TemplateMiddleList1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: MemberExpression): Unit = id(ast, beforeWalk) match {
    case MemberExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MemberExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case MemberExpression2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case MemberExpression3(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case MemberExpression4(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MemberExpression5(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MemberExpression6(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: SuperProperty): Unit = id(ast, beforeWalk) match {
    case SuperProperty0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case SuperProperty1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: MetaProperty): Unit = id(ast, beforeWalk) match {
    case MetaProperty0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MetaProperty1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NewTarget): Unit = id(ast, beforeWalk) match {
    case NewTarget0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportMeta): Unit = id(ast, beforeWalk) match {
    case ImportMeta0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: NewExpression): Unit = id(ast, beforeWalk) match {
    case NewExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case NewExpression1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CallExpression): Unit = id(ast, beforeWalk) match {
    case CallExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CallExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CallExpression2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CallExpression3(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case CallExpression4(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case CallExpression5(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case CallExpression6(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CallMemberExpression): Unit = id(ast, beforeWalk) match {
    case CallMemberExpression0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: SuperCall): Unit = id(ast, beforeWalk) match {
    case SuperCall0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportCall): Unit = id(ast, beforeWalk) match {
    case ImportCall0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Arguments): Unit = id(ast, beforeWalk) match {
    case Arguments0(ps) => walkList[Boolean](ps, walk)
    case Arguments1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Arguments2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArgumentList): Unit = id(ast, beforeWalk) match {
    case ArgumentList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArgumentList1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArgumentList2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ArgumentList3(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: OptionalExpression): Unit = id(ast, beforeWalk) match {
    case OptionalExpression0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalExpression2(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: OptionalChain): Unit = id(ast, beforeWalk) match {
    case OptionalChain0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case OptionalChain1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case OptionalChain2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case OptionalChain3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case OptionalChain4(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalChain5(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalChain6(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalChain7(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LeftHandSideExpression): Unit = id(ast, beforeWalk) match {
    case LeftHandSideExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LeftHandSideExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LeftHandSideExpression2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: UpdateExpression): Unit = id(ast, beforeWalk) match {
    case UpdateExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UpdateExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UpdateExpression2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UpdateExpression3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UpdateExpression4(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: UnaryExpression): Unit = id(ast, beforeWalk) match {
    case UnaryExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression4(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression5(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression6(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression7(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case UnaryExpression8(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExponentiationExpression): Unit = id(ast, beforeWalk) match {
    case ExponentiationExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExponentiationExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: MultiplicativeExpression): Unit = id(ast, beforeWalk) match {
    case MultiplicativeExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MultiplicativeExpression1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: MultiplicativeOperator): Unit = id(ast, beforeWalk) match {
    case MultiplicativeOperator0(ps) => walkList[Boolean](ps, walk)
    case MultiplicativeOperator1(ps) => walkList[Boolean](ps, walk)
    case MultiplicativeOperator2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: AdditiveExpression): Unit = id(ast, beforeWalk) match {
    case AdditiveExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AdditiveExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AdditiveExpression2(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ShiftExpression): Unit = id(ast, beforeWalk) match {
    case ShiftExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ShiftExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ShiftExpression2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ShiftExpression3(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: RelationalExpression): Unit = id(ast, beforeWalk) match {
    case RelationalExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case RelationalExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case RelationalExpression2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case RelationalExpression3(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case RelationalExpression4(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case RelationalExpression5(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case RelationalExpression6(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: EqualityExpression): Unit = id(ast, beforeWalk) match {
    case EqualityExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case EqualityExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case EqualityExpression2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case EqualityExpression3(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case EqualityExpression4(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BitwiseANDExpression): Unit = id(ast, beforeWalk) match {
    case BitwiseANDExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BitwiseANDExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BitwiseXORExpression): Unit = id(ast, beforeWalk) match {
    case BitwiseXORExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BitwiseXORExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BitwiseORExpression): Unit = id(ast, beforeWalk) match {
    case BitwiseORExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BitwiseORExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LogicalANDExpression): Unit = id(ast, beforeWalk) match {
    case LogicalANDExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LogicalANDExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LogicalORExpression): Unit = id(ast, beforeWalk) match {
    case LogicalORExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LogicalORExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoalesceExpression): Unit = id(ast, beforeWalk) match {
    case CoalesceExpression0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoalesceExpressionHead): Unit = id(ast, beforeWalk) match {
    case CoalesceExpressionHead0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CoalesceExpressionHead1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ShortCircuitExpression): Unit = id(ast, beforeWalk) match {
    case ShortCircuitExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ShortCircuitExpression1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ConditionalExpression): Unit = id(ast, beforeWalk) match {
    case ConditionalExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ConditionalExpression1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentExpression): Unit = id(ast, beforeWalk) match {
    case AssignmentExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentExpression2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentExpression3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentExpression4(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AssignmentExpression5(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentOperator): Unit = id(ast, beforeWalk) match {
    case AssignmentOperator0(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator1(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator2(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator3(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator4(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator5(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator6(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator7(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator8(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator9(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator10(ps) => walkList[Boolean](ps, walk)
    case AssignmentOperator11(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentPattern): Unit = id(ast, beforeWalk) match {
    case AssignmentPattern0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentPattern1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ObjectAssignmentPattern): Unit = id(ast, beforeWalk) match {
    case ObjectAssignmentPattern0(ps) => walkList[Boolean](ps, walk)
    case ObjectAssignmentPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectAssignmentPattern2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectAssignmentPattern3(x0, x1, ps) => walk(x0); walkOpt[AssignmentRestProperty](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrayAssignmentPattern): Unit = id(ast, beforeWalk) match {
    case ArrayAssignmentPattern0(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walkOpt[AssignmentRestElement](x1, walk); walkList[Boolean](ps, walk)
    case ArrayAssignmentPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrayAssignmentPattern2(x0, x1, x2, ps) => walk(x0); walkOpt[Elision](x1, walk); walkOpt[AssignmentRestElement](x2, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentRestProperty): Unit = id(ast, beforeWalk) match {
    case AssignmentRestProperty0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentPropertyList): Unit = id(ast, beforeWalk) match {
    case AssignmentPropertyList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentPropertyList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentElementList): Unit = id(ast, beforeWalk) match {
    case AssignmentElementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentElementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentElisionElement): Unit = id(ast, beforeWalk) match {
    case AssignmentElisionElement0(x0, x1, ps) => walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentProperty): Unit = id(ast, beforeWalk) match {
    case AssignmentProperty0(x0, x1, ps) =>
      walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
    case AssignmentProperty1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentElement): Unit = id(ast, beforeWalk) match {
    case AssignmentElement0(x0, x1, ps) => walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentRestElement): Unit = id(ast, beforeWalk) match {
    case AssignmentRestElement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: DestructuringAssignmentTarget): Unit = id(ast, beforeWalk) match {
    case DestructuringAssignmentTarget0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Expression): Unit = id(ast, beforeWalk) match {
    case Expression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Expression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: Statement): Unit = id(ast, beforeWalk) match {
    case Statement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement4(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement5(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement6(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement7(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement8(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement9(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement10(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement11(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement12(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Statement13(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Declaration): Unit = id(ast, beforeWalk) match {
    case Declaration0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Declaration1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Declaration2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: HoistableDeclaration): Unit = id(ast, beforeWalk) match {
    case HoistableDeclaration0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case HoistableDeclaration1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case HoistableDeclaration2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case HoistableDeclaration3(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BreakableStatement): Unit = id(ast, beforeWalk) match {
    case BreakableStatement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BreakableStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BlockStatement): Unit = id(ast, beforeWalk) match {
    case BlockStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Block): Unit = id(ast, beforeWalk) match {
    case Block0(x0, ps) => walkOpt[StatementList](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: StatementList): Unit = id(ast, beforeWalk) match {
    case StatementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case StatementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: StatementListItem): Unit = id(ast, beforeWalk) match {
    case StatementListItem0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case StatementListItem1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: LexicalDeclaration): Unit = id(ast, beforeWalk) match {
    case LexicalDeclaration0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LetOrConst): Unit = id(ast, beforeWalk) match {
    case LetOrConst0(ps) => walkList[Boolean](ps, walk)
    case LetOrConst1(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingList): Unit = id(ast, beforeWalk) match {
    case BindingList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LexicalBinding): Unit = id(ast, beforeWalk) match {
    case LexicalBinding0(x0, x1, ps) =>
      walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
    case LexicalBinding1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: VariableStatement): Unit = id(ast, beforeWalk) match {
    case VariableStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: VariableDeclarationList): Unit = id(ast, beforeWalk) match {
    case VariableDeclarationList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case VariableDeclarationList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: VariableDeclaration): Unit = id(ast, beforeWalk) match {
    case VariableDeclaration0(x0, x1, ps) =>
      walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
    case VariableDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingPattern): Unit = id(ast, beforeWalk) match {
    case BindingPattern0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingPattern1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ObjectBindingPattern): Unit = id(ast, beforeWalk) match {
    case ObjectBindingPattern0(ps) => walkList[Boolean](ps, walk)
    case ObjectBindingPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectBindingPattern2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectBindingPattern3(x0, x1, ps) => walk(x0); walkOpt[BindingRestProperty](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrayBindingPattern): Unit = id(ast, beforeWalk) match {
    case ArrayBindingPattern0(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walkOpt[BindingRestElement](x1, walk); walkList[Boolean](ps, walk)
    case ArrayBindingPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrayBindingPattern2(x0, x1, x2, ps) => walk(x0); walkOpt[Elision](x1, walk); walkOpt[BindingRestElement](x2, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingRestProperty): Unit = id(ast, beforeWalk) match {
    case BindingRestProperty0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingPropertyList): Unit = id(ast, beforeWalk) match {
    case BindingPropertyList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingPropertyList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingElementList): Unit = id(ast, beforeWalk) match {
    case BindingElementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingElementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingElisionElement): Unit = id(ast, beforeWalk) match {
    case BindingElisionElement0(x0, x1, ps) => walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingProperty): Unit = id(ast, beforeWalk) match {
    case BindingProperty0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingProperty1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingElement): Unit = id(ast, beforeWalk) match {
    case BindingElement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingElement1(x0, x1, ps) => walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: SingleNameBinding): Unit = id(ast, beforeWalk) match {
    case SingleNameBinding0(x0, x1, ps) => walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingRestElement): Unit = id(ast, beforeWalk) match {
    case BindingRestElement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingRestElement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: EmptyStatement): Unit = id(ast, beforeWalk) match {
    case EmptyStatement0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: ExpressionStatement): Unit = id(ast, beforeWalk) match {
    case ExpressionStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: IfStatement): Unit = id(ast, beforeWalk) match {
    case IfStatement0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IfStatement1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: IterationStatement): Unit = id(ast, beforeWalk) match {
    case IterationStatement0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case IterationStatement1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case IterationStatement2(x0, x1, x2, x3, ps) =>
      walkOpt[Expression](x0, walk); walkOpt[Expression](x1, walk); walkOpt[Expression](x2, walk); walk(x3); walkList[Boolean](ps, walk)
    case IterationStatement3(x0, x1, x2, x3, ps) =>
      walk(x0); walkOpt[Expression](x1, walk); walkOpt[Expression](x2, walk); walk(x3); walkList[Boolean](ps, walk)
    case IterationStatement4(x0, x1, x2, x3, ps) =>
      walk(x0); walkOpt[Expression](x1, walk); walkOpt[Expression](x2, walk); walk(x3); walkList[Boolean](ps, walk)
    case IterationStatement5(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement6(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement7(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement8(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement9(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement10(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement11(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement12(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IterationStatement13(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: ForDeclaration): Unit = id(ast, beforeWalk) match {
    case ForDeclaration0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ForBinding): Unit = id(ast, beforeWalk) match {
    case ForBinding0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ForBinding1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ContinueStatement): Unit = id(ast, beforeWalk) match {
    case ContinueStatement0(ps) => walkList[Boolean](ps, walk)
    case ContinueStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BreakStatement): Unit = id(ast, beforeWalk) match {
    case BreakStatement0(ps) => walkList[Boolean](ps, walk)
    case BreakStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ReturnStatement): Unit = id(ast, beforeWalk) match {
    case ReturnStatement0(ps) => walkList[Boolean](ps, walk)
    case ReturnStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: WithStatement): Unit = id(ast, beforeWalk) match {
    case WithStatement0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: SwitchStatement): Unit = id(ast, beforeWalk) match {
    case SwitchStatement0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CaseBlock): Unit = id(ast, beforeWalk) match {
    case CaseBlock0(x0, ps) =>
      walkOpt[CaseClauses](x0, walk); walkList[Boolean](ps, walk)
    case CaseBlock1(x0, x1, x2, ps) => walkOpt[CaseClauses](x0, walk); walk(x1); walkOpt[CaseClauses](x2, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: CaseClauses): Unit = id(ast, beforeWalk) match {
    case CaseClauses0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CaseClauses1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CaseClause): Unit = id(ast, beforeWalk) match {
    case CaseClause0(x0, x1, ps) => walk(x0); walkOpt[StatementList](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: DefaultClause): Unit = id(ast, beforeWalk) match {
    case DefaultClause0(x0, ps) => walkOpt[StatementList](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: LabelledStatement): Unit = id(ast, beforeWalk) match {
    case LabelledStatement0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LabelledItem): Unit = id(ast, beforeWalk) match {
    case LabelledItem0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LabelledItem1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ThrowStatement): Unit = id(ast, beforeWalk) match {
    case ThrowStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: TryStatement): Unit = id(ast, beforeWalk) match {
    case TryStatement0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case TryStatement1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case TryStatement2(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: Catch): Unit = id(ast, beforeWalk) match {
    case Catch0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case Catch1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Finally): Unit = id(ast, beforeWalk) match {
    case Finally0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CatchParameter): Unit = id(ast, beforeWalk) match {
    case CatchParameter0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CatchParameter1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: DebuggerStatement): Unit = id(ast, beforeWalk) match {
    case DebuggerStatement0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionDeclaration): Unit = id(ast, beforeWalk) match {
    case FunctionDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case FunctionDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionExpression): Unit = id(ast, beforeWalk) match {
    case FunctionExpression0(x0, x1, x2, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: UniqueFormalParameters): Unit = id(ast, beforeWalk) match {
    case UniqueFormalParameters0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FormalParameters): Unit = id(ast, beforeWalk) match {
    case FormalParameters0(ps) => walkList[Boolean](ps, walk)
    case FormalParameters1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameters2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameters3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameters4(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: FormalParameterList): Unit = id(ast, beforeWalk) match {
    case FormalParameterList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameterList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionRestParameter): Unit = id(ast, beforeWalk) match {
    case FunctionRestParameter0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FormalParameter): Unit = id(ast, beforeWalk) match {
    case FormalParameter0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionBody): Unit = id(ast, beforeWalk) match {
    case FunctionBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionStatementList): Unit = id(ast, beforeWalk) match {
    case FunctionStatementList0(x0, ps) => walkOpt[StatementList](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrowFunction): Unit = id(ast, beforeWalk) match {
    case ArrowFunction0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrowParameters): Unit = id(ast, beforeWalk) match {
    case ArrowParameters0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrowParameters1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ConciseBody): Unit = id(ast, beforeWalk) match {
    case ConciseBody0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ConciseBody1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExpressionBody): Unit = id(ast, beforeWalk) match {
    case ExpressionBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrowFormalParameters): Unit = id(ast, beforeWalk) match {
    case ArrowFormalParameters0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncArrowFunction): Unit = id(ast, beforeWalk) match {
    case AsyncArrowFunction0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AsyncArrowFunction1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncConciseBody): Unit = id(ast, beforeWalk) match {
    case AsyncConciseBody0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AsyncConciseBody1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncArrowBindingIdentifier): Unit = id(ast, beforeWalk) match {
    case AsyncArrowBindingIdentifier0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoverCallExpressionAndAsyncArrowHead): Unit = id(ast, beforeWalk) match {
    case CoverCallExpressionAndAsyncArrowHead0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncArrowHead): Unit = id(ast, beforeWalk) match {
    case AsyncArrowHead0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: MethodDefinition): Unit = id(ast, beforeWalk) match {
    case MethodDefinition0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case MethodDefinition1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MethodDefinition2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MethodDefinition3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MethodDefinition4(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case MethodDefinition5(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: PropertySetParameterList): Unit = id(ast, beforeWalk) match {
    case PropertySetParameterList0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorMethod): Unit = id(ast, beforeWalk) match {
    case GeneratorMethod0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorDeclaration): Unit = id(ast, beforeWalk) match {
    case GeneratorDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case GeneratorDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorExpression): Unit = id(ast, beforeWalk) match {
    case GeneratorExpression0(x0, x1, x2, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorBody): Unit = id(ast, beforeWalk) match {
    case GeneratorBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: YieldExpression): Unit = id(ast, beforeWalk) match {
    case YieldExpression0(ps) => walkList[Boolean](ps, walk)
    case YieldExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case YieldExpression2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorMethod): Unit = id(ast, beforeWalk) match {
    case AsyncGeneratorMethod0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorDeclaration): Unit = id(ast, beforeWalk) match {
    case AsyncGeneratorDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case AsyncGeneratorDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorExpression): Unit = id(ast, beforeWalk) match {
    case AsyncGeneratorExpression0(x0, x1, x2, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorBody): Unit = id(ast, beforeWalk) match {
    case AsyncGeneratorBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncFunctionDeclaration): Unit = id(ast, beforeWalk) match {
    case AsyncFunctionDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case AsyncFunctionDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncFunctionExpression): Unit = id(ast, beforeWalk) match {
    case AsyncFunctionExpression0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AsyncFunctionExpression1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncMethod): Unit = id(ast, beforeWalk) match {
    case AsyncMethod0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncFunctionBody): Unit = id(ast, beforeWalk) match {
    case AsyncFunctionBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AwaitExpression): Unit = id(ast, beforeWalk) match {
    case AwaitExpression0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassDeclaration): Unit = id(ast, beforeWalk) match {
    case ClassDeclaration0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ClassDeclaration1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassExpression): Unit = id(ast, beforeWalk) match {
    case ClassExpression0(x0, x1, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassTail): Unit = id(ast, beforeWalk) match {
    case ClassTail0(x0, x1, ps) => walkOpt[ClassHeritage](x0, walk); walkOpt[ClassBody](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassHeritage): Unit = id(ast, beforeWalk) match {
    case ClassHeritage0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassBody): Unit = id(ast, beforeWalk) match {
    case ClassBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassElementList): Unit = id(ast, beforeWalk) match {
    case ClassElementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ClassElementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassElement): Unit = id(ast, beforeWalk) match {
    case ClassElement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ClassElement1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ClassElement2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: Script): Unit = id(ast, beforeWalk) match {
    case Script0(x0, ps) => walkOpt[ScriptBody](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ScriptBody): Unit = id(ast, beforeWalk) match {
    case ScriptBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Module): Unit = id(ast, beforeWalk) match {
    case Module0(x0, ps) => walkOpt[ModuleBody](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleBody): Unit = id(ast, beforeWalk) match {
    case ModuleBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleItemList): Unit = id(ast, beforeWalk) match {
    case ModuleItemList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ModuleItemList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleItem): Unit = id(ast, beforeWalk) match {
    case ModuleItem0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ModuleItem1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ModuleItem2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportDeclaration): Unit = id(ast, beforeWalk) match {
    case ImportDeclaration0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ImportDeclaration1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportClause): Unit = id(ast, beforeWalk) match {
    case ImportClause0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportClause1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportClause2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportClause3(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ImportClause4(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportedDefaultBinding): Unit = id(ast, beforeWalk) match {
    case ImportedDefaultBinding0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NameSpaceImport): Unit = id(ast, beforeWalk) match {
    case NameSpaceImport0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NamedImports): Unit = id(ast, beforeWalk) match {
    case NamedImports0(ps) => walkList[Boolean](ps, walk)
    case NamedImports1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case NamedImports2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FromClause): Unit = id(ast, beforeWalk) match {
    case FromClause0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportsList): Unit = id(ast, beforeWalk) match {
    case ImportsList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportsList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportSpecifier): Unit = id(ast, beforeWalk) match {
    case ImportSpecifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportSpecifier1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleSpecifier): Unit = id(ast, beforeWalk) match {
    case ModuleSpecifier0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportedBinding): Unit = id(ast, beforeWalk) match {
    case ImportedBinding0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportDeclaration): Unit = id(ast, beforeWalk) match {
    case ExportDeclaration0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ExportDeclaration1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportDeclaration2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportDeclaration3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportDeclaration4(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportDeclaration5(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportDeclaration6(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportFromClause): Unit = id(ast, beforeWalk) match {
    case ExportFromClause0(ps) => walkList[Boolean](ps, walk)
    case ExportFromClause1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportFromClause2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NamedExports): Unit = id(ast, beforeWalk) match {
    case NamedExports0(ps) => walkList[Boolean](ps, walk)
    case NamedExports1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case NamedExports2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportsList): Unit = id(ast, beforeWalk) match {
    case ExportsList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportsList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportSpecifier): Unit = id(ast, beforeWalk) match {
    case ExportSpecifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportSpecifier1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
}
