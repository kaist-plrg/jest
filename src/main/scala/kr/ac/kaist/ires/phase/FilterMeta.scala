package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import kr.ac.kaist.ires.parser.{ MetaParser, MetaData }
import kr.ac.kaist.ires.util.Useful._
import java.io._

import spray.json._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.TestConfigJsonProtocol._

// FilterMeta phase
case object FilterMeta extends PhaseObj[Unit, FilterMetaConfig, Unit] {
  val name = "extract-meta"
  val help = "Extracts metadata"
  val standardFeatures = List(
    "ArrayBuffer",
    "Array.prototype.values",
    "arrow-function",
    "async-iteration",
    "async-functions",
    "Atomics",
    "caller",
    "class",
    "computed-property-names",
    "const",
    "cross-realm",
    "DataView",
    "DataView.prototype.getFloat32",
    "DataView.prototype.getFloat64",
    "DataView.prototype.getInt16",
    "DataView.prototype.getInt32",
    "DataView.prototype.getInt8",
    "DataView.prototype.getUint16",
    "DataView.prototype.getUint32",
    "DataView.prototype.setUint8",
    "default-parameters",
    "destructuring-assignment",
    "destructuring-binding",
    "for-of",
    "Float32Array",
    "Float64Array",
    "generators",
    "Int8Array",
    "Int32Array",
    "json-superset",
    "let",
    "Map",
    "new.target",
    "object-rest",
    "object-spread",
    "Object.is",
    "optional-catch-binding",
    "Promise.prototype.finally",
    "Proxy",
    "Reflect",
    "Reflect.construct",
    "Reflect.set",
    "Reflect.setPrototypeOf",
    "regexp-dotall",
    "regexp-lookbehind",
    "regexp-named-groups",
    "regexp-unicode-property-escapes",
    "rest-parameters",
    "Set",
    "SharedArrayBuffer",
    "String.fromCodePoint",
    "String.prototype.endsWith",
    "String.prototype.includes",
    "super",
    "Symbol",
    "Symbol.asyncIterator",
    "Symbol.hasInstance",
    "Symbol.isConcatSpreadable",
    "Symbol.iterator",
    "Symbol.match",
    "Symbol.replace",
    "Symbol.search",
    "Symbol.species",
    "Symbol.split",
    "Symbol.toPrimitive",
    "Symbol.toStringTag",
    "Symbol.unscopables",
    "tail-call-optimization",
    "template",
    "TypedArray",
    "u180e",
    "Uint8Array",
    "Uint16Array",
    "Uint8ClampedArray",
    "WeakMap",
    "WeakSet"
  ) ++ List(
      "proxy-missing-checks",
      "Promise.allSettled",
      "Object.fromEntries",
      "BigInt",
      "dynamic-import",
      "Array.prototype.flat",
      "Array.prototype.flatMap",
      "string-trimming",
      "String.prototype.trimEnd",
      "String.prototype.trimStart",
      "String.prototype.matchAll",
      "Symbol.matchAll",
      "Symbol.prototype.description",
      "well-formed-json-stringify",
      "globalThis",
      "export-star-as-namespace-from-module",
      "import.meta",
      "optional-chaining",
      "coalesce-expression",
      "for-in-order"
    )

  lazy val manualDebatable = Set(
    // IteratorClose
    "language/statements/for-of/iterator-close-throw-get-method-abrupt.js",
    "language/statements/for-of/iterator-close-throw-get-method-non-callable.js",
    // Test262
    "language/global-code/decl-lex-configurable-global.js"
  )

  lazy val manualNonstrict = Set(
    "language/eval-code/indirect/always-non-strict",
    "language/eval-code/indirect/non-definable-global-function",
    "language/eval-code/indirect/non-definable-global-generator",
    "language/eval-code/indirect/non-definable-global-var",
    "language/eval-code/indirect/var-env-func-init-global-new",
    "language/eval-code/indirect/var-env-func-init-global-update-configurable",
    "language/eval-code/indirect/var-env-func-init-multi",
    "language/eval-code/indirect/var-env-func-non-strict",
    "language/eval-code/indirect/var-env-global-lex-non-strict",
    "language/eval-code/indirect/var-env-var-init-global-exstng",
    "language/eval-code/indirect/var-env-var-init-global-new",
    "language/eval-code/indirect/var-env-var-non-strict",
    "language/statements/variable/12.2.1-21-s"
  )

  lazy val manualEarlyError = Set(
    "language/arguments-object/10.5-1-s.js",
    "language/arguments-object/10.5-7-b-1-s.js",
    "language/eval-code/direct/parse-failure-3.js",
    "language/eval-code/direct/parse-failure-4.js",
    "language/eval-code/direct/super-prop.js",
    "language/eval-code/direct/super-prop-arrow.js",
    "language/eval-code/indirect/new.target.js",
    "language/eval-code/indirect/parse-failure-3.js",
    "language/eval-code/indirect/parse-failure-4.js",
    "language/eval-code/indirect/super-prop.js",
    "language/expressions/call/eval-strictness-inherit-strict.js",
    "language/statements/break/S12.8_A7.js",
    "language/statements/continue/S12.7_A7.js",
    "language/statements/function/13.0-8-s.js",
    "language/statements/function/13.1-2-s.js",
    "language/statements/function/13.1-4-s.js",
    "language/statements/try/catch-parameter-boundnames-restriction-arguments-eval-throws.js",
    "language/statements/try/catch-parameter-boundnames-restriction-eval-eval-throws.js",
    "language/statements/variable/12.2.1-18-s.js",
    "language/statements/variable/12.2.1-19-s.js",
    "language/statements/variable/12.2.1-2-s.js",
    "language/statements/variable/12.2.1-21-s.js",
    "language/statements/variable/12.2.1-22-s.js",
    "language/statements/variable/12.2.1-3-s.js",
    "language/statements/variable/12.2.1-4-s.js",
    "language/statements/variable/12.2.1-7-s.js",
    "language/statements/variable/12.2.1-8-s.js",
    "language/statements/with/12.10.1-10-s.js"
  )

  lazy val test262Dir = s"$TEST_DIR/test262/test"
  lazy val allTests = TestList(
    walkTree(new File(test262Dir))
      .toList
      .filter(f => jsFilter(f.getName))
      .map(x => MetaParser(x.toString, test262Dir))
  )

  def getTests(features: List[String]): TestList = allTests
    .remove("harness", _.name startsWith "harness")
    .remove("internationalisation", _.name startsWith "intl")
    .remove("annex", _.name startsWith "annex")
    .remove("in-progress features", m => (!m.features.forall(features contains _)))
    .remove("module", m => (
      (m.flags contains "module") ||
      (m.name startsWith "language/module-code/") ||
      (m.name startsWith "language/expressions/dynamic-import/") ||
      (m.name startsWith "language/expressions/import.meta/")
    ))
    .remove("manual", m => (
      (manualDebatable contains m.name) ||
      (manualEarlyError contains m.name) ||
      (manualNonstrict contains m.name)
    ))
    .remove("not supported flags", m => (
      (m.flags contains "CanBlockIsFalse") ||
      (m.flags contains "CanBlockIsTrue") ||
      (m.flags contains "async") ||
      (m.flags contains "noStrict") ||
      (m.flags contains "raw") ||
      !m.locales.isEmpty
    ))

  lazy val test262configSummary =
    getTests(standardFeatures)
      .remove("negative", m => !m.negative.isEmpty)
      .getSummary

  // lazy val test262LongconfigSummary = getTests(standardFeatures)
  //   .remove("non longTest", m => !(longTest contains removedExt(m.name)))
  //   .getSummary

  // lazy val test262VeryLongconfigSummary = getTests(standardFeatures)
  //   .remove("non veryLongTest", m => !(veryLongTest contains removedExt(m.name)))
  //   .getSummary

  lazy val test262ManualSet: Set[String] = try {
    readFile(s"$TEST_DIR/manual.json").parseJson.convertTo[Set[String]]
  } catch {
    case e: Throwable => Set()
  }
  lazy val test262ManualconfigSummary = allTests
    .remove("not-candidate", m => !(test262ManualSet contains m.name))
    .getSummary

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: FilterMetaConfig
  ): Unit = {
    println(s"Total ${allTests.length} tests")
    val summary = getTests(standardFeatures).getSummary
    println(s"applicable tests: ${summary.summary.size}")
  }

  def defaultConfig: FilterMetaConfig = FilterMetaConfig()
  val options: List[PhaseOption[FilterMetaConfig]] = List()
}

// FilterMeta phase config
case class FilterMetaConfig() extends Config
