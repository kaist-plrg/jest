package kr.ac.kaist.ires.sampler

import spray.json._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.{ model, AST, Lexical }

case class RHSElem(rhsName: String, params: List[Boolean], o: Int)
case class RHSTracer(ast: AST) extends model.UnitWalker {
  var covered: Set[RHSElem] = Set()

  override def beforeWalk[T <: AST](ast: T): Unit =
    covered = covered + RHSElem(ast.name, ast.parserParams, ast.k)

  def getCovered: Set[RHSElem] = { walk(ast); covered }

  // def test(): Unit = {
  //   val ast = Parser.parse(Parser.Script(Nil), "var x = 42;").get
  //   walk(ast)
  //   tests.foreach {
  //     case RHSElem(r, p, o) => println(s"$r[$p][$o]")
  //   }
  // }
}

object RHSElemProtocol extends DefaultJsonProtocol {
  implicit val RHSElemFormat = jsonFormat3(RHSElem)
}