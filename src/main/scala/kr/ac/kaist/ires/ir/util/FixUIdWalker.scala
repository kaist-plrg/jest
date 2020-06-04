package kr.ac.kaist.ires.ir

import kr.ac.kaist.ires.COVERAGE_MODE

// Walker that fixes the unique id of instructions
object FixUIdWalker extends UnitWalker {
  def apply(func: Func): Func = {
    if (COVERAGE_MODE) walk(func)
    func
  }
  override def walk(inst: Inst): Unit = {
    inst.uid
    super.walk(inst)
  }
}
