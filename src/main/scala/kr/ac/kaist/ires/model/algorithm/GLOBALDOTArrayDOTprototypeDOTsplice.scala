package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTsplice {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Array.prototype.splice""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""start"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""deleteCount"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""relativeStart"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OLt, ERef(RefId(Id("""relativeStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeStart""")))), EINum(0L))), ILet(Id("""actualStart"""), ERef(RefId(Id("""__x5__""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeStart"""))), ERef(RefId(Id("""len"""))))), ILet(Id("""actualStart"""), ERef(RefId(Id("""__x6__"""))))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(0L)), ISeq(List(ILet(Id("""insertCount"""), EINum(0L)), ILet(Id("""actualDeleteCount"""), EINum(0L)))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(1L)), ISeq(List(ILet(Id("""insertCount"""), EINum(0L)), ILet(Id("""actualDeleteCount"""), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualStart"""))))))), ISeq(List(ILet(Id("""insertCount"""), EBOp(OSub, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(2L))), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""deleteCount"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""dc"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""dc"""))), EINum(0L))), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualStart""")))))), ILet(Id("""actualDeleteCount"""), ERef(RefId(Id("""__x9__""")))))))), IIf(EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""insertCount""")))), ERef(RefId(Id("""actualDeleteCount"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""actualDeleteCount"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x11__""")))), ILet(Id("""k"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""actualDeleteCount""")))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OPlus, ERef(RefId(Id("""actualStart"""))), ERef(RefId(Id("""k""")))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""from"""), ERef(RefId(Id("""__x12__""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x14__""")))), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""fromValue"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))), IApp(Id("""__x17__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""actualDeleteCount"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x17__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OLt, EINum(2L), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), ISeq(List(IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))))), IAssign(RefId(Id("""argumentsList""")), EList(List()))), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))), ILet(Id("""itemCount"""), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), IIf(EBOp(OLt, ERef(RefId(Id("""itemCount"""))), ERef(RefId(Id("""actualDeleteCount""")))), ISeq(List(IAssign(RefId(Id("""k""")), ERef(RefId(Id("""actualStart""")))), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount"""))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""actualDeleteCount""")))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), ILet(Id("""from"""), ERef(RefId(Id("""__x18__""")))), IApp(Id("""__x19__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""itemCount""")))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), ILet(Id("""to"""), ERef(RefId(Id("""__x19__""")))), IApp(Id("""__x20__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x20__"""))))), ISeq(List())), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x20__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x21__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x21__""")), ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x21__"""))))), ISeq(List())), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x21__""")))), IApp(Id("""__x22__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))), ERef(RefId(Id("""fromValue"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x22__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x22__""")), ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x22__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x22__""")))))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x23__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x23__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x23__"""))))))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))), IAssign(RefId(Id("""k""")), ERef(RefId(Id("""len""")))), IWhile(EBOp(OLt, EBOp(OPlus, EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount""")))), ERef(RefId(Id("""itemCount""")))), ERef(RefId(Id("""k""")))), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L)))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x24__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x24__""")), ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x24__"""))))), ISeq(List())), IApp(Id("""__x25__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x24__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x25__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x25__""")), ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x25__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x25__""")))), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L)))))))), IIf(EBOp(OLt, ERef(RefId(Id("""actualDeleteCount"""))), ERef(RefId(Id("""itemCount""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount"""))))), IWhile(EBOp(OLt, ERef(RefId(Id("""actualStart"""))), ERef(RefId(Id("""k""")))), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""actualDeleteCount""")))), EINum(1L)))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x26__"""))))), ISeq(List())), ILet(Id("""from"""), ERef(RefId(Id("""__x26__""")))), IApp(Id("""__x27__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""itemCount""")))), EINum(1L)))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x27__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x27__"""))))), ISeq(List())), ILet(Id("""to"""), ERef(RefId(Id("""__x27__""")))), IApp(Id("""__x28__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x28__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x28__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x28__""")), ERef(RefProp(RefId(Id("""__x28__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x28__"""))))), ISeq(List())), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x28__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x29__"""))))), ISeq(List())), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x29__""")))), IApp(Id("""__x30__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))), ERef(RefId(Id("""fromValue"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x30__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x30__""")))))), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x31__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x31__""")), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x31__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x31__"""))))))), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L)))))))), ISeq(List()))), IAssign(RefId(Id("""k""")), ERef(RefId(Id("""actualStart""")))), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), ISeq(List(ILet(Id("""E"""), EPop(ERef(RefId(Id("""items"""))), EINum(0L))), IApp(Id("""__x32__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x32__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x32__""")), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x32__"""))))), ISeq(List())), IApp(Id("""__x33__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x32__"""))), ERef(RefId(Id("""E"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x33__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x33__""")), ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x33__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x33__""")))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))), IApp(Id("""__x34__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EBOp(OPlus, EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount""")))), ERef(RefId(Id("""itemCount""")))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x34__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x34__""")))), IApp(Id("""__x35__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x35__""")))))))
  /* Beautified form:
  "GLOBAL.Array.prototype.splice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let deleteCount = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (ToInteger start)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let relativeStart = __x4__
    if (< relativeStart 0i) {
      app __x5__ = (max (+ len relativeStart) 0i)
      let actualStart = __x5__
    } else {
      app __x6__ = (min relativeStart len)
      let actualStart = __x6__
    }
    if (= argumentsList["length"] 0i) {
      let insertCount = 0i
      let actualDeleteCount = 0i
    } else if (= argumentsList["length"] 1i) {
      let insertCount = 0i
      let actualDeleteCount = (- len actualStart)
    } else {
      let insertCount = (- argumentsList["length"] 2i)
      app __x7__ = (ToInteger deleteCount)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let dc = __x7__
      app __x8__ = (max dc 0i)
      app __x9__ = (min __x8__ (- len actualStart))
      let actualDeleteCount = __x9__
    }
    if (< (- 9007199254740992i 1i) (- (+ len insertCount) actualDeleteCount)) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    app __x11__ = (ArraySpeciesCreate O actualDeleteCount)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let A = __x11__
    let k = 0i
    while (< k actualDeleteCount) {
      app __x12__ = (ToString (+ actualStart k))
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let from = __x12__
      app __x13__ = (HasProperty O from)
      if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let fromPresent = __x13__
      if (= fromPresent true) {
        app __x14__ = (Get O from)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let fromValue = __x14__
        app __x15__ = (ToString k)
        if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (CreateDataPropertyOrThrow A __x15__ fromValue)
        if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        __x16__
      } else {}
      k = (+ k 1i)
    }
    app __x17__ = (Set A "length" actualDeleteCount true)
    if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    __x17__
    if (< 2i argumentsList["length"]) {
      (pop argumentsList 0i)
      (pop argumentsList 0i)
    } else argumentsList = (new [])
    let items = argumentsList
    let itemCount = items["length"]
    if (< itemCount actualDeleteCount) {
      k = actualStart
      while (< k (- len actualDeleteCount)) {
        app __x18__ = (ToString (+ k actualDeleteCount))
        if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        let from = __x18__
        app __x19__ = (ToString (+ k itemCount))
        if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        let to = __x19__
        app __x20__ = (HasProperty O from)
        if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let fromPresent = __x20__
        if (= fromPresent true) {
          app __x21__ = (Get O from)
          if (= (typeof __x21__) "Completion") if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
          let fromValue = __x21__
          app __x22__ = (Set O to fromValue true)
          if (= (typeof __x22__) "Completion") if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
          __x22__
        } else {
          app __x23__ = (DeletePropertyOrThrow O to)
          if (= (typeof __x23__) "Completion") if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          __x23__
        }
        k = (+ k 1i)
      }
      k = len
      while (< (+ (- len actualDeleteCount) itemCount) k) {
        app __x24__ = (ToString (- k 1i))
        if (= (typeof __x24__) "Completion") if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
        app __x25__ = (DeletePropertyOrThrow O __x24__)
        if (= (typeof __x25__) "Completion") if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
        __x25__
        k = (- k 1i)
      }
    } else if (< actualDeleteCount itemCount) {
      k = (- len actualDeleteCount)
      while (< actualStart k) {
        app __x26__ = (ToString (- (+ k actualDeleteCount) 1i))
        if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
        let from = __x26__
        app __x27__ = (ToString (- (+ k itemCount) 1i))
        if (= (typeof __x27__) "Completion") if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
        let to = __x27__
        app __x28__ = (HasProperty O from)
        if (= (typeof __x28__) "Completion") if (= __x28__["Type"] CONST_normal) __x28__ = __x28__["Value"] else return __x28__ else {}
        let fromPresent = __x28__
        if (= fromPresent true) {
          app __x29__ = (Get O from)
          if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          let fromValue = __x29__
          app __x30__ = (Set O to fromValue true)
          if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          __x30__
        } else {
          app __x31__ = (DeletePropertyOrThrow O to)
          if (= (typeof __x31__) "Completion") if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
          __x31__
        }
        k = (- k 1i)
      }
    } else {}
    k = actualStart
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x32__ = (ToString k)
      if (= (typeof __x32__) "Completion") if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
      app __x33__ = (Set O __x32__ E true)
      if (= (typeof __x33__) "Completion") if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      __x33__
      k = (+ k 1i)
    }
    app __x34__ = (Set O "length" (+ (- len actualDeleteCount) itemCount) true)
    if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
    __x34__
    app __x35__ = (WrapCompletion A)
    return __x35__
  }
  */
}
