package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.util.Useful._

object ValueSampler {
  // manual value strings
  val values: List[String] = List(
    // Undefined
    "undefined",
    // Null
    "null",
    // Boolean
    "true", "false",
    // String
    "''", "'str'", "'0'",
    // Symbol
    "Symbol.asyncIterator",
    "Symbol.hasInstance",
    "Symbol.isConcatSpreadable",
    "Symbol.iterator",
    "Symbol.match",
    "Symbol.matchAll",
    "Symbol.replace",
    "Symbol.search",
    "Symbol.species",
    "Symbol.split",
    "Symbol.toPrimitive",
    "Symbol.toStringTag",
    "Symbol.unscopables",
    // Number
    "0", "-0", "1", "-1", "Infinity", "-Infinity", "NaN",
    // BigInt
    "0n", "-1n", "42n",
    // Object
    "{}", "{p: 42}",
    "[]", "[42, 'str', true]",
    "() => {}", "x => {}",
    // Error
    "BigInt('x')", // SyntaxError
    "Number(Symbol.iterator)", // TypeError
    "FREE", // ReferenceError
    "BigInt(0.1)" // RangeError
  )

  // list of PrimaryExpression
  val primExprs: List[PrimaryExpression] = values.map(value => {
    val parser = Parser.PrimaryExpression(List(false, false))
    Parser.parse(parser, value).getOrElse(Parser.parse(parser, s"($value)").get)
  })

  // list of AssignmentExpression
  val assignExprs: List[AssignmentExpression] = values.map(value => {
    val parser = Parser.AssignmentExpression(List(false, false, false))
    Parser.parse(parser, value).get
  })

  // list of Expression
  val exprs: List[Expression] =
    assignExprs.map(Expression0(_, List(false, false, false)))
}
