package kr.ac.kaist.ires

import kr.ac.kaist.ires.ir.Func

trait Algorithm {
  val length: Int
  val lang: Boolean
  val func: Func
}
