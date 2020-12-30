package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.model._

object ManualSampler extends Sampler {
  val scripts: List[String] = List(
    "var x = 42;",
    "let x = 42; let y = x + x;"
  )
  val defaultScripts: List[String] = List(
    // continue
    // - Statement6
    // - ContinueStatement0
    // - ContinueStatement1
    "for(;;) continue;",
    "LABEL: for(;;) continue LABEL;",
    // break
    // - Statement7
    // - BreakStatement0
    // - BreakStatement1
    "for(;;) break;",
    "LABEL: for(;;) break LABEL;",
    // super
    // - CallExpression1
    // - SuperCall0
    // - MemberExpression4
    // - SuperProperty0
    // - SuperProperty1
    "class x extends 42 { constructor() { super() } };",
    "class x  { constructor (  ) { this . x = super . x ; } } ;",
    "class x  { constructor (  ) { this . x = super [ 42 ] ; } } ;",
    // function parameters
    // - FormalParameterList1
    // - FormalParameters4
    "function x(x0, x1) {};",
    "function x(x0, ...x1) {};",
    // arrow function parameters
    // - AsyncArrowFunction1
    // - CoverParenthesizedExpressionAndArrowParameterList1
    // - CoverParenthesizedExpressionAndArrowParameterList3
    // - CoverParenthesizedExpressionAndArrowParameterList5
    "async () => {};",
    "(x, ) => {};",
    "(...x) => {};",
    "(x0, ...x1) => {};",
    // * GraalJS bugs *
    // - CoverParenthesizedExpressionAndArrowParameterList4
    // - CoverParenthesizedExpressionAndArrowParameterList6
    "(...{x}) => {};",
    "(x0, ...{x1}) => {};",
    // etc
    // - BindingList1
    // - UnaryExpression1
    // - LetOrConst1
    // - Script0
    "let x0, x1;",
    "delete x[42];",
    "const x = 42;",
    "",
    // assignment pattern(supplemenatal syntax)
    "var x = { p: 0 }; ( { p: x } = x );",
    "var x = [ 1, 2, 3 ]; ( [ x, x ] = x );",
    "var x = [ 1, 2, 3 ]; ( [ , x ] = x );",
    "var x = [ 1, 2, 3 ]; ( [ , ...x ] = x );",
    "var x = [ 1, 2, 3 ]; ( [ , x, ...x ] = x );",
    "var x = { x: 1 }; ( { ...x } = x );",
    "var x = { x: 1 }; ( { x, ...x } = x );",
    // binding element
    "function x ( [ x ] = [ 1, 2, 3 ] ) { }; x( 0 ) ;",
  // early error(always)
  // - OptionalChain3
  // - OptionalChain7
  // early error(in strict mode)
  // - IdentifierReference1
  // - BindingIdentifier1
  // - LabelIdentifier1
  // - LabelIdentifier2
  // - Statement9
  // - WithStatement0
  // - LabelledItem1
  )

  def getSample: List[Script] = getSample(true)
  def getSample(useDefault: Boolean): List[Script] = {
    val s = if (useDefault) defaultScripts else scripts
    s.filter(ValidityChecker(_)).map(Parser.parse(Parser.Script(Nil), _).get)
  }
}
