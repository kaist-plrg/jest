package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CopyDataBlockBytes extends Algorithm {
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = parseFunc(""""CopyDataBlockBytes" (toBlock, toIndex, fromBlock, fromIndex, count) => {
    !!! "Etc"
    assert (! (< fromSize (+ fromIndex count)))
    !!! "Etc"
    assert (! (< toSize (+ toIndex count)))
    while (< 0i count) {
      if (= (typeof fromBlock) "SharedDataBlock") {
        !!! "Etc"
        !!! "Etc"
        !!! "Etc"
        let readEvent = (new ReadSharedMemory("Order" -> "Unordered", "NoTear" -> true, "Block" -> fromBlock, "ByteIndex" -> fromIndex, "ElementSize" -> 1i))
        append readEvent -> eventList
        append (new ChosenValueRecord("Event" -> readEvent, "ChosenValue" -> bytes)) -> execution["ChosenValues"]
        if (= (typeof toBlock) "SharedDataBlock") append (new WriteSharedMemory("Order" -> "Unordered", "NoTear" -> true, "Block" -> toBlock, "ByteIndex" -> toIndex, "ElementSize" -> 1i, "Payload" -> bytes)) -> eventList else toBlock[toIndex] = bytes[0i]
      } else {
        assert (! (= (typeof toBlock) "SharedDataBlock"))
        toBlock[toIndex] = fromBlock[fromIndex]
      }
      !!! "Etc"
      count = (- count 1i)
    }
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
