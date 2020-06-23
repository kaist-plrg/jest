package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, Lexical }
import kr.ac.kaist.ires.ir._

trait UnitWalker {
  def walk(str: String): Unit = {}
  def walk(bool: Boolean): Unit = {}
  def walkOpt[T](opt: Option[T], tWalk: T => Unit): Unit = opt.foreach(tWalk)
  def walkList[T](list: List[T], tWalk: T => Unit): Unit = list.foreach(tWalk)
  def walk(ast: AST): Unit = ast match {
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
  def walk(ast: IdentifierReference): Unit = ast match {
    case IdentifierReference0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case IdentifierReference1(ps) => walkList[Boolean](ps, walk)
    case IdentifierReference2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingIdentifier): Unit = ast match {
    case BindingIdentifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingIdentifier1(ps) => walkList[Boolean](ps, walk)
    case BindingIdentifier2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: LabelIdentifier): Unit = ast match {
    case LabelIdentifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LabelIdentifier1(ps) => walkList[Boolean](ps, walk)
    case LabelIdentifier2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: Identifier): Unit = ast match {
    case Identifier0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: PrimaryExpression): Unit = ast match {
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
  def walk(ast: CoverParenthesizedExpressionAndArrowParameterList): Unit = ast match {
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
  def walk(ast: ParenthesizedExpression): Unit = ast match {
    case ParenthesizedExpression0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Literal): Unit = ast match {
    case Literal0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Literal1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Literal2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Literal3(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrayLiteral): Unit = ast match {
    case ArrayLiteral0(x0, ps) =>
      walkOpt[Elision](x0, walk); walkList[Boolean](ps, walk)
    case ArrayLiteral1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrayLiteral2(x0, x1, ps) => walk(x0); walkOpt[Elision](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ElementList): Unit = ast match {
    case ElementList0(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
    case ElementList1(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
    case ElementList2(x0, x1, x2, ps) =>
      walk(x0); walkOpt[Elision](x1, walk); walk(x2); walkList[Boolean](ps, walk)
    case ElementList3(x0, x1, x2, ps) => walk(x0); walkOpt[Elision](x1, walk); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: Elision): Unit = ast match {
    case Elision0(ps) => walkList[Boolean](ps, walk)
    case Elision1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: SpreadElement): Unit = ast match {
    case SpreadElement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ObjectLiteral): Unit = ast match {
    case ObjectLiteral0(ps) => walkList[Boolean](ps, walk)
    case ObjectLiteral1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectLiteral2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: PropertyDefinitionList): Unit = ast match {
    case PropertyDefinitionList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyDefinitionList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: PropertyDefinition): Unit = ast match {
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
  def walk(ast: PropertyName): Unit = ast match {
    case PropertyName0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case PropertyName1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: LiteralPropertyName): Unit = ast match {
    case LiteralPropertyName0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LiteralPropertyName1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LiteralPropertyName2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ComputedPropertyName): Unit = ast match {
    case ComputedPropertyName0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoverInitializedName): Unit = ast match {
    case CoverInitializedName0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: Initializer): Unit = ast match {
    case Initializer0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: TemplateLiteral): Unit = ast match {
    case TemplateLiteral0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case TemplateLiteral1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: SubstitutionTemplate): Unit = ast match {
    case SubstitutionTemplate0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: TemplateSpans): Unit = ast match {
    case TemplateSpans0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case TemplateSpans1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: TemplateMiddleList): Unit = ast match {
    case TemplateMiddleList0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case TemplateMiddleList1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: MemberExpression): Unit = ast match {
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
  def walk(ast: SuperProperty): Unit = ast match {
    case SuperProperty0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case SuperProperty1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: MetaProperty): Unit = ast match {
    case MetaProperty0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MetaProperty1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NewTarget): Unit = ast match {
    case NewTarget0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportMeta): Unit = ast match {
    case ImportMeta0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: NewExpression): Unit = ast match {
    case NewExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case NewExpression1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CallExpression): Unit = ast match {
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
  def walk(ast: CallMemberExpression): Unit = ast match {
    case CallMemberExpression0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: SuperCall): Unit = ast match {
    case SuperCall0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportCall): Unit = ast match {
    case ImportCall0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Arguments): Unit = ast match {
    case Arguments0(ps) => walkList[Boolean](ps, walk)
    case Arguments1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Arguments2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArgumentList): Unit = ast match {
    case ArgumentList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArgumentList1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArgumentList2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ArgumentList3(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: OptionalExpression): Unit = ast match {
    case OptionalExpression0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case OptionalExpression2(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: OptionalChain): Unit = ast match {
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
  def walk(ast: LeftHandSideExpression): Unit = ast match {
    case LeftHandSideExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LeftHandSideExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LeftHandSideExpression2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: UpdateExpression): Unit = ast match {
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
  def walk(ast: UnaryExpression): Unit = ast match {
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
  def walk(ast: ExponentiationExpression): Unit = ast match {
    case ExponentiationExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExponentiationExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: MultiplicativeExpression): Unit = ast match {
    case MultiplicativeExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case MultiplicativeExpression1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: MultiplicativeOperator): Unit = ast match {
    case MultiplicativeOperator0(ps) => walkList[Boolean](ps, walk)
    case MultiplicativeOperator1(ps) => walkList[Boolean](ps, walk)
    case MultiplicativeOperator2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: AdditiveExpression): Unit = ast match {
    case AdditiveExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AdditiveExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AdditiveExpression2(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ShiftExpression): Unit = ast match {
    case ShiftExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ShiftExpression1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ShiftExpression2(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ShiftExpression3(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: RelationalExpression): Unit = ast match {
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
  def walk(ast: EqualityExpression): Unit = ast match {
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
  def walk(ast: BitwiseANDExpression): Unit = ast match {
    case BitwiseANDExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BitwiseANDExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BitwiseXORExpression): Unit = ast match {
    case BitwiseXORExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BitwiseXORExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BitwiseORExpression): Unit = ast match {
    case BitwiseORExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BitwiseORExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LogicalANDExpression): Unit = ast match {
    case LogicalANDExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LogicalANDExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LogicalORExpression): Unit = ast match {
    case LogicalORExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LogicalORExpression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoalesceExpression): Unit = ast match {
    case CoalesceExpression0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoalesceExpressionHead): Unit = ast match {
    case CoalesceExpressionHead0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CoalesceExpressionHead1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ShortCircuitExpression): Unit = ast match {
    case ShortCircuitExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ShortCircuitExpression1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ConditionalExpression): Unit = ast match {
    case ConditionalExpression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ConditionalExpression1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentExpression): Unit = ast match {
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
  def walk(ast: AssignmentOperator): Unit = ast match {
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
  def walk(ast: AssignmentPattern): Unit = ast match {
    case AssignmentPattern0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentPattern1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ObjectAssignmentPattern): Unit = ast match {
    case ObjectAssignmentPattern0(ps) => walkList[Boolean](ps, walk)
    case ObjectAssignmentPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectAssignmentPattern2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectAssignmentPattern3(x0, x1, ps) => walk(x0); walkOpt[AssignmentRestProperty](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrayAssignmentPattern): Unit = ast match {
    case ArrayAssignmentPattern0(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walkOpt[AssignmentRestElement](x1, walk); walkList[Boolean](ps, walk)
    case ArrayAssignmentPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrayAssignmentPattern2(x0, x1, x2, ps) => walk(x0); walkOpt[Elision](x1, walk); walkOpt[AssignmentRestElement](x2, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentRestProperty): Unit = ast match {
    case AssignmentRestProperty0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentPropertyList): Unit = ast match {
    case AssignmentPropertyList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentPropertyList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentElementList): Unit = ast match {
    case AssignmentElementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AssignmentElementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentElisionElement): Unit = ast match {
    case AssignmentElisionElement0(x0, x1, ps) => walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentProperty): Unit = ast match {
    case AssignmentProperty0(x0, x1, ps) =>
      walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
    case AssignmentProperty1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentElement): Unit = ast match {
    case AssignmentElement0(x0, x1, ps) => walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: AssignmentRestElement): Unit = ast match {
    case AssignmentRestElement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: DestructuringAssignmentTarget): Unit = ast match {
    case DestructuringAssignmentTarget0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Expression): Unit = ast match {
    case Expression0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Expression1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: Statement): Unit = ast match {
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
  def walk(ast: Declaration): Unit = ast match {
    case Declaration0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Declaration1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case Declaration2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: HoistableDeclaration): Unit = ast match {
    case HoistableDeclaration0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case HoistableDeclaration1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case HoistableDeclaration2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case HoistableDeclaration3(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BreakableStatement): Unit = ast match {
    case BreakableStatement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BreakableStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BlockStatement): Unit = ast match {
    case BlockStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Block): Unit = ast match {
    case Block0(x0, ps) => walkOpt[StatementList](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: StatementList): Unit = ast match {
    case StatementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case StatementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: StatementListItem): Unit = ast match {
    case StatementListItem0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case StatementListItem1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: LexicalDeclaration): Unit = ast match {
    case LexicalDeclaration0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LetOrConst): Unit = ast match {
    case LetOrConst0(ps) => walkList[Boolean](ps, walk)
    case LetOrConst1(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingList): Unit = ast match {
    case BindingList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LexicalBinding): Unit = ast match {
    case LexicalBinding0(x0, x1, ps) =>
      walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
    case LexicalBinding1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: VariableStatement): Unit = ast match {
    case VariableStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: VariableDeclarationList): Unit = ast match {
    case VariableDeclarationList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case VariableDeclarationList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: VariableDeclaration): Unit = ast match {
    case VariableDeclaration0(x0, x1, ps) =>
      walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
    case VariableDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingPattern): Unit = ast match {
    case BindingPattern0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingPattern1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ObjectBindingPattern): Unit = ast match {
    case ObjectBindingPattern0(ps) => walkList[Boolean](ps, walk)
    case ObjectBindingPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectBindingPattern2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ObjectBindingPattern3(x0, x1, ps) => walk(x0); walkOpt[BindingRestProperty](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrayBindingPattern): Unit = ast match {
    case ArrayBindingPattern0(x0, x1, ps) =>
      walkOpt[Elision](x0, walk); walkOpt[BindingRestElement](x1, walk); walkList[Boolean](ps, walk)
    case ArrayBindingPattern1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrayBindingPattern2(x0, x1, x2, ps) => walk(x0); walkOpt[Elision](x1, walk); walkOpt[BindingRestElement](x2, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingRestProperty): Unit = ast match {
    case BindingRestProperty0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingPropertyList): Unit = ast match {
    case BindingPropertyList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingPropertyList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingElementList): Unit = ast match {
    case BindingElementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingElementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingElisionElement): Unit = ast match {
    case BindingElisionElement0(x0, x1, ps) => walkOpt[Elision](x0, walk); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingProperty): Unit = ast match {
    case BindingProperty0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingProperty1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingElement): Unit = ast match {
    case BindingElement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingElement1(x0, x1, ps) => walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: SingleNameBinding): Unit = ast match {
    case SingleNameBinding0(x0, x1, ps) => walk(x0); walkOpt[Initializer](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: BindingRestElement): Unit = ast match {
    case BindingRestElement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case BindingRestElement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: EmptyStatement): Unit = ast match {
    case EmptyStatement0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: ExpressionStatement): Unit = ast match {
    case ExpressionStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: IfStatement): Unit = ast match {
    case IfStatement0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case IfStatement1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: IterationStatement): Unit = ast match {
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
  def walk(ast: ForDeclaration): Unit = ast match {
    case ForDeclaration0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ForBinding): Unit = ast match {
    case ForBinding0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ForBinding1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ContinueStatement): Unit = ast match {
    case ContinueStatement0(ps) => walkList[Boolean](ps, walk)
    case ContinueStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: BreakStatement): Unit = ast match {
    case BreakStatement0(ps) => walkList[Boolean](ps, walk)
    case BreakStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ReturnStatement): Unit = ast match {
    case ReturnStatement0(ps) => walkList[Boolean](ps, walk)
    case ReturnStatement1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: WithStatement): Unit = ast match {
    case WithStatement0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: SwitchStatement): Unit = ast match {
    case SwitchStatement0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CaseBlock): Unit = ast match {
    case CaseBlock0(x0, ps) =>
      walkOpt[CaseClauses](x0, walk); walkList[Boolean](ps, walk)
    case CaseBlock1(x0, x1, x2, ps) => walkOpt[CaseClauses](x0, walk); walk(x1); walkOpt[CaseClauses](x2, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: CaseClauses): Unit = ast match {
    case CaseClauses0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CaseClauses1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: CaseClause): Unit = ast match {
    case CaseClause0(x0, x1, ps) => walk(x0); walkOpt[StatementList](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: DefaultClause): Unit = ast match {
    case DefaultClause0(x0, ps) => walkOpt[StatementList](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: LabelledStatement): Unit = ast match {
    case LabelledStatement0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: LabelledItem): Unit = ast match {
    case LabelledItem0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case LabelledItem1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ThrowStatement): Unit = ast match {
    case ThrowStatement0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: TryStatement): Unit = ast match {
    case TryStatement0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case TryStatement1(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case TryStatement2(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: Catch): Unit = ast match {
    case Catch0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case Catch1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Finally): Unit = ast match {
    case Finally0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CatchParameter): Unit = ast match {
    case CatchParameter0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case CatchParameter1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: DebuggerStatement): Unit = ast match {
    case DebuggerStatement0(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionDeclaration): Unit = ast match {
    case FunctionDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case FunctionDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionExpression): Unit = ast match {
    case FunctionExpression0(x0, x1, x2, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: UniqueFormalParameters): Unit = ast match {
    case UniqueFormalParameters0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FormalParameters): Unit = ast match {
    case FormalParameters0(ps) => walkList[Boolean](ps, walk)
    case FormalParameters1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameters2(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameters3(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameters4(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: FormalParameterList): Unit = ast match {
    case FormalParameterList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case FormalParameterList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionRestParameter): Unit = ast match {
    case FunctionRestParameter0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FormalParameter): Unit = ast match {
    case FormalParameter0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionBody): Unit = ast match {
    case FunctionBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FunctionStatementList): Unit = ast match {
    case FunctionStatementList0(x0, ps) => walkOpt[StatementList](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrowFunction): Unit = ast match {
    case ArrowFunction0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrowParameters): Unit = ast match {
    case ArrowParameters0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ArrowParameters1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ConciseBody): Unit = ast match {
    case ConciseBody0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ConciseBody1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExpressionBody): Unit = ast match {
    case ExpressionBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ArrowFormalParameters): Unit = ast match {
    case ArrowFormalParameters0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncArrowFunction): Unit = ast match {
    case AsyncArrowFunction0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AsyncArrowFunction1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncConciseBody): Unit = ast match {
    case AsyncConciseBody0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case AsyncConciseBody1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncArrowBindingIdentifier): Unit = ast match {
    case AsyncArrowBindingIdentifier0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: CoverCallExpressionAndAsyncArrowHead): Unit = ast match {
    case CoverCallExpressionAndAsyncArrowHead0(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncArrowHead): Unit = ast match {
    case AsyncArrowHead0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: MethodDefinition): Unit = ast match {
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
  def walk(ast: PropertySetParameterList): Unit = ast match {
    case PropertySetParameterList0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorMethod): Unit = ast match {
    case GeneratorMethod0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorDeclaration): Unit = ast match {
    case GeneratorDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case GeneratorDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorExpression): Unit = ast match {
    case GeneratorExpression0(x0, x1, x2, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: GeneratorBody): Unit = ast match {
    case GeneratorBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: YieldExpression): Unit = ast match {
    case YieldExpression0(ps) => walkList[Boolean](ps, walk)
    case YieldExpression1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case YieldExpression2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorMethod): Unit = ast match {
    case AsyncGeneratorMethod0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorDeclaration): Unit = ast match {
    case AsyncGeneratorDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case AsyncGeneratorDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorExpression): Unit = ast match {
    case AsyncGeneratorExpression0(x0, x1, x2, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncGeneratorBody): Unit = ast match {
    case AsyncGeneratorBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncFunctionDeclaration): Unit = ast match {
    case AsyncFunctionDeclaration0(x0, x1, x2, ps) =>
      walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
    case AsyncFunctionDeclaration1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncFunctionExpression): Unit = ast match {
    case AsyncFunctionExpression0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case AsyncFunctionExpression1(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncMethod): Unit = ast match {
    case AsyncMethod0(x0, x1, x2, ps) => walk(x0); walk(x1); walk(x2); walkList[Boolean](ps, walk)
  }
  def walk(ast: AsyncFunctionBody): Unit = ast match {
    case AsyncFunctionBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: AwaitExpression): Unit = ast match {
    case AwaitExpression0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassDeclaration): Unit = ast match {
    case ClassDeclaration0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ClassDeclaration1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassExpression): Unit = ast match {
    case ClassExpression0(x0, x1, ps) => walkOpt[BindingIdentifier](x0, walk); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassTail): Unit = ast match {
    case ClassTail0(x0, x1, ps) => walkOpt[ClassHeritage](x0, walk); walkOpt[ClassBody](x1, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassHeritage): Unit = ast match {
    case ClassHeritage0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassBody): Unit = ast match {
    case ClassBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassElementList): Unit = ast match {
    case ClassElementList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ClassElementList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ClassElement): Unit = ast match {
    case ClassElement0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ClassElement1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ClassElement2(ps) => walkList[Boolean](ps, walk)
  }
  def walk(ast: Script): Unit = ast match {
    case Script0(x0, ps) => walkOpt[ScriptBody](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ScriptBody): Unit = ast match {
    case ScriptBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: Module): Unit = ast match {
    case Module0(x0, ps) => walkOpt[ModuleBody](x0, walk); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleBody): Unit = ast match {
    case ModuleBody0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleItemList): Unit = ast match {
    case ModuleItemList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ModuleItemList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleItem): Unit = ast match {
    case ModuleItem0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ModuleItem1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ModuleItem2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportDeclaration): Unit = ast match {
    case ImportDeclaration0(x0, x1, ps) =>
      walk(x0); walk(x1); walkList[Boolean](ps, walk)
    case ImportDeclaration1(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportClause): Unit = ast match {
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
  def walk(ast: ImportedDefaultBinding): Unit = ast match {
    case ImportedDefaultBinding0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NameSpaceImport): Unit = ast match {
    case NameSpaceImport0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NamedImports): Unit = ast match {
    case NamedImports0(ps) => walkList[Boolean](ps, walk)
    case NamedImports1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case NamedImports2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: FromClause): Unit = ast match {
    case FromClause0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportsList): Unit = ast match {
    case ImportsList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportsList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportSpecifier): Unit = ast match {
    case ImportSpecifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ImportSpecifier1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ModuleSpecifier): Unit = ast match {
    case ModuleSpecifier0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ImportedBinding): Unit = ast match {
    case ImportedBinding0(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportDeclaration): Unit = ast match {
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
  def walk(ast: ExportFromClause): Unit = ast match {
    case ExportFromClause0(ps) => walkList[Boolean](ps, walk)
    case ExportFromClause1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportFromClause2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: NamedExports): Unit = ast match {
    case NamedExports0(ps) => walkList[Boolean](ps, walk)
    case NamedExports1(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case NamedExports2(x0, ps) => walk(x0); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportsList): Unit = ast match {
    case ExportsList0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportsList1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
  def walk(ast: ExportSpecifier): Unit = ast match {
    case ExportSpecifier0(x0, ps) =>
      walk(x0); walkList[Boolean](ps, walk)
    case ExportSpecifier1(x0, x1, ps) => walk(x0); walk(x1); walkList[Boolean](ps, walk)
  }
}
