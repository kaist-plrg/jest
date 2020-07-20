package kr.ac.kaist.ires

import java.io._
import scala.io.Source
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.coverage.Visited
import kr.ac.kaist.ires.sampler.RHSTracer
import kr.ac.kaist.ires.error.NotSupported
import kr.ac.kaist.ires.model.{ Script, Parser => JSParser, StatementListItem, ModelHelper }
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.phase._
import org.scalatest._
import scala.util.Random.shuffle
import scala.util.{ Try, Success, Failure }

import java.text.SimpleDateFormat
import java.util.Date

import spray.json._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.util.TestConfigJsonProtocol._
import scala.Console.{ CYAN, GREEN, YELLOW, RED, RESET }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._

class Test262Test extends IRESTest with EvalTest {

  sealed trait TestKind
  case object Basic extends TestKind
  // case object Long extends TestKind
  // case object VeryLong extends TestKind
  case object Manual extends TestKind

  // target scripts
  var scripts: List[Script] = Nil

  // tag name
  val tag: String = "test262Test"
  def testKind: TestKind = Basic

  // base directory
  val test262Dir = s"$TEST_DIR/test262"

  // print results after all tests
  override def afterAll(): Unit = {
    val suffix = new SimpleDateFormat("yyMMddHHmm").format(new Date())
    val map = resMap("Test262Eval")

    val filename = s"$TEST_DIR/result/${tag}_${suffix}"
    val jpw = getPrintWriter(filename)
    map.toList.sortBy { case (k, v) => k }.foreach {
      case (k, v) => jpw.println(s"$k: $v")
    }
    jpw.close()

    val failed = map.keySet.toList.sorted.filter(k => map(k) == Fail)
    dumpJson(failed, s"$TEST_DIR/failed.json")

    val yet = map.flatMap {
      case (k, Yet(msg)) => Some(k -> msg)
      case _ => None
    }
    dumpJson(yet, s"$TEST_DIR/yet.json")

    if (COVERAGE_MODE) {
      // syntax coverage
      val tracer = RHSTracer(scripts)
      println(tracer.summary)
      tracer.dump(s"$TEST262_RES_DIR/syntax")

      // semantics coverage
      val coverage = Visited.global.getCoverage
      println(coverage.summary)
      coverage.dump(s"$TEST262_RES_DIR/semantics")
    }
  }

  // tests for js-interpreter
  def evalJSTest(st: => State): Unit = {
    st.context.locals.get(st.context.retId) match {
      case Some(addr: Addr) => st.heap(addr, Str("Type")) match {
        case (addr: Addr) =>
          assert(addr == st.globals.getOrElse(Id("CONST_normal"), Absent))
          st.heap(NamedAddr("REALM"), Str("printStr")) match {
            case Str(v) => if (v contains "AsyncTestFailure") fail(s"print test failure: $v") else ()
            case _ => ()
          }
        case v => fail(s"invalid completion type: $v")
      }
      case Some(v) => fail(s"return not an address: $v")
      case None => fail("no return value")
    }
  }

  // registration
  val dir = new File(test262Dir)
  val (config, evalConfig) = testKind match {
    case Basic => (FilterMeta.test262configSummary, new IREvalConfig(timeout = Some(10)))
    // case Long => (FilterMeta.test262LongconfigSummary, new IREvalConfig(timeout = None))
    // case VeryLong => (FilterMeta.test262VeryLongconfigSummary, new IREvalConfig(timeout = None))
    case Manual => (FilterMeta.test262ManualconfigSummary, new IREvalConfig(timeout = Some(10)))
  }
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
    for (filename <- shuffle(config.nameList)) {
      val Test262Config(negative, includes, flags) = config(filename)
      val jsName = s"$test262Dir/test/$filename"
      val name = removedExt(jsName).drop(dir.toString.length)
      check("Test262Eval", filename, {
        val includeList = includes.foldLeft(initStList) {
          case (li, s) => li ++ includeMap(s).get
        }

        val jsConfig = iresConfig.copy(fileNames = List(jsName))
        val ast = Parse((), jsConfig)
        ModelHelper.checkSupported(ast)
        scripts ::= ast

        val stList = includeList ++ ModelHelper.flattenStatement(ast)
        val st = IREval(Load(ModelHelper.mergeStatement(stList), jsConfig), jsConfig, evalConfig)
        evalJSTest(st)
      })
    }
  }

  init
}

// class Test262LongTest extends Test262Test {
//   override def testKind = Long
// }

// class Test262VeryLongTest extends Test262Test {
//   override def testKind = VeryLong
// }

class Test262ManualTest extends Test262Test {
  override def testKind = Manual
}
