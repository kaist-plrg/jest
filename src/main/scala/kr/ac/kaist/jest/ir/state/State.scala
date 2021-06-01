package kr.ac.kaist.jest.ir

// IR States
case class State(
    script: String = "",
    context: Context = Context(),
    ctxStack: List[Context] = List(),
    globals: Map[Id, Value] = Map(),
    heap: Heap = Heap()
) extends IRNode {
  // getters
  def get(addr: Addr): Option[Obj] = heap.get(addr)
  def apply(addr: Addr): Obj = heap(addr)

  // initialize local variables
  def define(id: Id, value: Value): State = copy(context = context.define(id, value))

  // setters
  def updated(refV: RefValue, value: Value): State = refV match {
    case RefValueId(id) => updated(id, value)
    case RefValueProp(addr, key) => updated(addr, key, value)
    case _ => error(s"illegal reference update: $refV = $value")
  }
  def updated(id: Id, value: Value): State =
    if (id.name.startsWith("GLOBAL_")) copy(globals = globals + (id -> value))
    else copy(context = context.define(id, value))
  def updated(addr: Addr, key: Value, value: Value): State =
    copy(heap = heap.updated(addr, key, value))

  // deletes
  def deleted(refV: RefValue): State = refV match {
    case RefValueId(id) =>
      copy(context = context.deleted(id))
    case RefValueProp(addr, prop) =>
      copy(heap = heap.deleted(addr, prop))
    case _ => error(s"illegal reference delete: delete $refV")
  }

  // appends
  def append(addr: Addr, value: Value): State = {
    copy(heap = heap.append(addr, value))
  }

  // prepends
  def prepend(addr: Addr, value: Value): State = {
    copy(heap = heap.prepend(addr, value))
  }

  // pops
  def pop(addr: Addr, idx: Value): (Value, State) = {
    val (value, newHeap) = heap.pop(addr, idx)
    (value, copy(heap = newHeap))
  }

  // copy objects
  def copyObj(addr: Addr): (Addr, State) = {
    val (newAddr, newHeap) = heap.copyObj(addr)
    (newAddr, copy(heap = newHeap))
  }

  // keys of map
  def keys(addr: Addr): (Addr, State) = {
    val (newAddr, newHeap) = heap.keys(addr)
    (newAddr, copy(heap = newHeap))
  }

  // map allocations
  def allocMap(ty: Ty): (Addr, State) = allocMap(ty, Map())
  def allocMap(ty: Ty, map: Map[Value, Value]): (Addr, State) = {
    val (newAddr, newHeap) = heap.allocMap(ty, map)
    (newAddr, copy(heap = newHeap))
  }

  // list allocations
  def allocList(list: List[Value]): (Addr, State) = {
    val (newAddr, newHeap) = heap.allocList(list)
    (newAddr, copy(heap = newHeap))
  }

  // symbol allocations
  def allocSymbol(desc: Value): (Addr, State) = {
    val (newAddr, newHeap) = heap.allocSymbol(desc)
    (newAddr, copy(heap = newHeap))
  }
}
