package kr.ac.kaist.ires.algorithm

import kr.ac.kaist.ires.LINE_SEP
import kr.ac.kaist.ires.parser
import kr.ac.kaist.ires.util.Useful.readFile
import spray.json._

// algorithm kinds
trait AlgoKind
case object RuntimeSemantics extends AlgoKind
case object StaticSemantics extends AlgoKind
case object Method extends AlgoKind

// for evaluations
case object Language extends AlgoKind
case object Builtin extends AlgoKind
