package kr.ac.kaist.ires.generator

import java.io.File
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires._

object PreGenerator {

  def apply(): Unit = {
    List(
      "AlgoCompiler"
    ).foreach(filename => copyFile(
        s"$RESOURCE_DIR/$VERSION/manual/$filename.scala",
        s"$MODEL_DIR/$filename.scala"
      ))
    copyFile(
      s"$RESOURCE_DIR/dummy/package2.scala",
      s"$MODEL_DIR/package.scala"
    )
  }

}

