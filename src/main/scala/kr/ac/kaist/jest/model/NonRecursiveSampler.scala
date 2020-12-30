package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.Lexical
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.model.{ Parser => JSParser }
import kr.ac.kaist.jest.util.Useful._
import scala.collection.immutable.{ Set => ScalaSet }

class NonRecursiveSampler {
  var visited: ScalaSet[(String, List[Boolean])] = ScalaSet()

  private def IdentifierName(): ScalaSet[Lexical] = ScalaSet(Lexical("IdentifierName", MinSampler.IdentifierName()))
  private def NullLiteral(): ScalaSet[Lexical] = ScalaSet(Lexical("NullLiteral", MinSampler.NullLiteral()))
  private def BooleanLiteral(): ScalaSet[Lexical] = ScalaSet(Lexical("BooleanLiteral", MinSampler.BooleanLiteral()))
  private def NumericLiteral(): ScalaSet[Lexical] = ScalaSet(Lexical("NumericLiteral", MinSampler.NumericLiteral()))
  private def StringLiteral(): ScalaSet[Lexical] = ScalaSet(Lexical("StringLiteral", MinSampler.StringLiteral()))
  private def NoSubstitutionTemplate(): ScalaSet[Lexical] = ScalaSet(Lexical("NoSubstitutionTemplate", MinSampler.NoSubstitutionTemplate()))
  private def TemplateHead(): ScalaSet[Lexical] = ScalaSet(Lexical("TemplateHead", MinSampler.TemplateHead()))
  private def TemplateMiddle(): ScalaSet[Lexical] = ScalaSet(Lexical("TemplateMiddle", MinSampler.TemplateMiddle()))
  private def TemplateTail(): ScalaSet[Lexical] = ScalaSet(Lexical("TemplateTail", MinSampler.TemplateTail()))
  def IdentifierReference(pYield: Boolean, pAwait: Boolean): ScalaSet[IdentifierReference] = {
    if (!visited.contains("IdentifierReference", List(pYield, pAwait))) {
      visited += (("IdentifierReference", List(pYield, pAwait)))
      var s = ScalaSet[IdentifierReference]()
      val Identifier_0_0 = Identifier().toList
      val max0 = List(Identifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Identifier_0_0.applyOrElse(i, (_: Int) => Identifier().head)
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
      val str = MinSampler.IdentifierReference(pYield, pAwait)
      val sample = JSParser.parse(JSParser.IdentifierReference(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingIdentifier(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingIdentifier] = {
    if (!visited.contains("BindingIdentifier", List(pYield, pAwait))) {
      visited += (("BindingIdentifier", List(pYield, pAwait)))
      var s = ScalaSet[BindingIdentifier]()
      val Identifier_0_0 = Identifier().toList
      val max0 = List(Identifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Identifier_0_0.applyOrElse(i, (_: Int) => Identifier().head)
        s += BindingIdentifier0(arg0, List(pYield, pAwait))
      }
      s += BindingIdentifier1(List(pYield, pAwait))
      s += BindingIdentifier2(List(pYield, pAwait))
      s
    } else {
      val str = MinSampler.BindingIdentifier(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingIdentifier(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LabelIdentifier(pYield: Boolean, pAwait: Boolean): ScalaSet[LabelIdentifier] = {
    if (!visited.contains("LabelIdentifier", List(pYield, pAwait))) {
      visited += (("LabelIdentifier", List(pYield, pAwait)))
      var s = ScalaSet[LabelIdentifier]()
      val Identifier_0_0 = Identifier().toList
      val max0 = List(Identifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Identifier_0_0.applyOrElse(i, (_: Int) => Identifier().head)
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
      val str = MinSampler.LabelIdentifier(pYield, pAwait)
      val sample = JSParser.parse(JSParser.LabelIdentifier(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Identifier(): ScalaSet[Identifier] = {
    if (!visited.contains("Identifier", List())) {
      visited += (("Identifier", List()))
      var s = ScalaSet[Identifier]()
      val IdentifierName_0_0 = IdentifierName().toList
      val max0 = List(IdentifierName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierName_0_0.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += Identifier0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.Identifier()
      val sample = JSParser.parse(JSParser.Identifier(List()), str).get
      ScalaSet(sample)
    }
  }
  def PrimaryExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[PrimaryExpression] = {
    if (!visited.contains("PrimaryExpression", List(pYield, pAwait))) {
      visited += (("PrimaryExpression", List(pYield, pAwait)))
      var s = ScalaSet[PrimaryExpression]()
      s += PrimaryExpression0(List(pYield, pAwait))
      val IdentifierReference_1_0 = IdentifierReference(pYield, pAwait).toList
      val max1 = List(IdentifierReference_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = IdentifierReference_1_0.applyOrElse(i, (_: Int) => IdentifierReference(pYield, pAwait).head)
        s += PrimaryExpression1(arg0, List(pYield, pAwait))
      }
      val Literal_2_0 = Literal().toList
      val max2 = List(Literal_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = Literal_2_0.applyOrElse(i, (_: Int) => Literal().head)
        s += PrimaryExpression2(arg0, List(pYield, pAwait))
      }
      val ArrayLiteral_3_0 = ArrayLiteral(pYield, pAwait).toList
      val max3 = List(ArrayLiteral_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ArrayLiteral_3_0.applyOrElse(i, (_: Int) => ArrayLiteral(pYield, pAwait).head)
        s += PrimaryExpression3(arg0, List(pYield, pAwait))
      }
      val ObjectLiteral_4_0 = ObjectLiteral(pYield, pAwait).toList
      val max4 = List(ObjectLiteral_4_0).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = ObjectLiteral_4_0.applyOrElse(i, (_: Int) => ObjectLiteral(pYield, pAwait).head)
        s += PrimaryExpression4(arg0, List(pYield, pAwait))
      }
      val FunctionExpression_5_0 = FunctionExpression().toList
      val max5 = List(FunctionExpression_5_0).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = FunctionExpression_5_0.applyOrElse(i, (_: Int) => FunctionExpression().head)
        s += PrimaryExpression5(arg0, List(pYield, pAwait))
      }
      val ClassExpression_6_0 = ClassExpression(pYield, pAwait).toList
      val max6 = List(ClassExpression_6_0).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = ClassExpression_6_0.applyOrElse(i, (_: Int) => ClassExpression(pYield, pAwait).head)
        s += PrimaryExpression6(arg0, List(pYield, pAwait))
      }
      val GeneratorExpression_7_0 = GeneratorExpression().toList
      val max7 = List(GeneratorExpression_7_0).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = GeneratorExpression_7_0.applyOrElse(i, (_: Int) => GeneratorExpression().head)
        s += PrimaryExpression7(arg0, List(pYield, pAwait))
      }
      val AsyncFunctionExpression_8_0 = AsyncFunctionExpression().toList
      val max8 = List(AsyncFunctionExpression_8_0).map(_.length).max
      for (i <- (0 until max8)) {
        val arg0 = AsyncFunctionExpression_8_0.applyOrElse(i, (_: Int) => AsyncFunctionExpression().head)
        s += PrimaryExpression8(arg0, List(pYield, pAwait))
      }
      val AsyncGeneratorExpression_9_0 = AsyncGeneratorExpression().toList
      val max9 = List(AsyncGeneratorExpression_9_0).map(_.length).max
      for (i <- (0 until max9)) {
        val arg0 = AsyncGeneratorExpression_9_0.applyOrElse(i, (_: Int) => AsyncGeneratorExpression().head)
        s += PrimaryExpression9(arg0, List(pYield, pAwait))
      }
      val TemplateLiteral_11_0 = TemplateLiteral(pYield, pAwait, false).toList
      val max11 = List(TemplateLiteral_11_0).map(_.length).max
      for (i <- (0 until max11)) {
        val arg0 = TemplateLiteral_11_0.applyOrElse(i, (_: Int) => TemplateLiteral(pYield, pAwait, false).head)
        s += PrimaryExpression11(arg0, List(pYield, pAwait))
      }
      val CoverParenthesizedExpressionAndArrowParameterList_12_0 = CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).toList
      val max12 = List(CoverParenthesizedExpressionAndArrowParameterList_12_0).map(_.length).max
      for (i <- (0 until max12)) {
        val arg0 = CoverParenthesizedExpressionAndArrowParameterList_12_0.applyOrElse(i, (_: Int) => CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).head)
        s += PrimaryExpression12(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.PrimaryExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.PrimaryExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverParenthesizedExpressionAndArrowParameterList] = {
    if (!visited.contains("CoverParenthesizedExpressionAndArrowParameterList", List(pYield, pAwait))) {
      visited += (("CoverParenthesizedExpressionAndArrowParameterList", List(pYield, pAwait)))
      var s = ScalaSet[CoverParenthesizedExpressionAndArrowParameterList]()
      val Expression_0_1 = Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList0(arg0, List(pYield, pAwait))
      }
      val Expression_1_1 = Expression(true, pYield, pAwait).toList
      val max1 = List(Expression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList1(arg0, List(pYield, pAwait))
      }
      s += CoverParenthesizedExpressionAndArrowParameterList2(List(pYield, pAwait))
      val BindingIdentifier_3_2 = BindingIdentifier(pYield, pAwait).toList
      val max3 = List(BindingIdentifier_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = BindingIdentifier_3_2.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList3(arg0, List(pYield, pAwait))
      }
      val BindingPattern_4_2 = BindingPattern(pYield, pAwait).toList
      val max4 = List(BindingPattern_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = BindingPattern_4_2.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList4(arg0, List(pYield, pAwait))
      }
      val Expression_5_1 = Expression(true, pYield, pAwait).toList
      val BindingIdentifier_5_4 = BindingIdentifier(pYield, pAwait).toList
      val max5 = List(Expression_5_1, BindingIdentifier_5_4).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = Expression_5_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = BindingIdentifier_5_4.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList5(arg0, arg1, List(pYield, pAwait))
      }
      val Expression_6_1 = Expression(true, pYield, pAwait).toList
      val BindingPattern_6_4 = BindingPattern(pYield, pAwait).toList
      val max6 = List(Expression_6_1, BindingPattern_6_4).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = Expression_6_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = BindingPattern_6_4.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        s += CoverParenthesizedExpressionAndArrowParameterList6(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.CoverParenthesizedExpressionAndArrowParameterList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ParenthesizedExpression] = {
    if (!visited.contains("ParenthesizedExpression", List(pYield, pAwait))) {
      visited += (("ParenthesizedExpression", List(pYield, pAwait)))
      var s = ScalaSet[ParenthesizedExpression]()
      val Expression_0_1 = Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += ParenthesizedExpression0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ParenthesizedExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ParenthesizedExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Literal(): ScalaSet[Literal] = {
    if (!visited.contains("Literal", List())) {
      visited += (("Literal", List()))
      var s = ScalaSet[Literal]()
      val NullLiteral_0_0 = NullLiteral().toList
      val max0 = List(NullLiteral_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NullLiteral_0_0.applyOrElse(i, (_: Int) => NullLiteral().head)
        s += Literal0(arg0, List())
      }
      val BooleanLiteral_1_0 = BooleanLiteral().toList
      val max1 = List(BooleanLiteral_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BooleanLiteral_1_0.applyOrElse(i, (_: Int) => BooleanLiteral().head)
        s += Literal1(arg0, List())
      }
      val NumericLiteral_2_0 = NumericLiteral().toList
      val max2 = List(NumericLiteral_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = NumericLiteral_2_0.applyOrElse(i, (_: Int) => NumericLiteral().head)
        s += Literal2(arg0, List())
      }
      val StringLiteral_3_0 = StringLiteral().toList
      val max3 = List(StringLiteral_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = StringLiteral_3_0.applyOrElse(i, (_: Int) => StringLiteral().head)
        s += Literal3(arg0, List())
      }
      s
    } else {
      val str = MinSampler.Literal()
      val sample = JSParser.parse(JSParser.Literal(List()), str).get
      ScalaSet(sample)
    }
  }
  def ArrayLiteral(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayLiteral] = {
    if (!visited.contains("ArrayLiteral", List(pYield, pAwait))) {
      visited += (("ArrayLiteral", List(pYield, pAwait)))
      var s = ScalaSet[ArrayLiteral]()
      val Elision_0_1 = Elision().toList
      val max0 = List(Elision_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_1.applyOrElse(i, (_: Int) => Elision().head)
        s += ArrayLiteral0(Some(arg0), List(pYield, pAwait))
        s += ArrayLiteral0(None, List(pYield, pAwait))
      }
      val ElementList_1_1 = ElementList(pYield, pAwait).toList
      val max1 = List(ElementList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ElementList_1_1.applyOrElse(i, (_: Int) => ElementList(pYield, pAwait).head)
        s += ArrayLiteral1(arg0, List(pYield, pAwait))
      }
      val ElementList_2_1 = ElementList(pYield, pAwait).toList
      val Elision_2_3 = Elision().toList
      val max2 = List(ElementList_2_1, Elision_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ElementList_2_1.applyOrElse(i, (_: Int) => ElementList(pYield, pAwait).head)
        val arg1 = Elision_2_3.applyOrElse(i, (_: Int) => Elision().head)
        s += ArrayLiteral2(arg0, Some(arg1), List(pYield, pAwait))
        s += ArrayLiteral2(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArrayLiteral(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArrayLiteral(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[ElementList] = {
    if (!visited.contains("ElementList", List(pYield, pAwait))) {
      visited += (("ElementList", List(pYield, pAwait)))
      var s = ScalaSet[ElementList]()
      val Elision_0_0 = Elision().toList
      val AssignmentExpression_0_1 = AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(Elision_0_0, AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_0.applyOrElse(i, (_: Int) => Elision().head)
        val arg1 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ElementList0(Some(arg0), arg1, List(pYield, pAwait))
        s += ElementList0(None, arg1, List(pYield, pAwait))
      }
      val Elision_1_0 = Elision().toList
      val SpreadElement_1_1 = SpreadElement(pYield, pAwait).toList
      val max1 = List(Elision_1_0, SpreadElement_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Elision_1_0.applyOrElse(i, (_: Int) => Elision().head)
        val arg1 = SpreadElement_1_1.applyOrElse(i, (_: Int) => SpreadElement(pYield, pAwait).head)
        s += ElementList1(Some(arg0), arg1, List(pYield, pAwait))
        s += ElementList1(None, arg1, List(pYield, pAwait))
      }
      val ElementList_2_0 = ElementList(pYield, pAwait).toList
      val Elision_2_2 = Elision().toList
      val AssignmentExpression_2_3 = AssignmentExpression(true, pYield, pAwait).toList
      val max2 = List(ElementList_2_0, Elision_2_2, AssignmentExpression_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ElementList_2_0.applyOrElse(i, (_: Int) => ElementList(pYield, pAwait).head)
        val arg1 = Elision_2_2.applyOrElse(i, (_: Int) => Elision().head)
        val arg2 = AssignmentExpression_2_3.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ElementList2(arg0, Some(arg1), arg2, List(pYield, pAwait))
        s += ElementList2(arg0, None, arg2, List(pYield, pAwait))
      }
      val ElementList_3_0 = ElementList(pYield, pAwait).toList
      val Elision_3_2 = Elision().toList
      val SpreadElement_3_3 = SpreadElement(pYield, pAwait).toList
      val max3 = List(ElementList_3_0, Elision_3_2, SpreadElement_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ElementList_3_0.applyOrElse(i, (_: Int) => ElementList(pYield, pAwait).head)
        val arg1 = Elision_3_2.applyOrElse(i, (_: Int) => Elision().head)
        val arg2 = SpreadElement_3_3.applyOrElse(i, (_: Int) => SpreadElement(pYield, pAwait).head)
        s += ElementList3(arg0, Some(arg1), arg2, List(pYield, pAwait))
        s += ElementList3(arg0, None, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ElementList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ElementList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Elision(): ScalaSet[Elision] = {
    if (!visited.contains("Elision", List())) {
      visited += (("Elision", List()))
      var s = ScalaSet[Elision]()
      s += Elision0(List())
      val Elision_1_0 = Elision().toList
      val max1 = List(Elision_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Elision_1_0.applyOrElse(i, (_: Int) => Elision().head)
        s += Elision1(arg0, List())
      }
      s
    } else {
      val str = MinSampler.Elision()
      val sample = JSParser.parse(JSParser.Elision(List()), str).get
      ScalaSet(sample)
    }
  }
  def SpreadElement(pYield: Boolean, pAwait: Boolean): ScalaSet[SpreadElement] = {
    if (!visited.contains("SpreadElement", List(pYield, pAwait))) {
      visited += (("SpreadElement", List(pYield, pAwait)))
      var s = ScalaSet[SpreadElement]()
      val AssignmentExpression_0_1 = AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += SpreadElement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.SpreadElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.SpreadElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ObjectLiteral(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectLiteral] = {
    if (!visited.contains("ObjectLiteral", List(pYield, pAwait))) {
      visited += (("ObjectLiteral", List(pYield, pAwait)))
      var s = ScalaSet[ObjectLiteral]()
      s += ObjectLiteral0(List(pYield, pAwait))
      val PropertyDefinitionList_1_1 = PropertyDefinitionList(pYield, pAwait).toList
      val max1 = List(PropertyDefinitionList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyDefinitionList_1_1.applyOrElse(i, (_: Int) => PropertyDefinitionList(pYield, pAwait).head)
        s += ObjectLiteral1(arg0, List(pYield, pAwait))
      }
      val PropertyDefinitionList_2_1 = PropertyDefinitionList(pYield, pAwait).toList
      val max2 = List(PropertyDefinitionList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = PropertyDefinitionList_2_1.applyOrElse(i, (_: Int) => PropertyDefinitionList(pYield, pAwait).head)
        s += ObjectLiteral2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ObjectLiteral(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ObjectLiteral(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyDefinitionList] = {
    if (!visited.contains("PropertyDefinitionList", List(pYield, pAwait))) {
      visited += (("PropertyDefinitionList", List(pYield, pAwait)))
      var s = ScalaSet[PropertyDefinitionList]()
      val PropertyDefinition_0_0 = PropertyDefinition(pYield, pAwait).toList
      val max0 = List(PropertyDefinition_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyDefinition_0_0.applyOrElse(i, (_: Int) => PropertyDefinition(pYield, pAwait).head)
        s += PropertyDefinitionList0(arg0, List(pYield, pAwait))
      }
      val PropertyDefinitionList_1_0 = PropertyDefinitionList(pYield, pAwait).toList
      val PropertyDefinition_1_2 = PropertyDefinition(pYield, pAwait).toList
      val max1 = List(PropertyDefinitionList_1_0, PropertyDefinition_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyDefinitionList_1_0.applyOrElse(i, (_: Int) => PropertyDefinitionList(pYield, pAwait).head)
        val arg1 = PropertyDefinition_1_2.applyOrElse(i, (_: Int) => PropertyDefinition(pYield, pAwait).head)
        s += PropertyDefinitionList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.PropertyDefinitionList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.PropertyDefinitionList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def PropertyDefinition(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyDefinition] = {
    if (!visited.contains("PropertyDefinition", List(pYield, pAwait))) {
      visited += (("PropertyDefinition", List(pYield, pAwait)))
      var s = ScalaSet[PropertyDefinition]()
      val IdentifierReference_0_0 = IdentifierReference(pYield, pAwait).toList
      val max0 = List(IdentifierReference_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierReference_0_0.applyOrElse(i, (_: Int) => IdentifierReference(pYield, pAwait).head)
        s += PropertyDefinition0(arg0, List(pYield, pAwait))
      }
      val CoverInitializedName_1_0 = CoverInitializedName(pYield, pAwait).toList
      val max1 = List(CoverInitializedName_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoverInitializedName_1_0.applyOrElse(i, (_: Int) => CoverInitializedName(pYield, pAwait).head)
        s += PropertyDefinition1(arg0, List(pYield, pAwait))
      }
      val PropertyName_2_0 = PropertyName(pYield, pAwait).toList
      val AssignmentExpression_2_2 = AssignmentExpression(true, pYield, pAwait).toList
      val max2 = List(PropertyName_2_0, AssignmentExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = PropertyName_2_0.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = AssignmentExpression_2_2.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += PropertyDefinition2(arg0, arg1, List(pYield, pAwait))
      }
      val MethodDefinition_3_0 = MethodDefinition(pYield, pAwait).toList
      val max3 = List(MethodDefinition_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = MethodDefinition_3_0.applyOrElse(i, (_: Int) => MethodDefinition(pYield, pAwait).head)
        s += PropertyDefinition3(arg0, List(pYield, pAwait))
      }
      val AssignmentExpression_4_1 = AssignmentExpression(true, pYield, pAwait).toList
      val max4 = List(AssignmentExpression_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = AssignmentExpression_4_1.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += PropertyDefinition4(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.PropertyDefinition(pYield, pAwait)
      val sample = JSParser.parse(JSParser.PropertyDefinition(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def PropertyName(pYield: Boolean, pAwait: Boolean): ScalaSet[PropertyName] = {
    if (!visited.contains("PropertyName", List(pYield, pAwait))) {
      visited += (("PropertyName", List(pYield, pAwait)))
      var s = ScalaSet[PropertyName]()
      val LiteralPropertyName_0_0 = LiteralPropertyName().toList
      val max0 = List(LiteralPropertyName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LiteralPropertyName_0_0.applyOrElse(i, (_: Int) => LiteralPropertyName().head)
        s += PropertyName0(arg0, List(pYield, pAwait))
      }
      val ComputedPropertyName_1_0 = ComputedPropertyName(pYield, pAwait).toList
      val max1 = List(ComputedPropertyName_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ComputedPropertyName_1_0.applyOrElse(i, (_: Int) => ComputedPropertyName(pYield, pAwait).head)
        s += PropertyName1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.PropertyName(pYield, pAwait)
      val sample = JSParser.parse(JSParser.PropertyName(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LiteralPropertyName(): ScalaSet[LiteralPropertyName] = {
    if (!visited.contains("LiteralPropertyName", List())) {
      visited += (("LiteralPropertyName", List()))
      var s = ScalaSet[LiteralPropertyName]()
      val IdentifierName_0_0 = IdentifierName().toList
      val max0 = List(IdentifierName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierName_0_0.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += LiteralPropertyName0(arg0, List())
      }
      val StringLiteral_1_0 = StringLiteral().toList
      val max1 = List(StringLiteral_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = StringLiteral_1_0.applyOrElse(i, (_: Int) => StringLiteral().head)
        s += LiteralPropertyName1(arg0, List())
      }
      val NumericLiteral_2_0 = NumericLiteral().toList
      val max2 = List(NumericLiteral_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = NumericLiteral_2_0.applyOrElse(i, (_: Int) => NumericLiteral().head)
        s += LiteralPropertyName2(arg0, List())
      }
      s
    } else {
      val str = MinSampler.LiteralPropertyName()
      val sample = JSParser.parse(JSParser.LiteralPropertyName(List()), str).get
      ScalaSet(sample)
    }
  }
  def ComputedPropertyName(pYield: Boolean, pAwait: Boolean): ScalaSet[ComputedPropertyName] = {
    if (!visited.contains("ComputedPropertyName", List(pYield, pAwait))) {
      visited += (("ComputedPropertyName", List(pYield, pAwait)))
      var s = ScalaSet[ComputedPropertyName]()
      val AssignmentExpression_0_1 = AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ComputedPropertyName0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ComputedPropertyName(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ComputedPropertyName(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def CoverInitializedName(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverInitializedName] = {
    if (!visited.contains("CoverInitializedName", List(pYield, pAwait))) {
      visited += (("CoverInitializedName", List(pYield, pAwait)))
      var s = ScalaSet[CoverInitializedName]()
      val IdentifierReference_0_0 = IdentifierReference(pYield, pAwait).toList
      val Initializer_0_1 = Initializer(true, pYield, pAwait).toList
      val max0 = List(IdentifierReference_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierReference_0_0.applyOrElse(i, (_: Int) => IdentifierReference(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => Initializer(true, pYield, pAwait).head)
        s += CoverInitializedName0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CoverInitializedName(pYield, pAwait)
      val sample = JSParser.parse(JSParser.CoverInitializedName(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[Initializer] = {
    if (!visited.contains("Initializer", List(pIn, pYield, pAwait))) {
      visited += (("Initializer", List(pIn, pYield, pAwait)))
      var s = ScalaSet[Initializer]()
      val AssignmentExpression_0_1 = AssignmentExpression(pIn, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_1.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, pYield, pAwait).head)
        s += Initializer0(arg0, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.Initializer(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.Initializer(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateLiteral] = {
    if (!visited.contains("TemplateLiteral", List(pYield, pAwait, pTagged))) {
      visited += (("TemplateLiteral", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[TemplateLiteral]()
      val NoSubstitutionTemplate_0_0 = NoSubstitutionTemplate().toList
      val max0 = List(NoSubstitutionTemplate_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NoSubstitutionTemplate_0_0.applyOrElse(i, (_: Int) => NoSubstitutionTemplate().head)
        s += TemplateLiteral0(arg0, List(pYield, pAwait, pTagged))
      }
      val SubstitutionTemplate_1_0 = SubstitutionTemplate(pYield, pAwait, pTagged).toList
      val max1 = List(SubstitutionTemplate_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = SubstitutionTemplate_1_0.applyOrElse(i, (_: Int) => SubstitutionTemplate(pYield, pAwait, pTagged).head)
        s += TemplateLiteral1(arg0, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val str = MinSampler.TemplateLiteral(pYield, pAwait, pTagged)
      val sample = JSParser.parse(JSParser.TemplateLiteral(List(pYield, pAwait, pTagged)), str).get
      ScalaSet(sample)
    }
  }
  def SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[SubstitutionTemplate] = {
    if (!visited.contains("SubstitutionTemplate", List(pYield, pAwait, pTagged))) {
      visited += (("SubstitutionTemplate", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[SubstitutionTemplate]()
      val TemplateHead_0_0 = TemplateHead().toList
      val Expression_0_1 = Expression(true, pYield, pAwait).toList
      val TemplateSpans_0_2 = TemplateSpans(pYield, pAwait, pTagged).toList
      val max0 = List(TemplateHead_0_0, Expression_0_1, TemplateSpans_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = TemplateHead_0_0.applyOrElse(i, (_: Int) => TemplateHead().head)
        val arg1 = Expression_0_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = TemplateSpans_0_2.applyOrElse(i, (_: Int) => TemplateSpans(pYield, pAwait, pTagged).head)
        s += SubstitutionTemplate0(arg0, arg1, arg2, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val str = MinSampler.SubstitutionTemplate(pYield, pAwait, pTagged)
      val sample = JSParser.parse(JSParser.SubstitutionTemplate(List(pYield, pAwait, pTagged)), str).get
      ScalaSet(sample)
    }
  }
  def TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateSpans] = {
    if (!visited.contains("TemplateSpans", List(pYield, pAwait, pTagged))) {
      visited += (("TemplateSpans", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[TemplateSpans]()
      val TemplateTail_0_0 = TemplateTail().toList
      val max0 = List(TemplateTail_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = TemplateTail_0_0.applyOrElse(i, (_: Int) => TemplateTail().head)
        s += TemplateSpans0(arg0, List(pYield, pAwait, pTagged))
      }
      val TemplateMiddleList_1_0 = TemplateMiddleList(pYield, pAwait, pTagged).toList
      val TemplateTail_1_1 = TemplateTail().toList
      val max1 = List(TemplateMiddleList_1_0, TemplateTail_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = TemplateMiddleList_1_0.applyOrElse(i, (_: Int) => TemplateMiddleList(pYield, pAwait, pTagged).head)
        val arg1 = TemplateTail_1_1.applyOrElse(i, (_: Int) => TemplateTail().head)
        s += TemplateSpans1(arg0, arg1, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val str = MinSampler.TemplateSpans(pYield, pAwait, pTagged)
      val sample = JSParser.parse(JSParser.TemplateSpans(List(pYield, pAwait, pTagged)), str).get
      ScalaSet(sample)
    }
  }
  def TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): ScalaSet[TemplateMiddleList] = {
    if (!visited.contains("TemplateMiddleList", List(pYield, pAwait, pTagged))) {
      visited += (("TemplateMiddleList", List(pYield, pAwait, pTagged)))
      var s = ScalaSet[TemplateMiddleList]()
      val TemplateMiddle_0_0 = TemplateMiddle().toList
      val Expression_0_1 = Expression(true, pYield, pAwait).toList
      val max0 = List(TemplateMiddle_0_0, Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = TemplateMiddle_0_0.applyOrElse(i, (_: Int) => TemplateMiddle().head)
        val arg1 = Expression_0_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += TemplateMiddleList0(arg0, arg1, List(pYield, pAwait, pTagged))
      }
      val TemplateMiddleList_1_0 = TemplateMiddleList(pYield, pAwait, pTagged).toList
      val TemplateMiddle_1_1 = TemplateMiddle().toList
      val Expression_1_2 = Expression(true, pYield, pAwait).toList
      val max1 = List(TemplateMiddleList_1_0, TemplateMiddle_1_1, Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = TemplateMiddleList_1_0.applyOrElse(i, (_: Int) => TemplateMiddleList(pYield, pAwait, pTagged).head)
        val arg1 = TemplateMiddle_1_1.applyOrElse(i, (_: Int) => TemplateMiddle().head)
        val arg2 = Expression_1_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += TemplateMiddleList1(arg0, arg1, arg2, List(pYield, pAwait, pTagged))
      }
      s
    } else {
      val str = MinSampler.TemplateMiddleList(pYield, pAwait, pTagged)
      val sample = JSParser.parse(JSParser.TemplateMiddleList(List(pYield, pAwait, pTagged)), str).get
      ScalaSet(sample)
    }
  }
  def MemberExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[MemberExpression] = {
    if (!visited.contains("MemberExpression", List(pYield, pAwait))) {
      visited += (("MemberExpression", List(pYield, pAwait)))
      var s = ScalaSet[MemberExpression]()
      val PrimaryExpression_0_0 = PrimaryExpression(pYield, pAwait).toList
      val max0 = List(PrimaryExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PrimaryExpression_0_0.applyOrElse(i, (_: Int) => PrimaryExpression(pYield, pAwait).head)
        s += MemberExpression0(arg0, List(pYield, pAwait))
      }
      val MemberExpression_1_0 = MemberExpression(pYield, pAwait).toList
      val Expression_1_2 = Expression(true, pYield, pAwait).toList
      val max1 = List(MemberExpression_1_0, Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = MemberExpression_1_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = Expression_1_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += MemberExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val MemberExpression_2_0 = MemberExpression(pYield, pAwait).toList
      val IdentifierName_2_2 = IdentifierName().toList
      val max2 = List(MemberExpression_2_0, IdentifierName_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = MemberExpression_2_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = IdentifierName_2_2.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += MemberExpression2(arg0, arg1, List(pYield, pAwait))
      }
      val MemberExpression_3_0 = MemberExpression(pYield, pAwait).toList
      val TemplateLiteral_3_1 = TemplateLiteral(pYield, pAwait, true).toList
      val max3 = List(MemberExpression_3_0, TemplateLiteral_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = MemberExpression_3_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = TemplateLiteral_3_1.applyOrElse(i, (_: Int) => TemplateLiteral(pYield, pAwait, true).head)
        s += MemberExpression3(arg0, arg1, List(pYield, pAwait))
      }
      val SuperProperty_4_0 = SuperProperty(pYield, pAwait).toList
      val max4 = List(SuperProperty_4_0).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = SuperProperty_4_0.applyOrElse(i, (_: Int) => SuperProperty(pYield, pAwait).head)
        s += MemberExpression4(arg0, List(pYield, pAwait))
      }
      val MetaProperty_5_0 = MetaProperty().toList
      val max5 = List(MetaProperty_5_0).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = MetaProperty_5_0.applyOrElse(i, (_: Int) => MetaProperty().head)
        s += MemberExpression5(arg0, List(pYield, pAwait))
      }
      val MemberExpression_6_1 = MemberExpression(pYield, pAwait).toList
      val Arguments_6_2 = Arguments(pYield, pAwait).toList
      val max6 = List(MemberExpression_6_1, Arguments_6_2).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = MemberExpression_6_1.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = Arguments_6_2.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += MemberExpression6(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.MemberExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.MemberExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def SuperProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[SuperProperty] = {
    if (!visited.contains("SuperProperty", List(pYield, pAwait))) {
      visited += (("SuperProperty", List(pYield, pAwait)))
      var s = ScalaSet[SuperProperty]()
      val Expression_0_2 = Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += SuperProperty0(arg0, List(pYield, pAwait))
      }
      val IdentifierName_1_2 = IdentifierName().toList
      val max1 = List(IdentifierName_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = IdentifierName_1_2.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += SuperProperty1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.SuperProperty(pYield, pAwait)
      val sample = JSParser.parse(JSParser.SuperProperty(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def MetaProperty(): ScalaSet[MetaProperty] = {
    if (!visited.contains("MetaProperty", List())) {
      visited += (("MetaProperty", List()))
      var s = ScalaSet[MetaProperty]()
      val NewTarget_0_0 = NewTarget().toList
      val max0 = List(NewTarget_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NewTarget_0_0.applyOrElse(i, (_: Int) => NewTarget().head)
        s += MetaProperty0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.MetaProperty()
      val sample = JSParser.parse(JSParser.MetaProperty(List()), str).get
      ScalaSet(sample)
    }
  }
  def NewTarget(): ScalaSet[NewTarget] = {
    if (!visited.contains("NewTarget", List())) {
      visited += (("NewTarget", List()))
      var s = ScalaSet[NewTarget]()
      s += NewTarget0(List())
      s
    } else {
      val str = MinSampler.NewTarget()
      val sample = JSParser.parse(JSParser.NewTarget(List()), str).get
      ScalaSet(sample)
    }
  }
  def NewExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[NewExpression] = {
    if (!visited.contains("NewExpression", List(pYield, pAwait))) {
      visited += (("NewExpression", List(pYield, pAwait)))
      var s = ScalaSet[NewExpression]()
      val MemberExpression_0_0 = MemberExpression(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        s += NewExpression0(arg0, List(pYield, pAwait))
      }
      val NewExpression_1_1 = NewExpression(pYield, pAwait).toList
      val max1 = List(NewExpression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = NewExpression_1_1.applyOrElse(i, (_: Int) => NewExpression(pYield, pAwait).head)
        s += NewExpression1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.NewExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.NewExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def CallExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[CallExpression] = {
    if (!visited.contains("CallExpression", List(pYield, pAwait))) {
      visited += (("CallExpression", List(pYield, pAwait)))
      var s = ScalaSet[CallExpression]()
      val CoverCallExpressionAndAsyncArrowHead_0_0 = CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).toList
      val max0 = List(CoverCallExpressionAndAsyncArrowHead_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CoverCallExpressionAndAsyncArrowHead_0_0.applyOrElse(i, (_: Int) => CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).head)
        s += CallExpression0(arg0, List(pYield, pAwait))
      }
      val SuperCall_1_0 = SuperCall(pYield, pAwait).toList
      val max1 = List(SuperCall_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = SuperCall_1_0.applyOrElse(i, (_: Int) => SuperCall(pYield, pAwait).head)
        s += CallExpression1(arg0, List(pYield, pAwait))
      }
      val CallExpression_3_0 = CallExpression(pYield, pAwait).toList
      val Arguments_3_1 = Arguments(pYield, pAwait).toList
      val max3 = List(CallExpression_3_0, Arguments_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = CallExpression_3_0.applyOrElse(i, (_: Int) => CallExpression(pYield, pAwait).head)
        val arg1 = Arguments_3_1.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += CallExpression3(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_4_0 = CallExpression(pYield, pAwait).toList
      val Expression_4_2 = Expression(true, pYield, pAwait).toList
      val max4 = List(CallExpression_4_0, Expression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = CallExpression_4_0.applyOrElse(i, (_: Int) => CallExpression(pYield, pAwait).head)
        val arg1 = Expression_4_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += CallExpression4(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_5_0 = CallExpression(pYield, pAwait).toList
      val IdentifierName_5_2 = IdentifierName().toList
      val max5 = List(CallExpression_5_0, IdentifierName_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = CallExpression_5_0.applyOrElse(i, (_: Int) => CallExpression(pYield, pAwait).head)
        val arg1 = IdentifierName_5_2.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += CallExpression5(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_6_0 = CallExpression(pYield, pAwait).toList
      val TemplateLiteral_6_1 = TemplateLiteral(pYield, pAwait, true).toList
      val max6 = List(CallExpression_6_0, TemplateLiteral_6_1).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = CallExpression_6_0.applyOrElse(i, (_: Int) => CallExpression(pYield, pAwait).head)
        val arg1 = TemplateLiteral_6_1.applyOrElse(i, (_: Int) => TemplateLiteral(pYield, pAwait, true).head)
        s += CallExpression6(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CallExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.CallExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def CallMemberExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[CallMemberExpression] = {
    if (!visited.contains("CallMemberExpression", List(pYield, pAwait))) {
      visited += (("CallMemberExpression", List(pYield, pAwait)))
      var s = ScalaSet[CallMemberExpression]()
      val MemberExpression_0_0 = MemberExpression(pYield, pAwait).toList
      val Arguments_0_1 = Arguments(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0, Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = Arguments_0_1.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += CallMemberExpression0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CallMemberExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.CallMemberExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def SuperCall(pYield: Boolean, pAwait: Boolean): ScalaSet[SuperCall] = {
    if (!visited.contains("SuperCall", List(pYield, pAwait))) {
      visited += (("SuperCall", List(pYield, pAwait)))
      var s = ScalaSet[SuperCall]()
      val Arguments_0_1 = Arguments(pYield, pAwait).toList
      val max0 = List(Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Arguments_0_1.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += SuperCall0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.SuperCall(pYield, pAwait)
      val sample = JSParser.parse(JSParser.SuperCall(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Arguments(pYield: Boolean, pAwait: Boolean): ScalaSet[Arguments] = {
    if (!visited.contains("Arguments", List(pYield, pAwait))) {
      visited += (("Arguments", List(pYield, pAwait)))
      var s = ScalaSet[Arguments]()
      s += Arguments0(List(pYield, pAwait))
      val ArgumentList_1_1 = ArgumentList(pYield, pAwait).toList
      val max1 = List(ArgumentList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ArgumentList_1_1.applyOrElse(i, (_: Int) => ArgumentList(pYield, pAwait).head)
        s += Arguments1(arg0, List(pYield, pAwait))
      }
      val ArgumentList_2_1 = ArgumentList(pYield, pAwait).toList
      val max2 = List(ArgumentList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ArgumentList_2_1.applyOrElse(i, (_: Int) => ArgumentList(pYield, pAwait).head)
        s += Arguments2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.Arguments(pYield, pAwait)
      val sample = JSParser.parse(JSParser.Arguments(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ArgumentList(pYield: Boolean, pAwait: Boolean): ScalaSet[ArgumentList] = {
    if (!visited.contains("ArgumentList", List(pYield, pAwait))) {
      visited += (("ArgumentList", List(pYield, pAwait)))
      var s = ScalaSet[ArgumentList]()
      val AssignmentExpression_0_0 = AssignmentExpression(true, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_0.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList0(arg0, List(pYield, pAwait))
      }
      val AssignmentExpression_1_1 = AssignmentExpression(true, pYield, pAwait).toList
      val max1 = List(AssignmentExpression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentExpression_1_1.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList1(arg0, List(pYield, pAwait))
      }
      val ArgumentList_2_0 = ArgumentList(pYield, pAwait).toList
      val AssignmentExpression_2_2 = AssignmentExpression(true, pYield, pAwait).toList
      val max2 = List(ArgumentList_2_0, AssignmentExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ArgumentList_2_0.applyOrElse(i, (_: Int) => ArgumentList(pYield, pAwait).head)
        val arg1 = AssignmentExpression_2_2.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList2(arg0, arg1, List(pYield, pAwait))
      }
      val ArgumentList_3_0 = ArgumentList(pYield, pAwait).toList
      val AssignmentExpression_3_3 = AssignmentExpression(true, pYield, pAwait).toList
      val max3 = List(ArgumentList_3_0, AssignmentExpression_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ArgumentList_3_0.applyOrElse(i, (_: Int) => ArgumentList(pYield, pAwait).head)
        val arg1 = AssignmentExpression_3_3.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        s += ArgumentList3(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArgumentList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArgumentList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def OptionalExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[OptionalExpression] = {
    if (!visited.contains("OptionalExpression", List(pYield, pAwait))) {
      visited += (("OptionalExpression", List(pYield, pAwait)))
      var s = ScalaSet[OptionalExpression]()
      val MemberExpression_0_0 = MemberExpression(pYield, pAwait).toList
      val OptionalChain_0_1 = OptionalChain(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0, OptionalChain_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = OptionalChain_0_1.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        s += OptionalExpression0(arg0, arg1, List(pYield, pAwait))
      }
      val CallExpression_1_0 = CallExpression(pYield, pAwait).toList
      val OptionalChain_1_1 = OptionalChain(pYield, pAwait).toList
      val max1 = List(CallExpression_1_0, OptionalChain_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CallExpression_1_0.applyOrElse(i, (_: Int) => CallExpression(pYield, pAwait).head)
        val arg1 = OptionalChain_1_1.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        s += OptionalExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalExpression_2_0 = OptionalExpression(pYield, pAwait).toList
      val OptionalChain_2_1 = OptionalChain(pYield, pAwait).toList
      val max2 = List(OptionalExpression_2_0, OptionalChain_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = OptionalExpression_2_0.applyOrElse(i, (_: Int) => OptionalExpression(pYield, pAwait).head)
        val arg1 = OptionalChain_2_1.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        s += OptionalExpression2(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.OptionalExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.OptionalExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def OptionalChain(pYield: Boolean, pAwait: Boolean): ScalaSet[OptionalChain] = {
    if (!visited.contains("OptionalChain", List(pYield, pAwait))) {
      visited += (("OptionalChain", List(pYield, pAwait)))
      var s = ScalaSet[OptionalChain]()
      val Arguments_0_1 = Arguments(pYield, pAwait).toList
      val max0 = List(Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Arguments_0_1.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += OptionalChain0(arg0, List(pYield, pAwait))
      }
      val Expression_1_2 = Expression(true, pYield, pAwait).toList
      val max1 = List(Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += OptionalChain1(arg0, List(pYield, pAwait))
      }
      val IdentifierName_2_1 = IdentifierName().toList
      val max2 = List(IdentifierName_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = IdentifierName_2_1.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += OptionalChain2(arg0, List(pYield, pAwait))
      }
      val TemplateLiteral_3_1 = TemplateLiteral(pYield, pAwait, true).toList
      val max3 = List(TemplateLiteral_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = TemplateLiteral_3_1.applyOrElse(i, (_: Int) => TemplateLiteral(pYield, pAwait, true).head)
        s += OptionalChain3(arg0, List(pYield, pAwait))
      }
      val OptionalChain_4_0 = OptionalChain(pYield, pAwait).toList
      val Arguments_4_1 = Arguments(pYield, pAwait).toList
      val max4 = List(OptionalChain_4_0, Arguments_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = OptionalChain_4_0.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        val arg1 = Arguments_4_1.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += OptionalChain4(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalChain_5_0 = OptionalChain(pYield, pAwait).toList
      val Expression_5_2 = Expression(true, pYield, pAwait).toList
      val max5 = List(OptionalChain_5_0, Expression_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = OptionalChain_5_0.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        val arg1 = Expression_5_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += OptionalChain5(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalChain_6_0 = OptionalChain(pYield, pAwait).toList
      val IdentifierName_6_2 = IdentifierName().toList
      val max6 = List(OptionalChain_6_0, IdentifierName_6_2).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = OptionalChain_6_0.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        val arg1 = IdentifierName_6_2.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += OptionalChain6(arg0, arg1, List(pYield, pAwait))
      }
      val OptionalChain_7_0 = OptionalChain(pYield, pAwait).toList
      val TemplateLiteral_7_1 = TemplateLiteral(pYield, pAwait, true).toList
      val max7 = List(OptionalChain_7_0, TemplateLiteral_7_1).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = OptionalChain_7_0.applyOrElse(i, (_: Int) => OptionalChain(pYield, pAwait).head)
        val arg1 = TemplateLiteral_7_1.applyOrElse(i, (_: Int) => TemplateLiteral(pYield, pAwait, true).head)
        s += OptionalChain7(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.OptionalChain(pYield, pAwait)
      val sample = JSParser.parse(JSParser.OptionalChain(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[LeftHandSideExpression] = {
    if (!visited.contains("LeftHandSideExpression", List(pYield, pAwait))) {
      visited += (("LeftHandSideExpression", List(pYield, pAwait)))
      var s = ScalaSet[LeftHandSideExpression]()
      val NewExpression_0_0 = NewExpression(pYield, pAwait).toList
      val max0 = List(NewExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = NewExpression_0_0.applyOrElse(i, (_: Int) => NewExpression(pYield, pAwait).head)
        s += LeftHandSideExpression0(arg0, List(pYield, pAwait))
      }
      val CallExpression_1_0 = CallExpression(pYield, pAwait).toList
      val max1 = List(CallExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CallExpression_1_0.applyOrElse(i, (_: Int) => CallExpression(pYield, pAwait).head)
        s += LeftHandSideExpression1(arg0, List(pYield, pAwait))
      }
      val OptionalExpression_2_0 = OptionalExpression(pYield, pAwait).toList
      val max2 = List(OptionalExpression_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = OptionalExpression_2_0.applyOrElse(i, (_: Int) => OptionalExpression(pYield, pAwait).head)
        s += LeftHandSideExpression2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.LeftHandSideExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.LeftHandSideExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def UpdateExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[UpdateExpression] = {
    if (!visited.contains("UpdateExpression", List(pYield, pAwait))) {
      visited += (("UpdateExpression", List(pYield, pAwait)))
      var s = ScalaSet[UpdateExpression]()
      val LeftHandSideExpression_0_0 = LeftHandSideExpression(pYield, pAwait).toList
      val max0 = List(LeftHandSideExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LeftHandSideExpression_0_0.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        s += UpdateExpression0(arg0, List(pYield, pAwait))
      }
      val LeftHandSideExpression_1_0 = LeftHandSideExpression(pYield, pAwait).toList
      val max1 = List(LeftHandSideExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LeftHandSideExpression_1_0.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        s += UpdateExpression1(arg0, List(pYield, pAwait))
      }
      val LeftHandSideExpression_2_0 = LeftHandSideExpression(pYield, pAwait).toList
      val max2 = List(LeftHandSideExpression_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = LeftHandSideExpression_2_0.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        s += UpdateExpression2(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_3_1 = UnaryExpression(pYield, pAwait).toList
      val max3 = List(UnaryExpression_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = UnaryExpression_3_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UpdateExpression3(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_4_1 = UnaryExpression(pYield, pAwait).toList
      val max4 = List(UnaryExpression_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = UnaryExpression_4_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UpdateExpression4(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.UpdateExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.UpdateExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def UnaryExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[UnaryExpression] = {
    if (!visited.contains("UnaryExpression", List(pYield, pAwait))) {
      visited += (("UnaryExpression", List(pYield, pAwait)))
      var s = ScalaSet[UnaryExpression]()
      val UpdateExpression_0_0 = UpdateExpression(pYield, pAwait).toList
      val max0 = List(UpdateExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UpdateExpression_0_0.applyOrElse(i, (_: Int) => UpdateExpression(pYield, pAwait).head)
        s += UnaryExpression0(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_1_1 = UnaryExpression(pYield, pAwait).toList
      val max1 = List(UnaryExpression_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = UnaryExpression_1_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression1(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_2_1 = UnaryExpression(pYield, pAwait).toList
      val max2 = List(UnaryExpression_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = UnaryExpression_2_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression2(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_3_1 = UnaryExpression(pYield, pAwait).toList
      val max3 = List(UnaryExpression_3_1).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = UnaryExpression_3_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression3(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_4_1 = UnaryExpression(pYield, pAwait).toList
      val max4 = List(UnaryExpression_4_1).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = UnaryExpression_4_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression4(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_5_1 = UnaryExpression(pYield, pAwait).toList
      val max5 = List(UnaryExpression_5_1).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = UnaryExpression_5_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression5(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_6_1 = UnaryExpression(pYield, pAwait).toList
      val max6 = List(UnaryExpression_6_1).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = UnaryExpression_6_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression6(arg0, List(pYield, pAwait))
      }
      val UnaryExpression_7_1 = UnaryExpression(pYield, pAwait).toList
      val max7 = List(UnaryExpression_7_1).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = UnaryExpression_7_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += UnaryExpression7(arg0, List(pYield, pAwait))
      }
      if (pAwait) {
        val AwaitExpression_8_0 = AwaitExpression(pYield).toList
        val max8 = List(AwaitExpression_8_0).map(_.length).max
        for (i <- (0 until max8)) {
          val arg0 = AwaitExpression_8_0.applyOrElse(i, (_: Int) => AwaitExpression(pYield).head)
          s += UnaryExpression8(arg0, List(pYield, pAwait))
        }
      }
      s
    } else {
      val str = MinSampler.UnaryExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.UnaryExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ExponentiationExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ExponentiationExpression] = {
    if (!visited.contains("ExponentiationExpression", List(pYield, pAwait))) {
      visited += (("ExponentiationExpression", List(pYield, pAwait)))
      var s = ScalaSet[ExponentiationExpression]()
      val UnaryExpression_0_0 = UnaryExpression(pYield, pAwait).toList
      val max0 = List(UnaryExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UnaryExpression_0_0.applyOrElse(i, (_: Int) => UnaryExpression(pYield, pAwait).head)
        s += ExponentiationExpression0(arg0, List(pYield, pAwait))
      }
      val UpdateExpression_1_0 = UpdateExpression(pYield, pAwait).toList
      val ExponentiationExpression_1_2 = ExponentiationExpression(pYield, pAwait).toList
      val max1 = List(UpdateExpression_1_0, ExponentiationExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = UpdateExpression_1_0.applyOrElse(i, (_: Int) => UpdateExpression(pYield, pAwait).head)
        val arg1 = ExponentiationExpression_1_2.applyOrElse(i, (_: Int) => ExponentiationExpression(pYield, pAwait).head)
        s += ExponentiationExpression1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ExponentiationExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ExponentiationExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[MultiplicativeExpression] = {
    if (!visited.contains("MultiplicativeExpression", List(pYield, pAwait))) {
      visited += (("MultiplicativeExpression", List(pYield, pAwait)))
      var s = ScalaSet[MultiplicativeExpression]()
      val ExponentiationExpression_0_0 = ExponentiationExpression(pYield, pAwait).toList
      val max0 = List(ExponentiationExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ExponentiationExpression_0_0.applyOrElse(i, (_: Int) => ExponentiationExpression(pYield, pAwait).head)
        s += MultiplicativeExpression0(arg0, List(pYield, pAwait))
      }
      val MultiplicativeExpression_1_0 = MultiplicativeExpression(pYield, pAwait).toList
      val MultiplicativeOperator_1_1 = MultiplicativeOperator().toList
      val ExponentiationExpression_1_2 = ExponentiationExpression(pYield, pAwait).toList
      val max1 = List(MultiplicativeExpression_1_0, MultiplicativeOperator_1_1, ExponentiationExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = MultiplicativeExpression_1_0.applyOrElse(i, (_: Int) => MultiplicativeExpression(pYield, pAwait).head)
        val arg1 = MultiplicativeOperator_1_1.applyOrElse(i, (_: Int) => MultiplicativeOperator().head)
        val arg2 = ExponentiationExpression_1_2.applyOrElse(i, (_: Int) => ExponentiationExpression(pYield, pAwait).head)
        s += MultiplicativeExpression1(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.MultiplicativeExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.MultiplicativeExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def MultiplicativeOperator(): ScalaSet[MultiplicativeOperator] = {
    if (!visited.contains("MultiplicativeOperator", List())) {
      visited += (("MultiplicativeOperator", List()))
      var s = ScalaSet[MultiplicativeOperator]()
      s += MultiplicativeOperator0(List())
      s += MultiplicativeOperator1(List())
      s += MultiplicativeOperator2(List())
      s
    } else {
      val str = MinSampler.MultiplicativeOperator()
      val sample = JSParser.parse(JSParser.MultiplicativeOperator(List()), str).get
      ScalaSet(sample)
    }
  }
  def AdditiveExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[AdditiveExpression] = {
    if (!visited.contains("AdditiveExpression", List(pYield, pAwait))) {
      visited += (("AdditiveExpression", List(pYield, pAwait)))
      var s = ScalaSet[AdditiveExpression]()
      val MultiplicativeExpression_0_0 = MultiplicativeExpression(pYield, pAwait).toList
      val max0 = List(MultiplicativeExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MultiplicativeExpression_0_0.applyOrElse(i, (_: Int) => MultiplicativeExpression(pYield, pAwait).head)
        s += AdditiveExpression0(arg0, List(pYield, pAwait))
      }
      val AdditiveExpression_1_0 = AdditiveExpression(pYield, pAwait).toList
      val MultiplicativeExpression_1_2 = MultiplicativeExpression(pYield, pAwait).toList
      val max1 = List(AdditiveExpression_1_0, MultiplicativeExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AdditiveExpression_1_0.applyOrElse(i, (_: Int) => AdditiveExpression(pYield, pAwait).head)
        val arg1 = MultiplicativeExpression_1_2.applyOrElse(i, (_: Int) => MultiplicativeExpression(pYield, pAwait).head)
        s += AdditiveExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val AdditiveExpression_2_0 = AdditiveExpression(pYield, pAwait).toList
      val MultiplicativeExpression_2_2 = MultiplicativeExpression(pYield, pAwait).toList
      val max2 = List(AdditiveExpression_2_0, MultiplicativeExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AdditiveExpression_2_0.applyOrElse(i, (_: Int) => AdditiveExpression(pYield, pAwait).head)
        val arg1 = MultiplicativeExpression_2_2.applyOrElse(i, (_: Int) => MultiplicativeExpression(pYield, pAwait).head)
        s += AdditiveExpression2(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AdditiveExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AdditiveExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ShiftExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ShiftExpression] = {
    if (!visited.contains("ShiftExpression", List(pYield, pAwait))) {
      visited += (("ShiftExpression", List(pYield, pAwait)))
      var s = ScalaSet[ShiftExpression]()
      val AdditiveExpression_0_0 = AdditiveExpression(pYield, pAwait).toList
      val max0 = List(AdditiveExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AdditiveExpression_0_0.applyOrElse(i, (_: Int) => AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression0(arg0, List(pYield, pAwait))
      }
      val ShiftExpression_1_0 = ShiftExpression(pYield, pAwait).toList
      val AdditiveExpression_1_2 = AdditiveExpression(pYield, pAwait).toList
      val max1 = List(ShiftExpression_1_0, AdditiveExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ShiftExpression_1_0.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        val arg1 = AdditiveExpression_1_2.applyOrElse(i, (_: Int) => AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression1(arg0, arg1, List(pYield, pAwait))
      }
      val ShiftExpression_2_0 = ShiftExpression(pYield, pAwait).toList
      val AdditiveExpression_2_2 = AdditiveExpression(pYield, pAwait).toList
      val max2 = List(ShiftExpression_2_0, AdditiveExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ShiftExpression_2_0.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        val arg1 = AdditiveExpression_2_2.applyOrElse(i, (_: Int) => AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression2(arg0, arg1, List(pYield, pAwait))
      }
      val ShiftExpression_3_0 = ShiftExpression(pYield, pAwait).toList
      val AdditiveExpression_3_2 = AdditiveExpression(pYield, pAwait).toList
      val max3 = List(ShiftExpression_3_0, AdditiveExpression_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ShiftExpression_3_0.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        val arg1 = AdditiveExpression_3_2.applyOrElse(i, (_: Int) => AdditiveExpression(pYield, pAwait).head)
        s += ShiftExpression3(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ShiftExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ShiftExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[RelationalExpression] = {
    if (!visited.contains("RelationalExpression", List(pIn, pYield, pAwait))) {
      visited += (("RelationalExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[RelationalExpression]()
      val ShiftExpression_0_0 = ShiftExpression(pYield, pAwait).toList
      val max0 = List(ShiftExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ShiftExpression_0_0.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_1_0 = RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_1_2 = ShiftExpression(pYield, pAwait).toList
      val max1 = List(RelationalExpression_1_0, ShiftExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = RelationalExpression_1_0.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_1_2.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_2_0 = RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_2_2 = ShiftExpression(pYield, pAwait).toList
      val max2 = List(RelationalExpression_2_0, ShiftExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = RelationalExpression_2_0.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_2_2.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression2(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_3_0 = RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_3_2 = ShiftExpression(pYield, pAwait).toList
      val max3 = List(RelationalExpression_3_0, ShiftExpression_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = RelationalExpression_3_0.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_3_2.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression3(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_4_0 = RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_4_2 = ShiftExpression(pYield, pAwait).toList
      val max4 = List(RelationalExpression_4_0, ShiftExpression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = RelationalExpression_4_0.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_4_2.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression4(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val RelationalExpression_5_0 = RelationalExpression(pIn, pYield, pAwait).toList
      val ShiftExpression_5_2 = ShiftExpression(pYield, pAwait).toList
      val max5 = List(RelationalExpression_5_0, ShiftExpression_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = RelationalExpression_5_0.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        val arg1 = ShiftExpression_5_2.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
        s += RelationalExpression5(arg0, arg1, List(pIn, pYield, pAwait))
      }
      if (pIn) {
        val RelationalExpression_6_0 = RelationalExpression(true, pYield, pAwait).toList
        val ShiftExpression_6_2 = ShiftExpression(pYield, pAwait).toList
        val max6 = List(RelationalExpression_6_0, ShiftExpression_6_2).map(_.length).max
        for (i <- (0 until max6)) {
          val arg0 = RelationalExpression_6_0.applyOrElse(i, (_: Int) => RelationalExpression(true, pYield, pAwait).head)
          val arg1 = ShiftExpression_6_2.applyOrElse(i, (_: Int) => ShiftExpression(pYield, pAwait).head)
          s += RelationalExpression6(arg0, arg1, List(pIn, pYield, pAwait))
        }
      }
      s
    } else {
      val str = MinSampler.RelationalExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.RelationalExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[EqualityExpression] = {
    if (!visited.contains("EqualityExpression", List(pIn, pYield, pAwait))) {
      visited += (("EqualityExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[EqualityExpression]()
      val RelationalExpression_0_0 = RelationalExpression(pIn, pYield, pAwait).toList
      val max0 = List(RelationalExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = RelationalExpression_0_0.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_1_0 = EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_1_2 = RelationalExpression(pIn, pYield, pAwait).toList
      val max1 = List(EqualityExpression_1_0, RelationalExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = EqualityExpression_1_0.applyOrElse(i, (_: Int) => EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_1_2.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_2_0 = EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_2_2 = RelationalExpression(pIn, pYield, pAwait).toList
      val max2 = List(EqualityExpression_2_0, RelationalExpression_2_2).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = EqualityExpression_2_0.applyOrElse(i, (_: Int) => EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_2_2.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression2(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_3_0 = EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_3_2 = RelationalExpression(pIn, pYield, pAwait).toList
      val max3 = List(EqualityExpression_3_0, RelationalExpression_3_2).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = EqualityExpression_3_0.applyOrElse(i, (_: Int) => EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_3_2.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression3(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val EqualityExpression_4_0 = EqualityExpression(pIn, pYield, pAwait).toList
      val RelationalExpression_4_2 = RelationalExpression(pIn, pYield, pAwait).toList
      val max4 = List(EqualityExpression_4_0, RelationalExpression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = EqualityExpression_4_0.applyOrElse(i, (_: Int) => EqualityExpression(pIn, pYield, pAwait).head)
        val arg1 = RelationalExpression_4_2.applyOrElse(i, (_: Int) => RelationalExpression(pIn, pYield, pAwait).head)
        s += EqualityExpression4(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.EqualityExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.EqualityExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseANDExpression] = {
    if (!visited.contains("BitwiseANDExpression", List(pIn, pYield, pAwait))) {
      visited += (("BitwiseANDExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BitwiseANDExpression]()
      val EqualityExpression_0_0 = EqualityExpression(pIn, pYield, pAwait).toList
      val max0 = List(EqualityExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = EqualityExpression_0_0.applyOrElse(i, (_: Int) => EqualityExpression(pIn, pYield, pAwait).head)
        s += BitwiseANDExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseANDExpression_1_0 = BitwiseANDExpression(pIn, pYield, pAwait).toList
      val EqualityExpression_1_2 = EqualityExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseANDExpression_1_0, EqualityExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseANDExpression_1_0.applyOrElse(i, (_: Int) => BitwiseANDExpression(pIn, pYield, pAwait).head)
        val arg1 = EqualityExpression_1_2.applyOrElse(i, (_: Int) => EqualityExpression(pIn, pYield, pAwait).head)
        s += BitwiseANDExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BitwiseANDExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.BitwiseANDExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseXORExpression] = {
    if (!visited.contains("BitwiseXORExpression", List(pIn, pYield, pAwait))) {
      visited += (("BitwiseXORExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BitwiseXORExpression]()
      val BitwiseANDExpression_0_0 = BitwiseANDExpression(pIn, pYield, pAwait).toList
      val max0 = List(BitwiseANDExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BitwiseANDExpression_0_0.applyOrElse(i, (_: Int) => BitwiseANDExpression(pIn, pYield, pAwait).head)
        s += BitwiseXORExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseXORExpression_1_0 = BitwiseXORExpression(pIn, pYield, pAwait).toList
      val BitwiseANDExpression_1_2 = BitwiseANDExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseXORExpression_1_0, BitwiseANDExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseXORExpression_1_0.applyOrElse(i, (_: Int) => BitwiseXORExpression(pIn, pYield, pAwait).head)
        val arg1 = BitwiseANDExpression_1_2.applyOrElse(i, (_: Int) => BitwiseANDExpression(pIn, pYield, pAwait).head)
        s += BitwiseXORExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BitwiseXORExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.BitwiseXORExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BitwiseORExpression] = {
    if (!visited.contains("BitwiseORExpression", List(pIn, pYield, pAwait))) {
      visited += (("BitwiseORExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BitwiseORExpression]()
      val BitwiseXORExpression_0_0 = BitwiseXORExpression(pIn, pYield, pAwait).toList
      val max0 = List(BitwiseXORExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BitwiseXORExpression_0_0.applyOrElse(i, (_: Int) => BitwiseXORExpression(pIn, pYield, pAwait).head)
        s += BitwiseORExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseORExpression_1_0 = BitwiseORExpression(pIn, pYield, pAwait).toList
      val BitwiseXORExpression_1_2 = BitwiseXORExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseORExpression_1_0, BitwiseXORExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseORExpression_1_0.applyOrElse(i, (_: Int) => BitwiseORExpression(pIn, pYield, pAwait).head)
        val arg1 = BitwiseXORExpression_1_2.applyOrElse(i, (_: Int) => BitwiseXORExpression(pIn, pYield, pAwait).head)
        s += BitwiseORExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BitwiseORExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.BitwiseORExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LogicalANDExpression] = {
    if (!visited.contains("LogicalANDExpression", List(pIn, pYield, pAwait))) {
      visited += (("LogicalANDExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LogicalANDExpression]()
      val BitwiseORExpression_0_0 = BitwiseORExpression(pIn, pYield, pAwait).toList
      val max0 = List(BitwiseORExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BitwiseORExpression_0_0.applyOrElse(i, (_: Int) => BitwiseORExpression(pIn, pYield, pAwait).head)
        s += LogicalANDExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val LogicalANDExpression_1_0 = LogicalANDExpression(pIn, pYield, pAwait).toList
      val BitwiseORExpression_1_2 = BitwiseORExpression(pIn, pYield, pAwait).toList
      val max1 = List(LogicalANDExpression_1_0, BitwiseORExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LogicalANDExpression_1_0.applyOrElse(i, (_: Int) => LogicalANDExpression(pIn, pYield, pAwait).head)
        val arg1 = BitwiseORExpression_1_2.applyOrElse(i, (_: Int) => BitwiseORExpression(pIn, pYield, pAwait).head)
        s += LogicalANDExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.LogicalANDExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.LogicalANDExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LogicalORExpression] = {
    if (!visited.contains("LogicalORExpression", List(pIn, pYield, pAwait))) {
      visited += (("LogicalORExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LogicalORExpression]()
      val LogicalANDExpression_0_0 = LogicalANDExpression(pIn, pYield, pAwait).toList
      val max0 = List(LogicalANDExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LogicalANDExpression_0_0.applyOrElse(i, (_: Int) => LogicalANDExpression(pIn, pYield, pAwait).head)
        s += LogicalORExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val LogicalORExpression_1_0 = LogicalORExpression(pIn, pYield, pAwait).toList
      val LogicalANDExpression_1_2 = LogicalANDExpression(pIn, pYield, pAwait).toList
      val max1 = List(LogicalORExpression_1_0, LogicalANDExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LogicalORExpression_1_0.applyOrElse(i, (_: Int) => LogicalORExpression(pIn, pYield, pAwait).head)
        val arg1 = LogicalANDExpression_1_2.applyOrElse(i, (_: Int) => LogicalANDExpression(pIn, pYield, pAwait).head)
        s += LogicalORExpression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.LogicalORExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.LogicalORExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[CoalesceExpression] = {
    if (!visited.contains("CoalesceExpression", List(pIn, pYield, pAwait))) {
      visited += (("CoalesceExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[CoalesceExpression]()
      val CoalesceExpressionHead_0_0 = CoalesceExpressionHead(pIn, pYield, pAwait).toList
      val BitwiseORExpression_0_2 = BitwiseORExpression(pIn, pYield, pAwait).toList
      val max0 = List(CoalesceExpressionHead_0_0, BitwiseORExpression_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CoalesceExpressionHead_0_0.applyOrElse(i, (_: Int) => CoalesceExpressionHead(pIn, pYield, pAwait).head)
        val arg1 = BitwiseORExpression_0_2.applyOrElse(i, (_: Int) => BitwiseORExpression(pIn, pYield, pAwait).head)
        s += CoalesceExpression0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CoalesceExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.CoalesceExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[CoalesceExpressionHead] = {
    if (!visited.contains("CoalesceExpressionHead", List(pIn, pYield, pAwait))) {
      visited += (("CoalesceExpressionHead", List(pIn, pYield, pAwait)))
      var s = ScalaSet[CoalesceExpressionHead]()
      val CoalesceExpression_0_0 = CoalesceExpression(pIn, pYield, pAwait).toList
      val max0 = List(CoalesceExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CoalesceExpression_0_0.applyOrElse(i, (_: Int) => CoalesceExpression(pIn, pYield, pAwait).head)
        s += CoalesceExpressionHead0(arg0, List(pIn, pYield, pAwait))
      }
      val BitwiseORExpression_1_0 = BitwiseORExpression(pIn, pYield, pAwait).toList
      val max1 = List(BitwiseORExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BitwiseORExpression_1_0.applyOrElse(i, (_: Int) => BitwiseORExpression(pIn, pYield, pAwait).head)
        s += CoalesceExpressionHead1(arg0, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CoalesceExpressionHead(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.CoalesceExpressionHead(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ShortCircuitExpression] = {
    if (!visited.contains("ShortCircuitExpression", List(pIn, pYield, pAwait))) {
      visited += (("ShortCircuitExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[ShortCircuitExpression]()
      val LogicalORExpression_0_0 = LogicalORExpression(pIn, pYield, pAwait).toList
      val max0 = List(LogicalORExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LogicalORExpression_0_0.applyOrElse(i, (_: Int) => LogicalORExpression(pIn, pYield, pAwait).head)
        s += ShortCircuitExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val CoalesceExpression_1_0 = CoalesceExpression(pIn, pYield, pAwait).toList
      val max1 = List(CoalesceExpression_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoalesceExpression_1_0.applyOrElse(i, (_: Int) => CoalesceExpression(pIn, pYield, pAwait).head)
        s += ShortCircuitExpression1(arg0, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ShortCircuitExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.ShortCircuitExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ConditionalExpression] = {
    if (!visited.contains("ConditionalExpression", List(pIn, pYield, pAwait))) {
      visited += (("ConditionalExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[ConditionalExpression]()
      val ShortCircuitExpression_0_0 = ShortCircuitExpression(pIn, pYield, pAwait).toList
      val max0 = List(ShortCircuitExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ShortCircuitExpression_0_0.applyOrElse(i, (_: Int) => ShortCircuitExpression(pIn, pYield, pAwait).head)
        s += ConditionalExpression0(arg0, List(pIn, pYield, pAwait))
      }
      val ShortCircuitExpression_1_0 = ShortCircuitExpression(pIn, pYield, pAwait).toList
      val AssignmentExpression_1_2 = AssignmentExpression(true, pYield, pAwait).toList
      val AssignmentExpression_1_4 = AssignmentExpression(pIn, pYield, pAwait).toList
      val max1 = List(ShortCircuitExpression_1_0, AssignmentExpression_1_2, AssignmentExpression_1_4).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ShortCircuitExpression_1_0.applyOrElse(i, (_: Int) => ShortCircuitExpression(pIn, pYield, pAwait).head)
        val arg1 = AssignmentExpression_1_2.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = AssignmentExpression_1_4.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, pYield, pAwait).head)
        s += ConditionalExpression1(arg0, arg1, arg2, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ConditionalExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.ConditionalExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentExpression] = {
    if (!visited.contains("AssignmentExpression", List(pIn, pYield, pAwait))) {
      visited += (("AssignmentExpression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[AssignmentExpression]()
      val ConditionalExpression_0_0 = ConditionalExpression(pIn, pYield, pAwait).toList
      val max0 = List(ConditionalExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ConditionalExpression_0_0.applyOrElse(i, (_: Int) => ConditionalExpression(pIn, pYield, pAwait).head)
        s += AssignmentExpression0(arg0, List(pIn, pYield, pAwait))
      }
      if (pYield) {
        val YieldExpression_1_0 = YieldExpression(pIn, pAwait).toList
        val max1 = List(YieldExpression_1_0).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = YieldExpression_1_0.applyOrElse(i, (_: Int) => YieldExpression(pIn, pAwait).head)
          s += AssignmentExpression1(arg0, List(pIn, pYield, pAwait))
        }
      }
      val ArrowFunction_2_0 = ArrowFunction(pIn, pYield, pAwait).toList
      val max2 = List(ArrowFunction_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = ArrowFunction_2_0.applyOrElse(i, (_: Int) => ArrowFunction(pIn, pYield, pAwait).head)
        s += AssignmentExpression2(arg0, List(pIn, pYield, pAwait))
      }
      val AsyncArrowFunction_3_0 = AsyncArrowFunction(pIn, pYield, pAwait).toList
      val max3 = List(AsyncArrowFunction_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AsyncArrowFunction_3_0.applyOrElse(i, (_: Int) => AsyncArrowFunction(pIn, pYield, pAwait).head)
        s += AssignmentExpression3(arg0, List(pIn, pYield, pAwait))
      }
      val LeftHandSideExpression_4_0 = LeftHandSideExpression(pYield, pAwait).toList
      val AssignmentExpression_4_2 = AssignmentExpression(pIn, pYield, pAwait).toList
      val max4 = List(LeftHandSideExpression_4_0, AssignmentExpression_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = LeftHandSideExpression_4_0.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = AssignmentExpression_4_2.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, pYield, pAwait).head)
        s += AssignmentExpression4(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val LeftHandSideExpression_5_0 = LeftHandSideExpression(pYield, pAwait).toList
      val AssignmentOperator_5_1 = AssignmentOperator().toList
      val AssignmentExpression_5_2 = AssignmentExpression(pIn, pYield, pAwait).toList
      val max5 = List(LeftHandSideExpression_5_0, AssignmentOperator_5_1, AssignmentExpression_5_2).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = LeftHandSideExpression_5_0.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = AssignmentOperator_5_1.applyOrElse(i, (_: Int) => AssignmentOperator().head)
        val arg2 = AssignmentExpression_5_2.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, pYield, pAwait).head)
        s += AssignmentExpression5(arg0, arg1, arg2, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentExpression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentExpression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentOperator(): ScalaSet[AssignmentOperator] = {
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
      val str = MinSampler.AssignmentOperator()
      val sample = JSParser.parse(JSParser.AssignmentOperator(List()), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentPattern] = {
    if (!visited.contains("AssignmentPattern", List(pYield, pAwait))) {
      visited += (("AssignmentPattern", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentPattern]()
      val ObjectAssignmentPattern_0_0 = ObjectAssignmentPattern(pYield, pAwait).toList
      val max0 = List(ObjectAssignmentPattern_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ObjectAssignmentPattern_0_0.applyOrElse(i, (_: Int) => ObjectAssignmentPattern(pYield, pAwait).head)
        s += AssignmentPattern0(arg0, List(pYield, pAwait))
      }
      val ArrayAssignmentPattern_1_0 = ArrayAssignmentPattern(pYield, pAwait).toList
      val max1 = List(ArrayAssignmentPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ArrayAssignmentPattern_1_0.applyOrElse(i, (_: Int) => ArrayAssignmentPattern(pYield, pAwait).head)
        s += AssignmentPattern1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentPattern(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentPattern(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectAssignmentPattern] = {
    if (!visited.contains("ObjectAssignmentPattern", List(pYield, pAwait))) {
      visited += (("ObjectAssignmentPattern", List(pYield, pAwait)))
      var s = ScalaSet[ObjectAssignmentPattern]()
      s += ObjectAssignmentPattern0(List(pYield, pAwait))
      val AssignmentRestProperty_1_1 = AssignmentRestProperty(pYield, pAwait).toList
      val max1 = List(AssignmentRestProperty_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentRestProperty_1_1.applyOrElse(i, (_: Int) => AssignmentRestProperty(pYield, pAwait).head)
        s += ObjectAssignmentPattern1(arg0, List(pYield, pAwait))
      }
      val AssignmentPropertyList_2_1 = AssignmentPropertyList(pYield, pAwait).toList
      val max2 = List(AssignmentPropertyList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AssignmentPropertyList_2_1.applyOrElse(i, (_: Int) => AssignmentPropertyList(pYield, pAwait).head)
        s += ObjectAssignmentPattern2(arg0, List(pYield, pAwait))
      }
      val AssignmentPropertyList_3_1 = AssignmentPropertyList(pYield, pAwait).toList
      val AssignmentRestProperty_3_3 = AssignmentRestProperty(pYield, pAwait).toList
      val max3 = List(AssignmentPropertyList_3_1, AssignmentRestProperty_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AssignmentPropertyList_3_1.applyOrElse(i, (_: Int) => AssignmentPropertyList(pYield, pAwait).head)
        val arg1 = AssignmentRestProperty_3_3.applyOrElse(i, (_: Int) => AssignmentRestProperty(pYield, pAwait).head)
        s += ObjectAssignmentPattern3(arg0, Some(arg1), List(pYield, pAwait))
        s += ObjectAssignmentPattern3(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ObjectAssignmentPattern(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ObjectAssignmentPattern(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayAssignmentPattern] = {
    if (!visited.contains("ArrayAssignmentPattern", List(pYield, pAwait))) {
      visited += (("ArrayAssignmentPattern", List(pYield, pAwait)))
      var s = ScalaSet[ArrayAssignmentPattern]()
      val Elision_0_1 = Elision().toList
      val AssignmentRestElement_0_2 = AssignmentRestElement(pYield, pAwait).toList
      val max0 = List(Elision_0_1, AssignmentRestElement_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_1.applyOrElse(i, (_: Int) => Elision().head)
        val arg1 = AssignmentRestElement_0_2.applyOrElse(i, (_: Int) => AssignmentRestElement(pYield, pAwait).head)
        s += ArrayAssignmentPattern0(Some(arg0), Some(arg1), List(pYield, pAwait))
        s += ArrayAssignmentPattern0(Some(arg0), None, List(pYield, pAwait))
        s += ArrayAssignmentPattern0(None, Some(arg1), List(pYield, pAwait))
        s += ArrayAssignmentPattern0(None, None, List(pYield, pAwait))
      }
      val AssignmentElementList_1_1 = AssignmentElementList(pYield, pAwait).toList
      val max1 = List(AssignmentElementList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentElementList_1_1.applyOrElse(i, (_: Int) => AssignmentElementList(pYield, pAwait).head)
        s += ArrayAssignmentPattern1(arg0, List(pYield, pAwait))
      }
      val AssignmentElementList_2_1 = AssignmentElementList(pYield, pAwait).toList
      val Elision_2_3 = Elision().toList
      val AssignmentRestElement_2_4 = AssignmentRestElement(pYield, pAwait).toList
      val max2 = List(AssignmentElementList_2_1, Elision_2_3, AssignmentRestElement_2_4).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AssignmentElementList_2_1.applyOrElse(i, (_: Int) => AssignmentElementList(pYield, pAwait).head)
        val arg1 = Elision_2_3.applyOrElse(i, (_: Int) => Elision().head)
        val arg2 = AssignmentRestElement_2_4.applyOrElse(i, (_: Int) => AssignmentRestElement(pYield, pAwait).head)
        s += ArrayAssignmentPattern2(arg0, Some(arg1), Some(arg2), List(pYield, pAwait))
        s += ArrayAssignmentPattern2(arg0, Some(arg1), None, List(pYield, pAwait))
        s += ArrayAssignmentPattern2(arg0, None, Some(arg2), List(pYield, pAwait))
        s += ArrayAssignmentPattern2(arg0, None, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArrayAssignmentPattern(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArrayAssignmentPattern(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentRestProperty] = {
    if (!visited.contains("AssignmentRestProperty", List(pYield, pAwait))) {
      visited += (("AssignmentRestProperty", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentRestProperty]()
      val DestructuringAssignmentTarget_0_1 = DestructuringAssignmentTarget(pYield, pAwait).toList
      val max0 = List(DestructuringAssignmentTarget_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = DestructuringAssignmentTarget_0_1.applyOrElse(i, (_: Int) => DestructuringAssignmentTarget(pYield, pAwait).head)
        s += AssignmentRestProperty0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentRestProperty(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentRestProperty(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentPropertyList] = {
    if (!visited.contains("AssignmentPropertyList", List(pYield, pAwait))) {
      visited += (("AssignmentPropertyList", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentPropertyList]()
      val AssignmentProperty_0_0 = AssignmentProperty(pYield, pAwait).toList
      val max0 = List(AssignmentProperty_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentProperty_0_0.applyOrElse(i, (_: Int) => AssignmentProperty(pYield, pAwait).head)
        s += AssignmentPropertyList0(arg0, List(pYield, pAwait))
      }
      val AssignmentPropertyList_1_0 = AssignmentPropertyList(pYield, pAwait).toList
      val AssignmentProperty_1_2 = AssignmentProperty(pYield, pAwait).toList
      val max1 = List(AssignmentPropertyList_1_0, AssignmentProperty_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentPropertyList_1_0.applyOrElse(i, (_: Int) => AssignmentPropertyList(pYield, pAwait).head)
        val arg1 = AssignmentProperty_1_2.applyOrElse(i, (_: Int) => AssignmentProperty(pYield, pAwait).head)
        s += AssignmentPropertyList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentPropertyList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentPropertyList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElementList] = {
    if (!visited.contains("AssignmentElementList", List(pYield, pAwait))) {
      visited += (("AssignmentElementList", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentElementList]()
      val AssignmentElisionElement_0_0 = AssignmentElisionElement(pYield, pAwait).toList
      val max0 = List(AssignmentElisionElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentElisionElement_0_0.applyOrElse(i, (_: Int) => AssignmentElisionElement(pYield, pAwait).head)
        s += AssignmentElementList0(arg0, List(pYield, pAwait))
      }
      val AssignmentElementList_1_0 = AssignmentElementList(pYield, pAwait).toList
      val AssignmentElisionElement_1_2 = AssignmentElisionElement(pYield, pAwait).toList
      val max1 = List(AssignmentElementList_1_0, AssignmentElisionElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentElementList_1_0.applyOrElse(i, (_: Int) => AssignmentElementList(pYield, pAwait).head)
        val arg1 = AssignmentElisionElement_1_2.applyOrElse(i, (_: Int) => AssignmentElisionElement(pYield, pAwait).head)
        s += AssignmentElementList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentElementList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentElementList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElisionElement] = {
    if (!visited.contains("AssignmentElisionElement", List(pYield, pAwait))) {
      visited += (("AssignmentElisionElement", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentElisionElement]()
      val Elision_0_0 = Elision().toList
      val AssignmentElement_0_1 = AssignmentElement(pYield, pAwait).toList
      val max0 = List(Elision_0_0, AssignmentElement_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_0.applyOrElse(i, (_: Int) => Elision().head)
        val arg1 = AssignmentElement_0_1.applyOrElse(i, (_: Int) => AssignmentElement(pYield, pAwait).head)
        s += AssignmentElisionElement0(Some(arg0), arg1, List(pYield, pAwait))
        s += AssignmentElisionElement0(None, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentElisionElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentElisionElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentProperty] = {
    if (!visited.contains("AssignmentProperty", List(pYield, pAwait))) {
      visited += (("AssignmentProperty", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentProperty]()
      val IdentifierReference_0_0 = IdentifierReference(pYield, pAwait).toList
      val Initializer_0_1 = Initializer(true, pYield, pAwait).toList
      val max0 = List(IdentifierReference_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierReference_0_0.applyOrElse(i, (_: Int) => IdentifierReference(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => Initializer(true, pYield, pAwait).head)
        s += AssignmentProperty0(arg0, Some(arg1), List(pYield, pAwait))
        s += AssignmentProperty0(arg0, None, List(pYield, pAwait))
      }
      val PropertyName_1_0 = PropertyName(pYield, pAwait).toList
      val AssignmentElement_1_2 = AssignmentElement(pYield, pAwait).toList
      val max1 = List(PropertyName_1_0, AssignmentElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyName_1_0.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = AssignmentElement_1_2.applyOrElse(i, (_: Int) => AssignmentElement(pYield, pAwait).head)
        s += AssignmentProperty1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentProperty(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentProperty(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentElement] = {
    if (!visited.contains("AssignmentElement", List(pYield, pAwait))) {
      visited += (("AssignmentElement", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentElement]()
      val DestructuringAssignmentTarget_0_0 = DestructuringAssignmentTarget(pYield, pAwait).toList
      val Initializer_0_1 = Initializer(true, pYield, pAwait).toList
      val max0 = List(DestructuringAssignmentTarget_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = DestructuringAssignmentTarget_0_0.applyOrElse(i, (_: Int) => DestructuringAssignmentTarget(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => Initializer(true, pYield, pAwait).head)
        s += AssignmentElement0(arg0, Some(arg1), List(pYield, pAwait))
        s += AssignmentElement0(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AssignmentRestElement(pYield: Boolean, pAwait: Boolean): ScalaSet[AssignmentRestElement] = {
    if (!visited.contains("AssignmentRestElement", List(pYield, pAwait))) {
      visited += (("AssignmentRestElement", List(pYield, pAwait)))
      var s = ScalaSet[AssignmentRestElement]()
      val DestructuringAssignmentTarget_0_1 = DestructuringAssignmentTarget(pYield, pAwait).toList
      val max0 = List(DestructuringAssignmentTarget_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = DestructuringAssignmentTarget_0_1.applyOrElse(i, (_: Int) => DestructuringAssignmentTarget(pYield, pAwait).head)
        s += AssignmentRestElement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AssignmentRestElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AssignmentRestElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): ScalaSet[DestructuringAssignmentTarget] = {
    if (!visited.contains("DestructuringAssignmentTarget", List(pYield, pAwait))) {
      visited += (("DestructuringAssignmentTarget", List(pYield, pAwait)))
      var s = ScalaSet[DestructuringAssignmentTarget]()
      val LeftHandSideExpression_0_0 = LeftHandSideExpression(pYield, pAwait).toList
      val max0 = List(LeftHandSideExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LeftHandSideExpression_0_0.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        s += DestructuringAssignmentTarget0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.DestructuringAssignmentTarget(pYield, pAwait)
      val sample = JSParser.parse(JSParser.DestructuringAssignmentTarget(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[Expression] = {
    if (!visited.contains("Expression", List(pIn, pYield, pAwait))) {
      visited += (("Expression", List(pIn, pYield, pAwait)))
      var s = ScalaSet[Expression]()
      val AssignmentExpression_0_0 = AssignmentExpression(pIn, pYield, pAwait).toList
      val max0 = List(AssignmentExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_0.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, pYield, pAwait).head)
        s += Expression0(arg0, List(pIn, pYield, pAwait))
      }
      val Expression_1_0 = Expression(pIn, pYield, pAwait).toList
      val AssignmentExpression_1_2 = AssignmentExpression(pIn, pYield, pAwait).toList
      val max1 = List(Expression_1_0, AssignmentExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_0.applyOrElse(i, (_: Int) => Expression(pIn, pYield, pAwait).head)
        val arg1 = AssignmentExpression_1_2.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, pYield, pAwait).head)
        s += Expression1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.Expression(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.Expression(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Statement] = {
    if (!visited.contains("Statement", List(pYield, pAwait, pReturn))) {
      visited += (("Statement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Statement]()
      val BlockStatement_0_0 = BlockStatement(pYield, pAwait, pReturn).toList
      val max0 = List(BlockStatement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BlockStatement_0_0.applyOrElse(i, (_: Int) => BlockStatement(pYield, pAwait, pReturn).head)
        s += Statement0(arg0, List(pYield, pAwait, pReturn))
      }
      val VariableStatement_1_0 = VariableStatement(pYield, pAwait).toList
      val max1 = List(VariableStatement_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = VariableStatement_1_0.applyOrElse(i, (_: Int) => VariableStatement(pYield, pAwait).head)
        s += Statement1(arg0, List(pYield, pAwait, pReturn))
      }
      val EmptyStatement_2_0 = EmptyStatement().toList
      val max2 = List(EmptyStatement_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = EmptyStatement_2_0.applyOrElse(i, (_: Int) => EmptyStatement().head)
        s += Statement2(arg0, List(pYield, pAwait, pReturn))
      }
      val ExpressionStatement_3_0 = ExpressionStatement(pYield, pAwait).toList
      val max3 = List(ExpressionStatement_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = ExpressionStatement_3_0.applyOrElse(i, (_: Int) => ExpressionStatement(pYield, pAwait).head)
        s += Statement3(arg0, List(pYield, pAwait, pReturn))
      }
      val IfStatement_4_0 = IfStatement(pYield, pAwait, pReturn).toList
      val max4 = List(IfStatement_4_0).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = IfStatement_4_0.applyOrElse(i, (_: Int) => IfStatement(pYield, pAwait, pReturn).head)
        s += Statement4(arg0, List(pYield, pAwait, pReturn))
      }
      val BreakableStatement_5_0 = BreakableStatement(pYield, pAwait, pReturn).toList
      val max5 = List(BreakableStatement_5_0).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = BreakableStatement_5_0.applyOrElse(i, (_: Int) => BreakableStatement(pYield, pAwait, pReturn).head)
        s += Statement5(arg0, List(pYield, pAwait, pReturn))
      }
      val ContinueStatement_6_0 = ContinueStatement(pYield, pAwait).toList
      val max6 = List(ContinueStatement_6_0).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = ContinueStatement_6_0.applyOrElse(i, (_: Int) => ContinueStatement(pYield, pAwait).head)
        s += Statement6(arg0, List(pYield, pAwait, pReturn))
      }
      val BreakStatement_7_0 = BreakStatement(pYield, pAwait).toList
      val max7 = List(BreakStatement_7_0).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = BreakStatement_7_0.applyOrElse(i, (_: Int) => BreakStatement(pYield, pAwait).head)
        s += Statement7(arg0, List(pYield, pAwait, pReturn))
      }
      if (pReturn) {
        val ReturnStatement_8_0 = ReturnStatement(pYield, pAwait).toList
        val max8 = List(ReturnStatement_8_0).map(_.length).max
        for (i <- (0 until max8)) {
          val arg0 = ReturnStatement_8_0.applyOrElse(i, (_: Int) => ReturnStatement(pYield, pAwait).head)
          s += Statement8(arg0, List(pYield, pAwait, pReturn))
        }
      }
      val WithStatement_9_0 = WithStatement(pYield, pAwait, pReturn).toList
      val max9 = List(WithStatement_9_0).map(_.length).max
      for (i <- (0 until max9)) {
        val arg0 = WithStatement_9_0.applyOrElse(i, (_: Int) => WithStatement(pYield, pAwait, pReturn).head)
        s += Statement9(arg0, List(pYield, pAwait, pReturn))
      }
      val LabelledStatement_10_0 = LabelledStatement(pYield, pAwait, pReturn).toList
      val max10 = List(LabelledStatement_10_0).map(_.length).max
      for (i <- (0 until max10)) {
        val arg0 = LabelledStatement_10_0.applyOrElse(i, (_: Int) => LabelledStatement(pYield, pAwait, pReturn).head)
        s += Statement10(arg0, List(pYield, pAwait, pReturn))
      }
      val ThrowStatement_11_0 = ThrowStatement(pYield, pAwait).toList
      val max11 = List(ThrowStatement_11_0).map(_.length).max
      for (i <- (0 until max11)) {
        val arg0 = ThrowStatement_11_0.applyOrElse(i, (_: Int) => ThrowStatement(pYield, pAwait).head)
        s += Statement11(arg0, List(pYield, pAwait, pReturn))
      }
      val TryStatement_12_0 = TryStatement(pYield, pAwait, pReturn).toList
      val max12 = List(TryStatement_12_0).map(_.length).max
      for (i <- (0 until max12)) {
        val arg0 = TryStatement_12_0.applyOrElse(i, (_: Int) => TryStatement(pYield, pAwait, pReturn).head)
        s += Statement12(arg0, List(pYield, pAwait, pReturn))
      }
      val DebuggerStatement_13_0 = DebuggerStatement().toList
      val max13 = List(DebuggerStatement_13_0).map(_.length).max
      for (i <- (0 until max13)) {
        val arg0 = DebuggerStatement_13_0.applyOrElse(i, (_: Int) => DebuggerStatement().head)
        s += Statement13(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.Statement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.Statement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def Declaration(pYield: Boolean, pAwait: Boolean): ScalaSet[Declaration] = {
    if (!visited.contains("Declaration", List(pYield, pAwait))) {
      visited += (("Declaration", List(pYield, pAwait)))
      var s = ScalaSet[Declaration]()
      val HoistableDeclaration_0_0 = HoistableDeclaration(pYield, pAwait, false).toList
      val max0 = List(HoistableDeclaration_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = HoistableDeclaration_0_0.applyOrElse(i, (_: Int) => HoistableDeclaration(pYield, pAwait, false).head)
        s += Declaration0(arg0, List(pYield, pAwait))
      }
      val ClassDeclaration_1_0 = ClassDeclaration(pYield, pAwait, false).toList
      val max1 = List(ClassDeclaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ClassDeclaration_1_0.applyOrElse(i, (_: Int) => ClassDeclaration(pYield, pAwait, false).head)
        s += Declaration1(arg0, List(pYield, pAwait))
      }
      val LexicalDeclaration_2_0 = LexicalDeclaration(true, pYield, pAwait).toList
      val max2 = List(LexicalDeclaration_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = LexicalDeclaration_2_0.applyOrElse(i, (_: Int) => LexicalDeclaration(true, pYield, pAwait).head)
        s += Declaration2(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.Declaration(pYield, pAwait)
      val sample = JSParser.parse(JSParser.Declaration(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[HoistableDeclaration] = {
    if (!visited.contains("HoistableDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("HoistableDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[HoistableDeclaration]()
      val FunctionDeclaration_0_0 = FunctionDeclaration(pYield, pAwait, pDefault).toList
      val max0 = List(FunctionDeclaration_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionDeclaration_0_0.applyOrElse(i, (_: Int) => FunctionDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration0(arg0, List(pYield, pAwait, pDefault))
      }
      val GeneratorDeclaration_1_0 = GeneratorDeclaration(pYield, pAwait, pDefault).toList
      val max1 = List(GeneratorDeclaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = GeneratorDeclaration_1_0.applyOrElse(i, (_: Int) => GeneratorDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration1(arg0, List(pYield, pAwait, pDefault))
      }
      val AsyncFunctionDeclaration_2_0 = AsyncFunctionDeclaration(pYield, pAwait, pDefault).toList
      val max2 = List(AsyncFunctionDeclaration_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AsyncFunctionDeclaration_2_0.applyOrElse(i, (_: Int) => AsyncFunctionDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration2(arg0, List(pYield, pAwait, pDefault))
      }
      val AsyncGeneratorDeclaration_3_0 = AsyncGeneratorDeclaration(pYield, pAwait, pDefault).toList
      val max3 = List(AsyncGeneratorDeclaration_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AsyncGeneratorDeclaration_3_0.applyOrElse(i, (_: Int) => AsyncGeneratorDeclaration(pYield, pAwait, pDefault).head)
        s += HoistableDeclaration3(arg0, List(pYield, pAwait, pDefault))
      }
      s
    } else {
      val str = MinSampler.HoistableDeclaration(pYield, pAwait, pDefault)
      val sample = JSParser.parse(JSParser.HoistableDeclaration(List(pYield, pAwait, pDefault)), str).get
      ScalaSet(sample)
    }
  }
  def BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[BreakableStatement] = {
    if (!visited.contains("BreakableStatement", List(pYield, pAwait, pReturn))) {
      visited += (("BreakableStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[BreakableStatement]()
      val IterationStatement_0_0 = IterationStatement(pYield, pAwait, pReturn).toList
      val max0 = List(IterationStatement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IterationStatement_0_0.applyOrElse(i, (_: Int) => IterationStatement(pYield, pAwait, pReturn).head)
        s += BreakableStatement0(arg0, List(pYield, pAwait, pReturn))
      }
      val SwitchStatement_1_0 = SwitchStatement(pYield, pAwait, pReturn).toList
      val max1 = List(SwitchStatement_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = SwitchStatement_1_0.applyOrElse(i, (_: Int) => SwitchStatement(pYield, pAwait, pReturn).head)
        s += BreakableStatement1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.BreakableStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.BreakableStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[BlockStatement] = {
    if (!visited.contains("BlockStatement", List(pYield, pAwait, pReturn))) {
      visited += (("BlockStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[BlockStatement]()
      val Block_0_0 = Block(pYield, pAwait, pReturn).toList
      val max0 = List(Block_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Block_0_0.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        s += BlockStatement0(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.BlockStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.BlockStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Block] = {
    if (!visited.contains("Block", List(pYield, pAwait, pReturn))) {
      visited += (("Block", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Block]()
      val StatementList_0_1 = StatementList(pYield, pAwait, pReturn).toList
      val max0 = List(StatementList_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_1.applyOrElse(i, (_: Int) => StatementList(pYield, pAwait, pReturn).head)
        s += Block0(Some(arg0), List(pYield, pAwait, pReturn))
        s += Block0(None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.Block(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.Block(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[StatementList] = {
    if (!visited.contains("StatementList", List(pYield, pAwait, pReturn))) {
      visited += (("StatementList", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[StatementList]()
      val StatementListItem_0_0 = StatementListItem(pYield, pAwait, pReturn).toList
      val max0 = List(StatementListItem_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementListItem_0_0.applyOrElse(i, (_: Int) => StatementListItem(pYield, pAwait, pReturn).head)
        s += StatementList0(arg0, List(pYield, pAwait, pReturn))
      }
      val StatementList_1_0 = StatementList(pYield, pAwait, pReturn).toList
      val StatementListItem_1_1 = StatementListItem(pYield, pAwait, pReturn).toList
      val max1 = List(StatementList_1_0, StatementListItem_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = StatementList_1_0.applyOrElse(i, (_: Int) => StatementList(pYield, pAwait, pReturn).head)
        val arg1 = StatementListItem_1_1.applyOrElse(i, (_: Int) => StatementListItem(pYield, pAwait, pReturn).head)
        s += StatementList1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.StatementList(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.StatementList(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[StatementListItem] = {
    if (!visited.contains("StatementListItem", List(pYield, pAwait, pReturn))) {
      visited += (("StatementListItem", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[StatementListItem]()
      val Statement_0_0 = Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Statement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Statement_0_0.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += StatementListItem0(arg0, List(pYield, pAwait, pReturn))
      }
      val Declaration_1_0 = Declaration(pYield, pAwait).toList
      val max1 = List(Declaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Declaration_1_0.applyOrElse(i, (_: Int) => Declaration(pYield, pAwait).head)
        s += StatementListItem1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.StatementListItem(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.StatementListItem(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LexicalDeclaration] = {
    if (!visited.contains("LexicalDeclaration", List(pIn, pYield, pAwait))) {
      visited += (("LexicalDeclaration", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LexicalDeclaration]()
      val LetOrConst_0_0 = LetOrConst().toList
      val BindingList_0_1 = BindingList(pIn, pYield, pAwait).toList
      val max0 = List(LetOrConst_0_0, BindingList_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LetOrConst_0_0.applyOrElse(i, (_: Int) => LetOrConst().head)
        val arg1 = BindingList_0_1.applyOrElse(i, (_: Int) => BindingList(pIn, pYield, pAwait).head)
        s += LexicalDeclaration0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.LexicalDeclaration(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.LexicalDeclaration(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LetOrConst(): ScalaSet[LetOrConst] = {
    if (!visited.contains("LetOrConst", List())) {
      visited += (("LetOrConst", List()))
      var s = ScalaSet[LetOrConst]()
      s += LetOrConst0(List())
      s += LetOrConst1(List())
      s
    } else {
      val str = MinSampler.LetOrConst()
      val sample = JSParser.parse(JSParser.LetOrConst(List()), str).get
      ScalaSet(sample)
    }
  }
  def BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[BindingList] = {
    if (!visited.contains("BindingList", List(pIn, pYield, pAwait))) {
      visited += (("BindingList", List(pIn, pYield, pAwait)))
      var s = ScalaSet[BindingList]()
      val LexicalBinding_0_0 = LexicalBinding(pIn, pYield, pAwait).toList
      val max0 = List(LexicalBinding_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LexicalBinding_0_0.applyOrElse(i, (_: Int) => LexicalBinding(pIn, pYield, pAwait).head)
        s += BindingList0(arg0, List(pIn, pYield, pAwait))
      }
      val BindingList_1_0 = BindingList(pIn, pYield, pAwait).toList
      val LexicalBinding_1_2 = LexicalBinding(pIn, pYield, pAwait).toList
      val max1 = List(BindingList_1_0, LexicalBinding_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingList_1_0.applyOrElse(i, (_: Int) => BindingList(pIn, pYield, pAwait).head)
        val arg1 = LexicalBinding_1_2.applyOrElse(i, (_: Int) => LexicalBinding(pIn, pYield, pAwait).head)
        s += BindingList1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingList(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingList(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[LexicalBinding] = {
    if (!visited.contains("LexicalBinding", List(pIn, pYield, pAwait))) {
      visited += (("LexicalBinding", List(pIn, pYield, pAwait)))
      var s = ScalaSet[LexicalBinding]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, pAwait).toList
      val Initializer_0_1 = Initializer(pIn, pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => Initializer(pIn, pYield, pAwait).head)
        s += LexicalBinding0(arg0, Some(arg1), List(pIn, pYield, pAwait))
        s += LexicalBinding0(arg0, None, List(pIn, pYield, pAwait))
      }
      val BindingPattern_1_0 = BindingPattern(pYield, pAwait).toList
      val Initializer_1_1 = Initializer(pIn, pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0, Initializer_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        val arg1 = Initializer_1_1.applyOrElse(i, (_: Int) => Initializer(pIn, pYield, pAwait).head)
        s += LexicalBinding1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.LexicalBinding(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.LexicalBinding(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def VariableStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[VariableStatement] = {
    if (!visited.contains("VariableStatement", List(pYield, pAwait))) {
      visited += (("VariableStatement", List(pYield, pAwait)))
      var s = ScalaSet[VariableStatement]()
      val VariableDeclarationList_0_1 = VariableDeclarationList(true, pYield, pAwait).toList
      val max0 = List(VariableDeclarationList_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = VariableDeclarationList_0_1.applyOrElse(i, (_: Int) => VariableDeclarationList(true, pYield, pAwait).head)
        s += VariableStatement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.VariableStatement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.VariableStatement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[VariableDeclarationList] = {
    if (!visited.contains("VariableDeclarationList", List(pIn, pYield, pAwait))) {
      visited += (("VariableDeclarationList", List(pIn, pYield, pAwait)))
      var s = ScalaSet[VariableDeclarationList]()
      val VariableDeclaration_0_0 = VariableDeclaration(pIn, pYield, pAwait).toList
      val max0 = List(VariableDeclaration_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = VariableDeclaration_0_0.applyOrElse(i, (_: Int) => VariableDeclaration(pIn, pYield, pAwait).head)
        s += VariableDeclarationList0(arg0, List(pIn, pYield, pAwait))
      }
      val VariableDeclarationList_1_0 = VariableDeclarationList(pIn, pYield, pAwait).toList
      val VariableDeclaration_1_2 = VariableDeclaration(pIn, pYield, pAwait).toList
      val max1 = List(VariableDeclarationList_1_0, VariableDeclaration_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = VariableDeclarationList_1_0.applyOrElse(i, (_: Int) => VariableDeclarationList(pIn, pYield, pAwait).head)
        val arg1 = VariableDeclaration_1_2.applyOrElse(i, (_: Int) => VariableDeclaration(pIn, pYield, pAwait).head)
        s += VariableDeclarationList1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.VariableDeclarationList(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.VariableDeclarationList(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[VariableDeclaration] = {
    if (!visited.contains("VariableDeclaration", List(pIn, pYield, pAwait))) {
      visited += (("VariableDeclaration", List(pIn, pYield, pAwait)))
      var s = ScalaSet[VariableDeclaration]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, pAwait).toList
      val Initializer_0_1 = Initializer(pIn, pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => Initializer(pIn, pYield, pAwait).head)
        s += VariableDeclaration0(arg0, Some(arg1), List(pIn, pYield, pAwait))
        s += VariableDeclaration0(arg0, None, List(pIn, pYield, pAwait))
      }
      val BindingPattern_1_0 = BindingPattern(pYield, pAwait).toList
      val Initializer_1_1 = Initializer(pIn, pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0, Initializer_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        val arg1 = Initializer_1_1.applyOrElse(i, (_: Int) => Initializer(pIn, pYield, pAwait).head)
        s += VariableDeclaration1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.VariableDeclaration(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.VariableDeclaration(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingPattern] = {
    if (!visited.contains("BindingPattern", List(pYield, pAwait))) {
      visited += (("BindingPattern", List(pYield, pAwait)))
      var s = ScalaSet[BindingPattern]()
      val ObjectBindingPattern_0_0 = ObjectBindingPattern(pYield, pAwait).toList
      val max0 = List(ObjectBindingPattern_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ObjectBindingPattern_0_0.applyOrElse(i, (_: Int) => ObjectBindingPattern(pYield, pAwait).head)
        s += BindingPattern0(arg0, List(pYield, pAwait))
      }
      val ArrayBindingPattern_1_0 = ArrayBindingPattern(pYield, pAwait).toList
      val max1 = List(ArrayBindingPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ArrayBindingPattern_1_0.applyOrElse(i, (_: Int) => ArrayBindingPattern(pYield, pAwait).head)
        s += BindingPattern1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingPattern(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingPattern(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ObjectBindingPattern] = {
    if (!visited.contains("ObjectBindingPattern", List(pYield, pAwait))) {
      visited += (("ObjectBindingPattern", List(pYield, pAwait)))
      var s = ScalaSet[ObjectBindingPattern]()
      s += ObjectBindingPattern0(List(pYield, pAwait))
      val BindingRestProperty_1_1 = BindingRestProperty(pYield, pAwait).toList
      val max1 = List(BindingRestProperty_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingRestProperty_1_1.applyOrElse(i, (_: Int) => BindingRestProperty(pYield, pAwait).head)
        s += ObjectBindingPattern1(arg0, List(pYield, pAwait))
      }
      val BindingPropertyList_2_1 = BindingPropertyList(pYield, pAwait).toList
      val max2 = List(BindingPropertyList_2_1).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = BindingPropertyList_2_1.applyOrElse(i, (_: Int) => BindingPropertyList(pYield, pAwait).head)
        s += ObjectBindingPattern2(arg0, List(pYield, pAwait))
      }
      val BindingPropertyList_3_1 = BindingPropertyList(pYield, pAwait).toList
      val BindingRestProperty_3_3 = BindingRestProperty(pYield, pAwait).toList
      val max3 = List(BindingPropertyList_3_1, BindingRestProperty_3_3).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = BindingPropertyList_3_1.applyOrElse(i, (_: Int) => BindingPropertyList(pYield, pAwait).head)
        val arg1 = BindingRestProperty_3_3.applyOrElse(i, (_: Int) => BindingRestProperty(pYield, pAwait).head)
        s += ObjectBindingPattern3(arg0, Some(arg1), List(pYield, pAwait))
        s += ObjectBindingPattern3(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ObjectBindingPattern(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ObjectBindingPattern(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrayBindingPattern] = {
    if (!visited.contains("ArrayBindingPattern", List(pYield, pAwait))) {
      visited += (("ArrayBindingPattern", List(pYield, pAwait)))
      var s = ScalaSet[ArrayBindingPattern]()
      val Elision_0_1 = Elision().toList
      val BindingRestElement_0_2 = BindingRestElement(pYield, pAwait).toList
      val max0 = List(Elision_0_1, BindingRestElement_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_1.applyOrElse(i, (_: Int) => Elision().head)
        val arg1 = BindingRestElement_0_2.applyOrElse(i, (_: Int) => BindingRestElement(pYield, pAwait).head)
        s += ArrayBindingPattern0(Some(arg0), Some(arg1), List(pYield, pAwait))
        s += ArrayBindingPattern0(Some(arg0), None, List(pYield, pAwait))
        s += ArrayBindingPattern0(None, Some(arg1), List(pYield, pAwait))
        s += ArrayBindingPattern0(None, None, List(pYield, pAwait))
      }
      val BindingElementList_1_1 = BindingElementList(pYield, pAwait).toList
      val max1 = List(BindingElementList_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingElementList_1_1.applyOrElse(i, (_: Int) => BindingElementList(pYield, pAwait).head)
        s += ArrayBindingPattern1(arg0, List(pYield, pAwait))
      }
      val BindingElementList_2_1 = BindingElementList(pYield, pAwait).toList
      val Elision_2_3 = Elision().toList
      val BindingRestElement_2_4 = BindingRestElement(pYield, pAwait).toList
      val max2 = List(BindingElementList_2_1, Elision_2_3, BindingRestElement_2_4).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = BindingElementList_2_1.applyOrElse(i, (_: Int) => BindingElementList(pYield, pAwait).head)
        val arg1 = Elision_2_3.applyOrElse(i, (_: Int) => Elision().head)
        val arg2 = BindingRestElement_2_4.applyOrElse(i, (_: Int) => BindingRestElement(pYield, pAwait).head)
        s += ArrayBindingPattern2(arg0, Some(arg1), Some(arg2), List(pYield, pAwait))
        s += ArrayBindingPattern2(arg0, Some(arg1), None, List(pYield, pAwait))
        s += ArrayBindingPattern2(arg0, None, Some(arg2), List(pYield, pAwait))
        s += ArrayBindingPattern2(arg0, None, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArrayBindingPattern(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArrayBindingPattern(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingRestProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingRestProperty] = {
    if (!visited.contains("BindingRestProperty", List(pYield, pAwait))) {
      visited += (("BindingRestProperty", List(pYield, pAwait)))
      var s = ScalaSet[BindingRestProperty]()
      val BindingIdentifier_0_1 = BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += BindingRestProperty0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingRestProperty(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingRestProperty(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingPropertyList(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingPropertyList] = {
    if (!visited.contains("BindingPropertyList", List(pYield, pAwait))) {
      visited += (("BindingPropertyList", List(pYield, pAwait)))
      var s = ScalaSet[BindingPropertyList]()
      val BindingProperty_0_0 = BindingProperty(pYield, pAwait).toList
      val max0 = List(BindingProperty_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingProperty_0_0.applyOrElse(i, (_: Int) => BindingProperty(pYield, pAwait).head)
        s += BindingPropertyList0(arg0, List(pYield, pAwait))
      }
      val BindingPropertyList_1_0 = BindingPropertyList(pYield, pAwait).toList
      val BindingProperty_1_2 = BindingProperty(pYield, pAwait).toList
      val max1 = List(BindingPropertyList_1_0, BindingProperty_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPropertyList_1_0.applyOrElse(i, (_: Int) => BindingPropertyList(pYield, pAwait).head)
        val arg1 = BindingProperty_1_2.applyOrElse(i, (_: Int) => BindingProperty(pYield, pAwait).head)
        s += BindingPropertyList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingPropertyList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingPropertyList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElementList] = {
    if (!visited.contains("BindingElementList", List(pYield, pAwait))) {
      visited += (("BindingElementList", List(pYield, pAwait)))
      var s = ScalaSet[BindingElementList]()
      val BindingElisionElement_0_0 = BindingElisionElement(pYield, pAwait).toList
      val max0 = List(BindingElisionElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingElisionElement_0_0.applyOrElse(i, (_: Int) => BindingElisionElement(pYield, pAwait).head)
        s += BindingElementList0(arg0, List(pYield, pAwait))
      }
      val BindingElementList_1_0 = BindingElementList(pYield, pAwait).toList
      val BindingElisionElement_1_2 = BindingElisionElement(pYield, pAwait).toList
      val max1 = List(BindingElementList_1_0, BindingElisionElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingElementList_1_0.applyOrElse(i, (_: Int) => BindingElementList(pYield, pAwait).head)
        val arg1 = BindingElisionElement_1_2.applyOrElse(i, (_: Int) => BindingElisionElement(pYield, pAwait).head)
        s += BindingElementList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingElementList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingElementList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingElisionElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElisionElement] = {
    if (!visited.contains("BindingElisionElement", List(pYield, pAwait))) {
      visited += (("BindingElisionElement", List(pYield, pAwait)))
      var s = ScalaSet[BindingElisionElement]()
      val Elision_0_0 = Elision().toList
      val BindingElement_0_1 = BindingElement(pYield, pAwait).toList
      val max0 = List(Elision_0_0, BindingElement_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Elision_0_0.applyOrElse(i, (_: Int) => Elision().head)
        val arg1 = BindingElement_0_1.applyOrElse(i, (_: Int) => BindingElement(pYield, pAwait).head)
        s += BindingElisionElement0(Some(arg0), arg1, List(pYield, pAwait))
        s += BindingElisionElement0(None, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingElisionElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingElisionElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingProperty(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingProperty] = {
    if (!visited.contains("BindingProperty", List(pYield, pAwait))) {
      visited += (("BindingProperty", List(pYield, pAwait)))
      var s = ScalaSet[BindingProperty]()
      val SingleNameBinding_0_0 = SingleNameBinding(pYield, pAwait).toList
      val max0 = List(SingleNameBinding_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = SingleNameBinding_0_0.applyOrElse(i, (_: Int) => SingleNameBinding(pYield, pAwait).head)
        s += BindingProperty0(arg0, List(pYield, pAwait))
      }
      val PropertyName_1_0 = PropertyName(pYield, pAwait).toList
      val BindingElement_1_2 = BindingElement(pYield, pAwait).toList
      val max1 = List(PropertyName_1_0, BindingElement_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = PropertyName_1_0.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = BindingElement_1_2.applyOrElse(i, (_: Int) => BindingElement(pYield, pAwait).head)
        s += BindingProperty1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingProperty(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingProperty(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingElement] = {
    if (!visited.contains("BindingElement", List(pYield, pAwait))) {
      visited += (("BindingElement", List(pYield, pAwait)))
      var s = ScalaSet[BindingElement]()
      val SingleNameBinding_0_0 = SingleNameBinding(pYield, pAwait).toList
      val max0 = List(SingleNameBinding_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = SingleNameBinding_0_0.applyOrElse(i, (_: Int) => SingleNameBinding(pYield, pAwait).head)
        s += BindingElement0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_0 = BindingPattern(pYield, pAwait).toList
      val Initializer_1_1 = Initializer(true, pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0, Initializer_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        val arg1 = Initializer_1_1.applyOrElse(i, (_: Int) => Initializer(true, pYield, pAwait).head)
        s += BindingElement1(arg0, Some(arg1), List(pYield, pAwait))
        s += BindingElement1(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def SingleNameBinding(pYield: Boolean, pAwait: Boolean): ScalaSet[SingleNameBinding] = {
    if (!visited.contains("SingleNameBinding", List(pYield, pAwait))) {
      visited += (("SingleNameBinding", List(pYield, pAwait)))
      var s = ScalaSet[SingleNameBinding]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, pAwait).toList
      val Initializer_0_1 = Initializer(true, pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0, Initializer_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = Initializer_0_1.applyOrElse(i, (_: Int) => Initializer(true, pYield, pAwait).head)
        s += SingleNameBinding0(arg0, Some(arg1), List(pYield, pAwait))
        s += SingleNameBinding0(arg0, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.SingleNameBinding(pYield, pAwait)
      val sample = JSParser.parse(JSParser.SingleNameBinding(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BindingRestElement(pYield: Boolean, pAwait: Boolean): ScalaSet[BindingRestElement] = {
    if (!visited.contains("BindingRestElement", List(pYield, pAwait))) {
      visited += (("BindingRestElement", List(pYield, pAwait)))
      var s = ScalaSet[BindingRestElement]()
      val BindingIdentifier_0_1 = BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += BindingRestElement0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_1 = BindingPattern(pYield, pAwait).toList
      val max1 = List(BindingPattern_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_1.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        s += BindingRestElement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BindingRestElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BindingRestElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def EmptyStatement(): ScalaSet[EmptyStatement] = {
    if (!visited.contains("EmptyStatement", List())) {
      visited += (("EmptyStatement", List()))
      var s = ScalaSet[EmptyStatement]()
      s += EmptyStatement0(List())
      s
    } else {
      val str = MinSampler.EmptyStatement()
      val sample = JSParser.parse(JSParser.EmptyStatement(List()), str).get
      ScalaSet(sample)
    }
  }
  def ExpressionStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ExpressionStatement] = {
    if (!visited.contains("ExpressionStatement", List(pYield, pAwait))) {
      visited += (("ExpressionStatement", List(pYield, pAwait)))
      var s = ScalaSet[ExpressionStatement]()
      val Expression_0_1 = Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += ExpressionStatement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ExpressionStatement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ExpressionStatement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[IfStatement] = {
    if (!visited.contains("IfStatement", List(pYield, pAwait, pReturn))) {
      visited += (("IfStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[IfStatement]()
      val Expression_0_2 = Expression(true, pYield, pAwait).toList
      val Statement_0_4 = Statement(pYield, pAwait, pReturn).toList
      val Statement_0_6 = Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_2, Statement_0_4, Statement_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = Statement_0_4.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        val arg2 = Statement_0_6.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IfStatement0(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val Expression_1_2 = Expression(true, pYield, pAwait).toList
      val Statement_1_4 = Statement(pYield, pAwait, pReturn).toList
      val max1 = List(Expression_1_2, Statement_1_4).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = Statement_1_4.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IfStatement1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.IfStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.IfStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[IterationStatement] = {
    if (!visited.contains("IterationStatement", List(pYield, pAwait, pReturn))) {
      visited += (("IterationStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[IterationStatement]()
      val Statement_0_1 = Statement(pYield, pAwait, pReturn).toList
      val Expression_0_4 = Expression(true, pYield, pAwait).toList
      val max0 = List(Statement_0_1, Expression_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Statement_0_1.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        val arg1 = Expression_0_4.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += IterationStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Expression_1_2 = Expression(true, pYield, pAwait).toList
      val Statement_1_4 = Statement(pYield, pAwait, pReturn).toList
      val max1 = List(Expression_1_2, Statement_1_4).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = Statement_1_4.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Expression_2_3 = Expression(false, pYield, pAwait).toList
      val Expression_2_5 = Expression(true, pYield, pAwait).toList
      val Expression_2_7 = Expression(true, pYield, pAwait).toList
      val Statement_2_9 = Statement(pYield, pAwait, pReturn).toList
      val max2 = List(Expression_2_3, Expression_2_5, Expression_2_7, Statement_2_9).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = Expression_2_3.applyOrElse(i, (_: Int) => Expression(false, pYield, pAwait).head)
        val arg1 = Expression_2_5.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = Expression_2_7.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg3 = Statement_2_9.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement2(Some(arg0), Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(Some(arg0), Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(Some(arg0), None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(Some(arg0), None, None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement2(None, None, None, arg3, List(pYield, pAwait, pReturn))
      }
      val VariableDeclarationList_3_3 = VariableDeclarationList(false, pYield, pAwait).toList
      val Expression_3_5 = Expression(true, pYield, pAwait).toList
      val Expression_3_7 = Expression(true, pYield, pAwait).toList
      val Statement_3_9 = Statement(pYield, pAwait, pReturn).toList
      val max3 = List(VariableDeclarationList_3_3, Expression_3_5, Expression_3_7, Statement_3_9).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = VariableDeclarationList_3_3.applyOrElse(i, (_: Int) => VariableDeclarationList(false, pYield, pAwait).head)
        val arg1 = Expression_3_5.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = Expression_3_7.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg3 = Statement_3_9.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement3(arg0, Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement3(arg0, Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement3(arg0, None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement3(arg0, None, None, arg3, List(pYield, pAwait, pReturn))
      }
      val LexicalDeclaration_4_2 = LexicalDeclaration(false, pYield, pAwait).toList
      val Expression_4_3 = Expression(true, pYield, pAwait).toList
      val Expression_4_5 = Expression(true, pYield, pAwait).toList
      val Statement_4_7 = Statement(pYield, pAwait, pReturn).toList
      val max4 = List(LexicalDeclaration_4_2, Expression_4_3, Expression_4_5, Statement_4_7).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = LexicalDeclaration_4_2.applyOrElse(i, (_: Int) => LexicalDeclaration(false, pYield, pAwait).head)
        val arg1 = Expression_4_3.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = Expression_4_5.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg3 = Statement_4_7.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement4(arg0, Some(arg1), Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement4(arg0, Some(arg1), None, arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement4(arg0, None, Some(arg2), arg3, List(pYield, pAwait, pReturn))
        s += IterationStatement4(arg0, None, None, arg3, List(pYield, pAwait, pReturn))
      }
      val LeftHandSideExpression_5_3 = LeftHandSideExpression(pYield, pAwait).toList
      val Expression_5_5 = Expression(true, pYield, pAwait).toList
      val Statement_5_7 = Statement(pYield, pAwait, pReturn).toList
      val max5 = List(LeftHandSideExpression_5_3, Expression_5_5, Statement_5_7).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = LeftHandSideExpression_5_3.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = Expression_5_5.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = Statement_5_7.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement5(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForBinding_6_3 = ForBinding(pYield, pAwait).toList
      val Expression_6_5 = Expression(true, pYield, pAwait).toList
      val Statement_6_7 = Statement(pYield, pAwait, pReturn).toList
      val max6 = List(ForBinding_6_3, Expression_6_5, Statement_6_7).map(_.length).max
      for (i <- (0 until max6)) {
        val arg0 = ForBinding_6_3.applyOrElse(i, (_: Int) => ForBinding(pYield, pAwait).head)
        val arg1 = Expression_6_5.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = Statement_6_7.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement6(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForDeclaration_7_2 = ForDeclaration(pYield, pAwait).toList
      val Expression_7_4 = Expression(true, pYield, pAwait).toList
      val Statement_7_6 = Statement(pYield, pAwait, pReturn).toList
      val max7 = List(ForDeclaration_7_2, Expression_7_4, Statement_7_6).map(_.length).max
      for (i <- (0 until max7)) {
        val arg0 = ForDeclaration_7_2.applyOrElse(i, (_: Int) => ForDeclaration(pYield, pAwait).head)
        val arg1 = Expression_7_4.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg2 = Statement_7_6.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement7(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val LeftHandSideExpression_8_3 = LeftHandSideExpression(pYield, pAwait).toList
      val AssignmentExpression_8_5 = AssignmentExpression(true, pYield, pAwait).toList
      val Statement_8_7 = Statement(pYield, pAwait, pReturn).toList
      val max8 = List(LeftHandSideExpression_8_3, AssignmentExpression_8_5, Statement_8_7).map(_.length).max
      for (i <- (0 until max8)) {
        val arg0 = LeftHandSideExpression_8_3.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        val arg1 = AssignmentExpression_8_5.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = Statement_8_7.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement8(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForBinding_9_3 = ForBinding(pYield, pAwait).toList
      val AssignmentExpression_9_5 = AssignmentExpression(true, pYield, pAwait).toList
      val Statement_9_7 = Statement(pYield, pAwait, pReturn).toList
      val max9 = List(ForBinding_9_3, AssignmentExpression_9_5, Statement_9_7).map(_.length).max
      for (i <- (0 until max9)) {
        val arg0 = ForBinding_9_3.applyOrElse(i, (_: Int) => ForBinding(pYield, pAwait).head)
        val arg1 = AssignmentExpression_9_5.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = Statement_9_7.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement9(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      val ForDeclaration_10_2 = ForDeclaration(pYield, pAwait).toList
      val AssignmentExpression_10_4 = AssignmentExpression(true, pYield, pAwait).toList
      val Statement_10_6 = Statement(pYield, pAwait, pReturn).toList
      val max10 = List(ForDeclaration_10_2, AssignmentExpression_10_4, Statement_10_6).map(_.length).max
      for (i <- (0 until max10)) {
        val arg0 = ForDeclaration_10_2.applyOrElse(i, (_: Int) => ForDeclaration(pYield, pAwait).head)
        val arg1 = AssignmentExpression_10_4.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
        val arg2 = Statement_10_6.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += IterationStatement10(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      if (pAwait) {
        val LeftHandSideExpression_11_4 = LeftHandSideExpression(pYield, pAwait).toList
        val AssignmentExpression_11_6 = AssignmentExpression(true, pYield, pAwait).toList
        val Statement_11_8 = Statement(pYield, pAwait, pReturn).toList
        val max11 = List(LeftHandSideExpression_11_4, AssignmentExpression_11_6, Statement_11_8).map(_.length).max
        for (i <- (0 until max11)) {
          val arg0 = LeftHandSideExpression_11_4.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
          val arg1 = AssignmentExpression_11_6.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
          val arg2 = Statement_11_8.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
          s += IterationStatement11(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
        }
      }
      if (pAwait) {
        val ForBinding_12_4 = ForBinding(pYield, pAwait).toList
        val AssignmentExpression_12_6 = AssignmentExpression(true, pYield, pAwait).toList
        val Statement_12_8 = Statement(pYield, pAwait, pReturn).toList
        val max12 = List(ForBinding_12_4, AssignmentExpression_12_6, Statement_12_8).map(_.length).max
        for (i <- (0 until max12)) {
          val arg0 = ForBinding_12_4.applyOrElse(i, (_: Int) => ForBinding(pYield, pAwait).head)
          val arg1 = AssignmentExpression_12_6.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
          val arg2 = Statement_12_8.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
          s += IterationStatement12(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
        }
      }
      if (pAwait) {
        val ForDeclaration_13_3 = ForDeclaration(pYield, pAwait).toList
        val AssignmentExpression_13_5 = AssignmentExpression(true, pYield, pAwait).toList
        val Statement_13_7 = Statement(pYield, pAwait, pReturn).toList
        val max13 = List(ForDeclaration_13_3, AssignmentExpression_13_5, Statement_13_7).map(_.length).max
        for (i <- (0 until max13)) {
          val arg0 = ForDeclaration_13_3.applyOrElse(i, (_: Int) => ForDeclaration(pYield, pAwait).head)
          val arg1 = AssignmentExpression_13_5.applyOrElse(i, (_: Int) => AssignmentExpression(true, pYield, pAwait).head)
          val arg2 = Statement_13_7.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
          s += IterationStatement13(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
        }
      }
      s
    } else {
      val str = MinSampler.IterationStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.IterationStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def ForDeclaration(pYield: Boolean, pAwait: Boolean): ScalaSet[ForDeclaration] = {
    if (!visited.contains("ForDeclaration", List(pYield, pAwait))) {
      visited += (("ForDeclaration", List(pYield, pAwait)))
      var s = ScalaSet[ForDeclaration]()
      val LetOrConst_0_0 = LetOrConst().toList
      val ForBinding_0_1 = ForBinding(pYield, pAwait).toList
      val max0 = List(LetOrConst_0_0, ForBinding_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LetOrConst_0_0.applyOrElse(i, (_: Int) => LetOrConst().head)
        val arg1 = ForBinding_0_1.applyOrElse(i, (_: Int) => ForBinding(pYield, pAwait).head)
        s += ForDeclaration0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ForDeclaration(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ForDeclaration(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ForBinding(pYield: Boolean, pAwait: Boolean): ScalaSet[ForBinding] = {
    if (!visited.contains("ForBinding", List(pYield, pAwait))) {
      visited += (("ForBinding", List(pYield, pAwait)))
      var s = ScalaSet[ForBinding]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += ForBinding0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_0 = BindingPattern(pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        s += ForBinding1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ForBinding(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ForBinding(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ContinueStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ContinueStatement] = {
    if (!visited.contains("ContinueStatement", List(pYield, pAwait))) {
      visited += (("ContinueStatement", List(pYield, pAwait)))
      var s = ScalaSet[ContinueStatement]()
      s += ContinueStatement0(List(pYield, pAwait))
      val LabelIdentifier_1_2 = LabelIdentifier(pYield, pAwait).toList
      val max1 = List(LabelIdentifier_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LabelIdentifier_1_2.applyOrElse(i, (_: Int) => LabelIdentifier(pYield, pAwait).head)
        s += ContinueStatement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ContinueStatement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ContinueStatement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def BreakStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[BreakStatement] = {
    if (!visited.contains("BreakStatement", List(pYield, pAwait))) {
      visited += (("BreakStatement", List(pYield, pAwait)))
      var s = ScalaSet[BreakStatement]()
      s += BreakStatement0(List(pYield, pAwait))
      val LabelIdentifier_1_2 = LabelIdentifier(pYield, pAwait).toList
      val max1 = List(LabelIdentifier_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = LabelIdentifier_1_2.applyOrElse(i, (_: Int) => LabelIdentifier(pYield, pAwait).head)
        s += BreakStatement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.BreakStatement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.BreakStatement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ReturnStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ReturnStatement] = {
    if (!visited.contains("ReturnStatement", List(pYield, pAwait))) {
      visited += (("ReturnStatement", List(pYield, pAwait)))
      var s = ScalaSet[ReturnStatement]()
      s += ReturnStatement0(List(pYield, pAwait))
      val Expression_1_2 = Expression(true, pYield, pAwait).toList
      val max1 = List(Expression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Expression_1_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += ReturnStatement1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ReturnStatement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ReturnStatement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[WithStatement] = {
    if (!visited.contains("WithStatement", List(pYield, pAwait, pReturn))) {
      visited += (("WithStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[WithStatement]()
      val Expression_0_2 = Expression(true, pYield, pAwait).toList
      val Statement_0_4 = Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_2, Statement_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = Statement_0_4.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += WithStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.WithStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.WithStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[SwitchStatement] = {
    if (!visited.contains("SwitchStatement", List(pYield, pAwait, pReturn))) {
      visited += (("SwitchStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[SwitchStatement]()
      val Expression_0_2 = Expression(true, pYield, pAwait).toList
      val CaseBlock_0_4 = CaseBlock(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_2, CaseBlock_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = CaseBlock_0_4.applyOrElse(i, (_: Int) => CaseBlock(pYield, pAwait, pReturn).head)
        s += SwitchStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.SwitchStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.SwitchStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseBlock] = {
    if (!visited.contains("CaseBlock", List(pYield, pAwait, pReturn))) {
      visited += (("CaseBlock", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[CaseBlock]()
      val CaseClauses_0_1 = CaseClauses(pYield, pAwait, pReturn).toList
      val max0 = List(CaseClauses_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CaseClauses_0_1.applyOrElse(i, (_: Int) => CaseClauses(pYield, pAwait, pReturn).head)
        s += CaseBlock0(Some(arg0), List(pYield, pAwait, pReturn))
        s += CaseBlock0(None, List(pYield, pAwait, pReturn))
      }
      val CaseClauses_1_1 = CaseClauses(pYield, pAwait, pReturn).toList
      val DefaultClause_1_2 = DefaultClause(pYield, pAwait, pReturn).toList
      val CaseClauses_1_3 = CaseClauses(pYield, pAwait, pReturn).toList
      val max1 = List(CaseClauses_1_1, DefaultClause_1_2, CaseClauses_1_3).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CaseClauses_1_1.applyOrElse(i, (_: Int) => CaseClauses(pYield, pAwait, pReturn).head)
        val arg1 = DefaultClause_1_2.applyOrElse(i, (_: Int) => DefaultClause(pYield, pAwait, pReturn).head)
        val arg2 = CaseClauses_1_3.applyOrElse(i, (_: Int) => CaseClauses(pYield, pAwait, pReturn).head)
        s += CaseBlock1(Some(arg0), arg1, Some(arg2), List(pYield, pAwait, pReturn))
        s += CaseBlock1(Some(arg0), arg1, None, List(pYield, pAwait, pReturn))
        s += CaseBlock1(None, arg1, Some(arg2), List(pYield, pAwait, pReturn))
        s += CaseBlock1(None, arg1, None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.CaseBlock(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.CaseBlock(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseClauses] = {
    if (!visited.contains("CaseClauses", List(pYield, pAwait, pReturn))) {
      visited += (("CaseClauses", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[CaseClauses]()
      val CaseClause_0_0 = CaseClause(pYield, pAwait, pReturn).toList
      val max0 = List(CaseClause_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CaseClause_0_0.applyOrElse(i, (_: Int) => CaseClause(pYield, pAwait, pReturn).head)
        s += CaseClauses0(arg0, List(pYield, pAwait, pReturn))
      }
      val CaseClauses_1_0 = CaseClauses(pYield, pAwait, pReturn).toList
      val CaseClause_1_1 = CaseClause(pYield, pAwait, pReturn).toList
      val max1 = List(CaseClauses_1_0, CaseClause_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CaseClauses_1_0.applyOrElse(i, (_: Int) => CaseClauses(pYield, pAwait, pReturn).head)
        val arg1 = CaseClause_1_1.applyOrElse(i, (_: Int) => CaseClause(pYield, pAwait, pReturn).head)
        s += CaseClauses1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.CaseClauses(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.CaseClauses(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[CaseClause] = {
    if (!visited.contains("CaseClause", List(pYield, pAwait, pReturn))) {
      visited += (("CaseClause", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[CaseClause]()
      val Expression_0_1 = Expression(true, pYield, pAwait).toList
      val StatementList_0_3 = StatementList(pYield, pAwait, pReturn).toList
      val max0 = List(Expression_0_1, StatementList_0_3).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_1.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        val arg1 = StatementList_0_3.applyOrElse(i, (_: Int) => StatementList(pYield, pAwait, pReturn).head)
        s += CaseClause0(arg0, Some(arg1), List(pYield, pAwait, pReturn))
        s += CaseClause0(arg0, None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.CaseClause(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.CaseClause(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[DefaultClause] = {
    if (!visited.contains("DefaultClause", List(pYield, pAwait, pReturn))) {
      visited += (("DefaultClause", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[DefaultClause]()
      val StatementList_0_2 = StatementList(pYield, pAwait, pReturn).toList
      val max0 = List(StatementList_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_2.applyOrElse(i, (_: Int) => StatementList(pYield, pAwait, pReturn).head)
        s += DefaultClause0(Some(arg0), List(pYield, pAwait, pReturn))
        s += DefaultClause0(None, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.DefaultClause(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.DefaultClause(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[LabelledStatement] = {
    if (!visited.contains("LabelledStatement", List(pYield, pAwait, pReturn))) {
      visited += (("LabelledStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[LabelledStatement]()
      val LabelIdentifier_0_0 = LabelIdentifier(pYield, pAwait).toList
      val LabelledItem_0_2 = LabelledItem(pYield, pAwait, pReturn).toList
      val max0 = List(LabelIdentifier_0_0, LabelledItem_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LabelIdentifier_0_0.applyOrElse(i, (_: Int) => LabelIdentifier(pYield, pAwait).head)
        val arg1 = LabelledItem_0_2.applyOrElse(i, (_: Int) => LabelledItem(pYield, pAwait, pReturn).head)
        s += LabelledStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.LabelledStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.LabelledStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[LabelledItem] = {
    if (!visited.contains("LabelledItem", List(pYield, pAwait, pReturn))) {
      visited += (("LabelledItem", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[LabelledItem]()
      val Statement_0_0 = Statement(pYield, pAwait, pReturn).toList
      val max0 = List(Statement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Statement_0_0.applyOrElse(i, (_: Int) => Statement(pYield, pAwait, pReturn).head)
        s += LabelledItem0(arg0, List(pYield, pAwait, pReturn))
      }
      val FunctionDeclaration_1_0 = FunctionDeclaration(pYield, pAwait, false).toList
      val max1 = List(FunctionDeclaration_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FunctionDeclaration_1_0.applyOrElse(i, (_: Int) => FunctionDeclaration(pYield, pAwait, false).head)
        s += LabelledItem1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.LabelledItem(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.LabelledItem(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def ThrowStatement(pYield: Boolean, pAwait: Boolean): ScalaSet[ThrowStatement] = {
    if (!visited.contains("ThrowStatement", List(pYield, pAwait))) {
      visited += (("ThrowStatement", List(pYield, pAwait)))
      var s = ScalaSet[ThrowStatement]()
      val Expression_0_2 = Expression(true, pYield, pAwait).toList
      val max0 = List(Expression_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Expression_0_2.applyOrElse(i, (_: Int) => Expression(true, pYield, pAwait).head)
        s += ThrowStatement0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ThrowStatement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ThrowStatement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[TryStatement] = {
    if (!visited.contains("TryStatement", List(pYield, pAwait, pReturn))) {
      visited += (("TryStatement", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[TryStatement]()
      val Block_0_1 = Block(pYield, pAwait, pReturn).toList
      val Catch_0_2 = Catch(pYield, pAwait, pReturn).toList
      val max0 = List(Block_0_1, Catch_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Block_0_1.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        val arg1 = Catch_0_2.applyOrElse(i, (_: Int) => Catch(pYield, pAwait, pReturn).head)
        s += TryStatement0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Block_1_1 = Block(pYield, pAwait, pReturn).toList
      val Finally_1_2 = Finally(pYield, pAwait, pReturn).toList
      val max1 = List(Block_1_1, Finally_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Block_1_1.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        val arg1 = Finally_1_2.applyOrElse(i, (_: Int) => Finally(pYield, pAwait, pReturn).head)
        s += TryStatement1(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Block_2_1 = Block(pYield, pAwait, pReturn).toList
      val Catch_2_2 = Catch(pYield, pAwait, pReturn).toList
      val Finally_2_3 = Finally(pYield, pAwait, pReturn).toList
      val max2 = List(Block_2_1, Catch_2_2, Finally_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = Block_2_1.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        val arg1 = Catch_2_2.applyOrElse(i, (_: Int) => Catch(pYield, pAwait, pReturn).head)
        val arg2 = Finally_2_3.applyOrElse(i, (_: Int) => Finally(pYield, pAwait, pReturn).head)
        s += TryStatement2(arg0, arg1, arg2, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.TryStatement(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.TryStatement(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Catch] = {
    if (!visited.contains("Catch", List(pYield, pAwait, pReturn))) {
      visited += (("Catch", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Catch]()
      val CatchParameter_0_2 = CatchParameter(pYield, pAwait).toList
      val Block_0_4 = Block(pYield, pAwait, pReturn).toList
      val max0 = List(CatchParameter_0_2, Block_0_4).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = CatchParameter_0_2.applyOrElse(i, (_: Int) => CatchParameter(pYield, pAwait).head)
        val arg1 = Block_0_4.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        s += Catch0(arg0, arg1, List(pYield, pAwait, pReturn))
      }
      val Block_1_1 = Block(pYield, pAwait, pReturn).toList
      val max1 = List(Block_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = Block_1_1.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        s += Catch1(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.Catch(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.Catch(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): ScalaSet[Finally] = {
    if (!visited.contains("Finally", List(pYield, pAwait, pReturn))) {
      visited += (("Finally", List(pYield, pAwait, pReturn)))
      var s = ScalaSet[Finally]()
      val Block_0_1 = Block(pYield, pAwait, pReturn).toList
      val max0 = List(Block_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = Block_0_1.applyOrElse(i, (_: Int) => Block(pYield, pAwait, pReturn).head)
        s += Finally0(arg0, List(pYield, pAwait, pReturn))
      }
      s
    } else {
      val str = MinSampler.Finally(pYield, pAwait, pReturn)
      val sample = JSParser.parse(JSParser.Finally(List(pYield, pAwait, pReturn)), str).get
      ScalaSet(sample)
    }
  }
  def CatchParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[CatchParameter] = {
    if (!visited.contains("CatchParameter", List(pYield, pAwait))) {
      visited += (("CatchParameter", List(pYield, pAwait)))
      var s = ScalaSet[CatchParameter]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += CatchParameter0(arg0, List(pYield, pAwait))
      }
      val BindingPattern_1_0 = BindingPattern(pYield, pAwait).toList
      val max1 = List(BindingPattern_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingPattern_1_0.applyOrElse(i, (_: Int) => BindingPattern(pYield, pAwait).head)
        s += CatchParameter1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CatchParameter(pYield, pAwait)
      val sample = JSParser.parse(JSParser.CatchParameter(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def DebuggerStatement(): ScalaSet[DebuggerStatement] = {
    if (!visited.contains("DebuggerStatement", List())) {
      visited += (("DebuggerStatement", List()))
      var s = ScalaSet[DebuggerStatement]()
      s += DebuggerStatement0(List())
      s
    } else {
      val str = MinSampler.DebuggerStatement()
      val sample = JSParser.parse(JSParser.DebuggerStatement(List()), str).get
      ScalaSet(sample)
    }
  }
  def FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[FunctionDeclaration] = {
    if (!visited.contains("FunctionDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("FunctionDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[FunctionDeclaration]()
      val BindingIdentifier_0_1 = BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_3 = FormalParameters(false, false).toList
      val FunctionBody_0_6 = FunctionBody(false, false).toList
      val max0 = List(BindingIdentifier_0_1, FormalParameters_0_3, FunctionBody_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_3.applyOrElse(i, (_: Int) => FormalParameters(false, false).head)
        val arg2 = FunctionBody_0_6.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
        s += FunctionDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_2 = FormalParameters(false, false).toList
        val FunctionBody_1_5 = FunctionBody(false, false).toList
        val max1 = List(FormalParameters_1_2, FunctionBody_1_5).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_2.applyOrElse(i, (_: Int) => FormalParameters(false, false).head)
          val arg1 = FunctionBody_1_5.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
          s += FunctionDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val str = MinSampler.FunctionDeclaration(pYield, pAwait, pDefault)
      val sample = JSParser.parse(JSParser.FunctionDeclaration(List(pYield, pAwait, pDefault)), str).get
      ScalaSet(sample)
    }
  }
  def FunctionExpression(): ScalaSet[FunctionExpression] = {
    if (!visited.contains("FunctionExpression", List())) {
      visited += (("FunctionExpression", List()))
      var s = ScalaSet[FunctionExpression]()
      val BindingIdentifier_0_1 = BindingIdentifier(false, false).toList
      val FormalParameters_0_3 = FormalParameters(false, false).toList
      val FunctionBody_0_6 = FunctionBody(false, false).toList
      val max0 = List(BindingIdentifier_0_1, FormalParameters_0_3, FunctionBody_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => BindingIdentifier(false, false).head)
        val arg1 = FormalParameters_0_3.applyOrElse(i, (_: Int) => FormalParameters(false, false).head)
        val arg2 = FunctionBody_0_6.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
        s += FunctionExpression0(Some(arg0), arg1, arg2, List())
        s += FunctionExpression0(None, arg1, arg2, List())
      }
      s
    } else {
      val str = MinSampler.FunctionExpression()
      val sample = JSParser.parse(JSParser.FunctionExpression(List()), str).get
      ScalaSet(sample)
    }
  }
  def UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[UniqueFormalParameters] = {
    if (!visited.contains("UniqueFormalParameters", List(pYield, pAwait))) {
      visited += (("UniqueFormalParameters", List(pYield, pAwait)))
      var s = ScalaSet[UniqueFormalParameters]()
      val FormalParameters_0_0 = FormalParameters(pYield, pAwait).toList
      val max0 = List(FormalParameters_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameters_0_0.applyOrElse(i, (_: Int) => FormalParameters(pYield, pAwait).head)
        s += UniqueFormalParameters0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.UniqueFormalParameters(pYield, pAwait)
      val sample = JSParser.parse(JSParser.UniqueFormalParameters(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def FormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameters] = {
    if (!visited.contains("FormalParameters", List(pYield, pAwait))) {
      visited += (("FormalParameters", List(pYield, pAwait)))
      var s = ScalaSet[FormalParameters]()
      s += FormalParameters0(List(pYield, pAwait))
      val FunctionRestParameter_1_0 = FunctionRestParameter(pYield, pAwait).toList
      val max1 = List(FunctionRestParameter_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FunctionRestParameter_1_0.applyOrElse(i, (_: Int) => FunctionRestParameter(pYield, pAwait).head)
        s += FormalParameters1(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_2_0 = FormalParameterList(pYield, pAwait).toList
      val max2 = List(FormalParameterList_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = FormalParameterList_2_0.applyOrElse(i, (_: Int) => FormalParameterList(pYield, pAwait).head)
        s += FormalParameters2(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_3_0 = FormalParameterList(pYield, pAwait).toList
      val max3 = List(FormalParameterList_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = FormalParameterList_3_0.applyOrElse(i, (_: Int) => FormalParameterList(pYield, pAwait).head)
        s += FormalParameters3(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_4_0 = FormalParameterList(pYield, pAwait).toList
      val FunctionRestParameter_4_2 = FunctionRestParameter(pYield, pAwait).toList
      val max4 = List(FormalParameterList_4_0, FunctionRestParameter_4_2).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = FormalParameterList_4_0.applyOrElse(i, (_: Int) => FormalParameterList(pYield, pAwait).head)
        val arg1 = FunctionRestParameter_4_2.applyOrElse(i, (_: Int) => FunctionRestParameter(pYield, pAwait).head)
        s += FormalParameters4(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.FormalParameters(pYield, pAwait)
      val sample = JSParser.parse(JSParser.FormalParameters(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def FormalParameterList(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameterList] = {
    if (!visited.contains("FormalParameterList", List(pYield, pAwait))) {
      visited += (("FormalParameterList", List(pYield, pAwait)))
      var s = ScalaSet[FormalParameterList]()
      val FormalParameter_0_0 = FormalParameter(pYield, pAwait).toList
      val max0 = List(FormalParameter_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameter_0_0.applyOrElse(i, (_: Int) => FormalParameter(pYield, pAwait).head)
        s += FormalParameterList0(arg0, List(pYield, pAwait))
      }
      val FormalParameterList_1_0 = FormalParameterList(pYield, pAwait).toList
      val FormalParameter_1_2 = FormalParameter(pYield, pAwait).toList
      val max1 = List(FormalParameterList_1_0, FormalParameter_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FormalParameterList_1_0.applyOrElse(i, (_: Int) => FormalParameterList(pYield, pAwait).head)
        val arg1 = FormalParameter_1_2.applyOrElse(i, (_: Int) => FormalParameter(pYield, pAwait).head)
        s += FormalParameterList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.FormalParameterList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.FormalParameterList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def FunctionRestParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionRestParameter] = {
    if (!visited.contains("FunctionRestParameter", List(pYield, pAwait))) {
      visited += (("FunctionRestParameter", List(pYield, pAwait)))
      var s = ScalaSet[FunctionRestParameter]()
      val BindingRestElement_0_0 = BindingRestElement(pYield, pAwait).toList
      val max0 = List(BindingRestElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingRestElement_0_0.applyOrElse(i, (_: Int) => BindingRestElement(pYield, pAwait).head)
        s += FunctionRestParameter0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.FunctionRestParameter(pYield, pAwait)
      val sample = JSParser.parse(JSParser.FunctionRestParameter(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def FormalParameter(pYield: Boolean, pAwait: Boolean): ScalaSet[FormalParameter] = {
    if (!visited.contains("FormalParameter", List(pYield, pAwait))) {
      visited += (("FormalParameter", List(pYield, pAwait)))
      var s = ScalaSet[FormalParameter]()
      val BindingElement_0_0 = BindingElement(pYield, pAwait).toList
      val max0 = List(BindingElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingElement_0_0.applyOrElse(i, (_: Int) => BindingElement(pYield, pAwait).head)
        s += FormalParameter0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.FormalParameter(pYield, pAwait)
      val sample = JSParser.parse(JSParser.FormalParameter(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def FunctionBody(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionBody] = {
    if (!visited.contains("FunctionBody", List(pYield, pAwait))) {
      visited += (("FunctionBody", List(pYield, pAwait)))
      var s = ScalaSet[FunctionBody]()
      val FunctionStatementList_0_0 = FunctionStatementList(pYield, pAwait).toList
      val max0 = List(FunctionStatementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionStatementList_0_0.applyOrElse(i, (_: Int) => FunctionStatementList(pYield, pAwait).head)
        s += FunctionBody0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.FunctionBody(pYield, pAwait)
      val sample = JSParser.parse(JSParser.FunctionBody(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def FunctionStatementList(pYield: Boolean, pAwait: Boolean): ScalaSet[FunctionStatementList] = {
    if (!visited.contains("FunctionStatementList", List(pYield, pAwait))) {
      visited += (("FunctionStatementList", List(pYield, pAwait)))
      var s = ScalaSet[FunctionStatementList]()
      val StatementList_0_0 = StatementList(pYield, pAwait, true).toList
      val max0 = List(StatementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_0.applyOrElse(i, (_: Int) => StatementList(pYield, pAwait, true).head)
        s += FunctionStatementList0(Some(arg0), List(pYield, pAwait))
        s += FunctionStatementList0(None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.FunctionStatementList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.FunctionStatementList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowFunction] = {
    if (!visited.contains("ArrowFunction", List(pIn, pYield, pAwait))) {
      visited += (("ArrowFunction", List(pIn, pYield, pAwait)))
      var s = ScalaSet[ArrowFunction]()
      val ArrowParameters_0_0 = ArrowParameters(pYield, pAwait).toList
      val ConciseBody_0_3 = ConciseBody(pIn).toList
      val max0 = List(ArrowParameters_0_0, ConciseBody_0_3).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ArrowParameters_0_0.applyOrElse(i, (_: Int) => ArrowParameters(pYield, pAwait).head)
        val arg1 = ConciseBody_0_3.applyOrElse(i, (_: Int) => ConciseBody(pIn).head)
        s += ArrowFunction0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArrowFunction(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArrowFunction(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ArrowParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowParameters] = {
    if (!visited.contains("ArrowParameters", List(pYield, pAwait))) {
      visited += (("ArrowParameters", List(pYield, pAwait)))
      var s = ScalaSet[ArrowParameters]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        s += ArrowParameters0(arg0, List(pYield, pAwait))
      }
      val CoverParenthesizedExpressionAndArrowParameterList_1_0 = CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).toList
      val max1 = List(CoverParenthesizedExpressionAndArrowParameterList_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoverParenthesizedExpressionAndArrowParameterList_1_0.applyOrElse(i, (_: Int) => CoverParenthesizedExpressionAndArrowParameterList(pYield, pAwait).head)
        s += ArrowParameters1(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArrowParameters(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArrowParameters(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ConciseBody(pIn: Boolean): ScalaSet[ConciseBody] = {
    if (!visited.contains("ConciseBody", List(pIn))) {
      visited += (("ConciseBody", List(pIn)))
      var s = ScalaSet[ConciseBody]()
      val ExpressionBody_0_1 = ExpressionBody(pIn, false).toList
      val max0 = List(ExpressionBody_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ExpressionBody_0_1.applyOrElse(i, (_: Int) => ExpressionBody(pIn, false).head)
        s += ConciseBody0(arg0, List(pIn))
      }
      val FunctionBody_1_1 = FunctionBody(false, false).toList
      val max1 = List(FunctionBody_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = FunctionBody_1_1.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
        s += ConciseBody1(arg0, List(pIn))
      }
      s
    } else {
      val str = MinSampler.ConciseBody(pIn)
      val sample = JSParser.parse(JSParser.ConciseBody(List(pIn)), str).get
      ScalaSet(sample)
    }
  }
  def ExpressionBody(pIn: Boolean, pAwait: Boolean): ScalaSet[ExpressionBody] = {
    if (!visited.contains("ExpressionBody", List(pIn, pAwait))) {
      visited += (("ExpressionBody", List(pIn, pAwait)))
      var s = ScalaSet[ExpressionBody]()
      val AssignmentExpression_0_0 = AssignmentExpression(pIn, false, pAwait).toList
      val max0 = List(AssignmentExpression_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AssignmentExpression_0_0.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, false, pAwait).head)
        s += ExpressionBody0(arg0, List(pIn, pAwait))
      }
      s
    } else {
      val str = MinSampler.ExpressionBody(pIn, pAwait)
      val sample = JSParser.parse(JSParser.ExpressionBody(List(pIn, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): ScalaSet[ArrowFormalParameters] = {
    if (!visited.contains("ArrowFormalParameters", List(pYield, pAwait))) {
      visited += (("ArrowFormalParameters", List(pYield, pAwait)))
      var s = ScalaSet[ArrowFormalParameters]()
      val UniqueFormalParameters_0_1 = UniqueFormalParameters(pYield, pAwait).toList
      val max0 = List(UniqueFormalParameters_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UniqueFormalParameters_0_1.applyOrElse(i, (_: Int) => UniqueFormalParameters(pYield, pAwait).head)
        s += ArrowFormalParameters0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ArrowFormalParameters(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ArrowFormalParameters(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncArrowFunction] = {
    if (!visited.contains("AsyncArrowFunction", List(pIn, pYield, pAwait))) {
      visited += (("AsyncArrowFunction", List(pIn, pYield, pAwait)))
      var s = ScalaSet[AsyncArrowFunction]()
      val AsyncArrowBindingIdentifier_0_2 = AsyncArrowBindingIdentifier(pYield).toList
      val AsyncConciseBody_0_5 = AsyncConciseBody(pIn).toList
      val max0 = List(AsyncArrowBindingIdentifier_0_2, AsyncConciseBody_0_5).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = AsyncArrowBindingIdentifier_0_2.applyOrElse(i, (_: Int) => AsyncArrowBindingIdentifier(pYield).head)
        val arg1 = AsyncConciseBody_0_5.applyOrElse(i, (_: Int) => AsyncConciseBody(pIn).head)
        s += AsyncArrowFunction0(arg0, arg1, List(pIn, pYield, pAwait))
      }
      val CoverCallExpressionAndAsyncArrowHead_1_0 = CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).toList
      val AsyncConciseBody_1_3 = AsyncConciseBody(pIn).toList
      val max1 = List(CoverCallExpressionAndAsyncArrowHead_1_0, AsyncConciseBody_1_3).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = CoverCallExpressionAndAsyncArrowHead_1_0.applyOrElse(i, (_: Int) => CoverCallExpressionAndAsyncArrowHead(pYield, pAwait).head)
        val arg1 = AsyncConciseBody_1_3.applyOrElse(i, (_: Int) => AsyncConciseBody(pIn).head)
        s += AsyncArrowFunction1(arg0, arg1, List(pIn, pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AsyncArrowFunction(pIn, pYield, pAwait)
      val sample = JSParser.parse(JSParser.AsyncArrowFunction(List(pIn, pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncConciseBody(pIn: Boolean): ScalaSet[AsyncConciseBody] = {
    if (!visited.contains("AsyncConciseBody", List(pIn))) {
      visited += (("AsyncConciseBody", List(pIn)))
      var s = ScalaSet[AsyncConciseBody]()
      val ExpressionBody_0_1 = ExpressionBody(pIn, true).toList
      val max0 = List(ExpressionBody_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ExpressionBody_0_1.applyOrElse(i, (_: Int) => ExpressionBody(pIn, true).head)
        s += AsyncConciseBody0(arg0, List(pIn))
      }
      val AsyncFunctionBody_1_1 = AsyncFunctionBody().toList
      val max1 = List(AsyncFunctionBody_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AsyncFunctionBody_1_1.applyOrElse(i, (_: Int) => AsyncFunctionBody().head)
        s += AsyncConciseBody1(arg0, List(pIn))
      }
      s
    } else {
      val str = MinSampler.AsyncConciseBody(pIn)
      val sample = JSParser.parse(JSParser.AsyncConciseBody(List(pIn)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncArrowBindingIdentifier(pYield: Boolean): ScalaSet[AsyncArrowBindingIdentifier] = {
    if (!visited.contains("AsyncArrowBindingIdentifier", List(pYield))) {
      visited += (("AsyncArrowBindingIdentifier", List(pYield)))
      var s = ScalaSet[AsyncArrowBindingIdentifier]()
      val BindingIdentifier_0_0 = BindingIdentifier(pYield, true).toList
      val max0 = List(BindingIdentifier_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_0.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, true).head)
        s += AsyncArrowBindingIdentifier0(arg0, List(pYield))
      }
      s
    } else {
      val str = MinSampler.AsyncArrowBindingIdentifier(pYield)
      val sample = JSParser.parse(JSParser.AsyncArrowBindingIdentifier(List(pYield)), str).get
      ScalaSet(sample)
    }
  }
  def CoverCallExpressionAndAsyncArrowHead(pYield: Boolean, pAwait: Boolean): ScalaSet[CoverCallExpressionAndAsyncArrowHead] = {
    if (!visited.contains("CoverCallExpressionAndAsyncArrowHead", List(pYield, pAwait))) {
      visited += (("CoverCallExpressionAndAsyncArrowHead", List(pYield, pAwait)))
      var s = ScalaSet[CoverCallExpressionAndAsyncArrowHead]()
      val MemberExpression_0_0 = MemberExpression(pYield, pAwait).toList
      val Arguments_0_1 = Arguments(pYield, pAwait).toList
      val max0 = List(MemberExpression_0_0, Arguments_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MemberExpression_0_0.applyOrElse(i, (_: Int) => MemberExpression(pYield, pAwait).head)
        val arg1 = Arguments_0_1.applyOrElse(i, (_: Int) => Arguments(pYield, pAwait).head)
        s += CoverCallExpressionAndAsyncArrowHead0(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.CoverCallExpressionAndAsyncArrowHead(pYield, pAwait)
      val sample = JSParser.parse(JSParser.CoverCallExpressionAndAsyncArrowHead(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncArrowHead(): ScalaSet[AsyncArrowHead] = {
    if (!visited.contains("AsyncArrowHead", List())) {
      visited += (("AsyncArrowHead", List()))
      var s = ScalaSet[AsyncArrowHead]()
      val ArrowFormalParameters_0_2 = ArrowFormalParameters(false, true).toList
      val max0 = List(ArrowFormalParameters_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ArrowFormalParameters_0_2.applyOrElse(i, (_: Int) => ArrowFormalParameters(false, true).head)
        s += AsyncArrowHead0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.AsyncArrowHead()
      val sample = JSParser.parse(JSParser.AsyncArrowHead(List()), str).get
      ScalaSet(sample)
    }
  }
  def MethodDefinition(pYield: Boolean, pAwait: Boolean): ScalaSet[MethodDefinition] = {
    if (!visited.contains("MethodDefinition", List(pYield, pAwait))) {
      visited += (("MethodDefinition", List(pYield, pAwait)))
      var s = ScalaSet[MethodDefinition]()
      val PropertyName_0_0 = PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_2 = UniqueFormalParameters(false, false).toList
      val FunctionBody_0_5 = FunctionBody(false, false).toList
      val max0 = List(PropertyName_0_0, UniqueFormalParameters_0_2, FunctionBody_0_5).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_0.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_2.applyOrElse(i, (_: Int) => UniqueFormalParameters(false, false).head)
        val arg2 = FunctionBody_0_5.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
        s += MethodDefinition0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      val GeneratorMethod_1_0 = GeneratorMethod(pYield, pAwait).toList
      val max1 = List(GeneratorMethod_1_0).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = GeneratorMethod_1_0.applyOrElse(i, (_: Int) => GeneratorMethod(pYield, pAwait).head)
        s += MethodDefinition1(arg0, List(pYield, pAwait))
      }
      val AsyncMethod_2_0 = AsyncMethod(pYield, pAwait).toList
      val max2 = List(AsyncMethod_2_0).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AsyncMethod_2_0.applyOrElse(i, (_: Int) => AsyncMethod(pYield, pAwait).head)
        s += MethodDefinition2(arg0, List(pYield, pAwait))
      }
      val AsyncGeneratorMethod_3_0 = AsyncGeneratorMethod(pYield, pAwait).toList
      val max3 = List(AsyncGeneratorMethod_3_0).map(_.length).max
      for (i <- (0 until max3)) {
        val arg0 = AsyncGeneratorMethod_3_0.applyOrElse(i, (_: Int) => AsyncGeneratorMethod(pYield, pAwait).head)
        s += MethodDefinition3(arg0, List(pYield, pAwait))
      }
      val PropertyName_4_1 = PropertyName(pYield, pAwait).toList
      val FunctionBody_4_5 = FunctionBody(false, false).toList
      val max4 = List(PropertyName_4_1, FunctionBody_4_5).map(_.length).max
      for (i <- (0 until max4)) {
        val arg0 = PropertyName_4_1.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = FunctionBody_4_5.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
        s += MethodDefinition4(arg0, arg1, List(pYield, pAwait))
      }
      val PropertyName_5_1 = PropertyName(pYield, pAwait).toList
      val PropertySetParameterList_5_3 = PropertySetParameterList().toList
      val FunctionBody_5_6 = FunctionBody(false, false).toList
      val max5 = List(PropertyName_5_1, PropertySetParameterList_5_3, FunctionBody_5_6).map(_.length).max
      for (i <- (0 until max5)) {
        val arg0 = PropertyName_5_1.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = PropertySetParameterList_5_3.applyOrElse(i, (_: Int) => PropertySetParameterList().head)
        val arg2 = FunctionBody_5_6.applyOrElse(i, (_: Int) => FunctionBody(false, false).head)
        s += MethodDefinition5(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.MethodDefinition(pYield, pAwait)
      val sample = JSParser.parse(JSParser.MethodDefinition(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def PropertySetParameterList(): ScalaSet[PropertySetParameterList] = {
    if (!visited.contains("PropertySetParameterList", List())) {
      visited += (("PropertySetParameterList", List()))
      var s = ScalaSet[PropertySetParameterList]()
      val FormalParameter_0_0 = FormalParameter(false, false).toList
      val max0 = List(FormalParameter_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameter_0_0.applyOrElse(i, (_: Int) => FormalParameter(false, false).head)
        s += PropertySetParameterList0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.PropertySetParameterList()
      val sample = JSParser.parse(JSParser.PropertySetParameterList(List()), str).get
      ScalaSet(sample)
    }
  }
  def GeneratorMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[GeneratorMethod] = {
    if (!visited.contains("GeneratorMethod", List(pYield, pAwait))) {
      visited += (("GeneratorMethod", List(pYield, pAwait)))
      var s = ScalaSet[GeneratorMethod]()
      val PropertyName_0_1 = PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_3 = UniqueFormalParameters(true, false).toList
      val GeneratorBody_0_6 = GeneratorBody().toList
      val max0 = List(PropertyName_0_1, UniqueFormalParameters_0_3, GeneratorBody_0_6).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_1.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_3.applyOrElse(i, (_: Int) => UniqueFormalParameters(true, false).head)
        val arg2 = GeneratorBody_0_6.applyOrElse(i, (_: Int) => GeneratorBody().head)
        s += GeneratorMethod0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.GeneratorMethod(pYield, pAwait)
      val sample = JSParser.parse(JSParser.GeneratorMethod(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[GeneratorDeclaration] = {
    if (!visited.contains("GeneratorDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("GeneratorDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[GeneratorDeclaration]()
      val BindingIdentifier_0_2 = BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_4 = FormalParameters(true, false).toList
      val GeneratorBody_0_7 = GeneratorBody().toList
      val max0 = List(BindingIdentifier_0_2, FormalParameters_0_4, GeneratorBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_2.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_4.applyOrElse(i, (_: Int) => FormalParameters(true, false).head)
        val arg2 = GeneratorBody_0_7.applyOrElse(i, (_: Int) => GeneratorBody().head)
        s += GeneratorDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_3 = FormalParameters(true, false).toList
        val GeneratorBody_1_6 = GeneratorBody().toList
        val max1 = List(FormalParameters_1_3, GeneratorBody_1_6).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_3.applyOrElse(i, (_: Int) => FormalParameters(true, false).head)
          val arg1 = GeneratorBody_1_6.applyOrElse(i, (_: Int) => GeneratorBody().head)
          s += GeneratorDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val str = MinSampler.GeneratorDeclaration(pYield, pAwait, pDefault)
      val sample = JSParser.parse(JSParser.GeneratorDeclaration(List(pYield, pAwait, pDefault)), str).get
      ScalaSet(sample)
    }
  }
  def GeneratorExpression(): ScalaSet[GeneratorExpression] = {
    if (!visited.contains("GeneratorExpression", List())) {
      visited += (("GeneratorExpression", List()))
      var s = ScalaSet[GeneratorExpression]()
      val BindingIdentifier_0_2 = BindingIdentifier(true, false).toList
      val FormalParameters_0_4 = FormalParameters(true, false).toList
      val GeneratorBody_0_7 = GeneratorBody().toList
      val max0 = List(BindingIdentifier_0_2, FormalParameters_0_4, GeneratorBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_2.applyOrElse(i, (_: Int) => BindingIdentifier(true, false).head)
        val arg1 = FormalParameters_0_4.applyOrElse(i, (_: Int) => FormalParameters(true, false).head)
        val arg2 = GeneratorBody_0_7.applyOrElse(i, (_: Int) => GeneratorBody().head)
        s += GeneratorExpression0(Some(arg0), arg1, arg2, List())
        s += GeneratorExpression0(None, arg1, arg2, List())
      }
      s
    } else {
      val str = MinSampler.GeneratorExpression()
      val sample = JSParser.parse(JSParser.GeneratorExpression(List()), str).get
      ScalaSet(sample)
    }
  }
  def GeneratorBody(): ScalaSet[GeneratorBody] = {
    if (!visited.contains("GeneratorBody", List())) {
      visited += (("GeneratorBody", List()))
      var s = ScalaSet[GeneratorBody]()
      val FunctionBody_0_0 = FunctionBody(true, false).toList
      val max0 = List(FunctionBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionBody_0_0.applyOrElse(i, (_: Int) => FunctionBody(true, false).head)
        s += GeneratorBody0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.GeneratorBody()
      val sample = JSParser.parse(JSParser.GeneratorBody(List()), str).get
      ScalaSet(sample)
    }
  }
  def YieldExpression(pIn: Boolean, pAwait: Boolean): ScalaSet[YieldExpression] = {
    if (!visited.contains("YieldExpression", List(pIn, pAwait))) {
      visited += (("YieldExpression", List(pIn, pAwait)))
      var s = ScalaSet[YieldExpression]()
      s += YieldExpression0(List(pIn, pAwait))
      val AssignmentExpression_1_2 = AssignmentExpression(pIn, true, pAwait).toList
      val max1 = List(AssignmentExpression_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = AssignmentExpression_1_2.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, true, pAwait).head)
        s += YieldExpression1(arg0, List(pIn, pAwait))
      }
      val AssignmentExpression_2_3 = AssignmentExpression(pIn, true, pAwait).toList
      val max2 = List(AssignmentExpression_2_3).map(_.length).max
      for (i <- (0 until max2)) {
        val arg0 = AssignmentExpression_2_3.applyOrElse(i, (_: Int) => AssignmentExpression(pIn, true, pAwait).head)
        s += YieldExpression2(arg0, List(pIn, pAwait))
      }
      s
    } else {
      val str = MinSampler.YieldExpression(pIn, pAwait)
      val sample = JSParser.parse(JSParser.YieldExpression(List(pIn, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncGeneratorMethod] = {
    if (!visited.contains("AsyncGeneratorMethod", List(pYield, pAwait))) {
      visited += (("AsyncGeneratorMethod", List(pYield, pAwait)))
      var s = ScalaSet[AsyncGeneratorMethod]()
      val PropertyName_0_3 = PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_5 = UniqueFormalParameters(true, true).toList
      val AsyncGeneratorBody_0_8 = AsyncGeneratorBody().toList
      val max0 = List(PropertyName_0_3, UniqueFormalParameters_0_5, AsyncGeneratorBody_0_8).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_3.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_5.applyOrElse(i, (_: Int) => UniqueFormalParameters(true, true).head)
        val arg2 = AsyncGeneratorBody_0_8.applyOrElse(i, (_: Int) => AsyncGeneratorBody().head)
        s += AsyncGeneratorMethod0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AsyncGeneratorMethod(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AsyncGeneratorMethod(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[AsyncGeneratorDeclaration] = {
    if (!visited.contains("AsyncGeneratorDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("AsyncGeneratorDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[AsyncGeneratorDeclaration]()
      val BindingIdentifier_0_4 = BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_6 = FormalParameters(true, true).toList
      val AsyncGeneratorBody_0_9 = AsyncGeneratorBody().toList
      val max0 = List(BindingIdentifier_0_4, FormalParameters_0_6, AsyncGeneratorBody_0_9).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_4.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_6.applyOrElse(i, (_: Int) => FormalParameters(true, true).head)
        val arg2 = AsyncGeneratorBody_0_9.applyOrElse(i, (_: Int) => AsyncGeneratorBody().head)
        s += AsyncGeneratorDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_5 = FormalParameters(true, true).toList
        val AsyncGeneratorBody_1_8 = AsyncGeneratorBody().toList
        val max1 = List(FormalParameters_1_5, AsyncGeneratorBody_1_8).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_5.applyOrElse(i, (_: Int) => FormalParameters(true, true).head)
          val arg1 = AsyncGeneratorBody_1_8.applyOrElse(i, (_: Int) => AsyncGeneratorBody().head)
          s += AsyncGeneratorDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val str = MinSampler.AsyncGeneratorDeclaration(pYield, pAwait, pDefault)
      val sample = JSParser.parse(JSParser.AsyncGeneratorDeclaration(List(pYield, pAwait, pDefault)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorExpression(): ScalaSet[AsyncGeneratorExpression] = {
    if (!visited.contains("AsyncGeneratorExpression", List())) {
      visited += (("AsyncGeneratorExpression", List()))
      var s = ScalaSet[AsyncGeneratorExpression]()
      val BindingIdentifier_0_4 = BindingIdentifier(true, true).toList
      val FormalParameters_0_6 = FormalParameters(true, true).toList
      val AsyncGeneratorBody_0_9 = AsyncGeneratorBody().toList
      val max0 = List(BindingIdentifier_0_4, FormalParameters_0_6, AsyncGeneratorBody_0_9).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_4.applyOrElse(i, (_: Int) => BindingIdentifier(true, true).head)
        val arg1 = FormalParameters_0_6.applyOrElse(i, (_: Int) => FormalParameters(true, true).head)
        val arg2 = AsyncGeneratorBody_0_9.applyOrElse(i, (_: Int) => AsyncGeneratorBody().head)
        s += AsyncGeneratorExpression0(Some(arg0), arg1, arg2, List())
        s += AsyncGeneratorExpression0(None, arg1, arg2, List())
      }
      s
    } else {
      val str = MinSampler.AsyncGeneratorExpression()
      val sample = JSParser.parse(JSParser.AsyncGeneratorExpression(List()), str).get
      ScalaSet(sample)
    }
  }
  def AsyncGeneratorBody(): ScalaSet[AsyncGeneratorBody] = {
    if (!visited.contains("AsyncGeneratorBody", List())) {
      visited += (("AsyncGeneratorBody", List()))
      var s = ScalaSet[AsyncGeneratorBody]()
      val FunctionBody_0_0 = FunctionBody(true, true).toList
      val max0 = List(FunctionBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionBody_0_0.applyOrElse(i, (_: Int) => FunctionBody(true, true).head)
        s += AsyncGeneratorBody0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.AsyncGeneratorBody()
      val sample = JSParser.parse(JSParser.AsyncGeneratorBody(List()), str).get
      ScalaSet(sample)
    }
  }
  def AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[AsyncFunctionDeclaration] = {
    if (!visited.contains("AsyncFunctionDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("AsyncFunctionDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[AsyncFunctionDeclaration]()
      val BindingIdentifier_0_3 = BindingIdentifier(pYield, pAwait).toList
      val FormalParameters_0_5 = FormalParameters(false, true).toList
      val AsyncFunctionBody_0_8 = AsyncFunctionBody().toList
      val max0 = List(BindingIdentifier_0_3, FormalParameters_0_5, AsyncFunctionBody_0_8).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_3.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = FormalParameters_0_5.applyOrElse(i, (_: Int) => FormalParameters(false, true).head)
        val arg2 = AsyncFunctionBody_0_8.applyOrElse(i, (_: Int) => AsyncFunctionBody().head)
        s += AsyncFunctionDeclaration0(arg0, arg1, arg2, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val FormalParameters_1_4 = FormalParameters(false, true).toList
        val AsyncFunctionBody_1_7 = AsyncFunctionBody().toList
        val max1 = List(FormalParameters_1_4, AsyncFunctionBody_1_7).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = FormalParameters_1_4.applyOrElse(i, (_: Int) => FormalParameters(false, true).head)
          val arg1 = AsyncFunctionBody_1_7.applyOrElse(i, (_: Int) => AsyncFunctionBody().head)
          s += AsyncFunctionDeclaration1(arg0, arg1, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val str = MinSampler.AsyncFunctionDeclaration(pYield, pAwait, pDefault)
      val sample = JSParser.parse(JSParser.AsyncFunctionDeclaration(List(pYield, pAwait, pDefault)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncFunctionExpression(): ScalaSet[AsyncFunctionExpression] = {
    if (!visited.contains("AsyncFunctionExpression", List())) {
      visited += (("AsyncFunctionExpression", List()))
      var s = ScalaSet[AsyncFunctionExpression]()
      val FormalParameters_0_4 = FormalParameters(false, true).toList
      val AsyncFunctionBody_0_7 = AsyncFunctionBody().toList
      val max0 = List(FormalParameters_0_4, AsyncFunctionBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FormalParameters_0_4.applyOrElse(i, (_: Int) => FormalParameters(false, true).head)
        val arg1 = AsyncFunctionBody_0_7.applyOrElse(i, (_: Int) => AsyncFunctionBody().head)
        s += AsyncFunctionExpression0(arg0, arg1, List())
      }
      val BindingIdentifier_1_3 = BindingIdentifier(false, true).toList
      val FormalParameters_1_5 = FormalParameters(false, true).toList
      val AsyncFunctionBody_1_8 = AsyncFunctionBody().toList
      val max1 = List(BindingIdentifier_1_3, FormalParameters_1_5, AsyncFunctionBody_1_8).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = BindingIdentifier_1_3.applyOrElse(i, (_: Int) => BindingIdentifier(false, true).head)
        val arg1 = FormalParameters_1_5.applyOrElse(i, (_: Int) => FormalParameters(false, true).head)
        val arg2 = AsyncFunctionBody_1_8.applyOrElse(i, (_: Int) => AsyncFunctionBody().head)
        s += AsyncFunctionExpression1(arg0, arg1, arg2, List())
      }
      s
    } else {
      val str = MinSampler.AsyncFunctionExpression()
      val sample = JSParser.parse(JSParser.AsyncFunctionExpression(List()), str).get
      ScalaSet(sample)
    }
  }
  def AsyncMethod(pYield: Boolean, pAwait: Boolean): ScalaSet[AsyncMethod] = {
    if (!visited.contains("AsyncMethod", List(pYield, pAwait))) {
      visited += (("AsyncMethod", List(pYield, pAwait)))
      var s = ScalaSet[AsyncMethod]()
      val PropertyName_0_2 = PropertyName(pYield, pAwait).toList
      val UniqueFormalParameters_0_4 = UniqueFormalParameters(false, true).toList
      val AsyncFunctionBody_0_7 = AsyncFunctionBody().toList
      val max0 = List(PropertyName_0_2, UniqueFormalParameters_0_4, AsyncFunctionBody_0_7).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = PropertyName_0_2.applyOrElse(i, (_: Int) => PropertyName(pYield, pAwait).head)
        val arg1 = UniqueFormalParameters_0_4.applyOrElse(i, (_: Int) => UniqueFormalParameters(false, true).head)
        val arg2 = AsyncFunctionBody_0_7.applyOrElse(i, (_: Int) => AsyncFunctionBody().head)
        s += AsyncMethod0(arg0, arg1, arg2, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.AsyncMethod(pYield, pAwait)
      val sample = JSParser.parse(JSParser.AsyncMethod(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def AsyncFunctionBody(): ScalaSet[AsyncFunctionBody] = {
    if (!visited.contains("AsyncFunctionBody", List())) {
      visited += (("AsyncFunctionBody", List()))
      var s = ScalaSet[AsyncFunctionBody]()
      val FunctionBody_0_0 = FunctionBody(false, true).toList
      val max0 = List(FunctionBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = FunctionBody_0_0.applyOrElse(i, (_: Int) => FunctionBody(false, true).head)
        s += AsyncFunctionBody0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.AsyncFunctionBody()
      val sample = JSParser.parse(JSParser.AsyncFunctionBody(List()), str).get
      ScalaSet(sample)
    }
  }
  def AwaitExpression(pYield: Boolean): ScalaSet[AwaitExpression] = {
    if (!visited.contains("AwaitExpression", List(pYield))) {
      visited += (("AwaitExpression", List(pYield)))
      var s = ScalaSet[AwaitExpression]()
      val UnaryExpression_0_1 = UnaryExpression(pYield, true).toList
      val max0 = List(UnaryExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = UnaryExpression_0_1.applyOrElse(i, (_: Int) => UnaryExpression(pYield, true).head)
        s += AwaitExpression0(arg0, List(pYield))
      }
      s
    } else {
      val str = MinSampler.AwaitExpression(pYield)
      val sample = JSParser.parse(JSParser.AwaitExpression(List(pYield)), str).get
      ScalaSet(sample)
    }
  }
  def ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): ScalaSet[ClassDeclaration] = {
    if (!visited.contains("ClassDeclaration", List(pYield, pAwait, pDefault))) {
      visited += (("ClassDeclaration", List(pYield, pAwait, pDefault)))
      var s = ScalaSet[ClassDeclaration]()
      val BindingIdentifier_0_1 = BindingIdentifier(pYield, pAwait).toList
      val ClassTail_0_2 = ClassTail(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1, ClassTail_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = ClassTail_0_2.applyOrElse(i, (_: Int) => ClassTail(pYield, pAwait).head)
        s += ClassDeclaration0(arg0, arg1, List(pYield, pAwait, pDefault))
      }
      if (pDefault) {
        val ClassTail_1_1 = ClassTail(pYield, pAwait).toList
        val max1 = List(ClassTail_1_1).map(_.length).max
        for (i <- (0 until max1)) {
          val arg0 = ClassTail_1_1.applyOrElse(i, (_: Int) => ClassTail(pYield, pAwait).head)
          s += ClassDeclaration1(arg0, List(pYield, pAwait, pDefault))
        }
      }
      s
    } else {
      val str = MinSampler.ClassDeclaration(pYield, pAwait, pDefault)
      val sample = JSParser.parse(JSParser.ClassDeclaration(List(pYield, pAwait, pDefault)), str).get
      ScalaSet(sample)
    }
  }
  def ClassExpression(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassExpression] = {
    if (!visited.contains("ClassExpression", List(pYield, pAwait))) {
      visited += (("ClassExpression", List(pYield, pAwait)))
      var s = ScalaSet[ClassExpression]()
      val BindingIdentifier_0_1 = BindingIdentifier(pYield, pAwait).toList
      val ClassTail_0_2 = ClassTail(pYield, pAwait).toList
      val max0 = List(BindingIdentifier_0_1, ClassTail_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = BindingIdentifier_0_1.applyOrElse(i, (_: Int) => BindingIdentifier(pYield, pAwait).head)
        val arg1 = ClassTail_0_2.applyOrElse(i, (_: Int) => ClassTail(pYield, pAwait).head)
        s += ClassExpression0(Some(arg0), arg1, List(pYield, pAwait))
        s += ClassExpression0(None, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ClassExpression(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ClassExpression(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ClassTail(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassTail] = {
    if (!visited.contains("ClassTail", List(pYield, pAwait))) {
      visited += (("ClassTail", List(pYield, pAwait)))
      var s = ScalaSet[ClassTail]()
      val ClassHeritage_0_0 = ClassHeritage(pYield, pAwait).toList
      val ClassBody_0_2 = ClassBody(pYield, pAwait).toList
      val max0 = List(ClassHeritage_0_0, ClassBody_0_2).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ClassHeritage_0_0.applyOrElse(i, (_: Int) => ClassHeritage(pYield, pAwait).head)
        val arg1 = ClassBody_0_2.applyOrElse(i, (_: Int) => ClassBody(pYield, pAwait).head)
        s += ClassTail0(Some(arg0), Some(arg1), List(pYield, pAwait))
        s += ClassTail0(Some(arg0), None, List(pYield, pAwait))
        s += ClassTail0(None, Some(arg1), List(pYield, pAwait))
        s += ClassTail0(None, None, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ClassTail(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ClassTail(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ClassHeritage(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassHeritage] = {
    if (!visited.contains("ClassHeritage", List(pYield, pAwait))) {
      visited += (("ClassHeritage", List(pYield, pAwait)))
      var s = ScalaSet[ClassHeritage]()
      val LeftHandSideExpression_0_1 = LeftHandSideExpression(pYield, pAwait).toList
      val max0 = List(LeftHandSideExpression_0_1).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = LeftHandSideExpression_0_1.applyOrElse(i, (_: Int) => LeftHandSideExpression(pYield, pAwait).head)
        s += ClassHeritage0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ClassHeritage(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ClassHeritage(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ClassBody(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassBody] = {
    if (!visited.contains("ClassBody", List(pYield, pAwait))) {
      visited += (("ClassBody", List(pYield, pAwait)))
      var s = ScalaSet[ClassBody]()
      val ClassElementList_0_0 = ClassElementList(pYield, pAwait).toList
      val max0 = List(ClassElementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ClassElementList_0_0.applyOrElse(i, (_: Int) => ClassElementList(pYield, pAwait).head)
        s += ClassBody0(arg0, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ClassBody(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ClassBody(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ClassElementList(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassElementList] = {
    if (!visited.contains("ClassElementList", List(pYield, pAwait))) {
      visited += (("ClassElementList", List(pYield, pAwait)))
      var s = ScalaSet[ClassElementList]()
      val ClassElement_0_0 = ClassElement(pYield, pAwait).toList
      val max0 = List(ClassElement_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ClassElement_0_0.applyOrElse(i, (_: Int) => ClassElement(pYield, pAwait).head)
        s += ClassElementList0(arg0, List(pYield, pAwait))
      }
      val ClassElementList_1_0 = ClassElementList(pYield, pAwait).toList
      val ClassElement_1_1 = ClassElement(pYield, pAwait).toList
      val max1 = List(ClassElementList_1_0, ClassElement_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = ClassElementList_1_0.applyOrElse(i, (_: Int) => ClassElementList(pYield, pAwait).head)
        val arg1 = ClassElement_1_1.applyOrElse(i, (_: Int) => ClassElement(pYield, pAwait).head)
        s += ClassElementList1(arg0, arg1, List(pYield, pAwait))
      }
      s
    } else {
      val str = MinSampler.ClassElementList(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ClassElementList(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def ClassElement(pYield: Boolean, pAwait: Boolean): ScalaSet[ClassElement] = {
    if (!visited.contains("ClassElement", List(pYield, pAwait))) {
      visited += (("ClassElement", List(pYield, pAwait)))
      var s = ScalaSet[ClassElement]()
      val MethodDefinition_0_0 = MethodDefinition(pYield, pAwait).toList
      val max0 = List(MethodDefinition_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = MethodDefinition_0_0.applyOrElse(i, (_: Int) => MethodDefinition(pYield, pAwait).head)
        s += ClassElement0(arg0, List(pYield, pAwait))
      }
      val MethodDefinition_1_1 = MethodDefinition(pYield, pAwait).toList
      val max1 = List(MethodDefinition_1_1).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = MethodDefinition_1_1.applyOrElse(i, (_: Int) => MethodDefinition(pYield, pAwait).head)
        s += ClassElement1(arg0, List(pYield, pAwait))
      }
      s += ClassElement2(List(pYield, pAwait))
      s
    } else {
      val str = MinSampler.ClassElement(pYield, pAwait)
      val sample = JSParser.parse(JSParser.ClassElement(List(pYield, pAwait)), str).get
      ScalaSet(sample)
    }
  }
  def Script(): ScalaSet[Script] = {
    if (!visited.contains("Script", List())) {
      visited += (("Script", List()))
      var s = ScalaSet[Script]()
      val ScriptBody_0_0 = ScriptBody().toList
      val max0 = List(ScriptBody_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = ScriptBody_0_0.applyOrElse(i, (_: Int) => ScriptBody().head)
        s += Script0(Some(arg0), List())
        s += Script0(None, List())
      }
      s
    } else {
      val str = MinSampler.Script()
      val sample = JSParser.parse(JSParser.Script(List()), str).get
      ScalaSet(sample)
    }
  }
  def ScriptBody(): ScalaSet[ScriptBody] = {
    if (!visited.contains("ScriptBody", List())) {
      visited += (("ScriptBody", List()))
      var s = ScalaSet[ScriptBody]()
      val StatementList_0_0 = StatementList(false, false, false).toList
      val max0 = List(StatementList_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = StatementList_0_0.applyOrElse(i, (_: Int) => StatementList(false, false, false).head)
        s += ScriptBody0(arg0, List())
      }
      s
    } else {
      val str = MinSampler.ScriptBody()
      val sample = JSParser.parse(JSParser.ScriptBody(List()), str).get
      ScalaSet(sample)
    }
  }
  def ExportSpecifier(): ScalaSet[ExportSpecifier] = {
    if (!visited.contains("ExportSpecifier", List())) {
      visited += (("ExportSpecifier", List()))
      var s = ScalaSet[ExportSpecifier]()
      val IdentifierName_0_0 = IdentifierName().toList
      val max0 = List(IdentifierName_0_0).map(_.length).max
      for (i <- (0 until max0)) {
        val arg0 = IdentifierName_0_0.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += ExportSpecifier0(arg0, List())
      }
      val IdentifierName_1_0 = IdentifierName().toList
      val IdentifierName_1_2 = IdentifierName().toList
      val max1 = List(IdentifierName_1_0, IdentifierName_1_2).map(_.length).max
      for (i <- (0 until max1)) {
        val arg0 = IdentifierName_1_0.applyOrElse(i, (_: Int) => IdentifierName().head)
        val arg1 = IdentifierName_1_2.applyOrElse(i, (_: Int) => IdentifierName().head)
        s += ExportSpecifier1(arg0, arg1, List())
      }
      s
    } else {
      val str = MinSampler.ExportSpecifier()
      val sample = JSParser.parse(JSParser.ExportSpecifier(List()), str).get
      ScalaSet(sample)
    }
  }
}
