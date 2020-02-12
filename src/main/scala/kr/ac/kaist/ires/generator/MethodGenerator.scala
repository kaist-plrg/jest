package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.core._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.algorithm.Algorithm
import kr.ac.kaist.ires.model.AlgoCompiler

object MethodGenerator {
  def apply(packageName: String, modelDir: String, name: String): Unit = {
    val scalaName = getScalaName(name)
    val algo = Algorithm(s"$RESOURCE_DIR/$VERSION/auto/algorithm/$name.json")
    val len = algo.length
    val (func, _) = AlgoCompiler(name, algo).result

    val nf = getPrintWriter(s"$modelDir/algorithm/$scalaName.scala")
    val TRIPLE = "\"\"\""
    nf.println(s"""package $packageName.model""")
    nf.println(s"""""")
    nf.println(s"""import $packageName.core._""")
    nf.println(s"""import $packageName.core.Parser._""")
    nf.println(s"""""")
    nf.println(s"""object $scalaName {""")
    nf.println(s"""  val length: Int = $len""")
    nf.println(s"""  val func: Func = $func""")
    nf.println(s"""  /* Beautified form:""")
    nf.println(s"""  ${beautify(func, "  ")}""")
    nf.println(s"""  */""")
    nf.println(s"""}""")
    nf.close()
  }
}
