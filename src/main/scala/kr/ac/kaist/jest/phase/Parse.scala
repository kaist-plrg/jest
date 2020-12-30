package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest.{ LINE_SEP, JESTConfig }
import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.util._
import scala.io.Source
import Useful._

// Parse phase
case object Parse extends PhaseObj[Unit, ParseConfig, Script] {
  val name = "parse"
  val help = "Parses AST files."

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: ParseConfig
  ): Script = {
    val filename = getFirstFilename(jestConfig, "parse")
    val ast = Parser.parse(Parser.Script(Nil), fileReader(filename)).get
    config.jsonFile match {
      case Some(name) =>
        val nf = getPrintWriter(name)
        nf.println(ast.toJson)
        nf.close()
      case None =>
    }
    ast
  }

  def defaultConfig: ParseConfig = ParseConfig()
  val options: List[PhaseOption[ParseConfig]] = List(
    ("json", StrOption((c, s) => c.jsonFile = Some(s)),
      "dump JSON of AST tree into a file.")
  )
}

// Parse phase config
case class ParseConfig(
    var jsonFile: Option[String] = None,
    var debug: Boolean = false
) extends Config
