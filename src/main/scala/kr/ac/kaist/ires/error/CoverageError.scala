package kr.ac.kaist.ires.error

case class CoverageError(msg: String) extends IRESError({
  s"[Coverage] $msg"
})
