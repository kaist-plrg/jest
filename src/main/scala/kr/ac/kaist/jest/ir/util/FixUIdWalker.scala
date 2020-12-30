package kr.ac.kaist.jest.ir

import kr.ac.kaist.jest.COVERAGE_MODE
import kr.ac.kaist.jest.model.Algorithm

// Walker that fixes the unique id of instructions
object FixUIdWalker {
  trait FixUId extends UnitWalker {
    val algo: Algorithm
    override def walk(inst: Inst): Unit = {
      inst.setAlgo(algo)
      inst.uid
      super.walk(inst)
    }
  }
  def apply(func: Func, algorithm: Algorithm): Func = if (!COVERAGE_MODE) func else {
    val walker = new FixUId { val algo = algorithm }
    walker.walk(func)
    func
  }
}
