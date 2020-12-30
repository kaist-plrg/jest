package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.Lexical
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.util.Useful._

class LimitedDepthSampler {
  val counter = DepthCounter
  val random = new scala.util.Random
  def opt[T](valid: Boolean, elem: => T): Option[T] = if (valid && random.nextBoolean) Some(elem) else None
  def IdentifierName(depth: Int): Lexical = Lexical("IdentifierName", (random.nextInt(26) + 'a').toChar.toString)
  def NullLiteral(depth: Int): Lexical = Lexical("NullLiteral", "null")
  def BooleanLiteral(depth: Int): Lexical = Lexical("BooleanLiteral", random.nextBoolean.toString)
  def NumericLiteral(depth: Int): Lexical = Lexical("NumericLiteral", "0")
  def StringLiteral(depth: Int): Lexical = Lexical("StringLiteral", "''")
  def NoSubstitutionTemplate(depth: Int): Lexical = Lexical("StringLiteral", "``")
  def TemplateHead(depth: Int): Lexical = Lexical("StringLiteral", "`${")
  def TemplateMiddle(depth: Int): Lexical = Lexical("StringLiteral", "}${")
  def TemplateTail(depth: Int): Lexical = Lexical("StringLiteral", "}`")
  def IdentifierReference(depth: Int, pYield: Boolean, pAwait: Boolean): IdentifierReference = {
    var candidates: Vector[() => IdentifierReference] = Vector()
    val rhsDepth = counter.IdentifierReference(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => IdentifierReference0(Identifier(depth), List(pYield, pAwait)) } }
    if (!pYield) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => IdentifierReference1(List(pYield, pAwait)) } }
    if (!pAwait) rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => IdentifierReference2(List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingIdentifier(depth: Int, pYield: Boolean, pAwait: Boolean): BindingIdentifier = {
    var candidates: Vector[() => BindingIdentifier] = Vector()
    val rhsDepth = counter.BindingIdentifier(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingIdentifier0(Identifier(depth), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingIdentifier1(List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => BindingIdentifier2(List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def LabelIdentifier(depth: Int, pYield: Boolean, pAwait: Boolean): LabelIdentifier = {
    var candidates: Vector[() => LabelIdentifier] = Vector()
    val rhsDepth = counter.LabelIdentifier(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LabelIdentifier0(Identifier(depth), List(pYield, pAwait)) } }
    if (!pYield) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LabelIdentifier1(List(pYield, pAwait)) } }
    if (!pAwait) rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => LabelIdentifier2(List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Identifier(depth: Int): Identifier = {
    var candidates: Vector[() => Identifier] = Vector()
    val rhsDepth = counter.Identifier().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Identifier0(IdentifierName(depth), List()) } }
    choose(candidates)()
  }
  def PrimaryExpression(depth: Int, pYield: Boolean, pAwait: Boolean): PrimaryExpression = {
    var candidates: Vector[() => PrimaryExpression] = Vector()
    val rhsDepth = counter.PrimaryExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression1(IdentifierReference(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression2(Literal(depth), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression3(ArrayLiteral(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression4(ObjectLiteral(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression5(FunctionExpression(depth), List(pYield, pAwait)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression6(ClassExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(7).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression7(GeneratorExpression(depth), List(pYield, pAwait)) } }
    rhsDepth(8).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression8(AsyncFunctionExpression(depth), List(pYield, pAwait)) } }
    rhsDepth(9).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression9(AsyncGeneratorExpression(depth), List(pYield, pAwait)) } }
    rhsDepth(11).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression11(TemplateLiteral(depth, pYield, pAwait, false), List(pYield, pAwait)) } }
    rhsDepth(12).collect { case d if depth >= d => candidates :+= { () => PrimaryExpression12(CoverParenthesizedExpressionAndArrowParameterList(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def CoverParenthesizedExpressionAndArrowParameterList(depth: Int, pYield: Boolean, pAwait: Boolean): CoverParenthesizedExpressionAndArrowParameterList = {
    var candidates: Vector[() => CoverParenthesizedExpressionAndArrowParameterList] = Vector()
    val rhsDepth = counter.CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList0(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList1(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList2(List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList3(BindingIdentifier(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList4(BindingPattern(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList5(Expression(depth - 1, true, pYield, pAwait), BindingIdentifier(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => CoverParenthesizedExpressionAndArrowParameterList6(Expression(depth - 1, true, pYield, pAwait), BindingPattern(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ParenthesizedExpression(depth: Int, pYield: Boolean, pAwait: Boolean): ParenthesizedExpression = {
    var candidates: Vector[() => ParenthesizedExpression] = Vector()
    val rhsDepth = counter.ParenthesizedExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ParenthesizedExpression0(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Literal(depth: Int): Literal = {
    var candidates: Vector[() => Literal] = Vector()
    val rhsDepth = counter.Literal().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Literal0(NullLiteral(depth), List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Literal1(BooleanLiteral(depth), List()) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => Literal2(NumericLiteral(depth), List()) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => Literal3(StringLiteral(depth), List()) } }
    choose(candidates)()
  }
  def ArrayLiteral(depth: Int, pYield: Boolean, pAwait: Boolean): ArrayLiteral = {
    var candidates: Vector[() => ArrayLiteral] = Vector()
    val rhsDepth = counter.ArrayLiteral(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArrayLiteral0(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ArrayLiteral1(ElementList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ArrayLiteral2(ElementList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ElementList(depth: Int, pYield: Boolean, pAwait: Boolean): ElementList = {
    var candidates: Vector[() => ElementList] = Vector()
    val rhsDepth = counter.ElementList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ElementList0(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ElementList1(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), SpreadElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ElementList2(ElementList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => ElementList3(ElementList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), SpreadElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Elision(depth: Int): Elision = {
    var candidates: Vector[() => Elision] = Vector()
    val rhsDepth = counter.Elision().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Elision0(List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Elision1(Elision(depth - 1), List()) } }
    choose(candidates)()
  }
  def SpreadElement(depth: Int, pYield: Boolean, pAwait: Boolean): SpreadElement = {
    var candidates: Vector[() => SpreadElement] = Vector()
    val rhsDepth = counter.SpreadElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => SpreadElement0(AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ObjectLiteral(depth: Int, pYield: Boolean, pAwait: Boolean): ObjectLiteral = {
    var candidates: Vector[() => ObjectLiteral] = Vector()
    val rhsDepth = counter.ObjectLiteral(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ObjectLiteral0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ObjectLiteral1(PropertyDefinitionList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ObjectLiteral2(PropertyDefinitionList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def PropertyDefinitionList(depth: Int, pYield: Boolean, pAwait: Boolean): PropertyDefinitionList = {
    var candidates: Vector[() => PropertyDefinitionList] = Vector()
    val rhsDepth = counter.PropertyDefinitionList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => PropertyDefinitionList0(PropertyDefinition(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => PropertyDefinitionList1(PropertyDefinitionList(depth - 1, pYield, pAwait), PropertyDefinition(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def PropertyDefinition(depth: Int, pYield: Boolean, pAwait: Boolean): PropertyDefinition = {
    var candidates: Vector[() => PropertyDefinition] = Vector()
    val rhsDepth = counter.PropertyDefinition(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => PropertyDefinition0(IdentifierReference(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => PropertyDefinition1(CoverInitializedName(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => PropertyDefinition2(PropertyName(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => PropertyDefinition3(MethodDefinition(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => PropertyDefinition4(AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def PropertyName(depth: Int, pYield: Boolean, pAwait: Boolean): PropertyName = {
    var candidates: Vector[() => PropertyName] = Vector()
    val rhsDepth = counter.PropertyName(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => PropertyName0(LiteralPropertyName(depth), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => PropertyName1(ComputedPropertyName(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def LiteralPropertyName(depth: Int): LiteralPropertyName = {
    var candidates: Vector[() => LiteralPropertyName] = Vector()
    val rhsDepth = counter.LiteralPropertyName().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LiteralPropertyName0(IdentifierName(depth), List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LiteralPropertyName1(StringLiteral(depth), List()) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => LiteralPropertyName2(NumericLiteral(depth), List()) } }
    choose(candidates)()
  }
  def ComputedPropertyName(depth: Int, pYield: Boolean, pAwait: Boolean): ComputedPropertyName = {
    var candidates: Vector[() => ComputedPropertyName] = Vector()
    val rhsDepth = counter.ComputedPropertyName(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ComputedPropertyName0(AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def CoverInitializedName(depth: Int, pYield: Boolean, pAwait: Boolean): CoverInitializedName = {
    var candidates: Vector[() => CoverInitializedName] = Vector()
    val rhsDepth = counter.CoverInitializedName(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CoverInitializedName0(IdentifierReference(depth - 1, pYield, pAwait), Initializer(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Initializer(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): Initializer = {
    var candidates: Vector[() => Initializer] = Vector()
    val rhsDepth = counter.Initializer(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Initializer0(AssignmentExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def TemplateLiteral(depth: Int, pYield: Boolean, pAwait: Boolean, pTagged: Boolean): TemplateLiteral = {
    var candidates: Vector[() => TemplateLiteral] = Vector()
    val rhsDepth = counter.TemplateLiteral(pYield, pAwait, pTagged).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => TemplateLiteral0(NoSubstitutionTemplate(depth), List(pYield, pAwait, pTagged)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => TemplateLiteral1(SubstitutionTemplate(depth, pYield, pAwait, pTagged), List(pYield, pAwait, pTagged)) } }
    choose(candidates)()
  }
  def SubstitutionTemplate(depth: Int, pYield: Boolean, pAwait: Boolean, pTagged: Boolean): SubstitutionTemplate = {
    var candidates: Vector[() => SubstitutionTemplate] = Vector()
    val rhsDepth = counter.SubstitutionTemplate(pYield, pAwait, pTagged).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => SubstitutionTemplate0(TemplateHead(depth - 1), Expression(depth - 1, true, pYield, pAwait), TemplateSpans(depth - 1, pYield, pAwait, pTagged), List(pYield, pAwait, pTagged)) } }
    choose(candidates)()
  }
  def TemplateSpans(depth: Int, pYield: Boolean, pAwait: Boolean, pTagged: Boolean): TemplateSpans = {
    var candidates: Vector[() => TemplateSpans] = Vector()
    val rhsDepth = counter.TemplateSpans(pYield, pAwait, pTagged).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => TemplateSpans0(TemplateTail(depth), List(pYield, pAwait, pTagged)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => TemplateSpans1(TemplateMiddleList(depth - 1, pYield, pAwait, pTagged), TemplateTail(depth - 1), List(pYield, pAwait, pTagged)) } }
    choose(candidates)()
  }
  def TemplateMiddleList(depth: Int, pYield: Boolean, pAwait: Boolean, pTagged: Boolean): TemplateMiddleList = {
    var candidates: Vector[() => TemplateMiddleList] = Vector()
    val rhsDepth = counter.TemplateMiddleList(pYield, pAwait, pTagged).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => TemplateMiddleList0(TemplateMiddle(depth - 1), Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait, pTagged)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => TemplateMiddleList1(TemplateMiddleList(depth - 1, pYield, pAwait, pTagged), TemplateMiddle(depth - 1), Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait, pTagged)) } }
    choose(candidates)()
  }
  def MemberExpression(depth: Int, pYield: Boolean, pAwait: Boolean): MemberExpression = {
    var candidates: Vector[() => MemberExpression] = Vector()
    val rhsDepth = counter.MemberExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => MemberExpression0(PrimaryExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => MemberExpression1(MemberExpression(depth - 1, pYield, pAwait), Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => MemberExpression2(MemberExpression(depth - 1, pYield, pAwait), IdentifierName(depth - 1), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => MemberExpression3(MemberExpression(depth - 1, pYield, pAwait), TemplateLiteral(depth - 1, pYield, pAwait, true), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => MemberExpression4(SuperProperty(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => MemberExpression5(MetaProperty(depth), List(pYield, pAwait)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => MemberExpression6(MemberExpression(depth - 1, pYield, pAwait), Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def SuperProperty(depth: Int, pYield: Boolean, pAwait: Boolean): SuperProperty = {
    var candidates: Vector[() => SuperProperty] = Vector()
    val rhsDepth = counter.SuperProperty(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => SuperProperty0(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => SuperProperty1(IdentifierName(depth - 1), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def MetaProperty(depth: Int): MetaProperty = {
    var candidates: Vector[() => MetaProperty] = Vector()
    val rhsDepth = counter.MetaProperty().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => MetaProperty0(NewTarget(depth), List()) } }
    choose(candidates)()
  }
  def NewTarget(depth: Int): NewTarget = {
    var candidates: Vector[() => NewTarget] = Vector()
    val rhsDepth = counter.NewTarget().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => NewTarget0(List()) } }
    choose(candidates)()
  }
  def NewExpression(depth: Int, pYield: Boolean, pAwait: Boolean): NewExpression = {
    var candidates: Vector[() => NewExpression] = Vector()
    val rhsDepth = counter.NewExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => NewExpression0(MemberExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => NewExpression1(NewExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def CallExpression(depth: Int, pYield: Boolean, pAwait: Boolean): CallExpression = {
    var candidates: Vector[() => CallExpression] = Vector()
    val rhsDepth = counter.CallExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CallExpression0(CoverCallExpressionAndAsyncArrowHead(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => CallExpression1(SuperCall(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => CallExpression3(CallExpression(depth - 1, pYield, pAwait), Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => CallExpression4(CallExpression(depth - 1, pYield, pAwait), Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => CallExpression5(CallExpression(depth - 1, pYield, pAwait), IdentifierName(depth - 1), List(pYield, pAwait)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => CallExpression6(CallExpression(depth - 1, pYield, pAwait), TemplateLiteral(depth - 1, pYield, pAwait, true), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def CallMemberExpression(depth: Int, pYield: Boolean, pAwait: Boolean): CallMemberExpression = {
    var candidates: Vector[() => CallMemberExpression] = Vector()
    val rhsDepth = counter.CallMemberExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CallMemberExpression0(MemberExpression(depth - 1, pYield, pAwait), Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def SuperCall(depth: Int, pYield: Boolean, pAwait: Boolean): SuperCall = {
    var candidates: Vector[() => SuperCall] = Vector()
    val rhsDepth = counter.SuperCall(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => SuperCall0(Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Arguments(depth: Int, pYield: Boolean, pAwait: Boolean): Arguments = {
    var candidates: Vector[() => Arguments] = Vector()
    val rhsDepth = counter.Arguments(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Arguments0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Arguments1(ArgumentList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => Arguments2(ArgumentList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ArgumentList(depth: Int, pYield: Boolean, pAwait: Boolean): ArgumentList = {
    var candidates: Vector[() => ArgumentList] = Vector()
    val rhsDepth = counter.ArgumentList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArgumentList0(AssignmentExpression(depth, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ArgumentList1(AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ArgumentList2(ArgumentList(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => ArgumentList3(ArgumentList(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def OptionalExpression(depth: Int, pYield: Boolean, pAwait: Boolean): OptionalExpression = {
    var candidates: Vector[() => OptionalExpression] = Vector()
    val rhsDepth = counter.OptionalExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => OptionalExpression0(MemberExpression(depth - 1, pYield, pAwait), OptionalChain(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => OptionalExpression1(CallExpression(depth - 1, pYield, pAwait), OptionalChain(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => OptionalExpression2(OptionalExpression(depth - 1, pYield, pAwait), OptionalChain(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def OptionalChain(depth: Int, pYield: Boolean, pAwait: Boolean): OptionalChain = {
    var candidates: Vector[() => OptionalChain] = Vector()
    val rhsDepth = counter.OptionalChain(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => OptionalChain0(Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => OptionalChain1(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => OptionalChain2(IdentifierName(depth - 1), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => OptionalChain3(TemplateLiteral(depth - 1, pYield, pAwait, true), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => OptionalChain4(OptionalChain(depth - 1, pYield, pAwait), Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => OptionalChain5(OptionalChain(depth - 1, pYield, pAwait), Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => OptionalChain6(OptionalChain(depth - 1, pYield, pAwait), IdentifierName(depth - 1), List(pYield, pAwait)) } }
    rhsDepth(7).collect { case d if depth >= d => candidates :+= { () => OptionalChain7(OptionalChain(depth - 1, pYield, pAwait), TemplateLiteral(depth - 1, pYield, pAwait, true), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def LeftHandSideExpression(depth: Int, pYield: Boolean, pAwait: Boolean): LeftHandSideExpression = {
    var candidates: Vector[() => LeftHandSideExpression] = Vector()
    val rhsDepth = counter.LeftHandSideExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LeftHandSideExpression0(NewExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LeftHandSideExpression1(CallExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => LeftHandSideExpression2(OptionalExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def UpdateExpression(depth: Int, pYield: Boolean, pAwait: Boolean): UpdateExpression = {
    var candidates: Vector[() => UpdateExpression] = Vector()
    val rhsDepth = counter.UpdateExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => UpdateExpression0(LeftHandSideExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => UpdateExpression1(LeftHandSideExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => UpdateExpression2(LeftHandSideExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => UpdateExpression3(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => UpdateExpression4(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def UnaryExpression(depth: Int, pYield: Boolean, pAwait: Boolean): UnaryExpression = {
    var candidates: Vector[() => UnaryExpression] = Vector()
    val rhsDepth = counter.UnaryExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => UnaryExpression0(UpdateExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => UnaryExpression1(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => UnaryExpression2(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => UnaryExpression3(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => UnaryExpression4(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => UnaryExpression5(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => UnaryExpression6(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(7).collect { case d if depth >= d => candidates :+= { () => UnaryExpression7(UnaryExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    if (pAwait) rhsDepth(8).collect { case d if depth >= d => candidates :+= { () => UnaryExpression8(AwaitExpression(depth, pYield), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ExponentiationExpression(depth: Int, pYield: Boolean, pAwait: Boolean): ExponentiationExpression = {
    var candidates: Vector[() => ExponentiationExpression] = Vector()
    val rhsDepth = counter.ExponentiationExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ExponentiationExpression0(UnaryExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ExponentiationExpression1(UpdateExpression(depth - 1, pYield, pAwait), ExponentiationExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def MultiplicativeExpression(depth: Int, pYield: Boolean, pAwait: Boolean): MultiplicativeExpression = {
    var candidates: Vector[() => MultiplicativeExpression] = Vector()
    val rhsDepth = counter.MultiplicativeExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => MultiplicativeExpression0(ExponentiationExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => MultiplicativeExpression1(MultiplicativeExpression(depth - 1, pYield, pAwait), MultiplicativeOperator(depth - 1), ExponentiationExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def MultiplicativeOperator(depth: Int): MultiplicativeOperator = {
    var candidates: Vector[() => MultiplicativeOperator] = Vector()
    val rhsDepth = counter.MultiplicativeOperator().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => MultiplicativeOperator0(List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => MultiplicativeOperator1(List()) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => MultiplicativeOperator2(List()) } }
    choose(candidates)()
  }
  def AdditiveExpression(depth: Int, pYield: Boolean, pAwait: Boolean): AdditiveExpression = {
    var candidates: Vector[() => AdditiveExpression] = Vector()
    val rhsDepth = counter.AdditiveExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AdditiveExpression0(MultiplicativeExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AdditiveExpression1(AdditiveExpression(depth - 1, pYield, pAwait), MultiplicativeExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => AdditiveExpression2(AdditiveExpression(depth - 1, pYield, pAwait), MultiplicativeExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ShiftExpression(depth: Int, pYield: Boolean, pAwait: Boolean): ShiftExpression = {
    var candidates: Vector[() => ShiftExpression] = Vector()
    val rhsDepth = counter.ShiftExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ShiftExpression0(AdditiveExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ShiftExpression1(ShiftExpression(depth - 1, pYield, pAwait), AdditiveExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ShiftExpression2(ShiftExpression(depth - 1, pYield, pAwait), AdditiveExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => ShiftExpression3(ShiftExpression(depth - 1, pYield, pAwait), AdditiveExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def RelationalExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): RelationalExpression = {
    var candidates: Vector[() => RelationalExpression] = Vector()
    val rhsDepth = counter.RelationalExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => RelationalExpression0(ShiftExpression(depth, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => RelationalExpression1(RelationalExpression(depth - 1, pIn, pYield, pAwait), ShiftExpression(depth - 1, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => RelationalExpression2(RelationalExpression(depth - 1, pIn, pYield, pAwait), ShiftExpression(depth - 1, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => RelationalExpression3(RelationalExpression(depth - 1, pIn, pYield, pAwait), ShiftExpression(depth - 1, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => RelationalExpression4(RelationalExpression(depth - 1, pIn, pYield, pAwait), ShiftExpression(depth - 1, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => RelationalExpression5(RelationalExpression(depth - 1, pIn, pYield, pAwait), ShiftExpression(depth - 1, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    if (pIn) rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => RelationalExpression6(RelationalExpression(depth - 1, true, pYield, pAwait), ShiftExpression(depth - 1, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def EqualityExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): EqualityExpression = {
    var candidates: Vector[() => EqualityExpression] = Vector()
    val rhsDepth = counter.EqualityExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => EqualityExpression0(RelationalExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => EqualityExpression1(EqualityExpression(depth - 1, pIn, pYield, pAwait), RelationalExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => EqualityExpression2(EqualityExpression(depth - 1, pIn, pYield, pAwait), RelationalExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => EqualityExpression3(EqualityExpression(depth - 1, pIn, pYield, pAwait), RelationalExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => EqualityExpression4(EqualityExpression(depth - 1, pIn, pYield, pAwait), RelationalExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def BitwiseANDExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): BitwiseANDExpression = {
    var candidates: Vector[() => BitwiseANDExpression] = Vector()
    val rhsDepth = counter.BitwiseANDExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BitwiseANDExpression0(EqualityExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BitwiseANDExpression1(BitwiseANDExpression(depth - 1, pIn, pYield, pAwait), EqualityExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def BitwiseXORExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): BitwiseXORExpression = {
    var candidates: Vector[() => BitwiseXORExpression] = Vector()
    val rhsDepth = counter.BitwiseXORExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BitwiseXORExpression0(BitwiseANDExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BitwiseXORExpression1(BitwiseXORExpression(depth - 1, pIn, pYield, pAwait), BitwiseANDExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def BitwiseORExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): BitwiseORExpression = {
    var candidates: Vector[() => BitwiseORExpression] = Vector()
    val rhsDepth = counter.BitwiseORExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BitwiseORExpression0(BitwiseXORExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BitwiseORExpression1(BitwiseORExpression(depth - 1, pIn, pYield, pAwait), BitwiseXORExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def LogicalANDExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): LogicalANDExpression = {
    var candidates: Vector[() => LogicalANDExpression] = Vector()
    val rhsDepth = counter.LogicalANDExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LogicalANDExpression0(BitwiseORExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LogicalANDExpression1(LogicalANDExpression(depth - 1, pIn, pYield, pAwait), BitwiseORExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def LogicalORExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): LogicalORExpression = {
    var candidates: Vector[() => LogicalORExpression] = Vector()
    val rhsDepth = counter.LogicalORExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LogicalORExpression0(LogicalANDExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LogicalORExpression1(LogicalORExpression(depth - 1, pIn, pYield, pAwait), LogicalANDExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def CoalesceExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): CoalesceExpression = {
    var candidates: Vector[() => CoalesceExpression] = Vector()
    val rhsDepth = counter.CoalesceExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CoalesceExpression0(CoalesceExpressionHead(depth - 1, pIn, pYield, pAwait), BitwiseORExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def CoalesceExpressionHead(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): CoalesceExpressionHead = {
    var candidates: Vector[() => CoalesceExpressionHead] = Vector()
    val rhsDepth = counter.CoalesceExpressionHead(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CoalesceExpressionHead0(CoalesceExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => CoalesceExpressionHead1(BitwiseORExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def ShortCircuitExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): ShortCircuitExpression = {
    var candidates: Vector[() => ShortCircuitExpression] = Vector()
    val rhsDepth = counter.ShortCircuitExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ShortCircuitExpression0(LogicalORExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ShortCircuitExpression1(CoalesceExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def ConditionalExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): ConditionalExpression = {
    var candidates: Vector[() => ConditionalExpression] = Vector()
    val rhsDepth = counter.ConditionalExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ConditionalExpression0(ShortCircuitExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ConditionalExpression1(ShortCircuitExpression(depth - 1, pIn, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), AssignmentExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentExpression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AssignmentExpression = {
    var candidates: Vector[() => AssignmentExpression] = Vector()
    val rhsDepth = counter.AssignmentExpression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentExpression0(ConditionalExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    if (pYield) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AssignmentExpression1(YieldExpression(depth, pIn, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => AssignmentExpression2(ArrowFunction(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => AssignmentExpression3(AsyncArrowFunction(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => AssignmentExpression4(LeftHandSideExpression(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => AssignmentExpression5(LeftHandSideExpression(depth - 1, pYield, pAwait), AssignmentOperator(depth - 1), AssignmentExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentOperator(depth: Int): AssignmentOperator = {
    var candidates: Vector[() => AssignmentOperator] = Vector()
    val rhsDepth = counter.AssignmentOperator().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator0(List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator1(List()) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator2(List()) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator3(List()) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator4(List()) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator5(List()) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator6(List()) } }
    rhsDepth(7).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator7(List()) } }
    rhsDepth(8).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator8(List()) } }
    rhsDepth(9).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator9(List()) } }
    rhsDepth(10).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator10(List()) } }
    rhsDepth(11).collect { case d if depth >= d => candidates :+= { () => AssignmentOperator11(List()) } }
    choose(candidates)()
  }
  def AssignmentPattern(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentPattern = {
    var candidates: Vector[() => AssignmentPattern] = Vector()
    val rhsDepth = counter.AssignmentPattern(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentPattern0(ObjectAssignmentPattern(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AssignmentPattern1(ArrayAssignmentPattern(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ObjectAssignmentPattern(depth: Int, pYield: Boolean, pAwait: Boolean): ObjectAssignmentPattern = {
    var candidates: Vector[() => ObjectAssignmentPattern] = Vector()
    val rhsDepth = counter.ObjectAssignmentPattern(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ObjectAssignmentPattern0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ObjectAssignmentPattern1(AssignmentRestProperty(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ObjectAssignmentPattern2(AssignmentPropertyList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => ObjectAssignmentPattern3(AssignmentPropertyList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.AssignmentRestProperty(pYield, pAwait).depth, AssignmentRestProperty(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ArrayAssignmentPattern(depth: Int, pYield: Boolean, pAwait: Boolean): ArrayAssignmentPattern = {
    var candidates: Vector[() => ArrayAssignmentPattern] = Vector()
    val rhsDepth = counter.ArrayAssignmentPattern(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArrayAssignmentPattern0(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), opt(depth - 1 >= counter.AssignmentRestElement(pYield, pAwait).depth, AssignmentRestElement(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ArrayAssignmentPattern1(AssignmentElementList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ArrayAssignmentPattern2(AssignmentElementList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), opt(depth - 1 >= counter.AssignmentRestElement(pYield, pAwait).depth, AssignmentRestElement(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentRestProperty(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentRestProperty = {
    var candidates: Vector[() => AssignmentRestProperty] = Vector()
    val rhsDepth = counter.AssignmentRestProperty(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentRestProperty0(DestructuringAssignmentTarget(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentPropertyList(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentPropertyList = {
    var candidates: Vector[() => AssignmentPropertyList] = Vector()
    val rhsDepth = counter.AssignmentPropertyList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentPropertyList0(AssignmentProperty(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AssignmentPropertyList1(AssignmentPropertyList(depth - 1, pYield, pAwait), AssignmentProperty(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentElementList(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentElementList = {
    var candidates: Vector[() => AssignmentElementList] = Vector()
    val rhsDepth = counter.AssignmentElementList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentElementList0(AssignmentElisionElement(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AssignmentElementList1(AssignmentElementList(depth - 1, pYield, pAwait), AssignmentElisionElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentElisionElement(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentElisionElement = {
    var candidates: Vector[() => AssignmentElisionElement] = Vector()
    val rhsDepth = counter.AssignmentElisionElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentElisionElement0(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), AssignmentElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentProperty(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentProperty = {
    var candidates: Vector[() => AssignmentProperty] = Vector()
    val rhsDepth = counter.AssignmentProperty(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentProperty0(IdentifierReference(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Initializer(true, pYield, pAwait).depth, Initializer(depth - 1, true, pYield, pAwait)), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AssignmentProperty1(PropertyName(depth - 1, pYield, pAwait), AssignmentElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentElement(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentElement = {
    var candidates: Vector[() => AssignmentElement] = Vector()
    val rhsDepth = counter.AssignmentElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentElement0(DestructuringAssignmentTarget(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Initializer(true, pYield, pAwait).depth, Initializer(depth - 1, true, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AssignmentRestElement(depth: Int, pYield: Boolean, pAwait: Boolean): AssignmentRestElement = {
    var candidates: Vector[() => AssignmentRestElement] = Vector()
    val rhsDepth = counter.AssignmentRestElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AssignmentRestElement0(DestructuringAssignmentTarget(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def DestructuringAssignmentTarget(depth: Int, pYield: Boolean, pAwait: Boolean): DestructuringAssignmentTarget = {
    var candidates: Vector[() => DestructuringAssignmentTarget] = Vector()
    val rhsDepth = counter.DestructuringAssignmentTarget(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => DestructuringAssignmentTarget0(LeftHandSideExpression(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Expression(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): Expression = {
    var candidates: Vector[() => Expression] = Vector()
    val rhsDepth = counter.Expression(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Expression0(AssignmentExpression(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Expression1(Expression(depth - 1, pIn, pYield, pAwait), AssignmentExpression(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def Statement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Statement = {
    var candidates: Vector[() => Statement] = Vector()
    val rhsDepth = counter.Statement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Statement0(BlockStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Statement1(VariableStatement(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => Statement2(EmptyStatement(depth), List(pYield, pAwait, pReturn)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => Statement3(ExpressionStatement(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => Statement4(IfStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => Statement5(BreakableStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => Statement6(ContinueStatement(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    rhsDepth(7).collect { case d if depth >= d => candidates :+= { () => Statement7(BreakStatement(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    if (pReturn) rhsDepth(8).collect { case d if depth >= d => candidates :+= { () => Statement8(ReturnStatement(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    rhsDepth(9).collect { case d if depth >= d => candidates :+= { () => Statement9(WithStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(10).collect { case d if depth >= d => candidates :+= { () => Statement10(LabelledStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(11).collect { case d if depth >= d => candidates :+= { () => Statement11(ThrowStatement(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    rhsDepth(12).collect { case d if depth >= d => candidates :+= { () => Statement12(TryStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(13).collect { case d if depth >= d => candidates :+= { () => Statement13(DebuggerStatement(depth), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def Declaration(depth: Int, pYield: Boolean, pAwait: Boolean): Declaration = {
    var candidates: Vector[() => Declaration] = Vector()
    val rhsDepth = counter.Declaration(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Declaration0(HoistableDeclaration(depth, pYield, pAwait, false), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Declaration1(ClassDeclaration(depth, pYield, pAwait, false), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => Declaration2(LexicalDeclaration(depth, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def HoistableDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean, pDefault: Boolean): HoistableDeclaration = {
    var candidates: Vector[() => HoistableDeclaration] = Vector()
    val rhsDepth = counter.HoistableDeclaration(pYield, pAwait, pDefault).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => HoistableDeclaration0(FunctionDeclaration(depth, pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => HoistableDeclaration1(GeneratorDeclaration(depth, pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => HoistableDeclaration2(AsyncFunctionDeclaration(depth, pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => HoistableDeclaration3(AsyncGeneratorDeclaration(depth, pYield, pAwait, pDefault), List(pYield, pAwait, pDefault)) } }
    choose(candidates)()
  }
  def BreakableStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): BreakableStatement = {
    var candidates: Vector[() => BreakableStatement] = Vector()
    val rhsDepth = counter.BreakableStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BreakableStatement0(IterationStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BreakableStatement1(SwitchStatement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def BlockStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): BlockStatement = {
    var candidates: Vector[() => BlockStatement] = Vector()
    val rhsDepth = counter.BlockStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BlockStatement0(Block(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def Block(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Block = {
    var candidates: Vector[() => Block] = Vector()
    val rhsDepth = counter.Block(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Block0(opt(depth - 1 >= counter.StatementList(pYield, pAwait, pReturn).depth, StatementList(depth - 1, pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def StatementList(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementList = {
    var candidates: Vector[() => StatementList] = Vector()
    val rhsDepth = counter.StatementList(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => StatementList0(StatementListItem(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => StatementList1(StatementList(depth - 1, pYield, pAwait, pReturn), StatementListItem(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def StatementListItem(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): StatementListItem = {
    var candidates: Vector[() => StatementListItem] = Vector()
    val rhsDepth = counter.StatementListItem(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => StatementListItem0(Statement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => StatementListItem1(Declaration(depth, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def LexicalDeclaration(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): LexicalDeclaration = {
    var candidates: Vector[() => LexicalDeclaration] = Vector()
    val rhsDepth = counter.LexicalDeclaration(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LexicalDeclaration0(LetOrConst(depth - 1), BindingList(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def LetOrConst(depth: Int): LetOrConst = {
    var candidates: Vector[() => LetOrConst] = Vector()
    val rhsDepth = counter.LetOrConst().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LetOrConst0(List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LetOrConst1(List()) } }
    choose(candidates)()
  }
  def BindingList(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): BindingList = {
    var candidates: Vector[() => BindingList] = Vector()
    val rhsDepth = counter.BindingList(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingList0(LexicalBinding(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingList1(BindingList(depth - 1, pIn, pYield, pAwait), LexicalBinding(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def LexicalBinding(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): LexicalBinding = {
    var candidates: Vector[() => LexicalBinding] = Vector()
    val rhsDepth = counter.LexicalBinding(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LexicalBinding0(BindingIdentifier(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Initializer(pIn, pYield, pAwait).depth, Initializer(depth - 1, pIn, pYield, pAwait)), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LexicalBinding1(BindingPattern(depth - 1, pYield, pAwait), Initializer(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def VariableStatement(depth: Int, pYield: Boolean, pAwait: Boolean): VariableStatement = {
    var candidates: Vector[() => VariableStatement] = Vector()
    val rhsDepth = counter.VariableStatement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => VariableStatement0(VariableDeclarationList(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def VariableDeclarationList(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): VariableDeclarationList = {
    var candidates: Vector[() => VariableDeclarationList] = Vector()
    val rhsDepth = counter.VariableDeclarationList(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => VariableDeclarationList0(VariableDeclaration(depth, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => VariableDeclarationList1(VariableDeclarationList(depth - 1, pIn, pYield, pAwait), VariableDeclaration(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def VariableDeclaration(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): VariableDeclaration = {
    var candidates: Vector[() => VariableDeclaration] = Vector()
    val rhsDepth = counter.VariableDeclaration(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => VariableDeclaration0(BindingIdentifier(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Initializer(pIn, pYield, pAwait).depth, Initializer(depth - 1, pIn, pYield, pAwait)), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => VariableDeclaration1(BindingPattern(depth - 1, pYield, pAwait), Initializer(depth - 1, pIn, pYield, pAwait), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingPattern(depth: Int, pYield: Boolean, pAwait: Boolean): BindingPattern = {
    var candidates: Vector[() => BindingPattern] = Vector()
    val rhsDepth = counter.BindingPattern(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingPattern0(ObjectBindingPattern(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingPattern1(ArrayBindingPattern(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ObjectBindingPattern(depth: Int, pYield: Boolean, pAwait: Boolean): ObjectBindingPattern = {
    var candidates: Vector[() => ObjectBindingPattern] = Vector()
    val rhsDepth = counter.ObjectBindingPattern(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ObjectBindingPattern0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ObjectBindingPattern1(BindingRestProperty(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ObjectBindingPattern2(BindingPropertyList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => ObjectBindingPattern3(BindingPropertyList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.BindingRestProperty(pYield, pAwait).depth, BindingRestProperty(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ArrayBindingPattern(depth: Int, pYield: Boolean, pAwait: Boolean): ArrayBindingPattern = {
    var candidates: Vector[() => ArrayBindingPattern] = Vector()
    val rhsDepth = counter.ArrayBindingPattern(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArrayBindingPattern0(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), opt(depth - 1 >= counter.BindingRestElement(pYield, pAwait).depth, BindingRestElement(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ArrayBindingPattern1(BindingElementList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ArrayBindingPattern2(BindingElementList(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), opt(depth - 1 >= counter.BindingRestElement(pYield, pAwait).depth, BindingRestElement(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingRestProperty(depth: Int, pYield: Boolean, pAwait: Boolean): BindingRestProperty = {
    var candidates: Vector[() => BindingRestProperty] = Vector()
    val rhsDepth = counter.BindingRestProperty(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingRestProperty0(BindingIdentifier(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingPropertyList(depth: Int, pYield: Boolean, pAwait: Boolean): BindingPropertyList = {
    var candidates: Vector[() => BindingPropertyList] = Vector()
    val rhsDepth = counter.BindingPropertyList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingPropertyList0(BindingProperty(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingPropertyList1(BindingPropertyList(depth - 1, pYield, pAwait), BindingProperty(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingElementList(depth: Int, pYield: Boolean, pAwait: Boolean): BindingElementList = {
    var candidates: Vector[() => BindingElementList] = Vector()
    val rhsDepth = counter.BindingElementList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingElementList0(BindingElisionElement(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingElementList1(BindingElementList(depth - 1, pYield, pAwait), BindingElisionElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingElisionElement(depth: Int, pYield: Boolean, pAwait: Boolean): BindingElisionElement = {
    var candidates: Vector[() => BindingElisionElement] = Vector()
    val rhsDepth = counter.BindingElisionElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingElisionElement0(opt(depth - 1 >= counter.Elision().depth, Elision(depth - 1)), BindingElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingProperty(depth: Int, pYield: Boolean, pAwait: Boolean): BindingProperty = {
    var candidates: Vector[() => BindingProperty] = Vector()
    val rhsDepth = counter.BindingProperty(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingProperty0(SingleNameBinding(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingProperty1(PropertyName(depth - 1, pYield, pAwait), BindingElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingElement(depth: Int, pYield: Boolean, pAwait: Boolean): BindingElement = {
    var candidates: Vector[() => BindingElement] = Vector()
    val rhsDepth = counter.BindingElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingElement0(SingleNameBinding(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingElement1(BindingPattern(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Initializer(true, pYield, pAwait).depth, Initializer(depth - 1, true, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def SingleNameBinding(depth: Int, pYield: Boolean, pAwait: Boolean): SingleNameBinding = {
    var candidates: Vector[() => SingleNameBinding] = Vector()
    val rhsDepth = counter.SingleNameBinding(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => SingleNameBinding0(BindingIdentifier(depth - 1, pYield, pAwait), opt(depth - 1 >= counter.Initializer(true, pYield, pAwait).depth, Initializer(depth - 1, true, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BindingRestElement(depth: Int, pYield: Boolean, pAwait: Boolean): BindingRestElement = {
    var candidates: Vector[() => BindingRestElement] = Vector()
    val rhsDepth = counter.BindingRestElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BindingRestElement0(BindingIdentifier(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BindingRestElement1(BindingPattern(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def EmptyStatement(depth: Int): EmptyStatement = {
    var candidates: Vector[() => EmptyStatement] = Vector()
    val rhsDepth = counter.EmptyStatement().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => EmptyStatement0(List()) } }
    choose(candidates)()
  }
  def ExpressionStatement(depth: Int, pYield: Boolean, pAwait: Boolean): ExpressionStatement = {
    var candidates: Vector[() => ExpressionStatement] = Vector()
    val rhsDepth = counter.ExpressionStatement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ExpressionStatement0(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def IfStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): IfStatement = {
    var candidates: Vector[() => IfStatement] = Vector()
    val rhsDepth = counter.IfStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => IfStatement0(Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => IfStatement1(Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def IterationStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): IterationStatement = {
    var candidates: Vector[() => IterationStatement] = Vector()
    val rhsDepth = counter.IterationStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => IterationStatement0(Statement(depth - 1, pYield, pAwait, pReturn), Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => IterationStatement1(Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => IterationStatement2(opt(depth - 1 >= counter.Expression(false, pYield, pAwait).depth, Expression(depth - 1, false, pYield, pAwait)), opt(depth - 1 >= counter.Expression(true, pYield, pAwait).depth, Expression(depth - 1, true, pYield, pAwait)), opt(depth - 1 >= counter.Expression(true, pYield, pAwait).depth, Expression(depth - 1, true, pYield, pAwait)), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => IterationStatement3(VariableDeclarationList(depth - 1, false, pYield, pAwait), opt(depth - 1 >= counter.Expression(true, pYield, pAwait).depth, Expression(depth - 1, true, pYield, pAwait)), opt(depth - 1 >= counter.Expression(true, pYield, pAwait).depth, Expression(depth - 1, true, pYield, pAwait)), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => IterationStatement4(LexicalDeclaration(depth - 1, false, pYield, pAwait), opt(depth - 1 >= counter.Expression(true, pYield, pAwait).depth, Expression(depth - 1, true, pYield, pAwait)), opt(depth - 1 >= counter.Expression(true, pYield, pAwait).depth, Expression(depth - 1, true, pYield, pAwait)), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => IterationStatement5(LeftHandSideExpression(depth - 1, pYield, pAwait), Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(6).collect { case d if depth >= d => candidates :+= { () => IterationStatement6(ForBinding(depth - 1, pYield, pAwait), Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(7).collect { case d if depth >= d => candidates :+= { () => IterationStatement7(ForDeclaration(depth - 1, pYield, pAwait), Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(8).collect { case d if depth >= d => candidates :+= { () => IterationStatement8(LeftHandSideExpression(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(9).collect { case d if depth >= d => candidates :+= { () => IterationStatement9(ForBinding(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(10).collect { case d if depth >= d => candidates :+= { () => IterationStatement10(ForDeclaration(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    if (pAwait) rhsDepth(11).collect { case d if depth >= d => candidates :+= { () => IterationStatement11(LeftHandSideExpression(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    if (pAwait) rhsDepth(12).collect { case d if depth >= d => candidates :+= { () => IterationStatement12(ForBinding(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    if (pAwait) rhsDepth(13).collect { case d if depth >= d => candidates :+= { () => IterationStatement13(ForDeclaration(depth - 1, pYield, pAwait), AssignmentExpression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def ForDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean): ForDeclaration = {
    var candidates: Vector[() => ForDeclaration] = Vector()
    val rhsDepth = counter.ForDeclaration(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ForDeclaration0(LetOrConst(depth - 1), ForBinding(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ForBinding(depth: Int, pYield: Boolean, pAwait: Boolean): ForBinding = {
    var candidates: Vector[() => ForBinding] = Vector()
    val rhsDepth = counter.ForBinding(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ForBinding0(BindingIdentifier(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ForBinding1(BindingPattern(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ContinueStatement(depth: Int, pYield: Boolean, pAwait: Boolean): ContinueStatement = {
    var candidates: Vector[() => ContinueStatement] = Vector()
    val rhsDepth = counter.ContinueStatement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ContinueStatement0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ContinueStatement1(LabelIdentifier(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def BreakStatement(depth: Int, pYield: Boolean, pAwait: Boolean): BreakStatement = {
    var candidates: Vector[() => BreakStatement] = Vector()
    val rhsDepth = counter.BreakStatement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => BreakStatement0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => BreakStatement1(LabelIdentifier(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ReturnStatement(depth: Int, pYield: Boolean, pAwait: Boolean): ReturnStatement = {
    var candidates: Vector[() => ReturnStatement] = Vector()
    val rhsDepth = counter.ReturnStatement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ReturnStatement0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ReturnStatement1(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def WithStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): WithStatement = {
    var candidates: Vector[() => WithStatement] = Vector()
    val rhsDepth = counter.WithStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => WithStatement0(Expression(depth - 1, true, pYield, pAwait), Statement(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def SwitchStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): SwitchStatement = {
    var candidates: Vector[() => SwitchStatement] = Vector()
    val rhsDepth = counter.SwitchStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => SwitchStatement0(Expression(depth - 1, true, pYield, pAwait), CaseBlock(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def CaseBlock(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): CaseBlock = {
    var candidates: Vector[() => CaseBlock] = Vector()
    val rhsDepth = counter.CaseBlock(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CaseBlock0(opt(depth - 1 >= counter.CaseClauses(pYield, pAwait, pReturn).depth, CaseClauses(depth - 1, pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => CaseBlock1(opt(depth - 1 >= counter.CaseClauses(pYield, pAwait, pReturn).depth, CaseClauses(depth - 1, pYield, pAwait, pReturn)), DefaultClause(depth - 1, pYield, pAwait, pReturn), opt(depth - 1 >= counter.CaseClauses(pYield, pAwait, pReturn).depth, CaseClauses(depth - 1, pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def CaseClauses(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): CaseClauses = {
    var candidates: Vector[() => CaseClauses] = Vector()
    val rhsDepth = counter.CaseClauses(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CaseClauses0(CaseClause(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => CaseClauses1(CaseClauses(depth - 1, pYield, pAwait, pReturn), CaseClause(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def CaseClause(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): CaseClause = {
    var candidates: Vector[() => CaseClause] = Vector()
    val rhsDepth = counter.CaseClause(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CaseClause0(Expression(depth - 1, true, pYield, pAwait), opt(depth - 1 >= counter.StatementList(pYield, pAwait, pReturn).depth, StatementList(depth - 1, pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def DefaultClause(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): DefaultClause = {
    var candidates: Vector[() => DefaultClause] = Vector()
    val rhsDepth = counter.DefaultClause(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => DefaultClause0(opt(depth - 1 >= counter.StatementList(pYield, pAwait, pReturn).depth, StatementList(depth - 1, pYield, pAwait, pReturn)), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def LabelledStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): LabelledStatement = {
    var candidates: Vector[() => LabelledStatement] = Vector()
    val rhsDepth = counter.LabelledStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LabelledStatement0(LabelIdentifier(depth - 1, pYield, pAwait), LabelledItem(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def LabelledItem(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): LabelledItem = {
    var candidates: Vector[() => LabelledItem] = Vector()
    val rhsDepth = counter.LabelledItem(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => LabelledItem0(Statement(depth, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => LabelledItem1(FunctionDeclaration(depth, pYield, pAwait, false), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def ThrowStatement(depth: Int, pYield: Boolean, pAwait: Boolean): ThrowStatement = {
    var candidates: Vector[() => ThrowStatement] = Vector()
    val rhsDepth = counter.ThrowStatement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ThrowStatement0(Expression(depth - 1, true, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def TryStatement(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): TryStatement = {
    var candidates: Vector[() => TryStatement] = Vector()
    val rhsDepth = counter.TryStatement(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => TryStatement0(Block(depth - 1, pYield, pAwait, pReturn), Catch(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => TryStatement1(Block(depth - 1, pYield, pAwait, pReturn), Finally(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => TryStatement2(Block(depth - 1, pYield, pAwait, pReturn), Catch(depth - 1, pYield, pAwait, pReturn), Finally(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def Catch(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Catch = {
    var candidates: Vector[() => Catch] = Vector()
    val rhsDepth = counter.Catch(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Catch0(CatchParameter(depth - 1, pYield, pAwait), Block(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => Catch1(Block(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def Finally(depth: Int, pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Finally = {
    var candidates: Vector[() => Finally] = Vector()
    val rhsDepth = counter.Finally(pYield, pAwait, pReturn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Finally0(Block(depth - 1, pYield, pAwait, pReturn), List(pYield, pAwait, pReturn)) } }
    choose(candidates)()
  }
  def CatchParameter(depth: Int, pYield: Boolean, pAwait: Boolean): CatchParameter = {
    var candidates: Vector[() => CatchParameter] = Vector()
    val rhsDepth = counter.CatchParameter(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CatchParameter0(BindingIdentifier(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => CatchParameter1(BindingPattern(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def DebuggerStatement(depth: Int): DebuggerStatement = {
    var candidates: Vector[() => DebuggerStatement] = Vector()
    val rhsDepth = counter.DebuggerStatement().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => DebuggerStatement0(List()) } }
    choose(candidates)()
  }
  def FunctionDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean, pDefault: Boolean): FunctionDeclaration = {
    var candidates: Vector[() => FunctionDeclaration] = Vector()
    val rhsDepth = counter.FunctionDeclaration(pYield, pAwait, pDefault).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FunctionDeclaration0(BindingIdentifier(depth - 1, pYield, pAwait), FormalParameters(depth - 1, false, false), FunctionBody(depth - 1, false, false), List(pYield, pAwait, pDefault)) } }
    if (pDefault) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => FunctionDeclaration1(FormalParameters(depth - 1, false, false), FunctionBody(depth - 1, false, false), List(pYield, pAwait, pDefault)) } }
    choose(candidates)()
  }
  def FunctionExpression(depth: Int): FunctionExpression = {
    var candidates: Vector[() => FunctionExpression] = Vector()
    val rhsDepth = counter.FunctionExpression().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FunctionExpression0(opt(depth - 1 >= counter.BindingIdentifier(false, false).depth, BindingIdentifier(depth - 1, false, false)), FormalParameters(depth - 1, false, false), FunctionBody(depth - 1, false, false), List()) } }
    choose(candidates)()
  }
  def UniqueFormalParameters(depth: Int, pYield: Boolean, pAwait: Boolean): UniqueFormalParameters = {
    var candidates: Vector[() => UniqueFormalParameters] = Vector()
    val rhsDepth = counter.UniqueFormalParameters(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => UniqueFormalParameters0(FormalParameters(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def FormalParameters(depth: Int, pYield: Boolean, pAwait: Boolean): FormalParameters = {
    var candidates: Vector[() => FormalParameters] = Vector()
    val rhsDepth = counter.FormalParameters(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FormalParameters0(List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => FormalParameters1(FunctionRestParameter(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => FormalParameters2(FormalParameterList(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => FormalParameters3(FormalParameterList(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => FormalParameters4(FormalParameterList(depth - 1, pYield, pAwait), FunctionRestParameter(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def FormalParameterList(depth: Int, pYield: Boolean, pAwait: Boolean): FormalParameterList = {
    var candidates: Vector[() => FormalParameterList] = Vector()
    val rhsDepth = counter.FormalParameterList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FormalParameterList0(FormalParameter(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => FormalParameterList1(FormalParameterList(depth - 1, pYield, pAwait), FormalParameter(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def FunctionRestParameter(depth: Int, pYield: Boolean, pAwait: Boolean): FunctionRestParameter = {
    var candidates: Vector[() => FunctionRestParameter] = Vector()
    val rhsDepth = counter.FunctionRestParameter(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FunctionRestParameter0(BindingRestElement(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def FormalParameter(depth: Int, pYield: Boolean, pAwait: Boolean): FormalParameter = {
    var candidates: Vector[() => FormalParameter] = Vector()
    val rhsDepth = counter.FormalParameter(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FormalParameter0(BindingElement(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def FunctionBody(depth: Int, pYield: Boolean, pAwait: Boolean): FunctionBody = {
    var candidates: Vector[() => FunctionBody] = Vector()
    val rhsDepth = counter.FunctionBody(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FunctionBody0(FunctionStatementList(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def FunctionStatementList(depth: Int, pYield: Boolean, pAwait: Boolean): FunctionStatementList = {
    var candidates: Vector[() => FunctionStatementList] = Vector()
    val rhsDepth = counter.FunctionStatementList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => FunctionStatementList0(opt(depth >= counter.StatementList(pYield, pAwait, true).depth, StatementList(depth, pYield, pAwait, true)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ArrowFunction(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): ArrowFunction = {
    var candidates: Vector[() => ArrowFunction] = Vector()
    val rhsDepth = counter.ArrowFunction(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArrowFunction0(ArrowParameters(depth - 1, pYield, pAwait), ConciseBody(depth - 1, pIn), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def ArrowParameters(depth: Int, pYield: Boolean, pAwait: Boolean): ArrowParameters = {
    var candidates: Vector[() => ArrowParameters] = Vector()
    val rhsDepth = counter.ArrowParameters(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArrowParameters0(BindingIdentifier(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ArrowParameters1(CoverParenthesizedExpressionAndArrowParameterList(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ConciseBody(depth: Int, pIn: Boolean): ConciseBody = {
    var candidates: Vector[() => ConciseBody] = Vector()
    val rhsDepth = counter.ConciseBody(pIn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ConciseBody0(ExpressionBody(depth, pIn, false), List(pIn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ConciseBody1(FunctionBody(depth - 1, false, false), List(pIn)) } }
    choose(candidates)()
  }
  def ExpressionBody(depth: Int, pIn: Boolean, pAwait: Boolean): ExpressionBody = {
    var candidates: Vector[() => ExpressionBody] = Vector()
    val rhsDepth = counter.ExpressionBody(pIn, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ExpressionBody0(AssignmentExpression(depth, pIn, false, pAwait), List(pIn, pAwait)) } }
    choose(candidates)()
  }
  def ArrowFormalParameters(depth: Int, pYield: Boolean, pAwait: Boolean): ArrowFormalParameters = {
    var candidates: Vector[() => ArrowFormalParameters] = Vector()
    val rhsDepth = counter.ArrowFormalParameters(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ArrowFormalParameters0(UniqueFormalParameters(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AsyncArrowFunction(depth: Int, pIn: Boolean, pYield: Boolean, pAwait: Boolean): AsyncArrowFunction = {
    var candidates: Vector[() => AsyncArrowFunction] = Vector()
    val rhsDepth = counter.AsyncArrowFunction(pIn, pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncArrowFunction0(AsyncArrowBindingIdentifier(depth - 1, pYield), AsyncConciseBody(depth - 1, pIn), List(pIn, pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AsyncArrowFunction1(CoverCallExpressionAndAsyncArrowHead(depth - 1, pYield, pAwait), AsyncConciseBody(depth - 1, pIn), List(pIn, pYield, pAwait)) } }
    choose(candidates)()
  }
  def AsyncConciseBody(depth: Int, pIn: Boolean): AsyncConciseBody = {
    var candidates: Vector[() => AsyncConciseBody] = Vector()
    val rhsDepth = counter.AsyncConciseBody(pIn).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncConciseBody0(ExpressionBody(depth, pIn, true), List(pIn)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AsyncConciseBody1(AsyncFunctionBody(depth - 1), List(pIn)) } }
    choose(candidates)()
  }
  def AsyncArrowBindingIdentifier(depth: Int, pYield: Boolean): AsyncArrowBindingIdentifier = {
    var candidates: Vector[() => AsyncArrowBindingIdentifier] = Vector()
    val rhsDepth = counter.AsyncArrowBindingIdentifier(pYield).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncArrowBindingIdentifier0(BindingIdentifier(depth, pYield, true), List(pYield)) } }
    choose(candidates)()
  }
  def CoverCallExpressionAndAsyncArrowHead(depth: Int, pYield: Boolean, pAwait: Boolean): CoverCallExpressionAndAsyncArrowHead = {
    var candidates: Vector[() => CoverCallExpressionAndAsyncArrowHead] = Vector()
    val rhsDepth = counter.CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => CoverCallExpressionAndAsyncArrowHead0(MemberExpression(depth - 1, pYield, pAwait), Arguments(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AsyncArrowHead(depth: Int): AsyncArrowHead = {
    var candidates: Vector[() => AsyncArrowHead] = Vector()
    val rhsDepth = counter.AsyncArrowHead().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncArrowHead0(ArrowFormalParameters(depth - 1, false, true), List()) } }
    choose(candidates)()
  }
  def MethodDefinition(depth: Int, pYield: Boolean, pAwait: Boolean): MethodDefinition = {
    var candidates: Vector[() => MethodDefinition] = Vector()
    val rhsDepth = counter.MethodDefinition(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => MethodDefinition0(PropertyName(depth - 1, pYield, pAwait), UniqueFormalParameters(depth - 1, false, false), FunctionBody(depth - 1, false, false), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => MethodDefinition1(GeneratorMethod(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => MethodDefinition2(AsyncMethod(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(3).collect { case d if depth >= d => candidates :+= { () => MethodDefinition3(AsyncGeneratorMethod(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(4).collect { case d if depth >= d => candidates :+= { () => MethodDefinition4(PropertyName(depth - 1, pYield, pAwait), FunctionBody(depth - 1, false, false), List(pYield, pAwait)) } }
    rhsDepth(5).collect { case d if depth >= d => candidates :+= { () => MethodDefinition5(PropertyName(depth - 1, pYield, pAwait), PropertySetParameterList(depth - 1), FunctionBody(depth - 1, false, false), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def PropertySetParameterList(depth: Int): PropertySetParameterList = {
    var candidates: Vector[() => PropertySetParameterList] = Vector()
    val rhsDepth = counter.PropertySetParameterList().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => PropertySetParameterList0(FormalParameter(depth, false, false), List()) } }
    choose(candidates)()
  }
  def GeneratorMethod(depth: Int, pYield: Boolean, pAwait: Boolean): GeneratorMethod = {
    var candidates: Vector[() => GeneratorMethod] = Vector()
    val rhsDepth = counter.GeneratorMethod(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => GeneratorMethod0(PropertyName(depth - 1, pYield, pAwait), UniqueFormalParameters(depth - 1, true, false), GeneratorBody(depth - 1), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def GeneratorDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean, pDefault: Boolean): GeneratorDeclaration = {
    var candidates: Vector[() => GeneratorDeclaration] = Vector()
    val rhsDepth = counter.GeneratorDeclaration(pYield, pAwait, pDefault).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => GeneratorDeclaration0(BindingIdentifier(depth - 1, pYield, pAwait), FormalParameters(depth - 1, true, false), GeneratorBody(depth - 1), List(pYield, pAwait, pDefault)) } }
    if (pDefault) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => GeneratorDeclaration1(FormalParameters(depth - 1, true, false), GeneratorBody(depth - 1), List(pYield, pAwait, pDefault)) } }
    choose(candidates)()
  }
  def GeneratorExpression(depth: Int): GeneratorExpression = {
    var candidates: Vector[() => GeneratorExpression] = Vector()
    val rhsDepth = counter.GeneratorExpression().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => GeneratorExpression0(opt(depth - 1 >= counter.BindingIdentifier(true, false).depth, BindingIdentifier(depth - 1, true, false)), FormalParameters(depth - 1, true, false), GeneratorBody(depth - 1), List()) } }
    choose(candidates)()
  }
  def GeneratorBody(depth: Int): GeneratorBody = {
    var candidates: Vector[() => GeneratorBody] = Vector()
    val rhsDepth = counter.GeneratorBody().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => GeneratorBody0(FunctionBody(depth, true, false), List()) } }
    choose(candidates)()
  }
  def YieldExpression(depth: Int, pIn: Boolean, pAwait: Boolean): YieldExpression = {
    var candidates: Vector[() => YieldExpression] = Vector()
    val rhsDepth = counter.YieldExpression(pIn, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => YieldExpression0(List(pIn, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => YieldExpression1(AssignmentExpression(depth - 1, pIn, true, pAwait), List(pIn, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => YieldExpression2(AssignmentExpression(depth - 1, pIn, true, pAwait), List(pIn, pAwait)) } }
    choose(candidates)()
  }
  def AsyncGeneratorMethod(depth: Int, pYield: Boolean, pAwait: Boolean): AsyncGeneratorMethod = {
    var candidates: Vector[() => AsyncGeneratorMethod] = Vector()
    val rhsDepth = counter.AsyncGeneratorMethod(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncGeneratorMethod0(PropertyName(depth - 1, pYield, pAwait), UniqueFormalParameters(depth - 1, true, true), AsyncGeneratorBody(depth - 1), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AsyncGeneratorDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean, pDefault: Boolean): AsyncGeneratorDeclaration = {
    var candidates: Vector[() => AsyncGeneratorDeclaration] = Vector()
    val rhsDepth = counter.AsyncGeneratorDeclaration(pYield, pAwait, pDefault).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncGeneratorDeclaration0(BindingIdentifier(depth - 1, pYield, pAwait), FormalParameters(depth - 1, true, true), AsyncGeneratorBody(depth - 1), List(pYield, pAwait, pDefault)) } }
    if (pDefault) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AsyncGeneratorDeclaration1(FormalParameters(depth - 1, true, true), AsyncGeneratorBody(depth - 1), List(pYield, pAwait, pDefault)) } }
    choose(candidates)()
  }
  def AsyncGeneratorExpression(depth: Int): AsyncGeneratorExpression = {
    var candidates: Vector[() => AsyncGeneratorExpression] = Vector()
    val rhsDepth = counter.AsyncGeneratorExpression().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncGeneratorExpression0(opt(depth - 1 >= counter.BindingIdentifier(true, true).depth, BindingIdentifier(depth - 1, true, true)), FormalParameters(depth - 1, true, true), AsyncGeneratorBody(depth - 1), List()) } }
    choose(candidates)()
  }
  def AsyncGeneratorBody(depth: Int): AsyncGeneratorBody = {
    var candidates: Vector[() => AsyncGeneratorBody] = Vector()
    val rhsDepth = counter.AsyncGeneratorBody().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncGeneratorBody0(FunctionBody(depth, true, true), List()) } }
    choose(candidates)()
  }
  def AsyncFunctionDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean, pDefault: Boolean): AsyncFunctionDeclaration = {
    var candidates: Vector[() => AsyncFunctionDeclaration] = Vector()
    val rhsDepth = counter.AsyncFunctionDeclaration(pYield, pAwait, pDefault).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncFunctionDeclaration0(BindingIdentifier(depth - 1, pYield, pAwait), FormalParameters(depth - 1, false, true), AsyncFunctionBody(depth - 1), List(pYield, pAwait, pDefault)) } }
    if (pDefault) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AsyncFunctionDeclaration1(FormalParameters(depth - 1, false, true), AsyncFunctionBody(depth - 1), List(pYield, pAwait, pDefault)) } }
    choose(candidates)()
  }
  def AsyncFunctionExpression(depth: Int): AsyncFunctionExpression = {
    var candidates: Vector[() => AsyncFunctionExpression] = Vector()
    val rhsDepth = counter.AsyncFunctionExpression().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncFunctionExpression0(FormalParameters(depth - 1, false, true), AsyncFunctionBody(depth - 1), List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => AsyncFunctionExpression1(BindingIdentifier(depth - 1, false, true), FormalParameters(depth - 1, false, true), AsyncFunctionBody(depth - 1), List()) } }
    choose(candidates)()
  }
  def AsyncMethod(depth: Int, pYield: Boolean, pAwait: Boolean): AsyncMethod = {
    var candidates: Vector[() => AsyncMethod] = Vector()
    val rhsDepth = counter.AsyncMethod(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncMethod0(PropertyName(depth - 1, pYield, pAwait), UniqueFormalParameters(depth - 1, false, true), AsyncFunctionBody(depth - 1), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def AsyncFunctionBody(depth: Int): AsyncFunctionBody = {
    var candidates: Vector[() => AsyncFunctionBody] = Vector()
    val rhsDepth = counter.AsyncFunctionBody().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AsyncFunctionBody0(FunctionBody(depth, false, true), List()) } }
    choose(candidates)()
  }
  def AwaitExpression(depth: Int, pYield: Boolean): AwaitExpression = {
    var candidates: Vector[() => AwaitExpression] = Vector()
    val rhsDepth = counter.AwaitExpression(pYield).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => AwaitExpression0(UnaryExpression(depth - 1, pYield, true), List(pYield)) } }
    choose(candidates)()
  }
  def ClassDeclaration(depth: Int, pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ClassDeclaration = {
    var candidates: Vector[() => ClassDeclaration] = Vector()
    val rhsDepth = counter.ClassDeclaration(pYield, pAwait, pDefault).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassDeclaration0(BindingIdentifier(depth - 1, pYield, pAwait), ClassTail(depth - 1, pYield, pAwait), List(pYield, pAwait, pDefault)) } }
    if (pDefault) rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ClassDeclaration1(ClassTail(depth - 1, pYield, pAwait), List(pYield, pAwait, pDefault)) } }
    choose(candidates)()
  }
  def ClassExpression(depth: Int, pYield: Boolean, pAwait: Boolean): ClassExpression = {
    var candidates: Vector[() => ClassExpression] = Vector()
    val rhsDepth = counter.ClassExpression(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassExpression0(opt(depth - 1 >= counter.BindingIdentifier(pYield, pAwait).depth, BindingIdentifier(depth - 1, pYield, pAwait)), ClassTail(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ClassTail(depth: Int, pYield: Boolean, pAwait: Boolean): ClassTail = {
    var candidates: Vector[() => ClassTail] = Vector()
    val rhsDepth = counter.ClassTail(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassTail0(opt(depth - 1 >= counter.ClassHeritage(pYield, pAwait).depth, ClassHeritage(depth - 1, pYield, pAwait)), opt(depth - 1 >= counter.ClassBody(pYield, pAwait).depth, ClassBody(depth - 1, pYield, pAwait)), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ClassHeritage(depth: Int, pYield: Boolean, pAwait: Boolean): ClassHeritage = {
    var candidates: Vector[() => ClassHeritage] = Vector()
    val rhsDepth = counter.ClassHeritage(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassHeritage0(LeftHandSideExpression(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ClassBody(depth: Int, pYield: Boolean, pAwait: Boolean): ClassBody = {
    var candidates: Vector[() => ClassBody] = Vector()
    val rhsDepth = counter.ClassBody(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassBody0(ClassElementList(depth, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ClassElementList(depth: Int, pYield: Boolean, pAwait: Boolean): ClassElementList = {
    var candidates: Vector[() => ClassElementList] = Vector()
    val rhsDepth = counter.ClassElementList(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassElementList0(ClassElement(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ClassElementList1(ClassElementList(depth - 1, pYield, pAwait), ClassElement(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def ClassElement(depth: Int, pYield: Boolean, pAwait: Boolean): ClassElement = {
    var candidates: Vector[() => ClassElement] = Vector()
    val rhsDepth = counter.ClassElement(pYield, pAwait).rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ClassElement0(MethodDefinition(depth, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ClassElement1(MethodDefinition(depth - 1, pYield, pAwait), List(pYield, pAwait)) } }
    rhsDepth(2).collect { case d if depth >= d => candidates :+= { () => ClassElement2(List(pYield, pAwait)) } }
    choose(candidates)()
  }
  def Script(depth: Int): Script = {
    var candidates: Vector[() => Script] = Vector()
    val rhsDepth = counter.Script().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => Script0(opt(depth >= counter.ScriptBody().depth, ScriptBody(depth)), List()) } }
    choose(candidates)()
  }
  def ScriptBody(depth: Int): ScriptBody = {
    var candidates: Vector[() => ScriptBody] = Vector()
    val rhsDepth = counter.ScriptBody().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ScriptBody0(StatementList(depth, false, false, false), List()) } }
    choose(candidates)()
  }
  def ExportSpecifier(depth: Int): ExportSpecifier = {
    var candidates: Vector[() => ExportSpecifier] = Vector()
    val rhsDepth = counter.ExportSpecifier().rhsDepth
    rhsDepth(0).collect { case d if depth >= d => candidates :+= { () => ExportSpecifier0(IdentifierName(depth), List()) } }
    rhsDepth(1).collect { case d if depth >= d => candidates :+= { () => ExportSpecifier1(IdentifierName(depth - 1), IdentifierName(depth - 1), List()) } }
    choose(candidates)()
  }
}
