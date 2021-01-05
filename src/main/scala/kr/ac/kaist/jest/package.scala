package kr.ac.kaist

import kr.ac.kaist.jest.localizer._
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
  val BUG_DIR = s"${BASE_DIR}/data"
  val LOCATIONS_DIR = s"${BUG_DIR}/locations"

  // Result directories
  val RESULT_DIR = s"${BASE_DIR}/result"
  val SEED_DIR = s"${RESULT_DIR}/seed"
  val PROGRAMS_DIR = s"${RESULT_DIR}/programs"
  val TESTS_DIR = s"${RESULT_DIR}/tests"
  val FAILED_DIR = s"${RESULT_DIR}/failed"
  val LOCALIZED_DIR = s"${RESULT_DIR}/localized"

  // Log directories
  val LOGS_DIR = s"${BASE_DIR}/logs"
  val GENERATE_DIR = s"${LOGS_DIR}/generate"
  val INJECT_DIR = s"${LOGS_DIR}/inject"
  val TOUCHED_ALGO_DIR = s"$INJECT_DIR/touched/algo"
  val TOUCHED_INST_DIR = s"$INJECT_DIR/touched/inst"

  // Current directory root
  val CUR_DIR = System.getProperty("user.dir")

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

  // formula list for SBFL
  val FORMULAS: List[Formula] = List(ER1b, Jaccard, Ochiai)
}
