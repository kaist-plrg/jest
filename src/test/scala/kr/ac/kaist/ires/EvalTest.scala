package kr.ac.kaist.ires

import kr.ac.kaist.ires.coverage.CoverageCheck
import kr.ac.kaist.ires.ir.Inst
import kr.ac.kaist.ires.model.Algorithm

trait EvalTest extends IRESTest {
  // initialize for coverage
  override def beforeAll(): Unit = {
    if (COVERAGE_MODE) {
      Algorithm.all
      CoverageCheck.updateTime
    }
    super.beforeAll
  }

  // show results for coverage
  override def afterAll(): Unit = {
    super.afterAll
    if (COVERAGE_MODE) CoverageCheck.showResult(detail = true)
  }
}
