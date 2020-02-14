package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.parser.ESParsers

object Parser extends ESParsers {
  lazy val SourceCharacter: Lexer = (
    s(Unicode)
  )
  lazy val InputElementDiv: Lexer = (
    s(WhiteSpace) |||
    s(LineTerminator) |||
    s(Comment) |||
    s(CommonToken) |||
    s(DivPunctuator) |||
    s(RightBracePunctuator)
  )
  lazy val InputElementRegExp: Lexer = (
    s(WhiteSpace) |||
    s(LineTerminator) |||
    s(Comment) |||
    s(CommonToken) |||
    s(RightBracePunctuator) |||
    s(RegularExpressionLiteral)
  )
  lazy val InputElementRegExpOrTemplateTail: Lexer = (
    s(WhiteSpace) |||
    s(LineTerminator) |||
    s(Comment) |||
    s(CommonToken) |||
    s(RegularExpressionLiteral) |||
    s(TemplateSubstitutionTail)
  )
  lazy val InputElementTemplateTail: Lexer = (
    s(WhiteSpace) |||
    s(LineTerminator) |||
    s(Comment) |||
    s(CommonToken) |||
    s(DivPunctuator) |||
    s(TemplateSubstitutionTail)
  )
  lazy val MultiLineComment: Lexer = (
    s("/*", opt(MultiLineCommentChars), "*/")
  )
  lazy val MultiLineCommentChars: Lexer = (
    s(MultiLineNotAsteriskChar, opt(MultiLineCommentChars)) |||
    s("*", opt(PostAsteriskCommentChars))
  )
  lazy val PostAsteriskCommentChars: Lexer = (
    s(MultiLineNotForwardSlashOrAsteriskChar, opt(MultiLineCommentChars)) |||
    s("*", opt(PostAsteriskCommentChars))
  )
  lazy val MultiLineNotAsteriskChar: Lexer = (
    s((SourceCharacter \ ("*")))
  )
  lazy val MultiLineNotForwardSlashOrAsteriskChar: Lexer = (
    s((SourceCharacter \ ("/" ||| "*")))
  )
  lazy val SingleLineComment: Lexer = (
    s("//", opt(SingleLineCommentChars))
  )
  lazy val SingleLineCommentChars: Lexer = (
    s(SingleLineCommentChar, opt(SingleLineCommentChars))
  )
  lazy val SingleLineCommentChar: Lexer = (
    s((SourceCharacter \ (LineTerminator)))
  )
  lazy val CommonToken: Lexer = (
    s(IdentifierName) |||
    s(Punctuator) |||
    s(NumericLiteral) |||
    s(StringLiteral) |||
    s(Template)
  )
  lazy val IdentifierName: Lexer = resolveLL(
    s(IdentifierStart),
    sLL(IdentifierPart)
  )
  lazy val IdentifierStart: Lexer = (
    s(UnicodeIDStart) |||
    s("$") |||
    s("_") |||
    s("\\", UnicodeEscapeSequence)
  )
  lazy val IdentifierPart: Lexer = (
    s(UnicodeIDContinue) |||
    s("$") |||
    s("\\", UnicodeEscapeSequence) |||
    s(ZWNJ) |||
    s(ZWJ)
  )
  lazy val UnicodeIDStart: Lexer = (
    s(IDStart)
  )
  lazy val UnicodeIDContinue: Lexer = (
    s(IDContinue)
  )
  lazy val ReservedWord: Lexer = (
    s(Keyword) |||
    s(FutureReservedWord) |||
    s(NullLiteral) |||
    s(BooleanLiteral)
  )
  lazy val Keyword: Lexer = (
    s("await") |||
    s("break") |||
    s("case") |||
    s("catch") |||
    s("class") |||
    s("const") |||
    s("continue") |||
    s("debugger") |||
    s("default") |||
    s("delete") |||
    s("do") |||
    s("else") |||
    s("export") |||
    s("extends") |||
    s("finally") |||
    s("for") |||
    s("function") |||
    s("if") |||
    s("import") |||
    s("in") |||
    s("instanceof") |||
    s("new") |||
    s("return") |||
    s("super") |||
    s("switch") |||
    s("this") |||
    s("throw") |||
    s("try") |||
    s("typeof") |||
    s("var") |||
    s("void") |||
    s("while") |||
    s("with") |||
    s("yield")
  )
  lazy val FutureReservedWord: Lexer = (
    s("enum")
  )
  lazy val Punctuator: Lexer = (
    s("{") |||
    s("(") |||
    s(")") |||
    s("[") |||
    s("]") |||
    s(".") |||
    s("...") |||
    s(";") |||
    s(",") |||
    s("<") |||
    s(">") |||
    s("<=") |||
    s(">=") |||
    s("==") |||
    s("!=") |||
    s("===") |||
    s("!==") |||
    s("+") |||
    s("-") |||
    s("*") |||
    s("%") |||
    s("**") |||
    s("++") |||
    s("--") |||
    s("<<") |||
    s(">>") |||
    s(">>>") |||
    s("&") |||
    s("|") |||
    s("^") |||
    s("!") |||
    s("~") |||
    s("&&") |||
    s("||") |||
    s("?") |||
    s(":") |||
    s("=") |||
    s("+=") |||
    s("-=") |||
    s("*=") |||
    s("%=") |||
    s("**=") |||
    s("<<=") |||
    s(">>=") |||
    s(">>>=") |||
    s("&=") |||
    s("|=") |||
    s("^=") |||
    s("=>")
  )
  lazy val DivPunctuator: Lexer = (
    s("/") |||
    s("/=")
  )
  lazy val RightBracePunctuator: Lexer = (
    s("}")
  )
  lazy val NullLiteral: Lexer = (
    s("null")
  )
  lazy val BooleanLiteral: Lexer = (
    s("true") |||
    s("false")
  )
  lazy val NumericLiteral: Lexer = (
    s(DecimalLiteral) |||
    s(BinaryIntegerLiteral) |||
    s(OctalIntegerLiteral) |||
    s(HexIntegerLiteral)
  )
  lazy val DecimalLiteral: Lexer = (
    s(DecimalIntegerLiteral, ".", opt(DecimalDigits), opt(ExponentPart)) |||
    s(".", DecimalDigits, opt(ExponentPart)) |||
    s(DecimalIntegerLiteral, opt(ExponentPart))
  )
  lazy val DecimalIntegerLiteral: Lexer = (
    s("0") |||
    s(NonZeroDigit, opt(DecimalDigits))
  )
  lazy val DecimalDigits: Lexer = resolveLL(
    s(DecimalDigit),
    sLL(DecimalDigit)
  )
  lazy val DecimalDigit: Lexer = (
    s("0") |||
    s("1") |||
    s("2") |||
    s("3") |||
    s("4") |||
    s("5") |||
    s("6") |||
    s("7") |||
    s("8") |||
    s("9")
  )
  lazy val NonZeroDigit: Lexer = (
    s("1") |||
    s("2") |||
    s("3") |||
    s("4") |||
    s("5") |||
    s("6") |||
    s("7") |||
    s("8") |||
    s("9")
  )
  lazy val ExponentPart: Lexer = (
    s(ExponentIndicator, SignedInteger)
  )
  lazy val ExponentIndicator: Lexer = (
    s("e") |||
    s("E")
  )
  lazy val SignedInteger: Lexer = (
    s(DecimalDigits) |||
    s("+", DecimalDigits) |||
    s("-", DecimalDigits)
  )
  lazy val BinaryIntegerLiteral: Lexer = (
    s("0b", BinaryDigits) |||
    s("0B", BinaryDigits)
  )
  lazy val BinaryDigits: Lexer = resolveLL(
    s(BinaryDigit),
    sLL(BinaryDigit)
  )
  lazy val BinaryDigit: Lexer = (
    s("0") |||
    s("1")
  )
  lazy val OctalIntegerLiteral: Lexer = (
    s("0o", OctalDigits) |||
    s("0O", OctalDigits)
  )
  lazy val OctalDigits: Lexer = resolveLL(
    s(OctalDigit),
    sLL(OctalDigit)
  )
  lazy val OctalDigit: Lexer = (
    s("0") |||
    s("1") |||
    s("2") |||
    s("3") |||
    s("4") |||
    s("5") |||
    s("6") |||
    s("7")
  )
  lazy val HexIntegerLiteral: Lexer = (
    s("0x", HexDigits) |||
    s("0X", HexDigits)
  )
  lazy val HexDigits: Lexer = resolveLL(
    s(HexDigit),
    sLL(HexDigit)
  )
  lazy val HexDigit: Lexer = (
    s("0") |||
    s("1") |||
    s("2") |||
    s("3") |||
    s("4") |||
    s("5") |||
    s("6") |||
    s("7") |||
    s("8") |||
    s("9") |||
    s("a") |||
    s("b") |||
    s("c") |||
    s("d") |||
    s("e") |||
    s("f") |||
    s("A") |||
    s("B") |||
    s("C") |||
    s("D") |||
    s("E") |||
    s("F")
  )
  lazy val StringLiteral: Lexer = (
    s("\"", opt(DoubleStringCharacters), "\"") |||
    s("'", opt(SingleStringCharacters), "'")
  )
  lazy val DoubleStringCharacters: Lexer = (
    s(DoubleStringCharacter, opt(DoubleStringCharacters))
  )
  lazy val SingleStringCharacters: Lexer = (
    s(SingleStringCharacter, opt(SingleStringCharacters))
  )
  lazy val DoubleStringCharacter: Lexer = (
    s((SourceCharacter \ ("\"" ||| "\\" ||| LineTerminator))) |||
    s(LS) |||
    s(PS) |||
    s("\\", EscapeSequence) |||
    s(LineContinuation)
  )
  lazy val SingleStringCharacter: Lexer = (
    s((SourceCharacter \ ("'" ||| "\\" ||| LineTerminator))) |||
    s(LS) |||
    s(PS) |||
    s("\\", EscapeSequence) |||
    s(LineContinuation)
  )
  lazy val LineContinuation: Lexer = (
    s("\\", LineTerminatorSequence)
  )
  lazy val EscapeSequence: Lexer = (
    s(CharacterEscapeSequence) |||
    s("0", -s(DecimalDigit)) |||
    s(HexEscapeSequence) |||
    s(UnicodeEscapeSequence)
  )
  lazy val CharacterEscapeSequence: Lexer = (
    s(SingleEscapeCharacter) |||
    s(NonEscapeCharacter)
  )
  lazy val SingleEscapeCharacter: Lexer = (
    s("'") |||
    s("\"") |||
    s("\\") |||
    s("b") |||
    s("f") |||
    s("n") |||
    s("r") |||
    s("t") |||
    s("v")
  )
  lazy val NonEscapeCharacter: Lexer = (
    s((SourceCharacter \ (EscapeCharacter ||| LineTerminator)))
  )
  lazy val EscapeCharacter: Lexer = (
    s(SingleEscapeCharacter) |||
    s(DecimalDigit) |||
    s("x") |||
    s("u")
  )
  lazy val HexEscapeSequence: Lexer = (
    s("x", HexDigit, HexDigit)
  )
  lazy val UnicodeEscapeSequence: Lexer = (
    s("u", Hex4Digits) |||
    s("u{", CodePoint, "}")
  )
  lazy val Hex4Digits: Lexer = (
    s(HexDigit, HexDigit, HexDigit, HexDigit)
  )
  lazy val RegularExpressionLiteral: Lexer = (
    s("/", RegularExpressionBody, "/", RegularExpressionFlags)
  )
  lazy val RegularExpressionBody: Lexer = (
    s(RegularExpressionFirstChar, RegularExpressionChars)
  )
  lazy val RegularExpressionChars: Lexer = resolveLL(
    s(empty),
    sLL(RegularExpressionChar)
  )
  lazy val RegularExpressionFirstChar: Lexer = (
    s((RegularExpressionNonTerminator \ ("*" ||| "\\" ||| "/" ||| "["))) |||
    s(RegularExpressionBackslashSequence) |||
    s(RegularExpressionClass)
  )
  lazy val RegularExpressionChar: Lexer = (
    s((RegularExpressionNonTerminator \ ("\\" ||| "/" ||| "["))) |||
    s(RegularExpressionBackslashSequence) |||
    s(RegularExpressionClass)
  )
  lazy val RegularExpressionBackslashSequence: Lexer = (
    s("\\", RegularExpressionNonTerminator)
  )
  lazy val RegularExpressionNonTerminator: Lexer = (
    s((SourceCharacter \ (LineTerminator)))
  )
  lazy val RegularExpressionClass: Lexer = (
    s("[", RegularExpressionClassChars, "]")
  )
  lazy val RegularExpressionClassChars: Lexer = resolveLL(
    s(empty),
    sLL(RegularExpressionClassChar)
  )
  lazy val RegularExpressionClassChar: Lexer = (
    s((RegularExpressionNonTerminator \ ("]" ||| "\\"))) |||
    s(RegularExpressionBackslashSequence)
  )
  lazy val RegularExpressionFlags: Lexer = resolveLL(
    s(empty),
    sLL(IdentifierPart)
  )
  lazy val Template: Lexer = (
    s(NoSubstitutionTemplate) |||
    s(TemplateHead)
  )
  lazy val NoSubstitutionTemplate: Lexer = (
    s("`", opt(TemplateCharacters), "`")
  )
  lazy val TemplateHead: Lexer = (
    s("`", opt(TemplateCharacters), "${")
  )
  lazy val TemplateSubstitutionTail: Lexer = (
    s(TemplateMiddle) |||
    s(TemplateTail)
  )
  lazy val TemplateMiddle: Lexer = (
    s("}", opt(TemplateCharacters), "${")
  )
  lazy val TemplateTail: Lexer = (
    s("}", opt(TemplateCharacters), "`")
  )
  lazy val TemplateCharacters: Lexer = (
    s(TemplateCharacter, opt(TemplateCharacters))
  )
  lazy val TemplateCharacter: Lexer = (
    s("$", -s("{")) |||
    s("\\", EscapeSequence) |||
    s("\\", NotEscapeSequence) |||
    s(LineContinuation) |||
    s(LineTerminatorSequence) |||
    s((SourceCharacter \ ("`" ||| "\\" ||| "$" ||| LineTerminator)))
  )
  lazy val NotEscapeSequence: Lexer = (
    s("0", DecimalDigit) |||
    s((DecimalDigit \ ("0"))) |||
    s("x", -s(HexDigit)) |||
    s("x", HexDigit, -s(HexDigit)) |||
    s("u", -s(HexDigit), -s("{")) |||
    s("u", HexDigit, -s(HexDigit)) |||
    s("u", HexDigit, HexDigit, -s(HexDigit)) |||
    s("u", HexDigit, HexDigit, HexDigit, -s(HexDigit)) |||
    s("u", "{", -s(HexDigit)) |||
    s("u", "{", NotCodePoint, -s(HexDigit)) |||
    s("u", "{", CodePoint, -s(HexDigit), -s("}"))
  )
  lazy val NotCodePoint: Lexer = (
    s(HexDigits)
  )
  lazy val CodePoint: Lexer = (
    s(HexDigits)
  )
  lazy val IdentifierReference: ESParser[IdentifierReference] = memo(args => {
    val List(pYield, pAwait) = getArgsN("IdentifierReference", args, 2)
    log((
      log(MATCH ~ Identifier(List()) ^^ { case _ ~ x0 => IdentifierReference0(x0, args) })("IdentifierReference0") |
      log((if (!pYield) (MATCH <~ t("yield")) ^^ { case _ => IdentifierReference1(args) } else MISMATCH))("IdentifierReference1") |
      log((if (!pAwait) (MATCH <~ t("await")) ^^ { case _ => IdentifierReference2(args) } else MISMATCH))("IdentifierReference2")
    ))("IdentifierReference")
  })
  lazy val BindingIdentifier: ESParser[BindingIdentifier] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingIdentifier", args, 2)
    log((
      log(MATCH ~ Identifier(List()) ^^ { case _ ~ x0 => BindingIdentifier0(x0, args) })("BindingIdentifier0") |
      log((MATCH <~ t("yield")) ^^ { case _ => BindingIdentifier1(args) })("BindingIdentifier1") |
      log((MATCH <~ t("await")) ^^ { case _ => BindingIdentifier2(args) })("BindingIdentifier2")
    ))("BindingIdentifier")
  })
  lazy val Identifier: ESParser[Identifier] = memo(args => {
    log((
      log(MATCH ~ nt("""(IdentifierName \ (ReservedWord))""", (IdentifierName \ (ReservedWord))) ^^ { case _ ~ x0 => Identifier0(x0, args) })("Identifier0")
    ))("Identifier")
  })
  lazy val AsyncArrowBindingIdentifier: ESParser[AsyncArrowBindingIdentifier] = memo(args => {
    val List(pYield) = getArgsN("AsyncArrowBindingIdentifier", args, 1)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, true)) ^^ { case _ ~ x0 => AsyncArrowBindingIdentifier0(x0, args) })("AsyncArrowBindingIdentifier0")
    ))("AsyncArrowBindingIdentifier")
  })
  lazy val LabelIdentifier: ESParser[LabelIdentifier] = memo(args => {
    val List(pYield, pAwait) = getArgsN("LabelIdentifier", args, 2)
    log((
      log(MATCH ~ Identifier(List()) ^^ { case _ ~ x0 => LabelIdentifier0(x0, args) })("LabelIdentifier0") |
      log((if (!pYield) (MATCH <~ t("yield")) ^^ { case _ => LabelIdentifier1(args) } else MISMATCH))("LabelIdentifier1") |
      log((if (!pAwait) (MATCH <~ t("await")) ^^ { case _ => LabelIdentifier2(args) } else MISMATCH))("LabelIdentifier2")
    ))("LabelIdentifier")
  })
  lazy val PrimaryExpression: ESParser[PrimaryExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("PrimaryExpression", args, 2)
    log((
      log((MATCH <~ t("this")) ^^ { case _ => PrimaryExpression0(args) })("PrimaryExpression0") |
      log(MATCH ~ IdentifierReference(List(pYield, pAwait)) ^^ { case _ ~ x0 => PrimaryExpression1(x0, args) })("PrimaryExpression1") |
      log(MATCH ~ Literal(List()) ^^ { case _ ~ x0 => PrimaryExpression2(x0, args) })("PrimaryExpression2") |
      log(MATCH ~ ArrayLiteral(List(pYield, pAwait)) ^^ { case _ ~ x0 => PrimaryExpression3(x0, args) })("PrimaryExpression3") |
      log(MATCH ~ ObjectLiteral(List(pYield, pAwait)) ^^ { case _ ~ x0 => PrimaryExpression4(x0, args) })("PrimaryExpression4") |
      log(MATCH ~ FunctionExpression(List()) ^^ { case _ ~ x0 => PrimaryExpression5(x0, args) })("PrimaryExpression5") |
      log(MATCH ~ ClassExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => PrimaryExpression6(x0, args) })("PrimaryExpression6") |
      log(MATCH ~ GeneratorExpression(List()) ^^ { case _ ~ x0 => PrimaryExpression7(x0, args) })("PrimaryExpression7") |
      log(MATCH ~ AsyncFunctionExpression(List()) ^^ { case _ ~ x0 => PrimaryExpression8(x0, args) })("PrimaryExpression8") |
      log(MATCH ~ AsyncGeneratorExpression(List()) ^^ { case _ ~ x0 => PrimaryExpression9(x0, args) })("PrimaryExpression9") |
      log(MATCH ~ nt("RegularExpressionLiteral", RegularExpressionLiteral) ^^ { case _ ~ x0 => PrimaryExpression10(x0, args) })("PrimaryExpression10") |
      log(MATCH ~ TemplateLiteral(List(pYield, pAwait, false)) ^^ { case _ ~ x0 => PrimaryExpression11(x0, args) })("PrimaryExpression11") |
      log(MATCH ~ CoverParenthesizedExpressionAndArrowParameterList(List(pYield, pAwait)) ^^ { case _ ~ x0 => PrimaryExpression12(x0, args) })("PrimaryExpression12")
    ))("PrimaryExpression")
  })
  lazy val CoverParenthesizedExpressionAndArrowParameterList: ESParser[CoverParenthesizedExpressionAndArrowParameterList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("CoverParenthesizedExpressionAndArrowParameterList", args, 2)
    log((
      log(((MATCH <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => CoverParenthesizedExpressionAndArrowParameterList0(x0, args) })("CoverParenthesizedExpressionAndArrowParameterList0") |
      log((((MATCH <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(",")) <~ t(")")) ^^ { case _ ~ x0 => CoverParenthesizedExpressionAndArrowParameterList1(x0, args) })("CoverParenthesizedExpressionAndArrowParameterList1") |
      log(((MATCH <~ t("(")) <~ t(")")) ^^ { case _ => CoverParenthesizedExpressionAndArrowParameterList2(args) })("CoverParenthesizedExpressionAndArrowParameterList2") |
      log((((MATCH <~ t("(")) <~ t("...")) ~ BindingIdentifier(List(pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => CoverParenthesizedExpressionAndArrowParameterList3(x0, args) })("CoverParenthesizedExpressionAndArrowParameterList3") |
      log((((MATCH <~ t("(")) <~ t("...")) ~ BindingPattern(List(pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => CoverParenthesizedExpressionAndArrowParameterList4(x0, args) })("CoverParenthesizedExpressionAndArrowParameterList4") |
      log(((((MATCH <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(",")) <~ t("...")) ~ BindingIdentifier(List(pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 ~ x1 => CoverParenthesizedExpressionAndArrowParameterList5(x0, x1, args) })("CoverParenthesizedExpressionAndArrowParameterList5") |
      log(((((MATCH <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(",")) <~ t("...")) ~ BindingPattern(List(pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 ~ x1 => CoverParenthesizedExpressionAndArrowParameterList6(x0, x1, args) })("CoverParenthesizedExpressionAndArrowParameterList6")
    ))("CoverParenthesizedExpressionAndArrowParameterList")
  })
  lazy val ParenthesizedExpression: ESParser[ParenthesizedExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ParenthesizedExpression", args, 2)
    log((
      log(((MATCH <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => ParenthesizedExpression0(x0, args) })("ParenthesizedExpression0")
    ))("ParenthesizedExpression")
  })
  lazy val Literal: ESParser[Literal] = memo(args => {
    log((
      log(MATCH ~ nt("NullLiteral", NullLiteral) ^^ { case _ ~ x0 => Literal0(x0, args) })("Literal0") |
      log(MATCH ~ nt("BooleanLiteral", BooleanLiteral) ^^ { case _ ~ x0 => Literal1(x0, args) })("Literal1") |
      log(MATCH ~ nt("NumericLiteral", NumericLiteral) ^^ { case _ ~ x0 => Literal2(x0, args) })("Literal2") |
      log(MATCH ~ nt("StringLiteral", StringLiteral) ^^ { case _ ~ x0 => Literal3(x0, args) })("Literal3")
    ))("Literal")
  })
  lazy val ArrayLiteral: ESParser[ArrayLiteral] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ArrayLiteral", args, 2)
    log((
      log(((MATCH <~ t("[")) ~ opt(Elision(List())) <~ t("]")) ^^ { case _ ~ x0 => ArrayLiteral0(x0, args) })("ArrayLiteral0") |
      log(((MATCH <~ t("[")) ~ ElementList(List(pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => ArrayLiteral1(x0, args) })("ArrayLiteral1") |
      log((((MATCH <~ t("[")) ~ ElementList(List(pYield, pAwait)) <~ t(",")) ~ opt(Elision(List())) <~ t("]")) ^^ { case _ ~ x0 ~ x1 => ArrayLiteral2(x0, x1, args) })("ArrayLiteral2")
    ))("ArrayLiteral")
  })
  lazy val ElementList: ESParser[ElementList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ElementList", args, 2)
    log(resolveLL(
      log(MATCH ~ opt(Elision(List())) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ElementList0(x0, x1, args) })("ElementList0") |
        log(MATCH ~ opt(Elision(List())) ~ SpreadElement(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ElementList1(x0, x1, args) })("ElementList1"),
      log((MATCH <~ t(",")) ~ opt(Elision(List())) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ((x: ElementList) => ElementList2(x, x0, x1, args)) })("ElementList2") |
        log((MATCH <~ t(",")) ~ opt(Elision(List())) ~ SpreadElement(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ((x: ElementList) => ElementList3(x, x0, x1, args)) })("ElementList3")
    ))("ElementList")
  })
  lazy val Elision: ESParser[Elision] = memo(args => {
    log(resolveLL(
      log((MATCH <~ t(",")) ^^ { case _ => Elision0(args) })("Elision0"),
      log((MATCH <~ t(",")) ^^ { case _ => ((x: Elision) => Elision1(x, args)) })("Elision1")
    ))("Elision")
  })
  lazy val SpreadElement: ESParser[SpreadElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("SpreadElement", args, 2)
    log((
      log((MATCH <~ t("...")) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => SpreadElement0(x0, args) })("SpreadElement0")
    ))("SpreadElement")
  })
  lazy val ObjectLiteral: ESParser[ObjectLiteral] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ObjectLiteral", args, 2)
    log((
      log(((MATCH <~ t("{")) <~ t("}")) ^^ { case _ => ObjectLiteral0(args) })("ObjectLiteral0") |
      log(((MATCH <~ t("{")) ~ PropertyDefinitionList(List(pYield, pAwait)) <~ t("}")) ^^ { case _ ~ x0 => ObjectLiteral1(x0, args) })("ObjectLiteral1") |
      log((((MATCH <~ t("{")) ~ PropertyDefinitionList(List(pYield, pAwait)) <~ t(",")) <~ t("}")) ^^ { case _ ~ x0 => ObjectLiteral2(x0, args) })("ObjectLiteral2")
    ))("ObjectLiteral")
  })
  lazy val PropertyDefinitionList: ESParser[PropertyDefinitionList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("PropertyDefinitionList", args, 2)
    log(resolveLL(
      log(MATCH ~ PropertyDefinition(List(pYield, pAwait)) ^^ { case _ ~ x0 => PropertyDefinitionList0(x0, args) })("PropertyDefinitionList0"),
      log((MATCH <~ t(",")) ~ PropertyDefinition(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: PropertyDefinitionList) => PropertyDefinitionList1(x, x0, args)) })("PropertyDefinitionList1")
    ))("PropertyDefinitionList")
  })
  lazy val PropertyDefinition: ESParser[PropertyDefinition] = memo(args => {
    val List(pYield, pAwait) = getArgsN("PropertyDefinition", args, 2)
    log((
      log(MATCH ~ IdentifierReference(List(pYield, pAwait)) ^^ { case _ ~ x0 => PropertyDefinition0(x0, args) })("PropertyDefinition0") |
      log(MATCH ~ CoverInitializedName(List(pYield, pAwait)) ^^ { case _ ~ x0 => PropertyDefinition1(x0, args) })("PropertyDefinition1") |
      log((MATCH ~ PropertyName(List(pYield, pAwait)) <~ t(":")) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => PropertyDefinition2(x0, x1, args) })("PropertyDefinition2") |
      log(MATCH ~ MethodDefinition(List(pYield, pAwait)) ^^ { case _ ~ x0 => PropertyDefinition3(x0, args) })("PropertyDefinition3") |
      log((MATCH <~ t("...")) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => PropertyDefinition4(x0, args) })("PropertyDefinition4")
    ))("PropertyDefinition")
  })
  lazy val PropertyName: ESParser[PropertyName] = memo(args => {
    val List(pYield, pAwait) = getArgsN("PropertyName", args, 2)
    log((
      log(MATCH ~ LiteralPropertyName(List()) ^^ { case _ ~ x0 => PropertyName0(x0, args) })("PropertyName0") |
      log(MATCH ~ ComputedPropertyName(List(pYield, pAwait)) ^^ { case _ ~ x0 => PropertyName1(x0, args) })("PropertyName1")
    ))("PropertyName")
  })
  lazy val LiteralPropertyName: ESParser[LiteralPropertyName] = memo(args => {
    log((
      log(MATCH ~ nt("IdentifierName", IdentifierName) ^^ { case _ ~ x0 => LiteralPropertyName0(x0, args) })("LiteralPropertyName0") |
      log(MATCH ~ nt("StringLiteral", StringLiteral) ^^ { case _ ~ x0 => LiteralPropertyName1(x0, args) })("LiteralPropertyName1") |
      log(MATCH ~ nt("NumericLiteral", NumericLiteral) ^^ { case _ ~ x0 => LiteralPropertyName2(x0, args) })("LiteralPropertyName2")
    ))("LiteralPropertyName")
  })
  lazy val ComputedPropertyName: ESParser[ComputedPropertyName] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ComputedPropertyName", args, 2)
    log((
      log(((MATCH <~ t("[")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => ComputedPropertyName0(x0, args) })("ComputedPropertyName0")
    ))("ComputedPropertyName")
  })
  lazy val CoverInitializedName: ESParser[CoverInitializedName] = memo(args => {
    val List(pYield, pAwait) = getArgsN("CoverInitializedName", args, 2)
    log((
      log(MATCH ~ IdentifierReference(List(pYield, pAwait)) ~ Initializer(List(true, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => CoverInitializedName0(x0, x1, args) })("CoverInitializedName0")
    ))("CoverInitializedName")
  })
  lazy val Initializer: ESParser[Initializer] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("Initializer", args, 3)
    log((
      log((MATCH <~ t("=")) ~ AssignmentExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => Initializer0(x0, args) })("Initializer0")
    ))("Initializer")
  })
  lazy val TemplateLiteral: ESParser[TemplateLiteral] = memo(args => {
    val List(pYield, pAwait, pTagged) = getArgsN("TemplateLiteral", args, 3)
    log((
      log(MATCH ~ nt("NoSubstitutionTemplate", NoSubstitutionTemplate) ^^ { case _ ~ x0 => TemplateLiteral0(x0, args) })("TemplateLiteral0") |
      log(MATCH ~ SubstitutionTemplate(List(pYield, pAwait, pTagged)) ^^ { case _ ~ x0 => TemplateLiteral1(x0, args) })("TemplateLiteral1")
    ))("TemplateLiteral")
  })
  lazy val SubstitutionTemplate: ESParser[SubstitutionTemplate] = memo(args => {
    val List(pYield, pAwait, pTagged) = getArgsN("SubstitutionTemplate", args, 3)
    log((
      log(MATCH ~ nt("TemplateHead", TemplateHead) ~ Expression(List(true, pYield, pAwait)) ~ TemplateSpans(List(pYield, pAwait, pTagged)) ^^ { case _ ~ x0 ~ x1 ~ x2 => SubstitutionTemplate0(x0, x1, x2, args) })("SubstitutionTemplate0")
    ))("SubstitutionTemplate")
  })
  lazy val TemplateSpans: ESParser[TemplateSpans] = memo(args => {
    val List(pYield, pAwait, pTagged) = getArgsN("TemplateSpans", args, 3)
    log((
      log(MATCH ~ nt("TemplateTail", TemplateTail) ^^ { case _ ~ x0 => TemplateSpans0(x0, args) })("TemplateSpans0") |
      log(MATCH ~ TemplateMiddleList(List(pYield, pAwait, pTagged)) ~ nt("TemplateTail", TemplateTail) ^^ { case _ ~ x0 ~ x1 => TemplateSpans1(x0, x1, args) })("TemplateSpans1")
    ))("TemplateSpans")
  })
  lazy val TemplateMiddleList: ESParser[TemplateMiddleList] = memo(args => {
    val List(pYield, pAwait, pTagged) = getArgsN("TemplateMiddleList", args, 3)
    log(resolveLL(
      log(MATCH ~ nt("TemplateMiddle", TemplateMiddle) ~ Expression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => TemplateMiddleList0(x0, x1, args) })("TemplateMiddleList0"),
      log(MATCH ~ nt("TemplateMiddle", TemplateMiddle) ~ Expression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ((x: TemplateMiddleList) => TemplateMiddleList1(x, x0, x1, args)) })("TemplateMiddleList1")
    ))("TemplateMiddleList")
  })
  lazy val MemberExpression: ESParser[MemberExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("MemberExpression", args, 2)
    log(resolveLL(
      log(MATCH ~ PrimaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => MemberExpression0(x0, args) })("MemberExpression0") |
        log(MATCH ~ SuperProperty(List(pYield, pAwait)) ^^ { case _ ~ x0 => MemberExpression4(x0, args) })("MemberExpression4") |
        log(MATCH ~ MetaProperty(List()) ^^ { case _ ~ x0 => MemberExpression5(x0, args) })("MemberExpression5") |
        log((MATCH <~ t("new")) ~ MemberExpression(List(pYield, pAwait)) ~ Arguments(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => MemberExpression6(x0, x1, args) })("MemberExpression6"),
      log(((MATCH <~ t("[")) ~ Expression(List(true, pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => ((x: MemberExpression) => MemberExpression1(x, x0, args)) })("MemberExpression1") |
        log((MATCH <~ t(".")) ~ nt("IdentifierName", IdentifierName) ^^ { case _ ~ x0 => ((x: MemberExpression) => MemberExpression2(x, x0, args)) })("MemberExpression2") |
        log(MATCH ~ TemplateLiteral(List(pYield, pAwait, true)) ^^ { case _ ~ x0 => ((x: MemberExpression) => MemberExpression3(x, x0, args)) })("MemberExpression3")
    ))("MemberExpression")
  })
  lazy val SuperProperty: ESParser[SuperProperty] = memo(args => {
    val List(pYield, pAwait) = getArgsN("SuperProperty", args, 2)
    log((
      log((((MATCH <~ t("super")) <~ t("[")) ~ Expression(List(true, pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => SuperProperty0(x0, args) })("SuperProperty0") |
      log(((MATCH <~ t("super")) <~ t(".")) ~ nt("IdentifierName", IdentifierName) ^^ { case _ ~ x0 => SuperProperty1(x0, args) })("SuperProperty1")
    ))("SuperProperty")
  })
  lazy val MetaProperty: ESParser[MetaProperty] = memo(args => {
    log((
      log(MATCH ~ NewTarget(List()) ^^ { case _ ~ x0 => MetaProperty0(x0, args) })("MetaProperty0")
    ))("MetaProperty")
  })
  lazy val NewTarget: ESParser[NewTarget] = memo(args => {
    log((
      log((((MATCH <~ t("new")) <~ t(".")) <~ t("target")) ^^ { case _ => NewTarget0(args) })("NewTarget0")
    ))("NewTarget")
  })
  lazy val NewExpression: ESParser[NewExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("NewExpression", args, 2)
    log((
      log(MATCH ~ MemberExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => NewExpression0(x0, args) })("NewExpression0") |
      log((MATCH <~ t("new")) ~ NewExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => NewExpression1(x0, args) })("NewExpression1")
    ))("NewExpression")
  })
  lazy val CallExpression: ESParser[CallExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("CallExpression", args, 2)
    log(resolveLL(
      log(MATCH ~ CoverCallExpressionAndAsyncArrowHead(List(pYield, pAwait)) ^^ { case _ ~ x0 => CallExpression0(x0, args) })("CallExpression0") |
        log(MATCH ~ SuperCall(List(pYield, pAwait)) ^^ { case _ ~ x0 => CallExpression1(x0, args) })("CallExpression1") |
        log(MATCH ~ ImportCall(List(pYield, pAwait)) ^^ { case _ ~ x0 => CallExpression2(x0, args) })("CallExpression2"),
      log(MATCH ~ Arguments(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: CallExpression) => CallExpression3(x, x0, args)) })("CallExpression3") |
        log(((MATCH <~ t("[")) ~ Expression(List(true, pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => ((x: CallExpression) => CallExpression4(x, x0, args)) })("CallExpression4") |
        log((MATCH <~ t(".")) ~ nt("IdentifierName", IdentifierName) ^^ { case _ ~ x0 => ((x: CallExpression) => CallExpression5(x, x0, args)) })("CallExpression5") |
        log(MATCH ~ TemplateLiteral(List(pYield, pAwait, true)) ^^ { case _ ~ x0 => ((x: CallExpression) => CallExpression6(x, x0, args)) })("CallExpression6")
    ))("CallExpression")
  })
  lazy val CoverCallExpressionAndAsyncArrowHead: ESParser[CoverCallExpressionAndAsyncArrowHead] = memo(args => {
    val List(pYield, pAwait) = getArgsN("CoverCallExpressionAndAsyncArrowHead", args, 2)
    log((
      log(MATCH ~ MemberExpression(List(pYield, pAwait)) ~ Arguments(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => CoverCallExpressionAndAsyncArrowHead0(x0, x1, args) })("CoverCallExpressionAndAsyncArrowHead0")
    ))("CoverCallExpressionAndAsyncArrowHead")
  })
  lazy val CallMemberExpression: ESParser[CallMemberExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("CallMemberExpression", args, 2)
    log((
      log(MATCH ~ MemberExpression(List(pYield, pAwait)) ~ Arguments(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => CallMemberExpression0(x0, x1, args) })("CallMemberExpression0")
    ))("CallMemberExpression")
  })
  lazy val SuperCall: ESParser[SuperCall] = memo(args => {
    val List(pYield, pAwait) = getArgsN("SuperCall", args, 2)
    log((
      log((MATCH <~ t("super")) ~ Arguments(List(pYield, pAwait)) ^^ { case _ ~ x0 => SuperCall0(x0, args) })("SuperCall0")
    ))("SuperCall")
  })
  lazy val ImportCall: ESParser[ImportCall] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ImportCall", args, 2)
    log((
      log((((MATCH <~ t("import")) <~ t("(")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => ImportCall0(x0, args) })("ImportCall0")
    ))("ImportCall")
  })
  lazy val Arguments: ESParser[Arguments] = memo(args => {
    val List(pYield, pAwait) = getArgsN("Arguments", args, 2)
    log((
      log(((MATCH <~ t("(")) <~ t(")")) ^^ { case _ => Arguments0(args) })("Arguments0") |
      log(((MATCH <~ t("(")) ~ ArgumentList(List(pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => Arguments1(x0, args) })("Arguments1") |
      log((((MATCH <~ t("(")) ~ ArgumentList(List(pYield, pAwait)) <~ t(",")) <~ t(")")) ^^ { case _ ~ x0 => Arguments2(x0, args) })("Arguments2")
    ))("Arguments")
  })
  lazy val ArgumentList: ESParser[ArgumentList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ArgumentList", args, 2)
    log(resolveLL(
      log(MATCH ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => ArgumentList0(x0, args) })("ArgumentList0") |
        log((MATCH <~ t("...")) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => ArgumentList1(x0, args) })("ArgumentList1"),
      log((MATCH <~ t(",")) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: ArgumentList) => ArgumentList2(x, x0, args)) })("ArgumentList2") |
        log(((MATCH <~ t(",")) <~ t("...")) ~ AssignmentExpression(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: ArgumentList) => ArgumentList3(x, x0, args)) })("ArgumentList3")
    ))("ArgumentList")
  })
  lazy val LeftHandSideExpression: ESParser[LeftHandSideExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("LeftHandSideExpression", args, 2)
    log((
      log(MATCH ~ NewExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => LeftHandSideExpression0(x0, args) })("LeftHandSideExpression0") |
      log(MATCH ~ CallExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => LeftHandSideExpression1(x0, args) })("LeftHandSideExpression1")
    ))("LeftHandSideExpression")
  })
  lazy val UpdateExpression: ESParser[UpdateExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("UpdateExpression", args, 2)
    log((
      log(MATCH ~ LeftHandSideExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UpdateExpression0(x0, args) })("UpdateExpression0") |
      log(((MATCH ~ LeftHandSideExpression(List(pYield, pAwait)) <~ NoLineTerminator) <~ t("++")) ^^ { case _ ~ x0 => UpdateExpression1(x0, args) })("UpdateExpression1") |
      log(((MATCH ~ LeftHandSideExpression(List(pYield, pAwait)) <~ NoLineTerminator) <~ t("--")) ^^ { case _ ~ x0 => UpdateExpression2(x0, args) })("UpdateExpression2") |
      log((MATCH <~ t("++")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UpdateExpression3(x0, args) })("UpdateExpression3") |
      log((MATCH <~ t("--")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UpdateExpression4(x0, args) })("UpdateExpression4")
    ))("UpdateExpression")
  })
  lazy val UnaryExpression: ESParser[UnaryExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("UnaryExpression", args, 2)
    log((
      log(MATCH ~ UpdateExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression0(x0, args) })("UnaryExpression0") |
      log((MATCH <~ t("delete")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression1(x0, args) })("UnaryExpression1") |
      log((MATCH <~ t("void")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression2(x0, args) })("UnaryExpression2") |
      log((MATCH <~ t("typeof")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression3(x0, args) })("UnaryExpression3") |
      log((MATCH <~ t("+")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression4(x0, args) })("UnaryExpression4") |
      log((MATCH <~ t("-")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression5(x0, args) })("UnaryExpression5") |
      log((MATCH <~ t("~")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression6(x0, args) })("UnaryExpression6") |
      log((MATCH <~ t("!")) ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => UnaryExpression7(x0, args) })("UnaryExpression7") |
      log((if (pAwait) MATCH ~ AwaitExpression(List(pYield)) ^^ { case _ ~ x0 => UnaryExpression8(x0, args) } else MISMATCH))("UnaryExpression8")
    ))("UnaryExpression")
  })
  lazy val ExponentiationExpression: ESParser[ExponentiationExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ExponentiationExpression", args, 2)
    log((
      log(MATCH ~ UnaryExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ExponentiationExpression0(x0, args) })("ExponentiationExpression0") |
      log((MATCH ~ UpdateExpression(List(pYield, pAwait)) <~ t("**")) ~ ExponentiationExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ExponentiationExpression1(x0, x1, args) })("ExponentiationExpression1")
    ))("ExponentiationExpression")
  })
  lazy val MultiplicativeExpression: ESParser[MultiplicativeExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("MultiplicativeExpression", args, 2)
    log(resolveLL(
      log(MATCH ~ ExponentiationExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => MultiplicativeExpression0(x0, args) })("MultiplicativeExpression0"),
      log(MATCH ~ MultiplicativeOperator(List()) ~ ExponentiationExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ((x: MultiplicativeExpression) => MultiplicativeExpression1(x, x0, x1, args)) })("MultiplicativeExpression1")
    ))("MultiplicativeExpression")
  })
  lazy val MultiplicativeOperator: ESParser[MultiplicativeOperator] = memo(args => {
    log((
      log((MATCH <~ t("*")) ^^ { case _ => MultiplicativeOperator0(args) })("MultiplicativeOperator0") |
      log((MATCH <~ t("/")) ^^ { case _ => MultiplicativeOperator1(args) })("MultiplicativeOperator1") |
      log((MATCH <~ t("%")) ^^ { case _ => MultiplicativeOperator2(args) })("MultiplicativeOperator2")
    ))("MultiplicativeOperator")
  })
  lazy val AdditiveExpression: ESParser[AdditiveExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AdditiveExpression", args, 2)
    log(resolveLL(
      log(MATCH ~ MultiplicativeExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => AdditiveExpression0(x0, args) })("AdditiveExpression0"),
      log((MATCH <~ t("+")) ~ MultiplicativeExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: AdditiveExpression) => AdditiveExpression1(x, x0, args)) })("AdditiveExpression1") |
        log((MATCH <~ t("-")) ~ MultiplicativeExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: AdditiveExpression) => AdditiveExpression2(x, x0, args)) })("AdditiveExpression2")
    ))("AdditiveExpression")
  })
  lazy val ShiftExpression: ESParser[ShiftExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ShiftExpression", args, 2)
    log(resolveLL(
      log(MATCH ~ AdditiveExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ShiftExpression0(x0, args) })("ShiftExpression0"),
      log((MATCH <~ t("<<")) ~ AdditiveExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: ShiftExpression) => ShiftExpression1(x, x0, args)) })("ShiftExpression1") |
        log((MATCH <~ t(">>")) ~ AdditiveExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: ShiftExpression) => ShiftExpression2(x, x0, args)) })("ShiftExpression2") |
        log((MATCH <~ t(">>>")) ~ AdditiveExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: ShiftExpression) => ShiftExpression3(x, x0, args)) })("ShiftExpression3")
    ))("ShiftExpression")
  })
  lazy val RelationalExpression: ESParser[RelationalExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("RelationalExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => RelationalExpression0(x0, args) })("RelationalExpression0"),
      log((MATCH <~ t("<")) ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: RelationalExpression) => RelationalExpression1(x, x0, args)) })("RelationalExpression1") |
        log((MATCH <~ t(">")) ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: RelationalExpression) => RelationalExpression2(x, x0, args)) })("RelationalExpression2") |
        log((MATCH <~ t("<=")) ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: RelationalExpression) => RelationalExpression3(x, x0, args)) })("RelationalExpression3") |
        log((MATCH <~ t(">=")) ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: RelationalExpression) => RelationalExpression4(x, x0, args)) })("RelationalExpression4") |
        log((MATCH <~ t("instanceof")) ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: RelationalExpression) => RelationalExpression5(x, x0, args)) })("RelationalExpression5") |
        log((if (pIn) (MATCH <~ t("in")) ~ ShiftExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: RelationalExpression) => RelationalExpression6(x, x0, args)) } else MISMATCH))("RelationalExpression6")
    ))("RelationalExpression")
  })
  lazy val EqualityExpression: ESParser[EqualityExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("EqualityExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ RelationalExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => EqualityExpression0(x0, args) })("EqualityExpression0"),
      log((MATCH <~ t("==")) ~ RelationalExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: EqualityExpression) => EqualityExpression1(x, x0, args)) })("EqualityExpression1") |
        log((MATCH <~ t("!=")) ~ RelationalExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: EqualityExpression) => EqualityExpression2(x, x0, args)) })("EqualityExpression2") |
        log((MATCH <~ t("===")) ~ RelationalExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: EqualityExpression) => EqualityExpression3(x, x0, args)) })("EqualityExpression3") |
        log((MATCH <~ t("!==")) ~ RelationalExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: EqualityExpression) => EqualityExpression4(x, x0, args)) })("EqualityExpression4")
    ))("EqualityExpression")
  })
  lazy val BitwiseANDExpression: ESParser[BitwiseANDExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("BitwiseANDExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ EqualityExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => BitwiseANDExpression0(x0, args) })("BitwiseANDExpression0"),
      log((MATCH <~ t("&")) ~ EqualityExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: BitwiseANDExpression) => BitwiseANDExpression1(x, x0, args)) })("BitwiseANDExpression1")
    ))("BitwiseANDExpression")
  })
  lazy val BitwiseXORExpression: ESParser[BitwiseXORExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("BitwiseXORExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ BitwiseANDExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => BitwiseXORExpression0(x0, args) })("BitwiseXORExpression0"),
      log((MATCH <~ t("^")) ~ BitwiseANDExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: BitwiseXORExpression) => BitwiseXORExpression1(x, x0, args)) })("BitwiseXORExpression1")
    ))("BitwiseXORExpression")
  })
  lazy val BitwiseORExpression: ESParser[BitwiseORExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("BitwiseORExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ BitwiseXORExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => BitwiseORExpression0(x0, args) })("BitwiseORExpression0"),
      log((MATCH <~ t("|")) ~ BitwiseXORExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: BitwiseORExpression) => BitwiseORExpression1(x, x0, args)) })("BitwiseORExpression1")
    ))("BitwiseORExpression")
  })
  lazy val LogicalANDExpression: ESParser[LogicalANDExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("LogicalANDExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ BitwiseORExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => LogicalANDExpression0(x0, args) })("LogicalANDExpression0"),
      log((MATCH <~ t("&&")) ~ BitwiseORExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: LogicalANDExpression) => LogicalANDExpression1(x, x0, args)) })("LogicalANDExpression1")
    ))("LogicalANDExpression")
  })
  lazy val LogicalORExpression: ESParser[LogicalORExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("LogicalORExpression", args, 3)
    log(resolveLL(
      log(MATCH ~ LogicalANDExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => LogicalORExpression0(x0, args) })("LogicalORExpression0"),
      log((MATCH <~ t("||")) ~ LogicalANDExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: LogicalORExpression) => LogicalORExpression1(x, x0, args)) })("LogicalORExpression1")
    ))("LogicalORExpression")
  })
  lazy val ConditionalExpression: ESParser[ConditionalExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("ConditionalExpression", args, 3)
    log((
      log(MATCH ~ LogicalORExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ConditionalExpression0(x0, args) })("ConditionalExpression0") |
      log(((MATCH ~ LogicalORExpression(List(pIn, pYield, pAwait)) <~ t("?")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(":")) ~ AssignmentExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 ~ x2 => ConditionalExpression1(x0, x1, x2, args) })("ConditionalExpression1")
    ))("ConditionalExpression")
  })
  lazy val AssignmentExpression: ESParser[AssignmentExpression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("AssignmentExpression", args, 3)
    log((
      log(MATCH ~ ConditionalExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentExpression0(x0, args) })("AssignmentExpression0") |
      log((if (pYield) MATCH ~ YieldExpression(List(pIn, pAwait)) ^^ { case _ ~ x0 => AssignmentExpression1(x0, args) } else MISMATCH))("AssignmentExpression1") |
      log(MATCH ~ ArrowFunction(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentExpression2(x0, args) })("AssignmentExpression2") |
      log(MATCH ~ AsyncArrowFunction(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentExpression3(x0, args) })("AssignmentExpression3") |
      log((MATCH ~ LeftHandSideExpression(List(pYield, pAwait)) <~ t("=")) ~ AssignmentExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => AssignmentExpression4(x0, x1, args) })("AssignmentExpression4") |
      log(MATCH ~ LeftHandSideExpression(List(pYield, pAwait)) ~ AssignmentOperator(List()) ~ AssignmentExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 ~ x2 => AssignmentExpression5(x0, x1, x2, args) })("AssignmentExpression5")
    ))("AssignmentExpression")
  })
  lazy val AssignmentPattern: ESParser[AssignmentPattern] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentPattern", args, 2)
    log((
      log(MATCH ~ ObjectAssignmentPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentPattern0(x0, args) })("AssignmentPattern0") |
      log(MATCH ~ ArrayAssignmentPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentPattern1(x0, args) })("AssignmentPattern1")
    ))("AssignmentPattern")
  })
  lazy val ObjectAssignmentPattern: ESParser[ObjectAssignmentPattern] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ObjectAssignmentPattern", args, 2)
    log((
      log(((MATCH <~ t("{")) <~ t("}")) ^^ { case _ => ObjectAssignmentPattern0(args) })("ObjectAssignmentPattern0") |
      log(((MATCH <~ t("{")) ~ AssignmentRestProperty(List(pYield, pAwait)) <~ t("}")) ^^ { case _ ~ x0 => ObjectAssignmentPattern1(x0, args) })("ObjectAssignmentPattern1") |
      log(((MATCH <~ t("{")) ~ AssignmentPropertyList(List(pYield, pAwait)) <~ t("}")) ^^ { case _ ~ x0 => ObjectAssignmentPattern2(x0, args) })("ObjectAssignmentPattern2") |
      log((((MATCH <~ t("{")) ~ AssignmentPropertyList(List(pYield, pAwait)) <~ t(",")) ~ opt(AssignmentRestProperty(List(pYield, pAwait))) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => ObjectAssignmentPattern3(x0, x1, args) })("ObjectAssignmentPattern3")
    ))("ObjectAssignmentPattern")
  })
  lazy val ArrayAssignmentPattern: ESParser[ArrayAssignmentPattern] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ArrayAssignmentPattern", args, 2)
    log((
      log(((MATCH <~ t("[")) ~ opt(Elision(List())) ~ opt(AssignmentRestElement(List(pYield, pAwait))) <~ t("]")) ^^ { case _ ~ x0 ~ x1 => ArrayAssignmentPattern0(x0, x1, args) })("ArrayAssignmentPattern0") |
      log(((MATCH <~ t("[")) ~ AssignmentElementList(List(pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => ArrayAssignmentPattern1(x0, args) })("ArrayAssignmentPattern1") |
      log((((MATCH <~ t("[")) ~ AssignmentElementList(List(pYield, pAwait)) <~ t(",")) ~ opt(Elision(List())) ~ opt(AssignmentRestElement(List(pYield, pAwait))) <~ t("]")) ^^ { case _ ~ x0 ~ x1 ~ x2 => ArrayAssignmentPattern2(x0, x1, x2, args) })("ArrayAssignmentPattern2")
    ))("ArrayAssignmentPattern")
  })
  lazy val AssignmentRestProperty: ESParser[AssignmentRestProperty] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentRestProperty", args, 2)
    log((
      log((MATCH <~ t("...")) ~ DestructuringAssignmentTarget(List(pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentRestProperty0(x0, args) })("AssignmentRestProperty0")
    ))("AssignmentRestProperty")
  })
  lazy val AssignmentPropertyList: ESParser[AssignmentPropertyList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentPropertyList", args, 2)
    log(resolveLL(
      log(MATCH ~ AssignmentProperty(List(pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentPropertyList0(x0, args) })("AssignmentPropertyList0"),
      log((MATCH <~ t(",")) ~ AssignmentProperty(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: AssignmentPropertyList) => AssignmentPropertyList1(x, x0, args)) })("AssignmentPropertyList1")
    ))("AssignmentPropertyList")
  })
  lazy val AssignmentElementList: ESParser[AssignmentElementList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentElementList", args, 2)
    log(resolveLL(
      log(MATCH ~ AssignmentElisionElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentElementList0(x0, args) })("AssignmentElementList0"),
      log((MATCH <~ t(",")) ~ AssignmentElisionElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: AssignmentElementList) => AssignmentElementList1(x, x0, args)) })("AssignmentElementList1")
    ))("AssignmentElementList")
  })
  lazy val AssignmentElisionElement: ESParser[AssignmentElisionElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentElisionElement", args, 2)
    log((
      log(MATCH ~ opt(Elision(List())) ~ AssignmentElement(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => AssignmentElisionElement0(x0, x1, args) })("AssignmentElisionElement0")
    ))("AssignmentElisionElement")
  })
  lazy val AssignmentProperty: ESParser[AssignmentProperty] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentProperty", args, 2)
    log((
      log(MATCH ~ IdentifierReference(List(pYield, pAwait)) ~ opt(Initializer(List(true, pYield, pAwait))) ^^ { case _ ~ x0 ~ x1 => AssignmentProperty0(x0, x1, args) })("AssignmentProperty0") |
      log((MATCH ~ PropertyName(List(pYield, pAwait)) <~ t(":")) ~ AssignmentElement(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => AssignmentProperty1(x0, x1, args) })("AssignmentProperty1")
    ))("AssignmentProperty")
  })
  lazy val AssignmentElement: ESParser[AssignmentElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentElement", args, 2)
    log((
      log(MATCH ~ DestructuringAssignmentTarget(List(pYield, pAwait)) ~ opt(Initializer(List(true, pYield, pAwait))) ^^ { case _ ~ x0 ~ x1 => AssignmentElement0(x0, x1, args) })("AssignmentElement0")
    ))("AssignmentElement")
  })
  lazy val AssignmentRestElement: ESParser[AssignmentRestElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AssignmentRestElement", args, 2)
    log((
      log((MATCH <~ t("...")) ~ DestructuringAssignmentTarget(List(pYield, pAwait)) ^^ { case _ ~ x0 => AssignmentRestElement0(x0, args) })("AssignmentRestElement0")
    ))("AssignmentRestElement")
  })
  lazy val DestructuringAssignmentTarget: ESParser[DestructuringAssignmentTarget] = memo(args => {
    val List(pYield, pAwait) = getArgsN("DestructuringAssignmentTarget", args, 2)
    log((
      log(MATCH ~ LeftHandSideExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => DestructuringAssignmentTarget0(x0, args) })("DestructuringAssignmentTarget0")
    ))("DestructuringAssignmentTarget")
  })
  lazy val AssignmentOperator: ESParser[AssignmentOperator] = memo(args => {
    log((
      log((MATCH <~ t("*=")) ^^ { case _ => AssignmentOperator0(args) })("AssignmentOperator0") |
      log((MATCH <~ t("/=")) ^^ { case _ => AssignmentOperator1(args) })("AssignmentOperator1") |
      log((MATCH <~ t("%=")) ^^ { case _ => AssignmentOperator2(args) })("AssignmentOperator2") |
      log((MATCH <~ t("+=")) ^^ { case _ => AssignmentOperator3(args) })("AssignmentOperator3") |
      log((MATCH <~ t("-=")) ^^ { case _ => AssignmentOperator4(args) })("AssignmentOperator4") |
      log((MATCH <~ t("<<=")) ^^ { case _ => AssignmentOperator5(args) })("AssignmentOperator5") |
      log((MATCH <~ t(">>=")) ^^ { case _ => AssignmentOperator6(args) })("AssignmentOperator6") |
      log((MATCH <~ t(">>>=")) ^^ { case _ => AssignmentOperator7(args) })("AssignmentOperator7") |
      log((MATCH <~ t("&=")) ^^ { case _ => AssignmentOperator8(args) })("AssignmentOperator8") |
      log((MATCH <~ t("^=")) ^^ { case _ => AssignmentOperator9(args) })("AssignmentOperator9") |
      log((MATCH <~ t("|=")) ^^ { case _ => AssignmentOperator10(args) })("AssignmentOperator10") |
      log((MATCH <~ t("**=")) ^^ { case _ => AssignmentOperator11(args) })("AssignmentOperator11")
    ))("AssignmentOperator")
  })
  lazy val Expression: ESParser[Expression] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("Expression", args, 3)
    log(resolveLL(
      log(MATCH ~ AssignmentExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => Expression0(x0, args) })("Expression0"),
      log((MATCH <~ t(",")) ~ AssignmentExpression(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: Expression) => Expression1(x, x0, args)) })("Expression1")
    ))("Expression")
  })
  lazy val Statement: ESParser[Statement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("Statement", args, 3)
    log((
      log(MATCH ~ BlockStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Statement0(x0, args) })("Statement0") |
      log(MATCH ~ VariableStatement(List(pYield, pAwait)) ^^ { case _ ~ x0 => Statement1(x0, args) })("Statement1") |
      log(MATCH ~ EmptyStatement(List()) ^^ { case _ ~ x0 => Statement2(x0, args) })("Statement2") |
      log(MATCH ~ ExpressionStatement(List(pYield, pAwait)) ^^ { case _ ~ x0 => Statement3(x0, args) })("Statement3") |
      log(MATCH ~ IfStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Statement4(x0, args) })("Statement4") |
      log(MATCH ~ BreakableStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Statement5(x0, args) })("Statement5") |
      log(MATCH ~ ContinueStatement(List(pYield, pAwait)) ^^ { case _ ~ x0 => Statement6(x0, args) })("Statement6") |
      log(MATCH ~ BreakStatement(List(pYield, pAwait)) ^^ { case _ ~ x0 => Statement7(x0, args) })("Statement7") |
      log((if (pReturn) MATCH ~ ReturnStatement(List(pYield, pAwait)) ^^ { case _ ~ x0 => Statement8(x0, args) } else MISMATCH))("Statement8") |
      log(MATCH ~ WithStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Statement9(x0, args) })("Statement9") |
      log(MATCH ~ LabelledStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Statement10(x0, args) })("Statement10") |
      log(MATCH ~ ThrowStatement(List(pYield, pAwait)) ^^ { case _ ~ x0 => Statement11(x0, args) })("Statement11") |
      log(MATCH ~ TryStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Statement12(x0, args) })("Statement12") |
      log(MATCH ~ DebuggerStatement(List()) ^^ { case _ ~ x0 => Statement13(x0, args) })("Statement13")
    ))("Statement")
  })
  lazy val Declaration: ESParser[Declaration] = memo(args => {
    val List(pYield, pAwait) = getArgsN("Declaration", args, 2)
    log((
      log(MATCH ~ HoistableDeclaration(List(pYield, pAwait, false)) ^^ { case _ ~ x0 => Declaration0(x0, args) })("Declaration0") |
      log(MATCH ~ ClassDeclaration(List(pYield, pAwait, false)) ^^ { case _ ~ x0 => Declaration1(x0, args) })("Declaration1") |
      log(MATCH ~ LexicalDeclaration(List(true, pYield, pAwait)) ^^ { case _ ~ x0 => Declaration2(x0, args) })("Declaration2")
    ))("Declaration")
  })
  lazy val HoistableDeclaration: ESParser[HoistableDeclaration] = memo(args => {
    val List(pYield, pAwait, pDefault) = getArgsN("HoistableDeclaration", args, 3)
    log((
      log(MATCH ~ FunctionDeclaration(List(pYield, pAwait, pDefault)) ^^ { case _ ~ x0 => HoistableDeclaration0(x0, args) })("HoistableDeclaration0") |
      log(MATCH ~ GeneratorDeclaration(List(pYield, pAwait, pDefault)) ^^ { case _ ~ x0 => HoistableDeclaration1(x0, args) })("HoistableDeclaration1") |
      log(MATCH ~ AsyncFunctionDeclaration(List(pYield, pAwait, pDefault)) ^^ { case _ ~ x0 => HoistableDeclaration2(x0, args) })("HoistableDeclaration2") |
      log(MATCH ~ AsyncGeneratorDeclaration(List(pYield, pAwait, pDefault)) ^^ { case _ ~ x0 => HoistableDeclaration3(x0, args) })("HoistableDeclaration3")
    ))("HoistableDeclaration")
  })
  lazy val BreakableStatement: ESParser[BreakableStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("BreakableStatement", args, 3)
    log((
      log(MATCH ~ IterationStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => BreakableStatement0(x0, args) })("BreakableStatement0") |
      log(MATCH ~ SwitchStatement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => BreakableStatement1(x0, args) })("BreakableStatement1")
    ))("BreakableStatement")
  })
  lazy val BlockStatement: ESParser[BlockStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("BlockStatement", args, 3)
    log((
      log(MATCH ~ Block(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => BlockStatement0(x0, args) })("BlockStatement0")
    ))("BlockStatement")
  })
  lazy val Block: ESParser[Block] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("Block", args, 3)
    log((
      log(((MATCH <~ t("{")) ~ opt(StatementList(List(pYield, pAwait, pReturn))) <~ t("}")) ^^ { case _ ~ x0 => Block0(x0, args) })("Block0")
    ))("Block")
  })
  lazy val StatementList: ESParser[StatementList] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("StatementList", args, 3)
    log(resolveLL(
      log(MATCH ~ StatementListItem(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => StatementList0(x0, args) })("StatementList0"),
      log(MATCH ~ StatementListItem(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => ((x: StatementList) => StatementList1(x, x0, args)) })("StatementList1")
    ))("StatementList")
  })
  lazy val StatementListItem: ESParser[StatementListItem] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("StatementListItem", args, 3)
    log((
      log(MATCH ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => StatementListItem0(x0, args) })("StatementListItem0") |
      log(MATCH ~ Declaration(List(pYield, pAwait)) ^^ { case _ ~ x0 => StatementListItem1(x0, args) })("StatementListItem1")
    ))("StatementListItem")
  })
  lazy val LexicalDeclaration: ESParser[LexicalDeclaration] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("LexicalDeclaration", args, 3)
    log((
      log((MATCH ~ LetOrConst(List()) ~ BindingList(List(pIn, pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 ~ x1 => LexicalDeclaration0(x0, x1, args) })("LexicalDeclaration0")
    ))("LexicalDeclaration")
  })
  lazy val LetOrConst: ESParser[LetOrConst] = memo(args => {
    log((
      log((MATCH <~ t("let")) ^^ { case _ => LetOrConst0(args) })("LetOrConst0") |
      log((MATCH <~ t("const")) ^^ { case _ => LetOrConst1(args) })("LetOrConst1")
    ))("LetOrConst")
  })
  lazy val BindingList: ESParser[BindingList] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("BindingList", args, 3)
    log(resolveLL(
      log(MATCH ~ LexicalBinding(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => BindingList0(x0, args) })("BindingList0"),
      log((MATCH <~ t(",")) ~ LexicalBinding(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: BindingList) => BindingList1(x, x0, args)) })("BindingList1")
    ))("BindingList")
  })
  lazy val LexicalBinding: ESParser[LexicalBinding] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("LexicalBinding", args, 3)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, pAwait)) ~ opt(Initializer(List(pIn, pYield, pAwait))) ^^ { case _ ~ x0 ~ x1 => LexicalBinding0(x0, x1, args) })("LexicalBinding0") |
      log(MATCH ~ BindingPattern(List(pYield, pAwait)) ~ Initializer(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => LexicalBinding1(x0, x1, args) })("LexicalBinding1")
    ))("LexicalBinding")
  })
  lazy val VariableStatement: ESParser[VariableStatement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("VariableStatement", args, 2)
    log((
      log(((MATCH <~ t("var")) ~ VariableDeclarationList(List(true, pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 => VariableStatement0(x0, args) })("VariableStatement0")
    ))("VariableStatement")
  })
  lazy val VariableDeclarationList: ESParser[VariableDeclarationList] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("VariableDeclarationList", args, 3)
    log(resolveLL(
      log(MATCH ~ VariableDeclaration(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => VariableDeclarationList0(x0, args) })("VariableDeclarationList0"),
      log((MATCH <~ t(",")) ~ VariableDeclaration(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 => ((x: VariableDeclarationList) => VariableDeclarationList1(x, x0, args)) })("VariableDeclarationList1")
    ))("VariableDeclarationList")
  })
  lazy val VariableDeclaration: ESParser[VariableDeclaration] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("VariableDeclaration", args, 3)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, pAwait)) ~ opt(Initializer(List(pIn, pYield, pAwait))) ^^ { case _ ~ x0 ~ x1 => VariableDeclaration0(x0, x1, args) })("VariableDeclaration0") |
      log(MATCH ~ BindingPattern(List(pYield, pAwait)) ~ Initializer(List(pIn, pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => VariableDeclaration1(x0, x1, args) })("VariableDeclaration1")
    ))("VariableDeclaration")
  })
  lazy val BindingPattern: ESParser[BindingPattern] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingPattern", args, 2)
    log((
      log(MATCH ~ ObjectBindingPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingPattern0(x0, args) })("BindingPattern0") |
      log(MATCH ~ ArrayBindingPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingPattern1(x0, args) })("BindingPattern1")
    ))("BindingPattern")
  })
  lazy val ObjectBindingPattern: ESParser[ObjectBindingPattern] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ObjectBindingPattern", args, 2)
    log((
      log(((MATCH <~ t("{")) <~ t("}")) ^^ { case _ => ObjectBindingPattern0(args) })("ObjectBindingPattern0") |
      log(((MATCH <~ t("{")) ~ BindingRestProperty(List(pYield, pAwait)) <~ t("}")) ^^ { case _ ~ x0 => ObjectBindingPattern1(x0, args) })("ObjectBindingPattern1") |
      log(((MATCH <~ t("{")) ~ BindingPropertyList(List(pYield, pAwait)) <~ t("}")) ^^ { case _ ~ x0 => ObjectBindingPattern2(x0, args) })("ObjectBindingPattern2") |
      log((((MATCH <~ t("{")) ~ BindingPropertyList(List(pYield, pAwait)) <~ t(",")) ~ opt(BindingRestProperty(List(pYield, pAwait))) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => ObjectBindingPattern3(x0, x1, args) })("ObjectBindingPattern3")
    ))("ObjectBindingPattern")
  })
  lazy val ArrayBindingPattern: ESParser[ArrayBindingPattern] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ArrayBindingPattern", args, 2)
    log((
      log(((MATCH <~ t("[")) ~ opt(Elision(List())) ~ opt(BindingRestElement(List(pYield, pAwait))) <~ t("]")) ^^ { case _ ~ x0 ~ x1 => ArrayBindingPattern0(x0, x1, args) })("ArrayBindingPattern0") |
      log(((MATCH <~ t("[")) ~ BindingElementList(List(pYield, pAwait)) <~ t("]")) ^^ { case _ ~ x0 => ArrayBindingPattern1(x0, args) })("ArrayBindingPattern1") |
      log((((MATCH <~ t("[")) ~ BindingElementList(List(pYield, pAwait)) <~ t(",")) ~ opt(Elision(List())) ~ opt(BindingRestElement(List(pYield, pAwait))) <~ t("]")) ^^ { case _ ~ x0 ~ x1 ~ x2 => ArrayBindingPattern2(x0, x1, x2, args) })("ArrayBindingPattern2")
    ))("ArrayBindingPattern")
  })
  lazy val BindingRestProperty: ESParser[BindingRestProperty] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingRestProperty", args, 2)
    log((
      log((MATCH <~ t("...")) ~ BindingIdentifier(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingRestProperty0(x0, args) })("BindingRestProperty0")
    ))("BindingRestProperty")
  })
  lazy val BindingPropertyList: ESParser[BindingPropertyList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingPropertyList", args, 2)
    log(resolveLL(
      log(MATCH ~ BindingProperty(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingPropertyList0(x0, args) })("BindingPropertyList0"),
      log((MATCH <~ t(",")) ~ BindingProperty(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: BindingPropertyList) => BindingPropertyList1(x, x0, args)) })("BindingPropertyList1")
    ))("BindingPropertyList")
  })
  lazy val BindingElementList: ESParser[BindingElementList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingElementList", args, 2)
    log(resolveLL(
      log(MATCH ~ BindingElisionElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingElementList0(x0, args) })("BindingElementList0"),
      log((MATCH <~ t(",")) ~ BindingElisionElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: BindingElementList) => BindingElementList1(x, x0, args)) })("BindingElementList1")
    ))("BindingElementList")
  })
  lazy val BindingElisionElement: ESParser[BindingElisionElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingElisionElement", args, 2)
    log((
      log(MATCH ~ opt(Elision(List())) ~ BindingElement(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => BindingElisionElement0(x0, x1, args) })("BindingElisionElement0")
    ))("BindingElisionElement")
  })
  lazy val BindingProperty: ESParser[BindingProperty] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingProperty", args, 2)
    log((
      log(MATCH ~ SingleNameBinding(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingProperty0(x0, args) })("BindingProperty0") |
      log((MATCH ~ PropertyName(List(pYield, pAwait)) <~ t(":")) ~ BindingElement(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => BindingProperty1(x0, x1, args) })("BindingProperty1")
    ))("BindingProperty")
  })
  lazy val BindingElement: ESParser[BindingElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingElement", args, 2)
    log((
      log(MATCH ~ SingleNameBinding(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingElement0(x0, args) })("BindingElement0") |
      log(MATCH ~ BindingPattern(List(pYield, pAwait)) ~ opt(Initializer(List(true, pYield, pAwait))) ^^ { case _ ~ x0 ~ x1 => BindingElement1(x0, x1, args) })("BindingElement1")
    ))("BindingElement")
  })
  lazy val SingleNameBinding: ESParser[SingleNameBinding] = memo(args => {
    val List(pYield, pAwait) = getArgsN("SingleNameBinding", args, 2)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, pAwait)) ~ opt(Initializer(List(true, pYield, pAwait))) ^^ { case _ ~ x0 ~ x1 => SingleNameBinding0(x0, x1, args) })("SingleNameBinding0")
    ))("SingleNameBinding")
  })
  lazy val BindingRestElement: ESParser[BindingRestElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BindingRestElement", args, 2)
    log((
      log((MATCH <~ t("...")) ~ BindingIdentifier(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingRestElement0(x0, args) })("BindingRestElement0") |
      log((MATCH <~ t("...")) ~ BindingPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => BindingRestElement1(x0, args) })("BindingRestElement1")
    ))("BindingRestElement")
  })
  lazy val EmptyStatement: ESParser[EmptyStatement] = memo(args => {
    log((
      log((MATCH <~ t(";")) ^^ { case _ => EmptyStatement0(args) })("EmptyStatement0")
    ))("EmptyStatement")
  })
  lazy val ExpressionStatement: ESParser[ExpressionStatement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ExpressionStatement", args, 2)
    log((
      log(((MATCH <~ -ntl(ss("{") | ss("function" <~ not(IDContinue)) | ss("async" <~ not(IDContinue), strNoLineTerminator, "function" <~ not(IDContinue)) | ss("class" <~ not(IDContinue)) | ss("let" <~ not(IDContinue), "["))) ~ Expression(List(true, pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 => ExpressionStatement0(x0, args) })("ExpressionStatement0")
    ))("ExpressionStatement")
  })
  lazy val IfStatement: ESParser[IfStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("IfStatement", args, 3)
    log((
      log((((MATCH <~ t("if")) <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => IfStatement0(x0, x1, args) })("IfStatement0") |
      log(((((MATCH <~ t("if")) <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) <~ t("else")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IfStatement1(x0, x1, x2, args) })("IfStatement1")
    ))("IfStatement")
  })
  lazy val IterationStatement: ESParser[IterationStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("IterationStatement", args, 3)
    log((
      log((((((MATCH <~ t("do")) ~ Statement(List(pYield, pAwait, pReturn)) <~ t("while")) <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) <~ t(";")) ^^ { case _ ~ x0 ~ x1 => IterationStatement0(x0, x1, args) })("IterationStatement0") |
      log((((MATCH <~ t("while")) <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => IterationStatement1(x0, x1, args) })("IterationStatement1") |
      log(((((((MATCH <~ t("for")) <~ t("(")) <~ -ntl(ss("let" <~ not(IDContinue), "["))) ~ opt(Expression(List(false, pYield, pAwait))) <~ t(";")) ~ opt(Expression(List(true, pYield, pAwait))) <~ t(";")) ~ opt(Expression(List(true, pYield, pAwait))) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 ~ x3 => IterationStatement2(x0, x1, x2, x3, args) })("IterationStatement2") |
      log(((((((MATCH <~ t("for")) <~ t("(")) <~ t("var")) ~ VariableDeclarationList(List(false, pYield, pAwait)) <~ t(";")) ~ opt(Expression(List(true, pYield, pAwait))) <~ t(";")) ~ opt(Expression(List(true, pYield, pAwait))) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 ~ x3 => IterationStatement3(x0, x1, x2, x3, args) })("IterationStatement3") |
      log(((((MATCH <~ t("for")) <~ t("(")) ~ LexicalDeclaration(List(false, pYield, pAwait)) ~ opt(Expression(List(true, pYield, pAwait))) <~ t(";")) ~ opt(Expression(List(true, pYield, pAwait))) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 ~ x3 => IterationStatement4(x0, x1, x2, x3, args) })("IterationStatement4") |
      log((((((MATCH <~ t("for")) <~ t("(")) <~ -ntl(ss("let" <~ not(IDContinue), "["))) ~ LeftHandSideExpression(List(pYield, pAwait)) <~ t("in")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement5(x0, x1, x2, args) })("IterationStatement5") |
      log((((((MATCH <~ t("for")) <~ t("(")) <~ t("var")) ~ ForBinding(List(pYield, pAwait)) <~ t("in")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement6(x0, x1, x2, args) })("IterationStatement6") |
      log(((((MATCH <~ t("for")) <~ t("(")) ~ ForDeclaration(List(pYield, pAwait)) <~ t("in")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement7(x0, x1, x2, args) })("IterationStatement7") |
      log((((((MATCH <~ t("for")) <~ t("(")) <~ -ntl(ss("let" <~ not(IDContinue)))) ~ LeftHandSideExpression(List(pYield, pAwait)) <~ t("of")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement8(x0, x1, x2, args) })("IterationStatement8") |
      log((((((MATCH <~ t("for")) <~ t("(")) <~ t("var")) ~ ForBinding(List(pYield, pAwait)) <~ t("of")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement9(x0, x1, x2, args) })("IterationStatement9") |
      log(((((MATCH <~ t("for")) <~ t("(")) ~ ForDeclaration(List(pYield, pAwait)) <~ t("of")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement10(x0, x1, x2, args) })("IterationStatement10") |
      log((if (pAwait) ((((((MATCH <~ t("for")) <~ t("await")) <~ t("(")) <~ -ntl(ss("let" <~ not(IDContinue)))) ~ LeftHandSideExpression(List(pYield, pAwait)) <~ t("of")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement11(x0, x1, x2, args) } else MISMATCH))("IterationStatement11") |
      log((if (pAwait) ((((((MATCH <~ t("for")) <~ t("await")) <~ t("(")) <~ t("var")) ~ ForBinding(List(pYield, pAwait)) <~ t("of")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement12(x0, x1, x2, args) } else MISMATCH))("IterationStatement12") |
      log((if (pAwait) (((((MATCH <~ t("for")) <~ t("await")) <~ t("(")) ~ ForDeclaration(List(pYield, pAwait)) <~ t("of")) ~ AssignmentExpression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => IterationStatement13(x0, x1, x2, args) } else MISMATCH))("IterationStatement13")
    ))("IterationStatement")
  })
  lazy val ForDeclaration: ESParser[ForDeclaration] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ForDeclaration", args, 2)
    log((
      log(MATCH ~ LetOrConst(List()) ~ ForBinding(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ForDeclaration0(x0, x1, args) })("ForDeclaration0")
    ))("ForDeclaration")
  })
  lazy val ForBinding: ESParser[ForBinding] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ForBinding", args, 2)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, pAwait)) ^^ { case _ ~ x0 => ForBinding0(x0, args) })("ForBinding0") |
      log(MATCH ~ BindingPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => ForBinding1(x0, args) })("ForBinding1")
    ))("ForBinding")
  })
  lazy val ContinueStatement: ESParser[ContinueStatement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ContinueStatement", args, 2)
    log((
      log(((MATCH <~ t("continue")) <~ t(";")) ^^ { case _ => ContinueStatement0(args) })("ContinueStatement0") |
      log((((MATCH <~ t("continue")) <~ NoLineTerminator) ~ LabelIdentifier(List(pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 => ContinueStatement1(x0, args) })("ContinueStatement1")
    ))("ContinueStatement")
  })
  lazy val BreakStatement: ESParser[BreakStatement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("BreakStatement", args, 2)
    log((
      log(((MATCH <~ t("break")) <~ t(";")) ^^ { case _ => BreakStatement0(args) })("BreakStatement0") |
      log((((MATCH <~ t("break")) <~ NoLineTerminator) ~ LabelIdentifier(List(pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 => BreakStatement1(x0, args) })("BreakStatement1")
    ))("BreakStatement")
  })
  lazy val ReturnStatement: ESParser[ReturnStatement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ReturnStatement", args, 2)
    log((
      log(((MATCH <~ t("return")) <~ t(";")) ^^ { case _ => ReturnStatement0(args) })("ReturnStatement0") |
      log((((MATCH <~ t("return")) <~ NoLineTerminator) ~ Expression(List(true, pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 => ReturnStatement1(x0, args) })("ReturnStatement1")
    ))("ReturnStatement")
  })
  lazy val WithStatement: ESParser[WithStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("WithStatement", args, 3)
    log((
      log((((MATCH <~ t("with")) <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => WithStatement0(x0, x1, args) })("WithStatement0")
    ))("WithStatement")
  })
  lazy val SwitchStatement: ESParser[SwitchStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("SwitchStatement", args, 3)
    log((
      log((((MATCH <~ t("switch")) <~ t("(")) ~ Expression(List(true, pYield, pAwait)) <~ t(")")) ~ CaseBlock(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => SwitchStatement0(x0, x1, args) })("SwitchStatement0")
    ))("SwitchStatement")
  })
  lazy val CaseBlock: ESParser[CaseBlock] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("CaseBlock", args, 3)
    log((
      log(((MATCH <~ t("{")) ~ opt(CaseClauses(List(pYield, pAwait, pReturn))) <~ t("}")) ^^ { case _ ~ x0 => CaseBlock0(x0, args) })("CaseBlock0") |
      log(((MATCH <~ t("{")) ~ opt(CaseClauses(List(pYield, pAwait, pReturn))) ~ DefaultClause(List(pYield, pAwait, pReturn)) ~ opt(CaseClauses(List(pYield, pAwait, pReturn))) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => CaseBlock1(x0, x1, x2, args) })("CaseBlock1")
    ))("CaseBlock")
  })
  lazy val CaseClauses: ESParser[CaseClauses] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("CaseClauses", args, 3)
    log(resolveLL(
      log(MATCH ~ CaseClause(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => CaseClauses0(x0, args) })("CaseClauses0"),
      log(MATCH ~ CaseClause(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => ((x: CaseClauses) => CaseClauses1(x, x0, args)) })("CaseClauses1")
    ))("CaseClauses")
  })
  lazy val CaseClause: ESParser[CaseClause] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("CaseClause", args, 3)
    log((
      log(((MATCH <~ t("case")) ~ Expression(List(true, pYield, pAwait)) <~ t(":")) ~ opt(StatementList(List(pYield, pAwait, pReturn))) ^^ { case _ ~ x0 ~ x1 => CaseClause0(x0, x1, args) })("CaseClause0")
    ))("CaseClause")
  })
  lazy val DefaultClause: ESParser[DefaultClause] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("DefaultClause", args, 3)
    log((
      log(((MATCH <~ t("default")) <~ t(":")) ~ opt(StatementList(List(pYield, pAwait, pReturn))) ^^ { case _ ~ x0 => DefaultClause0(x0, args) })("DefaultClause0")
    ))("DefaultClause")
  })
  lazy val LabelledStatement: ESParser[LabelledStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("LabelledStatement", args, 3)
    log((
      log((MATCH ~ LabelIdentifier(List(pYield, pAwait)) <~ t(":")) ~ LabelledItem(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => LabelledStatement0(x0, x1, args) })("LabelledStatement0")
    ))("LabelledStatement")
  })
  lazy val LabelledItem: ESParser[LabelledItem] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("LabelledItem", args, 3)
    log((
      log(MATCH ~ Statement(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => LabelledItem0(x0, args) })("LabelledItem0") |
      log(MATCH ~ FunctionDeclaration(List(pYield, pAwait, false)) ^^ { case _ ~ x0 => LabelledItem1(x0, args) })("LabelledItem1")
    ))("LabelledItem")
  })
  lazy val ThrowStatement: ESParser[ThrowStatement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ThrowStatement", args, 2)
    log((
      log((((MATCH <~ t("throw")) <~ NoLineTerminator) ~ Expression(List(true, pYield, pAwait)) <~ t(";")) ^^ { case _ ~ x0 => ThrowStatement0(x0, args) })("ThrowStatement0")
    ))("ThrowStatement")
  })
  lazy val TryStatement: ESParser[TryStatement] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("TryStatement", args, 3)
    log((
      log((MATCH <~ t("try")) ~ Block(List(pYield, pAwait, pReturn)) ~ Catch(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => TryStatement0(x0, x1, args) })("TryStatement0") |
      log((MATCH <~ t("try")) ~ Block(List(pYield, pAwait, pReturn)) ~ Finally(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => TryStatement1(x0, x1, args) })("TryStatement1") |
      log((MATCH <~ t("try")) ~ Block(List(pYield, pAwait, pReturn)) ~ Catch(List(pYield, pAwait, pReturn)) ~ Finally(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 ~ x2 => TryStatement2(x0, x1, x2, args) })("TryStatement2")
    ))("TryStatement")
  })
  lazy val Catch: ESParser[Catch] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("Catch", args, 3)
    log((
      log((((MATCH <~ t("catch")) <~ t("(")) ~ CatchParameter(List(pYield, pAwait)) <~ t(")")) ~ Block(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 ~ x1 => Catch0(x0, x1, args) })("Catch0") |
      log((MATCH <~ t("catch")) ~ Block(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Catch1(x0, args) })("Catch1")
    ))("Catch")
  })
  lazy val Finally: ESParser[Finally] = memo(args => {
    val List(pYield, pAwait, pReturn) = getArgsN("Finally", args, 3)
    log((
      log((MATCH <~ t("finally")) ~ Block(List(pYield, pAwait, pReturn)) ^^ { case _ ~ x0 => Finally0(x0, args) })("Finally0")
    ))("Finally")
  })
  lazy val CatchParameter: ESParser[CatchParameter] = memo(args => {
    val List(pYield, pAwait) = getArgsN("CatchParameter", args, 2)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, pAwait)) ^^ { case _ ~ x0 => CatchParameter0(x0, args) })("CatchParameter0") |
      log(MATCH ~ BindingPattern(List(pYield, pAwait)) ^^ { case _ ~ x0 => CatchParameter1(x0, args) })("CatchParameter1")
    ))("CatchParameter")
  })
  lazy val DebuggerStatement: ESParser[DebuggerStatement] = memo(args => {
    log((
      log(((MATCH <~ t("debugger")) <~ t(";")) ^^ { case _ => DebuggerStatement0(args) })("DebuggerStatement0")
    ))("DebuggerStatement")
  })
  lazy val FunctionDeclaration: ESParser[FunctionDeclaration] = memo(args => {
    val List(pYield, pAwait, pDefault) = getArgsN("FunctionDeclaration", args, 3)
    log((
      log((((((MATCH <~ t("function")) ~ BindingIdentifier(List(pYield, pAwait)) <~ t("(")) ~ FormalParameters(List(false, false)) <~ t(")")) <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => FunctionDeclaration0(x0, x1, x2, args) })("FunctionDeclaration0") |
      log((if (pDefault) (((((MATCH <~ t("function")) <~ t("(")) ~ FormalParameters(List(false, false)) <~ t(")")) <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => FunctionDeclaration1(x0, x1, args) } else MISMATCH))("FunctionDeclaration1")
    ))("FunctionDeclaration")
  })
  lazy val FunctionExpression: ESParser[FunctionExpression] = memo(args => {
    log((
      log((((((MATCH <~ t("function")) ~ opt(BindingIdentifier(List(false, false))) <~ t("(")) ~ FormalParameters(List(false, false)) <~ t(")")) <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => FunctionExpression0(x0, x1, x2, args) })("FunctionExpression0")
    ))("FunctionExpression")
  })
  lazy val UniqueFormalParameters: ESParser[UniqueFormalParameters] = memo(args => {
    val List(pYield, pAwait) = getArgsN("UniqueFormalParameters", args, 2)
    log((
      log(MATCH ~ FormalParameters(List(pYield, pAwait)) ^^ { case _ ~ x0 => UniqueFormalParameters0(x0, args) })("UniqueFormalParameters0")
    ))("UniqueFormalParameters")
  })
  lazy val FormalParameters: ESParser[FormalParameters] = memo(args => {
    val List(pYield, pAwait) = getArgsN("FormalParameters", args, 2)
    log((
      log(MATCH ~ MATCH ^^ { case _ => FormalParameters0(args) })("FormalParameters0") |
      log(MATCH ~ FunctionRestParameter(List(pYield, pAwait)) ^^ { case _ ~ x0 => FormalParameters1(x0, args) })("FormalParameters1") |
      log(MATCH ~ FormalParameterList(List(pYield, pAwait)) ^^ { case _ ~ x0 => FormalParameters2(x0, args) })("FormalParameters2") |
      log((MATCH ~ FormalParameterList(List(pYield, pAwait)) <~ t(",")) ^^ { case _ ~ x0 => FormalParameters3(x0, args) })("FormalParameters3") |
      log((MATCH ~ FormalParameterList(List(pYield, pAwait)) <~ t(",")) ~ FunctionRestParameter(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => FormalParameters4(x0, x1, args) })("FormalParameters4")
    ))("FormalParameters")
  })
  lazy val FormalParameterList: ESParser[FormalParameterList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("FormalParameterList", args, 2)
    log(resolveLL(
      log(MATCH ~ FormalParameter(List(pYield, pAwait)) ^^ { case _ ~ x0 => FormalParameterList0(x0, args) })("FormalParameterList0"),
      log((MATCH <~ t(",")) ~ FormalParameter(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: FormalParameterList) => FormalParameterList1(x, x0, args)) })("FormalParameterList1")
    ))("FormalParameterList")
  })
  lazy val FunctionRestParameter: ESParser[FunctionRestParameter] = memo(args => {
    val List(pYield, pAwait) = getArgsN("FunctionRestParameter", args, 2)
    log((
      log(MATCH ~ BindingRestElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => FunctionRestParameter0(x0, args) })("FunctionRestParameter0")
    ))("FunctionRestParameter")
  })
  lazy val FormalParameter: ESParser[FormalParameter] = memo(args => {
    val List(pYield, pAwait) = getArgsN("FormalParameter", args, 2)
    log((
      log(MATCH ~ BindingElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => FormalParameter0(x0, args) })("FormalParameter0")
    ))("FormalParameter")
  })
  lazy val FunctionBody: ESParser[FunctionBody] = memo(args => {
    val List(pYield, pAwait) = getArgsN("FunctionBody", args, 2)
    log((
      log(MATCH ~ FunctionStatementList(List(pYield, pAwait)) ^^ { case _ ~ x0 => FunctionBody0(x0, args) })("FunctionBody0")
    ))("FunctionBody")
  })
  lazy val FunctionStatementList: ESParser[FunctionStatementList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("FunctionStatementList", args, 2)
    log((
      log(MATCH ~ opt(StatementList(List(pYield, pAwait, true))) ^^ { case _ ~ x0 => FunctionStatementList0(x0, args) })("FunctionStatementList0")
    ))("FunctionStatementList")
  })
  lazy val ArrowFunction: ESParser[ArrowFunction] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("ArrowFunction", args, 3)
    log((
      log(((MATCH ~ ArrowParameters(List(pYield, pAwait)) <~ NoLineTerminator) <~ t("=>")) ~ ConciseBody(List(pIn)) ^^ { case _ ~ x0 ~ x1 => ArrowFunction0(x0, x1, args) })("ArrowFunction0")
    ))("ArrowFunction")
  })
  lazy val ArrowParameters: ESParser[ArrowParameters] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ArrowParameters", args, 2)
    log((
      log(MATCH ~ BindingIdentifier(List(pYield, pAwait)) ^^ { case _ ~ x0 => ArrowParameters0(x0, args) })("ArrowParameters0") |
      log(MATCH ~ CoverParenthesizedExpressionAndArrowParameterList(List(pYield, pAwait)) ^^ { case _ ~ x0 => ArrowParameters1(x0, args) })("ArrowParameters1")
    ))("ArrowParameters")
  })
  lazy val ConciseBody: ESParser[ConciseBody] = memo(args => {
    val List(pIn) = getArgsN("ConciseBody", args, 1)
    log((
      log((MATCH <~ -ntl(ss("{"))) ~ AssignmentExpression(List(pIn, false, false)) ^^ { case _ ~ x0 => ConciseBody0(x0, args) })("ConciseBody0") |
      log(((MATCH <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 => ConciseBody1(x0, args) })("ConciseBody1")
    ))("ConciseBody")
  })
  lazy val ArrowFormalParameters: ESParser[ArrowFormalParameters] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ArrowFormalParameters", args, 2)
    log((
      log(((MATCH <~ t("(")) ~ UniqueFormalParameters(List(pYield, pAwait)) <~ t(")")) ^^ { case _ ~ x0 => ArrowFormalParameters0(x0, args) })("ArrowFormalParameters0")
    ))("ArrowFormalParameters")
  })
  lazy val AsyncArrowFunction: ESParser[AsyncArrowFunction] = memo(args => {
    val List(pIn, pYield, pAwait) = getArgsN("AsyncArrowFunction", args, 3)
    log((
      log(((((MATCH <~ t("async")) <~ NoLineTerminator) ~ AsyncArrowBindingIdentifier(List(pYield)) <~ NoLineTerminator) <~ t("=>")) ~ AsyncConciseBody(List(pIn)) ^^ { case _ ~ x0 ~ x1 => AsyncArrowFunction0(x0, x1, args) })("AsyncArrowFunction0") |
      log(((MATCH ~ CoverCallExpressionAndAsyncArrowHead(List(pYield, pAwait)) <~ NoLineTerminator) <~ t("=>")) ~ AsyncConciseBody(List(pIn)) ^^ { case _ ~ x0 ~ x1 => AsyncArrowFunction1(x0, x1, args) })("AsyncArrowFunction1")
    ))("AsyncArrowFunction")
  })
  lazy val AsyncConciseBody: ESParser[AsyncConciseBody] = memo(args => {
    val List(pIn) = getArgsN("AsyncConciseBody", args, 1)
    log((
      log((MATCH <~ -ntl(ss("{"))) ~ AssignmentExpression(List(pIn, false, true)) ^^ { case _ ~ x0 => AsyncConciseBody0(x0, args) })("AsyncConciseBody0") |
      log(((MATCH <~ t("{")) ~ AsyncFunctionBody(List()) <~ t("}")) ^^ { case _ ~ x0 => AsyncConciseBody1(x0, args) })("AsyncConciseBody1")
    ))("AsyncConciseBody")
  })
  lazy val AsyncArrowHead: ESParser[AsyncArrowHead] = memo(args => {
    log((
      log(((MATCH <~ t("async")) <~ NoLineTerminator) ~ ArrowFormalParameters(List(false, true)) ^^ { case _ ~ x0 => AsyncArrowHead0(x0, args) })("AsyncArrowHead0")
    ))("AsyncArrowHead")
  })
  lazy val MethodDefinition: ESParser[MethodDefinition] = memo(args => {
    val List(pYield, pAwait) = getArgsN("MethodDefinition", args, 2)
    log((
      log(((((MATCH ~ PropertyName(List(pYield, pAwait)) <~ t("(")) ~ UniqueFormalParameters(List(false, false)) <~ t(")")) <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => MethodDefinition0(x0, x1, x2, args) })("MethodDefinition0") |
      log(MATCH ~ GeneratorMethod(List(pYield, pAwait)) ^^ { case _ ~ x0 => MethodDefinition1(x0, args) })("MethodDefinition1") |
      log(MATCH ~ AsyncMethod(List(pYield, pAwait)) ^^ { case _ ~ x0 => MethodDefinition2(x0, args) })("MethodDefinition2") |
      log(MATCH ~ AsyncGeneratorMethod(List(pYield, pAwait)) ^^ { case _ ~ x0 => MethodDefinition3(x0, args) })("MethodDefinition3") |
      log((((((MATCH <~ t("get")) ~ PropertyName(List(pYield, pAwait)) <~ t("(")) <~ t(")")) <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => MethodDefinition4(x0, x1, args) })("MethodDefinition4") |
      log((((((MATCH <~ t("set")) ~ PropertyName(List(pYield, pAwait)) <~ t("(")) ~ PropertySetParameterList(List()) <~ t(")")) <~ t("{")) ~ FunctionBody(List(false, false)) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => MethodDefinition5(x0, x1, x2, args) })("MethodDefinition5")
    ))("MethodDefinition")
  })
  lazy val PropertySetParameterList: ESParser[PropertySetParameterList] = memo(args => {
    log((
      log(MATCH ~ FormalParameter(List(false, false)) ^^ { case _ ~ x0 => PropertySetParameterList0(x0, args) })("PropertySetParameterList0")
    ))("PropertySetParameterList")
  })
  lazy val GeneratorMethod: ESParser[GeneratorMethod] = memo(args => {
    val List(pYield, pAwait) = getArgsN("GeneratorMethod", args, 2)
    log((
      log((((((MATCH <~ t("*")) ~ PropertyName(List(pYield, pAwait)) <~ t("(")) ~ UniqueFormalParameters(List(true, false)) <~ t(")")) <~ t("{")) ~ GeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => GeneratorMethod0(x0, x1, x2, args) })("GeneratorMethod0")
    ))("GeneratorMethod")
  })
  lazy val GeneratorDeclaration: ESParser[GeneratorDeclaration] = memo(args => {
    val List(pYield, pAwait, pDefault) = getArgsN("GeneratorDeclaration", args, 3)
    log((
      log(((((((MATCH <~ t("function")) <~ t("*")) ~ BindingIdentifier(List(pYield, pAwait)) <~ t("(")) ~ FormalParameters(List(true, false)) <~ t(")")) <~ t("{")) ~ GeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => GeneratorDeclaration0(x0, x1, x2, args) })("GeneratorDeclaration0") |
      log((if (pDefault) ((((((MATCH <~ t("function")) <~ t("*")) <~ t("(")) ~ FormalParameters(List(true, false)) <~ t(")")) <~ t("{")) ~ GeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => GeneratorDeclaration1(x0, x1, args) } else MISMATCH))("GeneratorDeclaration1")
    ))("GeneratorDeclaration")
  })
  lazy val GeneratorExpression: ESParser[GeneratorExpression] = memo(args => {
    log((
      log(((((((MATCH <~ t("function")) <~ t("*")) ~ opt(BindingIdentifier(List(true, false))) <~ t("(")) ~ FormalParameters(List(true, false)) <~ t(")")) <~ t("{")) ~ GeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => GeneratorExpression0(x0, x1, x2, args) })("GeneratorExpression0")
    ))("GeneratorExpression")
  })
  lazy val GeneratorBody: ESParser[GeneratorBody] = memo(args => {
    log((
      log(MATCH ~ FunctionBody(List(true, false)) ^^ { case _ ~ x0 => GeneratorBody0(x0, args) })("GeneratorBody0")
    ))("GeneratorBody")
  })
  lazy val YieldExpression: ESParser[YieldExpression] = memo(args => {
    val List(pIn, pAwait) = getArgsN("YieldExpression", args, 2)
    log((
      log((MATCH <~ t("yield")) ^^ { case _ => YieldExpression0(args) })("YieldExpression0") |
      log(((MATCH <~ t("yield")) <~ NoLineTerminator) ~ AssignmentExpression(List(pIn, true, pAwait)) ^^ { case _ ~ x0 => YieldExpression1(x0, args) })("YieldExpression1") |
      log((((MATCH <~ t("yield")) <~ NoLineTerminator) <~ t("*")) ~ AssignmentExpression(List(pIn, true, pAwait)) ^^ { case _ ~ x0 => YieldExpression2(x0, args) })("YieldExpression2")
    ))("YieldExpression")
  })
  lazy val AsyncGeneratorMethod: ESParser[AsyncGeneratorMethod] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AsyncGeneratorMethod", args, 2)
    log((
      log((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("*")) ~ PropertyName(List(pYield, pAwait)) <~ t("(")) ~ UniqueFormalParameters(List(true, true)) <~ t(")")) <~ t("{")) ~ AsyncGeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => AsyncGeneratorMethod0(x0, x1, x2, args) })("AsyncGeneratorMethod0")
    ))("AsyncGeneratorMethod")
  })
  lazy val AsyncGeneratorDeclaration: ESParser[AsyncGeneratorDeclaration] = memo(args => {
    val List(pYield, pAwait, pDefault) = getArgsN("AsyncGeneratorDeclaration", args, 3)
    log((
      log(((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) <~ t("*")) ~ BindingIdentifier(List(pYield, pAwait)) <~ t("(")) ~ FormalParameters(List(true, true)) <~ t(")")) <~ t("{")) ~ AsyncGeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => AsyncGeneratorDeclaration0(x0, x1, x2, args) })("AsyncGeneratorDeclaration0") |
      log((if (pDefault) ((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) <~ t("*")) <~ t("(")) ~ FormalParameters(List(true, true)) <~ t(")")) <~ t("{")) ~ AsyncGeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => AsyncGeneratorDeclaration1(x0, x1, args) } else MISMATCH))("AsyncGeneratorDeclaration1")
    ))("AsyncGeneratorDeclaration")
  })
  lazy val AsyncGeneratorExpression: ESParser[AsyncGeneratorExpression] = memo(args => {
    log((
      log(((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) <~ t("*")) ~ opt(BindingIdentifier(List(true, true))) <~ t("(")) ~ FormalParameters(List(true, true)) <~ t(")")) <~ t("{")) ~ AsyncGeneratorBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => AsyncGeneratorExpression0(x0, x1, x2, args) })("AsyncGeneratorExpression0")
    ))("AsyncGeneratorExpression")
  })
  lazy val AsyncGeneratorBody: ESParser[AsyncGeneratorBody] = memo(args => {
    log((
      log(MATCH ~ FunctionBody(List(true, true)) ^^ { case _ ~ x0 => AsyncGeneratorBody0(x0, args) })("AsyncGeneratorBody0")
    ))("AsyncGeneratorBody")
  })
  lazy val AsyncMethod: ESParser[AsyncMethod] = memo(args => {
    val List(pYield, pAwait) = getArgsN("AsyncMethod", args, 2)
    log((
      log(((((((MATCH <~ t("async")) <~ NoLineTerminator) ~ PropertyName(List(pYield, pAwait)) <~ t("(")) ~ UniqueFormalParameters(List(false, true)) <~ t(")")) <~ t("{")) ~ AsyncFunctionBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => AsyncMethod0(x0, x1, x2, args) })("AsyncMethod0")
    ))("AsyncMethod")
  })
  lazy val AsyncFunctionDeclaration: ESParser[AsyncFunctionDeclaration] = memo(args => {
    val List(pYield, pAwait, pDefault) = getArgsN("AsyncFunctionDeclaration", args, 3)
    log((
      log((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) ~ BindingIdentifier(List(pYield, pAwait)) <~ t("(")) ~ FormalParameters(List(false, true)) <~ t(")")) <~ t("{")) ~ AsyncFunctionBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => AsyncFunctionDeclaration0(x0, x1, x2, args) })("AsyncFunctionDeclaration0") |
      log((if (pDefault) (((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) <~ t("(")) ~ FormalParameters(List(false, true)) <~ t(")")) <~ t("{")) ~ AsyncFunctionBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => AsyncFunctionDeclaration1(x0, x1, args) } else MISMATCH))("AsyncFunctionDeclaration1")
    ))("AsyncFunctionDeclaration")
  })
  lazy val AsyncFunctionExpression: ESParser[AsyncFunctionExpression] = memo(args => {
    log((
      log((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) <~ t("(")) ~ FormalParameters(List(false, true)) <~ t(")")) <~ t("{")) ~ AsyncFunctionBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => AsyncFunctionExpression0(x0, x1, args) })("AsyncFunctionExpression0") |
      log((((((((MATCH <~ t("async")) <~ NoLineTerminator) <~ t("function")) ~ BindingIdentifier(List(false, true)) <~ t("(")) ~ FormalParameters(List(false, true)) <~ t(")")) <~ t("{")) ~ AsyncFunctionBody(List()) <~ t("}")) ^^ { case _ ~ x0 ~ x1 ~ x2 => AsyncFunctionExpression1(x0, x1, x2, args) })("AsyncFunctionExpression1")
    ))("AsyncFunctionExpression")
  })
  lazy val AsyncFunctionBody: ESParser[AsyncFunctionBody] = memo(args => {
    log((
      log(MATCH ~ FunctionBody(List(false, true)) ^^ { case _ ~ x0 => AsyncFunctionBody0(x0, args) })("AsyncFunctionBody0")
    ))("AsyncFunctionBody")
  })
  lazy val AwaitExpression: ESParser[AwaitExpression] = memo(args => {
    val List(pYield) = getArgsN("AwaitExpression", args, 1)
    log((
      log((MATCH <~ t("await")) ~ UnaryExpression(List(pYield, true)) ^^ { case _ ~ x0 => AwaitExpression0(x0, args) })("AwaitExpression0")
    ))("AwaitExpression")
  })
  lazy val ClassDeclaration: ESParser[ClassDeclaration] = memo(args => {
    val List(pYield, pAwait, pDefault) = getArgsN("ClassDeclaration", args, 3)
    log((
      log((MATCH <~ t("class")) ~ BindingIdentifier(List(pYield, pAwait)) ~ ClassTail(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ClassDeclaration0(x0, x1, args) })("ClassDeclaration0") |
      log((if (pDefault) (MATCH <~ t("class")) ~ ClassTail(List(pYield, pAwait)) ^^ { case _ ~ x0 => ClassDeclaration1(x0, args) } else MISMATCH))("ClassDeclaration1")
    ))("ClassDeclaration")
  })
  lazy val ClassExpression: ESParser[ClassExpression] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ClassExpression", args, 2)
    log((
      log((MATCH <~ t("class")) ~ opt(BindingIdentifier(List(pYield, pAwait))) ~ ClassTail(List(pYield, pAwait)) ^^ { case _ ~ x0 ~ x1 => ClassExpression0(x0, x1, args) })("ClassExpression0")
    ))("ClassExpression")
  })
  lazy val ClassTail: ESParser[ClassTail] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ClassTail", args, 2)
    log((
      log(((MATCH ~ opt(ClassHeritage(List(pYield, pAwait))) <~ t("{")) ~ opt(ClassBody(List(pYield, pAwait))) <~ t("}")) ^^ { case _ ~ x0 ~ x1 => ClassTail0(x0, x1, args) })("ClassTail0")
    ))("ClassTail")
  })
  lazy val ClassHeritage: ESParser[ClassHeritage] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ClassHeritage", args, 2)
    log((
      log((MATCH <~ t("extends")) ~ LeftHandSideExpression(List(pYield, pAwait)) ^^ { case _ ~ x0 => ClassHeritage0(x0, args) })("ClassHeritage0")
    ))("ClassHeritage")
  })
  lazy val ClassBody: ESParser[ClassBody] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ClassBody", args, 2)
    log((
      log(MATCH ~ ClassElementList(List(pYield, pAwait)) ^^ { case _ ~ x0 => ClassBody0(x0, args) })("ClassBody0")
    ))("ClassBody")
  })
  lazy val ClassElementList: ESParser[ClassElementList] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ClassElementList", args, 2)
    log(resolveLL(
      log(MATCH ~ ClassElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => ClassElementList0(x0, args) })("ClassElementList0"),
      log(MATCH ~ ClassElement(List(pYield, pAwait)) ^^ { case _ ~ x0 => ((x: ClassElementList) => ClassElementList1(x, x0, args)) })("ClassElementList1")
    ))("ClassElementList")
  })
  lazy val ClassElement: ESParser[ClassElement] = memo(args => {
    val List(pYield, pAwait) = getArgsN("ClassElement", args, 2)
    log((
      log(MATCH ~ MethodDefinition(List(pYield, pAwait)) ^^ { case _ ~ x0 => ClassElement0(x0, args) })("ClassElement0") |
      log((MATCH <~ t("static")) ~ MethodDefinition(List(pYield, pAwait)) ^^ { case _ ~ x0 => ClassElement1(x0, args) })("ClassElement1") |
      log((MATCH <~ t(";")) ^^ { case _ => ClassElement2(args) })("ClassElement2")
    ))("ClassElement")
  })
  lazy val Script: ESParser[Script] = memo(args => {
    log((
      log(MATCH ~ opt(ScriptBody(List())) ^^ { case _ ~ x0 => Script0(x0, args) })("Script0")
    ))("Script")
  })
  lazy val ScriptBody: ESParser[ScriptBody] = memo(args => {
    log((
      log(MATCH ~ StatementList(List(false, false, false)) ^^ { case _ ~ x0 => ScriptBody0(x0, args) })("ScriptBody0")
    ))("ScriptBody")
  })
  lazy val Module: ESParser[Module] = memo(args => {
    log((
      log(MATCH ~ opt(ModuleBody(List())) ^^ { case _ ~ x0 => Module0(x0, args) })("Module0")
    ))("Module")
  })
  lazy val ModuleBody: ESParser[ModuleBody] = memo(args => {
    log((
      log(MATCH ~ ModuleItemList(List()) ^^ { case _ ~ x0 => ModuleBody0(x0, args) })("ModuleBody0")
    ))("ModuleBody")
  })
  lazy val ModuleItemList: ESParser[ModuleItemList] = memo(args => {
    log(resolveLL(
      log(MATCH ~ ModuleItem(List()) ^^ { case _ ~ x0 => ModuleItemList0(x0, args) })("ModuleItemList0"),
      log(MATCH ~ ModuleItem(List()) ^^ { case _ ~ x0 => ((x: ModuleItemList) => ModuleItemList1(x, x0, args)) })("ModuleItemList1")
    ))("ModuleItemList")
  })
  lazy val ModuleItem: ESParser[ModuleItem] = memo(args => {
    log((
      log(MATCH ~ ImportDeclaration(List()) ^^ { case _ ~ x0 => ModuleItem0(x0, args) })("ModuleItem0") |
      log(MATCH ~ ExportDeclaration(List()) ^^ { case _ ~ x0 => ModuleItem1(x0, args) })("ModuleItem1") |
      log(MATCH ~ StatementListItem(List(false, false, false)) ^^ { case _ ~ x0 => ModuleItem2(x0, args) })("ModuleItem2")
    ))("ModuleItem")
  })
  lazy val ImportDeclaration: ESParser[ImportDeclaration] = memo(args => {
    log((
      log(((MATCH <~ t("import")) ~ ImportClause(List()) ~ FromClause(List()) <~ t(";")) ^^ { case _ ~ x0 ~ x1 => ImportDeclaration0(x0, x1, args) })("ImportDeclaration0") |
      log(((MATCH <~ t("import")) ~ ModuleSpecifier(List()) <~ t(";")) ^^ { case _ ~ x0 => ImportDeclaration1(x0, args) })("ImportDeclaration1")
    ))("ImportDeclaration")
  })
  lazy val ImportClause: ESParser[ImportClause] = memo(args => {
    log((
      log(MATCH ~ ImportedDefaultBinding(List()) ^^ { case _ ~ x0 => ImportClause0(x0, args) })("ImportClause0") |
      log(MATCH ~ NameSpaceImport(List()) ^^ { case _ ~ x0 => ImportClause1(x0, args) })("ImportClause1") |
      log(MATCH ~ NamedImports(List()) ^^ { case _ ~ x0 => ImportClause2(x0, args) })("ImportClause2") |
      log((MATCH ~ ImportedDefaultBinding(List()) <~ t(",")) ~ NameSpaceImport(List()) ^^ { case _ ~ x0 ~ x1 => ImportClause3(x0, x1, args) })("ImportClause3") |
      log((MATCH ~ ImportedDefaultBinding(List()) <~ t(",")) ~ NamedImports(List()) ^^ { case _ ~ x0 ~ x1 => ImportClause4(x0, x1, args) })("ImportClause4")
    ))("ImportClause")
  })
  lazy val ImportedDefaultBinding: ESParser[ImportedDefaultBinding] = memo(args => {
    log((
      log(MATCH ~ ImportedBinding(List()) ^^ { case _ ~ x0 => ImportedDefaultBinding0(x0, args) })("ImportedDefaultBinding0")
    ))("ImportedDefaultBinding")
  })
  lazy val NameSpaceImport: ESParser[NameSpaceImport] = memo(args => {
    log((
      log(((MATCH <~ t("*")) <~ t("as")) ~ ImportedBinding(List()) ^^ { case _ ~ x0 => NameSpaceImport0(x0, args) })("NameSpaceImport0")
    ))("NameSpaceImport")
  })
  lazy val NamedImports: ESParser[NamedImports] = memo(args => {
    log((
      log(((MATCH <~ t("{")) <~ t("}")) ^^ { case _ => NamedImports0(args) })("NamedImports0") |
      log(((MATCH <~ t("{")) ~ ImportsList(List()) <~ t("}")) ^^ { case _ ~ x0 => NamedImports1(x0, args) })("NamedImports1") |
      log((((MATCH <~ t("{")) ~ ImportsList(List()) <~ t(",")) <~ t("}")) ^^ { case _ ~ x0 => NamedImports2(x0, args) })("NamedImports2")
    ))("NamedImports")
  })
  lazy val FromClause: ESParser[FromClause] = memo(args => {
    log((
      log((MATCH <~ t("from")) ~ ModuleSpecifier(List()) ^^ { case _ ~ x0 => FromClause0(x0, args) })("FromClause0")
    ))("FromClause")
  })
  lazy val ImportsList: ESParser[ImportsList] = memo(args => {
    log(resolveLL(
      log(MATCH ~ ImportSpecifier(List()) ^^ { case _ ~ x0 => ImportsList0(x0, args) })("ImportsList0"),
      log((MATCH <~ t(",")) ~ ImportSpecifier(List()) ^^ { case _ ~ x0 => ((x: ImportsList) => ImportsList1(x, x0, args)) })("ImportsList1")
    ))("ImportsList")
  })
  lazy val ImportSpecifier: ESParser[ImportSpecifier] = memo(args => {
    log((
      log(MATCH ~ ImportedBinding(List()) ^^ { case _ ~ x0 => ImportSpecifier0(x0, args) })("ImportSpecifier0") |
      log((MATCH ~ nt("IdentifierName", IdentifierName) <~ t("as")) ~ ImportedBinding(List()) ^^ { case _ ~ x0 ~ x1 => ImportSpecifier1(x0, x1, args) })("ImportSpecifier1")
    ))("ImportSpecifier")
  })
  lazy val ModuleSpecifier: ESParser[ModuleSpecifier] = memo(args => {
    log((
      log(MATCH ~ nt("StringLiteral", StringLiteral) ^^ { case _ ~ x0 => ModuleSpecifier0(x0, args) })("ModuleSpecifier0")
    ))("ModuleSpecifier")
  })
  lazy val ImportedBinding: ESParser[ImportedBinding] = memo(args => {
    log((
      log(MATCH ~ BindingIdentifier(List(false, false)) ^^ { case _ ~ x0 => ImportedBinding0(x0, args) })("ImportedBinding0")
    ))("ImportedBinding")
  })
  lazy val ExportDeclaration: ESParser[ExportDeclaration] = memo(args => {
    log((
      log((((MATCH <~ t("export")) <~ t("*")) ~ FromClause(List()) <~ t(";")) ^^ { case _ ~ x0 => ExportDeclaration0(x0, args) })("ExportDeclaration0") |
      log(((MATCH <~ t("export")) ~ ExportClause(List()) ~ FromClause(List()) <~ t(";")) ^^ { case _ ~ x0 ~ x1 => ExportDeclaration1(x0, x1, args) })("ExportDeclaration1") |
      log(((MATCH <~ t("export")) ~ ExportClause(List()) <~ t(";")) ^^ { case _ ~ x0 => ExportDeclaration2(x0, args) })("ExportDeclaration2") |
      log((MATCH <~ t("export")) ~ VariableStatement(List(false, false)) ^^ { case _ ~ x0 => ExportDeclaration3(x0, args) })("ExportDeclaration3") |
      log((MATCH <~ t("export")) ~ Declaration(List(false, false)) ^^ { case _ ~ x0 => ExportDeclaration4(x0, args) })("ExportDeclaration4") |
      log(((MATCH <~ t("export")) <~ t("default")) ~ HoistableDeclaration(List(false, false, true)) ^^ { case _ ~ x0 => ExportDeclaration5(x0, args) })("ExportDeclaration5") |
      log(((MATCH <~ t("export")) <~ t("default")) ~ ClassDeclaration(List(false, false, true)) ^^ { case _ ~ x0 => ExportDeclaration6(x0, args) })("ExportDeclaration6") |
      log(((((MATCH <~ t("export")) <~ t("default")) <~ -ntl(ss("function" <~ not(IDContinue)) | ss("async" <~ not(IDContinue), strNoLineTerminator, "function" <~ not(IDContinue)) | ss("class" <~ not(IDContinue)))) ~ AssignmentExpression(List(true, false, false)) <~ t(";")) ^^ { case _ ~ x0 => ExportDeclaration7(x0, args) })("ExportDeclaration7")
    ))("ExportDeclaration")
  })
  lazy val ExportClause: ESParser[ExportClause] = memo(args => {
    log((
      log(((MATCH <~ t("{")) <~ t("}")) ^^ { case _ => ExportClause0(args) })("ExportClause0") |
      log(((MATCH <~ t("{")) ~ ExportsList(List()) <~ t("}")) ^^ { case _ ~ x0 => ExportClause1(x0, args) })("ExportClause1") |
      log((((MATCH <~ t("{")) ~ ExportsList(List()) <~ t(",")) <~ t("}")) ^^ { case _ ~ x0 => ExportClause2(x0, args) })("ExportClause2")
    ))("ExportClause")
  })
  lazy val ExportsList: ESParser[ExportsList] = memo(args => {
    log(resolveLL(
      log(MATCH ~ ExportSpecifier(List()) ^^ { case _ ~ x0 => ExportsList0(x0, args) })("ExportsList0"),
      log((MATCH <~ t(",")) ~ ExportSpecifier(List()) ^^ { case _ ~ x0 => ((x: ExportsList) => ExportsList1(x, x0, args)) })("ExportsList1")
    ))("ExportsList")
  })
  lazy val ExportSpecifier: ESParser[ExportSpecifier] = memo(args => {
    log((
      log(MATCH ~ nt("IdentifierName", IdentifierName) ^^ { case _ ~ x0 => ExportSpecifier0(x0, args) })("ExportSpecifier0") |
      log((MATCH ~ nt("IdentifierName", IdentifierName) <~ t("as")) ~ nt("IdentifierName", IdentifierName) ^^ { case _ ~ x0 ~ x1 => ExportSpecifier1(x0, x1, args) })("ExportSpecifier1")
    ))("ExportSpecifier")
  })
  val TERMINAL: Lexer = (
    "%=" |||
    "^=" |||
    "?" |||
    ">>>" |||
    "var" |||
    "import" |||
    ">>>=" |||
    "void" |||
    "default" |||
    "static" |||
    "continue" |||
    "+" |||
    "get" |||
    "extends" |||
    "{" |||
    ";" |||
    "/" |||
    "/=" |||
    "&&" |||
    "of" |||
    "debugger" |||
    "let" |||
    "try" |||
    "..." |||
    "with" |||
    "-=" |||
    "]" |||
    ">>" |||
    "!" |||
    "<<=" |||
    "|=" |||
    ">>=" |||
    "switch" |||
    "<" |||
    "finally" |||
    "super" |||
    "=>" |||
    "," |||
    "delete" |||
    ":" |||
    "while" |||
    "&" |||
    "*" |||
    "function" |||
    ">" |||
    "export" |||
    "+=" |||
    "." |||
    "^" |||
    "%" |||
    "const" |||
    "await" |||
    "===" |||
    ")" |||
    "-" |||
    "--" |||
    "new" |||
    "++" |||
    "!=" |||
    "[" |||
    "target" |||
    "throw" |||
    "if" |||
    ">=" |||
    "&=" |||
    "catch" |||
    "async" |||
    "||" |||
    "break" |||
    "==" |||
    "=" |||
    "set" |||
    "|" |||
    "**" |||
    "(" |||
    "}" |||
    "**=" |||
    "this" |||
    "as" |||
    "typeof" |||
    "*=" |||
    "<=" |||
    "else" |||
    "case" |||
    "~" |||
    "<<" |||
    "yield" |||
    "for" |||
    "return" |||
    "!==" |||
    "from" |||
    "in" |||
    "instanceof" |||
    "do" |||
    "class"
  )
  val rules: Map[String, ESParser[AST]] = Map(
    "IdentifierReference" -> IdentifierReference,
    "BindingIdentifier" -> BindingIdentifier,
    "Identifier" -> Identifier,
    "AsyncArrowBindingIdentifier" -> AsyncArrowBindingIdentifier,
    "LabelIdentifier" -> LabelIdentifier,
    "PrimaryExpression" -> PrimaryExpression,
    "CoverParenthesizedExpressionAndArrowParameterList" -> CoverParenthesizedExpressionAndArrowParameterList,
    "ParenthesizedExpression" -> ParenthesizedExpression,
    "Literal" -> Literal,
    "ArrayLiteral" -> ArrayLiteral,
    "ElementList" -> ElementList,
    "Elision" -> Elision,
    "SpreadElement" -> SpreadElement,
    "ObjectLiteral" -> ObjectLiteral,
    "PropertyDefinitionList" -> PropertyDefinitionList,
    "PropertyDefinition" -> PropertyDefinition,
    "PropertyName" -> PropertyName,
    "LiteralPropertyName" -> LiteralPropertyName,
    "ComputedPropertyName" -> ComputedPropertyName,
    "CoverInitializedName" -> CoverInitializedName,
    "Initializer" -> Initializer,
    "TemplateLiteral" -> TemplateLiteral,
    "SubstitutionTemplate" -> SubstitutionTemplate,
    "TemplateSpans" -> TemplateSpans,
    "TemplateMiddleList" -> TemplateMiddleList,
    "MemberExpression" -> MemberExpression,
    "SuperProperty" -> SuperProperty,
    "MetaProperty" -> MetaProperty,
    "NewTarget" -> NewTarget,
    "NewExpression" -> NewExpression,
    "CallExpression" -> CallExpression,
    "CoverCallExpressionAndAsyncArrowHead" -> CoverCallExpressionAndAsyncArrowHead,
    "CallMemberExpression" -> CallMemberExpression,
    "SuperCall" -> SuperCall,
    "ImportCall" -> ImportCall,
    "Arguments" -> Arguments,
    "ArgumentList" -> ArgumentList,
    "LeftHandSideExpression" -> LeftHandSideExpression,
    "UpdateExpression" -> UpdateExpression,
    "UnaryExpression" -> UnaryExpression,
    "ExponentiationExpression" -> ExponentiationExpression,
    "MultiplicativeExpression" -> MultiplicativeExpression,
    "MultiplicativeOperator" -> MultiplicativeOperator,
    "AdditiveExpression" -> AdditiveExpression,
    "ShiftExpression" -> ShiftExpression,
    "RelationalExpression" -> RelationalExpression,
    "EqualityExpression" -> EqualityExpression,
    "BitwiseANDExpression" -> BitwiseANDExpression,
    "BitwiseXORExpression" -> BitwiseXORExpression,
    "BitwiseORExpression" -> BitwiseORExpression,
    "LogicalANDExpression" -> LogicalANDExpression,
    "LogicalORExpression" -> LogicalORExpression,
    "ConditionalExpression" -> ConditionalExpression,
    "AssignmentExpression" -> AssignmentExpression,
    "AssignmentPattern" -> AssignmentPattern,
    "ObjectAssignmentPattern" -> ObjectAssignmentPattern,
    "ArrayAssignmentPattern" -> ArrayAssignmentPattern,
    "AssignmentRestProperty" -> AssignmentRestProperty,
    "AssignmentPropertyList" -> AssignmentPropertyList,
    "AssignmentElementList" -> AssignmentElementList,
    "AssignmentElisionElement" -> AssignmentElisionElement,
    "AssignmentProperty" -> AssignmentProperty,
    "AssignmentElement" -> AssignmentElement,
    "AssignmentRestElement" -> AssignmentRestElement,
    "DestructuringAssignmentTarget" -> DestructuringAssignmentTarget,
    "AssignmentOperator" -> AssignmentOperator,
    "Expression" -> Expression,
    "Statement" -> Statement,
    "Declaration" -> Declaration,
    "HoistableDeclaration" -> HoistableDeclaration,
    "BreakableStatement" -> BreakableStatement,
    "BlockStatement" -> BlockStatement,
    "Block" -> Block,
    "StatementList" -> StatementList,
    "StatementListItem" -> StatementListItem,
    "LexicalDeclaration" -> LexicalDeclaration,
    "LetOrConst" -> LetOrConst,
    "BindingList" -> BindingList,
    "LexicalBinding" -> LexicalBinding,
    "VariableStatement" -> VariableStatement,
    "VariableDeclarationList" -> VariableDeclarationList,
    "VariableDeclaration" -> VariableDeclaration,
    "BindingPattern" -> BindingPattern,
    "ObjectBindingPattern" -> ObjectBindingPattern,
    "ArrayBindingPattern" -> ArrayBindingPattern,
    "BindingRestProperty" -> BindingRestProperty,
    "BindingPropertyList" -> BindingPropertyList,
    "BindingElementList" -> BindingElementList,
    "BindingElisionElement" -> BindingElisionElement,
    "BindingProperty" -> BindingProperty,
    "BindingElement" -> BindingElement,
    "SingleNameBinding" -> SingleNameBinding,
    "BindingRestElement" -> BindingRestElement,
    "EmptyStatement" -> EmptyStatement,
    "ExpressionStatement" -> ExpressionStatement,
    "IfStatement" -> IfStatement,
    "IterationStatement" -> IterationStatement,
    "ForDeclaration" -> ForDeclaration,
    "ForBinding" -> ForBinding,
    "ContinueStatement" -> ContinueStatement,
    "BreakStatement" -> BreakStatement,
    "ReturnStatement" -> ReturnStatement,
    "WithStatement" -> WithStatement,
    "SwitchStatement" -> SwitchStatement,
    "CaseBlock" -> CaseBlock,
    "CaseClauses" -> CaseClauses,
    "CaseClause" -> CaseClause,
    "DefaultClause" -> DefaultClause,
    "LabelledStatement" -> LabelledStatement,
    "LabelledItem" -> LabelledItem,
    "ThrowStatement" -> ThrowStatement,
    "TryStatement" -> TryStatement,
    "Catch" -> Catch,
    "Finally" -> Finally,
    "CatchParameter" -> CatchParameter,
    "DebuggerStatement" -> DebuggerStatement,
    "FunctionDeclaration" -> FunctionDeclaration,
    "FunctionExpression" -> FunctionExpression,
    "UniqueFormalParameters" -> UniqueFormalParameters,
    "FormalParameters" -> FormalParameters,
    "FormalParameterList" -> FormalParameterList,
    "FunctionRestParameter" -> FunctionRestParameter,
    "FormalParameter" -> FormalParameter,
    "FunctionBody" -> FunctionBody,
    "FunctionStatementList" -> FunctionStatementList,
    "ArrowFunction" -> ArrowFunction,
    "ArrowParameters" -> ArrowParameters,
    "ConciseBody" -> ConciseBody,
    "ArrowFormalParameters" -> ArrowFormalParameters,
    "AsyncArrowFunction" -> AsyncArrowFunction,
    "AsyncConciseBody" -> AsyncConciseBody,
    "AsyncArrowHead" -> AsyncArrowHead,
    "MethodDefinition" -> MethodDefinition,
    "PropertySetParameterList" -> PropertySetParameterList,
    "GeneratorMethod" -> GeneratorMethod,
    "GeneratorDeclaration" -> GeneratorDeclaration,
    "GeneratorExpression" -> GeneratorExpression,
    "GeneratorBody" -> GeneratorBody,
    "YieldExpression" -> YieldExpression,
    "AsyncGeneratorMethod" -> AsyncGeneratorMethod,
    "AsyncGeneratorDeclaration" -> AsyncGeneratorDeclaration,
    "AsyncGeneratorExpression" -> AsyncGeneratorExpression,
    "AsyncGeneratorBody" -> AsyncGeneratorBody,
    "AsyncMethod" -> AsyncMethod,
    "AsyncFunctionDeclaration" -> AsyncFunctionDeclaration,
    "AsyncFunctionExpression" -> AsyncFunctionExpression,
    "AsyncFunctionBody" -> AsyncFunctionBody,
    "AwaitExpression" -> AwaitExpression,
    "ClassDeclaration" -> ClassDeclaration,
    "ClassExpression" -> ClassExpression,
    "ClassTail" -> ClassTail,
    "ClassHeritage" -> ClassHeritage,
    "ClassBody" -> ClassBody,
    "ClassElementList" -> ClassElementList,
    "ClassElement" -> ClassElement,
    "Script" -> Script,
    "ScriptBody" -> ScriptBody,
    "Module" -> Module,
    "ModuleBody" -> ModuleBody,
    "ModuleItemList" -> ModuleItemList,
    "ModuleItem" -> ModuleItem,
    "ImportDeclaration" -> ImportDeclaration,
    "ImportClause" -> ImportClause,
    "ImportedDefaultBinding" -> ImportedDefaultBinding,
    "NameSpaceImport" -> NameSpaceImport,
    "NamedImports" -> NamedImports,
    "FromClause" -> FromClause,
    "ImportsList" -> ImportsList,
    "ImportSpecifier" -> ImportSpecifier,
    "ModuleSpecifier" -> ModuleSpecifier,
    "ImportedBinding" -> ImportedBinding,
    "ExportDeclaration" -> ExportDeclaration,
    "ExportClause" -> ExportClause,
    "ExportsList" -> ExportsList,
    "ExportSpecifier" -> ExportSpecifier
  )
}
