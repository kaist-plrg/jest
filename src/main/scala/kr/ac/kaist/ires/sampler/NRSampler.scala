package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model.{ Parser, NonRecursiveSampler, Script, Script0 }
import kr.ac.kaist.ires.model.{ Expression, Expression0, AssignmentExpression }
import kr.ac.kaist.ires.model.{ StatementList, Statement, Declaration }
import kr.ac.kaist.ires.model.{ IdentifierReference, BindingIdentifier, LabelIdentifier }
import kr.ac.kaist.ires.sampler.ValueSampler._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.AST
import kr.ac.kaist.ires

object NRSampler extends NonRecursiveSampler with Sampler {
  // original samplers
  def origStatement: Set[Statement] = {
    visited = Set()
    super.Statement(false, false, false) ++
      super.Statement(false, false, true) ++
      super.Statement(false, true, true) ++
      super.Statement(true, false, true) ++
      super.Statement(true, true, true)
  }
  def origDeclaration: Set[Declaration] = {
    visited = Set()
    super.Declaration(false, false) ++
      super.Declaration(false, true) ++
      super.Declaration(true, false) ++
      super.Declaration(true, true)
  }
  def origAssignmentExpression: Set[AssignmentExpression] = {
    visited = Set()
    super.AssignmentExpression(false, false, false) ++
      super.AssignmentExpression(false, false, true) ++
      super.AssignmentExpression(false, true, false) ++
      super.AssignmentExpression(false, true, true) ++
      super.AssignmentExpression(true, false, false) ++
      super.AssignmentExpression(true, false, true) ++
      super.AssignmentExpression(true, true, false) ++
      super.AssignmentExpression(true, true, true)
  }

  // hooking statements
  val emptyStmtList = Set(
    Parser.parse(Parser.StatementList(List(false, false, false)), ";").get,
    Parser.parse(Parser.StatementList(List(false, false, false)), "; ;").get
  )
  override def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Set[StatementList] = emptyStmtList
  val emptyStmt = Set(Parser.parse(Parser.Statement(List(false, false, false)), ";").get)
  override def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): Set[Statement] = emptyStmt
  val basicDeclaration = Set(Parser.parse(Parser.Declaration(List(false, false)), "let x;").get)
  override def Declaration(pYield: Boolean, pAwait: Boolean): Set[Declaration] = basicDeclaration

  // hooking expressions
  val emptyString = Set(Parser.parse(Parser.AssignmentExpression(List(false, false, false)), "''").get)
  override def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Set[AssignmentExpression] = emptyString
  val emptyStringExpr = Set(
    Parser.parse(Parser.Expression(List(false, false, false)), "''").get,
    Parser.parse(Parser.Expression(List(false, false, false)), "'', ''").get
  )
  override def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): Set[Expression] = emptyStringExpr

  // get samples
  def getSample: List[Script] = {
    val parser = Parser.Script(Nil)
    getRawSample
      .toList
      // .filter(ValidityChecker(_))
      .map(rawSample => Parser.parse(parser, rawSample).getOrElse(
        Parser.parse(parser, s"async function * a () { ${rawSample} }").getOrElse(Script0(None, Nil))
      ))
  }

  def getRawSample: Set[String] = (
    origStatement.map(_.toString) ++
    origDeclaration.map(_.toString) ++
    origAssignmentExpression.map(e => s"var x = $e") ++
    Set("", "function * a () { var x = yield * ''; }")
  )

  def test: Unit = {
    // var scripts = Set[AST]()
    // scripts ++= origStatement
    // scripts ++= origDeclaration
    // scripts ++= origAssignmentExpression

    val parser = Parser.Script(Nil)
    // val fScripts =
    //   getSample
    //     .map(Parser.parse(parser, _).getOrElse(Script0(None, Nil)))

    // val sampled = RHSTracer(scripts.toList)
    val samples = getSample
    val sampled = RHSTracer(samples)
    val filtered = RHSTracer(samples.map(_.toString).filter(ValidityChecker(_)).map(Parser.parse(parser, _).get))

    println(s"sampled: ${sampled.summary}")
    println(s"filtered: ${filtered.summary}")
    // filtered.dump(s"${ires.BASE_DIR}/asdf")

    println(s"*********FILTERED*************")
    // scripts.map(_.toString).toList.filter(!ValidityChecker(_)).sorted.foreach(println)
    samples.map(_.toString).toList.filter(!ValidityChecker(_)).sorted.foreach(println)
    println(s"******************************")

    sampled.dump(s"${ires.BASE_DIR}/sampled")
    filtered.dump(s"${ires.BASE_DIR}/filtered")
  }
}
