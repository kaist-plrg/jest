package kr.ac.kaist.jest.ir

case class Context(
    retId: Id = Id("__retId__"),
    name: String = "<top-level>",
    curInst: Inst = ISeq(Nil),
    insts: List[Inst] = Nil,
    locals: Map[Id, Value] = Map()
) extends IRNode {

  // initialize local variables
  def define(id: Id, value: Value): Context = copy(locals = locals + (id -> value))

  def deleted(id: Id): Context = copy(locals = locals - id)

}
