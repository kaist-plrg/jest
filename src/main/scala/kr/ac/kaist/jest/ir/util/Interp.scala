package kr.ac.kaist.jest.ir

import java.text.Normalizer._

import scala.annotation.tailrec
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

import kr.ac.kaist.jest.{ DEBUG_INTERP, JEST, COVERAGE_MODE, Lexical, AST }
import kr.ac.kaist.jest.coverage.{ Visited, ReturnValueTarget }
import kr.ac.kaist.jest.error.{ NotSupported, NotYetModeled, IRError, Timeout }
import kr.ac.kaist.jest.model.{ Parser => ESParser, ESValueParser, ModelHelper }
import kr.ac.kaist.jest.parser.UnicodeRegex.WSLT
import scala.util.matching.Regex

// IR Interpreter
class Interp(
    isDebug: Boolean = false,
    timeLimit: Option[Long] = None,
    val visited: Visited = new Visited,
    targetInst: Option[Int] = None,
    var getName: Boolean = false
) {
  var startTime: Long = 0
  var instCount = 0
  var recentInst: Option[Inst] = None

  var nearErrorSyntax: String = ""
  var astStack: List[AST] = List()
  var nameStack: List[(AST, String)] = List()
  var addrName: Map[Addr, String] = Map()
  var targetAstStack: Option[List[AST]] = None
  val evaluationAlgorithmPattern = new Regex(".*[0-9]+.*Evaluation[0-9]+")
  val syntaxAlgorithmPattern = new Regex(".*[0-9]+[^0-9]+[0-9]+|GLOBAL\\..*")
  val dummyAST = Lexical("", "")
  dummyAST.updateSpan(0)

  def apply(inst: Inst) = interp(inst)
  def apply(st: State) = fixpoint(st)

  // perform transition until instructions are empty
  @tailrec
  final def fixpoint(st: State): State = st.context.insts match {
    case Nil => st.ctxStack match {
      case Nil => st
      case ctx :: rest => fixpoint(st.copy(context = ctx.copy(locals = ctx.locals + (ctx.retId -> Absent)), ctxStack = rest))
    }
    case inst :: rest =>
      fixpoint(interp(inst)(st.copy(context = st.context.copy(curInst = inst, insts = rest))))
  }

  // instructions
  def interp(inst: Inst): State => State = st => {
    recentInst = Some(inst)
    targetInst match {
      case Some(value) => if (value == inst.uid) targetAstStack = Some(astStack)
      case None => ()
    }
    if (instCount == 0) startTime = System.currentTimeMillis
    instCount = instCount + 1
    if (COVERAGE_MODE) visited += inst.uid
    if (instCount % 10000 == 0) timeLimit match {
      case Some(timeout) => if ((System.currentTimeMillis - startTime) > timeout * 1000) throw Timeout
      case _ => ()
    }
    if (DEBUG_INTERP || isDebug) inst match {
      case ISeq(_) =>
      case _ => println(s"${st.context.name}: ${beautify(inst)}")
    }
    val res = inst match {
      case IExpr(expr) =>
        val (_, s0) = interp(expr)(st)
        s0
      case ILet(id, expr) =>
        val (value, s0) = interp(expr)(st)
        s0.define(id, value)
      case IAssign(ref, expr) =>
        val (refV, s0) = interp(ref)(st)
        val (value, s1) = interp(expr)(s0)
        s1.updated(refV, value)
      case IDelete(ref) =>
        val (refV, s0) = interp(ref)(st)
        s0.deleted(refV)
      case IAppend(expr, list) =>
        val (exprV, s0) = escapeCompletion(interp(expr)(st))
        val (listV, s1) = escapeCompletion(interp(list)(s0))
        listV match {
          case addr: Addr => s1.append(addr, exprV)
          case v => error(s"not an address: $v")
        }
      case IPrepend(expr, list) =>
        val (exprV, s0) = escapeCompletion(interp(expr)(st))
        val (listV, s1) = escapeCompletion(interp(list)(s0))
        listV match {
          case addr: Addr => s1.prepend(addr, exprV)
          case v => error(s"not an address: $v")
        }
      case IReturn(expr) =>
        val (value, s0) = interp(expr)(st)
        lazy val isNormal = value match {
          case addr: Addr => s0.heap.map.getOrElse(addr, error(s"unknown address: $addr")) match {
            case value @ IRMap(Ty("Completion"), props, _) =>
              props.getOrElse(Str("Type"), error(s"type should exist: $value"))._1 == NamedAddr("CONST_normal")
            case _ => true
          }
          case _ => true
        }
        if (COVERAGE_MODE) {
          s0.ctxStack.headOption.foreach(ctx => {
            visited += (
              s0.script,
              ReturnValueTarget(ctx.curInst.uid, isNormal)
            )
          })
        }
        if (getName) {
          if (!isNormal && nearErrorSyntax == "") {
            nearErrorSyntax = nameStack.find(_._1.start >= 0).map(_._2).getOrElse("")
          }

          if (st.context.name == "MakeBasicObject") nameStack.find(_._1.start >= 0).map {
            case (ast, name) => escapeCompletion((value, s0)) match {
              case (addr: Addr, st) => addrName += addr -> name
              case _ =>
            }
          }
        }
        if (evaluationAlgorithmPattern.matches(st.context.name)) astStack = astStack.tail
        if (getName && syntaxAlgorithmPattern.matches(st.context.name)) nameStack = nameStack.tail
        s0.ctxStack match {
          case Nil => s0.copy(context = s0.context.copy(locals = s0.context.locals + (s0.context.retId -> value), insts = Nil))
          case ctx :: rest => s0.copy(context = ctx.copy(locals = ctx.locals + (ctx.retId -> value)), ctxStack = rest)
        }
      case IIf(cond, thenInst, elseInst) =>
        val (v, s0) = escapeCompletion(interp(cond)(st))
        if (COVERAGE_MODE) visited += (st.script, inst.uid, v)
        v match {
          case Bool(true) => s0.copy(context = s0.context.copy(insts = thenInst :: s0.context.insts))
          case Bool(false) => s0.copy(context = s0.context.copy(insts = elseInst :: s0.context.insts))
          case v => error(s"not a boolean: $v")
        }
      case IWhile(cond, body) =>
        val (v, s0) = escapeCompletion(interp(cond)(st))
        if (COVERAGE_MODE) visited += (st.script, inst.uid, v)
        v match {
          case Bool(true) => s0.copy(context = s0.context.copy(insts = body :: inst :: s0.context.insts))
          case Bool(false) => s0
          case v => error(s"not a boolean: $v")
        }
      case ISeq(newInsts) => st.copy(context = st.context.copy(insts = newInsts ++ st.context.insts))
      case IAssert(expr) =>
        val (v, s0) = interp(expr)(st)
        v match {
          case Bool(true) => s0
          case Bool(false) =>
            error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: assertion failure: ${beautify(expr)}"); s0
          case Str(msg) =>
            error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: Error occured : $msg"); s0
          case addr: Addr => s0.get(addr) match {
            case Some(IRMap(Ty("Completion"), m, _)) => m(Str("Value"))._1 match {
              case Bool(true) => s0
              case Bool(false) =>
                error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: assertion failure: ${beautify(expr)}"); s0
              case Str(msg) =>
                error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: Error occured : $msg"); s0
              case v => error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: assertion is not a boolean: $v"); s0
            }
            case v => error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: assertion is not a boolean: $v"); s0
          }
          case v => error(s"\n${beautify(s0.globals.get(Id("__filename__")).getOrElse(Str("unknown")))} - ${s0.context.name}: assertion is not a boolean: $v"); s0
        }
      case IPrint(expr) =>
        val (v, s0) = interp(expr)(st)
        Helper.print(s0, v)
        s0
      case IApp(id, fexpr, args) =>
        val (fv, s0) = interp(fexpr)(st)
        fv match {
          case Func(fname, params, varparam, body) =>
            if (getName && syntaxAlgorithmPattern.matches(fname)) nameStack = (dummyAST, fname) :: nameStack
            val (locals0, s1, restArg) = params.foldLeft(Map[Id, Value](), s0, args) {
              case ((map, st, arg :: rest), param) =>
                val (av, s0) = interp(arg)(st)
                (map + (param -> av), s0, rest)
              case (triple, _) => triple
            }
            val (locals1, s2) = varparam.map((param) => {
              val (av, s0) = interp(EList(restArg))(s1)
              (locals0 + (param -> av), s0)
            }).getOrElse((locals0, s1))

            val updatedCtx = s2.context.copy(retId = id)
            if (COVERAGE_MODE) visited += fname
            val newCtx = Context(name = fname, insts = List(body), locals = locals1)
            s2.copy(context = newCtx, ctxStack = updatedCtx :: s2.ctxStack)
          case ASTMethod(Func(fname, params, _, body), baseLocals) =>
            val (locals, s1, _) = params.foldLeft(baseLocals, s0, args) {
              case ((map, st, arg :: rest), param) =>
                val (av, s0) = interp(arg)(st)
                (map + (param -> av), s0, rest)
              case (triple, _) => triple
            }

            val updatedCtx = s1.context.copy(retId = id)
            if (COVERAGE_MODE) visited += fname
            val newCtx = Context(name = fname, insts = List(body), locals = locals)
            s1.copy(context = newCtx, ctxStack = updatedCtx :: s1.ctxStack)
          case Cont(params, body, context, ctxStack) =>
            val (locals0, s1, restArg) = params.foldLeft(Map[Id, Value](), s0, args) {
              case ((map, st, arg :: rest), param) =>
                val (av, s0) = interp(arg)(st)
                (map + (param -> av), s0, rest)
              case (triple, _) => triple
            }

            val updatedCtx = context.copy(insts = List(body), locals = context.locals ++ locals0)
            s1.copy(context = updatedCtx, ctxStack = ctxStack)

          case v => error(s"not a function: $v")
        }
      case IAccess(id, bexpr, expr) =>
        val (base, s1) = interp(bexpr)(st)
        val (p, s2) = escapeCompletion(interp(expr)(s1))
        (base, p) match {
          case (addr: Addr, p) => s2.get(addr) match {
            case Some(IRMap(Ty("Completion"), m, _)) if !m.contains(p) => m(Str("Value"))._1 match {
              case a: Addr => s2.define(id, s2.heap(a, p))
              case Str(s) => s2.define(id, stringOp(s, p))
              case _ => error(s"Completion does not have value: $bexpr[$expr]")
            }
            case _ => s2.define(id, s2.heap(addr, p))
          }
          case (ASTVal(Lexical(kind, str)), Str(name)) => s2.define(id, (kind, name) match {
            case ("(IdentifierName \\ (ReservedWord))" | "IdentifierName", "StringValue") => Str(ESValueParser.parseIdentifier(str))
            case ("NumericLiteral", "MV" | "NumericValue") => ESValueParser.parseNumber(str)
            case ("StringLiteral", "SV" | "StringValue") => Str(ESValueParser.parseString(str))
            case ("NoSubstitutionTemplate", "TV") => catchUndef(Str(ESValueParser.parseTVNoSubstitutionTemplate(str)))
            case ("TemplateHead", "TV") => catchUndef(Str(ESValueParser.parseTVTemplateHead(str)))
            case ("TemplateMiddle", "TV") => catchUndef(Str(ESValueParser.parseTVTemplateMiddle(str)))
            case ("TemplateTail", "TV") => catchUndef(Str(ESValueParser.parseTVTemplateTail(str)))
            case ("NoSubstitutionTemplate", "TRV") => Str(ESValueParser.parseTRVNoSubstitutionTemplate(str))
            case ("TemplateHead", "TRV") => Str(ESValueParser.parseTRVTemplateHead(str))
            case ("TemplateMiddle", "TRV") => Str(ESValueParser.parseTRVTemplateMiddle(str))
            case ("TemplateTail", "TRV") => Str(ESValueParser.parseTRVTemplateTail(str))
            case (_, "Contains") => Func("", Nil, None, IReturn(EBool(false)))
            case _ => error(s"$kind, $str, $name")
          })
          case (astV: ASTVal, Str(name)) =>
            val ASTVal(ast) = astV
            name match {
              case "parent" => s2.define(id, ast.parent.map(ASTVal(_)).getOrElse(Absent))
              case name =>
                ast.semantics(name) match {
                  case Some((Func(fname, params, varparam, body), lst)) =>
                    val (locals, rest) = lst.foldLeft(Map[Id, Value](), params) {
                      case ((map, param :: rest), arg) =>
                        (map + (param -> arg), rest)
                      case (pair, _) => pair
                    }
                    if (evaluationAlgorithmPattern.matches(fname)) astStack = ast :: astStack
                    if (getName && syntaxAlgorithmPattern.matches(fname)) nameStack = (ast, fname) :: nameStack
                    rest match {
                      case Nil =>
                        val updatedCtx = s2.context.copy(retId = id)
                        if (COVERAGE_MODE) visited += fname
                        val newCtx = Context(name = fname, insts = List(body), locals = locals)
                        s2.copy(context = newCtx, ctxStack = updatedCtx :: s2.ctxStack)
                      case _ =>
                        s2.define(id, ASTMethod(Func(fname, rest, varparam, body), locals))
                    }
                  case None => ast.subs(name) match {
                    case Some(v) => s2.define(id, v)
                    case None => error(s"Unexpected semantics: ${ast.name}.$name")
                  }
                }
            }
          case (Str(str), p) => s2.define(id, stringOp(str, p))
          case v => error(s"not an address: $v")
        }
      case IWithCont(id, params, body) => {
        val s0 = st.define(id, Cont(params, ISeq(st.context.insts), st.context, st.ctxStack))
        s0.copy(context = s0.context.copy(insts = List(body)))
      }
      case ISetType(expr, ty) => escapeCompletion(interp(expr)(st)) match {
        case (addr: Addr, st) => st.heap.map.getOrElse(addr, error(s"unknown address: $addr")) match {
          case (map: IRMap) =>
            val heap = st.heap
            val newHeap = heap.copy(map = heap.map + (addr -> map.copy(ty = ty)))
            st.copy(heap = newHeap)
          case obj => error(s"not a map structure: $obj")
        }
        case (v, _) => error(s"not an address: $v")
      }
    }
    if (instCount % 100000 == 0) GC.gc(res)
    else res
  }

  // expresssions
  def interp(expr: Expr): State => (Value, State) = st => expr match {
    case ENum(n) => (Num(n), st)
    case EINum(n) => (INum(n), st)
    case EBigINum(b) => (BigINum(b), st)
    case EStr(str) => (Str(str), st)
    case EBool(b) => (Bool(b), st)
    case EUndef => (Undef, st)
    case ENull => (Null, st)
    case EAbsent => (Absent, st)
    case EMap(ty, props) =>
      val (addr, s0) = st.allocMap(ty)
      (addr, props.foldLeft(s0) {
        case (st, (e1, e2)) =>
          val (k, s0) = escapeCompletion(interp(e1)(st))
          val (v, s1) = interp(e2)(s0)
          s1.updated(addr, k, v)
      })
    case EList(exprs) =>
      val (vs, s0) = exprs.foldLeft(List[Value](), st) {
        case ((vs, st), expr) =>
          val (v, s0) = interp(expr)(st)
          (v :: vs, s0)
      }
      s0.allocList(vs.reverse)
    case ESymbol(desc) =>
      escapeCompletion(interp(desc)(st)) match {
        case (Str(str), st) => st.allocSymbol(Str(str))
        case (Undef, st) => st.allocSymbol(Undef)
        case (v, _) => error(s"not a string: $v")
      }
    case EPop(list, idx) =>
      val (l, s0) = escapeCompletion(interp(list)(st))
      val (k, s1) = escapeCompletion(interp(idx)(s0))
      l match {
        case addr: Addr => s1.pop(addr, k)
        case v => error(s"not an address: $v")
      }
    case ERef(ref) =>
      val (refV, s0) = interp(ref)(st)
      interp(refV)(s0)
    case ECont(params, body) =>
      (Cont(params, body, st.context, st.ctxStack), st)
    case EUOp(uop, expr) =>
      val (v, s0) = escapeCompletion(interp(expr)(st))
      (interp(uop)(v), s0)

    // logical operations
    case EBOp(OAnd, left, right) => shortCircuit(OAnd, false, _ && _, left, right, st)
    case EBOp(OOr, left, right) => shortCircuit(OOr, true, _ || _, left, right, st)
    case EBOp(bop, left, right) =>
      val (lv, s0) = escapeCompletion(interp(left)(st))
      val (rv, s1) = escapeCompletion(interp(right)(s0))
      (interp(bop)(lv, rv), s1)
    case ETypeOf(expr) => {
      val (v, s0) = interp(expr)(st)
      (Str(v match {
        case addr: Addr => s0.heap.map.getOrElse(addr, error(s"unknown address: $addr")) match {
          case IRNotSupported(tyname, desc) => tyname
          case IRMap(Ty("Completion"), m, _) => m(Str("Value"))._1 match {
            case addr: Addr => s0.heap.map.getOrElse(addr, error(s"unknown address: $addr")) match {
              case IRNotSupported(tyname, desc) => tyname
              case obj => obj.ty.name
            }
            case Num(_) | INum(_) => "Number"
            case BigINum(_) => "BigInt"
            case Str(_) => "String"
            case Bool(_) => "Boolean"
            case Undef => "Undefined"
            case Null => "Null"
            case Absent => "Absent"
            case Func(_, _, _, _) => "Function"
            case Cont(_, _, _, _) => "Continuation"
            case ASTVal(_) => "AST"
            case ASTMethod(_, _) => "ASTMethod"
          }
          case obj => obj.ty.name
        }
        case Num(_) | INum(_) => "Number"
        case BigINum(_) => "BigInt"
        case Str(_) => "String"
        case Bool(_) => "Boolean"
        case Undef => "Undefined"
        case Null => "Null"
        case Absent => "Absent"
        case Func(_, _, _, _) => "Function"
        case Cont(_, _, _, _) => "Continuation"
        case ASTVal(_) => "AST"
        case ASTMethod(_, _) => "ASTMethod"
      }), s0)
    }
    case EIsCompletion(expr) => {
      val (v, s0) = interp(expr)(st)
      (Bool(v match {
        case addr: Addr => s0.heap.map.getOrElse(addr, error(s"unknown address: $addr")) match {
          case IRMap(Ty("Completion"), _, _) => true
          case _ => false
        }
        case _ => false
      }), s0)
    }
    case EIsInstanceOf(base, kind) => escapeCompletion(interp(base)(st)) match {
      case (ASTVal(ast), s0) => (Bool(ast.name == kind || ast.getKinds.contains(kind)), s0)
      case (Str(str), s0) => (Bool(str == kind), s0)
      case (v, _) => error(s"not an AST value: $v")
    }
    case EGetElems(base, kind) => escapeCompletion(interp(base)(st)) match {
      case (ASTVal(ast), s0) => s0.allocList(ast.getElems(kind).map(ASTVal(_)))
      case (v, _) => error(s"not an AST value: $v")
    }
    case EGetSyntax(base) => escapeCompletion(interp(base)(st)) match {
      case (ASTVal(ast), s0) => (Str(ast.toString), s0)
      case (v, s0) => error(s"not an AST value: $v")
    }
    case EParseSyntax(code, rule, flags) =>
      val (v, s0) = escapeCompletion(interp(code)(st))
      val (p, s1) = escapeCompletion(interp(rule)(st)) match {
        case (Str(str), st) => (ESParser.rules.getOrElse(str, error(s"not exist parse rule: $rule")), st)
        case (v, _) => error(s"not a string: $v")
      }
      v match {
        case ASTVal(ast) =>
          val newVal = try {
            ASTVal(Await.result(Future(
              ESParser.parse(p(ast.parserParams), ast.toString).get
            ), timeLimit.map(_.seconds).getOrElse(Duration.Inf)))
          } catch {
            case e: TimeoutException => error("parser timeout")
            case e: Throwable => Absent
          }
          newVal match {
            case ASTVal(s) =>
              ModelHelper.checkSupported(s)
              // use same span of the original AST
              if (ast.start >= 0) s.updateSpan(ast.start)
            case _ =>
          }
          (newVal, s1)
        case Str(str) =>
          val (s2, parserParams) = interp(flags)(s1) match {
            case (addr: Addr, st) => st.heap(addr) match {
              case IRList(vs) => (st, vs.toList.map {
                case Bool(b) => b
                case v => error(s"not a boolean: $v")
              })
              case obj => error(s"not a list: $obj")
            }
            case v => error(s"not an address: $v")
          }
          val newVal = try {
            ASTVal(Await.result(Future(
              ESParser.parse(p(parserParams), str).get
            ), timeLimit.map(_.seconds).getOrElse(Duration.Inf)))
          } catch {
            case e: TimeoutException => error("parser timeout")
            case e: Throwable => Absent
          }
          newVal match {
            case ASTVal(s) => ModelHelper.checkSupported(s)
            case _ =>
          }
          (newVal, s2)
        case v => error(s"not an AST value or a string: $v")
      }
    case EConvert(expr, cop, l) => escapeCompletion(interp(expr)(st)) match {
      case (Str(s), s0) => {
        (cop match {
          case CStrToNum => Num(ESValueParser.str2num(s))
          case CStrToBigInt => ESValueParser.str2bigint(s)
          case _ => error(s"not convertable option: Str to $cop")
        }, s0)
      }
      case (INum(n), s0) => {
        val (radix, s1) = l match {
          case e :: rest => escapeCompletion(interp(e)(s0)) match {
            case (INum(n), s1) => (n.toInt, s1)
            case (Num(n), s1) => (n.toInt, s1)
            case _ => error("radix is not int")
          }
          case _ => (10, s0)
        }
        (cop match {
          case CNumToStr => Str(Helper.toStringHelper(n, radix))
          case CNumToInt => INum(n)
          case CNumToBigInt => BigINum(BigInt(n))
          case _ => error(s"not convertable option: Num to $cop")
        }, s1)
      }
      case (Num(n), s0) => {
        val (radix, s1) = l match {
          case e :: rest => escapeCompletion(interp(e)(s0)) match {
            case (INum(n), s1) => (n.toInt, s1)
            case (Num(n), s1) => (n.toInt, s1)
            case _ => error("radix is not int")
          }
          case _ => (10, s0)
        }
        (cop match {
          case CNumToStr => Str(Helper.toStringHelper(n, radix))
          case CNumToInt => INum((math.signum(n) * math.floor(math.abs(n))).toLong)
          case CNumToBigInt => BigINum(BigInt(new java.math.BigDecimal(n).toBigInteger))
          case _ => error(s"not convertable option: Num to $cop")
        }, s1)
      }
      case (BigINum(b), s0) => {
        (cop match {
          case CNumToBigInt => BigINum(b)
          case CNumToStr => Str(b.toString)
          case CBigIntToNum => Num(b.toDouble)
          case _ => error(s"not convertable option: Num to $cop")
        }, s0)
      }
      case (v, s0) => error(s"not an convertable value: $v")
    }
    case EContains(list, elem) =>
      val (l, s0) = escapeCompletion(interp(list)(st))
      l match {
        case (addr: Addr) => s0.heap(addr) match {
          case IRList(vs) =>
            val (v, s1) = escapeCompletion(interp(elem)(st))
            (Bool(vs contains v), s1)
          case obj => error(s"not a list: $obj")
        }
        case v => error(s"not an address: $v")
      }
    case ECopy(expr) =>
      val (v, s0) = escapeCompletion(interp(expr)(st))
      v match {
        case (addr: Addr) => s0.copyObj(addr)
        case v => error(s"not an address: $v")
      }
    case EKeys(expr) =>
      val (v, s0) = escapeCompletion(interp(expr)(st))
      v match {
        case (addr: Addr) => s0.keys(addr)
        case v => error(s"not an address: $v")
      }
    case ENotYetModeled(msg) => throw NotYetModeled(msg)
    case ENotSupported(msg) => throw NotSupported(msg)
  }

  // references
  def interp(ref: Ref): State => (RefValue, State) = st => ref match {
    case RefId(id) => (RefValueId(id), st)
    case RefProp(ref, expr) =>
      val (refV, s0) = interp(ref)(st)
      val (base, s1) = interp(refV)(s0)
      val (p, s2) = escapeCompletion(interp(expr)(s1))
      interp(base, p)(s2)
  }
  def interp(base: Value, p: Value): State => (RefValue, State) = st => {
    ((base, p) match {
      case (addr: Addr, p) => st.get(addr) match {
        case Some(IRMap(Ty("Completion"), m, _)) if !m.contains(p) => m(Str("Value"))._1 match {
          case a: Addr => RefValueProp(a, p)
          case Str(s) => RefValueString(s, p)
          case _ => error(s"Completion does not have value: $base[$p]")
        }
        case _ => RefValueProp(addr, p)
      }
      case (Str(str), p) => RefValueString(str, p)
      case v => error(s"not an address: $v")
    }, st)
  }

  def interp(refV: RefValue): State => (Value, State) = st => refV match {
    case RefValueId(id) =>
      (st.context.locals.getOrElse(id, st.globals.getOrElse(id, Absent)), st)
    case RefValueProp(addr, value) =>
      if (COVERAGE_MODE && addr == NamedAddr("PRIMITIVES"))
        visited += (st.script, st.context.curInst.uid, value)
      (st.heap(addr, value), st)
    case RefValueString(str, value) => (stringOp(str, value), st)
  }

  // unary operators
  def interp(uop: UOp): Value => Value = (uop, _) match {
    case (ONeg, Num(n)) => Num(-n)
    case (ONeg, INum(n)) => INum(-n)
    case (ONeg, BigINum(b)) => BigINum(-b)
    case (ONot, Bool(b)) => Bool(!b)
    case (OBNot, Num(n)) => INum(~(n.toInt))
    case (OBNot, INum(n)) => INum(~n)
    case (OBNot, BigINum(b)) => BigINum(~b)
    case (_, value) => error(s"wrong type of value for the operator $uop: $value")
  }

  // binary operators
  def interp(bop: BOp): (Value, Value) => Value = (bop, _, _) match {
    // double operations
    case (OPlus, Num(l), Num(r)) => Num(l + r)
    case (OSub, Num(l), Num(r)) => Num(l - r)
    case (OMul, Num(l), Num(r)) => Num(l * r)
    case (OPow, Num(l), Num(r)) => Num(math.pow(l, r))
    case (ODiv, Num(l), Num(r)) => Num(l / r)
    case (OMod, Num(l), Num(r)) => Num(modulo(l, r))
    case (OUMod, Num(l), Num(r)) => Num(unsigned_modulo(l, r))
    case (OLt, Num(l), Num(r)) => Bool(l < r)

    // double with long operations
    case (OPlus, INum(l), Num(r)) => Num(l + r)
    case (OSub, INum(l), Num(r)) => Num(l - r)
    case (OMul, INum(l), Num(r)) => Num(l * r)
    case (ODiv, INum(l), Num(r)) => Num(l / r)
    case (OMod, INum(l), Num(r)) => Num(modulo(l, r))
    case (OPow, INum(l), Num(r)) => Num(math.pow(l, r))
    case (OUMod, INum(l), Num(r)) => Num(unsigned_modulo(l, r))
    case (OLt, INum(l), Num(r)) => Bool(l < r)
    case (OPlus, Num(l), INum(r)) => Num(l + r)
    case (OSub, Num(l), INum(r)) => Num(l - r)
    case (OMul, Num(l), INum(r)) => Num(l * r)
    case (ODiv, Num(l), INum(r)) => Num(l / r)
    case (OMod, Num(l), INum(r)) => Num(modulo(l, r))
    case (OPow, Num(l), INum(r)) => Num(math.pow(l, r))
    case (OUMod, Num(l), INum(r)) => Num(unsigned_modulo(l, r))
    case (OLt, Num(l), INum(r)) => Bool(l < r)

    // string operations
    case (OPlus, Str(l), Str(r)) => Str(l + r)
    case (OSub, Str(l), INum(r)) => Str(l.dropRight(r.toInt))
    case (OMul, Str(l), INum(r)) => Str(l * r.toInt)
    case (OLt, Str(l), Str(r)) => Bool(l < r)

    // long operations
    case (OPlus, INum(l), INum(r)) => INum(l + r)
    case (OSub, INum(l), INum(r)) => INum(l - r)
    case (OMul, INum(l), INum(r)) => INum(l * r)
    case (ODiv, INum(l), INum(r)) =>
      val x = l.toDouble / r.toDouble
      if (x.toLong == x) INum(x.toLong) else Num(x)
    case (OPow, INum(l), INum(r)) =>
      val x = math.pow(l, r)
      if (x.toLong == x) INum(x.toLong) else Num(x)
    case (OUMod, INum(l), INum(r)) => INum(unsigned_modulo(l, r).toLong)
    case (OMod, INum(l), INum(r)) => INum(modulo(l, r).toLong)
    case (OLt, INum(l), INum(r)) => Bool(l < r)
    case (OBAnd, INum(l), INum(r)) => INum(l.toInt & r.toInt)
    case (OBOr, INum(l), INum(r)) => INum(l.toInt | r.toInt)
    case (OBXOr, INum(l), INum(r)) => INum(l.toInt ^ r.toInt)
    case (OLShift, INum(l), INum(r)) => INum((l.toInt << r.toInt).toLong)
    case (OSRShift, INum(l), INum(r)) => INum((l.toInt >> r.toInt).toLong)
    case (OURShift, INum(l), INum(r)) => INum((l.toLong & 0xffffffffL) >>> r.toInt)

    // logical operations
    case (OAnd, Bool(l), Bool(r)) => Bool(l && r)
    case (OOr, Bool(l), Bool(r)) => Bool(l || r)
    case (OXor, Bool(l), Bool(r)) => Bool(l ^ r)

    // equality operations
    case (OEq, ASTVal(l), ASTVal(r)) => Bool(l eq r)
    case (OEq, ASTVal(l), Str(r)) => Bool(l.toString == r)
    case (OEq, Str(l), ASTVal(r)) => Bool(l == r.toString)
    case (OEq, INum(l), Num(r)) => Bool(!(r equals -0.0) && l == r)
    case (OEq, Num(l), INum(r)) => Bool(!(l equals -0.0) && l == r)
    case (OEq, Num(l), Num(r)) => Bool(l equals r)
    case (OEq, Num(l), BigINum(r)) => Bool(l == r)
    case (OEq, BigINum(l), Num(r)) => Bool(l == r)
    case (OEq, INum(l), BigINum(r)) => Bool(l == r)
    case (OEq, BigINum(l), INum(r)) => Bool(l == r)
    case (OEq, l, r) => Bool(l == r)

    // double equality operations
    case (OEqual, INum(l), Num(r)) => Bool(l == r)
    case (OEqual, Num(l), INum(r)) => Bool(l == r)
    case (OEqual, Num(l), Num(r)) => Bool(l == r)
    case (OEqual, l, r) => Bool(l == r)

    // double with big integers
    case (OLt, BigINum(l), Num(r)) =>
      Bool(new java.math.BigDecimal(l.bigInteger).compareTo(new java.math.BigDecimal(r)) < 0)
    case (OLt, BigINum(l), INum(r)) =>
      Bool(new java.math.BigDecimal(l.bigInteger).compareTo(new java.math.BigDecimal(r)) < 0)
    case (OLt, Num(l), BigINum(r)) =>
      Bool(new java.math.BigDecimal(l).compareTo(new java.math.BigDecimal(r.bigInteger)) < 0)
    case (OLt, INum(l), BigINum(r)) =>
      Bool(new java.math.BigDecimal(l).compareTo(new java.math.BigDecimal(r.bigInteger)) < 0)

    // big integers
    case (OPlus, BigINum(l), BigINum(r)) => BigINum(l + r)
    case (OLShift, BigINum(l), BigINum(r)) => BigINum(l << r.toInt)
    case (OSRShift, BigINum(l), BigINum(r)) => BigINum(l >> r.toInt)
    case (OSub, BigINum(l), BigINum(r)) => BigINum(l - r)
    case (OSub, BigINum(l), INum(r)) => BigINum(l - r)
    case (OMul, BigINum(l), BigINum(r)) => BigINum(l * r)
    case (ODiv, BigINum(l), BigINum(r)) => BigINum(l / r)
    case (OMod, BigINum(l), BigINum(r)) => BigINum(modulo(l, r))
    case (OUMod, BigINum(l), BigINum(r)) => BigINum(unsigned_modulo(l, r))
    case (OUMod, BigINum(l), INum(r)) => BigINum(unsigned_modulo(l, r))
    case (OLt, BigINum(l), BigINum(r)) => Bool(l < r)
    case (OBAnd, BigINum(l), BigINum(r)) => BigINum(l & r)
    case (OBOr, BigINum(l), BigINum(r)) => BigINum(l | r)
    case (OBXOr, BigINum(l), BigINum(r)) => BigINum(l ^ r)
    case (OPow, BigINum(l), BigINum(r)) => BigINum(l.pow(r.toInt))
    case (OPow, BigINum(l), INum(r)) => BigINum(l.pow(r.toInt))
    case (OPow, BigINum(l), Num(r)) =>
      if (r.toInt < 0) Num(math.pow(l.toDouble, r)) else BigINum(l.pow(r.toInt))

    case (_, lval, rval) => error(s"wrong type: $lval $bop $rval")
  }
  private def modulo(l: BigInt, r: BigInt): BigInt = l % r
  private def unsigned_modulo(l: BigInt, r: BigInt): BigInt = {
    val m = l % r
    if (m * r < 0) m + r
    else m
  }
  private def modulo(l: BigInt, r: Long): BigInt = l % r
  private def unsigned_modulo(l: BigInt, r: Long): BigInt = {
    val m = l % r
    if (m * r < 0) m + r
    else m
  }
  private def modulo(l: Double, r: Double): Double = l % r
  private def unsigned_modulo(l: Double, r: Double): Double = {
    val m = l % r
    if (m * r < 0.0) m + r
    else m
  }
  // short circuit evaluation
  def shortCircuit(
    bop: BOp,
    base: Boolean,
    op: (Boolean, Boolean) => Boolean,
    left: Expr,
    right: Expr,
    st: State
  ): (Value, State) = interp(left)(st) match {
    case pair @ (Bool(`base`), _) => pair
    case (lv, s0) =>
      val (rv, s1) = interp(right)(s0)
      (lv, rv) match {
        case (Bool(l), Bool(r)) => (Bool(op(l, r)), s1)
        case (lval, rval) => error(s"wrong type: $lval $bop $rval")
      }
  }

  // escape completions
  def escapeCompletion(pair: (Value, State)): (Value, State) = pair match {
    case (addr: Addr, s: State) => s.get(addr) match {
      case Some(IRMap(Ty("Completion"), m, _)) => (m(Str("Value"))._1, s)
      case _ => pair
    }
    case _ => pair
  }

  // catch and set undefined
  def catchUndef(v: => Value): Value = try v catch { case _: Throwable => Undef }

  // string operations
  def stringOp(str: String, prop: Value): Value = prop match {
    case Str("length") => INum(str.length)
    case Str("ltrim") => Str(str.replaceAll(s"^$WSLT+", ""))
    case Str("rtrim") => Str(str.replaceAll(s"$WSLT+$$", ""))
    case Str("normNFC") => Str(normalize(str, Form.NFC))
    case Str("normNFD") => Str(normalize(str, Form.NFD))
    case Str("normNFKC") => Str(normalize(str, Form.NFKC))
    case Str("normNFKD") => Str(normalize(str, Form.NFKD))
    case INum(k) => Str(str(k.toInt).toString)
    case Num(k) => Str(str(k.toInt).toString)
    case v => error(s"wrong access of string reference: $str.$v")
  }

  // get values
  def getValue(st: State, str: String): (Value, State) =
    escapeCompletion(getValue(st, Parser.parseExpr(str)))
  def getValue(st: State, expr: Expr): (Value, State) =
    interp(expr)(st)
  def getValue(st: State, refV: RefValue): (Value, State) =
    interp(refV)(st)
  def getValue(st: State, addr: Addr, prop: String): (Value, State) =
    getValue(st, RefValueProp(addr, Str(prop)))

  // normal check
  def isNormal(st: State): Boolean = try {
    getValue(st, "result.Type")._1 == NamedAddr("CONST_normal")
  } catch { case e: IRError => false }

  // get tag
  private val errorNameRegex = "GLOBAL.([A-Z][a-z]+)Error.prototype".r
  def getTag(st: State, uidOpt: Option[Int]): Tag = uidOpt match {
    case Some(uid) => IRErrorTag(uid)
    case None =>
      if (isNormal(st)) NormalTag
      else getValue(st, "result.Value")._1 match {
        case addr: Addr => getValue(st, "result.Prototype")._1 match {
          case NamedAddr(errorNameRegex(name)) => ErrorThrowTag(name)
          case _ => ValueThrowTag(beautify(addr))
        }
        case x => ValueThrowTag(beautify(x))
      }
  }
}
