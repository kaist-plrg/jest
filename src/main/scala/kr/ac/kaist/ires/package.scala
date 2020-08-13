package kr.ac.kaist

import java.io.File

package object ires {
  // Line seperator
  val LINE_SEP = System.getProperty("line.separator")

  // Base project directory root
  val BASE_DIR = System.getenv("IRES_HOME")

  // Tests directory root
  val TEST_DIR = s"${BASE_DIR}/tests"

  // Source directory root
  val SRC_DIR = s"${BASE_DIR}/src/main"

  // Source directory root
  val RESOURCE_DIR = s"${SRC_DIR}/resources"

  // Sample directory
  val SAMPLE_DIR = s"${RESOURCE_DIR}/sample"

  // Scala source directory root
  val SCALA_DIR = s"${SRC_DIR}/scala/kr/ac/kaist/ires"

  // Model directory root
  val MODEL_DIR = s"${SCALA_DIR}/model"

  // Differential testing directories
  val DIFF_TEST_DIR = s"${BASE_DIR}/diff-test"
  val GENERATED_DIR = s"${DIFF_TEST_DIR}/generated"
  val INJECTED_DIR = s"${DIFF_TEST_DIR}/injected"
  val TOUCHED_DIR = s"${DIFF_TEST_DIR}/touched"
  val FAILED_DIR = s"${DIFF_TEST_DIR}/failed"

  // Current directory root
  val CUR_DIR = System.getProperty("user.dir")

  // Debugging mode
  val DEBUG_SEMI_INSERT: Boolean = false
  val DEBUG_PARSER: Boolean = false
  val DEBUG_INTERP: Boolean = false
  val DEBUG_FILTER: Boolean = false

  // Result directory
  val RESULT_DIR = s"$BASE_DIR/result"
  val GEN_RES_DIR = s"$RESULT_DIR/generated"
  val TEST262_RES_DIR = s"$RESULT_DIR/test262"

  // Coverage check mode
  val COVERAGE_MODE: Boolean = true
}
