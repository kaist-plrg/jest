package kr.ac.kaist.ires

import java.io._
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.phase._
import org.scalatest._
import scala.util.Random.shuffle

class BasicIRTest extends IRTest {
  // tag name
  val tag: String = "irTest"

  // basic ir files
  val irDir = s"$TEST_DIR/ir"

  // registration
  for (file <- shuffle(walkTree(new File(irDir)))) {
    val filename = file.getName
    if (irFilter(filename)) {
      lazy val name = file.toString
      lazy val config = aseConfig.copy(fileNames = List(name))

      lazy val pgm = IRParse((), config)
      check("IRParse", filename, parseIRTest(pgm))

      lazy val st = IREval(IRLoad(pgm, config), config)
      check("IREval", filename, evalIRTest(st))
    }
  }
}
