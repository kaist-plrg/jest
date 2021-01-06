package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.coverage._
import kr.ac.kaist.jest.model.Script
import kr.ac.kaist.jest.mutator._
import kr.ac.kaist.jest.util._
import kr.ac.kaist.jest.util.Useful._

// mutate phase
case object Mutate extends PhaseObj[Script, MutateConfig, Script] {
  val name = "mutate"
  val help = "mutates given JavaScript files."

  def apply(
    script: Script,
    jestConfig: JESTConfig,
    config: MutateConfig
  ): Script = {
    var mutator: Mutator = RandomMutation(script)
    config.mutator.map(_ match {
      case nearest(uid) => mutator = NearestSyntaxTreeMutation(uid, script)
      case string(uid) => mutator = StringSubstitution(uid, script)
      case "object" => mutator = ObjectSubstitution(script)
      case "stmt" => mutator = StatementInsertion(script)
      case _ =>
    })
    val name = mutator.name
    println(s"[Mutator] $name")
    mutator.mutateOption.getOrElse(script)
  }

  def defaultConfig: MutateConfig = MutateConfig()
  case class TargetPattern(name: String) {
    val pattern = s"$name:(\\d+)".r
    def unapply(str: String) = str match {
      case pattern(uidStr) => Some(uidStr.toInt)
      case _ => None
    }
  }
  val nearest = TargetPattern("nearest")
  val string = TargetPattern("string")
  val options: List[PhaseOption[MutateConfig]] = List(
    ("mutator", StrOption((c, s) => c.mutator = Some(s)),
      "select a mutator (random, nearest(id), string(id), object, stmt).")
  )
}

// Mutate phase config
case class MutateConfig(
    var debug: Boolean = false,
    var mutator: Option[String] = None
) extends Config
