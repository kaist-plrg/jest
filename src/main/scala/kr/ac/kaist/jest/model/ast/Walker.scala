package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, Lexical }
import kr.ac.kaist.jest.ir._

trait Walker {
  def walk(str: String): String = str
  def walk(bool: Boolean): Boolean = bool
  def walkOpt[T](opt: Option[T], tWalk: T => T): Option[T] = opt.map(tWalk)
  def walkList[T](list: List[T], tWalk: T => T): List[T] = list.map(tWalk)
  def walk(ast: AST): AST = ast match {
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
  def walk(ast: Lexical): Lexical = Lexical(walk(ast.kind), walk(ast.str))
  def walk(ast: IdentifierReference): IdentifierReference = ast match {
    case IdentifierReference0(x0, ps) => IdentifierReference0(walk(x0), walkList[Boolean](ps, walk))
    case IdentifierReference1(ps) => IdentifierReference1(walkList[Boolean](ps, walk))
    case IdentifierReference2(ps) => IdentifierReference2(walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingIdentifier): BindingIdentifier = ast match {
    case BindingIdentifier0(x0, ps) => BindingIdentifier0(walk(x0), walkList[Boolean](ps, walk))
    case BindingIdentifier1(ps) => BindingIdentifier1(walkList[Boolean](ps, walk))
    case BindingIdentifier2(ps) => BindingIdentifier2(walkList[Boolean](ps, walk))
  }
  def walk(ast: LabelIdentifier): LabelIdentifier = ast match {
    case LabelIdentifier0(x0, ps) => LabelIdentifier0(walk(x0), walkList[Boolean](ps, walk))
    case LabelIdentifier1(ps) => LabelIdentifier1(walkList[Boolean](ps, walk))
    case LabelIdentifier2(ps) => LabelIdentifier2(walkList[Boolean](ps, walk))
  }
  def walk(ast: Identifier): Identifier = ast match {
    case Identifier0(x0, ps) => Identifier0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: PrimaryExpression): PrimaryExpression = ast match {
    case PrimaryExpression0(ps) => PrimaryExpression0(walkList[Boolean](ps, walk))
    case PrimaryExpression1(x0, ps) => PrimaryExpression1(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression2(x0, ps) => PrimaryExpression2(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression3(x0, ps) => PrimaryExpression3(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression4(x0, ps) => PrimaryExpression4(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression5(x0, ps) => PrimaryExpression5(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression6(x0, ps) => PrimaryExpression6(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression7(x0, ps) => PrimaryExpression7(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression8(x0, ps) => PrimaryExpression8(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression9(x0, ps) => PrimaryExpression9(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression10(x0, ps) => PrimaryExpression10(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression11(x0, ps) => PrimaryExpression11(walk(x0), walkList[Boolean](ps, walk))
    case PrimaryExpression12(x0, ps) => PrimaryExpression12(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: CoverParenthesizedExpressionAndArrowParameterList): CoverParenthesizedExpressionAndArrowParameterList = ast match {
    case CoverParenthesizedExpressionAndArrowParameterList0(x0, ps) => CoverParenthesizedExpressionAndArrowParameterList0(walk(x0), walkList[Boolean](ps, walk))
    case CoverParenthesizedExpressionAndArrowParameterList1(x0, ps) => CoverParenthesizedExpressionAndArrowParameterList1(walk(x0), walkList[Boolean](ps, walk))
    case CoverParenthesizedExpressionAndArrowParameterList2(ps) => CoverParenthesizedExpressionAndArrowParameterList2(walkList[Boolean](ps, walk))
    case CoverParenthesizedExpressionAndArrowParameterList3(x0, ps) => CoverParenthesizedExpressionAndArrowParameterList3(walk(x0), walkList[Boolean](ps, walk))
    case CoverParenthesizedExpressionAndArrowParameterList4(x0, ps) => CoverParenthesizedExpressionAndArrowParameterList4(walk(x0), walkList[Boolean](ps, walk))
    case CoverParenthesizedExpressionAndArrowParameterList5(x0, x1, ps) => CoverParenthesizedExpressionAndArrowParameterList5(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case CoverParenthesizedExpressionAndArrowParameterList6(x0, x1, ps) => CoverParenthesizedExpressionAndArrowParameterList6(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ParenthesizedExpression): ParenthesizedExpression = ast match {
    case ParenthesizedExpression0(x0, ps) => ParenthesizedExpression0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Literal): Literal = ast match {
    case Literal0(x0, ps) => Literal0(walk(x0), walkList[Boolean](ps, walk))
    case Literal1(x0, ps) => Literal1(walk(x0), walkList[Boolean](ps, walk))
    case Literal2(x0, ps) => Literal2(walk(x0), walkList[Boolean](ps, walk))
    case Literal3(x0, ps) => Literal3(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArrayLiteral): ArrayLiteral = ast match {
    case ArrayLiteral0(x0, ps) => ArrayLiteral0(walkOpt[Elision](x0, walk), walkList[Boolean](ps, walk))
    case ArrayLiteral1(x0, ps) => ArrayLiteral1(walk(x0), walkList[Boolean](ps, walk))
    case ArrayLiteral2(x0, x1, ps) => ArrayLiteral2(walk(x0), walkOpt[Elision](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ElementList): ElementList = ast match {
    case ElementList0(x0, x1, ps) => ElementList0(walkOpt[Elision](x0, walk), walk(x1), walkList[Boolean](ps, walk))
    case ElementList1(x0, x1, ps) => ElementList1(walkOpt[Elision](x0, walk), walk(x1), walkList[Boolean](ps, walk))
    case ElementList2(x0, x1, x2, ps) => ElementList2(walk(x0), walkOpt[Elision](x1, walk), walk(x2), walkList[Boolean](ps, walk))
    case ElementList3(x0, x1, x2, ps) => ElementList3(walk(x0), walkOpt[Elision](x1, walk), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: Elision): Elision = ast match {
    case Elision0(ps) => Elision0(walkList[Boolean](ps, walk))
    case Elision1(x0, ps) => Elision1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: SpreadElement): SpreadElement = ast match {
    case SpreadElement0(x0, ps) => SpreadElement0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ObjectLiteral): ObjectLiteral = ast match {
    case ObjectLiteral0(ps) => ObjectLiteral0(walkList[Boolean](ps, walk))
    case ObjectLiteral1(x0, ps) => ObjectLiteral1(walk(x0), walkList[Boolean](ps, walk))
    case ObjectLiteral2(x0, ps) => ObjectLiteral2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: PropertyDefinitionList): PropertyDefinitionList = ast match {
    case PropertyDefinitionList0(x0, ps) => PropertyDefinitionList0(walk(x0), walkList[Boolean](ps, walk))
    case PropertyDefinitionList1(x0, x1, ps) => PropertyDefinitionList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: PropertyDefinition): PropertyDefinition = ast match {
    case PropertyDefinition0(x0, ps) => PropertyDefinition0(walk(x0), walkList[Boolean](ps, walk))
    case PropertyDefinition1(x0, ps) => PropertyDefinition1(walk(x0), walkList[Boolean](ps, walk))
    case PropertyDefinition2(x0, x1, ps) => PropertyDefinition2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case PropertyDefinition3(x0, ps) => PropertyDefinition3(walk(x0), walkList[Boolean](ps, walk))
    case PropertyDefinition4(x0, ps) => PropertyDefinition4(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: PropertyName): PropertyName = ast match {
    case PropertyName0(x0, ps) => PropertyName0(walk(x0), walkList[Boolean](ps, walk))
    case PropertyName1(x0, ps) => PropertyName1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: LiteralPropertyName): LiteralPropertyName = ast match {
    case LiteralPropertyName0(x0, ps) => LiteralPropertyName0(walk(x0), walkList[Boolean](ps, walk))
    case LiteralPropertyName1(x0, ps) => LiteralPropertyName1(walk(x0), walkList[Boolean](ps, walk))
    case LiteralPropertyName2(x0, ps) => LiteralPropertyName2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ComputedPropertyName): ComputedPropertyName = ast match {
    case ComputedPropertyName0(x0, ps) => ComputedPropertyName0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: CoverInitializedName): CoverInitializedName = ast match {
    case CoverInitializedName0(x0, x1, ps) => CoverInitializedName0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: Initializer): Initializer = ast match {
    case Initializer0(x0, ps) => Initializer0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: TemplateLiteral): TemplateLiteral = ast match {
    case TemplateLiteral0(x0, ps) => TemplateLiteral0(walk(x0), walkList[Boolean](ps, walk))
    case TemplateLiteral1(x0, ps) => TemplateLiteral1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: SubstitutionTemplate): SubstitutionTemplate = ast match {
    case SubstitutionTemplate0(x0, x1, x2, ps) => SubstitutionTemplate0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: TemplateSpans): TemplateSpans = ast match {
    case TemplateSpans0(x0, ps) => TemplateSpans0(walk(x0), walkList[Boolean](ps, walk))
    case TemplateSpans1(x0, x1, ps) => TemplateSpans1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: TemplateMiddleList): TemplateMiddleList = ast match {
    case TemplateMiddleList0(x0, x1, ps) => TemplateMiddleList0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case TemplateMiddleList1(x0, x1, x2, ps) => TemplateMiddleList1(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: MemberExpression): MemberExpression = ast match {
    case MemberExpression0(x0, ps) => MemberExpression0(walk(x0), walkList[Boolean](ps, walk))
    case MemberExpression1(x0, x1, ps) => MemberExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case MemberExpression2(x0, x1, ps) => MemberExpression2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case MemberExpression3(x0, x1, ps) => MemberExpression3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case MemberExpression4(x0, ps) => MemberExpression4(walk(x0), walkList[Boolean](ps, walk))
    case MemberExpression5(x0, ps) => MemberExpression5(walk(x0), walkList[Boolean](ps, walk))
    case MemberExpression6(x0, x1, ps) => MemberExpression6(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: SuperProperty): SuperProperty = ast match {
    case SuperProperty0(x0, ps) => SuperProperty0(walk(x0), walkList[Boolean](ps, walk))
    case SuperProperty1(x0, ps) => SuperProperty1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: MetaProperty): MetaProperty = ast match {
    case MetaProperty0(x0, ps) => MetaProperty0(walk(x0), walkList[Boolean](ps, walk))
    case MetaProperty1(x0, ps) => MetaProperty1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: NewTarget): NewTarget = ast match {
    case NewTarget0(ps) => NewTarget0(walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportMeta): ImportMeta = ast match {
    case ImportMeta0(ps) => ImportMeta0(walkList[Boolean](ps, walk))
  }
  def walk(ast: NewExpression): NewExpression = ast match {
    case NewExpression0(x0, ps) => NewExpression0(walk(x0), walkList[Boolean](ps, walk))
    case NewExpression1(x0, ps) => NewExpression1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: CallExpression): CallExpression = ast match {
    case CallExpression0(x0, ps) => CallExpression0(walk(x0), walkList[Boolean](ps, walk))
    case CallExpression1(x0, ps) => CallExpression1(walk(x0), walkList[Boolean](ps, walk))
    case CallExpression2(x0, ps) => CallExpression2(walk(x0), walkList[Boolean](ps, walk))
    case CallExpression3(x0, x1, ps) => CallExpression3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case CallExpression4(x0, x1, ps) => CallExpression4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case CallExpression5(x0, x1, ps) => CallExpression5(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case CallExpression6(x0, x1, ps) => CallExpression6(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: CallMemberExpression): CallMemberExpression = ast match {
    case CallMemberExpression0(x0, x1, ps) => CallMemberExpression0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: SuperCall): SuperCall = ast match {
    case SuperCall0(x0, ps) => SuperCall0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportCall): ImportCall = ast match {
    case ImportCall0(x0, ps) => ImportCall0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Arguments): Arguments = ast match {
    case Arguments0(ps) => Arguments0(walkList[Boolean](ps, walk))
    case Arguments1(x0, ps) => Arguments1(walk(x0), walkList[Boolean](ps, walk))
    case Arguments2(x0, ps) => Arguments2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArgumentList): ArgumentList = ast match {
    case ArgumentList0(x0, ps) => ArgumentList0(walk(x0), walkList[Boolean](ps, walk))
    case ArgumentList1(x0, ps) => ArgumentList1(walk(x0), walkList[Boolean](ps, walk))
    case ArgumentList2(x0, x1, ps) => ArgumentList2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ArgumentList3(x0, x1, ps) => ArgumentList3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: OptionalExpression): OptionalExpression = ast match {
    case OptionalExpression0(x0, x1, ps) => OptionalExpression0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case OptionalExpression1(x0, x1, ps) => OptionalExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case OptionalExpression2(x0, x1, ps) => OptionalExpression2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: OptionalChain): OptionalChain = ast match {
    case OptionalChain0(x0, ps) => OptionalChain0(walk(x0), walkList[Boolean](ps, walk))
    case OptionalChain1(x0, ps) => OptionalChain1(walk(x0), walkList[Boolean](ps, walk))
    case OptionalChain2(x0, ps) => OptionalChain2(walk(x0), walkList[Boolean](ps, walk))
    case OptionalChain3(x0, ps) => OptionalChain3(walk(x0), walkList[Boolean](ps, walk))
    case OptionalChain4(x0, x1, ps) => OptionalChain4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case OptionalChain5(x0, x1, ps) => OptionalChain5(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case OptionalChain6(x0, x1, ps) => OptionalChain6(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case OptionalChain7(x0, x1, ps) => OptionalChain7(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: LeftHandSideExpression): LeftHandSideExpression = ast match {
    case LeftHandSideExpression0(x0, ps) => LeftHandSideExpression0(walk(x0), walkList[Boolean](ps, walk))
    case LeftHandSideExpression1(x0, ps) => LeftHandSideExpression1(walk(x0), walkList[Boolean](ps, walk))
    case LeftHandSideExpression2(x0, ps) => LeftHandSideExpression2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: UpdateExpression): UpdateExpression = ast match {
    case UpdateExpression0(x0, ps) => UpdateExpression0(walk(x0), walkList[Boolean](ps, walk))
    case UpdateExpression1(x0, ps) => UpdateExpression1(walk(x0), walkList[Boolean](ps, walk))
    case UpdateExpression2(x0, ps) => UpdateExpression2(walk(x0), walkList[Boolean](ps, walk))
    case UpdateExpression3(x0, ps) => UpdateExpression3(walk(x0), walkList[Boolean](ps, walk))
    case UpdateExpression4(x0, ps) => UpdateExpression4(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: UnaryExpression): UnaryExpression = ast match {
    case UnaryExpression0(x0, ps) => UnaryExpression0(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression1(x0, ps) => UnaryExpression1(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression2(x0, ps) => UnaryExpression2(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression3(x0, ps) => UnaryExpression3(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression4(x0, ps) => UnaryExpression4(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression5(x0, ps) => UnaryExpression5(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression6(x0, ps) => UnaryExpression6(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression7(x0, ps) => UnaryExpression7(walk(x0), walkList[Boolean](ps, walk))
    case UnaryExpression8(x0, ps) => UnaryExpression8(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ExponentiationExpression): ExponentiationExpression = ast match {
    case ExponentiationExpression0(x0, ps) => ExponentiationExpression0(walk(x0), walkList[Boolean](ps, walk))
    case ExponentiationExpression1(x0, x1, ps) => ExponentiationExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: MultiplicativeExpression): MultiplicativeExpression = ast match {
    case MultiplicativeExpression0(x0, ps) => MultiplicativeExpression0(walk(x0), walkList[Boolean](ps, walk))
    case MultiplicativeExpression1(x0, x1, x2, ps) => MultiplicativeExpression1(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: MultiplicativeOperator): MultiplicativeOperator = ast match {
    case MultiplicativeOperator0(ps) => MultiplicativeOperator0(walkList[Boolean](ps, walk))
    case MultiplicativeOperator1(ps) => MultiplicativeOperator1(walkList[Boolean](ps, walk))
    case MultiplicativeOperator2(ps) => MultiplicativeOperator2(walkList[Boolean](ps, walk))
  }
  def walk(ast: AdditiveExpression): AdditiveExpression = ast match {
    case AdditiveExpression0(x0, ps) => AdditiveExpression0(walk(x0), walkList[Boolean](ps, walk))
    case AdditiveExpression1(x0, x1, ps) => AdditiveExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case AdditiveExpression2(x0, x1, ps) => AdditiveExpression2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ShiftExpression): ShiftExpression = ast match {
    case ShiftExpression0(x0, ps) => ShiftExpression0(walk(x0), walkList[Boolean](ps, walk))
    case ShiftExpression1(x0, x1, ps) => ShiftExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ShiftExpression2(x0, x1, ps) => ShiftExpression2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ShiftExpression3(x0, x1, ps) => ShiftExpression3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: RelationalExpression): RelationalExpression = ast match {
    case RelationalExpression0(x0, ps) => RelationalExpression0(walk(x0), walkList[Boolean](ps, walk))
    case RelationalExpression1(x0, x1, ps) => RelationalExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case RelationalExpression2(x0, x1, ps) => RelationalExpression2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case RelationalExpression3(x0, x1, ps) => RelationalExpression3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case RelationalExpression4(x0, x1, ps) => RelationalExpression4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case RelationalExpression5(x0, x1, ps) => RelationalExpression5(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case RelationalExpression6(x0, x1, ps) => RelationalExpression6(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: EqualityExpression): EqualityExpression = ast match {
    case EqualityExpression0(x0, ps) => EqualityExpression0(walk(x0), walkList[Boolean](ps, walk))
    case EqualityExpression1(x0, x1, ps) => EqualityExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case EqualityExpression2(x0, x1, ps) => EqualityExpression2(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case EqualityExpression3(x0, x1, ps) => EqualityExpression3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case EqualityExpression4(x0, x1, ps) => EqualityExpression4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BitwiseANDExpression): BitwiseANDExpression = ast match {
    case BitwiseANDExpression0(x0, ps) => BitwiseANDExpression0(walk(x0), walkList[Boolean](ps, walk))
    case BitwiseANDExpression1(x0, x1, ps) => BitwiseANDExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BitwiseXORExpression): BitwiseXORExpression = ast match {
    case BitwiseXORExpression0(x0, ps) => BitwiseXORExpression0(walk(x0), walkList[Boolean](ps, walk))
    case BitwiseXORExpression1(x0, x1, ps) => BitwiseXORExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BitwiseORExpression): BitwiseORExpression = ast match {
    case BitwiseORExpression0(x0, ps) => BitwiseORExpression0(walk(x0), walkList[Boolean](ps, walk))
    case BitwiseORExpression1(x0, x1, ps) => BitwiseORExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: LogicalANDExpression): LogicalANDExpression = ast match {
    case LogicalANDExpression0(x0, ps) => LogicalANDExpression0(walk(x0), walkList[Boolean](ps, walk))
    case LogicalANDExpression1(x0, x1, ps) => LogicalANDExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: LogicalORExpression): LogicalORExpression = ast match {
    case LogicalORExpression0(x0, ps) => LogicalORExpression0(walk(x0), walkList[Boolean](ps, walk))
    case LogicalORExpression1(x0, x1, ps) => LogicalORExpression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: CoalesceExpression): CoalesceExpression = ast match {
    case CoalesceExpression0(x0, x1, ps) => CoalesceExpression0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: CoalesceExpressionHead): CoalesceExpressionHead = ast match {
    case CoalesceExpressionHead0(x0, ps) => CoalesceExpressionHead0(walk(x0), walkList[Boolean](ps, walk))
    case CoalesceExpressionHead1(x0, ps) => CoalesceExpressionHead1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ShortCircuitExpression): ShortCircuitExpression = ast match {
    case ShortCircuitExpression0(x0, ps) => ShortCircuitExpression0(walk(x0), walkList[Boolean](ps, walk))
    case ShortCircuitExpression1(x0, ps) => ShortCircuitExpression1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ConditionalExpression): ConditionalExpression = ast match {
    case ConditionalExpression0(x0, ps) => ConditionalExpression0(walk(x0), walkList[Boolean](ps, walk))
    case ConditionalExpression1(x0, x1, x2, ps) => ConditionalExpression1(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentExpression): AssignmentExpression = ast match {
    case AssignmentExpression0(x0, ps) => AssignmentExpression0(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentExpression1(x0, ps) => AssignmentExpression1(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentExpression2(x0, ps) => AssignmentExpression2(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentExpression3(x0, ps) => AssignmentExpression3(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentExpression4(x0, x1, ps) => AssignmentExpression4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case AssignmentExpression5(x0, x1, x2, ps) => AssignmentExpression5(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentOperator): AssignmentOperator = ast match {
    case AssignmentOperator0(ps) => AssignmentOperator0(walkList[Boolean](ps, walk))
    case AssignmentOperator1(ps) => AssignmentOperator1(walkList[Boolean](ps, walk))
    case AssignmentOperator2(ps) => AssignmentOperator2(walkList[Boolean](ps, walk))
    case AssignmentOperator3(ps) => AssignmentOperator3(walkList[Boolean](ps, walk))
    case AssignmentOperator4(ps) => AssignmentOperator4(walkList[Boolean](ps, walk))
    case AssignmentOperator5(ps) => AssignmentOperator5(walkList[Boolean](ps, walk))
    case AssignmentOperator6(ps) => AssignmentOperator6(walkList[Boolean](ps, walk))
    case AssignmentOperator7(ps) => AssignmentOperator7(walkList[Boolean](ps, walk))
    case AssignmentOperator8(ps) => AssignmentOperator8(walkList[Boolean](ps, walk))
    case AssignmentOperator9(ps) => AssignmentOperator9(walkList[Boolean](ps, walk))
    case AssignmentOperator10(ps) => AssignmentOperator10(walkList[Boolean](ps, walk))
    case AssignmentOperator11(ps) => AssignmentOperator11(walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentPattern): AssignmentPattern = ast match {
    case AssignmentPattern0(x0, ps) => AssignmentPattern0(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentPattern1(x0, ps) => AssignmentPattern1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ObjectAssignmentPattern): ObjectAssignmentPattern = ast match {
    case ObjectAssignmentPattern0(ps) => ObjectAssignmentPattern0(walkList[Boolean](ps, walk))
    case ObjectAssignmentPattern1(x0, ps) => ObjectAssignmentPattern1(walk(x0), walkList[Boolean](ps, walk))
    case ObjectAssignmentPattern2(x0, ps) => ObjectAssignmentPattern2(walk(x0), walkList[Boolean](ps, walk))
    case ObjectAssignmentPattern3(x0, x1, ps) => ObjectAssignmentPattern3(walk(x0), walkOpt[AssignmentRestProperty](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArrayAssignmentPattern): ArrayAssignmentPattern = ast match {
    case ArrayAssignmentPattern0(x0, x1, ps) => ArrayAssignmentPattern0(walkOpt[Elision](x0, walk), walkOpt[AssignmentRestElement](x1, walk), walkList[Boolean](ps, walk))
    case ArrayAssignmentPattern1(x0, ps) => ArrayAssignmentPattern1(walk(x0), walkList[Boolean](ps, walk))
    case ArrayAssignmentPattern2(x0, x1, x2, ps) => ArrayAssignmentPattern2(walk(x0), walkOpt[Elision](x1, walk), walkOpt[AssignmentRestElement](x2, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentRestProperty): AssignmentRestProperty = ast match {
    case AssignmentRestProperty0(x0, ps) => AssignmentRestProperty0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentPropertyList): AssignmentPropertyList = ast match {
    case AssignmentPropertyList0(x0, ps) => AssignmentPropertyList0(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentPropertyList1(x0, x1, ps) => AssignmentPropertyList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentElementList): AssignmentElementList = ast match {
    case AssignmentElementList0(x0, ps) => AssignmentElementList0(walk(x0), walkList[Boolean](ps, walk))
    case AssignmentElementList1(x0, x1, ps) => AssignmentElementList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentElisionElement): AssignmentElisionElement = ast match {
    case AssignmentElisionElement0(x0, x1, ps) => AssignmentElisionElement0(walkOpt[Elision](x0, walk), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentProperty): AssignmentProperty = ast match {
    case AssignmentProperty0(x0, x1, ps) => AssignmentProperty0(walk(x0), walkOpt[Initializer](x1, walk), walkList[Boolean](ps, walk))
    case AssignmentProperty1(x0, x1, ps) => AssignmentProperty1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentElement): AssignmentElement = ast match {
    case AssignmentElement0(x0, x1, ps) => AssignmentElement0(walk(x0), walkOpt[Initializer](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: AssignmentRestElement): AssignmentRestElement = ast match {
    case AssignmentRestElement0(x0, ps) => AssignmentRestElement0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: DestructuringAssignmentTarget): DestructuringAssignmentTarget = ast match {
    case DestructuringAssignmentTarget0(x0, ps) => DestructuringAssignmentTarget0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Expression): Expression = ast match {
    case Expression0(x0, ps) => Expression0(walk(x0), walkList[Boolean](ps, walk))
    case Expression1(x0, x1, ps) => Expression1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: Statement): Statement = ast match {
    case Statement0(x0, ps) => Statement0(walk(x0), walkList[Boolean](ps, walk))
    case Statement1(x0, ps) => Statement1(walk(x0), walkList[Boolean](ps, walk))
    case Statement2(x0, ps) => Statement2(walk(x0), walkList[Boolean](ps, walk))
    case Statement3(x0, ps) => Statement3(walk(x0), walkList[Boolean](ps, walk))
    case Statement4(x0, ps) => Statement4(walk(x0), walkList[Boolean](ps, walk))
    case Statement5(x0, ps) => Statement5(walk(x0), walkList[Boolean](ps, walk))
    case Statement6(x0, ps) => Statement6(walk(x0), walkList[Boolean](ps, walk))
    case Statement7(x0, ps) => Statement7(walk(x0), walkList[Boolean](ps, walk))
    case Statement8(x0, ps) => Statement8(walk(x0), walkList[Boolean](ps, walk))
    case Statement9(x0, ps) => Statement9(walk(x0), walkList[Boolean](ps, walk))
    case Statement10(x0, ps) => Statement10(walk(x0), walkList[Boolean](ps, walk))
    case Statement11(x0, ps) => Statement11(walk(x0), walkList[Boolean](ps, walk))
    case Statement12(x0, ps) => Statement12(walk(x0), walkList[Boolean](ps, walk))
    case Statement13(x0, ps) => Statement13(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Declaration): Declaration = ast match {
    case Declaration0(x0, ps) => Declaration0(walk(x0), walkList[Boolean](ps, walk))
    case Declaration1(x0, ps) => Declaration1(walk(x0), walkList[Boolean](ps, walk))
    case Declaration2(x0, ps) => Declaration2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: HoistableDeclaration): HoistableDeclaration = ast match {
    case HoistableDeclaration0(x0, ps) => HoistableDeclaration0(walk(x0), walkList[Boolean](ps, walk))
    case HoistableDeclaration1(x0, ps) => HoistableDeclaration1(walk(x0), walkList[Boolean](ps, walk))
    case HoistableDeclaration2(x0, ps) => HoistableDeclaration2(walk(x0), walkList[Boolean](ps, walk))
    case HoistableDeclaration3(x0, ps) => HoistableDeclaration3(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: BreakableStatement): BreakableStatement = ast match {
    case BreakableStatement0(x0, ps) => BreakableStatement0(walk(x0), walkList[Boolean](ps, walk))
    case BreakableStatement1(x0, ps) => BreakableStatement1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: BlockStatement): BlockStatement = ast match {
    case BlockStatement0(x0, ps) => BlockStatement0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Block): Block = ast match {
    case Block0(x0, ps) => Block0(walkOpt[StatementList](x0, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: StatementList): StatementList = ast match {
    case StatementList0(x0, ps) => StatementList0(walk(x0), walkList[Boolean](ps, walk))
    case StatementList1(x0, x1, ps) => StatementList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: StatementListItem): StatementListItem = ast match {
    case StatementListItem0(x0, ps) => StatementListItem0(walk(x0), walkList[Boolean](ps, walk))
    case StatementListItem1(x0, ps) => StatementListItem1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: LexicalDeclaration): LexicalDeclaration = ast match {
    case LexicalDeclaration0(x0, x1, ps) => LexicalDeclaration0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: LetOrConst): LetOrConst = ast match {
    case LetOrConst0(ps) => LetOrConst0(walkList[Boolean](ps, walk))
    case LetOrConst1(ps) => LetOrConst1(walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingList): BindingList = ast match {
    case BindingList0(x0, ps) => BindingList0(walk(x0), walkList[Boolean](ps, walk))
    case BindingList1(x0, x1, ps) => BindingList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: LexicalBinding): LexicalBinding = ast match {
    case LexicalBinding0(x0, x1, ps) => LexicalBinding0(walk(x0), walkOpt[Initializer](x1, walk), walkList[Boolean](ps, walk))
    case LexicalBinding1(x0, x1, ps) => LexicalBinding1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: VariableStatement): VariableStatement = ast match {
    case VariableStatement0(x0, ps) => VariableStatement0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: VariableDeclarationList): VariableDeclarationList = ast match {
    case VariableDeclarationList0(x0, ps) => VariableDeclarationList0(walk(x0), walkList[Boolean](ps, walk))
    case VariableDeclarationList1(x0, x1, ps) => VariableDeclarationList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: VariableDeclaration): VariableDeclaration = ast match {
    case VariableDeclaration0(x0, x1, ps) => VariableDeclaration0(walk(x0), walkOpt[Initializer](x1, walk), walkList[Boolean](ps, walk))
    case VariableDeclaration1(x0, x1, ps) => VariableDeclaration1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingPattern): BindingPattern = ast match {
    case BindingPattern0(x0, ps) => BindingPattern0(walk(x0), walkList[Boolean](ps, walk))
    case BindingPattern1(x0, ps) => BindingPattern1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ObjectBindingPattern): ObjectBindingPattern = ast match {
    case ObjectBindingPattern0(ps) => ObjectBindingPattern0(walkList[Boolean](ps, walk))
    case ObjectBindingPattern1(x0, ps) => ObjectBindingPattern1(walk(x0), walkList[Boolean](ps, walk))
    case ObjectBindingPattern2(x0, ps) => ObjectBindingPattern2(walk(x0), walkList[Boolean](ps, walk))
    case ObjectBindingPattern3(x0, x1, ps) => ObjectBindingPattern3(walk(x0), walkOpt[BindingRestProperty](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArrayBindingPattern): ArrayBindingPattern = ast match {
    case ArrayBindingPattern0(x0, x1, ps) => ArrayBindingPattern0(walkOpt[Elision](x0, walk), walkOpt[BindingRestElement](x1, walk), walkList[Boolean](ps, walk))
    case ArrayBindingPattern1(x0, ps) => ArrayBindingPattern1(walk(x0), walkList[Boolean](ps, walk))
    case ArrayBindingPattern2(x0, x1, x2, ps) => ArrayBindingPattern2(walk(x0), walkOpt[Elision](x1, walk), walkOpt[BindingRestElement](x2, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingRestProperty): BindingRestProperty = ast match {
    case BindingRestProperty0(x0, ps) => BindingRestProperty0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingPropertyList): BindingPropertyList = ast match {
    case BindingPropertyList0(x0, ps) => BindingPropertyList0(walk(x0), walkList[Boolean](ps, walk))
    case BindingPropertyList1(x0, x1, ps) => BindingPropertyList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingElementList): BindingElementList = ast match {
    case BindingElementList0(x0, ps) => BindingElementList0(walk(x0), walkList[Boolean](ps, walk))
    case BindingElementList1(x0, x1, ps) => BindingElementList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingElisionElement): BindingElisionElement = ast match {
    case BindingElisionElement0(x0, x1, ps) => BindingElisionElement0(walkOpt[Elision](x0, walk), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingProperty): BindingProperty = ast match {
    case BindingProperty0(x0, ps) => BindingProperty0(walk(x0), walkList[Boolean](ps, walk))
    case BindingProperty1(x0, x1, ps) => BindingProperty1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingElement): BindingElement = ast match {
    case BindingElement0(x0, ps) => BindingElement0(walk(x0), walkList[Boolean](ps, walk))
    case BindingElement1(x0, x1, ps) => BindingElement1(walk(x0), walkOpt[Initializer](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: SingleNameBinding): SingleNameBinding = ast match {
    case SingleNameBinding0(x0, x1, ps) => SingleNameBinding0(walk(x0), walkOpt[Initializer](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: BindingRestElement): BindingRestElement = ast match {
    case BindingRestElement0(x0, ps) => BindingRestElement0(walk(x0), walkList[Boolean](ps, walk))
    case BindingRestElement1(x0, ps) => BindingRestElement1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: EmptyStatement): EmptyStatement = ast match {
    case EmptyStatement0(ps) => EmptyStatement0(walkList[Boolean](ps, walk))
  }
  def walk(ast: ExpressionStatement): ExpressionStatement = ast match {
    case ExpressionStatement0(x0, ps) => ExpressionStatement0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: IfStatement): IfStatement = ast match {
    case IfStatement0(x0, x1, x2, ps) => IfStatement0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IfStatement1(x0, x1, ps) => IfStatement1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: IterationStatement): IterationStatement = ast match {
    case IterationStatement0(x0, x1, ps) => IterationStatement0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case IterationStatement1(x0, x1, ps) => IterationStatement1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case IterationStatement2(x0, x1, x2, x3, ps) => IterationStatement2(walkOpt[Expression](x0, walk), walkOpt[Expression](x1, walk), walkOpt[Expression](x2, walk), walk(x3), walkList[Boolean](ps, walk))
    case IterationStatement3(x0, x1, x2, x3, ps) => IterationStatement3(walk(x0), walkOpt[Expression](x1, walk), walkOpt[Expression](x2, walk), walk(x3), walkList[Boolean](ps, walk))
    case IterationStatement4(x0, x1, x2, x3, ps) => IterationStatement4(walk(x0), walkOpt[Expression](x1, walk), walkOpt[Expression](x2, walk), walk(x3), walkList[Boolean](ps, walk))
    case IterationStatement5(x0, x1, x2, ps) => IterationStatement5(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement6(x0, x1, x2, ps) => IterationStatement6(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement7(x0, x1, x2, ps) => IterationStatement7(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement8(x0, x1, x2, ps) => IterationStatement8(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement9(x0, x1, x2, ps) => IterationStatement9(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement10(x0, x1, x2, ps) => IterationStatement10(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement11(x0, x1, x2, ps) => IterationStatement11(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement12(x0, x1, x2, ps) => IterationStatement12(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case IterationStatement13(x0, x1, x2, ps) => IterationStatement13(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: ForDeclaration): ForDeclaration = ast match {
    case ForDeclaration0(x0, x1, ps) => ForDeclaration0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ForBinding): ForBinding = ast match {
    case ForBinding0(x0, ps) => ForBinding0(walk(x0), walkList[Boolean](ps, walk))
    case ForBinding1(x0, ps) => ForBinding1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ContinueStatement): ContinueStatement = ast match {
    case ContinueStatement0(ps) => ContinueStatement0(walkList[Boolean](ps, walk))
    case ContinueStatement1(x0, ps) => ContinueStatement1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: BreakStatement): BreakStatement = ast match {
    case BreakStatement0(ps) => BreakStatement0(walkList[Boolean](ps, walk))
    case BreakStatement1(x0, ps) => BreakStatement1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ReturnStatement): ReturnStatement = ast match {
    case ReturnStatement0(ps) => ReturnStatement0(walkList[Boolean](ps, walk))
    case ReturnStatement1(x0, ps) => ReturnStatement1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: WithStatement): WithStatement = ast match {
    case WithStatement0(x0, x1, ps) => WithStatement0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: SwitchStatement): SwitchStatement = ast match {
    case SwitchStatement0(x0, x1, ps) => SwitchStatement0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: CaseBlock): CaseBlock = ast match {
    case CaseBlock0(x0, ps) => CaseBlock0(walkOpt[CaseClauses](x0, walk), walkList[Boolean](ps, walk))
    case CaseBlock1(x0, x1, x2, ps) => CaseBlock1(walkOpt[CaseClauses](x0, walk), walk(x1), walkOpt[CaseClauses](x2, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: CaseClauses): CaseClauses = ast match {
    case CaseClauses0(x0, ps) => CaseClauses0(walk(x0), walkList[Boolean](ps, walk))
    case CaseClauses1(x0, x1, ps) => CaseClauses1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: CaseClause): CaseClause = ast match {
    case CaseClause0(x0, x1, ps) => CaseClause0(walk(x0), walkOpt[StatementList](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: DefaultClause): DefaultClause = ast match {
    case DefaultClause0(x0, ps) => DefaultClause0(walkOpt[StatementList](x0, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: LabelledStatement): LabelledStatement = ast match {
    case LabelledStatement0(x0, x1, ps) => LabelledStatement0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: LabelledItem): LabelledItem = ast match {
    case LabelledItem0(x0, ps) => LabelledItem0(walk(x0), walkList[Boolean](ps, walk))
    case LabelledItem1(x0, ps) => LabelledItem1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ThrowStatement): ThrowStatement = ast match {
    case ThrowStatement0(x0, ps) => ThrowStatement0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: TryStatement): TryStatement = ast match {
    case TryStatement0(x0, x1, ps) => TryStatement0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case TryStatement1(x0, x1, ps) => TryStatement1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case TryStatement2(x0, x1, x2, ps) => TryStatement2(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: Catch): Catch = ast match {
    case Catch0(x0, x1, ps) => Catch0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case Catch1(x0, ps) => Catch1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Finally): Finally = ast match {
    case Finally0(x0, ps) => Finally0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: CatchParameter): CatchParameter = ast match {
    case CatchParameter0(x0, ps) => CatchParameter0(walk(x0), walkList[Boolean](ps, walk))
    case CatchParameter1(x0, ps) => CatchParameter1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: DebuggerStatement): DebuggerStatement = ast match {
    case DebuggerStatement0(ps) => DebuggerStatement0(walkList[Boolean](ps, walk))
  }
  def walk(ast: FunctionDeclaration): FunctionDeclaration = ast match {
    case FunctionDeclaration0(x0, x1, x2, ps) => FunctionDeclaration0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case FunctionDeclaration1(x0, x1, ps) => FunctionDeclaration1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: FunctionExpression): FunctionExpression = ast match {
    case FunctionExpression0(x0, x1, x2, ps) => FunctionExpression0(walkOpt[BindingIdentifier](x0, walk), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: UniqueFormalParameters): UniqueFormalParameters = ast match {
    case UniqueFormalParameters0(x0, ps) => UniqueFormalParameters0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: FormalParameters): FormalParameters = ast match {
    case FormalParameters0(ps) => FormalParameters0(walkList[Boolean](ps, walk))
    case FormalParameters1(x0, ps) => FormalParameters1(walk(x0), walkList[Boolean](ps, walk))
    case FormalParameters2(x0, ps) => FormalParameters2(walk(x0), walkList[Boolean](ps, walk))
    case FormalParameters3(x0, ps) => FormalParameters3(walk(x0), walkList[Boolean](ps, walk))
    case FormalParameters4(x0, x1, ps) => FormalParameters4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: FormalParameterList): FormalParameterList = ast match {
    case FormalParameterList0(x0, ps) => FormalParameterList0(walk(x0), walkList[Boolean](ps, walk))
    case FormalParameterList1(x0, x1, ps) => FormalParameterList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: FunctionRestParameter): FunctionRestParameter = ast match {
    case FunctionRestParameter0(x0, ps) => FunctionRestParameter0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: FormalParameter): FormalParameter = ast match {
    case FormalParameter0(x0, ps) => FormalParameter0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: FunctionBody): FunctionBody = ast match {
    case FunctionBody0(x0, ps) => FunctionBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: FunctionStatementList): FunctionStatementList = ast match {
    case FunctionStatementList0(x0, ps) => FunctionStatementList0(walkOpt[StatementList](x0, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArrowFunction): ArrowFunction = ast match {
    case ArrowFunction0(x0, x1, ps) => ArrowFunction0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArrowParameters): ArrowParameters = ast match {
    case ArrowParameters0(x0, ps) => ArrowParameters0(walk(x0), walkList[Boolean](ps, walk))
    case ArrowParameters1(x0, ps) => ArrowParameters1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ConciseBody): ConciseBody = ast match {
    case ConciseBody0(x0, ps) => ConciseBody0(walk(x0), walkList[Boolean](ps, walk))
    case ConciseBody1(x0, ps) => ConciseBody1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ExpressionBody): ExpressionBody = ast match {
    case ExpressionBody0(x0, ps) => ExpressionBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ArrowFormalParameters): ArrowFormalParameters = ast match {
    case ArrowFormalParameters0(x0, ps) => ArrowFormalParameters0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncArrowFunction): AsyncArrowFunction = ast match {
    case AsyncArrowFunction0(x0, x1, ps) => AsyncArrowFunction0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case AsyncArrowFunction1(x0, x1, ps) => AsyncArrowFunction1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncConciseBody): AsyncConciseBody = ast match {
    case AsyncConciseBody0(x0, ps) => AsyncConciseBody0(walk(x0), walkList[Boolean](ps, walk))
    case AsyncConciseBody1(x0, ps) => AsyncConciseBody1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncArrowBindingIdentifier): AsyncArrowBindingIdentifier = ast match {
    case AsyncArrowBindingIdentifier0(x0, ps) => AsyncArrowBindingIdentifier0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: CoverCallExpressionAndAsyncArrowHead): CoverCallExpressionAndAsyncArrowHead = ast match {
    case CoverCallExpressionAndAsyncArrowHead0(x0, x1, ps) => CoverCallExpressionAndAsyncArrowHead0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncArrowHead): AsyncArrowHead = ast match {
    case AsyncArrowHead0(x0, ps) => AsyncArrowHead0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: MethodDefinition): MethodDefinition = ast match {
    case MethodDefinition0(x0, x1, x2, ps) => MethodDefinition0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case MethodDefinition1(x0, ps) => MethodDefinition1(walk(x0), walkList[Boolean](ps, walk))
    case MethodDefinition2(x0, ps) => MethodDefinition2(walk(x0), walkList[Boolean](ps, walk))
    case MethodDefinition3(x0, ps) => MethodDefinition3(walk(x0), walkList[Boolean](ps, walk))
    case MethodDefinition4(x0, x1, ps) => MethodDefinition4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case MethodDefinition5(x0, x1, x2, ps) => MethodDefinition5(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: PropertySetParameterList): PropertySetParameterList = ast match {
    case PropertySetParameterList0(x0, ps) => PropertySetParameterList0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: GeneratorMethod): GeneratorMethod = ast match {
    case GeneratorMethod0(x0, x1, x2, ps) => GeneratorMethod0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: GeneratorDeclaration): GeneratorDeclaration = ast match {
    case GeneratorDeclaration0(x0, x1, x2, ps) => GeneratorDeclaration0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case GeneratorDeclaration1(x0, x1, ps) => GeneratorDeclaration1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: GeneratorExpression): GeneratorExpression = ast match {
    case GeneratorExpression0(x0, x1, x2, ps) => GeneratorExpression0(walkOpt[BindingIdentifier](x0, walk), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: GeneratorBody): GeneratorBody = ast match {
    case GeneratorBody0(x0, ps) => GeneratorBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: YieldExpression): YieldExpression = ast match {
    case YieldExpression0(ps) => YieldExpression0(walkList[Boolean](ps, walk))
    case YieldExpression1(x0, ps) => YieldExpression1(walk(x0), walkList[Boolean](ps, walk))
    case YieldExpression2(x0, ps) => YieldExpression2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncGeneratorMethod): AsyncGeneratorMethod = ast match {
    case AsyncGeneratorMethod0(x0, x1, x2, ps) => AsyncGeneratorMethod0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncGeneratorDeclaration): AsyncGeneratorDeclaration = ast match {
    case AsyncGeneratorDeclaration0(x0, x1, x2, ps) => AsyncGeneratorDeclaration0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case AsyncGeneratorDeclaration1(x0, x1, ps) => AsyncGeneratorDeclaration1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncGeneratorExpression): AsyncGeneratorExpression = ast match {
    case AsyncGeneratorExpression0(x0, x1, x2, ps) => AsyncGeneratorExpression0(walkOpt[BindingIdentifier](x0, walk), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncGeneratorBody): AsyncGeneratorBody = ast match {
    case AsyncGeneratorBody0(x0, ps) => AsyncGeneratorBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncFunctionDeclaration): AsyncFunctionDeclaration = ast match {
    case AsyncFunctionDeclaration0(x0, x1, x2, ps) => AsyncFunctionDeclaration0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
    case AsyncFunctionDeclaration1(x0, x1, ps) => AsyncFunctionDeclaration1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncFunctionExpression): AsyncFunctionExpression = ast match {
    case AsyncFunctionExpression0(x0, x1, ps) => AsyncFunctionExpression0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case AsyncFunctionExpression1(x0, x1, x2, ps) => AsyncFunctionExpression1(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncMethod): AsyncMethod = ast match {
    case AsyncMethod0(x0, x1, x2, ps) => AsyncMethod0(walk(x0), walk(x1), walk(x2), walkList[Boolean](ps, walk))
  }
  def walk(ast: AsyncFunctionBody): AsyncFunctionBody = ast match {
    case AsyncFunctionBody0(x0, ps) => AsyncFunctionBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: AwaitExpression): AwaitExpression = ast match {
    case AwaitExpression0(x0, ps) => AwaitExpression0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassDeclaration): ClassDeclaration = ast match {
    case ClassDeclaration0(x0, x1, ps) => ClassDeclaration0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ClassDeclaration1(x0, ps) => ClassDeclaration1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassExpression): ClassExpression = ast match {
    case ClassExpression0(x0, x1, ps) => ClassExpression0(walkOpt[BindingIdentifier](x0, walk), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassTail): ClassTail = ast match {
    case ClassTail0(x0, x1, ps) => ClassTail0(walkOpt[ClassHeritage](x0, walk), walkOpt[ClassBody](x1, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassHeritage): ClassHeritage = ast match {
    case ClassHeritage0(x0, ps) => ClassHeritage0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassBody): ClassBody = ast match {
    case ClassBody0(x0, ps) => ClassBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassElementList): ClassElementList = ast match {
    case ClassElementList0(x0, ps) => ClassElementList0(walk(x0), walkList[Boolean](ps, walk))
    case ClassElementList1(x0, x1, ps) => ClassElementList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ClassElement): ClassElement = ast match {
    case ClassElement0(x0, ps) => ClassElement0(walk(x0), walkList[Boolean](ps, walk))
    case ClassElement1(x0, ps) => ClassElement1(walk(x0), walkList[Boolean](ps, walk))
    case ClassElement2(ps) => ClassElement2(walkList[Boolean](ps, walk))
  }
  def walk(ast: Script): Script = ast match {
    case Script0(x0, ps) => Script0(walkOpt[ScriptBody](x0, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ScriptBody): ScriptBody = ast match {
    case ScriptBody0(x0, ps) => ScriptBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: Module): Module = ast match {
    case Module0(x0, ps) => Module0(walkOpt[ModuleBody](x0, walk), walkList[Boolean](ps, walk))
  }
  def walk(ast: ModuleBody): ModuleBody = ast match {
    case ModuleBody0(x0, ps) => ModuleBody0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ModuleItemList): ModuleItemList = ast match {
    case ModuleItemList0(x0, ps) => ModuleItemList0(walk(x0), walkList[Boolean](ps, walk))
    case ModuleItemList1(x0, x1, ps) => ModuleItemList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ModuleItem): ModuleItem = ast match {
    case ModuleItem0(x0, ps) => ModuleItem0(walk(x0), walkList[Boolean](ps, walk))
    case ModuleItem1(x0, ps) => ModuleItem1(walk(x0), walkList[Boolean](ps, walk))
    case ModuleItem2(x0, ps) => ModuleItem2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportDeclaration): ImportDeclaration = ast match {
    case ImportDeclaration0(x0, x1, ps) => ImportDeclaration0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ImportDeclaration1(x0, ps) => ImportDeclaration1(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportClause): ImportClause = ast match {
    case ImportClause0(x0, ps) => ImportClause0(walk(x0), walkList[Boolean](ps, walk))
    case ImportClause1(x0, ps) => ImportClause1(walk(x0), walkList[Boolean](ps, walk))
    case ImportClause2(x0, ps) => ImportClause2(walk(x0), walkList[Boolean](ps, walk))
    case ImportClause3(x0, x1, ps) => ImportClause3(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ImportClause4(x0, x1, ps) => ImportClause4(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportedDefaultBinding): ImportedDefaultBinding = ast match {
    case ImportedDefaultBinding0(x0, ps) => ImportedDefaultBinding0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: NameSpaceImport): NameSpaceImport = ast match {
    case NameSpaceImport0(x0, ps) => NameSpaceImport0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: NamedImports): NamedImports = ast match {
    case NamedImports0(ps) => NamedImports0(walkList[Boolean](ps, walk))
    case NamedImports1(x0, ps) => NamedImports1(walk(x0), walkList[Boolean](ps, walk))
    case NamedImports2(x0, ps) => NamedImports2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: FromClause): FromClause = ast match {
    case FromClause0(x0, ps) => FromClause0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportsList): ImportsList = ast match {
    case ImportsList0(x0, ps) => ImportsList0(walk(x0), walkList[Boolean](ps, walk))
    case ImportsList1(x0, x1, ps) => ImportsList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportSpecifier): ImportSpecifier = ast match {
    case ImportSpecifier0(x0, ps) => ImportSpecifier0(walk(x0), walkList[Boolean](ps, walk))
    case ImportSpecifier1(x0, x1, ps) => ImportSpecifier1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ModuleSpecifier): ModuleSpecifier = ast match {
    case ModuleSpecifier0(x0, ps) => ModuleSpecifier0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ImportedBinding): ImportedBinding = ast match {
    case ImportedBinding0(x0, ps) => ImportedBinding0(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ExportDeclaration): ExportDeclaration = ast match {
    case ExportDeclaration0(x0, x1, ps) => ExportDeclaration0(walk(x0), walk(x1), walkList[Boolean](ps, walk))
    case ExportDeclaration1(x0, ps) => ExportDeclaration1(walk(x0), walkList[Boolean](ps, walk))
    case ExportDeclaration2(x0, ps) => ExportDeclaration2(walk(x0), walkList[Boolean](ps, walk))
    case ExportDeclaration3(x0, ps) => ExportDeclaration3(walk(x0), walkList[Boolean](ps, walk))
    case ExportDeclaration4(x0, ps) => ExportDeclaration4(walk(x0), walkList[Boolean](ps, walk))
    case ExportDeclaration5(x0, ps) => ExportDeclaration5(walk(x0), walkList[Boolean](ps, walk))
    case ExportDeclaration6(x0, ps) => ExportDeclaration6(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ExportFromClause): ExportFromClause = ast match {
    case ExportFromClause0(ps) => ExportFromClause0(walkList[Boolean](ps, walk))
    case ExportFromClause1(x0, ps) => ExportFromClause1(walk(x0), walkList[Boolean](ps, walk))
    case ExportFromClause2(x0, ps) => ExportFromClause2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: NamedExports): NamedExports = ast match {
    case NamedExports0(ps) => NamedExports0(walkList[Boolean](ps, walk))
    case NamedExports1(x0, ps) => NamedExports1(walk(x0), walkList[Boolean](ps, walk))
    case NamedExports2(x0, ps) => NamedExports2(walk(x0), walkList[Boolean](ps, walk))
  }
  def walk(ast: ExportsList): ExportsList = ast match {
    case ExportsList0(x0, ps) => ExportsList0(walk(x0), walkList[Boolean](ps, walk))
    case ExportsList1(x0, x1, ps) => ExportsList1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
  def walk(ast: ExportSpecifier): ExportSpecifier = ast match {
    case ExportSpecifier0(x0, ps) => ExportSpecifier0(walk(x0), walkList[Boolean](ps, walk))
    case ExportSpecifier1(x0, x1, ps) => ExportSpecifier1(walk(x0), walk(x1), walkList[Boolean](ps, walk))
  }
}
