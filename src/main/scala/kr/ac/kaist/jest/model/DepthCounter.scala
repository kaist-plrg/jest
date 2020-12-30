package kr.ac.kaist.jest.model

object DepthCounter {
  case class Depth(depth: Int, rhsDepth: List[Option[Int]])
  def IdentifierReference(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), None, None))
    case (false, true) => Depth(1, List(Some(1), Some(1), None))
    case (false, false) => Depth(1, List(Some(1), Some(1), Some(1)))
    case (true, false) => Depth(1, List(Some(1), None, Some(1)))
  }
  def BindingIdentifier(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(1), Some(1)))
    case (true, false) => Depth(1, List(Some(1), Some(1), Some(1)))
    case (true, true) => Depth(1, List(Some(1), Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1), Some(1)))
  }
  def LabelIdentifier(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), None, None))
    case (false, true) => Depth(1, List(Some(1), Some(1), None))
    case (false, false) => Depth(1, List(Some(1), Some(1), Some(1)))
    case (true, false) => Depth(1, List(Some(1), None, Some(1)))
  }
  def Identifier(): Depth = () match {
    case () => Depth(1, List(Some(1)))
  }
  def PrimaryExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(1), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None, Some(1), Some(1)))
    case (false, true) => Depth(1, List(Some(1), Some(1), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None, Some(1), Some(1)))
    case (true, true) => Depth(1, List(Some(1), Some(1), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None, Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None, Some(1), Some(1)))
  }
  def CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(2), Some(2), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(2), Some(2), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, true) => Depth(1, List(Some(2), Some(2), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(2), Some(2), Some(1), Some(2), Some(2), Some(2), Some(2)))
  }
  def ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
  }
  def Literal(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(1), Some(1), Some(1)))
  }
  def ArrayLiteral(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(3), Some(3)))
    case (true, true) => Depth(1, List(Some(1), Some(3), Some(3)))
    case (true, false) => Depth(1, List(Some(1), Some(3), Some(3)))
    case (false, false) => Depth(1, List(Some(1), Some(3), Some(3)))
  }
  def ElementList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2), Some(3), Some(3), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(3), Some(3), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(3), Some(3), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(3), Some(3), Some(3)))
  }
  def Elision(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(2)))
  }
  def SpreadElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def ObjectLiteral(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2)))
  }
  def PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def PropertyDefinition(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(1), Some(3), Some(2), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(3), Some(2), Some(2), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(3), Some(2), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(3), Some(2), Some(2), Some(2)))
  }
  def PropertyName(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2)))
  }
  def LiteralPropertyName(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(1), Some(1)))
  }
  def ComputedPropertyName(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
  }
  def CoverInitializedName(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(3, List(Some(3)))
    case (true, true) => Depth(3, List(Some(3)))
    case (false, true) => Depth(3, List(Some(3)))
    case (false, false) => Depth(3, List(Some(3)))
  }
  def Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, true, false) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (false, false, true) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
  }
  def TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Depth = (pYield, pAwait, pTagged) match {
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Depth = (pYield, pAwait, pTagged) match {
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, false, true) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
  }
  def TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Depth = (pYield, pAwait, pTagged) match {
    case (true, false, false) => Depth(1, List(Some(1), Some(3)))
    case (false, false, false) => Depth(1, List(Some(1), Some(3)))
    case (false, true, false) => Depth(1, List(Some(1), Some(3)))
    case (true, false, true) => Depth(1, List(Some(1), Some(3)))
    case (true, true, false) => Depth(1, List(Some(1), Some(3)))
    case (false, false, true) => Depth(1, List(Some(1), Some(3)))
    case (true, true, true) => Depth(1, List(Some(1), Some(3)))
    case (false, true, true) => Depth(1, List(Some(1), Some(3)))
  }
  def TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Depth = (pYield, pAwait, pTagged) match {
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
  }
  def MemberExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(1), Some(2)))
  }
  def SuperProperty(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2), Some(2)))
    case (false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false) => Depth(2, List(Some(2), Some(2)))
    case (true, true) => Depth(2, List(Some(2), Some(2)))
  }
  def MetaProperty(): Depth = () match {
    case () => Depth(1, List(Some(1), None))
  }
  def NewTarget(): Depth = () match {
    case () => Depth(1, List(Some(1)))
  }
  def NewExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def CallExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2), Some(2), None, Some(3), Some(3), Some(3), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(2), None, Some(3), Some(3), Some(3), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(2), None, Some(3), Some(3), Some(3), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(2), None, Some(3), Some(3), Some(3), Some(3)))
  }
  def CallMemberExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def SuperCall(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
  }
  def Arguments(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2)))
  }
  def ArgumentList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
  }
  def OptionalExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(3, List(Some(3), Some(3), Some(4)))
    case (true, false) => Depth(3, List(Some(3), Some(3), Some(4)))
    case (false, true) => Depth(3, List(Some(3), Some(3), Some(4)))
    case (true, true) => Depth(3, List(Some(3), Some(3), Some(4)))
  }
  def OptionalChain(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(3), Some(3), Some(3), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(3), Some(3), Some(3), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(3), Some(3), Some(3), Some(3)))
    case (true, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(3), Some(3), Some(3), Some(3)))
  }
  def LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(3)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(3)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(3)))
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(3)))
  }
  def UpdateExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
  }
  def UnaryExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), None))
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2), None))
  }
  def ExponentiationExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2)))
  }
  def MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def MultiplicativeOperator(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(1), Some(1)))
  }
  def AdditiveExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2)))
  }
  def ShiftExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2)))
  }
  def RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None))
    case (true, true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None))
    case (false, true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None))
    case (true, false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2), Some(2), None))
  }
  def EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(2), Some(2)))
  }
  def BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
  }
  def LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
  }
  def CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, true) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (false, false, true) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
  }
  def CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, false, false) => Depth(1, List(Some(2), Some(1)))
    case (false, false, false) => Depth(1, List(Some(2), Some(1)))
    case (true, false, true) => Depth(1, List(Some(2), Some(1)))
    case (true, true, false) => Depth(1, List(Some(2), Some(1)))
    case (true, true, true) => Depth(1, List(Some(2), Some(1)))
    case (false, true, false) => Depth(1, List(Some(2), Some(1)))
    case (false, false, true) => Depth(1, List(Some(2), Some(1)))
    case (false, true, true) => Depth(1, List(Some(2), Some(1)))
  }
  def ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
  }
  def ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
  }
  def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, false, false) => Depth(1, List(Some(1), None, Some(2), Some(2), Some(2), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), None, Some(2), Some(2), Some(2), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(1), Some(2), Some(2), Some(2), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), None, Some(2), Some(2), Some(2), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), None, Some(2), Some(2), Some(2), Some(2)))
  }
  def AssignmentOperator(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(1), Some(1), Some(1), Some(1), Some(1), Some(1), Some(1), Some(1), Some(1), Some(1), Some(1)))
  }
  def AssignmentPattern(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1)))
    case (false, true) => Depth(1, List(Some(1), Some(1)))
    case (true, true) => Depth(1, List(Some(1), Some(1)))
  }
  def ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
    case (true, false) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
    case (true, true) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
    case (false, true) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
  }
  def ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(4), Some(4)))
    case (true, true) => Depth(1, List(Some(1), Some(4), Some(4)))
    case (false, false) => Depth(1, List(Some(1), Some(4), Some(4)))
    case (true, false) => Depth(1, List(Some(1), Some(4), Some(4)))
  }
  def AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
  }
  def AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def AssignmentElementList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(3, List(Some(3), Some(4)))
    case (false, false) => Depth(3, List(Some(3), Some(4)))
    case (false, true) => Depth(3, List(Some(3), Some(4)))
    case (true, false) => Depth(3, List(Some(3), Some(4)))
  }
  def AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(3, List(Some(3)))
    case (true, true) => Depth(3, List(Some(3)))
    case (false, false) => Depth(3, List(Some(3)))
    case (true, false) => Depth(3, List(Some(3)))
  }
  def AssignmentProperty(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def AssignmentElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
  }
  def AssignmentRestElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
  }
  def DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1)))
    case (true, false) => Depth(1, List(Some(1)))
    case (false, false) => Depth(1, List(Some(1)))
    case (true, true) => Depth(1, List(Some(1)))
  }
  def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
  }
  def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, true, false) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), None, Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (false, false, true) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (true, false, false) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), None, Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (true, true, true) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (false, true, true) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (true, false, true) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), Some(1), Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (false, false, false) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), None, Some(2), Some(2), Some(2), Some(3), Some(1)))
    case (true, true, false) => Depth(1, List(Some(1), Some(3), Some(1), Some(2), Some(2), Some(2), Some(1), Some(1), None, Some(2), Some(2), Some(2), Some(3), Some(1)))
  }
  def Declaration(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(2, List(Some(2), Some(2), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(2), Some(3)))
    case (true, false) => Depth(2, List(Some(2), Some(2), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(2), Some(3)))
  }
  def HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Depth = (pYield, pAwait, pDefault) match {
    case (false, false, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (false, true, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (true, true, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (true, false, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (false, true, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
    case (true, true, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2)))
  }
  def BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, true, false) => Depth(2, List(Some(2), Some(2)))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), Some(2)))
    case (false, true, false) => Depth(2, List(Some(2), Some(2)))
    case (true, false, false) => Depth(2, List(Some(2), Some(2)))
  }
  def BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, false, false) => Depth(1, List(Some(1)))
    case (true, true, false) => Depth(1, List(Some(1)))
    case (false, true, true) => Depth(1, List(Some(1)))
    case (true, true, true) => Depth(1, List(Some(1)))
    case (false, false, false) => Depth(1, List(Some(1)))
    case (false, false, true) => Depth(1, List(Some(1)))
    case (true, false, true) => Depth(1, List(Some(1)))
    case (false, true, false) => Depth(1, List(Some(1)))
  }
  def Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, false, false) => Depth(1, List(Some(1)))
    case (true, true, true) => Depth(1, List(Some(1)))
    case (false, true, false) => Depth(1, List(Some(1)))
    case (false, false, true) => Depth(1, List(Some(1)))
    case (true, true, false) => Depth(1, List(Some(1)))
    case (true, false, true) => Depth(1, List(Some(1)))
    case (false, true, true) => Depth(1, List(Some(1)))
    case (false, false, false) => Depth(1, List(Some(1)))
  }
  def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
  }
  def LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, true) => Depth(3, List(Some(3)))
    case (false, false, false) => Depth(3, List(Some(3)))
    case (true, false, false) => Depth(3, List(Some(3)))
    case (true, true, false) => Depth(3, List(Some(3)))
    case (false, true, false) => Depth(3, List(Some(3)))
    case (false, true, true) => Depth(3, List(Some(3)))
    case (false, false, true) => Depth(3, List(Some(3)))
    case (true, false, true) => Depth(3, List(Some(3)))
  }
  def LetOrConst(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(1)))
  }
  def BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
  }
  def LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def VariableStatement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(3, List(Some(3)))
    case (false, false) => Depth(3, List(Some(3)))
    case (false, true) => Depth(3, List(Some(3)))
    case (true, true) => Depth(3, List(Some(3)))
  }
  def VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
  }
  def VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def BindingPattern(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(1)))
    case (false, true) => Depth(1, List(Some(1), Some(1)))
    case (true, true) => Depth(1, List(Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1)))
  }
  def ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
    case (true, false) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
    case (false, false) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
    case (false, true) => Depth(1, List(Some(1), Some(3), Some(3), Some(3)))
  }
  def ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(4), Some(4)))
    case (true, true) => Depth(1, List(Some(1), Some(4), Some(4)))
    case (false, false) => Depth(1, List(Some(1), Some(4), Some(4)))
    case (false, true) => Depth(1, List(Some(1), Some(4), Some(4)))
  }
  def BindingRestProperty(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
  }
  def BindingPropertyList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def BindingElementList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(3, List(Some(3), Some(4)))
    case (true, true) => Depth(3, List(Some(3), Some(4)))
    case (false, true) => Depth(3, List(Some(3), Some(4)))
    case (true, false) => Depth(3, List(Some(3), Some(4)))
  }
  def BindingElisionElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(3, List(Some(3)))
    case (true, true) => Depth(3, List(Some(3)))
    case (false, false) => Depth(3, List(Some(3)))
    case (false, true) => Depth(3, List(Some(3)))
  }
  def BindingProperty(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def BindingElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(2, List(Some(2), Some(2)))
    case (true, false) => Depth(2, List(Some(2), Some(2)))
    case (true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true) => Depth(2, List(Some(2), Some(2)))
  }
  def SingleNameBinding(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def BindingRestElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false) => Depth(2, List(Some(2), Some(2)))
    case (false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false) => Depth(2, List(Some(2), Some(2)))
  }
  def EmptyStatement(): Depth = () match {
    case () => Depth(1, List(Some(1)))
  }
  def ExpressionStatement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, false, false) => Depth(2, List(Some(2), Some(2)))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, true, false) => Depth(2, List(Some(2), Some(2)))
    case (true, false, false) => Depth(2, List(Some(2), Some(2)))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true, false) => Depth(2, List(Some(2), Some(2)))
  }
  def IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, true, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), None, None, None))
    case (false, true, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), None, None, None))
    case (true, true, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), None, None, None))
    case (false, true, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3)))
    case (false, false, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(3), Some(4), Some(2), Some(2), Some(3), Some(2), Some(2), Some(3), None, None, None))
  }
  def ForDeclaration(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
  }
  def ForBinding(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(1)))
    case (false, true) => Depth(1, List(Some(1), Some(1)))
    case (true, false) => Depth(1, List(Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1)))
  }
  def ContinueStatement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
  }
  def BreakStatement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def ReturnStatement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
  }
  def WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, false, true) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
  }
  def SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, false, true) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
    case (false, false, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
  }
  def CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
  }
  def CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
  }
  def CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, false, true) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
  }
  def DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, false, true) => Depth(1, List(Some(1)))
    case (false, true, true) => Depth(1, List(Some(1)))
    case (true, false, false) => Depth(1, List(Some(1)))
    case (true, true, false) => Depth(1, List(Some(1)))
    case (false, false, true) => Depth(1, List(Some(1)))
    case (false, false, false) => Depth(1, List(Some(1)))
    case (true, true, true) => Depth(1, List(Some(1)))
    case (false, true, false) => Depth(1, List(Some(1)))
  }
  def LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, true, true) => Depth(2, List(Some(2)))
    case (false, false, true) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
  }
  def LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (true, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, false) => Depth(1, List(Some(1), Some(2)))
    case (false, false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, true, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false, true) => Depth(1, List(Some(1), Some(2)))
  }
  def ThrowStatement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, true, false) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (true, true, false) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (true, true, true) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (false, false, true) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (false, true, true) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (true, false, true) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (false, false, false) => Depth(3, List(Some(3), Some(3), Some(3)))
    case (true, false, false) => Depth(3, List(Some(3), Some(3), Some(3)))
  }
  def Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, true, false) => Depth(2, List(Some(2), Some(2)))
    case (true, true, false) => Depth(2, List(Some(2), Some(2)))
    case (true, false, false) => Depth(2, List(Some(2), Some(2)))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), Some(2)))
  }
  def Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Depth = (pYield, pAwait, pReturn) match {
    case (false, false, true) => Depth(2, List(Some(2)))
    case (false, true, true) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
  }
  def CatchParameter(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(1)))
    case (false, true) => Depth(1, List(Some(1), Some(1)))
    case (true, false) => Depth(1, List(Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1)))
  }
  def DebuggerStatement(): Depth = () match {
    case () => Depth(1, List(Some(1)))
  }
  def FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Depth = (pYield, pAwait, pDefault) match {
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), None))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (true, true, false) => Depth(2, List(Some(2), None))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, false) => Depth(2, List(Some(2), None))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true, false) => Depth(2, List(Some(2), None))
  }
  def FunctionExpression(): Depth = () match {
    case () => Depth(2, List(Some(2)))
  }
  def UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1)))
    case (true, false) => Depth(1, List(Some(1)))
    case (true, true) => Depth(1, List(Some(1)))
    case (false, false) => Depth(1, List(Some(1)))
  }
  def FormalParameters(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(3), Some(3)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(3), Some(3)))
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2), Some(3), Some(3)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2), Some(3), Some(3)))
  }
  def FormalParameterList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2), Some(3)))
    case (true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(3)))
  }
  def FunctionRestParameter(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
  }
  def FormalParameter(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
  }
  def FunctionBody(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(0, List(Some(0)))
    case (false, true) => Depth(0, List(Some(0)))
    case (true, true) => Depth(0, List(Some(0)))
    case (false, false) => Depth(0, List(Some(0)))
  }
  def FunctionStatementList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(0, List(Some(0)))
    case (true, false) => Depth(0, List(Some(0)))
    case (false, false) => Depth(0, List(Some(0)))
    case (false, true) => Depth(0, List(Some(0)))
  }
  def ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (false, true, true) => Depth(2, List(Some(2)))
    case (false, true, false) => Depth(2, List(Some(2)))
    case (true, false, true) => Depth(2, List(Some(2)))
    case (true, true, true) => Depth(2, List(Some(2)))
    case (true, false, false) => Depth(2, List(Some(2)))
    case (true, true, false) => Depth(2, List(Some(2)))
    case (false, false, true) => Depth(2, List(Some(2)))
    case (false, false, false) => Depth(2, List(Some(2)))
  }
  def ArrowParameters(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1), Some(1)))
    case (true, true) => Depth(1, List(Some(1), Some(1)))
    case (false, false) => Depth(1, List(Some(1), Some(1)))
    case (false, true) => Depth(1, List(Some(1), Some(1)))
  }
  def ConciseBody(pIn: Boolean): Depth = (pIn) match {
    case (false) => Depth(1, List(Some(1), Some(1)))
    case (true) => Depth(1, List(Some(1), Some(1)))
  }
  def ExpressionBody(pIn: Boolean, pAwait: Boolean): Depth = (pIn, pAwait) match {
    case (false, false) => Depth(1, List(Some(1)))
    case (true, true) => Depth(1, List(Some(1)))
    case (true, false) => Depth(1, List(Some(1)))
    case (false, true) => Depth(1, List(Some(1)))
  }
  def ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Depth = (pIn, pYield, pAwait) match {
    case (true, true, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, false) => Depth(2, List(Some(2), Some(3)))
    case (false, true, false) => Depth(2, List(Some(2), Some(3)))
    case (true, false, true) => Depth(2, List(Some(2), Some(3)))
    case (false, false, true) => Depth(2, List(Some(2), Some(3)))
    case (true, true, true) => Depth(2, List(Some(2), Some(3)))
  }
  def AsyncConciseBody(pIn: Boolean): Depth = (pIn) match {
    case (false) => Depth(1, List(Some(1), Some(1)))
    case (true) => Depth(1, List(Some(1), Some(1)))
  }
  def AsyncArrowBindingIdentifier(pYield: Boolean): Depth = (pYield) match {
    case (false) => Depth(1, List(Some(1)))
    case (true) => Depth(1, List(Some(1)))
  }
  def CoverCallExpressionAndAsyncArrowHead(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def AsyncArrowHead(): Depth = () match {
    case () => Depth(3, List(Some(3)))
  }
  def MethodDefinition(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(2), Some(3)))
    case (false, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(2), Some(3)))
    case (false, true) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(2), Some(3)))
    case (true, false) => Depth(2, List(Some(2), Some(2), Some(2), Some(2), Some(2), Some(3)))
  }
  def PropertySetParameterList(): Depth = () match {
    case () => Depth(2, List(Some(2)))
  }
  def GeneratorMethod(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
  }
  def GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Depth = (pYield, pAwait, pDefault) match {
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, false) => Depth(2, List(Some(2), None))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), None))
    case (false, true, false) => Depth(2, List(Some(2), None))
    case (true, true, false) => Depth(2, List(Some(2), None))
  }
  def GeneratorExpression(): Depth = () match {
    case () => Depth(2, List(Some(2)))
  }
  def GeneratorBody(): Depth = () match {
    case () => Depth(0, List(Some(0)))
  }
  def YieldExpression(pIn: Boolean, pAwait: Boolean): Depth = (pIn, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2), Some(2)))
  }
  def AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
  }
  def AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Depth = (pYield, pAwait, pDefault) match {
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), None))
    case (false, true, false) => Depth(2, List(Some(2), None))
    case (true, false, false) => Depth(2, List(Some(2), None))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (true, true, false) => Depth(2, List(Some(2), None))
  }
  def AsyncGeneratorExpression(): Depth = () match {
    case () => Depth(2, List(Some(2)))
  }
  def AsyncGeneratorBody(): Depth = () match {
    case () => Depth(0, List(Some(0)))
  }
  def AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Depth = (pYield, pAwait, pDefault) match {
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true, false) => Depth(2, List(Some(2), None))
    case (true, false, false) => Depth(2, List(Some(2), None))
    case (false, false, false) => Depth(2, List(Some(2), None))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (true, true, false) => Depth(2, List(Some(2), None))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
  }
  def AsyncFunctionExpression(): Depth = () match {
    case () => Depth(2, List(Some(2), Some(2)))
  }
  def AsyncMethod(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
  }
  def AsyncFunctionBody(): Depth = () match {
    case () => Depth(0, List(Some(0)))
  }
  def AwaitExpression(pYield: Boolean): Depth = (pYield) match {
    case (true) => Depth(2, List(Some(2)))
    case (false) => Depth(2, List(Some(2)))
  }
  def ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Depth = (pYield, pAwait, pDefault) match {
    case (true, true, false) => Depth(2, List(Some(2), None))
    case (false, true, true) => Depth(2, List(Some(2), Some(2)))
    case (false, true, false) => Depth(2, List(Some(2), None))
    case (true, false, false) => Depth(2, List(Some(2), None))
    case (true, true, true) => Depth(2, List(Some(2), Some(2)))
    case (true, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, true) => Depth(2, List(Some(2), Some(2)))
    case (false, false, false) => Depth(2, List(Some(2), None))
  }
  def ClassExpression(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
  }
  def ClassTail(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1)))
    case (false, false) => Depth(1, List(Some(1)))
    case (true, true) => Depth(1, List(Some(1)))
    case (false, true) => Depth(1, List(Some(1)))
  }
  def ClassHeritage(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(2, List(Some(2)))
    case (true, false) => Depth(2, List(Some(2)))
    case (false, false) => Depth(2, List(Some(2)))
    case (true, true) => Depth(2, List(Some(2)))
  }
  def ClassBody(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(1)))
    case (false, true) => Depth(1, List(Some(1)))
    case (true, true) => Depth(1, List(Some(1)))
    case (false, false) => Depth(1, List(Some(1)))
  }
  def ClassElementList(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (false, true) => Depth(1, List(Some(1), Some(2)))
    case (false, false) => Depth(1, List(Some(1), Some(2)))
    case (true, false) => Depth(1, List(Some(1), Some(2)))
    case (true, true) => Depth(1, List(Some(1), Some(2)))
  }
  def ClassElement(pYield: Boolean, pAwait: Boolean): Depth = (pYield, pAwait) match {
    case (true, false) => Depth(1, List(Some(2), Some(3), Some(1)))
    case (false, false) => Depth(1, List(Some(2), Some(3), Some(1)))
    case (false, true) => Depth(1, List(Some(2), Some(3), Some(1)))
    case (true, true) => Depth(1, List(Some(2), Some(3), Some(1)))
  }
  def Script(): Depth = () match {
    case () => Depth(0, List(Some(0)))
  }
  def ScriptBody(): Depth = () match {
    case () => Depth(1, List(Some(1)))
  }
  def ExportSpecifier(): Depth = () match {
    case () => Depth(1, List(Some(1), Some(2)))
  }
}
