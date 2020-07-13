package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Lexical
import kr.ac.kaist.ires.ir._

object DepthCounter {
  val SourceCharacter = 0
  val InputElementDiv = 0
  val InputElementRegExp = 0
  val InputElementRegExpOrTemplateTail = 0
  val InputElementTemplateTail = 0
  val MultiLineComment = 0
  val MultiLineCommentChars = 0
  val PostAsteriskCommentChars = 0
  val MultiLineNotAsteriskChar = 0
  val MultiLineNotForwardSlashOrAsteriskChar = 0
  val SingleLineComment = 0
  val SingleLineCommentChars = 0
  val SingleLineCommentChar = 0
  val CommonToken = 0
  val IdentifierName = 0
  val IdentifierStart = 0
  val IdentifierPart = 0
  val UnicodeIDStart = 0
  val UnicodeIDContinue = 0
  val ReservedWord = 0
  val Punctuator = 0
  val OptionalChainingPunctuator = 0
  val OtherPunctuator = 0
  val DivPunctuator = 0
  val RightBracePunctuator = 0
  val NullLiteral = 0
  val BooleanLiteral = 0
  val NumericLiteral = 0
  val DecimalBigIntegerLiteral = 0
  val NonDecimalIntegerLiteral = 0
  val BigIntLiteralSuffix = 0
  val DecimalLiteral = 0
  val DecimalIntegerLiteral = 0
  val DecimalDigits = 0
  val DecimalDigit = 0
  val NonZeroDigit = 0
  val ExponentPart = 0
  val ExponentIndicator = 0
  val SignedInteger = 0
  val BinaryIntegerLiteral = 0
  val BinaryDigits = 0
  val BinaryDigit = 0
  val OctalIntegerLiteral = 0
  val OctalDigits = 0
  val OctalDigit = 0
  val HexIntegerLiteral = 0
  val HexDigits = 0
  val HexDigit = 0
  val StringLiteral = 0
  val DoubleStringCharacters = 0
  val SingleStringCharacters = 0
  val DoubleStringCharacter = 0
  val SingleStringCharacter = 0
  val LineContinuation = 0
  val EscapeSequence = 0
  val CharacterEscapeSequence = 0
  val SingleEscapeCharacter = 0
  val NonEscapeCharacter = 0
  val EscapeCharacter = 0
  val HexEscapeSequence = 0
  val UnicodeEscapeSequence = 0
  val Hex4Digits = 0
  val RegularExpressionLiteral = 0
  val RegularExpressionBody = 0
  val RegularExpressionChars = 0
  val RegularExpressionFirstChar = 0
  val RegularExpressionChar = 0
  val RegularExpressionBackslashSequence = 0
  val RegularExpressionNonTerminator = 0
  val RegularExpressionClass = 0
  val RegularExpressionClassChars = 0
  val RegularExpressionClassChar = 0
  val RegularExpressionFlags = 0
  val Template = 0
  val NoSubstitutionTemplate = 0
  val TemplateHead = 0
  val TemplateSubstitutionTail = 0
  val TemplateMiddle = 0
  val TemplateTail = 0
  val TemplateCharacters = 0
  val TemplateCharacter = 0
  val NotEscapeSequence = 0
  val NotCodePoint = 0
  val CodePoint = 0
  def IdentifierReference(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def BindingIdentifier(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    None
  }
  def LabelIdentifier(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def Identifier(): Option[Int] = {
    Some(2)
  }
  def PrimaryExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    None
  }
  def Literal(): Option[Int] = {
    Some(1)
  }
  def ArrayLiteral(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def ElementList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(3)
    None
  }
  def Elision(): Option[Int] = {
    Some(1)
  }
  def SpreadElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(3)
    None
  }
  def ObjectLiteral(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    None
  }
  def PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def PropertyDefinition(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def PropertyName(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    None
  }
  def LiteralPropertyName(): Option[Int] = {
    Some(1)
  }
  def ComputedPropertyName(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def CoverInitializedName(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == true && pAwait == false) Some(3)
    if (pYield == false && pAwait == false) Some(4)
    if (pYield == false && pAwait == true) Some(4)
    None
  }
  def Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    if (pIn == false && pYield == false && pAwait == true) Some(3)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(3)
    if (pIn == false && pYield == false && pAwait == false) Some(3)
    if (pIn == true && pYield == false && pAwait == true) Some(3)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    None
  }
  def TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pTagged == true) Some(1)
    if (pYield == true && pAwait == true && pTagged == true) Some(1)
    if (pYield == false && pAwait == false && pTagged == false) Some(1)
    if (pYield == false && pAwait == true && pTagged == true) Some(1)
    if (pYield == true && pAwait == false && pTagged == true) Some(1)
    if (pYield == false && pAwait == true && pTagged == false) Some(1)
    if (pYield == true && pAwait == false && pTagged == false) Some(1)
    if (pYield == true && pAwait == true && pTagged == false) Some(1)
    None
  }
  def SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pTagged == true) Some(3)
    if (pYield == true && pAwait == true && pTagged == true) Some(2)
    if (pYield == false && pAwait == false && pTagged == true) Some(3)
    if (pYield == true && pAwait == false && pTagged == true) Some(2)
    if (pYield == true && pAwait == false && pTagged == false) Some(2)
    if (pYield == false && pAwait == false && pTagged == false) Some(3)
    if (pYield == false && pAwait == true && pTagged == false) Some(3)
    if (pYield == true && pAwait == true && pTagged == false) Some(2)
    None
  }
  def TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pTagged == false) Some(1)
    if (pYield == true && pAwait == true && pTagged == false) Some(1)
    if (pYield == false && pAwait == true && pTagged == true) Some(1)
    if (pYield == true && pAwait == true && pTagged == true) Some(1)
    if (pYield == true && pAwait == false && pTagged == true) Some(1)
    if (pYield == false && pAwait == true && pTagged == false) Some(1)
    if (pYield == false && pAwait == false && pTagged == true) Some(1)
    if (pYield == true && pAwait == false && pTagged == false) Some(1)
    None
  }
  def TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true && pTagged == true) Some(2)
    if (pYield == true && pAwait == true && pTagged == false) Some(2)
    if (pYield == false && pAwait == true && pTagged == true) Some(3)
    if (pYield == false && pAwait == false && pTagged == false) Some(3)
    if (pYield == true && pAwait == false && pTagged == false) Some(2)
    if (pYield == true && pAwait == false && pTagged == true) Some(2)
    if (pYield == false && pAwait == true && pTagged == false) Some(3)
    if (pYield == false && pAwait == false && pTagged == true) Some(3)
    None
  }
  def MemberExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def SuperProperty(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def MetaProperty(): Option[Int] = {
    Some(1)
  }
  def NewTarget(): Option[Int] = {
    Some(1)
  }
  def ImportMeta(): Option[Int] = {
    Some(1)
  }
  def NewExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def CallExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    None
  }
  def CallMemberExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    None
  }
  def SuperCall(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def ImportCall(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def Arguments(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ArgumentList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def OptionalExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == true && pAwait == false) Some(3)
    None
  }
  def OptionalChain(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def UpdateExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def UnaryExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ExponentiationExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def MultiplicativeOperator(): Option[Int] = {
    Some(1)
  }
  def AdditiveExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ShiftExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    None
  }
  def EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    None
  }
  def BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    None
  }
  def BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    None
  }
  def BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    None
  }
  def LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    None
  }
  def LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    None
  }
  def CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    None
  }
  def CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    None
  }
  def ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    None
  }
  def ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == false && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == true) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    None
  }
  def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    None
  }
  def AssignmentOperator(): Option[Int] = {
    Some(1)
  }
  def AssignmentPattern(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    None
  }
  def ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == false && pAwait == true) Some(2)
    None
  }
  def AssignmentElementList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == true && pAwait == false) Some(3)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(3)
    None
  }
  def AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == true && pAwait == false) Some(3)
    None
  }
  def AssignmentProperty(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    None
  }
  def AssignmentElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def AssignmentRestElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(1)
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(1)
    if (pIn == false && pYield == true && pAwait == false) Some(1)
    None
  }
  def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(1)
    None
  }
  def Declaration(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false && pDefault == false) Some(2)
    if (pYield == true && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == true) Some(2)
    if (pYield == false && pAwait == false && pDefault == false) Some(2)
    None
  }
  def BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(2)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(2)
    None
  }
  def BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(1)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    None
  }
  def Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(1)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    None
  }
  def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    None
  }
  def StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    None
  }
  def LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == false) Some(3)
    if (pIn == false && pYield == false && pAwait == false) Some(3)
    if (pIn == false && pYield == true && pAwait == true) Some(3)
    if (pIn == true && pYield == false && pAwait == true) Some(3)
    if (pIn == false && pYield == true && pAwait == false) Some(3)
    if (pIn == false && pYield == false && pAwait == true) Some(3)
    if (pIn == true && pYield == true && pAwait == true) Some(3)
    if (pIn == true && pYield == true && pAwait == false) Some(3)
    None
  }
  def LetOrConst(): Option[Int] = {
    Some(1)
  }
  def BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    None
  }
  def LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    None
  }
  def VariableStatement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(3)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == false && pAwait == false) Some(3)
    None
  }
  def VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    None
  }
  def VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    None
  }
  def BindingPattern(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    None
  }
  def BindingRestProperty(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def BindingPropertyList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def BindingElementList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == true && pAwait == false) Some(3)
    if (pYield == true && pAwait == true) Some(3)
    None
  }
  def BindingElisionElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(3)
    if (pYield == true && pAwait == true) Some(3)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == false && pAwait == false) Some(3)
    None
  }
  def BindingProperty(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def BindingElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def SingleNameBinding(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def BindingRestElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def EmptyStatement(): Option[Int] = {
    Some(1)
  }
  def ExpressionStatement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(3)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == true) Some(3)
    if (pYield == false && pAwait == false && pReturn == false) Some(3)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(3)
    None
  }
  def IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == false) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    None
  }
  def ForDeclaration(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def ForBinding(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def ContinueStatement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def BreakStatement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def ReturnStatement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pReturn == true) Some(3)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == false) Some(3)
    if (pYield == false && pAwait == false && pReturn == true) Some(3)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    None
  }
  def SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == true) Some(3)
    if (pYield == false && pAwait == false && pReturn == false) Some(3)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(3)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    None
  }
  def CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    None
  }
  def CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(3)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == true) Some(3)
    if (pYield == false && pAwait == true && pReturn == true) Some(3)
    None
  }
  def CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(3)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == true) Some(3)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(3)
    None
  }
  def DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(1)
    None
  }
  def LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(2)
    if (pYield == true && pAwait == true && pReturn == true) Some(3)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == false) Some(2)
    None
  }
  def LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(1)
    if (pYield == true && pAwait == false && pReturn == true) Some(1)
    if (pYield == true && pAwait == true && pReturn == true) Some(1)
    if (pYield == false && pAwait == false && pReturn == true) Some(1)
    if (pYield == false && pAwait == true && pReturn == true) Some(1)
    None
  }
  def ThrowStatement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(3)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(3)
    None
  }
  def TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false && pReturn == true) Some(3)
    if (pYield == false && pAwait == false && pReturn == false) Some(3)
    if (pYield == false && pAwait == false && pReturn == true) Some(3)
    if (pYield == false && pAwait == true && pReturn == true) Some(3)
    if (pYield == true && pAwait == true && pReturn == true) Some(3)
    None
  }
  def Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pReturn == false) Some(2)
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    None
  }
  def Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == true && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == true) Some(2)
    if (pYield == false && pAwait == false && pReturn == false) Some(2)
    if (pYield == true && pAwait == true && pReturn == true) Some(2)
    None
  }
  def CatchParameter(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def DebuggerStatement(): Option[Int] = {
    Some(1)
  }
  def FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == false) Some(2)
    if (pYield == true && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == true) Some(2)
    if (pYield == false && pAwait == true && pDefault == false) Some(2)
    None
  }
  def FunctionExpression(): Option[Int] = {
    Some(2)
  }
  def UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def FormalParameters(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    None
  }
  def FormalParameterList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    None
  }
  def FunctionRestParameter(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    None
  }
  def FormalParameter(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    None
  }
  def FunctionBody(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(0)
    if (pYield == false && pAwait == true) Some(0)
    if (pYield == false && pAwait == false) Some(0)
    if (pYield == true && pAwait == true) Some(0)
    None
  }
  def FunctionStatementList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(0)
    if (pYield == true && pAwait == true) Some(0)
    if (pYield == false && pAwait == true) Some(0)
    if (pYield == false && pAwait == false) Some(0)
    None
  }
  def ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    None
  }
  def ArrowParameters(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ConciseBody(pIn: Boolean): Option[Int] = {
    if (pIn == true) Some(1)
    if (pIn == false) Some(1)
    None
  }
  def ExpressionBody(pIn: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pAwait == false) Some(2)
    if (pIn == true && pAwait == true) Some(2)
    if (pIn == false && pAwait == true) Some(2)
    if (pIn == true && pAwait == false) Some(2)
    None
  }
  def ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(2)
    None
  }
  def AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == true && pYield == false && pAwait == true) Some(2)
    if (pIn == false && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == true && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == true) Some(4)
    if (pIn == true && pYield == false && pAwait == false) Some(2)
    if (pIn == false && pYield == false && pAwait == true) Some(2)
    if (pIn == true && pYield == true && pAwait == false) Some(4)
    if (pIn == false && pYield == true && pAwait == false) Some(2)
    None
  }
  def AsyncConciseBody(pIn: Boolean): Option[Int] = {
    if (pIn == false) Some(1)
    if (pIn == true) Some(1)
    None
  }
  def AsyncArrowBindingIdentifier(pYield: Boolean): Option[Int] = {
    if (pYield == false) Some(1)
    if (pYield == true) Some(1)
    None
  }
  def CoverCallExpressionAndAsyncArrowHead(): Option[Int] = {
    Some(2)
    Some(2)
    Some(2)
    Some(2)
  }
  def AsyncArrowHead(): Option[Int] = {
    Some(3)
  }
  def MethodDefinition(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def PropertySetParameterList(): Option[Int] = {
    Some(2)
  }
  def GeneratorMethod(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true && pDefault == false) Some(2)
    if (pYield == true && pAwait == false && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == false) Some(2)
    if (pYield == true && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == true) Some(2)
    None
  }
  def GeneratorExpression(): Option[Int] = {
    Some(2)
  }
  def GeneratorBody(): Option[Int] = {
    Some(0)
  }
  def YieldExpression(pIn: Boolean, pAwait: Boolean): Option[Int] = {
    if (pIn == false && pAwait == true) Some(1)
    if (pIn == true && pAwait == true) Some(1)
    if (pIn == true && pAwait == false) Some(1)
    if (pIn == false && pAwait == false) Some(1)
    None
  }
  def AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == true && pDefault == false) Some(2)
    if (pYield == true && pAwait == false && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == true) Some(2)
    if (pYield == false && pAwait == false && pDefault == false) Some(2)
    None
  }
  def AsyncGeneratorExpression(): Option[Int] = {
    Some(2)
  }
  def AsyncGeneratorBody(): Option[Int] = {
    Some(0)
  }
  def AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == true) Some(2)
    if (pYield == false && pAwait == true && pDefault == false) Some(2)
    if (pYield == true && pAwait == false && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == false) Some(2)
    None
  }
  def AsyncFunctionExpression(): Option[Int] = {
    Some(2)
  }
  def AsyncMethod(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def AsyncFunctionBody(): Option[Int] = {
    Some(0)
  }
  def AwaitExpression(pYield: Boolean): Option[Int] = {
    if (pYield == false) Some(2)
    if (pYield == true) Some(2)
    None
  }
  def ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false && pDefault == false) Some(2)
    if (pYield == false && pAwait == true && pDefault == false) Some(2)
    if (pYield == false && pAwait == false && pDefault == true) Some(2)
    if (pYield == true && pAwait == true && pDefault == false) Some(2)
    if (pYield == true && pAwait == false && pDefault == false) Some(2)
    None
  }
  def ClassExpression(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def ClassTail(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    None
  }
  def ClassHeritage(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(2)
    if (pYield == true && pAwait == true) Some(2)
    if (pYield == false && pAwait == true) Some(2)
    if (pYield == false && pAwait == false) Some(2)
    None
  }
  def ClassBody(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    None
  }
  def ClassElementList(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == true && pAwait == false) Some(1)
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    None
  }
  def ClassElement(pYield: Boolean, pAwait: Boolean): Option[Int] = {
    if (pYield == false && pAwait == false) Some(1)
    if (pYield == true && pAwait == true) Some(1)
    if (pYield == false && pAwait == true) Some(1)
    if (pYield == true && pAwait == false) Some(1)
    None
  }
  def Script(): Option[Int] = {
    Some(0)
  }
  def ScriptBody(): Option[Int] = {
    Some(1)
  }
  def Module(): Option[Int] = {
    Some(0)
  }
  def ModuleBody(): Option[Int] = {
    Some(1)
  }
  def ModuleItemList(): Option[Int] = {
    Some(1)
  }
  def ModuleItem(): Option[Int] = {
    Some(1)
  }
  def ImportDeclaration(): Option[Int] = {
    Some(2)
  }
  def ImportClause(): Option[Int] = {
    Some(1)
  }
  def ImportedDefaultBinding(): Option[Int] = {
    Some(1)
  }
  def NameSpaceImport(): Option[Int] = {
    Some(2)
  }
  def NamedImports(): Option[Int] = {
    Some(1)
  }
  def FromClause(): Option[Int] = {
    Some(2)
  }
  def ImportsList(): Option[Int] = {
    Some(1)
  }
  def ImportSpecifier(): Option[Int] = {
    Some(1)
  }
  def ModuleSpecifier(): Option[Int] = {
    Some(1)
  }
  def ImportedBinding(): Option[Int] = {
    Some(1)
  }
  def ExportDeclaration(): Option[Int] = {
    Some(2)
  }
  def ExportFromClause(): Option[Int] = {
    Some(1)
  }
  def NamedExports(): Option[Int] = {
    Some(1)
  }
  def ExportsList(): Option[Int] = {
    Some(1)
  }
  def ExportSpecifier(): Option[Int] = {
    Some(1)
  }
}
