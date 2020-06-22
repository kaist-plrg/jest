package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Lexical
import kr.ac.kaist.ires.ir._

object Sampler {
  val random = new scala.util.Random
  def choose[T](seq: Seq[() => T]): T = seq(random.nextInt(seq.length))()
  def opt[T](elem: T): Option[T] = if (random.nextBoolean) Some(elem) else None
  def IdentifierName(): Lexical = Lexical("IdentifierName", (random.nextInt(26) + 'a').toChar.toString)
  def RegularExpressionLiteral(): Lexical = Lexical("RegularExpressionLiteral", "/x/g")
  def NullLiteral(): Lexical = Lexical("NullLiteral", "null")
  def BooleanLiteral(): Lexical = Lexical("BooleanLiteral", random.nextBoolean.toString)
  def NumericLiteral(): Lexical = Lexical("NumericLiteral", "0")
  def StringLiteral(): Lexical = Lexical("StringLiteral", "''")
  def NoSubstitutionTemplate(): Lexical = Lexical("StringLiteral", "``")
  def TemplateHead(): Lexical = Lexical("StringLiteral", "`${")
  def TemplateMiddle(): Lexical = Lexical("StringLiteral", "}${")
  def TemplateTail(): Lexical = Lexical("StringLiteral", "}`")
  def IdentifierReference(pYield: Boolean, pAwait: Boolean): IdentifierReference = {
    var candidates: Vector[() => IdentifierReference] = Vector()
    candidates :+= { () => IdentifierReference0(Identifier(), List(pYield, pAwait)) }
    if (!pYield) candidates :+= { () => IdentifierReference1(List(pYield, pAwait)) }
    if (!pAwait) candidates :+= { () => IdentifierReference2(List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingIdentifier(pYield: Boolean, pAwait: Boolean): BindingIdentifier = {
    var candidates: Vector[() => BindingIdentifier] = Vector()
    candidates :+= { () => BindingIdentifier0(Identifier(), List(pYield, pAwait)) }
    candidates :+= { () => BindingIdentifier1(List(pYield, pAwait)) }
    candidates :+= { () => BindingIdentifier2(List(pYield, pAwait)) }
    choose(candidates)
  }
  def LabelIdentifier(pYield: Boolean, pAwait: Boolean): LabelIdentifier = {
    var candidates: Vector[() => LabelIdentifier] = Vector()
    candidates :+= { () => LabelIdentifier0(Identifier(), List(pYield, pAwait)) }
    if (!pYield) candidates :+= { () => LabelIdentifier1(List(pYield, pAwait)) }
    if (!pAwait) candidates :+= { () => LabelIdentifier2(List(pYield, pAwait)) }
    choose(candidates)
  }
  def Identifier(): Identifier = {
    var candidates: Vector[() => Identifier] = Vector()
    candidates :+= { () => Identifier0(IdentifierName(), List()) }
    choose(candidates)
  }
  def PrimaryExpression(pYield: Boolean, pAwait: Boolean): PrimaryExpression = {
    var candidates: Vector[() => PrimaryExpression] = Vector()
    candidates :+= { () => PrimaryExpression0(List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression1(IdentifierReference(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression2(Literal(), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression3(ArrayLiteral(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression4(ObjectLiteral(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression5(FunctionExpression(), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression6(ClassExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression7(GeneratorExpression(), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression8(AsyncFunctionExpression(), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression9(AsyncGeneratorExpression(), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression10(RegularExpressionLiteral(), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression11(TemplateLiteral(pYield, pAwait, false), List(pYield, pAwait)) }
    candidates :+= { () => PrimaryExpression12(CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): CoverParenthesizedExpressionAndArrowParameterList = {
    var candidates: Vector[() => CoverParenthesizedExpressionAndArrowParameterList] = Vector()
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList0(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList1(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList2(List(pYield, pAwait)) }
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList3(BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList4(BindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList5(Expression(true, pYield, pAwait), BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList6(Expression(true, pYield, pAwait), BindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): ParenthesizedExpression = {
    var candidates: Vector[() => ParenthesizedExpression] = Vector()
    candidates :+= { () => ParenthesizedExpression0(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def Literal(): Literal = {
    var candidates: Vector[() => Literal] = Vector()
    candidates :+= { () => Literal0(NullLiteral(), List()) }
    candidates :+= { () => Literal1(BooleanLiteral(), List()) }
    candidates :+= { () => Literal2(NumericLiteral(), List()) }
    candidates :+= { () => Literal3(StringLiteral(), List()) }
    choose(candidates)
  }
  def ArrayLiteral(pYield: Boolean, pAwait: Boolean): ArrayLiteral = {
    var candidates: Vector[() => ArrayLiteral] = Vector()
    candidates :+= { () => ArrayLiteral0(opt(Elision()), List(pYield, pAwait)) }
    candidates :+= { () => ArrayLiteral1(ElementList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArrayLiteral2(ElementList(pYield, pAwait), opt(Elision()), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ElementList(pYield: Boolean, pAwait: Boolean): ElementList = {
    var candidates: Vector[() => ElementList] = Vector()
    candidates :+= { () => ElementList0(opt(Elision()), AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ElementList1(opt(Elision()), SpreadElement(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ElementList2(ElementList(pYield, pAwait), opt(Elision()), AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ElementList3(ElementList(pYield, pAwait), opt(Elision()), SpreadElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def Elision(): Elision = {
    var candidates: Vector[() => Elision] = Vector()
    candidates :+= { () => Elision0(List()) }
    candidates :+= { () => Elision1(Elision(), List()) }
    choose(candidates)
  }
  def SpreadElement(pYield: Boolean, pAwait: Boolean): SpreadElement = {
    var candidates: Vector[() => SpreadElement] = Vector()
    candidates :+= { () => SpreadElement0(AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ObjectLiteral(pYield: Boolean, pAwait: Boolean): ObjectLiteral = {
    var candidates: Vector[() => ObjectLiteral] = Vector()
    candidates :+= { () => ObjectLiteral0(List(pYield, pAwait)) }
    candidates :+= { () => ObjectLiteral1(PropertyDefinitionList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ObjectLiteral2(PropertyDefinitionList(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): PropertyDefinitionList = {
    var candidates: Vector[() => PropertyDefinitionList] = Vector()
    candidates :+= { () => PropertyDefinitionList0(PropertyDefinition(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PropertyDefinitionList1(PropertyDefinitionList(pYield, pAwait), PropertyDefinition(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def PropertyDefinition(pYield: Boolean, pAwait: Boolean): PropertyDefinition = {
    var candidates: Vector[() => PropertyDefinition] = Vector()
    candidates :+= { () => PropertyDefinition0(IdentifierReference(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PropertyDefinition1(CoverInitializedName(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PropertyDefinition2(PropertyName(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PropertyDefinition3(MethodDefinition(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => PropertyDefinition4(AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def PropertyName(pYield: Boolean, pAwait: Boolean): PropertyName = {
    var candidates: Vector[() => PropertyName] = Vector()
    candidates :+= { () => PropertyName0(LiteralPropertyName(), List(pYield, pAwait)) }
    candidates :+= { () => PropertyName1(ComputedPropertyName(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def LiteralPropertyName(): LiteralPropertyName = {
    var candidates: Vector[() => LiteralPropertyName] = Vector()
    candidates :+= { () => LiteralPropertyName0(IdentifierName(), List()) }
    candidates :+= { () => LiteralPropertyName1(StringLiteral(), List()) }
    candidates :+= { () => LiteralPropertyName2(NumericLiteral(), List()) }
    choose(candidates)
  }
  def ComputedPropertyName(pYield: Boolean, pAwait: Boolean): ComputedPropertyName = {
    var candidates: Vector[() => ComputedPropertyName] = Vector()
    candidates :+= { () => ComputedPropertyName0(AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def CoverInitializedName(pYield: Boolean, pAwait: Boolean): CoverInitializedName = {
    var candidates: Vector[() => CoverInitializedName] = Vector()
    candidates :+= { () => CoverInitializedName0(IdentifierReference(pYield, pAwait), Initializer(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Initializer = {
    var candidates: Vector[() => Initializer] = Vector()
    candidates :+= { () => Initializer0(AssignmentExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): TemplateLiteral = {
    var candidates: Vector[() => TemplateLiteral] = Vector()
    candidates :+= { () => TemplateLiteral0(NoSubstitutionTemplate(), List(pYield, pAwait, pTagged)) }
    candidates :+= { () => TemplateLiteral1(SubstitutionTemplate(pYield, pAwait, pTagged), List(pYield, pAwait, pTagged)) }
    choose(candidates)
  }
  def SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): SubstitutionTemplate = {
    var candidates: Vector[() => SubstitutionTemplate] = Vector()
    candidates :+= { () => SubstitutionTemplate0(TemplateHead(), Expression(true, pYield, pAwait), TemplateSpans(pYield, pAwait, pTagged), List(pYield, pAwait, pTagged)) }
    choose(candidates)
  }
  def TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): TemplateSpans = {
    var candidates: Vector[() => TemplateSpans] = Vector()
    candidates :+= { () => TemplateSpans0(TemplateTail(), List(pYield, pAwait, pTagged)) }
    candidates :+= { () => TemplateSpans1(TemplateMiddleList(pYield, pAwait, pTagged), TemplateTail(), List(pYield, pAwait, pTagged)) }
    choose(candidates)
  }
  def TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): TemplateMiddleList = {
    var candidates: Vector[() => TemplateMiddleList] = Vector()
    candidates :+= { () => TemplateMiddleList0(TemplateMiddle(), Expression(true, pYield, pAwait), List(pYield, pAwait, pTagged)) }
    candidates :+= { () => TemplateMiddleList1(TemplateMiddleList(pYield, pAwait, pTagged), TemplateMiddle(), Expression(true, pYield, pAwait), List(pYield, pAwait, pTagged)) }
    choose(candidates)
  }
  def MemberExpression(pYield: Boolean, pAwait: Boolean): MemberExpression = {
    var candidates: Vector[() => MemberExpression] = Vector()
    candidates :+= { () => MemberExpression0(PrimaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MemberExpression1(MemberExpression(pYield, pAwait), Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MemberExpression2(MemberExpression(pYield, pAwait), IdentifierName(), List(pYield, pAwait)) }
    candidates :+= { () => MemberExpression3(MemberExpression(pYield, pAwait), TemplateLiteral(pYield, pAwait, true), List(pYield, pAwait)) }
    candidates :+= { () => MemberExpression4(SuperProperty(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MemberExpression5(MetaProperty(), List(pYield, pAwait)) }
    candidates :+= { () => MemberExpression6(MemberExpression(pYield, pAwait), Arguments(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def SuperProperty(pYield: Boolean, pAwait: Boolean): SuperProperty = {
    var candidates: Vector[() => SuperProperty] = Vector()
    candidates :+= { () => SuperProperty0(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => SuperProperty1(IdentifierName(), List(pYield, pAwait)) }
    choose(candidates)
  }
  def MetaProperty(): MetaProperty = {
    var candidates: Vector[() => MetaProperty] = Vector()
    candidates :+= { () => MetaProperty0(NewTarget(), List()) }
    candidates :+= { () => MetaProperty1(ImportMeta(), List()) }
    choose(candidates)
  }
  def NewTarget(): NewTarget = {
    var candidates: Vector[() => NewTarget] = Vector()
    candidates :+= { () => NewTarget0(List()) }
    choose(candidates)
  }
  def ImportMeta(): ImportMeta = {
    var candidates: Vector[() => ImportMeta] = Vector()
    candidates :+= { () => ImportMeta0(List()) }
    choose(candidates)
  }
  def NewExpression(pYield: Boolean, pAwait: Boolean): NewExpression = {
    var candidates: Vector[() => NewExpression] = Vector()
    candidates :+= { () => NewExpression0(MemberExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => NewExpression1(NewExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def CallExpression(pYield: Boolean, pAwait: Boolean): CallExpression = {
    var candidates: Vector[() => CallExpression] = Vector()
    candidates :+= { () => CallExpression0(CoverCallExpressionAndAsyncArrowHead(), List(pYield, pAwait)) }
    candidates :+= { () => CallExpression1(SuperCall(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CallExpression2(ImportCall(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CallExpression3(CallExpression(pYield, pAwait), Arguments(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CallExpression4(CallExpression(pYield, pAwait), Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CallExpression5(CallExpression(pYield, pAwait), IdentifierName(), List(pYield, pAwait)) }
    candidates :+= { () => CallExpression6(CallExpression(pYield, pAwait), TemplateLiteral(pYield, pAwait, true), List(pYield, pAwait)) }
    choose(candidates)
  }
  def CallMemberExpression(pYield: Boolean, pAwait: Boolean): CallMemberExpression = {
    var candidates: Vector[() => CallMemberExpression] = Vector()
    candidates :+= { () => CallMemberExpression0(MemberExpression(pYield, pAwait), Arguments(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def SuperCall(pYield: Boolean, pAwait: Boolean): SuperCall = {
    var candidates: Vector[() => SuperCall] = Vector()
    candidates :+= { () => SuperCall0(Arguments(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ImportCall(pYield: Boolean, pAwait: Boolean): ImportCall = {
    var candidates: Vector[() => ImportCall] = Vector()
    candidates :+= { () => ImportCall0(AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def Arguments(pYield: Boolean, pAwait: Boolean): Arguments = {
    var candidates: Vector[() => Arguments] = Vector()
    candidates :+= { () => Arguments0(List(pYield, pAwait)) }
    candidates :+= { () => Arguments1(ArgumentList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => Arguments2(ArgumentList(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ArgumentList(pYield: Boolean, pAwait: Boolean): ArgumentList = {
    var candidates: Vector[() => ArgumentList] = Vector()
    candidates :+= { () => ArgumentList0(AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArgumentList1(AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArgumentList2(ArgumentList(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArgumentList3(ArgumentList(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def OptionalExpression(pYield: Boolean, pAwait: Boolean): OptionalExpression = {
    var candidates: Vector[() => OptionalExpression] = Vector()
    candidates :+= { () => OptionalExpression0(MemberExpression(pYield, pAwait), OptionalChain(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => OptionalExpression1(CallExpression(pYield, pAwait), OptionalChain(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => OptionalExpression2(OptionalExpression(pYield, pAwait), OptionalChain(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def OptionalChain(pYield: Boolean, pAwait: Boolean): OptionalChain = {
    var candidates: Vector[() => OptionalChain] = Vector()
    candidates :+= { () => OptionalChain0(Arguments(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain1(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain2(IdentifierName(), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain3(TemplateLiteral(pYield, pAwait, true), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain4(OptionalChain(pYield, pAwait), Arguments(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain5(OptionalChain(pYield, pAwait), Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain6(OptionalChain(pYield, pAwait), IdentifierName(), List(pYield, pAwait)) }
    candidates :+= { () => OptionalChain7(OptionalChain(pYield, pAwait), TemplateLiteral(pYield, pAwait, true), List(pYield, pAwait)) }
    choose(candidates)
  }
  def LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): LeftHandSideExpression = {
    var candidates: Vector[() => LeftHandSideExpression] = Vector()
    candidates :+= { () => LeftHandSideExpression0(NewExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => LeftHandSideExpression1(CallExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => LeftHandSideExpression2(OptionalExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def UpdateExpression(pYield: Boolean, pAwait: Boolean): UpdateExpression = {
    var candidates: Vector[() => UpdateExpression] = Vector()
    candidates :+= { () => UpdateExpression0(LeftHandSideExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UpdateExpression1(LeftHandSideExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UpdateExpression2(LeftHandSideExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UpdateExpression3(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UpdateExpression4(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def UnaryExpression(pYield: Boolean, pAwait: Boolean): UnaryExpression = {
    var candidates: Vector[() => UnaryExpression] = Vector()
    candidates :+= { () => UnaryExpression0(UpdateExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression1(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression2(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression3(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression4(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression5(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression6(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => UnaryExpression7(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    if (pAwait) candidates :+= { () => UnaryExpression8(AwaitExpression(pYield), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ExponentiationExpression(pYield: Boolean, pAwait: Boolean): ExponentiationExpression = {
    var candidates: Vector[() => ExponentiationExpression] = Vector()
    candidates :+= { () => ExponentiationExpression0(UnaryExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ExponentiationExpression1(UpdateExpression(pYield, pAwait), ExponentiationExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): MultiplicativeExpression = {
    var candidates: Vector[() => MultiplicativeExpression] = Vector()
    candidates :+= { () => MultiplicativeExpression0(ExponentiationExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MultiplicativeExpression1(MultiplicativeExpression(pYield, pAwait), MultiplicativeOperator(), ExponentiationExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def MultiplicativeOperator(): MultiplicativeOperator = {
    var candidates: Vector[() => MultiplicativeOperator] = Vector()
    candidates :+= { () => MultiplicativeOperator0(List()) }
    candidates :+= { () => MultiplicativeOperator1(List()) }
    candidates :+= { () => MultiplicativeOperator2(List()) }
    choose(candidates)
  }
  def AdditiveExpression(pYield: Boolean, pAwait: Boolean): AdditiveExpression = {
    var candidates: Vector[() => AdditiveExpression] = Vector()
    candidates :+= { () => AdditiveExpression0(MultiplicativeExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => AdditiveExpression1(AdditiveExpression(pYield, pAwait), MultiplicativeExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => AdditiveExpression2(AdditiveExpression(pYield, pAwait), MultiplicativeExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ShiftExpression(pYield: Boolean, pAwait: Boolean): ShiftExpression = {
    var candidates: Vector[() => ShiftExpression] = Vector()
    candidates :+= { () => ShiftExpression0(AdditiveExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ShiftExpression1(ShiftExpression(pYield, pAwait), AdditiveExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ShiftExpression2(ShiftExpression(pYield, pAwait), AdditiveExpression(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ShiftExpression3(ShiftExpression(pYield, pAwait), AdditiveExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): RelationalExpression = {
    var candidates: Vector[() => RelationalExpression] = Vector()
    candidates :+= { () => RelationalExpression0(ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => RelationalExpression1(RelationalExpression(pIn, pYield, pAwait), ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => RelationalExpression2(RelationalExpression(pIn, pYield, pAwait), ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => RelationalExpression3(RelationalExpression(pIn, pYield, pAwait), ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => RelationalExpression4(RelationalExpression(pIn, pYield, pAwait), ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => RelationalExpression5(RelationalExpression(pIn, pYield, pAwait), ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    if (pIn) candidates :+= { () => RelationalExpression6(RelationalExpression(true, pYield, pAwait), ShiftExpression(pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): EqualityExpression = {
    var candidates: Vector[() => EqualityExpression] = Vector()
    candidates :+= { () => EqualityExpression0(RelationalExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => EqualityExpression1(EqualityExpression(pIn, pYield, pAwait), RelationalExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => EqualityExpression2(EqualityExpression(pIn, pYield, pAwait), RelationalExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => EqualityExpression3(EqualityExpression(pIn, pYield, pAwait), RelationalExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => EqualityExpression4(EqualityExpression(pIn, pYield, pAwait), RelationalExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): BitwiseANDExpression = {
    var candidates: Vector[() => BitwiseANDExpression] = Vector()
    candidates :+= { () => BitwiseANDExpression0(EqualityExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => BitwiseANDExpression1(BitwiseANDExpression(pIn, pYield, pAwait), EqualityExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): BitwiseXORExpression = {
    var candidates: Vector[() => BitwiseXORExpression] = Vector()
    candidates :+= { () => BitwiseXORExpression0(BitwiseANDExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => BitwiseXORExpression1(BitwiseXORExpression(pIn, pYield, pAwait), BitwiseANDExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): BitwiseORExpression = {
    var candidates: Vector[() => BitwiseORExpression] = Vector()
    candidates :+= { () => BitwiseORExpression0(BitwiseXORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => BitwiseORExpression1(BitwiseORExpression(pIn, pYield, pAwait), BitwiseXORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): LogicalANDExpression = {
    var candidates: Vector[() => LogicalANDExpression] = Vector()
    candidates :+= { () => LogicalANDExpression0(BitwiseORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => LogicalANDExpression1(LogicalANDExpression(pIn, pYield, pAwait), BitwiseORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): LogicalORExpression = {
    var candidates: Vector[() => LogicalORExpression] = Vector()
    candidates :+= { () => LogicalORExpression0(LogicalANDExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => LogicalORExpression1(LogicalORExpression(pIn, pYield, pAwait), LogicalANDExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): CoalesceExpression = {
    var candidates: Vector[() => CoalesceExpression] = Vector()
    candidates :+= { () => CoalesceExpression0(CoalesceExpressionHead(pIn, pYield, pAwait), BitwiseORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): CoalesceExpressionHead = {
    var candidates: Vector[() => CoalesceExpressionHead] = Vector()
    candidates :+= { () => CoalesceExpressionHead0(CoalesceExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => CoalesceExpressionHead1(BitwiseORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ShortCircuitExpression = {
    var candidates: Vector[() => ShortCircuitExpression] = Vector()
    candidates :+= { () => ShortCircuitExpression0(LogicalORExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => ShortCircuitExpression1(CoalesceExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ConditionalExpression = {
    var candidates: Vector[() => ConditionalExpression] = Vector()
    candidates :+= { () => ConditionalExpression0(ShortCircuitExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => ConditionalExpression1(ShortCircuitExpression(pIn, pYield, pAwait), AssignmentExpression(true, pYield, pAwait), AssignmentExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression = {
    var candidates: Vector[() => AssignmentExpression] = Vector()
    candidates :+= { () => AssignmentExpression0(ConditionalExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    if (pYield) candidates :+= { () => AssignmentExpression1(YieldExpression(pIn, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => AssignmentExpression2(ArrowFunction(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => AssignmentExpression3(AsyncArrowFunction(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => AssignmentExpression4(LeftHandSideExpression(pYield, pAwait), AssignmentExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => AssignmentExpression5(LeftHandSideExpression(pYield, pAwait), AssignmentOperator(), AssignmentExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentOperator(): AssignmentOperator = {
    var candidates: Vector[() => AssignmentOperator] = Vector()
    candidates :+= { () => AssignmentOperator0(List()) }
    candidates :+= { () => AssignmentOperator1(List()) }
    candidates :+= { () => AssignmentOperator2(List()) }
    candidates :+= { () => AssignmentOperator3(List()) }
    candidates :+= { () => AssignmentOperator4(List()) }
    candidates :+= { () => AssignmentOperator5(List()) }
    candidates :+= { () => AssignmentOperator6(List()) }
    candidates :+= { () => AssignmentOperator7(List()) }
    candidates :+= { () => AssignmentOperator8(List()) }
    candidates :+= { () => AssignmentOperator9(List()) }
    candidates :+= { () => AssignmentOperator10(List()) }
    candidates :+= { () => AssignmentOperator11(List()) }
    choose(candidates)
  }
  def AssignmentPattern(pYield: Boolean, pAwait: Boolean): AssignmentPattern = {
    var candidates: Vector[() => AssignmentPattern] = Vector()
    candidates :+= { () => AssignmentPattern0(ObjectAssignmentPattern(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => AssignmentPattern1(ArrayAssignmentPattern(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): ObjectAssignmentPattern = {
    var candidates: Vector[() => ObjectAssignmentPattern] = Vector()
    candidates :+= { () => ObjectAssignmentPattern0(List(pYield, pAwait)) }
    candidates :+= { () => ObjectAssignmentPattern1(AssignmentRestProperty(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ObjectAssignmentPattern2(AssignmentPropertyList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ObjectAssignmentPattern3(AssignmentPropertyList(pYield, pAwait), opt(AssignmentRestProperty(pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): ArrayAssignmentPattern = {
    var candidates: Vector[() => ArrayAssignmentPattern] = Vector()
    candidates :+= { () => ArrayAssignmentPattern0(opt(Elision()), opt(AssignmentRestElement(pYield, pAwait)), List(pYield, pAwait)) }
    candidates :+= { () => ArrayAssignmentPattern1(AssignmentElementList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArrayAssignmentPattern2(AssignmentElementList(pYield, pAwait), opt(Elision()), opt(AssignmentRestElement(pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): AssignmentRestProperty = {
    var candidates: Vector[() => AssignmentRestProperty] = Vector()
    candidates :+= { () => AssignmentRestProperty0(DestructuringAssignmentTarget(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): AssignmentPropertyList = {
    var candidates: Vector[() => AssignmentPropertyList] = Vector()
    candidates :+= { () => AssignmentPropertyList0(AssignmentProperty(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => AssignmentPropertyList1(AssignmentPropertyList(pYield, pAwait), AssignmentProperty(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentElementList(pYield: Boolean, pAwait: Boolean): AssignmentElementList = {
    var candidates: Vector[() => AssignmentElementList] = Vector()
    candidates :+= { () => AssignmentElementList0(AssignmentElisionElement(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => AssignmentElementList1(AssignmentElementList(pYield, pAwait), AssignmentElisionElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): AssignmentElisionElement = {
    var candidates: Vector[() => AssignmentElisionElement] = Vector()
    candidates :+= { () => AssignmentElisionElement0(opt(Elision()), AssignmentElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentProperty(pYield: Boolean, pAwait: Boolean): AssignmentProperty = {
    var candidates: Vector[() => AssignmentProperty] = Vector()
    candidates :+= { () => AssignmentProperty0(IdentifierReference(pYield, pAwait), opt(Initializer(true, pYield, pAwait)), List(pYield, pAwait)) }
    candidates :+= { () => AssignmentProperty1(PropertyName(pYield, pAwait), AssignmentElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentElement(pYield: Boolean, pAwait: Boolean): AssignmentElement = {
    var candidates: Vector[() => AssignmentElement] = Vector()
    candidates :+= { () => AssignmentElement0(DestructuringAssignmentTarget(pYield, pAwait), opt(Initializer(true, pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AssignmentRestElement(pYield: Boolean, pAwait: Boolean): AssignmentRestElement = {
    var candidates: Vector[() => AssignmentRestElement] = Vector()
    candidates :+= { () => AssignmentRestElement0(DestructuringAssignmentTarget(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): DestructuringAssignmentTarget = {
    var candidates: Vector[() => DestructuringAssignmentTarget] = Vector()
    candidates :+= { () => DestructuringAssignmentTarget0(LeftHandSideExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Expression = {
    var candidates: Vector[() => Expression] = Vector()
    candidates :+= { () => Expression0(AssignmentExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => Expression1(Expression(pIn, pYield, pAwait), AssignmentExpression(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement = {
    var candidates: Vector[() => Statement] = Vector()
    candidates :+= { () => Statement0(BlockStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement1(VariableStatement(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement2(EmptyStatement(), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement3(ExpressionStatement(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement4(IfStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement5(BreakableStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement6(ContinueStatement(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement7(BreakStatement(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    if (pReturn) candidates :+= { () => Statement8(ReturnStatement(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement9(WithStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement10(LabelledStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement11(ThrowStatement(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement12(TryStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Statement13(DebuggerStatement(), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def Declaration(pYield: Boolean, pAwait: Boolean): Declaration = {
    var candidates: Vector[() => Declaration] = Vector()
    candidates :+= { () => Declaration0(HoistableDeclaration(pYield, pAwait, false), List(pYield, pAwait)) }
    candidates :+= { () => Declaration1(ClassDeclaration(pYield, pAwait, false), List(pYield, pAwait)) }
    candidates :+= { () => Declaration2(LexicalDeclaration(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): HoistableDeclaration = {
    var candidates: Vector[() => HoistableDeclaration] = Vector()
    candidates :+= { () => HoistableDeclaration0(FunctionDeclaration(pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) }
    candidates :+= { () => HoistableDeclaration1(GeneratorDeclaration(pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) }
    candidates :+= { () => HoistableDeclaration2(AsyncFunctionDeclaration(pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) }
    candidates :+= { () => HoistableDeclaration3(AsyncGeneratorDeclaration(pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) }
    choose(candidates)
  }
  def BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): BreakableStatement = {
    var candidates: Vector[() => BreakableStatement] = Vector()
    candidates :+= { () => BreakableStatement0(IterationStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => BreakableStatement1(SwitchStatement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): BlockStatement = {
    var candidates: Vector[() => BlockStatement] = Vector()
    candidates :+= { () => BlockStatement0(Block(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Block = {
    var candidates: Vector[() => Block] = Vector()
    candidates :+= { () => Block0(opt(StatementList(pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementList = {
    var candidates: Vector[() => StatementList] = Vector()
    candidates :+= { () => StatementList0(StatementListItem(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => StatementList1(StatementList(pYield, pAwait, pReturn), StatementListItem(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementListItem = {
    var candidates: Vector[() => StatementListItem] = Vector()
    candidates :+= { () => StatementListItem0(Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => StatementListItem1(Declaration(pYield, pAwait), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): LexicalDeclaration = {
    var candidates: Vector[() => LexicalDeclaration] = Vector()
    candidates :+= { () => LexicalDeclaration0(LetOrConst(), BindingList(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def LetOrConst(): LetOrConst = {
    var candidates: Vector[() => LetOrConst] = Vector()
    candidates :+= { () => LetOrConst0(List()) }
    candidates :+= { () => LetOrConst1(List()) }
    choose(candidates)
  }
  def BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): BindingList = {
    var candidates: Vector[() => BindingList] = Vector()
    candidates :+= { () => BindingList0(LexicalBinding(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => BindingList1(BindingList(pIn, pYield, pAwait), LexicalBinding(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): LexicalBinding = {
    var candidates: Vector[() => LexicalBinding] = Vector()
    candidates :+= { () => LexicalBinding0(BindingIdentifier(pYield, pAwait), opt(Initializer(pIn, pYield, pAwait)), List(pIn, pYield, pAwait)) }
    candidates :+= { () => LexicalBinding1(BindingPattern(pYield, pAwait), Initializer(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def VariableStatement(pYield: Boolean, pAwait: Boolean): VariableStatement = {
    var candidates: Vector[() => VariableStatement] = Vector()
    candidates :+= { () => VariableStatement0(VariableDeclarationList(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): VariableDeclarationList = {
    var candidates: Vector[() => VariableDeclarationList] = Vector()
    candidates :+= { () => VariableDeclarationList0(VariableDeclaration(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    candidates :+= { () => VariableDeclarationList1(VariableDeclarationList(pIn, pYield, pAwait), VariableDeclaration(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): VariableDeclaration = {
    var candidates: Vector[() => VariableDeclaration] = Vector()
    candidates :+= { () => VariableDeclaration0(BindingIdentifier(pYield, pAwait), opt(Initializer(pIn, pYield, pAwait)), List(pIn, pYield, pAwait)) }
    candidates :+= { () => VariableDeclaration1(BindingPattern(pYield, pAwait), Initializer(pIn, pYield, pAwait), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def BindingPattern(pYield: Boolean, pAwait: Boolean): BindingPattern = {
    var candidates: Vector[() => BindingPattern] = Vector()
    candidates :+= { () => BindingPattern0(ObjectBindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => BindingPattern1(ArrayBindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): ObjectBindingPattern = {
    var candidates: Vector[() => ObjectBindingPattern] = Vector()
    candidates :+= { () => ObjectBindingPattern0(List(pYield, pAwait)) }
    candidates :+= { () => ObjectBindingPattern1(BindingRestProperty(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ObjectBindingPattern2(BindingPropertyList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ObjectBindingPattern3(BindingPropertyList(pYield, pAwait), opt(BindingRestProperty(pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): ArrayBindingPattern = {
    var candidates: Vector[() => ArrayBindingPattern] = Vector()
    candidates :+= { () => ArrayBindingPattern0(opt(Elision()), opt(BindingRestElement(pYield, pAwait)), List(pYield, pAwait)) }
    candidates :+= { () => ArrayBindingPattern1(BindingElementList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArrayBindingPattern2(BindingElementList(pYield, pAwait), opt(Elision()), opt(BindingRestElement(pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingRestProperty(pYield: Boolean, pAwait: Boolean): BindingRestProperty = {
    var candidates: Vector[() => BindingRestProperty] = Vector()
    candidates :+= { () => BindingRestProperty0(BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingPropertyList(pYield: Boolean, pAwait: Boolean): BindingPropertyList = {
    var candidates: Vector[() => BindingPropertyList] = Vector()
    candidates :+= { () => BindingPropertyList0(BindingProperty(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => BindingPropertyList1(BindingPropertyList(pYield, pAwait), BindingProperty(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingElementList(pYield: Boolean, pAwait: Boolean): BindingElementList = {
    var candidates: Vector[() => BindingElementList] = Vector()
    candidates :+= { () => BindingElementList0(BindingElisionElement(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => BindingElementList1(BindingElementList(pYield, pAwait), BindingElisionElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingElisionElement(pYield: Boolean, pAwait: Boolean): BindingElisionElement = {
    var candidates: Vector[() => BindingElisionElement] = Vector()
    candidates :+= { () => BindingElisionElement0(opt(Elision()), BindingElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingProperty(pYield: Boolean, pAwait: Boolean): BindingProperty = {
    var candidates: Vector[() => BindingProperty] = Vector()
    candidates :+= { () => BindingProperty0(SingleNameBinding(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => BindingProperty1(PropertyName(pYield, pAwait), BindingElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingElement(pYield: Boolean, pAwait: Boolean): BindingElement = {
    var candidates: Vector[() => BindingElement] = Vector()
    candidates :+= { () => BindingElement0(SingleNameBinding(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => BindingElement1(BindingPattern(pYield, pAwait), opt(Initializer(true, pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def SingleNameBinding(pYield: Boolean, pAwait: Boolean): SingleNameBinding = {
    var candidates: Vector[() => SingleNameBinding] = Vector()
    candidates :+= { () => SingleNameBinding0(BindingIdentifier(pYield, pAwait), opt(Initializer(true, pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BindingRestElement(pYield: Boolean, pAwait: Boolean): BindingRestElement = {
    var candidates: Vector[() => BindingRestElement] = Vector()
    candidates :+= { () => BindingRestElement0(BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => BindingRestElement1(BindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def EmptyStatement(): EmptyStatement = {
    var candidates: Vector[() => EmptyStatement] = Vector()
    candidates :+= { () => EmptyStatement0(List()) }
    choose(candidates)
  }
  def ExpressionStatement(pYield: Boolean, pAwait: Boolean): ExpressionStatement = {
    var candidates: Vector[() => ExpressionStatement] = Vector()
    candidates :+= { () => ExpressionStatement0(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): IfStatement = {
    var candidates: Vector[() => IfStatement] = Vector()
    candidates :+= { () => IfStatement0(Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IfStatement1(Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): IterationStatement = {
    var candidates: Vector[() => IterationStatement] = Vector()
    candidates :+= { () => IterationStatement0(Statement(pYield, pAwait, pReturn), Expression(true, pYield, pAwait), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement1(Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement2(opt(Expression(false, pYield, pAwait)), opt(Expression(true, pYield, pAwait)), opt(Expression(true, pYield, pAwait)), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement3(VariableDeclarationList(false, pYield, pAwait), opt(Expression(true, pYield, pAwait)), opt(Expression(true, pYield, pAwait)), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement4(LexicalDeclaration(false, pYield, pAwait), opt(Expression(true, pYield, pAwait)), opt(Expression(true, pYield, pAwait)), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement5(LeftHandSideExpression(pYield, pAwait), Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement6(ForBinding(pYield, pAwait), Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement7(ForDeclaration(pYield, pAwait), Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement8(LeftHandSideExpression(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement9(ForBinding(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => IterationStatement10(ForDeclaration(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    if (pAwait) candidates :+= { () => IterationStatement11(LeftHandSideExpression(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    if (pAwait) candidates :+= { () => IterationStatement12(ForBinding(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    if (pAwait) candidates :+= { () => IterationStatement13(ForDeclaration(pYield, pAwait), AssignmentExpression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def ForDeclaration(pYield: Boolean, pAwait: Boolean): ForDeclaration = {
    var candidates: Vector[() => ForDeclaration] = Vector()
    candidates :+= { () => ForDeclaration0(LetOrConst(), ForBinding(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ForBinding(pYield: Boolean, pAwait: Boolean): ForBinding = {
    var candidates: Vector[() => ForBinding] = Vector()
    candidates :+= { () => ForBinding0(BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ForBinding1(BindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ContinueStatement(pYield: Boolean, pAwait: Boolean): ContinueStatement = {
    var candidates: Vector[() => ContinueStatement] = Vector()
    candidates :+= { () => ContinueStatement0(List(pYield, pAwait)) }
    candidates :+= { () => ContinueStatement1(LabelIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def BreakStatement(pYield: Boolean, pAwait: Boolean): BreakStatement = {
    var candidates: Vector[() => BreakStatement] = Vector()
    candidates :+= { () => BreakStatement0(List(pYield, pAwait)) }
    candidates :+= { () => BreakStatement1(LabelIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ReturnStatement(pYield: Boolean, pAwait: Boolean): ReturnStatement = {
    var candidates: Vector[() => ReturnStatement] = Vector()
    candidates :+= { () => ReturnStatement0(List(pYield, pAwait)) }
    candidates :+= { () => ReturnStatement1(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): WithStatement = {
    var candidates: Vector[() => WithStatement] = Vector()
    candidates :+= { () => WithStatement0(Expression(true, pYield, pAwait), Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): SwitchStatement = {
    var candidates: Vector[() => SwitchStatement] = Vector()
    candidates :+= { () => SwitchStatement0(Expression(true, pYield, pAwait), CaseBlock(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): CaseBlock = {
    var candidates: Vector[() => CaseBlock] = Vector()
    candidates :+= { () => CaseBlock0(opt(CaseClauses(pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => CaseBlock1(opt(CaseClauses(pYield, pAwait, pReturn)), DefaultClause(pYield, pAwait, pReturn), opt(CaseClauses(pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): CaseClauses = {
    var candidates: Vector[() => CaseClauses] = Vector()
    candidates :+= { () => CaseClauses0(CaseClause(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => CaseClauses1(CaseClauses(pYield, pAwait, pReturn), CaseClause(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): CaseClause = {
    var candidates: Vector[() => CaseClause] = Vector()
    candidates :+= { () => CaseClause0(Expression(true, pYield, pAwait), opt(StatementList(pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): DefaultClause = {
    var candidates: Vector[() => DefaultClause] = Vector()
    candidates :+= { () => DefaultClause0(opt(StatementList(pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): LabelledStatement = {
    var candidates: Vector[() => LabelledStatement] = Vector()
    candidates :+= { () => LabelledStatement0(LabelIdentifier(pYield, pAwait), LabelledItem(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): LabelledItem = {
    var candidates: Vector[() => LabelledItem] = Vector()
    candidates :+= { () => LabelledItem0(Statement(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => LabelledItem1(FunctionDeclaration(pYield, pAwait, false), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def ThrowStatement(pYield: Boolean, pAwait: Boolean): ThrowStatement = {
    var candidates: Vector[() => ThrowStatement] = Vector()
    candidates :+= { () => ThrowStatement0(Expression(true, pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): TryStatement = {
    var candidates: Vector[() => TryStatement] = Vector()
    candidates :+= { () => TryStatement0(Block(pYield, pAwait, pReturn), Catch(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => TryStatement1(Block(pYield, pAwait, pReturn), Finally(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => TryStatement2(Block(pYield, pAwait, pReturn), Catch(pYield, pAwait, pReturn), Finally(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Catch = {
    var candidates: Vector[() => Catch] = Vector()
    candidates :+= { () => Catch0(CatchParameter(pYield, pAwait), Block(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    candidates :+= { () => Catch1(Block(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Finally = {
    var candidates: Vector[() => Finally] = Vector()
    candidates :+= { () => Finally0(Block(pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) }
    choose(candidates)
  }
  def CatchParameter(pYield: Boolean, pAwait: Boolean): CatchParameter = {
    var candidates: Vector[() => CatchParameter] = Vector()
    candidates :+= { () => CatchParameter0(BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => CatchParameter1(BindingPattern(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def DebuggerStatement(): DebuggerStatement = {
    var candidates: Vector[() => DebuggerStatement] = Vector()
    candidates :+= { () => DebuggerStatement0(List()) }
    choose(candidates)
  }
  def FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): FunctionDeclaration = {
    var candidates: Vector[() => FunctionDeclaration] = Vector()
    candidates :+= { () => FunctionDeclaration0(BindingIdentifier(pYield, pAwait), FormalParameters(false, false), FunctionBody(false, false), List(pYield, pAwait, pDefault)) }
    if (pDefault) candidates :+= { () => FunctionDeclaration1(FormalParameters(false, false), FunctionBody(false, false), List(pYield, pAwait, pDefault)) }
    choose(candidates)
  }
  def FunctionExpression(): FunctionExpression = {
    var candidates: Vector[() => FunctionExpression] = Vector()
    candidates :+= { () => FunctionExpression0(opt(BindingIdentifier(false, false)), FormalParameters(false, false), FunctionBody(false, false), List()) }
    choose(candidates)
  }
  def UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): UniqueFormalParameters = {
    var candidates: Vector[() => UniqueFormalParameters] = Vector()
    candidates :+= { () => UniqueFormalParameters0(FormalParameters(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def FormalParameters(pYield: Boolean, pAwait: Boolean): FormalParameters = {
    var candidates: Vector[() => FormalParameters] = Vector()
    candidates :+= { () => FormalParameters0(List(pYield, pAwait)) }
    candidates :+= { () => FormalParameters1(FunctionRestParameter(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => FormalParameters2(FormalParameterList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => FormalParameters3(FormalParameterList(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => FormalParameters4(FormalParameterList(pYield, pAwait), FunctionRestParameter(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def FormalParameterList(pYield: Boolean, pAwait: Boolean): FormalParameterList = {
    var candidates: Vector[() => FormalParameterList] = Vector()
    candidates :+= { () => FormalParameterList0(FormalParameter(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => FormalParameterList1(FormalParameterList(pYield, pAwait), FormalParameter(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def FunctionRestParameter(pYield: Boolean, pAwait: Boolean): FunctionRestParameter = {
    var candidates: Vector[() => FunctionRestParameter] = Vector()
    candidates :+= { () => FunctionRestParameter0(BindingRestElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def FormalParameter(pYield: Boolean, pAwait: Boolean): FormalParameter = {
    var candidates: Vector[() => FormalParameter] = Vector()
    candidates :+= { () => FormalParameter0(BindingElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def FunctionBody(pYield: Boolean, pAwait: Boolean): FunctionBody = {
    var candidates: Vector[() => FunctionBody] = Vector()
    candidates :+= { () => FunctionBody0(FunctionStatementList(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def FunctionStatementList(pYield: Boolean, pAwait: Boolean): FunctionStatementList = {
    var candidates: Vector[() => FunctionStatementList] = Vector()
    candidates :+= { () => FunctionStatementList0(opt(StatementList(pYield, pAwait, true)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ArrowFunction = {
    var candidates: Vector[() => ArrowFunction] = Vector()
    candidates :+= { () => ArrowFunction0(ArrowParameters(pYield, pAwait), ConciseBody(pIn), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def ArrowParameters(pYield: Boolean, pAwait: Boolean): ArrowParameters = {
    var candidates: Vector[() => ArrowParameters] = Vector()
    candidates :+= { () => ArrowParameters0(BindingIdentifier(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ArrowParameters1(CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ConciseBody(pIn: Boolean): ConciseBody = {
    var candidates: Vector[() => ConciseBody] = Vector()
    candidates :+= { () => ConciseBody0(ExpressionBody(pIn, false), List(pIn)) }
    candidates :+= { () => ConciseBody1(FunctionBody(false, false), List(pIn)) }
    choose(candidates)
  }
  def ExpressionBody(pIn: Boolean, pAwait: Boolean): ExpressionBody = {
    var candidates: Vector[() => ExpressionBody] = Vector()
    candidates :+= { () => ExpressionBody0(AssignmentExpression(pIn, false, pAwait), List(pIn, pAwait)) }
    choose(candidates)
  }
  def ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): ArrowFormalParameters = {
    var candidates: Vector[() => ArrowFormalParameters] = Vector()
    candidates :+= { () => ArrowFormalParameters0(UniqueFormalParameters(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): AsyncArrowFunction = {
    var candidates: Vector[() => AsyncArrowFunction] = Vector()
    candidates :+= { () => AsyncArrowFunction0(AsyncArrowBindingIdentifier(pYield), AsyncConciseBody(pIn), List(pIn, pYield, pAwait)) }
    candidates :+= { () => AsyncArrowFunction1(CoverCallExpressionAndAsyncArrowHead(), AsyncConciseBody(pIn), List(pIn, pYield, pAwait)) }
    choose(candidates)
  }
  def AsyncConciseBody(pIn: Boolean): AsyncConciseBody = {
    var candidates: Vector[() => AsyncConciseBody] = Vector()
    candidates :+= { () => AsyncConciseBody0(ExpressionBody(pIn, true), List(pIn)) }
    candidates :+= { () => AsyncConciseBody1(AsyncFunctionBody(), List(pIn)) }
    choose(candidates)
  }
  def AsyncArrowBindingIdentifier(pYield: Boolean): AsyncArrowBindingIdentifier = {
    var candidates: Vector[() => AsyncArrowBindingIdentifier] = Vector()
    candidates :+= { () => AsyncArrowBindingIdentifier0(BindingIdentifier(pYield, true), List(pYield)) }
    choose(candidates)
  }
  def CoverCallExpressionAndAsyncArrowHead(): CoverCallExpressionAndAsyncArrowHead = {
    var candidates: Vector[() => CoverCallExpressionAndAsyncArrowHead] = Vector()
    candidates :+= { () => CoverCallExpressionAndAsyncArrowHead0(MemberExpression(false, false), Arguments(false, false), List()) }
    choose(candidates)
  }
  def AsyncArrowHead(): AsyncArrowHead = {
    var candidates: Vector[() => AsyncArrowHead] = Vector()
    candidates :+= { () => AsyncArrowHead0(ArrowFormalParameters(false, true), List()) }
    choose(candidates)
  }
  def MethodDefinition(pYield: Boolean, pAwait: Boolean): MethodDefinition = {
    var candidates: Vector[() => MethodDefinition] = Vector()
    candidates :+= { () => MethodDefinition0(PropertyName(pYield, pAwait), UniqueFormalParameters(false, false), FunctionBody(false, false), List(pYield, pAwait)) }
    candidates :+= { () => MethodDefinition1(GeneratorMethod(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MethodDefinition2(AsyncMethod(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MethodDefinition3(AsyncGeneratorMethod(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => MethodDefinition4(PropertyName(pYield, pAwait), FunctionBody(false, false), List(pYield, pAwait)) }
    candidates :+= { () => MethodDefinition5(PropertyName(pYield, pAwait), PropertySetParameterList(), FunctionBody(false, false), List(pYield, pAwait)) }
    choose(candidates)
  }
  def PropertySetParameterList(): PropertySetParameterList = {
    var candidates: Vector[() => PropertySetParameterList] = Vector()
    candidates :+= { () => PropertySetParameterList0(FormalParameter(false, false), List()) }
    choose(candidates)
  }
  def GeneratorMethod(pYield: Boolean, pAwait: Boolean): GeneratorMethod = {
    var candidates: Vector[() => GeneratorMethod] = Vector()
    candidates :+= { () => GeneratorMethod0(PropertyName(pYield, pAwait), UniqueFormalParameters(true, false), GeneratorBody(), List(pYield, pAwait)) }
    choose(candidates)
  }
  def GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): GeneratorDeclaration = {
    var candidates: Vector[() => GeneratorDeclaration] = Vector()
    candidates :+= { () => GeneratorDeclaration0(BindingIdentifier(pYield, pAwait), FormalParameters(true, false), GeneratorBody(), List(pYield, pAwait, pDefault)) }
    if (pDefault) candidates :+= { () => GeneratorDeclaration1(FormalParameters(true, false), GeneratorBody(), List(pYield, pAwait, pDefault)) }
    choose(candidates)
  }
  def GeneratorExpression(): GeneratorExpression = {
    var candidates: Vector[() => GeneratorExpression] = Vector()
    candidates :+= { () => GeneratorExpression0(opt(BindingIdentifier(true, false)), FormalParameters(true, false), GeneratorBody(), List()) }
    choose(candidates)
  }
  def GeneratorBody(): GeneratorBody = {
    var candidates: Vector[() => GeneratorBody] = Vector()
    candidates :+= { () => GeneratorBody0(FunctionBody(true, false), List()) }
    choose(candidates)
  }
  def YieldExpression(pIn: Boolean, pAwait: Boolean): YieldExpression = {
    var candidates: Vector[() => YieldExpression] = Vector()
    candidates :+= { () => YieldExpression0(List(pIn, pAwait)) }
    candidates :+= { () => YieldExpression1(AssignmentExpression(pIn, true, pAwait), List(pIn, pAwait)) }
    candidates :+= { () => YieldExpression2(AssignmentExpression(pIn, true, pAwait), List(pIn, pAwait)) }
    choose(candidates)
  }
  def AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): AsyncGeneratorMethod = {
    var candidates: Vector[() => AsyncGeneratorMethod] = Vector()
    candidates :+= { () => AsyncGeneratorMethod0(PropertyName(pYield, pAwait), UniqueFormalParameters(true, true), AsyncGeneratorBody(), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): AsyncGeneratorDeclaration = {
    var candidates: Vector[() => AsyncGeneratorDeclaration] = Vector()
    candidates :+= { () => AsyncGeneratorDeclaration0(BindingIdentifier(pYield, pAwait), FormalParameters(true, true), AsyncGeneratorBody(), List(pYield, pAwait, pDefault)) }
    if (pDefault) candidates :+= { () => AsyncGeneratorDeclaration1(FormalParameters(true, true), AsyncGeneratorBody(), List(pYield, pAwait, pDefault)) }
    choose(candidates)
  }
  def AsyncGeneratorExpression(): AsyncGeneratorExpression = {
    var candidates: Vector[() => AsyncGeneratorExpression] = Vector()
    candidates :+= { () => AsyncGeneratorExpression0(opt(BindingIdentifier(true, true)), FormalParameters(true, true), AsyncGeneratorBody(), List()) }
    choose(candidates)
  }
  def AsyncGeneratorBody(): AsyncGeneratorBody = {
    var candidates: Vector[() => AsyncGeneratorBody] = Vector()
    candidates :+= { () => AsyncGeneratorBody0(FunctionBody(true, true), List()) }
    choose(candidates)
  }
  def AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): AsyncFunctionDeclaration = {
    var candidates: Vector[() => AsyncFunctionDeclaration] = Vector()
    candidates :+= { () => AsyncFunctionDeclaration0(BindingIdentifier(pYield, pAwait), FormalParameters(false, true), AsyncFunctionBody(), List(pYield, pAwait, pDefault)) }
    if (pDefault) candidates :+= { () => AsyncFunctionDeclaration1(FormalParameters(false, true), AsyncFunctionBody(), List(pYield, pAwait, pDefault)) }
    choose(candidates)
  }
  def AsyncFunctionExpression(): AsyncFunctionExpression = {
    var candidates: Vector[() => AsyncFunctionExpression] = Vector()
    candidates :+= { () => AsyncFunctionExpression0(FormalParameters(false, true), AsyncFunctionBody(), List()) }
    candidates :+= { () => AsyncFunctionExpression1(BindingIdentifier(false, true), FormalParameters(false, true), AsyncFunctionBody(), List()) }
    choose(candidates)
  }
  def AsyncMethod(pYield: Boolean, pAwait: Boolean): AsyncMethod = {
    var candidates: Vector[() => AsyncMethod] = Vector()
    candidates :+= { () => AsyncMethod0(PropertyName(pYield, pAwait), UniqueFormalParameters(false, true), AsyncFunctionBody(), List(pYield, pAwait)) }
    choose(candidates)
  }
  def AsyncFunctionBody(): AsyncFunctionBody = {
    var candidates: Vector[() => AsyncFunctionBody] = Vector()
    candidates :+= { () => AsyncFunctionBody0(FunctionBody(false, true), List()) }
    choose(candidates)
  }
  def AwaitExpression(pYield: Boolean): AwaitExpression = {
    var candidates: Vector[() => AwaitExpression] = Vector()
    candidates :+= { () => AwaitExpression0(UnaryExpression(pYield, true), List(pYield)) }
    choose(candidates)
  }
  def ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ClassDeclaration = {
    var candidates: Vector[() => ClassDeclaration] = Vector()
    candidates :+= { () => ClassDeclaration0(BindingIdentifier(pYield, pAwait), ClassTail(pYield, pAwait), List(pYield, pAwait, pDefault)) }
    if (pDefault) candidates :+= { () => ClassDeclaration1(ClassTail(pYield, pAwait), List(pYield, pAwait, pDefault)) }
    choose(candidates)
  }
  def ClassExpression(pYield: Boolean, pAwait: Boolean): ClassExpression = {
    var candidates: Vector[() => ClassExpression] = Vector()
    candidates :+= { () => ClassExpression0(opt(BindingIdentifier(pYield, pAwait)), ClassTail(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ClassTail(pYield: Boolean, pAwait: Boolean): ClassTail = {
    var candidates: Vector[() => ClassTail] = Vector()
    candidates :+= { () => ClassTail0(opt(ClassHeritage(pYield, pAwait)), opt(ClassBody(pYield, pAwait)), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ClassHeritage(pYield: Boolean, pAwait: Boolean): ClassHeritage = {
    var candidates: Vector[() => ClassHeritage] = Vector()
    candidates :+= { () => ClassHeritage0(LeftHandSideExpression(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ClassBody(pYield: Boolean, pAwait: Boolean): ClassBody = {
    var candidates: Vector[() => ClassBody] = Vector()
    candidates :+= { () => ClassBody0(ClassElementList(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ClassElementList(pYield: Boolean, pAwait: Boolean): ClassElementList = {
    var candidates: Vector[() => ClassElementList] = Vector()
    candidates :+= { () => ClassElementList0(ClassElement(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ClassElementList1(ClassElementList(pYield, pAwait), ClassElement(pYield, pAwait), List(pYield, pAwait)) }
    choose(candidates)
  }
  def ClassElement(pYield: Boolean, pAwait: Boolean): ClassElement = {
    var candidates: Vector[() => ClassElement] = Vector()
    candidates :+= { () => ClassElement0(MethodDefinition(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ClassElement1(MethodDefinition(pYield, pAwait), List(pYield, pAwait)) }
    candidates :+= { () => ClassElement2(List(pYield, pAwait)) }
    choose(candidates)
  }
  def Script(): Script = {
    var candidates: Vector[() => Script] = Vector()
    candidates :+= { () => Script0(opt(ScriptBody()), List()) }
    choose(candidates)
  }
  def ScriptBody(): ScriptBody = {
    var candidates: Vector[() => ScriptBody] = Vector()
    candidates :+= { () => ScriptBody0(StatementList(false, false, false), List()) }
    choose(candidates)
  }
  def Module(): Module = {
    var candidates: Vector[() => Module] = Vector()
    candidates :+= { () => Module0(opt(ModuleBody()), List()) }
    choose(candidates)
  }
  def ModuleBody(): ModuleBody = {
    var candidates: Vector[() => ModuleBody] = Vector()
    candidates :+= { () => ModuleBody0(ModuleItemList(), List()) }
    choose(candidates)
  }
  def ModuleItemList(): ModuleItemList = {
    var candidates: Vector[() => ModuleItemList] = Vector()
    candidates :+= { () => ModuleItemList0(ModuleItem(), List()) }
    candidates :+= { () => ModuleItemList1(ModuleItemList(), ModuleItem(), List()) }
    choose(candidates)
  }
  def ModuleItem(): ModuleItem = {
    var candidates: Vector[() => ModuleItem] = Vector()
    candidates :+= { () => ModuleItem0(ImportDeclaration(), List()) }
    candidates :+= { () => ModuleItem1(ExportDeclaration(), List()) }
    candidates :+= { () => ModuleItem2(StatementListItem(false, false, false), List()) }
    choose(candidates)
  }
  def ImportDeclaration(): ImportDeclaration = {
    var candidates: Vector[() => ImportDeclaration] = Vector()
    candidates :+= { () => ImportDeclaration0(ImportClause(), FromClause(), List()) }
    candidates :+= { () => ImportDeclaration1(ModuleSpecifier(), List()) }
    choose(candidates)
  }
  def ImportClause(): ImportClause = {
    var candidates: Vector[() => ImportClause] = Vector()
    candidates :+= { () => ImportClause0(ImportedDefaultBinding(), List()) }
    candidates :+= { () => ImportClause1(NameSpaceImport(), List()) }
    candidates :+= { () => ImportClause2(NamedImports(), List()) }
    candidates :+= { () => ImportClause3(ImportedDefaultBinding(), NameSpaceImport(), List()) }
    candidates :+= { () => ImportClause4(ImportedDefaultBinding(), NamedImports(), List()) }
    choose(candidates)
  }
  def ImportedDefaultBinding(): ImportedDefaultBinding = {
    var candidates: Vector[() => ImportedDefaultBinding] = Vector()
    candidates :+= { () => ImportedDefaultBinding0(ImportedBinding(), List()) }
    choose(candidates)
  }
  def NameSpaceImport(): NameSpaceImport = {
    var candidates: Vector[() => NameSpaceImport] = Vector()
    candidates :+= { () => NameSpaceImport0(ImportedBinding(), List()) }
    choose(candidates)
  }
  def NamedImports(): NamedImports = {
    var candidates: Vector[() => NamedImports] = Vector()
    candidates :+= { () => NamedImports0(List()) }
    candidates :+= { () => NamedImports1(ImportsList(), List()) }
    candidates :+= { () => NamedImports2(ImportsList(), List()) }
    choose(candidates)
  }
  def FromClause(): FromClause = {
    var candidates: Vector[() => FromClause] = Vector()
    candidates :+= { () => FromClause0(ModuleSpecifier(), List()) }
    choose(candidates)
  }
  def ImportsList(): ImportsList = {
    var candidates: Vector[() => ImportsList] = Vector()
    candidates :+= { () => ImportsList0(ImportSpecifier(), List()) }
    candidates :+= { () => ImportsList1(ImportsList(), ImportSpecifier(), List()) }
    choose(candidates)
  }
  def ImportSpecifier(): ImportSpecifier = {
    var candidates: Vector[() => ImportSpecifier] = Vector()
    candidates :+= { () => ImportSpecifier0(ImportedBinding(), List()) }
    candidates :+= { () => ImportSpecifier1(IdentifierName(), ImportedBinding(), List()) }
    choose(candidates)
  }
  def ModuleSpecifier(): ModuleSpecifier = {
    var candidates: Vector[() => ModuleSpecifier] = Vector()
    candidates :+= { () => ModuleSpecifier0(StringLiteral(), List()) }
    choose(candidates)
  }
  def ImportedBinding(): ImportedBinding = {
    var candidates: Vector[() => ImportedBinding] = Vector()
    candidates :+= { () => ImportedBinding0(BindingIdentifier(false, false), List()) }
    choose(candidates)
  }
  def ExportDeclaration(): ExportDeclaration = {
    var candidates: Vector[() => ExportDeclaration] = Vector()
    candidates :+= { () => ExportDeclaration0(ExportFromClause(), FromClause(), List()) }
    candidates :+= { () => ExportDeclaration1(NamedExports(), List()) }
    candidates :+= { () => ExportDeclaration2(VariableStatement(false, false), List()) }
    candidates :+= { () => ExportDeclaration3(Declaration(false, false), List()) }
    candidates :+= { () => ExportDeclaration4(HoistableDeclaration(false, false, true), List()) }
    candidates :+= { () => ExportDeclaration5(ClassDeclaration(false, false, true), List()) }
    candidates :+= { () => ExportDeclaration6(AssignmentExpression(true, false, false), List()) }
    choose(candidates)
  }
  def ExportFromClause(): ExportFromClause = {
    var candidates: Vector[() => ExportFromClause] = Vector()
    candidates :+= { () => ExportFromClause0(List()) }
    candidates :+= { () => ExportFromClause1(IdentifierName(), List()) }
    candidates :+= { () => ExportFromClause2(NamedExports(), List()) }
    choose(candidates)
  }
  def NamedExports(): NamedExports = {
    var candidates: Vector[() => NamedExports] = Vector()
    candidates :+= { () => NamedExports0(List()) }
    candidates :+= { () => NamedExports1(ExportsList(), List()) }
    candidates :+= { () => NamedExports2(ExportsList(), List()) }
    choose(candidates)
  }
  def ExportsList(): ExportsList = {
    var candidates: Vector[() => ExportsList] = Vector()
    candidates :+= { () => ExportsList0(ExportSpecifier(), List()) }
    candidates :+= { () => ExportsList1(ExportsList(), ExportSpecifier(), List()) }
    choose(candidates)
  }
  def ExportSpecifier(): ExportSpecifier = {
    var candidates: Vector[() => ExportSpecifier] = Vector()
    candidates :+= { () => ExportSpecifier0(IdentifierName(), List()) }
    candidates :+= { () => ExportSpecifier1(IdentifierName(), IdentifierName(), List()) }
    choose(candidates)
  }
}
