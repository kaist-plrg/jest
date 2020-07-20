package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.model.{ Script, Parser => JSParser, StatementListItem, ModelHelper }
import kr.ac.kaist.ires.phase._
import kr.ac.kaist.ires.sampler.RHSTracer
import kr.ac.kaist.ires.util.TestConfigJsonProtocol._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.util._
import scala.util.Random.shuffle
import scala.util.{ Try, Success, Failure }

class Test262SyntaxTest extends IRESTest with EvalTest {
  // target scripts
  var scripts: List[Script] = Nil

  // tag name
  val tag: String = "test262SyntaxTest"

  // base directory
  val test262Dir = s"$TEST_DIR/test262"

  override def afterAll(): Unit = {}

  // registration
  val dir = new File(test262Dir)
  val config = FilterMeta.test262configSummary
  val includeNames = (config.nameList.foldLeft(Set("sta.js", "assert.js")) {
    case (set, filename) => set ++ config(filename).includes
  }).toList

  val includeMap: Map[String, Try[List[StatementListItem]]] = includeNames.foldLeft(Map[String, Try[List[StatementListItem]]]()) {
    case (imm, s) => if (imm contains s) imm else {
      val includeName = s"${dir.toString}/harness/$s"
      val jsConfig = iresConfig.copy(fileNames = List(includeName))
      val ast = Parse((), jsConfig)
      val stmtList = Try({
        ModelHelper.checkSupported(ast)
        ModelHelper.flattenStatement(ast)
      })
      imm + (s -> stmtList)
    }
  }

  def init: Unit = {
    val initStList = includeMap("sta.js").get ++ includeMap("assert.js").get

    for (filename <- shuffle(config.nameList)) try {
      val Test262Config(negative, includes, flags) = config(filename)
      val jsName = s"$test262Dir/test/$filename"
      val name = removedExt(jsName).drop(dir.toString.length)
      val includeList = includes.foldLeft(initStList) {
        case (li, s) => li ++ includeMap(s).get
      }

      val jsConfig = iresConfig.copy(fileNames = List(jsName))
      val ast = Parse((), jsConfig)
      ModelHelper.checkSupported(ast)
      scripts ::= ast
    } catch { case e: Throwable => }

    val tracer = RHSTracer(scripts)
    println(tracer.summary)
    tracer.dump(s"$TEST262_RES_DIR/syntax")
  }

  init
}
