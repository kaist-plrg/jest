package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.model.{ Parser => JSParser }
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.phase._
import org.scalatest._
import scala.util.Random.shuffle

class JSTest extends IRTest with EvalTest {
  // tag name
  val tag: String = "jsTest"

  // base directory
  val jsDir = s"$TEST_DIR/js"

  // tests for js-parser
  def parseJSTest(ast: => AST): Unit = {
    val newAST = JSParser.parse(JSParser.Script(Nil), ast.toString).get
    assert(ast == newAST)
  }

  // tests for js-interpreter
  def evalJSTest(st: => State): Unit = st.context.locals.get(st.context.retId) match {
    case Some(addr: Addr) => st.heap(addr, Str("Type")) match {
      case (addr: Addr) =>
        assert(addr == st.globals.getOrElse(Id("CONST_normal"), Absent))
      case v => fail(s"invalid completion type: $v")
    }
    case Some(v) => fail(s"return not an address: $v")
    case None => fail("no return value")
  }

  val js2ir = changeExt("js", "ir")

  // registration
  for (file <- shuffle(walkTree(new File(jsDir)))) {
    val filename = file.getName
    if (jsFilter(filename)) {
      lazy val name = removedExt(filename)
      lazy val jsName = file.toString
      lazy val jsConfig = aseConfig.copy(fileNames = List(jsName))

      lazy val ast = Parse((), jsConfig)
      check("JSParse", name, parseJSTest(ast))

      lazy val st = IREval(Load(ast, jsConfig), jsConfig)
      check("JSEval", name, evalJSTest(st))

      lazy val irName = js2ir(jsName)
      lazy val irConfig = aseConfig.copy(fileNames = List(irName))

      lazy val pgm = IRParse((), irConfig)
      lazy val irSt = IREval(st.copy(context = st.context.copy(insts = pgm.insts)), irConfig)
      check("JSCheck", name, {
        parseIRTest(pgm)
        evalIRTest(irSt)
      })
    }
  }
}
