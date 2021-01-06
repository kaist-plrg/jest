package kr.ac.kaist

import kr.ac.kaist.jest.localizer._
import kr.ac.kaist.jest.error._
import java.io.File

package object jest {
  // Line seperator
  val LINE_SEP = System.getProperty("line.separator")

  // Base project directory root
  val BASE_DIR = System.getenv("JEST_HOME")

  // Tests directory root
  val TEST_DIR = s"${BASE_DIR}/tests"

  // Source directory root
  val SRC_DIR = s"${BASE_DIR}/src/main"

  // Source directory root
  val RESOURCE_DIR = s"${SRC_DIR}/resources"

  // Scala source directory root
  val SCALA_DIR = s"${SRC_DIR}/scala/kr/ac/kaist/jest"

  // Model directory root
  val MODEL_DIR = s"${SCALA_DIR}/model"

  // Differential testing directory
  val DIFF_TEST_DIR = s"${BASE_DIR}/lib/diff-test"

  // Bug directories
  val ANSWER_DIR = s"${BASE_DIR}/answer"

  // Result directories
  val RESULT_DIR = s"${BASE_DIR}/result"
  val SEED_DIR = s"${RESULT_DIR}/seed"
  val PROGRAMS_DIR = s"${RESULT_DIR}/programs"
  val TESTS_DIR = s"${RESULT_DIR}/tests"
  val BUGS_DIR = s"${RESULT_DIR}/bugs"

  // Log directories
  val LOGS_DIR = s"${BASE_DIR}/logs"
  val GENERATE_DIR = s"${LOGS_DIR}/generate"
  val INJECT_DIR = s"${LOGS_DIR}/inject"
  val INJECT_EXC_DIR = s"${INJECT_DIR}/exception"
  val TOUCHED_ALGO_DIR = s"${INJECT_DIR}/touched/algo"
  val TOUCHED_INST_DIR = s"${INJECT_DIR}/touched/inst"
  val LOCALIZE_DIR = s"${LOGS_DIR}/localize"

  // Current directory root
  val CUR_DIR = System.getProperty("user.dir")

  // Detail
  var DETAIL: Boolean = false

  // Debugging mode
  var DEBUG: Boolean = false
  val DEBUG_SEMI_INSERT: Boolean = false
  val DEBUG_PARSER: Boolean = false
  val DEBUG_INTERP: Boolean = false
  val DEBUG_FILTER: Boolean = false

  // Coverage check mode
  val COVERAGE_MODE: Boolean = true

  // Bug-fix mode
  var BUG_FIX: Boolean = false

  // Error
  def err(msg: String) = throw new JESTError(msg)
}
