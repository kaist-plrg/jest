package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Lexical
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util.Useful._
import scala.collection.immutable.{ Set => ScalaSet }

class NonRecursiveSampler {
  val counter = DepthCounter
  val randomSampler = new Sampler
  var visited: ScalaSet[(String, List[Boolean])] = ScalaSet()

  private def _IdentifierName(): ScalaSet[Lexical] = ScalaSet(randomSampler.IdentifierName(1))
  private def _NullLiteral(): ScalaSet[Lexical] = ScalaSet(randomSampler.NullLiteral(1))
  private def _BooleanLiteral(): ScalaSet[Lexical] = ScalaSet(randomSampler.BooleanLiteral(1))
  private def _NumericLiteral(): ScalaSet[Lexical] = ScalaSet(randomSampler.NumericLiteral(1))
  private def _StringLiteral(): ScalaSet[Lexical] = ScalaSet(randomSampler.StringLiteral(1))
  private def _NoSubstitutionTemplate(): ScalaSet[Lexical] = ScalaSet(randomSampler.NoSubstitutionTemplate(1))
  private def _TemplateHead(): ScalaSet[Lexical] = ScalaSet(randomSampler.TemplateHead(1))
  private def _TemplateMiddle(): ScalaSet[Lexical] = ScalaSet(randomSampler.TemplateMiddle(1))
  private def _TemplateTail(): ScalaSet[Lexical] = ScalaSet(randomSampler.TemplateTail(1))
  def IdentifierReference(pYield: Boolean, pAwait: Boolean): ScalaSet[IdentifierReference] = {
    visited = ScalaSet()
    _IdentifierReference(pYield, pAwait)
  }
  private def _IdentifierReference(pYield: Boolean, pAwait: Boolean): ScalaSet[IdentifierReference] = {
    if (!visited.contains("IdentifierReference", List(pYield, pAwait))) {
      visited += (("IdentifierReference", List(pYield, pAwait)))
      var s = ScalaSet[IdentifierReference]()
      val Identifier_0_0 = _Identifier().toList
      val max0 = List(Identifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Identifier_0_0.applyOrElse(i, (_: Int) => _Identifier().head)
        s += IdentifierReference0(arg0, List(pYield, pAwait))
      }
      if (!pYield) {
        s += IdentifierReference1(List(pYield, pAwait))
      }
      if (!pAwait) {
        s += IdentifierReference2(List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.IdentifierReference(pYield, pAwait).depth
      val sample = randomSampler.IdentifierReference(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingIdentifier(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingIdentifier] = {
    visited = ScalaSet()
    _BindingIdentifier(pYield, pAwait)
  }
  private def _BindingIdentifier(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingIdentifier] = {
    if (!visited.contains("BindingIdentifier", List(pYield, pAwait))) {
      visited += (("BindingIdentifier", List(pYield, pAwait)))
      var s = ScalaSet[BindingIdentifier]()
      val Identifier_0_0 = _Identifier().toList
      val max0 = List(Identifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Identifier_0_0.applyOrElse(i, (_: Int) => _Identifier().head)
        s += BindingIdentifier0(arg0, List(pYield, pAwait))
      }
      s += BindingIdentifier1(List(pYield, pAwait))
      s += BindingIdentifier2(List(pYield, pAwait))
      s
    } else {
      val d = counter.BindingIdentifier(pYield, pAwait).depth
      val sample = randomSampler.BindingIdentifier(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LabelIdentifier(pYield: Boolean, pAwait: Boolean): ScalaSet[LabelIdentifier] = {
    visited = ScalaSet()
    _LabelIdentifier(pYield, pAwait)
  }
  private def _LabelIdentifier(pYield: Boolean, pAwait: Boolean): ScalaSet[LabelIdentifier] = {
    if (!visited.contains("LabelIdentifier", List(pYield, pAwait))) {
      visited += (("LabelIdentifier", List(pYield, pAwait)))
      var s = ScalaSet[LabelIdentifier]()
      val Identifier_0_0 = _Identifier().toList
      val max0 = List(Identifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Identifier_0_0.applyOrElse(i, (_: Int) => _Identifier().head)
        s += LabelIdentifier0(arg0, List(pYield, pAwait))
      }
      if (!pYield) {
        s += LabelIdentifier1(List(pYield, pAwait))
      }
      if (!pAwait) {
        s += LabelIdentifier2(List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.LabelIdentifier(pYield, pAwait).depth
      val sample = randomSampler.LabelIdentifier(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Identifier(): ScalaSet[Identifier] = {
    visited = ScalaSet()
    _Identifier()
  }
  private def _Identifier(): ScalaSet[Identifier] = {
    if (!visited.contains("Identifier", List())) {
      visited += (("Identifier", List()))
      var s = ScalaSet[Identifier]()
      val IdentifierName_0_0 = _IdentifierName().toList
      val max0 = List(IdentifierName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierName_0_0.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += Identifier0(arg0, List())
      }
      s
    } else {
      val d = counter.Identifier().depth
      val sample = randomSampler.Identifier(d)
      ScalaSet(sample)
    }
  }
  def PrimaryExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[PrimaryExpression] = {
    visited = ScalaSet()
    _PrimaryExpression(pYield, pAwait)
  }
  private def _PrimaryExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[PrimaryExpression] = {
    if (!visited.contains("PrimaryExpression", List(pYield, pAwait))) {
      visited += (("PrimaryExpression", List(pYield, pAwait)))
      var s = ScalaSet[PrimaryExpression]()
      s += PrimaryExpression0(List(pYield, pAwait))
      val IdentifierReference_1_0 = _IdentifierReference(pYield, pAwait).toList
      val max1 = List(IdentifierReference_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = IdentifierReference_1_0.applyOrElse(i, (_: Int) => _IdentifierReference(pYield, pAwait).head)
        s += PrimaryExpression1(arg0, List(pYield, pAwait))
      }
      val Literal_2_0 = _Literal().toList
      val max2 = List(Literal_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = Literal_2_0.applyOrElse(i, (_: Int) => _Literal().head)
        s += PrimaryExpression2(arg0, List(pYield, pAwait))
      }
      val ArrayLiteral_3_0 = _ArrayLiteral(pYield, pAwait).toList
      val max3 = List(ArrayLiteral_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ArrayLiteral_3_0.applyOrElse(i, (_: Int) => _ArrayLiteral(pYield, pAwait).head)
        s += PrimaryExpression3(arg0, List(pYield, pAwait))
      }
      val ObjectLiteral_4_0 = _ObjectLiteral(pYield, pAwait).toList
      val max4 = List(ObjectLiteral_4_0).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = ObjectLiteral_4_0.applyOrElse(i, (_: Int) => _ObjectLiteral(pYield, pAwait).head)
        s += PrimaryExpression4(arg0, List(pYield, pAwait))
      }
      val FunctionExpression_5_0 = _FunctionExpression().toList
      val max5 = List(FunctionExpression_5_0).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = FunctionExpression_5_0.applyOrElse(i, (_: Int) => _FunctionExpression().head)
        s += PrimaryExpression5(arg0, List(pYield, pAwait))
      }
      val ClassExpression_6_0 = _ClassExpression(pYield, pAwait).toList
      val max6 = List(ClassExpression_6_0).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = ClassExpression_6_0.applyOrElse(i, (_: Int) => _ClassExpression(pYield, pAwait).head)
        s += PrimaryExpression6(arg0, List(pYield, pAwait))
      }
      val GeneratorExpression_7_0 = _GeneratorExpression().toList
      val max7 = List(GeneratorExpression_7_0).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = GeneratorExpression_7_0.applyOrElse(i, (_: Int) => _GeneratorExpression().head)
        s += PrimaryExpression7(arg0, List(pYield, pAwait))
      }
      val AsyncFunctionExpression_8_0 = _AsyncFunctionExpression().toList
      val max8 = List(AsyncFunctionExpression_8_0).map(_.length).max
      for (i <- (0 until max8)) {
        val arg0 = AsyncFunctionExpression_8_0.applyOrElse(i, (_: Int) => _AsyncFunctionExpression().head)
        s += PrimaryExpression8(arg0, List(pYield, pAwait))
      }
      val AsyncGeneratorExpression_9_0 = _AsyncGeneratorExpression().toList
      val max9 = List(AsyncGeneratorExpression_9_0).map(_.length).max
      for (i <- (0 until max9)) {
        val arg0 = AsyncGeneratorExpression_9_0.applyOrElse(i, (_: Int) => _AsyncGeneratorExpression().head)
        s += PrimaryExpression9(arg0, List(pYield, pAwait))
      }
      val TemplateLiteral_11_0 = _TemplateLiteral(pYield, pAwait, false).toList
      val max11 = List(TemplateLiteral_11_0).map(_.length).max
      for (i <- (0 until max11)) {
        val arg0 = TemplateLiteral_11_0.applyOrElse(i, (_: Int) => _TemplateLiteral(pYield, pAwait, false).head)
        s += PrimaryExpression11(arg0, List(pYield, pAwait))
      }
      val CoverParenthesizedExpressionAndArrowParameterList_12_0 = _CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).toList
      val max12 = List(CoverParenthesizedExpressionAndArrowParameterList_12_0).map(_.length).max
      for (i <- (0 until max12)) {
        val arg0 = CoverParenthesizedExpressionAndArrowParameterList_12_0.applyOrElse(i, (_: Int) => _CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).head)
        s += PrimaryExpression12(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.PrimaryExpression(pYield, pAwait).depth
      val sample = randomSampler.PrimaryExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverParenthesizedExpressionAndArrowParameterList] = {
    visited = ScalaSet()
    _CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait)
  }
  private def _CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverParenthesizedExpressionAndArrowParameterList] = {
    if (!visited.contains("CoverParenthesizedExpressionAndArrowParameterList", List(pYield, pAwait))) {
      visited += (("CoverParenthesizedExpressionAndArrowParameterList", List(pYield, pAwait)))
      var s = ScalaSet[CoverParenthesizedExpressionAndArrowParameterList]()
      val Expression_0_1 = _Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList0(arg0, List(pYield, pAwait))
      }
      val Expression_1_1 = _Expression(true, pYield, pAwait).toList
      val max1 = List(Expression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList1(arg0, List(pYield, pAwait))
      }
      s += CoverParenthesizedExpressionAndArrowParameterList2(List(pYield, pAwait))
      val BindingIdentifier_3_2 = _BindingIdentifier(pYield, pAwait).toList
      val max3 = List(BindingIdentifier_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = BindingIdentifier_3_2.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList3(arg0, List(pYield, pAwait))
      }
      val BindingPattern_4_2 = _BindingPattern(pYield, pAwait).toList
      val max4 = List(BindingPattern_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = BindingPattern_4_2.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList4(arg0, List(pYield, pAwait))
      }
      val Expression_5_1 = _Expression(true, pYield, pAwait).toList
      val BindingIdentifier_5_4 = _BindingIdentifier(pYield, pAwait).toList
      val max5 = List(Expression_5_1, BindingIdentifier_5_4).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = Expression_5_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = BindingIdentifier_5_4.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList5(arg0, arg1, List(pYield, pAwait))
      }
      val Expression_6_1 = _Expression(true, pYield, pAwait).toList
      val BindingPattern_6_4 = _BindingPattern(pYield, pAwait).toList
      val max6 = List(Expression_6_1, BindingPattern_6_4).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = Expression_6_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = BindingPattern_6_4.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList6(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).depth
      val sample = randomSampler.CoverParenthesizedExpressionAndArrowParameterList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ParenthesizedExpression] = {
    visited = ScalaSet()
    _ParenthesizedExpression(pYield, pAwait)
  }
  private def _ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ParenthesizedExpression] = {
    if (!visited.contains("ParenthesizedExpression", List(pYield, pAwait))) {
      visited += (("ParenthesizedExpression", List(pYield, pAwait)))
      var s = ScalaSet[ParenthesizedExpression]()
      val Expression_0_1 = _Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += ParenthesizedExpression0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ParenthesizedExpression(pYield, pAwait).depth
      val sample = randomSampler.ParenthesizedExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Literal(): ScalaSet[Literal] = {
    visited = ScalaSet()
    _Literal()
  }
  private def _Literal(): ScalaSet[Literal] = {
    if (!visited.contains("Literal", List())) {
      visited += (("Literal", List()))
      var s = ScalaSet[Literal]()
      val NullLiteral_0_0 = _NullLiteral().toList
      val max0 = List(NullLiteral_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NullLiteral_0_0.applyOrElse(i, (_: Int) => _NullLiteral().head)
        s += Literal0(arg0, List())
      }
      val BooleanLiteral_1_0 = _BooleanLiteral().toList
      val max1 = List(BooleanLiteral_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BooleanLiteral_1_0.applyOrElse(i, (_: Int) => _BooleanLiteral().head)
        s += Literal1(arg0, List())
      }
      val NumericLiteral_2_0 = _NumericLiteral().toList
      val max2 = List(NumericLiteral_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = NumericLiteral_2_0.applyOrElse(i, (_: Int) => _NumericLiteral().head)
        s += Literal2(arg0, List())
      }
      val StringLiteral_3_0 = _StringLiteral().toList
      val max3 = List(StringLiteral_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = StringLiteral_3_0.applyOrElse(i, (_: Int) => _StringLiteral().head)
        s += Literal3(arg0, List())
      }
      s
    } else {
      val d = counter.Literal().depth
      val sample = randomSampler.Literal(d)
      ScalaSet(sample)
    }
  }
  def ArrayLiteral(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayLiteral] = {
    visited = ScalaSet()
    _ArrayLiteral(pYield, pAwait)
  }
  private def _ArrayLiteral(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayLiteral] = {
    if (!visited.contains("ArrayLiteral", List(pYield, pAwait))) {
      visited += (("ArrayLiteral", List(pYield, pAwait)))
      var s = ScalaSet[ArrayLiteral]()
      val Elision_0_1 = _Elision().toList
      val max0 = List(Elision_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_1.applyOrElse(i, (_: Int) => _Elision().head)
        s += ArrayLiteral0(Some(arg0), List(pYield, pAwait))
        s += ArrayLiteral0(None, List(pYield, pAwait))
      }
      val ElementList_1_1 = _ElementList(pYield, pAwait).toList
      val max1 = List(ElementList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ElementList_1_1.applyOrElse(i, (_: Int) => _ElementList(pYield, pAwait).head)
        s += ArrayLiteral1(arg0, List(pYield, pAwait))
      }
      val ElementList_2_1 = _ElementList(pYield, pAwait).toList
      val Elision_2_3 = _Elision().toList
      val max2 = List(ElementList_2_1, Elision_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ElementList_2_1.applyOrElse(i, (_: Int) => _ElementList(pYield, pAwait).head)
        val arg1 = Elision_2_3.applyOrElse(i, (_: Int) => _Elision().head)
        s += ArrayLiteral2(arg0, Some(arg1), List(pYield, pAwait))
        s += ArrayLiteral2(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArrayLiteral(pYield, pAwait).depth
      val sample = randomSampler.ArrayLiteral(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[ElementList] = {
    visited = ScalaSet()
    _ElementList(pYield, pAwait)
  }
  private def _ElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[ElementList] = {
    if (!visited.contains("ElementList", List(pYield, pAwait))) {
      visited += (("ElementList", List(pYield, pAwait)))
      var s = ScalaSet[ElementList]()
      val Elision_0_0 = _Elision().toList
      val AssignmentExpression_0_1 = _AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(Elision_0_0, AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_0.applyOrElse(i, (_: Int) => _Elision().head)
        val arg1 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ElementList0(Some(arg0), arg1, List(pYield, pAwait))
        s += ElementList0(None, arg1, List(pYield, pAwait))
      }
      val Elision_1_0 = _Elision().toList
      val SpreadElement_1_1 = _SpreadElement(pYield, pAwait).toList
      val max1 = List(Elision_1_0, SpreadElement_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Elision_1_0.applyOrElse(i, (_: Int) => _Elision().head)
        val arg1 = SpreadElement_1_1.applyOrElse(i, (_: Int) => _SpreadElement(pYield, pAwait).head)
        s += ElementList1(Some(arg0), arg1, List(pYield, pAwait))
        s += ElementList1(None, arg1, List(pYield, pAwait))
      }
      val ElementList_2_0 = _ElementList(pYield, pAwait).toList
      val Elision_2_2 = _Elision().toList
      val AssignmentExpression_2_3 = _AssignmentExpression(true, pYield, pAwait).toList
      val max2 = List(ElementList_2_0, Elision_2_2, AssignmentExpression_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ElementList_2_0.applyOrElse(i, (_: Int) => _ElementList(pYield, pAwait).head)
        val arg1 = Elision_2_2.applyOrElse(i, (_: Int) => _Elision().head)
        val arg2 = AssignmentExpression_2_3.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ElementList2(arg0, Some(arg1), arg2, List(pYield, pAwait))
        s += ElementList2(arg0, None, arg2, List(pYield, pAwait))
      }
      val ElementList_3_0 = _ElementList(pYield, pAwait).toList
      val Elision_3_2 = _Elision().toList
      val SpreadElement_3_3 = _SpreadElement(pYield, pAwait).toList
      val max3 = List(ElementList_3_0, Elision_3_2, SpreadElement_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ElementList_3_0.applyOrElse(i, (_: Int) => _ElementList(pYield, pAwait).head)
        val arg1 = Elision_3_2.applyOrElse(i, (_: Int) => _Elision().head)
        val arg2 = SpreadElement_3_3.applyOrElse(i, (_: Int) => _SpreadElement(pYield, pAwait).head)
        s += ElementList3(arg0, Some(arg1), arg2, List(pYield, pAwait))
        s += ElementList3(arg0, None, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ElementList(pYield, pAwait).depth
      val sample = randomSampler.ElementList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Elision(): ScalaSet[Elision] = {
    visited = ScalaSet()
    _Elision()
  }
  private def _Elision(): ScalaSet[Elision] = {
    if (!visited.contains("Elision", List())) {
      visited += (("Elision", List()))
      var s = ScalaSet[Elision]()
      s += Elision0(List())
      val Elision_1_0 = _Elision().toList
      val max1 = List(Elision_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Elision_1_0.applyOrElse(i, (_: Int) => _Elision().head)
        s += Elision1(arg0, List())
      }
      s
    } else {
      val d = counter.Elision().depth
      val sample = randomSampler.Elision(d)
      ScalaSet(sample)
    }
  }
  def SpreadElement(pYield: Boolean, pAwait: Boolean): ScalaSet[SpreadElement] = {
    visited = ScalaSet()
    _SpreadElement(pYield, pAwait)
  }
  private def _SpreadElement(pYield: Boolean, pAwait: Boolean): ScalaSet[SpreadElement] = {
    if (!visited.contains("SpreadElement", List(pYield, pAwait))) {
      visited += (("SpreadElement", List(pYield, pAwait)))
      var s = ScalaSet[SpreadElement]()
      val AssignmentExpression_0_1 = _AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += SpreadElement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.SpreadElement(pYield, pAwait).depth
      val sample = randomSampler.SpreadElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ObjectLiteral(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectLiteral] = {
    visited = ScalaSet()
    _ObjectLiteral(pYield, pAwait)
  }
  private def _ObjectLiteral(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectLiteral] = {
    if (!visited.contains("ObjectLiteral", List(pYield, pAwait))) {
      visited += (("ObjectLiteral", List(pYield, pAwait)))
      var s = ScalaSet[ObjectLiteral]()
      s += ObjectLiteral0(List(pYield, pAwait))
      val PropertyDefinitionList_1_1 = _PropertyDefinitionList(pYield, pAwait).toList
      val max1 = List(PropertyDefinitionList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyDefinitionList_1_1.applyOrElse(i, (_: Int) => _PropertyDefinitionList(pYield, pAwait).head)
        s += ObjectLiteral1(arg0, List(pYield, pAwait))
      }
      val PropertyDefinitionList_2_1 = _PropertyDefinitionList(pYield, pAwait).toList
      val max2 = List(PropertyDefinitionList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = PropertyDefinitionList_2_1.applyOrElse(i, (_: Int) => _PropertyDefinitionList(pYield, pAwait).head)
        s += ObjectLiteral2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ObjectLiteral(pYield, pAwait).depth
      val sample = randomSampler.ObjectLiteral(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyDefinitionList] = {
    visited = ScalaSet()
    _PropertyDefinitionList(pYield, pAwait)
  }
  private def _PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyDefinitionList] = {
    if (!visited.contains("PropertyDefinitionList", List(pYield, pAwait))) {
      visited += (("PropertyDefinitionList", List(pYield, pAwait)))
      var s = ScalaSet[PropertyDefinitionList]()
      val PropertyDefinition_0_0 = _PropertyDefinition(pYield, pAwait).toList
      val max0 = List(PropertyDefinition_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyDefinition_0_0.applyOrElse(i, (_: Int) => _PropertyDefinition(pYield, pAwait).head)
        s += PropertyDefinitionList0(arg0, List(pYield, pAwait))
      }
      val PropertyDefinitionList_1_0 = _PropertyDefinitionList(pYield, pAwait).toList
      val PropertyDefinition_1_2 = _PropertyDefinition(pYield, pAwait).toList
      val max1 = List(PropertyDefinitionList_1_0, PropertyDefinition_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyDefinitionList_1_0.applyOrElse(i, (_: Int) => _PropertyDefinitionList(pYield, pAwait).head)
        val arg1 = PropertyDefinition_1_2.applyOrElse(i, (_: Int) => _PropertyDefinition(pYield, pAwait).head)
        s += PropertyDefinitionList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.PropertyDefinitionList(pYield, pAwait).depth
      val sample = randomSampler.PropertyDefinitionList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def PropertyDefinition(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyDefinition] = {
    visited = ScalaSet()
    _PropertyDefinition(pYield, pAwait)
  }
  private def _PropertyDefinition(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyDefinition] = {
    if (!visited.contains("PropertyDefinition", List(pYield, pAwait))) {
      visited += (("PropertyDefinition", List(pYield, pAwait)))
      var s = ScalaSet[PropertyDefinition]()
      val IdentifierReference_0_0 = _IdentifierReference(pYield, pAwait).toList
      val max0 = List(IdentifierReference_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierReference_0_0.applyOrElse(i, (_: Int) => _IdentifierReference(pYield, pAwait).head)
        s += PropertyDefinition0(arg0, List(pYield, pAwait))
      }
      val CoverInitializedName_1_0 = _CoverInitializedName(pYield, pAwait).toList
      val max1 = List(CoverInitializedName_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoverInitializedName_1_0.applyOrElse(i, (_: Int) => _CoverInitializedName(pYield, pAwait).head)
        s += PropertyDefinition1(arg0, List(pYield, pAwait))
      }
      val PropertyName_2_0 = _PropertyName(pYield, pAwait).toList
      val AssignmentExpression_2_2 = _AssignmentExpression(true, pYield, pAwait).toList
      val max2 = List(PropertyName_2_0, AssignmentExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = PropertyName_2_0.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = AssignmentExpression_2_2.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += PropertyDefinition2(arg0, arg1, List(pYield, pAwait))
      }
      val MethodDefinition_3_0 = _MethodDefinition(pYield, pAwait).toList
      val max3 = List(MethodDefinition_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = MethodDefinition_3_0.applyOrElse(i, (_: Int) => _MethodDefinition(pYield, pAwait).head)
        s += PropertyDefinition3(arg0, List(pYield, pAwait))
      }
      val AssignmentExpression_4_1 = _AssignmentExpression(true, pYield, pAwait).toList
      val max4 = List(AssignmentExpression_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = AssignmentExpression_4_1.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += PropertyDefinition4(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.PropertyDefinition(pYield, pAwait).depth
      val sample = randomSampler.PropertyDefinition(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def PropertyName(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyName] = {
    visited = ScalaSet()
    _PropertyName(pYield, pAwait)
  }
  private def _PropertyName(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyName] = {
    if (!visited.contains("PropertyName", List(pYield, pAwait))) {
      visited += (("PropertyName", List(pYield, pAwait)))
      var s = ScalaSet[PropertyName]()
      val LiteralPropertyName_0_0 = _LiteralPropertyName().toList
      val max0 = List(LiteralPropertyName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LiteralPropertyName_0_0.applyOrElse(i, (_: Int) => _LiteralPropertyName().head)
        s += PropertyName0(arg0, List(pYield, pAwait))
      }
      val ComputedPropertyName_1_0 = _ComputedPropertyName(pYield, pAwait).toList
      val max1 = List(ComputedPropertyName_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ComputedPropertyName_1_0.applyOrElse(i, (_: Int) => _ComputedPropertyName(pYield, pAwait).head)
        s += PropertyName1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.PropertyName(pYield, pAwait).depth
      val sample = randomSampler.PropertyName(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LiteralPropertyName(): ScalaSet[LiteralPropertyName] = {
    visited = ScalaSet()
    _LiteralPropertyName()
  }
  private def _LiteralPropertyName(): ScalaSet[LiteralPropertyName] = {
    if (!visited.contains("LiteralPropertyName", List())) {
      visited += (("LiteralPropertyName", List()))
      var s = ScalaSet[LiteralPropertyName]()
      val IdentifierName_0_0 = _IdentifierName().toList
      val max0 = List(IdentifierName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierName_0_0.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += LiteralPropertyName0(arg0, List())
      }
      val StringLiteral_1_0 = _StringLiteral().toList
      val max1 = List(StringLiteral_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = StringLiteral_1_0.applyOrElse(i, (_: Int) => _StringLiteral().head)
        s += LiteralPropertyName1(arg0, List())
      }
      val NumericLiteral_2_0 = _NumericLiteral().toList
      val max2 = List(NumericLiteral_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = NumericLiteral_2_0.applyOrElse(i, (_: Int) => _NumericLiteral().head)
        s += LiteralPropertyName2(arg0, List())
      }
      s
    } else {
      val d = counter.LiteralPropertyName().depth
      val sample = randomSampler.LiteralPropertyName(d)
      ScalaSet(sample)
    }
  }
  def ComputedPropertyName(pYield: Boolean, pAwait: Boolean): ScalaSet[ComputedPropertyName] = {
    visited = ScalaSet()
    _ComputedPropertyName(pYield, pAwait)
  }
  private def _ComputedPropertyName(pYield: Boolean, pAwait: Boolean): ScalaSet[ComputedPropertyName] = {
    if (!visited.contains("ComputedPropertyName", List(pYield, pAwait))) {
      visited += (("ComputedPropertyName", List(pYield, pAwait)))
      var s = ScalaSet[ComputedPropertyName]()
      val AssignmentExpression_0_1 = _AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ComputedPropertyName0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ComputedPropertyName(pYield, pAwait).depth
      val sample = randomSampler.ComputedPropertyName(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def CoverInitializedName(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverInitializedName] = {
    visited = ScalaSet()
    _CoverInitializedName(pYield, pAwait)
  }
  private def _CoverInitializedName(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverInitializedName] = {
    if (!visited.contains("CoverInitializedName", List(pYield, pAwait))) {
      visited += (("CoverInitializedName", List(pYield, pAwait)))
      var s = ScalaSet[CoverInitializedName]()
      val IdentifierReference_0_0 = _IdentifierReference(pYield, pAwait).toList
      val Initializer_0_1 = _Initializer(true, pYield, pAwait).toList
      val max0 = List(IdentifierReference_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierReference_0_0.applyOrElse(i, (_: Int) => _IdentifierReference(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => _Initializer(true, pYield, pAwait).head)
        s += CoverInitializedName0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.CoverInitializedName(pYield, pAwait).depth
      val sample = randomSampler.CoverInitializedName(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[Initializer] = {
    visited = ScalaSet()
    _Initializer(pIn, pYield, pAwait)
  }
  private def _Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[Initializer] = {
    if (!visited.contains("Initializer", List(pIn, pYield, pAwait))) {
      visited += (("Initializer", List(pIn, pYield, pAwait)))
      var s = ScalaSet[Initializer]()
      val AssignmentExpression_0_1 = _AssignmentExpression(pIn, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, pYield, pAwait).head)
        s += Initializer0(arg0, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.Initializer(pIn, pYield, pAwait).depth
      val sample = randomSampler.Initializer(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateLiteral] = {
    visited = ScalaSet()
    _TemplateLiteral(pYield, pAwait, pTagged)
  }
  private def _TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateLiteral] = {
    if (!visited.contains("TemplateLiteral", List(pYield, pAwait, pTagged))) {
      visited += (("TemplateLiteral", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[TemplateLiteral]()
      val NoSubstitutionTemplate_0_0 = _NoSubstitutionTemplate().toList
      val max0 = List(NoSubstitutionTemplate_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NoSubstitutionTemplate_0_0.applyOrElse(i, (_: Int) => _NoSubstitutionTemplate().head)
        s += TemplateLiteral0(arg0, List(pYield, pAwait, pTagged))
      }
      val SubstitutionTemplate_1_0 = _SubstitutionTemplate(pYield, pAwait, pTagged).toList
      val max1 = List(SubstitutionTemplate_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = SubstitutionTemplate_1_0.applyOrElse(i, (_: Int) => _SubstitutionTemplate(pYield, pAwait, pTagged).head)
        s += TemplateLiteral1(arg0, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val d = counter.TemplateLiteral(pYield, pAwait, pTagged).depth
      val sample = randomSampler.TemplateLiteral(d, pYield, pAwait, pTagged)
      ScalaSet(sample)
    }
  }
  def SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[SubstitutionTemplate] = {
    visited = ScalaSet()
    _SubstitutionTemplate(pYield, pAwait, pTagged)
  }
  private def _SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[SubstitutionTemplate] = {
    if (!visited.contains("SubstitutionTemplate", List(pYield, pAwait, pTagged))) {
      visited += (("SubstitutionTemplate", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[SubstitutionTemplate]()
      val TemplateHead_0_0 = _TemplateHead().toList
      val Expression_0_1 = _Expression(true, pYield, pAwait).toList
      val TemplateSpans_0_2 = _TemplateSpans(pYield, pAwait, pTagged).toList
      val max0 = List(TemplateHead_0_0, Expression_0_1, TemplateSpans_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = TemplateHead_0_0.applyOrElse(i, (_: Int) => _TemplateHead().head)
        val arg1 = Expression_0_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = TemplateSpans_0_2.applyOrElse(i, (_: Int) => _TemplateSpans(pYield, pAwait, pTagged).head)
        s += SubstitutionTemplate0(arg0, arg1, arg2, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val d = counter.SubstitutionTemplate(pYield, pAwait, pTagged).depth
      val sample = randomSampler.SubstitutionTemplate(d, pYield, pAwait, pTagged)
      ScalaSet(sample)
    }
  }
  def TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateSpans] = {
    visited = ScalaSet()
    _TemplateSpans(pYield, pAwait, pTagged)
  }
  private def _TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateSpans] = {
    if (!visited.contains("TemplateSpans", List(pYield, pAwait, pTagged))) {
      visited += (("TemplateSpans", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[TemplateSpans]()
      val TemplateTail_0_0 = _TemplateTail().toList
      val max0 = List(TemplateTail_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = TemplateTail_0_0.applyOrElse(i, (_: Int) => _TemplateTail().head)
        s += TemplateSpans0(arg0, List(pYield, pAwait, pTagged))
      }
      val TemplateMiddleList_1_0 = _TemplateMiddleList(pYield, pAwait, pTagged).toList
      val TemplateTail_1_1 = _TemplateTail().toList
      val max1 = List(TemplateMiddleList_1_0, TemplateTail_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = TemplateMiddleList_1_0.applyOrElse(i, (_: Int) => _TemplateMiddleList(pYield, pAwait, pTagged).head)
        val arg1 = TemplateTail_1_1.applyOrElse(i, (_: Int) => _TemplateTail().head)
        s += TemplateSpans1(arg0, arg1, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val d = counter.TemplateSpans(pYield, pAwait, pTagged).depth
      val sample = randomSampler.TemplateSpans(d, pYield, pAwait, pTagged)
      ScalaSet(sample)
    }
  }
  def TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateMiddleList] = {
    visited = ScalaSet()
    _TemplateMiddleList(pYield, pAwait, pTagged)
  }
  private def _TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateMiddleList] = {
    if (!visited.contains("TemplateMiddleList", List(pYield, pAwait, pTagged))) {
      visited += (("TemplateMiddleList", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[TemplateMiddleList]()
      val TemplateMiddle_0_0 = _TemplateMiddle().toList
      val Expression_0_1 = _Expression(true, pYield, pAwait).toList
      val max0 = List(TemplateMiddle_0_0, Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = TemplateMiddle_0_0.applyOrElse(i, (_: Int) => _TemplateMiddle().head)
        val arg1 = Expression_0_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += TemplateMiddleList0(arg0, arg1, List(pYield, pAwait, pTagged))
      }
      val TemplateMiddleList_1_0 = _TemplateMiddleList(pYield, pAwait, pTagged).toList
      val TemplateMiddle_1_1 = _TemplateMiddle().toList
      val Expression_1_2 = _Expression(true, pYield, pAwait).toList
      val max1 = List(TemplateMiddleList_1_0, TemplateMiddle_1_1, Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = TemplateMiddleList_1_0.applyOrElse(i, (_: Int) => _TemplateMiddleList(pYield, pAwait, pTagged).head)
        val arg1 = TemplateMiddle_1_1.applyOrElse(i, (_: Int) => _TemplateMiddle().head)
        val arg2 = Expression_1_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += TemplateMiddleList1(arg0, arg1, arg2, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val d = counter.TemplateMiddleList(pYield, pAwait, pTagged).depth
      val sample = randomSampler.TemplateMiddleList(d, pYield, pAwait, pTagged)
      ScalaSet(sample)
    }
  }
  def MemberExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[MemberExpression] = {
    visited = ScalaSet()
    _MemberExpression(pYield, pAwait)
  }
  private def _MemberExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[MemberExpression] = {
    if (!visited.contains("MemberExpression", List(pYield, pAwait))) {
      visited += (("MemberExpression", List(pYield, pAwait)))
      var s = ScalaSet[MemberExpression]()
      val PrimaryExpression_0_0 = _PrimaryExpression(pYield, pAwait).toList
      val max0 = List(PrimaryExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PrimaryExpression_0_0.applyOrElse(i, (_: Int) => _PrimaryExpression(pYield, pAwait).head)
        s += MemberExpression0(arg0, List(pYield, pAwait))
      }
      val MemberExpression_1_0 = _MemberExpression(pYield, pAwait).toList
      val Expression_1_2 = _Expression(true, pYield, pAwait).toList
      val max1 = List(MemberExpression_1_0, Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = MemberExpression_1_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = Expression_1_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += MemberExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val MemberExpression_2_0 = _MemberExpression(pYield, pAwait).toList
      val IdentifierName_2_2 = _IdentifierName().toList
      val max2 = List(MemberExpression_2_0, IdentifierName_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = MemberExpression_2_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = IdentifierName_2_2.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += MemberExpression2(arg0, arg1, List(pYield, pAwait))
      }
      val MemberExpression_3_0 = _MemberExpression(pYield, pAwait).toList
      val TemplateLiteral_3_1 = _TemplateLiteral(pYield, pAwait, true).toList
      val max3 = List(MemberExpression_3_0, TemplateLiteral_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = MemberExpression_3_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = TemplateLiteral_3_1.applyOrElse(i, (_: Int) => _TemplateLiteral(pYield, pAwait, true).head)
        s += MemberExpression3(arg0, arg1, List(pYield, pAwait))
      }
      val SuperProperty_4_0 = _SuperProperty(pYield, pAwait).toList
      val max4 = List(SuperProperty_4_0).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = SuperProperty_4_0.applyOrElse(i, (_: Int) => _SuperProperty(pYield, pAwait).head)
        s += MemberExpression4(arg0, List(pYield, pAwait))
      }
      val MetaProperty_5_0 = _MetaProperty().toList
      val max5 = List(MetaProperty_5_0).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = MetaProperty_5_0.applyOrElse(i, (_: Int) => _MetaProperty().head)
        s += MemberExpression5(arg0, List(pYield, pAwait))
      }
      val MemberExpression_6_1 = _MemberExpression(pYield, pAwait).toList
      val Arguments_6_2 = _Arguments(pYield, pAwait).toList
      val max6 = List(MemberExpression_6_1, Arguments_6_2).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = MemberExpression_6_1.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = Arguments_6_2.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += MemberExpression6(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.MemberExpression(pYield, pAwait).depth
      val sample = randomSampler.MemberExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def SuperProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[SuperProperty] = {
    visited = ScalaSet()
    _SuperProperty(pYield, pAwait)
  }
  private def _SuperProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[SuperProperty] = {
    if (!visited.contains("SuperProperty", List(pYield, pAwait))) {
      visited += (("SuperProperty", List(pYield, pAwait)))
      var s = ScalaSet[SuperProperty]()
      val Expression_0_2 = _Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += SuperProperty0(arg0, List(pYield, pAwait))
      }
      val IdentifierName_1_2 = _IdentifierName().toList
      val max1 = List(IdentifierName_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = IdentifierName_1_2.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += SuperProperty1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.SuperProperty(pYield, pAwait).depth
      val sample = randomSampler.SuperProperty(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def MetaProperty(): ScalaSet[MetaProperty] = {
    visited = ScalaSet()
    _MetaProperty()
  }
  private def _MetaProperty(): ScalaSet[MetaProperty] = {
    if (!visited.contains("MetaProperty", List())) {
      visited += (("MetaProperty", List()))
      var s = ScalaSet[MetaProperty]()
      val NewTarget_0_0 = _NewTarget().toList
      val max0 = List(NewTarget_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NewTarget_0_0.applyOrElse(i, (_: Int) => _NewTarget().head)
        s += MetaProperty0(arg0, List())
      }
      s
    } else {
      val d = counter.MetaProperty().depth
      val sample = randomSampler.MetaProperty(d)
      ScalaSet(sample)
    }
  }
  def NewTarget(): ScalaSet[NewTarget] = {
    visited = ScalaSet()
    _NewTarget()
  }
  private def _NewTarget(): ScalaSet[NewTarget] = {
    if (!visited.contains("NewTarget", List())) {
      visited += (("NewTarget", List()))
      var s = ScalaSet[NewTarget]()
      s += NewTarget0(List())
      s
    } else {
      val d = counter.NewTarget().depth
      val sample = randomSampler.NewTarget(d)
      ScalaSet(sample)
    }
  }
  def NewExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[NewExpression] = {
    visited = ScalaSet()
    _NewExpression(pYield, pAwait)
  }
  private def _NewExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[NewExpression] = {
    if (!visited.contains("NewExpression", List(pYield, pAwait))) {
      visited += (("NewExpression", List(pYield, pAwait)))
      var s = ScalaSet[NewExpression]()
      val MemberExpression_0_0 = _MemberExpression(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        s += NewExpression0(arg0, List(pYield, pAwait))
      }
      val NewExpression_1_1 = _NewExpression(pYield, pAwait).toList
      val max1 = List(NewExpression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = NewExpression_1_1.applyOrElse(i, (_: Int) => _NewExpression(pYield, pAwait).head)
        s += NewExpression1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.NewExpression(pYield, pAwait).depth
      val sample = randomSampler.NewExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def CallExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[CallExpression] = {
    visited = ScalaSet()
    _CallExpression(pYield, pAwait)
  }
  private def _CallExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[CallExpression] = {
    if (!visited.contains("CallExpression", List(pYield, pAwait))) {
      visited += (("CallExpression", List(pYield, pAwait)))
      var s = ScalaSet[CallExpression]()
      val CoverCallExpressionAndAsyncArrowHead_0_0 = _CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).toList
      val max0 = List(CoverCallExpressionAndAsyncArrowHead_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CoverCallExpressionAndAsyncArrowHead_0_0.applyOrElse(i, (_: Int) => _CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).head)
        s += CallExpression0(arg0, List(pYield, pAwait))
      }
      val SuperCall_1_0 = _SuperCall(pYield, pAwait).toList
      val max1 = List(SuperCall_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = SuperCall_1_0.applyOrElse(i, (_: Int) => _SuperCall(pYield, pAwait).head)
        s += CallExpression1(arg0, List(pYield, pAwait))
      }
      val CallExpression_3_0 = _CallExpression(pYield, pAwait).toList
      val Arguments_3_1 = _Arguments(pYield, pAwait).toList
      val max3 = List(CallExpression_3_0, Arguments_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = CallExpression_3_0.applyOrElse(i, (_: Int) => _CallExpression(pYield, pAwait).head)
        val arg1 = Arguments_3_1.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += CallExpression3(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_4_0 = _CallExpression(pYield, pAwait).toList
      val Expression_4_2 = _Expression(true, pYield, pAwait).toList
      val max4 = List(CallExpression_4_0, Expression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = CallExpression_4_0.applyOrElse(i, (_: Int) => _CallExpression(pYield, pAwait).head)
        val arg1 = Expression_4_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += CallExpression4(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_5_0 = _CallExpression(pYield, pAwait).toList
      val IdentifierName_5_2 = _IdentifierName().toList
      val max5 = List(CallExpression_5_0, IdentifierName_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = CallExpression_5_0.applyOrElse(i, (_: Int) => _CallExpression(pYield, pAwait).head)
        val arg1 = IdentifierName_5_2.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += CallExpression5(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_6_0 = _CallExpression(pYield, pAwait).toList
      val TemplateLiteral_6_1 = _TemplateLiteral(pYield, pAwait, true).toList
      val max6 = List(CallExpression_6_0, TemplateLiteral_6_1).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = CallExpression_6_0.applyOrElse(i, (_: Int) => _CallExpression(pYield, pAwait).head)
        val arg1 = TemplateLiteral_6_1.applyOrElse(i, (_: Int) => _TemplateLiteral(pYield, pAwait, true).head)
        s += CallExpression6(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.CallExpression(pYield, pAwait).depth
      val sample = randomSampler.CallExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def CallMemberExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[CallMemberExpression] = {
    visited = ScalaSet()
    _CallMemberExpression(pYield, pAwait)
  }
  private def _CallMemberExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[CallMemberExpression] = {
    if (!visited.contains("CallMemberExpression", List(pYield, pAwait))) {
      visited += (("CallMemberExpression", List(pYield, pAwait)))
      var s = ScalaSet[CallMemberExpression]()
      val MemberExpression_0_0 = _MemberExpression(pYield, pAwait).toList
      val Arguments_0_1 = _Arguments(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0, Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = Arguments_0_1.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += CallMemberExpression0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.CallMemberExpression(pYield, pAwait).depth
      val sample = randomSampler.CallMemberExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def SuperCall(pYield: Boolean, pAwait: Boolean): ScalaSet[SuperCall] = {
    visited = ScalaSet()
    _SuperCall(pYield, pAwait)
  }
  private def _SuperCall(pYield: Boolean, pAwait: Boolean): ScalaSet[SuperCall] = {
    if (!visited.contains("SuperCall", List(pYield, pAwait))) {
      visited += (("SuperCall", List(pYield, pAwait)))
      var s = ScalaSet[SuperCall]()
      val Arguments_0_1 = _Arguments(pYield, pAwait).toList
      val max0 = List(Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Arguments_0_1.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += SuperCall0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.SuperCall(pYield, pAwait).depth
      val sample = randomSampler.SuperCall(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Arguments(pYield: Boolean, pAwait: Boolean): ScalaSet[Arguments] = {
    visited = ScalaSet()
    _Arguments(pYield, pAwait)
  }
  private def _Arguments(pYield: Boolean, pAwait: Boolean): ScalaSet[Arguments] = {
    if (!visited.contains("Arguments", List(pYield, pAwait))) {
      visited += (("Arguments", List(pYield, pAwait)))
      var s = ScalaSet[Arguments]()
      s += Arguments0(List(pYield, pAwait))
      val ArgumentList_1_1 = _ArgumentList(pYield, pAwait).toList
      val max1 = List(ArgumentList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ArgumentList_1_1.applyOrElse(i, (_: Int) => _ArgumentList(pYield, pAwait).head)
        s += Arguments1(arg0, List(pYield, pAwait))
      }
      val ArgumentList_2_1 = _ArgumentList(pYield, pAwait).toList
      val max2 = List(ArgumentList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ArgumentList_2_1.applyOrElse(i, (_: Int) => _ArgumentList(pYield, pAwait).head)
        s += Arguments2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.Arguments(pYield, pAwait).depth
      val sample = randomSampler.Arguments(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ArgumentList(pYield: Boolean, pAwait: Boolean): ScalaSet[ArgumentList] = {
    visited = ScalaSet()
    _ArgumentList(pYield, pAwait)
  }
  private def _ArgumentList(pYield: Boolean, pAwait: Boolean): ScalaSet[ArgumentList] = {
    if (!visited.contains("ArgumentList", List(pYield, pAwait))) {
      visited += (("ArgumentList", List(pYield, pAwait)))
      var s = ScalaSet[ArgumentList]()
      val AssignmentExpression_0_0 = _AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_0.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList0(arg0, List(pYield, pAwait))
      }
      val AssignmentExpression_1_1 = _AssignmentExpression(true, pYield, pAwait).toList
      val max1 = List(AssignmentExpression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentExpression_1_1.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList1(arg0, List(pYield, pAwait))
      }
      val ArgumentList_2_0 = _ArgumentList(pYield, pAwait).toList
      val AssignmentExpression_2_2 = _AssignmentExpression(true, pYield, pAwait).toList
      val max2 = List(ArgumentList_2_0, AssignmentExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ArgumentList_2_0.applyOrElse(i, (_: Int) => _ArgumentList(pYield, pAwait).head)
        val arg1 = AssignmentExpression_2_2.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList2(arg0, arg1, List(pYield, pAwait))
      }
      val ArgumentList_3_0 = _ArgumentList(pYield, pAwait).toList
      val AssignmentExpression_3_3 = _AssignmentExpression(true, pYield, pAwait).toList
      val max3 = List(ArgumentList_3_0, AssignmentExpression_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ArgumentList_3_0.applyOrElse(i, (_: Int) => _ArgumentList(pYield, pAwait).head)
        val arg1 = AssignmentExpression_3_3.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList3(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArgumentList(pYield, pAwait).depth
      val sample = randomSampler.ArgumentList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def OptionalExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[OptionalExpression] = {
    visited = ScalaSet()
    _OptionalExpression(pYield, pAwait)
  }
  private def _OptionalExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[OptionalExpression] = {
    if (!visited.contains("OptionalExpression", List(pYield, pAwait))) {
      visited += (("OptionalExpression", List(pYield, pAwait)))
      var s = ScalaSet[OptionalExpression]()
      val MemberExpression_0_0 = _MemberExpression(pYield, pAwait).toList
      val OptionalChain_0_1 = _OptionalChain(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0, OptionalChain_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = OptionalChain_0_1.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        s += OptionalExpression0(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_1_0 = _CallExpression(pYield, pAwait).toList
      val OptionalChain_1_1 = _OptionalChain(pYield, pAwait).toList
      val max1 = List(CallExpression_1_0, OptionalChain_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CallExpression_1_0.applyOrElse(i, (_: Int) => _CallExpression(pYield, pAwait).head)
        val arg1 = OptionalChain_1_1.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        s += OptionalExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalExpression_2_0 = _OptionalExpression(pYield, pAwait).toList
      val OptionalChain_2_1 = _OptionalChain(pYield, pAwait).toList
      val max2 = List(OptionalExpression_2_0, OptionalChain_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = OptionalExpression_2_0.applyOrElse(i, (_: Int) => _OptionalExpression(pYield, pAwait).head)
        val arg1 = OptionalChain_2_1.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        s += OptionalExpression2(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.OptionalExpression(pYield, pAwait).depth
      val sample = randomSampler.OptionalExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def OptionalChain(pYield: Boolean, pAwait: Boolean): ScalaSet[OptionalChain] = {
    visited = ScalaSet()
    _OptionalChain(pYield, pAwait)
  }
  private def _OptionalChain(pYield: Boolean, pAwait: Boolean): ScalaSet[OptionalChain] = {
    if (!visited.contains("OptionalChain", List(pYield, pAwait))) {
      visited += (("OptionalChain", List(pYield, pAwait)))
      var s = ScalaSet[OptionalChain]()
      val Arguments_0_1 = _Arguments(pYield, pAwait).toList
      val max0 = List(Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Arguments_0_1.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += OptionalChain0(arg0, List(pYield, pAwait))
      }
      val Expression_1_2 = _Expression(true, pYield, pAwait).toList
      val max1 = List(Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += OptionalChain1(arg0, List(pYield, pAwait))
      }
      val IdentifierName_2_1 = _IdentifierName().toList
      val max2 = List(IdentifierName_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = IdentifierName_2_1.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += OptionalChain2(arg0, List(pYield, pAwait))
      }
      val TemplateLiteral_3_1 = _TemplateLiteral(pYield, pAwait, true).toList
      val max3 = List(TemplateLiteral_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = TemplateLiteral_3_1.applyOrElse(i, (_: Int) => _TemplateLiteral(pYield, pAwait, true).head)
        s += OptionalChain3(arg0, List(pYield, pAwait))
      }
      val OptionalChain_4_0 = _OptionalChain(pYield, pAwait).toList
      val Arguments_4_1 = _Arguments(pYield, pAwait).toList
      val max4 = List(OptionalChain_4_0, Arguments_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = OptionalChain_4_0.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        val arg1 = Arguments_4_1.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += OptionalChain4(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalChain_5_0 = _OptionalChain(pYield, pAwait).toList
      val Expression_5_2 = _Expression(true, pYield, pAwait).toList
      val max5 = List(OptionalChain_5_0, Expression_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = OptionalChain_5_0.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        val arg1 = Expression_5_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += OptionalChain5(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalChain_6_0 = _OptionalChain(pYield, pAwait).toList
      val IdentifierName_6_2 = _IdentifierName().toList
      val max6 = List(OptionalChain_6_0, IdentifierName_6_2).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = OptionalChain_6_0.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        val arg1 = IdentifierName_6_2.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += OptionalChain6(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalChain_7_0 = _OptionalChain(pYield, pAwait).toList
      val TemplateLiteral_7_1 = _TemplateLiteral(pYield, pAwait, true).toList
      val max7 = List(OptionalChain_7_0, TemplateLiteral_7_1).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = OptionalChain_7_0.applyOrElse(i, (_: Int) => _OptionalChain(pYield, pAwait).head)
        val arg1 = TemplateLiteral_7_1.applyOrElse(i, (_: Int) => _TemplateLiteral(pYield, pAwait, true).head)
        s += OptionalChain7(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.OptionalChain(pYield, pAwait).depth
      val sample = randomSampler.OptionalChain(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[LeftHandSideExpression] = {
    visited = ScalaSet()
    _LeftHandSideExpression(pYield, pAwait)
  }
  private def _LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[LeftHandSideExpression] = {
    if (!visited.contains("LeftHandSideExpression", List(pYield, pAwait))) {
      visited += (("LeftHandSideExpression", List(pYield, pAwait)))
      var s = ScalaSet[LeftHandSideExpression]()
      val NewExpression_0_0 = _NewExpression(pYield, pAwait).toList
      val max0 = List(NewExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NewExpression_0_0.applyOrElse(i, (_: Int) => _NewExpression(pYield, pAwait).head)
        s += LeftHandSideExpression0(arg0, List(pYield, pAwait))
      }
      val CallExpression_1_0 = _CallExpression(pYield, pAwait).toList
      val max1 = List(CallExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CallExpression_1_0.applyOrElse(i, (_: Int) => _CallExpression(pYield, pAwait).head)
        s += LeftHandSideExpression1(arg0, List(pYield, pAwait))
      }
      val OptionalExpression_2_0 = _OptionalExpression(pYield, pAwait).toList
      val max2 = List(OptionalExpression_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = OptionalExpression_2_0.applyOrElse(i, (_: Int) => _OptionalExpression(pYield, pAwait).head)
        s += LeftHandSideExpression2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.LeftHandSideExpression(pYield, pAwait).depth
      val sample = randomSampler.LeftHandSideExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def UpdateExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[UpdateExpression] = {
    visited = ScalaSet()
    _UpdateExpression(pYield, pAwait)
  }
  private def _UpdateExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[UpdateExpression] = {
    if (!visited.contains("UpdateExpression", List(pYield, pAwait))) {
      visited += (("UpdateExpression", List(pYield, pAwait)))
      var s = ScalaSet[UpdateExpression]()
      val LeftHandSideExpression_0_0 = _LeftHandSideExpression(pYield, pAwait).toList
      val max0 = List(LeftHandSideExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LeftHandSideExpression_0_0.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        s += UpdateExpression0(arg0, List(pYield, pAwait))
      }
      val LeftHandSideExpression_1_0 = _LeftHandSideExpression(pYield, pAwait).toList
      val max1 = List(LeftHandSideExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LeftHandSideExpression_1_0.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        s += UpdateExpression1(arg0, List(pYield, pAwait))
      }
      val LeftHandSideExpression_2_0 = _LeftHandSideExpression(pYield, pAwait).toList
      val max2 = List(LeftHandSideExpression_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = LeftHandSideExpression_2_0.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        s += UpdateExpression2(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_3_1 = _UnaryExpression(pYield, pAwait).toList
      val max3 = List(UnaryExpression_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = UnaryExpression_3_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UpdateExpression3(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_4_1 = _UnaryExpression(pYield, pAwait).toList
      val max4 = List(UnaryExpression_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = UnaryExpression_4_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UpdateExpression4(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.UpdateExpression(pYield, pAwait).depth
      val sample = randomSampler.UpdateExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def UnaryExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[UnaryExpression] = {
    visited = ScalaSet()
    _UnaryExpression(pYield, pAwait)
  }
  private def _UnaryExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[UnaryExpression] = {
    if (!visited.contains("UnaryExpression", List(pYield, pAwait))) {
      visited += (("UnaryExpression", List(pYield, pAwait)))
      var s = ScalaSet[UnaryExpression]()
      val UpdateExpression_0_0 = _UpdateExpression(pYield, pAwait).toList
      val max0 = List(UpdateExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UpdateExpression_0_0.applyOrElse(i, (_: Int) => _UpdateExpression(pYield, pAwait).head)
        s += UnaryExpression0(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_1_1 = _UnaryExpression(pYield, pAwait).toList
      val max1 = List(UnaryExpression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = UnaryExpression_1_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression1(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_2_1 = _UnaryExpression(pYield, pAwait).toList
      val max2 = List(UnaryExpression_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = UnaryExpression_2_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression2(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_3_1 = _UnaryExpression(pYield, pAwait).toList
      val max3 = List(UnaryExpression_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = UnaryExpression_3_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression3(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_4_1 = _UnaryExpression(pYield, pAwait).toList
      val max4 = List(UnaryExpression_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = UnaryExpression_4_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression4(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_5_1 = _UnaryExpression(pYield, pAwait).toList
      val max5 = List(UnaryExpression_5_1).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = UnaryExpression_5_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression5(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_6_1 = _UnaryExpression(pYield, pAwait).toList
      val max6 = List(UnaryExpression_6_1).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = UnaryExpression_6_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression6(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_7_1 = _UnaryExpression(pYield, pAwait).toList
      val max7 = List(UnaryExpression_7_1).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = UnaryExpression_7_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression7(arg0, List(pYield, pAwait))
      }
      if (pAwait) {
        val AwaitExpression_8_0 = _AwaitExpression(pYield).toList
        val max8 = List(AwaitExpression_8_0).map(_.length).max
        for (i <- (0 until max8)) {
          val arg0 = AwaitExpression_8_0.applyOrElse(i, (_: Int) => _AwaitExpression(pYield).head)
          s += UnaryExpression8(arg0, List(pYield, pAwait))
        }
      }
      s
    } else {
      val d = counter.UnaryExpression(pYield, pAwait).depth
      val sample = randomSampler.UnaryExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ExponentiationExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ExponentiationExpression] = {
    visited = ScalaSet()
    _ExponentiationExpression(pYield, pAwait)
  }
  private def _ExponentiationExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ExponentiationExpression] = {
    if (!visited.contains("ExponentiationExpression", List(pYield, pAwait))) {
      visited += (("ExponentiationExpression", List(pYield, pAwait)))
      var s = ScalaSet[ExponentiationExpression]()
      val UnaryExpression_0_0 = _UnaryExpression(pYield, pAwait).toList
      val max0 = List(UnaryExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UnaryExpression_0_0.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, pAwait).head)
        s += ExponentiationExpression0(arg0, List(pYield, pAwait))
      }
      val UpdateExpression_1_0 = _UpdateExpression(pYield, pAwait).toList
      val ExponentiationExpression_1_2 = _ExponentiationExpression(pYield, pAwait).toList
      val max1 = List(UpdateExpression_1_0, ExponentiationExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = UpdateExpression_1_0.applyOrElse(i, (_: Int) => _UpdateExpression(pYield, pAwait).head)
        val arg1 = ExponentiationExpression_1_2.applyOrElse(i, (_: Int) => _ExponentiationExpression(pYield, pAwait).head)
        s += ExponentiationExpression1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ExponentiationExpression(pYield, pAwait).depth
      val sample = randomSampler.ExponentiationExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[MultiplicativeExpression] = {
    visited = ScalaSet()
    _MultiplicativeExpression(pYield, pAwait)
  }
  private def _MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[MultiplicativeExpression] = {
    if (!visited.contains("MultiplicativeExpression", List(pYield, pAwait))) {
      visited += (("MultiplicativeExpression", List(pYield, pAwait)))
      var s = ScalaSet[MultiplicativeExpression]()
      val ExponentiationExpression_0_0 = _ExponentiationExpression(pYield, pAwait).toList
      val max0 = List(ExponentiationExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ExponentiationExpression_0_0.applyOrElse(i, (_: Int) => _ExponentiationExpression(pYield, pAwait).head)
        s += MultiplicativeExpression0(arg0, List(pYield, pAwait))
      }
      val MultiplicativeExpression_1_0 = _MultiplicativeExpression(pYield, pAwait).toList
      val MultiplicativeOperator_1_1 = _MultiplicativeOperator().toList
      val ExponentiationExpression_1_2 = _ExponentiationExpression(pYield, pAwait).toList
      val max1 = List(MultiplicativeExpression_1_0, MultiplicativeOperator_1_1, ExponentiationExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = MultiplicativeExpression_1_0.applyOrElse(i, (_: Int) => _MultiplicativeExpression(pYield, pAwait).head)
        val arg1 = MultiplicativeOperator_1_1.applyOrElse(i, (_: Int) => _MultiplicativeOperator().head)
        val arg2 = ExponentiationExpression_1_2.applyOrElse(i, (_: Int) => _ExponentiationExpression(pYield, pAwait).head)
        s += MultiplicativeExpression1(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.MultiplicativeExpression(pYield, pAwait).depth
      val sample = randomSampler.MultiplicativeExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def MultiplicativeOperator(): ScalaSet[MultiplicativeOperator] = {
    visited = ScalaSet()
    _MultiplicativeOperator()
  }
  private def _MultiplicativeOperator(): ScalaSet[MultiplicativeOperator] = {
    if (!visited.contains("MultiplicativeOperator", List())) {
      visited += (("MultiplicativeOperator", List()))
      var s = ScalaSet[MultiplicativeOperator]()
      s += MultiplicativeOperator0(List())
      s += MultiplicativeOperator1(List())
      s += MultiplicativeOperator2(List())
      s
    } else {
      val d = counter.MultiplicativeOperator().depth
      val sample = randomSampler.MultiplicativeOperator(d)
      ScalaSet(sample)
    }
  }
  def AdditiveExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[AdditiveExpression] = {
    visited = ScalaSet()
    _AdditiveExpression(pYield, pAwait)
  }
  private def _AdditiveExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[AdditiveExpression] = {
    if (!visited.contains("AdditiveExpression", List(pYield, pAwait))) {
      visited += (("AdditiveExpression", List(pYield, pAwait)))
      var s = ScalaSet[AdditiveExpression]()
      val MultiplicativeExpression_0_0 = _MultiplicativeExpression(pYield, pAwait).toList
      val max0 = List(MultiplicativeExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MultiplicativeExpression_0_0.applyOrElse(i, (_: Int) => _MultiplicativeExpression(pYield, pAwait).head)
        s += AdditiveExpression0(arg0, List(pYield, pAwait))
      }
      val AdditiveExpression_1_0 = _AdditiveExpression(pYield, pAwait).toList
      val MultiplicativeExpression_1_2 = _MultiplicativeExpression(pYield, pAwait).toList
      val max1 = List(AdditiveExpression_1_0, MultiplicativeExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AdditiveExpression_1_0.applyOrElse(i, (_: Int) => _AdditiveExpression(pYield, pAwait).head)
        val arg1 = MultiplicativeExpression_1_2.applyOrElse(i, (_: Int) => _MultiplicativeExpression(pYield, pAwait).head)
        s += AdditiveExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val AdditiveExpression_2_0 = _AdditiveExpression(pYield, pAwait).toList
      val MultiplicativeExpression_2_2 = _MultiplicativeExpression(pYield, pAwait).toList
      val max2 = List(AdditiveExpression_2_0, MultiplicativeExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AdditiveExpression_2_0.applyOrElse(i, (_: Int) => _AdditiveExpression(pYield, pAwait).head)
        val arg1 = MultiplicativeExpression_2_2.applyOrElse(i, (_: Int) => _MultiplicativeExpression(pYield, pAwait).head)
        s += AdditiveExpression2(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AdditiveExpression(pYield, pAwait).depth
      val sample = randomSampler.AdditiveExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ShiftExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ShiftExpression] = {
    visited = ScalaSet()
    _ShiftExpression(pYield, pAwait)
  }
  private def _ShiftExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ShiftExpression] = {
    if (!visited.contains("ShiftExpression", List(pYield, pAwait))) {
      visited += (("ShiftExpression", List(pYield, pAwait)))
      var s = ScalaSet[ShiftExpression]()
      val AdditiveExpression_0_0 = _AdditiveExpression(pYield, pAwait).toList
      val max0 = List(AdditiveExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AdditiveExpression_0_0.applyOrElse(i, (_: Int) => _AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression0(arg0, List(pYield, pAwait))
      }
      val ShiftExpression_1_0 = _ShiftExpression(pYield, pAwait).toList
      val AdditiveExpression_1_2 = _AdditiveExpression(pYield, pAwait).toList
      val max1 = List(ShiftExpression_1_0, AdditiveExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ShiftExpression_1_0.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        val arg1 = AdditiveExpression_1_2.applyOrElse(i, (_: Int) => _AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val ShiftExpression_2_0 = _ShiftExpression(pYield, pAwait).toList
      val AdditiveExpression_2_2 = _AdditiveExpression(pYield, pAwait).toList
      val max2 = List(ShiftExpression_2_0, AdditiveExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ShiftExpression_2_0.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        val arg1 = AdditiveExpression_2_2.applyOrElse(i, (_: Int) => _AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression2(arg0, arg1, List(pYield, pAwait))
      }
      val ShiftExpression_3_0 = _ShiftExpression(pYield, pAwait).toList
      val AdditiveExpression_3_2 = _AdditiveExpression(pYield, pAwait).toList
      val max3 = List(ShiftExpression_3_0, AdditiveExpression_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ShiftExpression_3_0.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        val arg1 = AdditiveExpression_3_2.applyOrElse(i, (_: Int) => _AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression3(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ShiftExpression(pYield, pAwait).depth
      val sample = randomSampler.ShiftExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[RelationalExpression] = {
    visited = ScalaSet()
    _RelationalExpression(pIn, pYield, pAwait)
  }
  private def _RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[RelationalExpression] = {
    if (!visited.contains("RelationalExpression", List(pIn, pYield, pAwait))) {
      visited += (("RelationalExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[RelationalExpression]()
      val ShiftExpression_0_0 = _ShiftExpression(pYield, pAwait).toList
      val max0 = List(ShiftExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ShiftExpression_0_0.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_1_0 = _RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_1_2 = _ShiftExpression(pYield, pAwait).toList
      val max1 = List(RelationalExpression_1_0, ShiftExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = RelationalExpression_1_0.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_1_2.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_2_0 = _RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_2_2 = _ShiftExpression(pYield, pAwait).toList
      val max2 = List(RelationalExpression_2_0, ShiftExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = RelationalExpression_2_0.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_2_2.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression2(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_3_0 = _RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_3_2 = _ShiftExpression(pYield, pAwait).toList
      val max3 = List(RelationalExpression_3_0, ShiftExpression_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = RelationalExpression_3_0.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_3_2.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression3(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_4_0 = _RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_4_2 = _ShiftExpression(pYield, pAwait).toList
      val max4 = List(RelationalExpression_4_0, ShiftExpression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = RelationalExpression_4_0.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_4_2.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression4(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_5_0 = _RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_5_2 = _ShiftExpression(pYield, pAwait).toList
      val max5 = List(RelationalExpression_5_0, ShiftExpression_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = RelationalExpression_5_0.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_5_2.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression5(arg0, arg1, List(pIn, pYield, pAwait))
      }
      if (pIn) {
        val RelationalExpression_6_0 = _RelationalExpression(true, pYield, pAwait).toList
        val ShiftExpression_6_2 = _ShiftExpression(pYield, pAwait).toList
        val max6 = List(RelationalExpression_6_0, ShiftExpression_6_2).map(_.length).max
        for (i <- (0 until max6)) {
          val arg0 = RelationalExpression_6_0.applyOrElse(i, (_: Int) => _RelationalExpression(true, pYield, pAwait).head)
          val arg1 = ShiftExpression_6_2.applyOrElse(i, (_: Int) => _ShiftExpression(pYield, pAwait).head)
          s += RelationalExpression6(arg0, arg1, List(pIn, pYield, pAwait))
        }
      }
      s
    } else {
      val d = counter.RelationalExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.RelationalExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[EqualityExpression] = {
    visited = ScalaSet()
    _EqualityExpression(pIn, pYield, pAwait)
  }
  private def _EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[EqualityExpression] = {
    if (!visited.contains("EqualityExpression", List(pIn, pYield, pAwait))) {
      visited += (("EqualityExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[EqualityExpression]()
      val RelationalExpression_0_0 = _RelationalExpression(pIn, pYield, pAwait).toList
      val max0 = List(RelationalExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = RelationalExpression_0_0.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_1_0 = _EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_1_2 = _RelationalExpression(pIn, pYield, pAwait).toList
      val max1 = List(EqualityExpression_1_0, RelationalExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = EqualityExpression_1_0.applyOrElse(i, (_: Int) => _EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_1_2.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_2_0 = _EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_2_2 = _RelationalExpression(pIn, pYield, pAwait).toList
      val max2 = List(EqualityExpression_2_0, RelationalExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = EqualityExpression_2_0.applyOrElse(i, (_: Int) => _EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_2_2.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression2(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_3_0 = _EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_3_2 = _RelationalExpression(pIn, pYield, pAwait).toList
      val max3 = List(EqualityExpression_3_0, RelationalExpression_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = EqualityExpression_3_0.applyOrElse(i, (_: Int) => _EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_3_2.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression3(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_4_0 = _EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_4_2 = _RelationalExpression(pIn, pYield, pAwait).toList
      val max4 = List(EqualityExpression_4_0, RelationalExpression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = EqualityExpression_4_0.applyOrElse(i, (_: Int) => _EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_4_2.applyOrElse(i, (_: Int) => _RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression4(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.EqualityExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.EqualityExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseANDExpression] = {
    visited = ScalaSet()
    _BitwiseANDExpression(pIn, pYield, pAwait)
  }
  private def _BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseANDExpression] = {
    if (!visited.contains("BitwiseANDExpression", List(pIn, pYield, pAwait))) {
      visited += (("BitwiseANDExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BitwiseANDExpression]()
      val EqualityExpression_0_0 = _EqualityExpression(pIn, pYield, pAwait).toList
      val max0 = List(EqualityExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = EqualityExpression_0_0.applyOrElse(i, (_: Int) => _EqualityExpression(pIn, pYield, pAwait).head)
        s += BitwiseANDExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseANDExpression_1_0 = _BitwiseANDExpression(pIn, pYield, pAwait).toList
      val EqualityExpression_1_2 = _EqualityExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseANDExpression_1_0, EqualityExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseANDExpression_1_0.applyOrElse(i, (_: Int) => _BitwiseANDExpression(pIn, pYield, pAwait).head)
        val arg1 = EqualityExpression_1_2.applyOrElse(i, (_: Int) => _EqualityExpression(pIn, pYield, pAwait).head)
        s += BitwiseANDExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.BitwiseANDExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.BitwiseANDExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseXORExpression] = {
    visited = ScalaSet()
    _BitwiseXORExpression(pIn, pYield, pAwait)
  }
  private def _BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseXORExpression] = {
    if (!visited.contains("BitwiseXORExpression", List(pIn, pYield, pAwait))) {
      visited += (("BitwiseXORExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BitwiseXORExpression]()
      val BitwiseANDExpression_0_0 = _BitwiseANDExpression(pIn, pYield, pAwait).toList
      val max0 = List(BitwiseANDExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BitwiseANDExpression_0_0.applyOrElse(i, (_: Int) => _BitwiseANDExpression(pIn, pYield, pAwait).head)
        s += BitwiseXORExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseXORExpression_1_0 = _BitwiseXORExpression(pIn, pYield, pAwait).toList
      val BitwiseANDExpression_1_2 = _BitwiseANDExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseXORExpression_1_0, BitwiseANDExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseXORExpression_1_0.applyOrElse(i, (_: Int) => _BitwiseXORExpression(pIn, pYield, pAwait).head)
        val arg1 = BitwiseANDExpression_1_2.applyOrElse(i, (_: Int) => _BitwiseANDExpression(pIn, pYield, pAwait).head)
        s += BitwiseXORExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.BitwiseXORExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.BitwiseXORExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseORExpression] = {
    visited = ScalaSet()
    _BitwiseORExpression(pIn, pYield, pAwait)
  }
  private def _BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseORExpression] = {
    if (!visited.contains("BitwiseORExpression", List(pIn, pYield, pAwait))) {
      visited += (("BitwiseORExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BitwiseORExpression]()
      val BitwiseXORExpression_0_0 = _BitwiseXORExpression(pIn, pYield, pAwait).toList
      val max0 = List(BitwiseXORExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BitwiseXORExpression_0_0.applyOrElse(i, (_: Int) => _BitwiseXORExpression(pIn, pYield, pAwait).head)
        s += BitwiseORExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseORExpression_1_0 = _BitwiseORExpression(pIn, pYield, pAwait).toList
      val BitwiseXORExpression_1_2 = _BitwiseXORExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseORExpression_1_0, BitwiseXORExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseORExpression_1_0.applyOrElse(i, (_: Int) => _BitwiseORExpression(pIn, pYield, pAwait).head)
        val arg1 = BitwiseXORExpression_1_2.applyOrElse(i, (_: Int) => _BitwiseXORExpression(pIn, pYield, pAwait).head)
        s += BitwiseORExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.BitwiseORExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.BitwiseORExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LogicalANDExpression] = {
    visited = ScalaSet()
    _LogicalANDExpression(pIn, pYield, pAwait)
  }
  private def _LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LogicalANDExpression] = {
    if (!visited.contains("LogicalANDExpression", List(pIn, pYield, pAwait))) {
      visited += (("LogicalANDExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LogicalANDExpression]()
      val BitwiseORExpression_0_0 = _BitwiseORExpression(pIn, pYield, pAwait).toList
      val max0 = List(BitwiseORExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BitwiseORExpression_0_0.applyOrElse(i, (_: Int) => _BitwiseORExpression(pIn, pYield, pAwait).head)
        s += LogicalANDExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val LogicalANDExpression_1_0 = _LogicalANDExpression(pIn, pYield, pAwait).toList
      val BitwiseORExpression_1_2 = _BitwiseORExpression(pIn, pYield, pAwait).toList
      val max1 = List(LogicalANDExpression_1_0, BitwiseORExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LogicalANDExpression_1_0.applyOrElse(i, (_: Int) => _LogicalANDExpression(pIn, pYield, pAwait).head)
        val arg1 = BitwiseORExpression_1_2.applyOrElse(i, (_: Int) => _BitwiseORExpression(pIn, pYield, pAwait).head)
        s += LogicalANDExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.LogicalANDExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.LogicalANDExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LogicalORExpression] = {
    visited = ScalaSet()
    _LogicalORExpression(pIn, pYield, pAwait)
  }
  private def _LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LogicalORExpression] = {
    if (!visited.contains("LogicalORExpression", List(pIn, pYield, pAwait))) {
      visited += (("LogicalORExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LogicalORExpression]()
      val LogicalANDExpression_0_0 = _LogicalANDExpression(pIn, pYield, pAwait).toList
      val max0 = List(LogicalANDExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LogicalANDExpression_0_0.applyOrElse(i, (_: Int) => _LogicalANDExpression(pIn, pYield, pAwait).head)
        s += LogicalORExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val LogicalORExpression_1_0 = _LogicalORExpression(pIn, pYield, pAwait).toList
      val LogicalANDExpression_1_2 = _LogicalANDExpression(pIn, pYield, pAwait).toList
      val max1 = List(LogicalORExpression_1_0, LogicalANDExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LogicalORExpression_1_0.applyOrElse(i, (_: Int) => _LogicalORExpression(pIn, pYield, pAwait).head)
        val arg1 = LogicalANDExpression_1_2.applyOrElse(i, (_: Int) => _LogicalANDExpression(pIn, pYield, pAwait).head)
        s += LogicalORExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.LogicalORExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.LogicalORExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[CoalesceExpression] = {
    visited = ScalaSet()
    _CoalesceExpression(pIn, pYield, pAwait)
  }
  private def _CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[CoalesceExpression] = {
    if (!visited.contains("CoalesceExpression", List(pIn, pYield, pAwait))) {
      visited += (("CoalesceExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[CoalesceExpression]()
      val CoalesceExpressionHead_0_0 = _CoalesceExpressionHead(pIn, pYield, pAwait).toList
      val BitwiseORExpression_0_2 = _BitwiseORExpression(pIn, pYield, pAwait).toList
      val max0 = List(CoalesceExpressionHead_0_0, BitwiseORExpression_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CoalesceExpressionHead_0_0.applyOrElse(i, (_: Int) => _CoalesceExpressionHead(pIn, pYield, pAwait).head)
        val arg1 = BitwiseORExpression_0_2.applyOrElse(i, (_: Int) => _BitwiseORExpression(pIn, pYield, pAwait).head)
        s += CoalesceExpression0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.CoalesceExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.CoalesceExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[CoalesceExpressionHead] = {
    visited = ScalaSet()
    _CoalesceExpressionHead(pIn, pYield, pAwait)
  }
  private def _CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[CoalesceExpressionHead] = {
    if (!visited.contains("CoalesceExpressionHead", List(pIn, pYield, pAwait))) {
      visited += (("CoalesceExpressionHead", List(pIn, pYield, pAwait)))
      var s = ScalaSet[CoalesceExpressionHead]()
      val CoalesceExpression_0_0 = _CoalesceExpression(pIn, pYield, pAwait).toList
      val max0 = List(CoalesceExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CoalesceExpression_0_0.applyOrElse(i, (_: Int) => _CoalesceExpression(pIn, pYield, pAwait).head)
        s += CoalesceExpressionHead0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseORExpression_1_0 = _BitwiseORExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseORExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseORExpression_1_0.applyOrElse(i, (_: Int) => _BitwiseORExpression(pIn, pYield, pAwait).head)
        s += CoalesceExpressionHead1(arg0, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.CoalesceExpressionHead(pIn, pYield, pAwait).depth
      val sample = randomSampler.CoalesceExpressionHead(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ShortCircuitExpression] = {
    visited = ScalaSet()
    _ShortCircuitExpression(pIn, pYield, pAwait)
  }
  private def _ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ShortCircuitExpression] = {
    if (!visited.contains("ShortCircuitExpression", List(pIn, pYield, pAwait))) {
      visited += (("ShortCircuitExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[ShortCircuitExpression]()
      val LogicalORExpression_0_0 = _LogicalORExpression(pIn, pYield, pAwait).toList
      val max0 = List(LogicalORExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LogicalORExpression_0_0.applyOrElse(i, (_: Int) => _LogicalORExpression(pIn, pYield, pAwait).head)
        s += ShortCircuitExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val CoalesceExpression_1_0 = _CoalesceExpression(pIn, pYield, pAwait).toList
      val max1 = List(CoalesceExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoalesceExpression_1_0.applyOrElse(i, (_: Int) => _CoalesceExpression(pIn, pYield, pAwait).head)
        s += ShortCircuitExpression1(arg0, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.ShortCircuitExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.ShortCircuitExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ConditionalExpression] = {
    visited = ScalaSet()
    _ConditionalExpression(pIn, pYield, pAwait)
  }
  private def _ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ConditionalExpression] = {
    if (!visited.contains("ConditionalExpression", List(pIn, pYield, pAwait))) {
      visited += (("ConditionalExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[ConditionalExpression]()
      val ShortCircuitExpression_0_0 = _ShortCircuitExpression(pIn, pYield, pAwait).toList
      val max0 = List(ShortCircuitExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ShortCircuitExpression_0_0.applyOrElse(i, (_: Int) => _ShortCircuitExpression(pIn, pYield, pAwait).head)
        s += ConditionalExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val ShortCircuitExpression_1_0 = _ShortCircuitExpression(pIn, pYield, pAwait).toList
      val AssignmentExpression_1_2 = _AssignmentExpression(true, pYield, pAwait).toList
      val AssignmentExpression_1_4 = _AssignmentExpression(pIn, pYield, pAwait).toList
      val max1 = List(ShortCircuitExpression_1_0, AssignmentExpression_1_2, AssignmentExpression_1_4).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ShortCircuitExpression_1_0.applyOrElse(i, (_: Int) => _ShortCircuitExpression(pIn, pYield, pAwait).head)
        val arg1 = AssignmentExpression_1_2.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = AssignmentExpression_1_4.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, pYield, pAwait).head)
        s += ConditionalExpression1(arg0, arg1, arg2, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.ConditionalExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.ConditionalExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentExpression] = {
    visited = ScalaSet()
    _AssignmentExpression(pIn, pYield, pAwait)
  }
  private def _AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentExpression] = {
    if (!visited.contains("AssignmentExpression", List(pIn, pYield, pAwait))) {
      visited += (("AssignmentExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[AssignmentExpression]()
      val ConditionalExpression_0_0 = _ConditionalExpression(pIn, pYield, pAwait).toList
      val max0 = List(ConditionalExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ConditionalExpression_0_0.applyOrElse(i, (_: Int) => _ConditionalExpression(pIn, pYield, pAwait).head)
        s += AssignmentExpression0(arg0, List(pIn, pYield, pAwait))
      }
      if (pYield) {
        val YieldExpression_1_0 = _YieldExpression(pIn, pAwait).toList
        val max1 = List(YieldExpression_1_0).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = YieldExpression_1_0.applyOrElse(i, (_: Int) => _YieldExpression(pIn, pAwait).head)
          s += AssignmentExpression1(arg0, List(pIn, pYield, pAwait))
        }
      }
      val ArrowFunction_2_0 = _ArrowFunction(pIn, pYield, pAwait).toList
      val max2 = List(ArrowFunction_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ArrowFunction_2_0.applyOrElse(i, (_: Int) => _ArrowFunction(pIn, pYield, pAwait).head)
        s += AssignmentExpression2(arg0, List(pIn, pYield, pAwait))
      }
      val AsyncArrowFunction_3_0 = _AsyncArrowFunction(pIn, pYield, pAwait).toList
      val max3 = List(AsyncArrowFunction_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AsyncArrowFunction_3_0.applyOrElse(i, (_: Int) => _AsyncArrowFunction(pIn, pYield, pAwait).head)
        s += AssignmentExpression3(arg0, List(pIn, pYield, pAwait))
      }
      val LeftHandSideExpression_4_0 = _LeftHandSideExpression(pYield, pAwait).toList
      val AssignmentExpression_4_2 = _AssignmentExpression(pIn, pYield, pAwait).toList
      val max4 = List(LeftHandSideExpression_4_0, AssignmentExpression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = LeftHandSideExpression_4_0.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = AssignmentExpression_4_2.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, pYield, pAwait).head)
        s += AssignmentExpression4(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val LeftHandSideExpression_5_0 = _LeftHandSideExpression(pYield, pAwait).toList
      val AssignmentOperator_5_1 = _AssignmentOperator().toList
      val AssignmentExpression_5_2 = _AssignmentExpression(pIn, pYield, pAwait).toList
      val max5 = List(LeftHandSideExpression_5_0, AssignmentOperator_5_1, AssignmentExpression_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = LeftHandSideExpression_5_0.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = AssignmentOperator_5_1.applyOrElse(i, (_: Int) => _AssignmentOperator().head)
        val arg2 = AssignmentExpression_5_2.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, pYield, pAwait).head)
        s += AssignmentExpression5(arg0, arg1, arg2, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentExpression(pIn, pYield, pAwait).depth
      val sample = randomSampler.AssignmentExpression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentOperator(): ScalaSet[AssignmentOperator] = {
    visited = ScalaSet()
    _AssignmentOperator()
  }
  private def _AssignmentOperator(): ScalaSet[AssignmentOperator] = {
    if (!visited.contains("AssignmentOperator", List())) {
      visited += (("AssignmentOperator", List()))
      var s = ScalaSet[AssignmentOperator]()
      s += AssignmentOperator0(List())
      s += AssignmentOperator1(List())
      s += AssignmentOperator2(List())
      s += AssignmentOperator3(List())
      s += AssignmentOperator4(List())
      s += AssignmentOperator5(List())
      s += AssignmentOperator6(List())
      s += AssignmentOperator7(List())
      s += AssignmentOperator8(List())
      s += AssignmentOperator9(List())
      s += AssignmentOperator10(List())
      s += AssignmentOperator11(List())
      s
    } else {
      val d = counter.AssignmentOperator().depth
      val sample = randomSampler.AssignmentOperator(d)
      ScalaSet(sample)
    }
  }
  def AssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentPattern] = {
    visited = ScalaSet()
    _AssignmentPattern(pYield, pAwait)
  }
  private def _AssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentPattern] = {
    if (!visited.contains("AssignmentPattern", List(pYield, pAwait))) {
      visited += (("AssignmentPattern", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentPattern]()
      val ObjectAssignmentPattern_0_0 = _ObjectAssignmentPattern(pYield, pAwait).toList
      val max0 = List(ObjectAssignmentPattern_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ObjectAssignmentPattern_0_0.applyOrElse(i, (_: Int) => _ObjectAssignmentPattern(pYield, pAwait).head)
        s += AssignmentPattern0(arg0, List(pYield, pAwait))
      }
      val ArrayAssignmentPattern_1_0 = _ArrayAssignmentPattern(pYield, pAwait).toList
      val max1 = List(ArrayAssignmentPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ArrayAssignmentPattern_1_0.applyOrElse(i, (_: Int) => _ArrayAssignmentPattern(pYield, pAwait).head)
        s += AssignmentPattern1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentPattern(pYield, pAwait).depth
      val sample = randomSampler.AssignmentPattern(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectAssignmentPattern] = {
    visited = ScalaSet()
    _ObjectAssignmentPattern(pYield, pAwait)
  }
  private def _ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectAssignmentPattern] = {
    if (!visited.contains("ObjectAssignmentPattern", List(pYield, pAwait))) {
      visited += (("ObjectAssignmentPattern", List(pYield, pAwait)))
      var s = ScalaSet[ObjectAssignmentPattern]()
      s += ObjectAssignmentPattern0(List(pYield, pAwait))
      val AssignmentRestProperty_1_1 = _AssignmentRestProperty(pYield, pAwait).toList
      val max1 = List(AssignmentRestProperty_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentRestProperty_1_1.applyOrElse(i, (_: Int) => _AssignmentRestProperty(pYield, pAwait).head)
        s += ObjectAssignmentPattern1(arg0, List(pYield, pAwait))
      }
      val AssignmentPropertyList_2_1 = _AssignmentPropertyList(pYield, pAwait).toList
      val max2 = List(AssignmentPropertyList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AssignmentPropertyList_2_1.applyOrElse(i, (_: Int) => _AssignmentPropertyList(pYield, pAwait).head)
        s += ObjectAssignmentPattern2(arg0, List(pYield, pAwait))
      }
      val AssignmentPropertyList_3_1 = _AssignmentPropertyList(pYield, pAwait).toList
      val AssignmentRestProperty_3_3 = _AssignmentRestProperty(pYield, pAwait).toList
      val max3 = List(AssignmentPropertyList_3_1, AssignmentRestProperty_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AssignmentPropertyList_3_1.applyOrElse(i, (_: Int) => _AssignmentPropertyList(pYield, pAwait).head)
        val arg1 = AssignmentRestProperty_3_3.applyOrElse(i, (_: Int) => _AssignmentRestProperty(pYield, pAwait).head)
        s += ObjectAssignmentPattern3(arg0, Some(arg1), List(pYield, pAwait))
        s += ObjectAssignmentPattern3(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ObjectAssignmentPattern(pYield, pAwait).depth
      val sample = randomSampler.ObjectAssignmentPattern(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayAssignmentPattern] = {
    visited = ScalaSet()
    _ArrayAssignmentPattern(pYield, pAwait)
  }
  private def _ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayAssignmentPattern] = {
    if (!visited.contains("ArrayAssignmentPattern", List(pYield, pAwait))) {
      visited += (("ArrayAssignmentPattern", List(pYield, pAwait)))
      var s = ScalaSet[ArrayAssignmentPattern]()
      val Elision_0_1 = _Elision().toList
      val AssignmentRestElement_0_2 = _AssignmentRestElement(pYield, pAwait).toList
      val max0 = List(Elision_0_1, AssignmentRestElement_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_1.applyOrElse(i, (_: Int) => _Elision().head)
        val arg1 = AssignmentRestElement_0_2.applyOrElse(i, (_: Int) => _AssignmentRestElement(pYield, pAwait).head)
        s += ArrayAssignmentPattern0(Some(arg0), Some(arg1), List(pYield, pAwait))
        s += ArrayAssignmentPattern0(Some(arg0), None, List(pYield, pAwait))
        s += ArrayAssignmentPattern0(None, Some(arg1), List(pYield, pAwait))
        s += ArrayAssignmentPattern0(None, None, List(pYield, pAwait))
      }
      val AssignmentElementList_1_1 = _AssignmentElementList(pYield, pAwait).toList
      val max1 = List(AssignmentElementList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentElementList_1_1.applyOrElse(i, (_: Int) => _AssignmentElementList(pYield, pAwait).head)
        s += ArrayAssignmentPattern1(arg0, List(pYield, pAwait))
      }
      val AssignmentElementList_2_1 = _AssignmentElementList(pYield, pAwait).toList
      val Elision_2_3 = _Elision().toList
      val AssignmentRestElement_2_4 = _AssignmentRestElement(pYield, pAwait).toList
      val max2 = List(AssignmentElementList_2_1, Elision_2_3, AssignmentRestElement_2_4).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AssignmentElementList_2_1.applyOrElse(i, (_: Int) => _AssignmentElementList(pYield, pAwait).head)
        val arg1 = Elision_2_3.applyOrElse(i, (_: Int) => _Elision().head)
        val arg2 = AssignmentRestElement_2_4.applyOrElse(i, (_: Int) => _AssignmentRestElement(pYield, pAwait).head)
        s += ArrayAssignmentPattern2(arg0, Some(arg1), Some(arg2), List(pYield, pAwait))
        s += ArrayAssignmentPattern2(arg0, Some(arg1), None, List(pYield, pAwait))
        s += ArrayAssignmentPattern2(arg0, None, Some(arg2), List(pYield, pAwait))
        s += ArrayAssignmentPattern2(arg0, None, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArrayAssignmentPattern(pYield, pAwait).depth
      val sample = randomSampler.ArrayAssignmentPattern(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentRestProperty] = {
    visited = ScalaSet()
    _AssignmentRestProperty(pYield, pAwait)
  }
  private def _AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentRestProperty] = {
    if (!visited.contains("AssignmentRestProperty", List(pYield, pAwait))) {
      visited += (("AssignmentRestProperty", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentRestProperty]()
      val DestructuringAssignmentTarget_0_1 = _DestructuringAssignmentTarget(pYield, pAwait).toList
      val max0 = List(DestructuringAssignmentTarget_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = DestructuringAssignmentTarget_0_1.applyOrElse(i, (_: Int) => _DestructuringAssignmentTarget(pYield, pAwait).head)
        s += AssignmentRestProperty0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentRestProperty(pYield, pAwait).depth
      val sample = randomSampler.AssignmentRestProperty(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentPropertyList] = {
    visited = ScalaSet()
    _AssignmentPropertyList(pYield, pAwait)
  }
  private def _AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentPropertyList] = {
    if (!visited.contains("AssignmentPropertyList", List(pYield, pAwait))) {
      visited += (("AssignmentPropertyList", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentPropertyList]()
      val AssignmentProperty_0_0 = _AssignmentProperty(pYield, pAwait).toList
      val max0 = List(AssignmentProperty_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentProperty_0_0.applyOrElse(i, (_: Int) => _AssignmentProperty(pYield, pAwait).head)
        s += AssignmentPropertyList0(arg0, List(pYield, pAwait))
      }
      val AssignmentPropertyList_1_0 = _AssignmentPropertyList(pYield, pAwait).toList
      val AssignmentProperty_1_2 = _AssignmentProperty(pYield, pAwait).toList
      val max1 = List(AssignmentPropertyList_1_0, AssignmentProperty_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentPropertyList_1_0.applyOrElse(i, (_: Int) => _AssignmentPropertyList(pYield, pAwait).head)
        val arg1 = AssignmentProperty_1_2.applyOrElse(i, (_: Int) => _AssignmentProperty(pYield, pAwait).head)
        s += AssignmentPropertyList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentPropertyList(pYield, pAwait).depth
      val sample = randomSampler.AssignmentPropertyList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElementList] = {
    visited = ScalaSet()
    _AssignmentElementList(pYield, pAwait)
  }
  private def _AssignmentElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElementList] = {
    if (!visited.contains("AssignmentElementList", List(pYield, pAwait))) {
      visited += (("AssignmentElementList", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentElementList]()
      val AssignmentElisionElement_0_0 = _AssignmentElisionElement(pYield, pAwait).toList
      val max0 = List(AssignmentElisionElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentElisionElement_0_0.applyOrElse(i, (_: Int) => _AssignmentElisionElement(pYield, pAwait).head)
        s += AssignmentElementList0(arg0, List(pYield, pAwait))
      }
      val AssignmentElementList_1_0 = _AssignmentElementList(pYield, pAwait).toList
      val AssignmentElisionElement_1_2 = _AssignmentElisionElement(pYield, pAwait).toList
      val max1 = List(AssignmentElementList_1_0, AssignmentElisionElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentElementList_1_0.applyOrElse(i, (_: Int) => _AssignmentElementList(pYield, pAwait).head)
        val arg1 = AssignmentElisionElement_1_2.applyOrElse(i, (_: Int) => _AssignmentElisionElement(pYield, pAwait).head)
        s += AssignmentElementList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentElementList(pYield, pAwait).depth
      val sample = randomSampler.AssignmentElementList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElisionElement] = {
    visited = ScalaSet()
    _AssignmentElisionElement(pYield, pAwait)
  }
  private def _AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElisionElement] = {
    if (!visited.contains("AssignmentElisionElement", List(pYield, pAwait))) {
      visited += (("AssignmentElisionElement", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentElisionElement]()
      val Elision_0_0 = _Elision().toList
      val AssignmentElement_0_1 = _AssignmentElement(pYield, pAwait).toList
      val max0 = List(Elision_0_0, AssignmentElement_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_0.applyOrElse(i, (_: Int) => _Elision().head)
        val arg1 = AssignmentElement_0_1.applyOrElse(i, (_: Int) => _AssignmentElement(pYield, pAwait).head)
        s += AssignmentElisionElement0(Some(arg0), arg1, List(pYield, pAwait))
        s += AssignmentElisionElement0(None, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentElisionElement(pYield, pAwait).depth
      val sample = randomSampler.AssignmentElisionElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentProperty] = {
    visited = ScalaSet()
    _AssignmentProperty(pYield, pAwait)
  }
  private def _AssignmentProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentProperty] = {
    if (!visited.contains("AssignmentProperty", List(pYield, pAwait))) {
      visited += (("AssignmentProperty", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentProperty]()
      val IdentifierReference_0_0 = _IdentifierReference(pYield, pAwait).toList
      val Initializer_0_1 = _Initializer(true, pYield, pAwait).toList
      val max0 = List(IdentifierReference_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierReference_0_0.applyOrElse(i, (_: Int) => _IdentifierReference(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => _Initializer(true, pYield, pAwait).head)
        s += AssignmentProperty0(arg0, Some(arg1), List(pYield, pAwait))
        s += AssignmentProperty0(arg0, None, List(pYield, pAwait))
      }
      val PropertyName_1_0 = _PropertyName(pYield, pAwait).toList
      val AssignmentElement_1_2 = _AssignmentElement(pYield, pAwait).toList
      val max1 = List(PropertyName_1_0, AssignmentElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyName_1_0.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = AssignmentElement_1_2.applyOrElse(i, (_: Int) => _AssignmentElement(pYield, pAwait).head)
        s += AssignmentProperty1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentProperty(pYield, pAwait).depth
      val sample = randomSampler.AssignmentProperty(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElement] = {
    visited = ScalaSet()
    _AssignmentElement(pYield, pAwait)
  }
  private def _AssignmentElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElement] = {
    if (!visited.contains("AssignmentElement", List(pYield, pAwait))) {
      visited += (("AssignmentElement", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentElement]()
      val DestructuringAssignmentTarget_0_0 = _DestructuringAssignmentTarget(pYield, pAwait).toList
      val Initializer_0_1 = _Initializer(true, pYield, pAwait).toList
      val max0 = List(DestructuringAssignmentTarget_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = DestructuringAssignmentTarget_0_0.applyOrElse(i, (_: Int) => _DestructuringAssignmentTarget(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => _Initializer(true, pYield, pAwait).head)
        s += AssignmentElement0(arg0, Some(arg1), List(pYield, pAwait))
        s += AssignmentElement0(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentElement(pYield, pAwait).depth
      val sample = randomSampler.AssignmentElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AssignmentRestElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentRestElement] = {
    visited = ScalaSet()
    _AssignmentRestElement(pYield, pAwait)
  }
  private def _AssignmentRestElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentRestElement] = {
    if (!visited.contains("AssignmentRestElement", List(pYield, pAwait))) {
      visited += (("AssignmentRestElement", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentRestElement]()
      val DestructuringAssignmentTarget_0_1 = _DestructuringAssignmentTarget(pYield, pAwait).toList
      val max0 = List(DestructuringAssignmentTarget_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = DestructuringAssignmentTarget_0_1.applyOrElse(i, (_: Int) => _DestructuringAssignmentTarget(pYield, pAwait).head)
        s += AssignmentRestElement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AssignmentRestElement(pYield, pAwait).depth
      val sample = randomSampler.AssignmentRestElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): ScalaSet[DestructuringAssignmentTarget] = {
    visited = ScalaSet()
    _DestructuringAssignmentTarget(pYield, pAwait)
  }
  private def _DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): ScalaSet[DestructuringAssignmentTarget] = {
    if (!visited.contains("DestructuringAssignmentTarget", List(pYield, pAwait))) {
      visited += (("DestructuringAssignmentTarget", List(pYield, pAwait)))
      var s = ScalaSet[DestructuringAssignmentTarget]()
      val LeftHandSideExpression_0_0 = _LeftHandSideExpression(pYield, pAwait).toList
      val max0 = List(LeftHandSideExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LeftHandSideExpression_0_0.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        s += DestructuringAssignmentTarget0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.DestructuringAssignmentTarget(pYield, pAwait).depth
      val sample = randomSampler.DestructuringAssignmentTarget(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[Expression] = {
    visited = ScalaSet()
    _Expression(pIn, pYield, pAwait)
  }
  private def _Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[Expression] = {
    if (!visited.contains("Expression", List(pIn, pYield, pAwait))) {
      visited += (("Expression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[Expression]()
      val AssignmentExpression_0_0 = _AssignmentExpression(pIn, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_0.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, pYield, pAwait).head)
        s += Expression0(arg0, List(pIn, pYield, pAwait))
      }
      val Expression_1_0 = _Expression(pIn, pYield, pAwait).toList
      val AssignmentExpression_1_2 = _AssignmentExpression(pIn, pYield, pAwait).toList
      val max1 = List(Expression_1_0, AssignmentExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_0.applyOrElse(i, (_: Int) => _Expression(pIn, pYield, pAwait).head)
        val arg1 = AssignmentExpression_1_2.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, pYield, pAwait).head)
        s += Expression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.Expression(pIn, pYield, pAwait).depth
      val sample = randomSampler.Expression(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Statement] = {
    visited = ScalaSet()
    _Statement(pYield, pAwait, pReturn)
  }
  private def _Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Statement] = {
    if (!visited.contains("Statement", List(pYield, pAwait, pReturn))) {
      visited += (("Statement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Statement]()
      val BlockStatement_0_0 = _BlockStatement(pYield, pAwait, pReturn).toList
      val max0 = List(BlockStatement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BlockStatement_0_0.applyOrElse(i, (_: Int) => _BlockStatement(pYield, pAwait, pReturn).head)
        s += Statement0(arg0, List(pYield, pAwait, pReturn))
      }
      val VariableStatement_1_0 = _VariableStatement(pYield, pAwait).toList
      val max1 = List(VariableStatement_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = VariableStatement_1_0.applyOrElse(i, (_: Int) => _VariableStatement(pYield, pAwait).head)
        s += Statement1(arg0, List(pYield, pAwait, pReturn))
      }
      val EmptyStatement_2_0 = _EmptyStatement().toList
      val max2 = List(EmptyStatement_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = EmptyStatement_2_0.applyOrElse(i, (_: Int) => _EmptyStatement().head)
        s += Statement2(arg0, List(pYield, pAwait, pReturn))
      }
      val ExpressionStatement_3_0 = _ExpressionStatement(pYield, pAwait).toList
      val max3 = List(ExpressionStatement_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ExpressionStatement_3_0.applyOrElse(i, (_: Int) => _ExpressionStatement(pYield, pAwait).head)
        s += Statement3(arg0, List(pYield, pAwait, pReturn))
      }
      val IfStatement_4_0 = _IfStatement(pYield, pAwait, pReturn).toList
      val max4 = List(IfStatement_4_0).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = IfStatement_4_0.applyOrElse(i, (_: Int) => _IfStatement(pYield, pAwait, pReturn).head)
        s += Statement4(arg0, List(pYield, pAwait, pReturn))
      }
      val BreakableStatement_5_0 = _BreakableStatement(pYield, pAwait, pReturn).toList
      val max5 = List(BreakableStatement_5_0).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = BreakableStatement_5_0.applyOrElse(i, (_: Int) => _BreakableStatement(pYield, pAwait, pReturn).head)
        s += Statement5(arg0, List(pYield, pAwait, pReturn))
      }
      val ContinueStatement_6_0 = _ContinueStatement(pYield, pAwait).toList
      val max6 = List(ContinueStatement_6_0).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = ContinueStatement_6_0.applyOrElse(i, (_: Int) => _ContinueStatement(pYield, pAwait).head)
        s += Statement6(arg0, List(pYield, pAwait, pReturn))
      }
      val BreakStatement_7_0 = _BreakStatement(pYield, pAwait).toList
      val max7 = List(BreakStatement_7_0).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = BreakStatement_7_0.applyOrElse(i, (_: Int) => _BreakStatement(pYield, pAwait).head)
        s += Statement7(arg0, List(pYield, pAwait, pReturn))
      }
      if (pReturn) {
        val ReturnStatement_8_0 = _ReturnStatement(pYield, pAwait).toList
        val max8 = List(ReturnStatement_8_0).map(_.length).max
        for (i <- (0 until max8)) {
          val arg0 = ReturnStatement_8_0.applyOrElse(i, (_: Int) => _ReturnStatement(pYield, pAwait).head)
          s += Statement8(arg0, List(pYield, pAwait, pReturn))
        }
      }
      val WithStatement_9_0 = _WithStatement(pYield, pAwait, pReturn).toList
      val max9 = List(WithStatement_9_0).map(_.length).max
      for (i <- (0 until max9)) {
        val arg0 = WithStatement_9_0.applyOrElse(i, (_: Int) => _WithStatement(pYield, pAwait, pReturn).head)
        s += Statement9(arg0, List(pYield, pAwait, pReturn))
      }
      val LabelledStatement_10_0 = _LabelledStatement(pYield, pAwait, pReturn).toList
      val max10 = List(LabelledStatement_10_0).map(_.length).max
      for (i <- (0 until max10)) {
        val arg0 = LabelledStatement_10_0.applyOrElse(i, (_: Int) => _LabelledStatement(pYield, pAwait, pReturn).head)
        s += Statement10(arg0, List(pYield, pAwait, pReturn))
      }
      val ThrowStatement_11_0 = _ThrowStatement(pYield, pAwait).toList
      val max11 = List(ThrowStatement_11_0).map(_.length).max
      for (i <- (0 until max11)) {
        val arg0 = ThrowStatement_11_0.applyOrElse(i, (_: Int) => _ThrowStatement(pYield, pAwait).head)
        s += Statement11(arg0, List(pYield, pAwait, pReturn))
      }
      val TryStatement_12_0 = _TryStatement(pYield, pAwait, pReturn).toList
      val max12 = List(TryStatement_12_0).map(_.length).max
      for (i <- (0 until max12)) {
        val arg0 = TryStatement_12_0.applyOrElse(i, (_: Int) => _TryStatement(pYield, pAwait, pReturn).head)
        s += Statement12(arg0, List(pYield, pAwait, pReturn))
      }
      val DebuggerStatement_13_0 = _DebuggerStatement().toList
      val max13 = List(DebuggerStatement_13_0).map(_.length).max
      for (i <- (0 until max13)) {
        val arg0 = DebuggerStatement_13_0.applyOrElse(i, (_: Int) => _DebuggerStatement().head)
        s += Statement13(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.Statement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.Statement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def Declaration(pYield: Boolean, pAwait: Boolean): ScalaSet[Declaration] = {
    visited = ScalaSet()
    _Declaration(pYield, pAwait)
  }
  private def _Declaration(pYield: Boolean, pAwait: Boolean): ScalaSet[Declaration] = {
    if (!visited.contains("Declaration", List(pYield, pAwait))) {
      visited += (("Declaration", List(pYield, pAwait)))
      var s = ScalaSet[Declaration]()
      val HoistableDeclaration_0_0 = _HoistableDeclaration(pYield, pAwait, false).toList
      val max0 = List(HoistableDeclaration_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = HoistableDeclaration_0_0.applyOrElse(i, (_: Int) => _HoistableDeclaration(pYield, pAwait, false).head)
        s += Declaration0(arg0, List(pYield, pAwait))
      }
      val ClassDeclaration_1_0 = _ClassDeclaration(pYield, pAwait, false).toList
      val max1 = List(ClassDeclaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ClassDeclaration_1_0.applyOrElse(i, (_: Int) => _ClassDeclaration(pYield, pAwait, false).head)
        s += Declaration1(arg0, List(pYield, pAwait))
      }
      val LexicalDeclaration_2_0 = _LexicalDeclaration(true, pYield, pAwait).toList
      val max2 = List(LexicalDeclaration_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = LexicalDeclaration_2_0.applyOrElse(i, (_: Int) => _LexicalDeclaration(true, pYield, pAwait).head)
        s += Declaration2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.Declaration(pYield, pAwait).depth
      val sample = randomSampler.Declaration(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[HoistableDeclaration] = {
    visited = ScalaSet()
    _HoistableDeclaration(pYield, pAwait, pDefault)
  }
  private def _HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[HoistableDeclaration] = {
    if (!visited.contains("HoistableDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("HoistableDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[HoistableDeclaration]()
      val FunctionDeclaration_0_0 = _FunctionDeclaration(pYield, pAwait, pDefault).toList
      val max0 = List(FunctionDeclaration_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionDeclaration_0_0.applyOrElse(i, (_: Int) => _FunctionDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration0(arg0, List(pYield, pAwait, pDefault))
      }
      val GeneratorDeclaration_1_0 = _GeneratorDeclaration(pYield, pAwait, pDefault).toList
      val max1 = List(GeneratorDeclaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = GeneratorDeclaration_1_0.applyOrElse(i, (_: Int) => _GeneratorDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration1(arg0, List(pYield, pAwait, pDefault))
      }
      val AsyncFunctionDeclaration_2_0 = _AsyncFunctionDeclaration(pYield, pAwait, pDefault).toList
      val max2 = List(AsyncFunctionDeclaration_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AsyncFunctionDeclaration_2_0.applyOrElse(i, (_: Int) => _AsyncFunctionDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration2(arg0, List(pYield, pAwait, pDefault))
      }
      val AsyncGeneratorDeclaration_3_0 = _AsyncGeneratorDeclaration(pYield, pAwait, pDefault).toList
      val max3 = List(AsyncGeneratorDeclaration_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AsyncGeneratorDeclaration_3_0.applyOrElse(i, (_: Int) => _AsyncGeneratorDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration3(arg0, List(pYield, pAwait, pDefault))
      }
      s
    } else {
      val d = counter.HoistableDeclaration(pYield, pAwait, pDefault).depth
      val sample = randomSampler.HoistableDeclaration(d, pYield, pAwait, pDefault)
      ScalaSet(sample)
    }
  }
  def BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[BreakableStatement] = {
    visited = ScalaSet()
    _BreakableStatement(pYield, pAwait, pReturn)
  }
  private def _BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[BreakableStatement] = {
    if (!visited.contains("BreakableStatement", List(pYield, pAwait, pReturn))) {
      visited += (("BreakableStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[BreakableStatement]()
      val IterationStatement_0_0 = _IterationStatement(pYield, pAwait, pReturn).toList
      val max0 = List(IterationStatement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IterationStatement_0_0.applyOrElse(i, (_: Int) => _IterationStatement(pYield, pAwait, pReturn).head)
        s += BreakableStatement0(arg0, List(pYield, pAwait, pReturn))
      }
      val SwitchStatement_1_0 = _SwitchStatement(pYield, pAwait, pReturn).toList
      val max1 = List(SwitchStatement_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = SwitchStatement_1_0.applyOrElse(i, (_: Int) => _SwitchStatement(pYield, pAwait, pReturn).head)
        s += BreakableStatement1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.BreakableStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.BreakableStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[BlockStatement] = {
    visited = ScalaSet()
    _BlockStatement(pYield, pAwait, pReturn)
  }
  private def _BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[BlockStatement] = {
    if (!visited.contains("BlockStatement", List(pYield, pAwait, pReturn))) {
      visited += (("BlockStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[BlockStatement]()
      val Block_0_0 = _Block(pYield, pAwait, pReturn).toList
      val max0 = List(Block_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Block_0_0.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        s += BlockStatement0(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.BlockStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.BlockStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Block] = {
    visited = ScalaSet()
    _Block(pYield, pAwait, pReturn)
  }
  private def _Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Block] = {
    if (!visited.contains("Block", List(pYield, pAwait, pReturn))) {
      visited += (("Block", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Block]()
      val StatementList_0_1 = _StatementList(pYield, pAwait, pReturn).toList
      val max0 = List(StatementList_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_1.applyOrElse(i, (_: Int) => _StatementList(pYield, pAwait, pReturn).head)
        s += Block0(Some(arg0), List(pYield, pAwait, pReturn))
        s += Block0(None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.Block(pYield, pAwait, pReturn).depth
      val sample = randomSampler.Block(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[StatementList] = {
    visited = ScalaSet()
    _StatementList(pYield, pAwait, pReturn)
  }
  private def _StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[StatementList] = {
    if (!visited.contains("StatementList", List(pYield, pAwait, pReturn))) {
      visited += (("StatementList", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[StatementList]()
      val StatementListItem_0_0 = _StatementListItem(pYield, pAwait, pReturn).toList
      val max0 = List(StatementListItem_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementListItem_0_0.applyOrElse(i, (_: Int) => _StatementListItem(pYield, pAwait, pReturn).head)
        s += StatementList0(arg0, List(pYield, pAwait, pReturn))
      }
      val StatementList_1_0 = _StatementList(pYield, pAwait, pReturn).toList
      val StatementListItem_1_1 = _StatementListItem(pYield, pAwait, pReturn).toList
      val max1 = List(StatementList_1_0, StatementListItem_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = StatementList_1_0.applyOrElse(i, (_: Int) => _StatementList(pYield, pAwait, pReturn).head)
        val arg1 = StatementListItem_1_1.applyOrElse(i, (_: Int) => _StatementListItem(pYield, pAwait, pReturn).head)
        s += StatementList1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.StatementList(pYield, pAwait, pReturn).depth
      val sample = randomSampler.StatementList(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[StatementListItem] = {
    visited = ScalaSet()
    _StatementListItem(pYield, pAwait, pReturn)
  }
  private def _StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[StatementListItem] = {
    if (!visited.contains("StatementListItem", List(pYield, pAwait, pReturn))) {
      visited += (("StatementListItem", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[StatementListItem]()
      val Statement_0_0 = _Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Statement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Statement_0_0.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += StatementListItem0(arg0, List(pYield, pAwait, pReturn))
      }
      val Declaration_1_0 = _Declaration(pYield, pAwait).toList
      val max1 = List(Declaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Declaration_1_0.applyOrElse(i, (_: Int) => _Declaration(pYield, pAwait).head)
        s += StatementListItem1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.StatementListItem(pYield, pAwait, pReturn).depth
      val sample = randomSampler.StatementListItem(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LexicalDeclaration] = {
    visited = ScalaSet()
    _LexicalDeclaration(pIn, pYield, pAwait)
  }
  private def _LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LexicalDeclaration] = {
    if (!visited.contains("LexicalDeclaration", List(pIn, pYield, pAwait))) {
      visited += (("LexicalDeclaration", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LexicalDeclaration]()
      val LetOrConst_0_0 = _LetOrConst().toList
      val BindingList_0_1 = _BindingList(pIn, pYield, pAwait).toList
      val max0 = List(LetOrConst_0_0, BindingList_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LetOrConst_0_0.applyOrElse(i, (_: Int) => _LetOrConst().head)
        val arg1 = BindingList_0_1.applyOrElse(i, (_: Int) => _BindingList(pIn, pYield, pAwait).head)
        s += LexicalDeclaration0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.LexicalDeclaration(pIn, pYield, pAwait).depth
      val sample = randomSampler.LexicalDeclaration(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LetOrConst(): ScalaSet[LetOrConst] = {
    visited = ScalaSet()
    _LetOrConst()
  }
  private def _LetOrConst(): ScalaSet[LetOrConst] = {
    if (!visited.contains("LetOrConst", List())) {
      visited += (("LetOrConst", List()))
      var s = ScalaSet[LetOrConst]()
      s += LetOrConst0(List())
      s += LetOrConst1(List())
      s
    } else {
      val d = counter.LetOrConst().depth
      val sample = randomSampler.LetOrConst(d)
      ScalaSet(sample)
    }
  }
  def BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BindingList] = {
    visited = ScalaSet()
    _BindingList(pIn, pYield, pAwait)
  }
  private def _BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BindingList] = {
    if (!visited.contains("BindingList", List(pIn, pYield, pAwait))) {
      visited += (("BindingList", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BindingList]()
      val LexicalBinding_0_0 = _LexicalBinding(pIn, pYield, pAwait).toList
      val max0 = List(LexicalBinding_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LexicalBinding_0_0.applyOrElse(i, (_: Int) => _LexicalBinding(pIn, pYield, pAwait).head)
        s += BindingList0(arg0, List(pIn, pYield, pAwait))
      }
      val BindingList_1_0 = _BindingList(pIn, pYield, pAwait).toList
      val LexicalBinding_1_2 = _LexicalBinding(pIn, pYield, pAwait).toList
      val max1 = List(BindingList_1_0, LexicalBinding_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingList_1_0.applyOrElse(i, (_: Int) => _BindingList(pIn, pYield, pAwait).head)
        val arg1 = LexicalBinding_1_2.applyOrElse(i, (_: Int) => _LexicalBinding(pIn, pYield, pAwait).head)
        s += BindingList1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingList(pIn, pYield, pAwait).depth
      val sample = randomSampler.BindingList(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LexicalBinding] = {
    visited = ScalaSet()
    _LexicalBinding(pIn, pYield, pAwait)
  }
  private def _LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LexicalBinding] = {
    if (!visited.contains("LexicalBinding", List(pIn, pYield, pAwait))) {
      visited += (("LexicalBinding", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LexicalBinding]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, pAwait).toList
      val Initializer_0_1 = _Initializer(pIn, pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => _Initializer(pIn, pYield, pAwait).head)
        s += LexicalBinding0(arg0, Some(arg1), List(pIn, pYield, pAwait))
        s += LexicalBinding0(arg0, None, List(pIn, pYield, pAwait))
      }
      val BindingPattern_1_0 = _BindingPattern(pYield, pAwait).toList
      val Initializer_1_1 = _Initializer(pIn, pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0, Initializer_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        val arg1 = Initializer_1_1.applyOrElse(i, (_: Int) => _Initializer(pIn, pYield, pAwait).head)
        s += LexicalBinding1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.LexicalBinding(pIn, pYield, pAwait).depth
      val sample = randomSampler.LexicalBinding(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def VariableStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[VariableStatement] = {
    visited = ScalaSet()
    _VariableStatement(pYield, pAwait)
  }
  private def _VariableStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[VariableStatement] = {
    if (!visited.contains("VariableStatement", List(pYield, pAwait))) {
      visited += (("VariableStatement", List(pYield, pAwait)))
      var s = ScalaSet[VariableStatement]()
      val VariableDeclarationList_0_1 = _VariableDeclarationList(true, pYield, pAwait).toList
      val max0 = List(VariableDeclarationList_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = VariableDeclarationList_0_1.applyOrElse(i, (_: Int) => _VariableDeclarationList(true, pYield, pAwait).head)
        s += VariableStatement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.VariableStatement(pYield, pAwait).depth
      val sample = randomSampler.VariableStatement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[VariableDeclarationList] = {
    visited = ScalaSet()
    _VariableDeclarationList(pIn, pYield, pAwait)
  }
  private def _VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[VariableDeclarationList] = {
    if (!visited.contains("VariableDeclarationList", List(pIn, pYield, pAwait))) {
      visited += (("VariableDeclarationList", List(pIn, pYield, pAwait)))
      var s = ScalaSet[VariableDeclarationList]()
      val VariableDeclaration_0_0 = _VariableDeclaration(pIn, pYield, pAwait).toList
      val max0 = List(VariableDeclaration_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = VariableDeclaration_0_0.applyOrElse(i, (_: Int) => _VariableDeclaration(pIn, pYield, pAwait).head)
        s += VariableDeclarationList0(arg0, List(pIn, pYield, pAwait))
      }
      val VariableDeclarationList_1_0 = _VariableDeclarationList(pIn, pYield, pAwait).toList
      val VariableDeclaration_1_2 = _VariableDeclaration(pIn, pYield, pAwait).toList
      val max1 = List(VariableDeclarationList_1_0, VariableDeclaration_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = VariableDeclarationList_1_0.applyOrElse(i, (_: Int) => _VariableDeclarationList(pIn, pYield, pAwait).head)
        val arg1 = VariableDeclaration_1_2.applyOrElse(i, (_: Int) => _VariableDeclaration(pIn, pYield, pAwait).head)
        s += VariableDeclarationList1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.VariableDeclarationList(pIn, pYield, pAwait).depth
      val sample = randomSampler.VariableDeclarationList(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[VariableDeclaration] = {
    visited = ScalaSet()
    _VariableDeclaration(pIn, pYield, pAwait)
  }
  private def _VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[VariableDeclaration] = {
    if (!visited.contains("VariableDeclaration", List(pIn, pYield, pAwait))) {
      visited += (("VariableDeclaration", List(pIn, pYield, pAwait)))
      var s = ScalaSet[VariableDeclaration]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, pAwait).toList
      val Initializer_0_1 = _Initializer(pIn, pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => _Initializer(pIn, pYield, pAwait).head)
        s += VariableDeclaration0(arg0, Some(arg1), List(pIn, pYield, pAwait))
        s += VariableDeclaration0(arg0, None, List(pIn, pYield, pAwait))
      }
      val BindingPattern_1_0 = _BindingPattern(pYield, pAwait).toList
      val Initializer_1_1 = _Initializer(pIn, pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0, Initializer_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        val arg1 = Initializer_1_1.applyOrElse(i, (_: Int) => _Initializer(pIn, pYield, pAwait).head)
        s += VariableDeclaration1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.VariableDeclaration(pIn, pYield, pAwait).depth
      val sample = randomSampler.VariableDeclaration(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingPattern] = {
    visited = ScalaSet()
    _BindingPattern(pYield, pAwait)
  }
  private def _BindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingPattern] = {
    if (!visited.contains("BindingPattern", List(pYield, pAwait))) {
      visited += (("BindingPattern", List(pYield, pAwait)))
      var s = ScalaSet[BindingPattern]()
      val ObjectBindingPattern_0_0 = _ObjectBindingPattern(pYield, pAwait).toList
      val max0 = List(ObjectBindingPattern_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ObjectBindingPattern_0_0.applyOrElse(i, (_: Int) => _ObjectBindingPattern(pYield, pAwait).head)
        s += BindingPattern0(arg0, List(pYield, pAwait))
      }
      val ArrayBindingPattern_1_0 = _ArrayBindingPattern(pYield, pAwait).toList
      val max1 = List(ArrayBindingPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ArrayBindingPattern_1_0.applyOrElse(i, (_: Int) => _ArrayBindingPattern(pYield, pAwait).head)
        s += BindingPattern1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingPattern(pYield, pAwait).depth
      val sample = randomSampler.BindingPattern(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectBindingPattern] = {
    visited = ScalaSet()
    _ObjectBindingPattern(pYield, pAwait)
  }
  private def _ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectBindingPattern] = {
    if (!visited.contains("ObjectBindingPattern", List(pYield, pAwait))) {
      visited += (("ObjectBindingPattern", List(pYield, pAwait)))
      var s = ScalaSet[ObjectBindingPattern]()
      s += ObjectBindingPattern0(List(pYield, pAwait))
      val BindingRestProperty_1_1 = _BindingRestProperty(pYield, pAwait).toList
      val max1 = List(BindingRestProperty_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingRestProperty_1_1.applyOrElse(i, (_: Int) => _BindingRestProperty(pYield, pAwait).head)
        s += ObjectBindingPattern1(arg0, List(pYield, pAwait))
      }
      val BindingPropertyList_2_1 = _BindingPropertyList(pYield, pAwait).toList
      val max2 = List(BindingPropertyList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = BindingPropertyList_2_1.applyOrElse(i, (_: Int) => _BindingPropertyList(pYield, pAwait).head)
        s += ObjectBindingPattern2(arg0, List(pYield, pAwait))
      }
      val BindingPropertyList_3_1 = _BindingPropertyList(pYield, pAwait).toList
      val BindingRestProperty_3_3 = _BindingRestProperty(pYield, pAwait).toList
      val max3 = List(BindingPropertyList_3_1, BindingRestProperty_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = BindingPropertyList_3_1.applyOrElse(i, (_: Int) => _BindingPropertyList(pYield, pAwait).head)
        val arg1 = BindingRestProperty_3_3.applyOrElse(i, (_: Int) => _BindingRestProperty(pYield, pAwait).head)
        s += ObjectBindingPattern3(arg0, Some(arg1), List(pYield, pAwait))
        s += ObjectBindingPattern3(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ObjectBindingPattern(pYield, pAwait).depth
      val sample = randomSampler.ObjectBindingPattern(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayBindingPattern] = {
    visited = ScalaSet()
    _ArrayBindingPattern(pYield, pAwait)
  }
  private def _ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayBindingPattern] = {
    if (!visited.contains("ArrayBindingPattern", List(pYield, pAwait))) {
      visited += (("ArrayBindingPattern", List(pYield, pAwait)))
      var s = ScalaSet[ArrayBindingPattern]()
      val Elision_0_1 = _Elision().toList
      val BindingRestElement_0_2 = _BindingRestElement(pYield, pAwait).toList
      val max0 = List(Elision_0_1, BindingRestElement_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_1.applyOrElse(i, (_: Int) => _Elision().head)
        val arg1 = BindingRestElement_0_2.applyOrElse(i, (_: Int) => _BindingRestElement(pYield, pAwait).head)
        s += ArrayBindingPattern0(Some(arg0), Some(arg1), List(pYield, pAwait))
        s += ArrayBindingPattern0(Some(arg0), None, List(pYield, pAwait))
        s += ArrayBindingPattern0(None, Some(arg1), List(pYield, pAwait))
        s += ArrayBindingPattern0(None, None, List(pYield, pAwait))
      }
      val BindingElementList_1_1 = _BindingElementList(pYield, pAwait).toList
      val max1 = List(BindingElementList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingElementList_1_1.applyOrElse(i, (_: Int) => _BindingElementList(pYield, pAwait).head)
        s += ArrayBindingPattern1(arg0, List(pYield, pAwait))
      }
      val BindingElementList_2_1 = _BindingElementList(pYield, pAwait).toList
      val Elision_2_3 = _Elision().toList
      val BindingRestElement_2_4 = _BindingRestElement(pYield, pAwait).toList
      val max2 = List(BindingElementList_2_1, Elision_2_3, BindingRestElement_2_4).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = BindingElementList_2_1.applyOrElse(i, (_: Int) => _BindingElementList(pYield, pAwait).head)
        val arg1 = Elision_2_3.applyOrElse(i, (_: Int) => _Elision().head)
        val arg2 = BindingRestElement_2_4.applyOrElse(i, (_: Int) => _BindingRestElement(pYield, pAwait).head)
        s += ArrayBindingPattern2(arg0, Some(arg1), Some(arg2), List(pYield, pAwait))
        s += ArrayBindingPattern2(arg0, Some(arg1), None, List(pYield, pAwait))
        s += ArrayBindingPattern2(arg0, None, Some(arg2), List(pYield, pAwait))
        s += ArrayBindingPattern2(arg0, None, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArrayBindingPattern(pYield, pAwait).depth
      val sample = randomSampler.ArrayBindingPattern(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingRestProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingRestProperty] = {
    visited = ScalaSet()
    _BindingRestProperty(pYield, pAwait)
  }
  private def _BindingRestProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingRestProperty] = {
    if (!visited.contains("BindingRestProperty", List(pYield, pAwait))) {
      visited += (("BindingRestProperty", List(pYield, pAwait)))
      var s = ScalaSet[BindingRestProperty]()
      val BindingIdentifier_0_1 = _BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += BindingRestProperty0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingRestProperty(pYield, pAwait).depth
      val sample = randomSampler.BindingRestProperty(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingPropertyList(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingPropertyList] = {
    visited = ScalaSet()
    _BindingPropertyList(pYield, pAwait)
  }
  private def _BindingPropertyList(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingPropertyList] = {
    if (!visited.contains("BindingPropertyList", List(pYield, pAwait))) {
      visited += (("BindingPropertyList", List(pYield, pAwait)))
      var s = ScalaSet[BindingPropertyList]()
      val BindingProperty_0_0 = _BindingProperty(pYield, pAwait).toList
      val max0 = List(BindingProperty_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingProperty_0_0.applyOrElse(i, (_: Int) => _BindingProperty(pYield, pAwait).head)
        s += BindingPropertyList0(arg0, List(pYield, pAwait))
      }
      val BindingPropertyList_1_0 = _BindingPropertyList(pYield, pAwait).toList
      val BindingProperty_1_2 = _BindingProperty(pYield, pAwait).toList
      val max1 = List(BindingPropertyList_1_0, BindingProperty_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPropertyList_1_0.applyOrElse(i, (_: Int) => _BindingPropertyList(pYield, pAwait).head)
        val arg1 = BindingProperty_1_2.applyOrElse(i, (_: Int) => _BindingProperty(pYield, pAwait).head)
        s += BindingPropertyList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingPropertyList(pYield, pAwait).depth
      val sample = randomSampler.BindingPropertyList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElementList] = {
    visited = ScalaSet()
    _BindingElementList(pYield, pAwait)
  }
  private def _BindingElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElementList] = {
    if (!visited.contains("BindingElementList", List(pYield, pAwait))) {
      visited += (("BindingElementList", List(pYield, pAwait)))
      var s = ScalaSet[BindingElementList]()
      val BindingElisionElement_0_0 = _BindingElisionElement(pYield, pAwait).toList
      val max0 = List(BindingElisionElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingElisionElement_0_0.applyOrElse(i, (_: Int) => _BindingElisionElement(pYield, pAwait).head)
        s += BindingElementList0(arg0, List(pYield, pAwait))
      }
      val BindingElementList_1_0 = _BindingElementList(pYield, pAwait).toList
      val BindingElisionElement_1_2 = _BindingElisionElement(pYield, pAwait).toList
      val max1 = List(BindingElementList_1_0, BindingElisionElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingElementList_1_0.applyOrElse(i, (_: Int) => _BindingElementList(pYield, pAwait).head)
        val arg1 = BindingElisionElement_1_2.applyOrElse(i, (_: Int) => _BindingElisionElement(pYield, pAwait).head)
        s += BindingElementList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingElementList(pYield, pAwait).depth
      val sample = randomSampler.BindingElementList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingElisionElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElisionElement] = {
    visited = ScalaSet()
    _BindingElisionElement(pYield, pAwait)
  }
  private def _BindingElisionElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElisionElement] = {
    if (!visited.contains("BindingElisionElement", List(pYield, pAwait))) {
      visited += (("BindingElisionElement", List(pYield, pAwait)))
      var s = ScalaSet[BindingElisionElement]()
      val Elision_0_0 = _Elision().toList
      val BindingElement_0_1 = _BindingElement(pYield, pAwait).toList
      val max0 = List(Elision_0_0, BindingElement_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_0.applyOrElse(i, (_: Int) => _Elision().head)
        val arg1 = BindingElement_0_1.applyOrElse(i, (_: Int) => _BindingElement(pYield, pAwait).head)
        s += BindingElisionElement0(Some(arg0), arg1, List(pYield, pAwait))
        s += BindingElisionElement0(None, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingElisionElement(pYield, pAwait).depth
      val sample = randomSampler.BindingElisionElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingProperty] = {
    visited = ScalaSet()
    _BindingProperty(pYield, pAwait)
  }
  private def _BindingProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingProperty] = {
    if (!visited.contains("BindingProperty", List(pYield, pAwait))) {
      visited += (("BindingProperty", List(pYield, pAwait)))
      var s = ScalaSet[BindingProperty]()
      val SingleNameBinding_0_0 = _SingleNameBinding(pYield, pAwait).toList
      val max0 = List(SingleNameBinding_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = SingleNameBinding_0_0.applyOrElse(i, (_: Int) => _SingleNameBinding(pYield, pAwait).head)
        s += BindingProperty0(arg0, List(pYield, pAwait))
      }
      val PropertyName_1_0 = _PropertyName(pYield, pAwait).toList
      val BindingElement_1_2 = _BindingElement(pYield, pAwait).toList
      val max1 = List(PropertyName_1_0, BindingElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyName_1_0.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = BindingElement_1_2.applyOrElse(i, (_: Int) => _BindingElement(pYield, pAwait).head)
        s += BindingProperty1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingProperty(pYield, pAwait).depth
      val sample = randomSampler.BindingProperty(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElement] = {
    visited = ScalaSet()
    _BindingElement(pYield, pAwait)
  }
  private def _BindingElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElement] = {
    if (!visited.contains("BindingElement", List(pYield, pAwait))) {
      visited += (("BindingElement", List(pYield, pAwait)))
      var s = ScalaSet[BindingElement]()
      val SingleNameBinding_0_0 = _SingleNameBinding(pYield, pAwait).toList
      val max0 = List(SingleNameBinding_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = SingleNameBinding_0_0.applyOrElse(i, (_: Int) => _SingleNameBinding(pYield, pAwait).head)
        s += BindingElement0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_0 = _BindingPattern(pYield, pAwait).toList
      val Initializer_1_1 = _Initializer(true, pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0, Initializer_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        val arg1 = Initializer_1_1.applyOrElse(i, (_: Int) => _Initializer(true, pYield, pAwait).head)
        s += BindingElement1(arg0, Some(arg1), List(pYield, pAwait))
        s += BindingElement1(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingElement(pYield, pAwait).depth
      val sample = randomSampler.BindingElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def SingleNameBinding(pYield: Boolean, pAwait: Boolean): ScalaSet[SingleNameBinding] = {
    visited = ScalaSet()
    _SingleNameBinding(pYield, pAwait)
  }
  private def _SingleNameBinding(pYield: Boolean, pAwait: Boolean): ScalaSet[SingleNameBinding] = {
    if (!visited.contains("SingleNameBinding", List(pYield, pAwait))) {
      visited += (("SingleNameBinding", List(pYield, pAwait)))
      var s = ScalaSet[SingleNameBinding]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, pAwait).toList
      val Initializer_0_1 = _Initializer(true, pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => _Initializer(true, pYield, pAwait).head)
        s += SingleNameBinding0(arg0, Some(arg1), List(pYield, pAwait))
        s += SingleNameBinding0(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.SingleNameBinding(pYield, pAwait).depth
      val sample = randomSampler.SingleNameBinding(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BindingRestElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingRestElement] = {
    visited = ScalaSet()
    _BindingRestElement(pYield, pAwait)
  }
  private def _BindingRestElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingRestElement] = {
    if (!visited.contains("BindingRestElement", List(pYield, pAwait))) {
      visited += (("BindingRestElement", List(pYield, pAwait)))
      var s = ScalaSet[BindingRestElement]()
      val BindingIdentifier_0_1 = _BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += BindingRestElement0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_1 = _BindingPattern(pYield, pAwait).toList
      val max1 = List(BindingPattern_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_1.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        s += BindingRestElement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BindingRestElement(pYield, pAwait).depth
      val sample = randomSampler.BindingRestElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def EmptyStatement(): ScalaSet[EmptyStatement] = {
    visited = ScalaSet()
    _EmptyStatement()
  }
  private def _EmptyStatement(): ScalaSet[EmptyStatement] = {
    if (!visited.contains("EmptyStatement", List())) {
      visited += (("EmptyStatement", List()))
      var s = ScalaSet[EmptyStatement]()
      s += EmptyStatement0(List())
      s
    } else {
      val d = counter.EmptyStatement().depth
      val sample = randomSampler.EmptyStatement(d)
      ScalaSet(sample)
    }
  }
  def ExpressionStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ExpressionStatement] = {
    visited = ScalaSet()
    _ExpressionStatement(pYield, pAwait)
  }
  private def _ExpressionStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ExpressionStatement] = {
    if (!visited.contains("ExpressionStatement", List(pYield, pAwait))) {
      visited += (("ExpressionStatement", List(pYield, pAwait)))
      var s = ScalaSet[ExpressionStatement]()
      val Expression_0_1 = _Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += ExpressionStatement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ExpressionStatement(pYield, pAwait).depth
      val sample = randomSampler.ExpressionStatement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[IfStatement] = {
    visited = ScalaSet()
    _IfStatement(pYield, pAwait, pReturn)
  }
  private def _IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[IfStatement] = {
    if (!visited.contains("IfStatement", List(pYield, pAwait, pReturn))) {
      visited += (("IfStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[IfStatement]()
      val Expression_0_2 = _Expression(true, pYield, pAwait).toList
      val Statement_0_4 = _Statement(pYield, pAwait, pReturn).toList
      val Statement_0_6 = _Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_2, Statement_0_4, Statement_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = Statement_0_4.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        val arg2 = Statement_0_6.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IfStatement0(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val Expression_1_2 = _Expression(true, pYield, pAwait).toList
      val Statement_1_4 = _Statement(pYield, pAwait, pReturn).toList
      val max1 = List(Expression_1_2, Statement_1_4).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = Statement_1_4.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IfStatement1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.IfStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.IfStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[IterationStatement] = {
    visited = ScalaSet()
    _IterationStatement(pYield, pAwait, pReturn)
  }
  private def _IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[IterationStatement] = {
    if (!visited.contains("IterationStatement", List(pYield, pAwait, pReturn))) {
      visited += (("IterationStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[IterationStatement]()
      val Statement_0_1 = _Statement(pYield, pAwait, pReturn).toList
      val Expression_0_4 = _Expression(true, pYield, pAwait).toList
      val max0 = List(Statement_0_1, Expression_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Statement_0_1.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        val arg1 = Expression_0_4.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += IterationStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Expression_1_2 = _Expression(true, pYield, pAwait).toList
      val Statement_1_4 = _Statement(pYield, pAwait, pReturn).toList
      val max1 = List(Expression_1_2, Statement_1_4).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = Statement_1_4.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Expression_2_3 = _Expression(false, pYield, pAwait).toList
      val Expression_2_5 = _Expression(true, pYield, pAwait).toList
      val Expression_2_7 = _Expression(true, pYield, pAwait).toList
      val Statement_2_9 = _Statement(pYield, pAwait, pReturn).toList
      val max2 = List(Expression_2_3, Expression_2_5, Expression_2_7, Statement_2_9).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = Expression_2_3.applyOrElse(i, (_: Int) => _Expression(false, pYield, pAwait).head)
        val arg1 = Expression_2_5.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = Expression_2_7.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg3 = Statement_2_9.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement2(Some(arg0), Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(Some(arg0), Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(Some(arg0), None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(Some(arg0), None, None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, None, None, arg3, List(pYield, pAwait, pReturn))
      }
      val VariableDeclarationList_3_3 = _VariableDeclarationList(false, pYield, pAwait).toList
      val Expression_3_5 = _Expression(true, pYield, pAwait).toList
      val Expression_3_7 = _Expression(true, pYield, pAwait).toList
      val Statement_3_9 = _Statement(pYield, pAwait, pReturn).toList
      val max3 = List(VariableDeclarationList_3_3, Expression_3_5, Expression_3_7, Statement_3_9).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = VariableDeclarationList_3_3.applyOrElse(i, (_: Int) => _VariableDeclarationList(false, pYield, pAwait).head)
        val arg1 = Expression_3_5.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = Expression_3_7.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg3 = Statement_3_9.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement3(arg0, Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement3(arg0, Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement3(arg0, None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement3(arg0, None, None, arg3, List(pYield, pAwait, pReturn))
      }
      val LexicalDeclaration_4_2 = _LexicalDeclaration(false, pYield, pAwait).toList
      val Expression_4_3 = _Expression(true, pYield, pAwait).toList
      val Expression_4_5 = _Expression(true, pYield, pAwait).toList
      val Statement_4_7 = _Statement(pYield, pAwait, pReturn).toList
      val max4 = List(LexicalDeclaration_4_2, Expression_4_3, Expression_4_5, Statement_4_7).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = LexicalDeclaration_4_2.applyOrElse(i, (_: Int) => _LexicalDeclaration(false, pYield, pAwait).head)
        val arg1 = Expression_4_3.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = Expression_4_5.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg3 = Statement_4_7.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement4(arg0, Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement4(arg0, Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement4(arg0, None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement4(arg0, None, None, arg3, List(pYield, pAwait, pReturn))
      }
      val LeftHandSideExpression_5_3 = _LeftHandSideExpression(pYield, pAwait).toList
      val Expression_5_5 = _Expression(true, pYield, pAwait).toList
      val Statement_5_7 = _Statement(pYield, pAwait, pReturn).toList
      val max5 = List(LeftHandSideExpression_5_3, Expression_5_5, Statement_5_7).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = LeftHandSideExpression_5_3.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = Expression_5_5.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = Statement_5_7.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement5(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForBinding_6_3 = _ForBinding(pYield, pAwait).toList
      val Expression_6_5 = _Expression(true, pYield, pAwait).toList
      val Statement_6_7 = _Statement(pYield, pAwait, pReturn).toList
      val max6 = List(ForBinding_6_3, Expression_6_5, Statement_6_7).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = ForBinding_6_3.applyOrElse(i, (_: Int) => _ForBinding(pYield, pAwait).head)
        val arg1 = Expression_6_5.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = Statement_6_7.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement6(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForDeclaration_7_2 = _ForDeclaration(pYield, pAwait).toList
      val Expression_7_4 = _Expression(true, pYield, pAwait).toList
      val Statement_7_6 = _Statement(pYield, pAwait, pReturn).toList
      val max7 = List(ForDeclaration_7_2, Expression_7_4, Statement_7_6).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = ForDeclaration_7_2.applyOrElse(i, (_: Int) => _ForDeclaration(pYield, pAwait).head)
        val arg1 = Expression_7_4.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg2 = Statement_7_6.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement7(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val LeftHandSideExpression_8_3 = _LeftHandSideExpression(pYield, pAwait).toList
      val AssignmentExpression_8_5 = _AssignmentExpression(true, pYield, pAwait).toList
      val Statement_8_7 = _Statement(pYield, pAwait, pReturn).toList
      val max8 = List(LeftHandSideExpression_8_3, AssignmentExpression_8_5, Statement_8_7).map(_.length).max
      for (i <- (0 until max8)) {
        val arg0 = LeftHandSideExpression_8_3.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = AssignmentExpression_8_5.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = Statement_8_7.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement8(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForBinding_9_3 = _ForBinding(pYield, pAwait).toList
      val AssignmentExpression_9_5 = _AssignmentExpression(true, pYield, pAwait).toList
      val Statement_9_7 = _Statement(pYield, pAwait, pReturn).toList
      val max9 = List(ForBinding_9_3, AssignmentExpression_9_5, Statement_9_7).map(_.length).max
      for (i <- (0 until max9)) {
        val arg0 = ForBinding_9_3.applyOrElse(i, (_: Int) => _ForBinding(pYield, pAwait).head)
        val arg1 = AssignmentExpression_9_5.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = Statement_9_7.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement9(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForDeclaration_10_2 = _ForDeclaration(pYield, pAwait).toList
      val AssignmentExpression_10_4 = _AssignmentExpression(true, pYield, pAwait).toList
      val Statement_10_6 = _Statement(pYield, pAwait, pReturn).toList
      val max10 = List(ForDeclaration_10_2, AssignmentExpression_10_4, Statement_10_6).map(_.length).max
      for (i <- (0 until max10)) {
        val arg0 = ForDeclaration_10_2.applyOrElse(i, (_: Int) => _ForDeclaration(pYield, pAwait).head)
        val arg1 = AssignmentExpression_10_4.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = Statement_10_6.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement10(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      if (pAwait) {
        val LeftHandSideExpression_11_4 = _LeftHandSideExpression(pYield, pAwait).toList
        val AssignmentExpression_11_6 = _AssignmentExpression(true, pYield, pAwait).toList
        val Statement_11_8 = _Statement(pYield, pAwait, pReturn).toList
        val max11 = List(LeftHandSideExpression_11_4, AssignmentExpression_11_6, Statement_11_8).map(_.length).max
        for (i <- (0 until max11)) {
          val arg0 = LeftHandSideExpression_11_4.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
          val arg1 = AssignmentExpression_11_6.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
          val arg2 = Statement_11_8.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
          s += IterationStatement11(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
        }
      }
      if (pAwait) {
        val ForBinding_12_4 = _ForBinding(pYield, pAwait).toList
        val AssignmentExpression_12_6 = _AssignmentExpression(true, pYield, pAwait).toList
        val Statement_12_8 = _Statement(pYield, pAwait, pReturn).toList
        val max12 = List(ForBinding_12_4, AssignmentExpression_12_6, Statement_12_8).map(_.length).max
        for (i <- (0 until max12)) {
          val arg0 = ForBinding_12_4.applyOrElse(i, (_: Int) => _ForBinding(pYield, pAwait).head)
          val arg1 = AssignmentExpression_12_6.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
          val arg2 = Statement_12_8.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
          s += IterationStatement12(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
        }
      }
      if (pAwait) {
        val ForDeclaration_13_3 = _ForDeclaration(pYield, pAwait).toList
        val AssignmentExpression_13_5 = _AssignmentExpression(true, pYield, pAwait).toList
        val Statement_13_7 = _Statement(pYield, pAwait, pReturn).toList
        val max13 = List(ForDeclaration_13_3, AssignmentExpression_13_5, Statement_13_7).map(_.length).max
        for (i <- (0 until max13)) {
          val arg0 = ForDeclaration_13_3.applyOrElse(i, (_: Int) => _ForDeclaration(pYield, pAwait).head)
          val arg1 = AssignmentExpression_13_5.applyOrElse(i, (_: Int) => _AssignmentExpression(true, pYield, pAwait).head)
          val arg2 = Statement_13_7.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
          s += IterationStatement13(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
        }
      }
      s
    } else {
      val d = counter.IterationStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.IterationStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def ForDeclaration(pYield: Boolean, pAwait: Boolean): ScalaSet[ForDeclaration] = {
    visited = ScalaSet()
    _ForDeclaration(pYield, pAwait)
  }
  private def _ForDeclaration(pYield: Boolean, pAwait: Boolean): ScalaSet[ForDeclaration] = {
    if (!visited.contains("ForDeclaration", List(pYield, pAwait))) {
      visited += (("ForDeclaration", List(pYield, pAwait)))
      var s = ScalaSet[ForDeclaration]()
      val LetOrConst_0_0 = _LetOrConst().toList
      val ForBinding_0_1 = _ForBinding(pYield, pAwait).toList
      val max0 = List(LetOrConst_0_0, ForBinding_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LetOrConst_0_0.applyOrElse(i, (_: Int) => _LetOrConst().head)
        val arg1 = ForBinding_0_1.applyOrElse(i, (_: Int) => _ForBinding(pYield, pAwait).head)
        s += ForDeclaration0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ForDeclaration(pYield, pAwait).depth
      val sample = randomSampler.ForDeclaration(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ForBinding(pYield: Boolean, pAwait: Boolean): ScalaSet[ForBinding] = {
    visited = ScalaSet()
    _ForBinding(pYield, pAwait)
  }
  private def _ForBinding(pYield: Boolean, pAwait: Boolean): ScalaSet[ForBinding] = {
    if (!visited.contains("ForBinding", List(pYield, pAwait))) {
      visited += (("ForBinding", List(pYield, pAwait)))
      var s = ScalaSet[ForBinding]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += ForBinding0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_0 = _BindingPattern(pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        s += ForBinding1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ForBinding(pYield, pAwait).depth
      val sample = randomSampler.ForBinding(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ContinueStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ContinueStatement] = {
    visited = ScalaSet()
    _ContinueStatement(pYield, pAwait)
  }
  private def _ContinueStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ContinueStatement] = {
    if (!visited.contains("ContinueStatement", List(pYield, pAwait))) {
      visited += (("ContinueStatement", List(pYield, pAwait)))
      var s = ScalaSet[ContinueStatement]()
      s += ContinueStatement0(List(pYield, pAwait))
      val LabelIdentifier_1_2 = _LabelIdentifier(pYield, pAwait).toList
      val max1 = List(LabelIdentifier_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LabelIdentifier_1_2.applyOrElse(i, (_: Int) => _LabelIdentifier(pYield, pAwait).head)
        s += ContinueStatement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ContinueStatement(pYield, pAwait).depth
      val sample = randomSampler.ContinueStatement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def BreakStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[BreakStatement] = {
    visited = ScalaSet()
    _BreakStatement(pYield, pAwait)
  }
  private def _BreakStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[BreakStatement] = {
    if (!visited.contains("BreakStatement", List(pYield, pAwait))) {
      visited += (("BreakStatement", List(pYield, pAwait)))
      var s = ScalaSet[BreakStatement]()
      s += BreakStatement0(List(pYield, pAwait))
      val LabelIdentifier_1_2 = _LabelIdentifier(pYield, pAwait).toList
      val max1 = List(LabelIdentifier_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LabelIdentifier_1_2.applyOrElse(i, (_: Int) => _LabelIdentifier(pYield, pAwait).head)
        s += BreakStatement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.BreakStatement(pYield, pAwait).depth
      val sample = randomSampler.BreakStatement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ReturnStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ReturnStatement] = {
    visited = ScalaSet()
    _ReturnStatement(pYield, pAwait)
  }
  private def _ReturnStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ReturnStatement] = {
    if (!visited.contains("ReturnStatement", List(pYield, pAwait))) {
      visited += (("ReturnStatement", List(pYield, pAwait)))
      var s = ScalaSet[ReturnStatement]()
      s += ReturnStatement0(List(pYield, pAwait))
      val Expression_1_2 = _Expression(true, pYield, pAwait).toList
      val max1 = List(Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += ReturnStatement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ReturnStatement(pYield, pAwait).depth
      val sample = randomSampler.ReturnStatement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[WithStatement] = {
    visited = ScalaSet()
    _WithStatement(pYield, pAwait, pReturn)
  }
  private def _WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[WithStatement] = {
    if (!visited.contains("WithStatement", List(pYield, pAwait, pReturn))) {
      visited += (("WithStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[WithStatement]()
      val Expression_0_2 = _Expression(true, pYield, pAwait).toList
      val Statement_0_4 = _Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_2, Statement_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = Statement_0_4.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += WithStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.WithStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.WithStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[SwitchStatement] = {
    visited = ScalaSet()
    _SwitchStatement(pYield, pAwait, pReturn)
  }
  private def _SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[SwitchStatement] = {
    if (!visited.contains("SwitchStatement", List(pYield, pAwait, pReturn))) {
      visited += (("SwitchStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[SwitchStatement]()
      val Expression_0_2 = _Expression(true, pYield, pAwait).toList
      val CaseBlock_0_4 = _CaseBlock(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_2, CaseBlock_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = CaseBlock_0_4.applyOrElse(i, (_: Int) => _CaseBlock(pYield, pAwait, pReturn).head)
        s += SwitchStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.SwitchStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.SwitchStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseBlock] = {
    visited = ScalaSet()
    _CaseBlock(pYield, pAwait, pReturn)
  }
  private def _CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseBlock] = {
    if (!visited.contains("CaseBlock", List(pYield, pAwait, pReturn))) {
      visited += (("CaseBlock", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[CaseBlock]()
      val CaseClauses_0_1 = _CaseClauses(pYield, pAwait, pReturn).toList
      val max0 = List(CaseClauses_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CaseClauses_0_1.applyOrElse(i, (_: Int) => _CaseClauses(pYield, pAwait, pReturn).head)
        s += CaseBlock0(Some(arg0), List(pYield, pAwait, pReturn))
        s += CaseBlock0(None, List(pYield, pAwait, pReturn))
      }
      val CaseClauses_1_1 = _CaseClauses(pYield, pAwait, pReturn).toList
      val DefaultClause_1_2 = _DefaultClause(pYield, pAwait, pReturn).toList
      val CaseClauses_1_3 = _CaseClauses(pYield, pAwait, pReturn).toList
      val max1 = List(CaseClauses_1_1, DefaultClause_1_2, CaseClauses_1_3).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CaseClauses_1_1.applyOrElse(i, (_: Int) => _CaseClauses(pYield, pAwait, pReturn).head)
        val arg1 = DefaultClause_1_2.applyOrElse(i, (_: Int) => _DefaultClause(pYield, pAwait, pReturn).head)
        val arg2 = CaseClauses_1_3.applyOrElse(i, (_: Int) => _CaseClauses(pYield, pAwait, pReturn).head)
        s += CaseBlock1(Some(arg0), arg1, Some(arg2), List(pYield, pAwait, pReturn))
        s += CaseBlock1(Some(arg0), arg1, None, List(pYield, pAwait, pReturn))
        s += CaseBlock1(None, arg1, Some(arg2), List(pYield, pAwait, pReturn))
        s += CaseBlock1(None, arg1, None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.CaseBlock(pYield, pAwait, pReturn).depth
      val sample = randomSampler.CaseBlock(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseClauses] = {
    visited = ScalaSet()
    _CaseClauses(pYield, pAwait, pReturn)
  }
  private def _CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseClauses] = {
    if (!visited.contains("CaseClauses", List(pYield, pAwait, pReturn))) {
      visited += (("CaseClauses", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[CaseClauses]()
      val CaseClause_0_0 = _CaseClause(pYield, pAwait, pReturn).toList
      val max0 = List(CaseClause_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CaseClause_0_0.applyOrElse(i, (_: Int) => _CaseClause(pYield, pAwait, pReturn).head)
        s += CaseClauses0(arg0, List(pYield, pAwait, pReturn))
      }
      val CaseClauses_1_0 = _CaseClauses(pYield, pAwait, pReturn).toList
      val CaseClause_1_1 = _CaseClause(pYield, pAwait, pReturn).toList
      val max1 = List(CaseClauses_1_0, CaseClause_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CaseClauses_1_0.applyOrElse(i, (_: Int) => _CaseClauses(pYield, pAwait, pReturn).head)
        val arg1 = CaseClause_1_1.applyOrElse(i, (_: Int) => _CaseClause(pYield, pAwait, pReturn).head)
        s += CaseClauses1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.CaseClauses(pYield, pAwait, pReturn).depth
      val sample = randomSampler.CaseClauses(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseClause] = {
    visited = ScalaSet()
    _CaseClause(pYield, pAwait, pReturn)
  }
  private def _CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseClause] = {
    if (!visited.contains("CaseClause", List(pYield, pAwait, pReturn))) {
      visited += (("CaseClause", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[CaseClause]()
      val Expression_0_1 = _Expression(true, pYield, pAwait).toList
      val StatementList_0_3 = _StatementList(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_1, StatementList_0_3).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        val arg1 = StatementList_0_3.applyOrElse(i, (_: Int) => _StatementList(pYield, pAwait, pReturn).head)
        s += CaseClause0(arg0, Some(arg1), List(pYield, pAwait, pReturn))
        s += CaseClause0(arg0, None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.CaseClause(pYield, pAwait, pReturn).depth
      val sample = randomSampler.CaseClause(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[DefaultClause] = {
    visited = ScalaSet()
    _DefaultClause(pYield, pAwait, pReturn)
  }
  private def _DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[DefaultClause] = {
    if (!visited.contains("DefaultClause", List(pYield, pAwait, pReturn))) {
      visited += (("DefaultClause", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[DefaultClause]()
      val StatementList_0_2 = _StatementList(pYield, pAwait, pReturn).toList
      val max0 = List(StatementList_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_2.applyOrElse(i, (_: Int) => _StatementList(pYield, pAwait, pReturn).head)
        s += DefaultClause0(Some(arg0), List(pYield, pAwait, pReturn))
        s += DefaultClause0(None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.DefaultClause(pYield, pAwait, pReturn).depth
      val sample = randomSampler.DefaultClause(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[LabelledStatement] = {
    visited = ScalaSet()
    _LabelledStatement(pYield, pAwait, pReturn)
  }
  private def _LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[LabelledStatement] = {
    if (!visited.contains("LabelledStatement", List(pYield, pAwait, pReturn))) {
      visited += (("LabelledStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[LabelledStatement]()
      val LabelIdentifier_0_0 = _LabelIdentifier(pYield, pAwait).toList
      val LabelledItem_0_2 = _LabelledItem(pYield, pAwait, pReturn).toList
      val max0 = List(LabelIdentifier_0_0, LabelledItem_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LabelIdentifier_0_0.applyOrElse(i, (_: Int) => _LabelIdentifier(pYield, pAwait).head)
        val arg1 = LabelledItem_0_2.applyOrElse(i, (_: Int) => _LabelledItem(pYield, pAwait, pReturn).head)
        s += LabelledStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.LabelledStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.LabelledStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[LabelledItem] = {
    visited = ScalaSet()
    _LabelledItem(pYield, pAwait, pReturn)
  }
  private def _LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[LabelledItem] = {
    if (!visited.contains("LabelledItem", List(pYield, pAwait, pReturn))) {
      visited += (("LabelledItem", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[LabelledItem]()
      val Statement_0_0 = _Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Statement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Statement_0_0.applyOrElse(i, (_: Int) => _Statement(pYield, pAwait, pReturn).head)
        s += LabelledItem0(arg0, List(pYield, pAwait, pReturn))
      }
      val FunctionDeclaration_1_0 = _FunctionDeclaration(pYield, pAwait, false).toList
      val max1 = List(FunctionDeclaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FunctionDeclaration_1_0.applyOrElse(i, (_: Int) => _FunctionDeclaration(pYield, pAwait, false).head)
        s += LabelledItem1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.LabelledItem(pYield, pAwait, pReturn).depth
      val sample = randomSampler.LabelledItem(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def ThrowStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ThrowStatement] = {
    visited = ScalaSet()
    _ThrowStatement(pYield, pAwait)
  }
  private def _ThrowStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ThrowStatement] = {
    if (!visited.contains("ThrowStatement", List(pYield, pAwait))) {
      visited += (("ThrowStatement", List(pYield, pAwait)))
      var s = ScalaSet[ThrowStatement]()
      val Expression_0_2 = _Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => _Expression(true, pYield, pAwait).head)
        s += ThrowStatement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ThrowStatement(pYield, pAwait).depth
      val sample = randomSampler.ThrowStatement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[TryStatement] = {
    visited = ScalaSet()
    _TryStatement(pYield, pAwait, pReturn)
  }
  private def _TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[TryStatement] = {
    if (!visited.contains("TryStatement", List(pYield, pAwait, pReturn))) {
      visited += (("TryStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[TryStatement]()
      val Block_0_1 = _Block(pYield, pAwait, pReturn).toList
      val Catch_0_2 = _Catch(pYield, pAwait, pReturn).toList
      val max0 = List(Block_0_1, Catch_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Block_0_1.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        val arg1 = Catch_0_2.applyOrElse(i, (_: Int) => _Catch(pYield, pAwait, pReturn).head)
        s += TryStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Block_1_1 = _Block(pYield, pAwait, pReturn).toList
      val Finally_1_2 = _Finally(pYield, pAwait, pReturn).toList
      val max1 = List(Block_1_1, Finally_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Block_1_1.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        val arg1 = Finally_1_2.applyOrElse(i, (_: Int) => _Finally(pYield, pAwait, pReturn).head)
        s += TryStatement1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Block_2_1 = _Block(pYield, pAwait, pReturn).toList
      val Catch_2_2 = _Catch(pYield, pAwait, pReturn).toList
      val Finally_2_3 = _Finally(pYield, pAwait, pReturn).toList
      val max2 = List(Block_2_1, Catch_2_2, Finally_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = Block_2_1.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        val arg1 = Catch_2_2.applyOrElse(i, (_: Int) => _Catch(pYield, pAwait, pReturn).head)
        val arg2 = Finally_2_3.applyOrElse(i, (_: Int) => _Finally(pYield, pAwait, pReturn).head)
        s += TryStatement2(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.TryStatement(pYield, pAwait, pReturn).depth
      val sample = randomSampler.TryStatement(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Catch] = {
    visited = ScalaSet()
    _Catch(pYield, pAwait, pReturn)
  }
  private def _Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Catch] = {
    if (!visited.contains("Catch", List(pYield, pAwait, pReturn))) {
      visited += (("Catch", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Catch]()
      val CatchParameter_0_2 = _CatchParameter(pYield, pAwait).toList
      val Block_0_4 = _Block(pYield, pAwait, pReturn).toList
      val max0 = List(CatchParameter_0_2, Block_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CatchParameter_0_2.applyOrElse(i, (_: Int) => _CatchParameter(pYield, pAwait).head)
        val arg1 = Block_0_4.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        s += Catch0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Block_1_1 = _Block(pYield, pAwait, pReturn).toList
      val max1 = List(Block_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Block_1_1.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        s += Catch1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.Catch(pYield, pAwait, pReturn).depth
      val sample = randomSampler.Catch(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Finally] = {
    visited = ScalaSet()
    _Finally(pYield, pAwait, pReturn)
  }
  private def _Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Finally] = {
    if (!visited.contains("Finally", List(pYield, pAwait, pReturn))) {
      visited += (("Finally", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Finally]()
      val Block_0_1 = _Block(pYield, pAwait, pReturn).toList
      val max0 = List(Block_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Block_0_1.applyOrElse(i, (_: Int) => _Block(pYield, pAwait, pReturn).head)
        s += Finally0(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val d = counter.Finally(pYield, pAwait, pReturn).depth
      val sample = randomSampler.Finally(d, pYield, pAwait, pReturn)
      ScalaSet(sample)
    }
  }
  def CatchParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[CatchParameter] = {
    visited = ScalaSet()
    _CatchParameter(pYield, pAwait)
  }
  private def _CatchParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[CatchParameter] = {
    if (!visited.contains("CatchParameter", List(pYield, pAwait))) {
      visited += (("CatchParameter", List(pYield, pAwait)))
      var s = ScalaSet[CatchParameter]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += CatchParameter0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_0 = _BindingPattern(pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => _BindingPattern(pYield, pAwait).head)
        s += CatchParameter1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.CatchParameter(pYield, pAwait).depth
      val sample = randomSampler.CatchParameter(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def DebuggerStatement(): ScalaSet[DebuggerStatement] = {
    visited = ScalaSet()
    _DebuggerStatement()
  }
  private def _DebuggerStatement(): ScalaSet[DebuggerStatement] = {
    if (!visited.contains("DebuggerStatement", List())) {
      visited += (("DebuggerStatement", List()))
      var s = ScalaSet[DebuggerStatement]()
      s += DebuggerStatement0(List())
      s
    } else {
      val d = counter.DebuggerStatement().depth
      val sample = randomSampler.DebuggerStatement(d)
      ScalaSet(sample)
    }
  }
  def FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[FunctionDeclaration] = {
    visited = ScalaSet()
    _FunctionDeclaration(pYield, pAwait, pDefault)
  }
  private def _FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[FunctionDeclaration] = {
    if (!visited.contains("FunctionDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("FunctionDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[FunctionDeclaration]()
      val BindingIdentifier_0_1 = _BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_3 = _FormalParameters(false, false).toList
      val FunctionBody_0_6 = _FunctionBody(false, false).toList
      val max0 = List(BindingIdentifier_0_1, FormalParameters_0_3, FunctionBody_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_3.applyOrElse(i, (_: Int) => _FormalParameters(false, false).head)
        val arg2 = FunctionBody_0_6.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
        s += FunctionDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_2 = _FormalParameters(false, false).toList
        val FunctionBody_1_5 = _FunctionBody(false, false).toList
        val max1 = List(FormalParameters_1_2, FunctionBody_1_5).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_2.applyOrElse(i, (_: Int) => _FormalParameters(false, false).head)
          val arg1 = FunctionBody_1_5.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
          s += FunctionDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val d = counter.FunctionDeclaration(pYield, pAwait, pDefault).depth
      val sample = randomSampler.FunctionDeclaration(d, pYield, pAwait, pDefault)
      ScalaSet(sample)
    }
  }
  def FunctionExpression(): ScalaSet[FunctionExpression] = {
    visited = ScalaSet()
    _FunctionExpression()
  }
  private def _FunctionExpression(): ScalaSet[FunctionExpression] = {
    if (!visited.contains("FunctionExpression", List())) {
      visited += (("FunctionExpression", List()))
      var s = ScalaSet[FunctionExpression]()
      val BindingIdentifier_0_1 = _BindingIdentifier(false, false).toList
      val FormalParameters_0_3 = _FormalParameters(false, false).toList
      val FunctionBody_0_6 = _FunctionBody(false, false).toList
      val max0 = List(BindingIdentifier_0_1, FormalParameters_0_3, FunctionBody_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => _BindingIdentifier(false, false).head)
        val arg1 = FormalParameters_0_3.applyOrElse(i, (_: Int) => _FormalParameters(false, false).head)
        val arg2 = FunctionBody_0_6.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
        s += FunctionExpression0(Some(arg0), arg1, arg2, List())
        s += FunctionExpression0(None, arg1, arg2, List())
      }
      s
    } else {
      val d = counter.FunctionExpression().depth
      val sample = randomSampler.FunctionExpression(d)
      ScalaSet(sample)
    }
  }
  def UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[UniqueFormalParameters] = {
    visited = ScalaSet()
    _UniqueFormalParameters(pYield, pAwait)
  }
  private def _UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[UniqueFormalParameters] = {
    if (!visited.contains("UniqueFormalParameters", List(pYield, pAwait))) {
      visited += (("UniqueFormalParameters", List(pYield, pAwait)))
      var s = ScalaSet[UniqueFormalParameters]()
      val FormalParameters_0_0 = _FormalParameters(pYield, pAwait).toList
      val max0 = List(FormalParameters_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameters_0_0.applyOrElse(i, (_: Int) => _FormalParameters(pYield, pAwait).head)
        s += UniqueFormalParameters0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.UniqueFormalParameters(pYield, pAwait).depth
      val sample = randomSampler.UniqueFormalParameters(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def FormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameters] = {
    visited = ScalaSet()
    _FormalParameters(pYield, pAwait)
  }
  private def _FormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameters] = {
    if (!visited.contains("FormalParameters", List(pYield, pAwait))) {
      visited += (("FormalParameters", List(pYield, pAwait)))
      var s = ScalaSet[FormalParameters]()
      s += FormalParameters0(List(pYield, pAwait))
      val FunctionRestParameter_1_0 = _FunctionRestParameter(pYield, pAwait).toList
      val max1 = List(FunctionRestParameter_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FunctionRestParameter_1_0.applyOrElse(i, (_: Int) => _FunctionRestParameter(pYield, pAwait).head)
        s += FormalParameters1(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_2_0 = _FormalParameterList(pYield, pAwait).toList
      val max2 = List(FormalParameterList_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = FormalParameterList_2_0.applyOrElse(i, (_: Int) => _FormalParameterList(pYield, pAwait).head)
        s += FormalParameters2(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_3_0 = _FormalParameterList(pYield, pAwait).toList
      val max3 = List(FormalParameterList_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = FormalParameterList_3_0.applyOrElse(i, (_: Int) => _FormalParameterList(pYield, pAwait).head)
        s += FormalParameters3(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_4_0 = _FormalParameterList(pYield, pAwait).toList
      val FunctionRestParameter_4_2 = _FunctionRestParameter(pYield, pAwait).toList
      val max4 = List(FormalParameterList_4_0, FunctionRestParameter_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = FormalParameterList_4_0.applyOrElse(i, (_: Int) => _FormalParameterList(pYield, pAwait).head)
        val arg1 = FunctionRestParameter_4_2.applyOrElse(i, (_: Int) => _FunctionRestParameter(pYield, pAwait).head)
        s += FormalParameters4(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.FormalParameters(pYield, pAwait).depth
      val sample = randomSampler.FormalParameters(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def FormalParameterList(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameterList] = {
    visited = ScalaSet()
    _FormalParameterList(pYield, pAwait)
  }
  private def _FormalParameterList(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameterList] = {
    if (!visited.contains("FormalParameterList", List(pYield, pAwait))) {
      visited += (("FormalParameterList", List(pYield, pAwait)))
      var s = ScalaSet[FormalParameterList]()
      val FormalParameter_0_0 = _FormalParameter(pYield, pAwait).toList
      val max0 = List(FormalParameter_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameter_0_0.applyOrElse(i, (_: Int) => _FormalParameter(pYield, pAwait).head)
        s += FormalParameterList0(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_1_0 = _FormalParameterList(pYield, pAwait).toList
      val FormalParameter_1_2 = _FormalParameter(pYield, pAwait).toList
      val max1 = List(FormalParameterList_1_0, FormalParameter_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FormalParameterList_1_0.applyOrElse(i, (_: Int) => _FormalParameterList(pYield, pAwait).head)
        val arg1 = FormalParameter_1_2.applyOrElse(i, (_: Int) => _FormalParameter(pYield, pAwait).head)
        s += FormalParameterList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.FormalParameterList(pYield, pAwait).depth
      val sample = randomSampler.FormalParameterList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def FunctionRestParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionRestParameter] = {
    visited = ScalaSet()
    _FunctionRestParameter(pYield, pAwait)
  }
  private def _FunctionRestParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionRestParameter] = {
    if (!visited.contains("FunctionRestParameter", List(pYield, pAwait))) {
      visited += (("FunctionRestParameter", List(pYield, pAwait)))
      var s = ScalaSet[FunctionRestParameter]()
      val BindingRestElement_0_0 = _BindingRestElement(pYield, pAwait).toList
      val max0 = List(BindingRestElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingRestElement_0_0.applyOrElse(i, (_: Int) => _BindingRestElement(pYield, pAwait).head)
        s += FunctionRestParameter0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.FunctionRestParameter(pYield, pAwait).depth
      val sample = randomSampler.FunctionRestParameter(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def FormalParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameter] = {
    visited = ScalaSet()
    _FormalParameter(pYield, pAwait)
  }
  private def _FormalParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameter] = {
    if (!visited.contains("FormalParameter", List(pYield, pAwait))) {
      visited += (("FormalParameter", List(pYield, pAwait)))
      var s = ScalaSet[FormalParameter]()
      val BindingElement_0_0 = _BindingElement(pYield, pAwait).toList
      val max0 = List(BindingElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingElement_0_0.applyOrElse(i, (_: Int) => _BindingElement(pYield, pAwait).head)
        s += FormalParameter0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.FormalParameter(pYield, pAwait).depth
      val sample = randomSampler.FormalParameter(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def FunctionBody(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionBody] = {
    visited = ScalaSet()
    _FunctionBody(pYield, pAwait)
  }
  private def _FunctionBody(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionBody] = {
    if (!visited.contains("FunctionBody", List(pYield, pAwait))) {
      visited += (("FunctionBody", List(pYield, pAwait)))
      var s = ScalaSet[FunctionBody]()
      val FunctionStatementList_0_0 = _FunctionStatementList(pYield, pAwait).toList
      val max0 = List(FunctionStatementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionStatementList_0_0.applyOrElse(i, (_: Int) => _FunctionStatementList(pYield, pAwait).head)
        s += FunctionBody0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.FunctionBody(pYield, pAwait).depth
      val sample = randomSampler.FunctionBody(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def FunctionStatementList(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionStatementList] = {
    visited = ScalaSet()
    _FunctionStatementList(pYield, pAwait)
  }
  private def _FunctionStatementList(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionStatementList] = {
    if (!visited.contains("FunctionStatementList", List(pYield, pAwait))) {
      visited += (("FunctionStatementList", List(pYield, pAwait)))
      var s = ScalaSet[FunctionStatementList]()
      val StatementList_0_0 = _StatementList(pYield, pAwait, true).toList
      val max0 = List(StatementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_0.applyOrElse(i, (_: Int) => _StatementList(pYield, pAwait, true).head)
        s += FunctionStatementList0(Some(arg0), List(pYield, pAwait))
        s += FunctionStatementList0(None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.FunctionStatementList(pYield, pAwait).depth
      val sample = randomSampler.FunctionStatementList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowFunction] = {
    visited = ScalaSet()
    _ArrowFunction(pIn, pYield, pAwait)
  }
  private def _ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowFunction] = {
    if (!visited.contains("ArrowFunction", List(pIn, pYield, pAwait))) {
      visited += (("ArrowFunction", List(pIn, pYield, pAwait)))
      var s = ScalaSet[ArrowFunction]()
      val ArrowParameters_0_0 = _ArrowParameters(pYield, pAwait).toList
      val ConciseBody_0_3 = _ConciseBody(pIn).toList
      val max0 = List(ArrowParameters_0_0, ConciseBody_0_3).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ArrowParameters_0_0.applyOrElse(i, (_: Int) => _ArrowParameters(pYield, pAwait).head)
        val arg1 = ConciseBody_0_3.applyOrElse(i, (_: Int) => _ConciseBody(pIn).head)
        s += ArrowFunction0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArrowFunction(pIn, pYield, pAwait).depth
      val sample = randomSampler.ArrowFunction(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ArrowParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowParameters] = {
    visited = ScalaSet()
    _ArrowParameters(pYield, pAwait)
  }
  private def _ArrowParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowParameters] = {
    if (!visited.contains("ArrowParameters", List(pYield, pAwait))) {
      visited += (("ArrowParameters", List(pYield, pAwait)))
      var s = ScalaSet[ArrowParameters]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        s += ArrowParameters0(arg0, List(pYield, pAwait))
      }
      val CoverParenthesizedExpressionAndArrowParameterList_1_0 = _CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).toList
      val max1 = List(CoverParenthesizedExpressionAndArrowParameterList_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoverParenthesizedExpressionAndArrowParameterList_1_0.applyOrElse(i, (_: Int) => _CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).head)
        s += ArrowParameters1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArrowParameters(pYield, pAwait).depth
      val sample = randomSampler.ArrowParameters(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ConciseBody(pIn: Boolean): ScalaSet[ConciseBody] = {
    visited = ScalaSet()
    _ConciseBody(pIn)
  }
  private def _ConciseBody(pIn: Boolean): ScalaSet[ConciseBody] = {
    if (!visited.contains("ConciseBody", List(pIn))) {
      visited += (("ConciseBody", List(pIn)))
      var s = ScalaSet[ConciseBody]()
      val ExpressionBody_0_1 = _ExpressionBody(pIn, false).toList
      val max0 = List(ExpressionBody_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ExpressionBody_0_1.applyOrElse(i, (_: Int) => _ExpressionBody(pIn, false).head)
        s += ConciseBody0(arg0, List(pIn))
      }
      val FunctionBody_1_1 = _FunctionBody(false, false).toList
      val max1 = List(FunctionBody_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FunctionBody_1_1.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
        s += ConciseBody1(arg0, List(pIn))
      }
      s
    } else {
      val d = counter.ConciseBody(pIn).depth
      val sample = randomSampler.ConciseBody(d, pIn)
      ScalaSet(sample)
    }
  }
  def ExpressionBody(pIn: Boolean, pAwait: Boolean): ScalaSet[ExpressionBody] = {
    visited = ScalaSet()
    _ExpressionBody(pIn, pAwait)
  }
  private def _ExpressionBody(pIn: Boolean, pAwait: Boolean): ScalaSet[ExpressionBody] = {
    if (!visited.contains("ExpressionBody", List(pIn, pAwait))) {
      visited += (("ExpressionBody", List(pIn, pAwait)))
      var s = ScalaSet[ExpressionBody]()
      val AssignmentExpression_0_0 = _AssignmentExpression(pIn, false, pAwait).toList
      val max0 = List(AssignmentExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_0.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, false, pAwait).head)
        s += ExpressionBody0(arg0, List(pIn, pAwait))
      }
      s
    } else {
      val d = counter.ExpressionBody(pIn, pAwait).depth
      val sample = randomSampler.ExpressionBody(d, pIn, pAwait)
      ScalaSet(sample)
    }
  }
  def ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowFormalParameters] = {
    visited = ScalaSet()
    _ArrowFormalParameters(pYield, pAwait)
  }
  private def _ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowFormalParameters] = {
    if (!visited.contains("ArrowFormalParameters", List(pYield, pAwait))) {
      visited += (("ArrowFormalParameters", List(pYield, pAwait)))
      var s = ScalaSet[ArrowFormalParameters]()
      val UniqueFormalParameters_0_1 = _UniqueFormalParameters(pYield, pAwait).toList
      val max0 = List(UniqueFormalParameters_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UniqueFormalParameters_0_1.applyOrElse(i, (_: Int) => _UniqueFormalParameters(pYield, pAwait).head)
        s += ArrowFormalParameters0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ArrowFormalParameters(pYield, pAwait).depth
      val sample = randomSampler.ArrowFormalParameters(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncArrowFunction] = {
    visited = ScalaSet()
    _AsyncArrowFunction(pIn, pYield, pAwait)
  }
  private def _AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncArrowFunction] = {
    if (!visited.contains("AsyncArrowFunction", List(pIn, pYield, pAwait))) {
      visited += (("AsyncArrowFunction", List(pIn, pYield, pAwait)))
      var s = ScalaSet[AsyncArrowFunction]()
      val AsyncArrowBindingIdentifier_0_2 = _AsyncArrowBindingIdentifier(pYield).toList
      val AsyncConciseBody_0_5 = _AsyncConciseBody(pIn).toList
      val max0 = List(AsyncArrowBindingIdentifier_0_2, AsyncConciseBody_0_5).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AsyncArrowBindingIdentifier_0_2.applyOrElse(i, (_: Int) => _AsyncArrowBindingIdentifier(pYield).head)
        val arg1 = AsyncConciseBody_0_5.applyOrElse(i, (_: Int) => _AsyncConciseBody(pIn).head)
        s += AsyncArrowFunction0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val CoverCallExpressionAndAsyncArrowHead_1_0 = _CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).toList
      val AsyncConciseBody_1_3 = _AsyncConciseBody(pIn).toList
      val max1 = List(CoverCallExpressionAndAsyncArrowHead_1_0, AsyncConciseBody_1_3).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoverCallExpressionAndAsyncArrowHead_1_0.applyOrElse(i, (_: Int) => _CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).head)
        val arg1 = AsyncConciseBody_1_3.applyOrElse(i, (_: Int) => _AsyncConciseBody(pIn).head)
        s += AsyncArrowFunction1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val d = counter.AsyncArrowFunction(pIn, pYield, pAwait).depth
      val sample = randomSampler.AsyncArrowFunction(d, pIn, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AsyncConciseBody(pIn: Boolean): ScalaSet[AsyncConciseBody] = {
    visited = ScalaSet()
    _AsyncConciseBody(pIn)
  }
  private def _AsyncConciseBody(pIn: Boolean): ScalaSet[AsyncConciseBody] = {
    if (!visited.contains("AsyncConciseBody", List(pIn))) {
      visited += (("AsyncConciseBody", List(pIn)))
      var s = ScalaSet[AsyncConciseBody]()
      val ExpressionBody_0_1 = _ExpressionBody(pIn, true).toList
      val max0 = List(ExpressionBody_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ExpressionBody_0_1.applyOrElse(i, (_: Int) => _ExpressionBody(pIn, true).head)
        s += AsyncConciseBody0(arg0, List(pIn))
      }
      val AsyncFunctionBody_1_1 = _AsyncFunctionBody().toList
      val max1 = List(AsyncFunctionBody_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AsyncFunctionBody_1_1.applyOrElse(i, (_: Int) => _AsyncFunctionBody().head)
        s += AsyncConciseBody1(arg0, List(pIn))
      }
      s
    } else {
      val d = counter.AsyncConciseBody(pIn).depth
      val sample = randomSampler.AsyncConciseBody(d, pIn)
      ScalaSet(sample)
    }
  }
  def AsyncArrowBindingIdentifier(pYield: Boolean): ScalaSet[AsyncArrowBindingIdentifier] = {
    visited = ScalaSet()
    _AsyncArrowBindingIdentifier(pYield)
  }
  private def _AsyncArrowBindingIdentifier(pYield: Boolean): ScalaSet[AsyncArrowBindingIdentifier] = {
    if (!visited.contains("AsyncArrowBindingIdentifier", List(pYield))) {
      visited += (("AsyncArrowBindingIdentifier", List(pYield)))
      var s = ScalaSet[AsyncArrowBindingIdentifier]()
      val BindingIdentifier_0_0 = _BindingIdentifier(pYield, true).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, true).head)
        s += AsyncArrowBindingIdentifier0(arg0, List(pYield))
      }
      s
    } else {
      val d = counter.AsyncArrowBindingIdentifier(pYield).depth
      val sample = randomSampler.AsyncArrowBindingIdentifier(d, pYield)
      ScalaSet(sample)
    }
  }
  def CoverCallExpressionAndAsyncArrowHead(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverCallExpressionAndAsyncArrowHead] = {
    visited = ScalaSet()
    _CoverCallExpressionAndAsyncArrowHead(pYield, pAwait)
  }
  private def _CoverCallExpressionAndAsyncArrowHead(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverCallExpressionAndAsyncArrowHead] = {
    if (!visited.contains("CoverCallExpressionAndAsyncArrowHead", List(pYield, pAwait))) {
      visited += (("CoverCallExpressionAndAsyncArrowHead", List(pYield, pAwait)))
      var s = ScalaSet[CoverCallExpressionAndAsyncArrowHead]()
      val MemberExpression_0_0 = _MemberExpression(pYield, pAwait).toList
      val Arguments_0_1 = _Arguments(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0, Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => _MemberExpression(pYield, pAwait).head)
        val arg1 = Arguments_0_1.applyOrElse(i, (_: Int) => _Arguments(pYield, pAwait).head)
        s += CoverCallExpressionAndAsyncArrowHead0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).depth
      val sample = randomSampler.CoverCallExpressionAndAsyncArrowHead(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AsyncArrowHead(): ScalaSet[AsyncArrowHead] = {
    visited = ScalaSet()
    _AsyncArrowHead()
  }
  private def _AsyncArrowHead(): ScalaSet[AsyncArrowHead] = {
    if (!visited.contains("AsyncArrowHead", List())) {
      visited += (("AsyncArrowHead", List()))
      var s = ScalaSet[AsyncArrowHead]()
      val ArrowFormalParameters_0_2 = _ArrowFormalParameters(false, true).toList
      val max0 = List(ArrowFormalParameters_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ArrowFormalParameters_0_2.applyOrElse(i, (_: Int) => _ArrowFormalParameters(false, true).head)
        s += AsyncArrowHead0(arg0, List())
      }
      s
    } else {
      val d = counter.AsyncArrowHead().depth
      val sample = randomSampler.AsyncArrowHead(d)
      ScalaSet(sample)
    }
  }
  def MethodDefinition(pYield: Boolean, pAwait: Boolean): ScalaSet[MethodDefinition] = {
    visited = ScalaSet()
    _MethodDefinition(pYield, pAwait)
  }
  private def _MethodDefinition(pYield: Boolean, pAwait: Boolean): ScalaSet[MethodDefinition] = {
    if (!visited.contains("MethodDefinition", List(pYield, pAwait))) {
      visited += (("MethodDefinition", List(pYield, pAwait)))
      var s = ScalaSet[MethodDefinition]()
      val PropertyName_0_0 = _PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_2 = _UniqueFormalParameters(false, false).toList
      val FunctionBody_0_5 = _FunctionBody(false, false).toList
      val max0 = List(PropertyName_0_0, UniqueFormalParameters_0_2, FunctionBody_0_5).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_0.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_2.applyOrElse(i, (_: Int) => _UniqueFormalParameters(false, false).head)
        val arg2 = FunctionBody_0_5.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
        s += MethodDefinition0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      val GeneratorMethod_1_0 = _GeneratorMethod(pYield, pAwait).toList
      val max1 = List(GeneratorMethod_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = GeneratorMethod_1_0.applyOrElse(i, (_: Int) => _GeneratorMethod(pYield, pAwait).head)
        s += MethodDefinition1(arg0, List(pYield, pAwait))
      }
      val AsyncMethod_2_0 = _AsyncMethod(pYield, pAwait).toList
      val max2 = List(AsyncMethod_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AsyncMethod_2_0.applyOrElse(i, (_: Int) => _AsyncMethod(pYield, pAwait).head)
        s += MethodDefinition2(arg0, List(pYield, pAwait))
      }
      val AsyncGeneratorMethod_3_0 = _AsyncGeneratorMethod(pYield, pAwait).toList
      val max3 = List(AsyncGeneratorMethod_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AsyncGeneratorMethod_3_0.applyOrElse(i, (_: Int) => _AsyncGeneratorMethod(pYield, pAwait).head)
        s += MethodDefinition3(arg0, List(pYield, pAwait))
      }
      val PropertyName_4_1 = _PropertyName(pYield, pAwait).toList
      val FunctionBody_4_5 = _FunctionBody(false, false).toList
      val max4 = List(PropertyName_4_1, FunctionBody_4_5).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = PropertyName_4_1.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = FunctionBody_4_5.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
        s += MethodDefinition4(arg0, arg1, List(pYield, pAwait))
      }
      val PropertyName_5_1 = _PropertyName(pYield, pAwait).toList
      val PropertySetParameterList_5_3 = _PropertySetParameterList().toList
      val FunctionBody_5_6 = _FunctionBody(false, false).toList
      val max5 = List(PropertyName_5_1, PropertySetParameterList_5_3, FunctionBody_5_6).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = PropertyName_5_1.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = PropertySetParameterList_5_3.applyOrElse(i, (_: Int) => _PropertySetParameterList().head)
        val arg2 = FunctionBody_5_6.applyOrElse(i, (_: Int) => _FunctionBody(false, false).head)
        s += MethodDefinition5(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.MethodDefinition(pYield, pAwait).depth
      val sample = randomSampler.MethodDefinition(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def PropertySetParameterList(): ScalaSet[PropertySetParameterList] = {
    visited = ScalaSet()
    _PropertySetParameterList()
  }
  private def _PropertySetParameterList(): ScalaSet[PropertySetParameterList] = {
    if (!visited.contains("PropertySetParameterList", List())) {
      visited += (("PropertySetParameterList", List()))
      var s = ScalaSet[PropertySetParameterList]()
      val FormalParameter_0_0 = _FormalParameter(false, false).toList
      val max0 = List(FormalParameter_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameter_0_0.applyOrElse(i, (_: Int) => _FormalParameter(false, false).head)
        s += PropertySetParameterList0(arg0, List())
      }
      s
    } else {
      val d = counter.PropertySetParameterList().depth
      val sample = randomSampler.PropertySetParameterList(d)
      ScalaSet(sample)
    }
  }
  def GeneratorMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[GeneratorMethod] = {
    visited = ScalaSet()
    _GeneratorMethod(pYield, pAwait)
  }
  private def _GeneratorMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[GeneratorMethod] = {
    if (!visited.contains("GeneratorMethod", List(pYield, pAwait))) {
      visited += (("GeneratorMethod", List(pYield, pAwait)))
      var s = ScalaSet[GeneratorMethod]()
      val PropertyName_0_1 = _PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_3 = _UniqueFormalParameters(true, false).toList
      val GeneratorBody_0_6 = _GeneratorBody().toList
      val max0 = List(PropertyName_0_1, UniqueFormalParameters_0_3, GeneratorBody_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_1.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_3.applyOrElse(i, (_: Int) => _UniqueFormalParameters(true, false).head)
        val arg2 = GeneratorBody_0_6.applyOrElse(i, (_: Int) => _GeneratorBody().head)
        s += GeneratorMethod0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.GeneratorMethod(pYield, pAwait).depth
      val sample = randomSampler.GeneratorMethod(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[GeneratorDeclaration] = {
    visited = ScalaSet()
    _GeneratorDeclaration(pYield, pAwait, pDefault)
  }
  private def _GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[GeneratorDeclaration] = {
    if (!visited.contains("GeneratorDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("GeneratorDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[GeneratorDeclaration]()
      val BindingIdentifier_0_2 = _BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_4 = _FormalParameters(true, false).toList
      val GeneratorBody_0_7 = _GeneratorBody().toList
      val max0 = List(BindingIdentifier_0_2, FormalParameters_0_4, GeneratorBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_2.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_4.applyOrElse(i, (_: Int) => _FormalParameters(true, false).head)
        val arg2 = GeneratorBody_0_7.applyOrElse(i, (_: Int) => _GeneratorBody().head)
        s += GeneratorDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_3 = _FormalParameters(true, false).toList
        val GeneratorBody_1_6 = _GeneratorBody().toList
        val max1 = List(FormalParameters_1_3, GeneratorBody_1_6).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_3.applyOrElse(i, (_: Int) => _FormalParameters(true, false).head)
          val arg1 = GeneratorBody_1_6.applyOrElse(i, (_: Int) => _GeneratorBody().head)
          s += GeneratorDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val d = counter.GeneratorDeclaration(pYield, pAwait, pDefault).depth
      val sample = randomSampler.GeneratorDeclaration(d, pYield, pAwait, pDefault)
      ScalaSet(sample)
    }
  }
  def GeneratorExpression(): ScalaSet[GeneratorExpression] = {
    visited = ScalaSet()
    _GeneratorExpression()
  }
  private def _GeneratorExpression(): ScalaSet[GeneratorExpression] = {
    if (!visited.contains("GeneratorExpression", List())) {
      visited += (("GeneratorExpression", List()))
      var s = ScalaSet[GeneratorExpression]()
      val BindingIdentifier_0_2 = _BindingIdentifier(true, false).toList
      val FormalParameters_0_4 = _FormalParameters(true, false).toList
      val GeneratorBody_0_7 = _GeneratorBody().toList
      val max0 = List(BindingIdentifier_0_2, FormalParameters_0_4, GeneratorBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_2.applyOrElse(i, (_: Int) => _BindingIdentifier(true, false).head)
        val arg1 = FormalParameters_0_4.applyOrElse(i, (_: Int) => _FormalParameters(true, false).head)
        val arg2 = GeneratorBody_0_7.applyOrElse(i, (_: Int) => _GeneratorBody().head)
        s += GeneratorExpression0(Some(arg0), arg1, arg2, List())
        s += GeneratorExpression0(None, arg1, arg2, List())
      }
      s
    } else {
      val d = counter.GeneratorExpression().depth
      val sample = randomSampler.GeneratorExpression(d)
      ScalaSet(sample)
    }
  }
  def GeneratorBody(): ScalaSet[GeneratorBody] = {
    visited = ScalaSet()
    _GeneratorBody()
  }
  private def _GeneratorBody(): ScalaSet[GeneratorBody] = {
    if (!visited.contains("GeneratorBody", List())) {
      visited += (("GeneratorBody", List()))
      var s = ScalaSet[GeneratorBody]()
      val FunctionBody_0_0 = _FunctionBody(true, false).toList
      val max0 = List(FunctionBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionBody_0_0.applyOrElse(i, (_: Int) => _FunctionBody(true, false).head)
        s += GeneratorBody0(arg0, List())
      }
      s
    } else {
      val d = counter.GeneratorBody().depth
      val sample = randomSampler.GeneratorBody(d)
      ScalaSet(sample)
    }
  }
  def YieldExpression(pIn: Boolean, pAwait: Boolean): ScalaSet[YieldExpression] = {
    visited = ScalaSet()
    _YieldExpression(pIn, pAwait)
  }
  private def _YieldExpression(pIn: Boolean, pAwait: Boolean): ScalaSet[YieldExpression] = {
    if (!visited.contains("YieldExpression", List(pIn, pAwait))) {
      visited += (("YieldExpression", List(pIn, pAwait)))
      var s = ScalaSet[YieldExpression]()
      s += YieldExpression0(List(pIn, pAwait))
      val AssignmentExpression_1_2 = _AssignmentExpression(pIn, true, pAwait).toList
      val max1 = List(AssignmentExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentExpression_1_2.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, true, pAwait).head)
        s += YieldExpression1(arg0, List(pIn, pAwait))
      }
      val AssignmentExpression_2_3 = _AssignmentExpression(pIn, true, pAwait).toList
      val max2 = List(AssignmentExpression_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AssignmentExpression_2_3.applyOrElse(i, (_: Int) => _AssignmentExpression(pIn, true, pAwait).head)
        s += YieldExpression2(arg0, List(pIn, pAwait))
      }
      s
    } else {
      val d = counter.YieldExpression(pIn, pAwait).depth
      val sample = randomSampler.YieldExpression(d, pIn, pAwait)
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncGeneratorMethod] = {
    visited = ScalaSet()
    _AsyncGeneratorMethod(pYield, pAwait)
  }
  private def _AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncGeneratorMethod] = {
    if (!visited.contains("AsyncGeneratorMethod", List(pYield, pAwait))) {
      visited += (("AsyncGeneratorMethod", List(pYield, pAwait)))
      var s = ScalaSet[AsyncGeneratorMethod]()
      val PropertyName_0_3 = _PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_5 = _UniqueFormalParameters(true, true).toList
      val AsyncGeneratorBody_0_8 = _AsyncGeneratorBody().toList
      val max0 = List(PropertyName_0_3, UniqueFormalParameters_0_5, AsyncGeneratorBody_0_8).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_3.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_5.applyOrElse(i, (_: Int) => _UniqueFormalParameters(true, true).head)
        val arg2 = AsyncGeneratorBody_0_8.applyOrElse(i, (_: Int) => _AsyncGeneratorBody().head)
        s += AsyncGeneratorMethod0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AsyncGeneratorMethod(pYield, pAwait).depth
      val sample = randomSampler.AsyncGeneratorMethod(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[AsyncGeneratorDeclaration] = {
    visited = ScalaSet()
    _AsyncGeneratorDeclaration(pYield, pAwait, pDefault)
  }
  private def _AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[AsyncGeneratorDeclaration] = {
    if (!visited.contains("AsyncGeneratorDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("AsyncGeneratorDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[AsyncGeneratorDeclaration]()
      val BindingIdentifier_0_4 = _BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_6 = _FormalParameters(true, true).toList
      val AsyncGeneratorBody_0_9 = _AsyncGeneratorBody().toList
      val max0 = List(BindingIdentifier_0_4, FormalParameters_0_6, AsyncGeneratorBody_0_9).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_4.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_6.applyOrElse(i, (_: Int) => _FormalParameters(true, true).head)
        val arg2 = AsyncGeneratorBody_0_9.applyOrElse(i, (_: Int) => _AsyncGeneratorBody().head)
        s += AsyncGeneratorDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_5 = _FormalParameters(true, true).toList
        val AsyncGeneratorBody_1_8 = _AsyncGeneratorBody().toList
        val max1 = List(FormalParameters_1_5, AsyncGeneratorBody_1_8).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_5.applyOrElse(i, (_: Int) => _FormalParameters(true, true).head)
          val arg1 = AsyncGeneratorBody_1_8.applyOrElse(i, (_: Int) => _AsyncGeneratorBody().head)
          s += AsyncGeneratorDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val d = counter.AsyncGeneratorDeclaration(pYield, pAwait, pDefault).depth
      val sample = randomSampler.AsyncGeneratorDeclaration(d, pYield, pAwait, pDefault)
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorExpression(): ScalaSet[AsyncGeneratorExpression] = {
    visited = ScalaSet()
    _AsyncGeneratorExpression()
  }
  private def _AsyncGeneratorExpression(): ScalaSet[AsyncGeneratorExpression] = {
    if (!visited.contains("AsyncGeneratorExpression", List())) {
      visited += (("AsyncGeneratorExpression", List()))
      var s = ScalaSet[AsyncGeneratorExpression]()
      val BindingIdentifier_0_4 = _BindingIdentifier(true, true).toList
      val FormalParameters_0_6 = _FormalParameters(true, true).toList
      val AsyncGeneratorBody_0_9 = _AsyncGeneratorBody().toList
      val max0 = List(BindingIdentifier_0_4, FormalParameters_0_6, AsyncGeneratorBody_0_9).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_4.applyOrElse(i, (_: Int) => _BindingIdentifier(true, true).head)
        val arg1 = FormalParameters_0_6.applyOrElse(i, (_: Int) => _FormalParameters(true, true).head)
        val arg2 = AsyncGeneratorBody_0_9.applyOrElse(i, (_: Int) => _AsyncGeneratorBody().head)
        s += AsyncGeneratorExpression0(Some(arg0), arg1, arg2, List())
        s += AsyncGeneratorExpression0(None, arg1, arg2, List())
      }
      s
    } else {
      val d = counter.AsyncGeneratorExpression().depth
      val sample = randomSampler.AsyncGeneratorExpression(d)
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorBody(): ScalaSet[AsyncGeneratorBody] = {
    visited = ScalaSet()
    _AsyncGeneratorBody()
  }
  private def _AsyncGeneratorBody(): ScalaSet[AsyncGeneratorBody] = {
    if (!visited.contains("AsyncGeneratorBody", List())) {
      visited += (("AsyncGeneratorBody", List()))
      var s = ScalaSet[AsyncGeneratorBody]()
      val FunctionBody_0_0 = _FunctionBody(true, true).toList
      val max0 = List(FunctionBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionBody_0_0.applyOrElse(i, (_: Int) => _FunctionBody(true, true).head)
        s += AsyncGeneratorBody0(arg0, List())
      }
      s
    } else {
      val d = counter.AsyncGeneratorBody().depth
      val sample = randomSampler.AsyncGeneratorBody(d)
      ScalaSet(sample)
    }
  }
  def AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[AsyncFunctionDeclaration] = {
    visited = ScalaSet()
    _AsyncFunctionDeclaration(pYield, pAwait, pDefault)
  }
  private def _AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[AsyncFunctionDeclaration] = {
    if (!visited.contains("AsyncFunctionDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("AsyncFunctionDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[AsyncFunctionDeclaration]()
      val BindingIdentifier_0_3 = _BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_5 = _FormalParameters(false, true).toList
      val AsyncFunctionBody_0_8 = _AsyncFunctionBody().toList
      val max0 = List(BindingIdentifier_0_3, FormalParameters_0_5, AsyncFunctionBody_0_8).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_3.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_5.applyOrElse(i, (_: Int) => _FormalParameters(false, true).head)
        val arg2 = AsyncFunctionBody_0_8.applyOrElse(i, (_: Int) => _AsyncFunctionBody().head)
        s += AsyncFunctionDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_4 = _FormalParameters(false, true).toList
        val AsyncFunctionBody_1_7 = _AsyncFunctionBody().toList
        val max1 = List(FormalParameters_1_4, AsyncFunctionBody_1_7).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_4.applyOrElse(i, (_: Int) => _FormalParameters(false, true).head)
          val arg1 = AsyncFunctionBody_1_7.applyOrElse(i, (_: Int) => _AsyncFunctionBody().head)
          s += AsyncFunctionDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val d = counter.AsyncFunctionDeclaration(pYield, pAwait, pDefault).depth
      val sample = randomSampler.AsyncFunctionDeclaration(d, pYield, pAwait, pDefault)
      ScalaSet(sample)
    }
  }
  def AsyncFunctionExpression(): ScalaSet[AsyncFunctionExpression] = {
    visited = ScalaSet()
    _AsyncFunctionExpression()
  }
  private def _AsyncFunctionExpression(): ScalaSet[AsyncFunctionExpression] = {
    if (!visited.contains("AsyncFunctionExpression", List())) {
      visited += (("AsyncFunctionExpression", List()))
      var s = ScalaSet[AsyncFunctionExpression]()
      val FormalParameters_0_4 = _FormalParameters(false, true).toList
      val AsyncFunctionBody_0_7 = _AsyncFunctionBody().toList
      val max0 = List(FormalParameters_0_4, AsyncFunctionBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameters_0_4.applyOrElse(i, (_: Int) => _FormalParameters(false, true).head)
        val arg1 = AsyncFunctionBody_0_7.applyOrElse(i, (_: Int) => _AsyncFunctionBody().head)
        s += AsyncFunctionExpression0(arg0, arg1, List())
      }
      val BindingIdentifier_1_3 = _BindingIdentifier(false, true).toList
      val FormalParameters_1_5 = _FormalParameters(false, true).toList
      val AsyncFunctionBody_1_8 = _AsyncFunctionBody().toList
      val max1 = List(BindingIdentifier_1_3, FormalParameters_1_5, AsyncFunctionBody_1_8).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingIdentifier_1_3.applyOrElse(i, (_: Int) => _BindingIdentifier(false, true).head)
        val arg1 = FormalParameters_1_5.applyOrElse(i, (_: Int) => _FormalParameters(false, true).head)
        val arg2 = AsyncFunctionBody_1_8.applyOrElse(i, (_: Int) => _AsyncFunctionBody().head)
        s += AsyncFunctionExpression1(arg0, arg1, arg2, List())
      }
      s
    } else {
      val d = counter.AsyncFunctionExpression().depth
      val sample = randomSampler.AsyncFunctionExpression(d)
      ScalaSet(sample)
    }
  }
  def AsyncMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncMethod] = {
    visited = ScalaSet()
    _AsyncMethod(pYield, pAwait)
  }
  private def _AsyncMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncMethod] = {
    if (!visited.contains("AsyncMethod", List(pYield, pAwait))) {
      visited += (("AsyncMethod", List(pYield, pAwait)))
      var s = ScalaSet[AsyncMethod]()
      val PropertyName_0_2 = _PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_4 = _UniqueFormalParameters(false, true).toList
      val AsyncFunctionBody_0_7 = _AsyncFunctionBody().toList
      val max0 = List(PropertyName_0_2, UniqueFormalParameters_0_4, AsyncFunctionBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_2.applyOrElse(i, (_: Int) => _PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_4.applyOrElse(i, (_: Int) => _UniqueFormalParameters(false, true).head)
        val arg2 = AsyncFunctionBody_0_7.applyOrElse(i, (_: Int) => _AsyncFunctionBody().head)
        s += AsyncMethod0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.AsyncMethod(pYield, pAwait).depth
      val sample = randomSampler.AsyncMethod(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def AsyncFunctionBody(): ScalaSet[AsyncFunctionBody] = {
    visited = ScalaSet()
    _AsyncFunctionBody()
  }
  private def _AsyncFunctionBody(): ScalaSet[AsyncFunctionBody] = {
    if (!visited.contains("AsyncFunctionBody", List())) {
      visited += (("AsyncFunctionBody", List()))
      var s = ScalaSet[AsyncFunctionBody]()
      val FunctionBody_0_0 = _FunctionBody(false, true).toList
      val max0 = List(FunctionBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionBody_0_0.applyOrElse(i, (_: Int) => _FunctionBody(false, true).head)
        s += AsyncFunctionBody0(arg0, List())
      }
      s
    } else {
      val d = counter.AsyncFunctionBody().depth
      val sample = randomSampler.AsyncFunctionBody(d)
      ScalaSet(sample)
    }
  }
  def AwaitExpression(pYield: Boolean): ScalaSet[AwaitExpression] = {
    visited = ScalaSet()
    _AwaitExpression(pYield)
  }
  private def _AwaitExpression(pYield: Boolean): ScalaSet[AwaitExpression] = {
    if (!visited.contains("AwaitExpression", List(pYield))) {
      visited += (("AwaitExpression", List(pYield)))
      var s = ScalaSet[AwaitExpression]()
      val UnaryExpression_0_1 = _UnaryExpression(pYield, true).toList
      val max0 = List(UnaryExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UnaryExpression_0_1.applyOrElse(i, (_: Int) => _UnaryExpression(pYield, true).head)
        s += AwaitExpression0(arg0, List(pYield))
      }
      s
    } else {
      val d = counter.AwaitExpression(pYield).depth
      val sample = randomSampler.AwaitExpression(d, pYield)
      ScalaSet(sample)
    }
  }
  def ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[ClassDeclaration] = {
    visited = ScalaSet()
    _ClassDeclaration(pYield, pAwait, pDefault)
  }
  private def _ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[ClassDeclaration] = {
    if (!visited.contains("ClassDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("ClassDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[ClassDeclaration]()
      val BindingIdentifier_0_1 = _BindingIdentifier(pYield, pAwait).toList
      val ClassTail_0_2 = _ClassTail(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1, ClassTail_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = ClassTail_0_2.applyOrElse(i, (_: Int) => _ClassTail(pYield, pAwait).head)
        s += ClassDeclaration0(arg0, arg1, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val ClassTail_1_1 = _ClassTail(pYield, pAwait).toList
        val max1 = List(ClassTail_1_1).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = ClassTail_1_1.applyOrElse(i, (_: Int) => _ClassTail(pYield, pAwait).head)
          s += ClassDeclaration1(arg0, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val d = counter.ClassDeclaration(pYield, pAwait, pDefault).depth
      val sample = randomSampler.ClassDeclaration(d, pYield, pAwait, pDefault)
      ScalaSet(sample)
    }
  }
  def ClassExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassExpression] = {
    visited = ScalaSet()
    _ClassExpression(pYield, pAwait)
  }
  private def _ClassExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassExpression] = {
    if (!visited.contains("ClassExpression", List(pYield, pAwait))) {
      visited += (("ClassExpression", List(pYield, pAwait)))
      var s = ScalaSet[ClassExpression]()
      val BindingIdentifier_0_1 = _BindingIdentifier(pYield, pAwait).toList
      val ClassTail_0_2 = _ClassTail(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1, ClassTail_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => _BindingIdentifier(pYield, pAwait).head)
        val arg1 = ClassTail_0_2.applyOrElse(i, (_: Int) => _ClassTail(pYield, pAwait).head)
        s += ClassExpression0(Some(arg0), arg1, List(pYield, pAwait))
        s += ClassExpression0(None, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ClassExpression(pYield, pAwait).depth
      val sample = randomSampler.ClassExpression(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ClassTail(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassTail] = {
    visited = ScalaSet()
    _ClassTail(pYield, pAwait)
  }
  private def _ClassTail(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassTail] = {
    if (!visited.contains("ClassTail", List(pYield, pAwait))) {
      visited += (("ClassTail", List(pYield, pAwait)))
      var s = ScalaSet[ClassTail]()
      val ClassHeritage_0_0 = _ClassHeritage(pYield, pAwait).toList
      val ClassBody_0_2 = _ClassBody(pYield, pAwait).toList
      val max0 = List(ClassHeritage_0_0, ClassBody_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ClassHeritage_0_0.applyOrElse(i, (_: Int) => _ClassHeritage(pYield, pAwait).head)
        val arg1 = ClassBody_0_2.applyOrElse(i, (_: Int) => _ClassBody(pYield, pAwait).head)
        s += ClassTail0(Some(arg0), Some(arg1), List(pYield, pAwait))
        s += ClassTail0(Some(arg0), None, List(pYield, pAwait))
        s += ClassTail0(None, Some(arg1), List(pYield, pAwait))
        s += ClassTail0(None, None, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ClassTail(pYield, pAwait).depth
      val sample = randomSampler.ClassTail(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ClassHeritage(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassHeritage] = {
    visited = ScalaSet()
    _ClassHeritage(pYield, pAwait)
  }
  private def _ClassHeritage(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassHeritage] = {
    if (!visited.contains("ClassHeritage", List(pYield, pAwait))) {
      visited += (("ClassHeritage", List(pYield, pAwait)))
      var s = ScalaSet[ClassHeritage]()
      val LeftHandSideExpression_0_1 = _LeftHandSideExpression(pYield, pAwait).toList
      val max0 = List(LeftHandSideExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LeftHandSideExpression_0_1.applyOrElse(i, (_: Int) => _LeftHandSideExpression(pYield, pAwait).head)
        s += ClassHeritage0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ClassHeritage(pYield, pAwait).depth
      val sample = randomSampler.ClassHeritage(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ClassBody(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassBody] = {
    visited = ScalaSet()
    _ClassBody(pYield, pAwait)
  }
  private def _ClassBody(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassBody] = {
    if (!visited.contains("ClassBody", List(pYield, pAwait))) {
      visited += (("ClassBody", List(pYield, pAwait)))
      var s = ScalaSet[ClassBody]()
      val ClassElementList_0_0 = _ClassElementList(pYield, pAwait).toList
      val max0 = List(ClassElementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ClassElementList_0_0.applyOrElse(i, (_: Int) => _ClassElementList(pYield, pAwait).head)
        s += ClassBody0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ClassBody(pYield, pAwait).depth
      val sample = randomSampler.ClassBody(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ClassElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassElementList] = {
    visited = ScalaSet()
    _ClassElementList(pYield, pAwait)
  }
  private def _ClassElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassElementList] = {
    if (!visited.contains("ClassElementList", List(pYield, pAwait))) {
      visited += (("ClassElementList", List(pYield, pAwait)))
      var s = ScalaSet[ClassElementList]()
      val ClassElement_0_0 = _ClassElement(pYield, pAwait).toList
      val max0 = List(ClassElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ClassElement_0_0.applyOrElse(i, (_: Int) => _ClassElement(pYield, pAwait).head)
        s += ClassElementList0(arg0, List(pYield, pAwait))
      }
      val ClassElementList_1_0 = _ClassElementList(pYield, pAwait).toList
      val ClassElement_1_1 = _ClassElement(pYield, pAwait).toList
      val max1 = List(ClassElementList_1_0, ClassElement_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ClassElementList_1_0.applyOrElse(i, (_: Int) => _ClassElementList(pYield, pAwait).head)
        val arg1 = ClassElement_1_1.applyOrElse(i, (_: Int) => _ClassElement(pYield, pAwait).head)
        s += ClassElementList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val d = counter.ClassElementList(pYield, pAwait).depth
      val sample = randomSampler.ClassElementList(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def ClassElement(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassElement] = {
    visited = ScalaSet()
    _ClassElement(pYield, pAwait)
  }
  private def _ClassElement(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassElement] = {
    if (!visited.contains("ClassElement", List(pYield, pAwait))) {
      visited += (("ClassElement", List(pYield, pAwait)))
      var s = ScalaSet[ClassElement]()
      val MethodDefinition_0_0 = _MethodDefinition(pYield, pAwait).toList
      val max0 = List(MethodDefinition_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MethodDefinition_0_0.applyOrElse(i, (_: Int) => _MethodDefinition(pYield, pAwait).head)
        s += ClassElement0(arg0, List(pYield, pAwait))
      }
      val MethodDefinition_1_1 = _MethodDefinition(pYield, pAwait).toList
      val max1 = List(MethodDefinition_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = MethodDefinition_1_1.applyOrElse(i, (_: Int) => _MethodDefinition(pYield, pAwait).head)
        s += ClassElement1(arg0, List(pYield, pAwait))
      }
      s += ClassElement2(List(pYield, pAwait))
      s
    } else {
      val d = counter.ClassElement(pYield, pAwait).depth
      val sample = randomSampler.ClassElement(d, pYield, pAwait)
      ScalaSet(sample)
    }
  }
  def Script(): ScalaSet[Script] = {
    visited = ScalaSet()
    _Script()
  }
  private def _Script(): ScalaSet[Script] = {
    if (!visited.contains("Script", List())) {
      visited += (("Script", List()))
      var s = ScalaSet[Script]()
      val ScriptBody_0_0 = _ScriptBody().toList
      val max0 = List(ScriptBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ScriptBody_0_0.applyOrElse(i, (_: Int) => _ScriptBody().head)
        s += Script0(Some(arg0), List())
        s += Script0(None, List())
      }
      s
    } else {
      val d = counter.Script().depth
      val sample = randomSampler.Script(d)
      ScalaSet(sample)
    }
  }
  def ScriptBody(): ScalaSet[ScriptBody] = {
    visited = ScalaSet()
    _ScriptBody()
  }
  private def _ScriptBody(): ScalaSet[ScriptBody] = {
    if (!visited.contains("ScriptBody", List())) {
      visited += (("ScriptBody", List()))
      var s = ScalaSet[ScriptBody]()
      val StatementList_0_0 = _StatementList(false, false, false).toList
      val max0 = List(StatementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_0.applyOrElse(i, (_: Int) => _StatementList(false, false, false).head)
        s += ScriptBody0(arg0, List())
      }
      s
    } else {
      val d = counter.ScriptBody().depth
      val sample = randomSampler.ScriptBody(d)
      ScalaSet(sample)
    }
  }
  def ExportSpecifier(): ScalaSet[ExportSpecifier] = {
    visited = ScalaSet()
    _ExportSpecifier()
  }
  private def _ExportSpecifier(): ScalaSet[ExportSpecifier] = {
    if (!visited.contains("ExportSpecifier", List())) {
      visited += (("ExportSpecifier", List()))
      var s = ScalaSet[ExportSpecifier]()
      val IdentifierName_0_0 = _IdentifierName().toList
      val max0 = List(IdentifierName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierName_0_0.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += ExportSpecifier0(arg0, List())
      }
      val IdentifierName_1_0 = _IdentifierName().toList
      val IdentifierName_1_2 = _IdentifierName().toList
      val max1 = List(IdentifierName_1_0, IdentifierName_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = IdentifierName_1_0.applyOrElse(i, (_: Int) => _IdentifierName().head)
        val arg1 = IdentifierName_1_2.applyOrElse(i, (_: Int) => _IdentifierName().head)
        s += ExportSpecifier1(arg0, arg1, List())
      }
      s
    } else {
      val d = counter.ExportSpecifier().depth
      val sample = randomSampler.ExportSpecifier(d)
      ScalaSet(sample)
    }
  }
}
