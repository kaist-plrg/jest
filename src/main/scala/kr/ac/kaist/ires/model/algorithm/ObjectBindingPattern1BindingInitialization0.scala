package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectBindingPattern1BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern1BindingInitialization0""", List(Id("""this"""), Id("""BindingRestProperty"""), Id("""value"""), Id("""environment""")), None, ISeq(List(ILet(Id("""excludedNames"""), EList(List())), IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestProperty"""))), EStr("""RestBindingInitialization""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""excludedNames"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "ObjectBindingPattern1BindingInitialization0" (this, BindingRestProperty, value, environment) => {
    let excludedNames = (new [])
    access __x0__ = (BindingRestProperty "RestBindingInitialization")
    app __x1__ = (__x0__ value environment excludedNames)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
