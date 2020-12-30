package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.model.{ Parser, ObjectLiteral }

object ObjectSampler {
  case class PropDef(name: String, defaults: Set[String])
  // property value set
  private val booleanVal = Set("true", "false")
  private val funcVal = Set(
    "function(x0, x1) {}",
    "function(x) {}",
    "function() {}"
  )
  private val asyncFuncVal = Set("async function(x) {}")
  private val genFuncVal = Set("function* () {}")
  private val asyncGenFuncVal = Set("async function* () {}")
  private val defaultVal = Set("null", "undefined", "0", "'str'")

  // Iterable
  private val iterableProps: Set[PropDef] = Set(
    PropDef("Symbol.iterator", genFuncVal)
  )
  // Iterator
  private val iteratorProps: Set[PropDef] = Set(
    PropDef("\"next\"", funcVal),
    PropDef("\"return\"", funcVal),
    PropDef("\"throw\"", funcVal),
  )
  // AsyncIterable
  private val asyncIterableProps: Set[PropDef] = Set(
    PropDef("Symbol.asyncIterator", asyncGenFuncVal)
  )
  // AsyncIterator
  private val asyncIteratorProps: Set[PropDef] = Set(
    PropDef("\"next\"", asyncFuncVal),
    PropDef("\"return\"", asyncFuncVal),
    PropDef("\"throw\"", asyncFuncVal),
  )
  // IterResult
  private val iterResultProps: Set[PropDef] = Set(
    PropDef("\"value\"", defaultVal),
    PropDef("\"done\"", booleanVal)
  )
  // Data Property Descriptor
  private val dataProps: Set[PropDef] = Set(
    PropDef("\"value\"", defaultVal),
    PropDef("\"writable\"", booleanVal),
    PropDef("\"enumerable\"", booleanVal),
    PropDef("\"configurable\"", booleanVal)
  )
  // Accessor Property Descriptor
  private val accessorProps: Set[PropDef] = Set(
    PropDef("\"get\"", funcVal),
    PropDef("\"set\"", funcVal),
    PropDef("\"enumerable\"", booleanVal),
    PropDef("\"configurable\"", booleanVal)
  )
  // Thenable
  private val thenableProps: Set[PropDef] = Set(
    PropDef("\"then\"", funcVal)
  )

  // make object literal from `Set[PropDef]` exhaustively
  private def make(
    propDefs: Set[PropDef],
    parserParams: List[Boolean]
  ): List[ObjectLiteral] = {
    val objStrs = propDefs.subsets().map(props => {
      // combine all default values of props
      val combined: Set[Set[String]] = props.foldLeft(Set[Set[String]]()) {
        case (propSets, PropDef(name, defaults)) => {
          // for each acc, add name : defaults[i]
          val propStrs: Set[String] = defaults.map(v => s"[$name] : $v")
          if (propSets.size == 0) propStrs.map(Set(_)).toSet
          else for { propSet <- propSets; prop <- propStrs } yield propSet + prop
        }
      }
      combined.map(propStrs => s"{ ${propStrs.mkString(", ")} }")
    }).toSet.flatten

    val parser = Parser.ObjectLiteral(parserParams)
    objStrs.map(Parser.parse(parser, _).getOrElse(Parser.parse(parser, "{}").get)).toList
  }

  val iterable = make(iterableProps, List(true, false))
  val iterator = make(iteratorProps, List(false, false))
  val asyncIterable = make(asyncIterableProps, List(true, true))
  val asyncIterator = make(asyncIteratorProps, List(false, true))
  val iterResult = make(iterResultProps, List(false, false))
  val dataPropertyDescriptor = make(dataProps, List(false, false))
  val accessorPropertyDescriptor = make(accessorProps, List(false, false))
  val thenable = make(thenableProps, List(false, true))
  val objects = iterable ++
    iterator ++
    asyncIterable ++
    asyncIterator ++
    iterResult ++
    dataPropertyDescriptor ++
    accessorPropertyDescriptor ++
    thenable
}
