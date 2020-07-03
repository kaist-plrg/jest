package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.modifier.Modifier
import kr.ac.kaist.ires.util.Useful._

// Modify phase
case object Modify extends PhaseObj[Unit, ModifyConfig, Unit] {
  val name = "modify"
  val help = "Modify JavaScript files with additional semantics assertions."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: ModifyConfig
  ): Unit = for {
    file <- walkTree(GENERATED_DIR)
    name = file.getName
    filename = file.toString if jsFilter(filename)
    js = readFile(filename)
    parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
    script = parseResult.get
  } {
    val modified = Modifier(script).result
    println(s"- $MODIFIED_DIR/$name")
    println(s"  $script")
    println(s"  ====>")
    println(s"  $modified")
    dumpFile(modified, s"$MODIFIED_DIR/$name")
  }

  def defaultConfig: ModifyConfig = ModifyConfig()
  val options: List[PhaseOption[ModifyConfig]] = List()
}

// Modify phase config
case class ModifyConfig() extends Config
