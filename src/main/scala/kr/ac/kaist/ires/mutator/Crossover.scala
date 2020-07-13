package kr.ac.kaist.ires.mutator

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.util.Useful._
import scala.collection.mutable.{ Set => MSet }
import scala.collection.immutable.Set
import kr.ac.kaist.ires.AST
import java.util.concurrent.locks.Condition

object Crossover extends Mutator with Walker {
  // var exprs = Vector[AST]()
  var assignmentExprs = Vector[AssignmentExpression]()
  // var expressionExprs = Vector[Expression]()
  def apply(script: Script): Script = {
    object ExpressionCollector extends Walker {
      val assignmentExprs = MSet[AssignmentExpression]()
      // val expressionExprs = MSet[Expression]()
      // override def walk(ast: Statement): Statement = {
      //   super.walk(ast)
      // }

      override def walk(ast: AssignmentExpression): AssignmentExpression = {
        println(ast.fullList)
        assignmentExprs += ast
        // exprs :+= ast
        super.walk(ast)
      }

      // override def walk(ast: Expression): Expression = {
      //   expressionExprs += ast
      //   exprs :+= ast
      //   super.walk(ast)
      // }

      // override def walk(ast: VariableDeclaration): VariableDeclaration = {
      //   println(ast.fullList)
      //   super.walk(ast)
      // }

      // override def walk(ast: IdentifierReference): IdentifierReference = {
      //   println(ast)
      //   super.walk(ast)
      // }
    }

    ExpressionCollector.walk(script)
    assignmentExprs = rand.shuffle(ExpressionCollector.assignmentExprs.toVector)
    // expressionExprs = rand.shuffle(ExpressionCollector.expressionExprs.toVector)
    // println("----------")
    // println(assignmentExprs)
    // println(expressionExprs)
    // println("----------")

    walk(script)
  }

  override def walk(ast: AssignmentExpression): AssignmentExpression = {
    assignmentExprs.find((current: AssignmentExpression) => {
      ast.parserParams.zip(current.parserParams).forall((tuple: (Boolean, Boolean)) => {
        tuple._1 == tuple._2
      })
    }) match {
      case Some(value) => value
      case None => ast
    }
  }

  // override def walk(ast: Expression): Expression = {
  //   expressionExprs.find((current: Expression) => {
  //     ast.parserParams.zip(current.parserParams).forall((tuple: (Boolean, Boolean)) => {
  //       tuple._1 == tuple._2
  //     })
  //   }) match {
  //     case Some(value) => value
  //     case None => ast
  //   }
  // }
}
