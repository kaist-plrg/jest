package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""ModuleEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List()))
  /* Beautified form:
  "ModuleEnvironmentRecord.DeleteBinding" (this, N) => {}
  */
}
