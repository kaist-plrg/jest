package kr.ac.kaist.ires.ir

// IR Objects
sealed trait Obj extends IRNode {
  // types
  def ty: Ty
}

// IR symbols
case class IRSymbol(desc: Value) extends Obj {
  val ty: Ty = Ty("Symbol")

  // getters
  def apply(key: Value): Value = key match {
    case Str("Description") => desc
    case v => error(s"an invalid symbol field access: $v")
  }
}

// IR maps
case class IRMap(ty: Ty, props: Map[Value, Value]) extends Obj {
  // getters
  def apply(prop: Value): Value = props.getOrElse(prop, Absent)

  // setters
  def updated(prop: Value, value: Value): IRMap = copy(props = props + (prop -> value))

  // deletes
  def deleted(prop: Value): IRMap = copy(props = props - prop)
}

// IR lists
case class IRList(values: Vector[Value]) extends Obj {
  // types
  def ty: Ty = Ty("List")

  // getters
  def apply(key: Value): Value = key match {
    case INum(long) =>
      val idx = long.toInt
      if (0 <= idx && idx < values.length) values(idx)
      else Absent
    case Str("length") => INum(values.length)
    case v => error(s"not an integer key: $v")
  }

  // appends
  def append(value: Value): IRList = IRList(values :+ value)

  // prepends
  def prepend(value: Value): IRList = IRList(value +: values)

  // pops
  def pop(idx: Value): (Value, IRList) = idx match {
    case INum(long) =>
      val k = long.toInt
      if (k < 0 || k >= values.length) error(s"Out of range: $k of $this")
      (values(k), IRList(values.slice(0, k) ++ values.slice(k + 1, values.length)))
    case v =>
      error(s"not an integer index: $v of $this")
  }
}

// IR not supported objects
case class IRNotSupported(tyname: String, desc: String) extends Obj {
  val ty: Ty = Ty(tyname)
}
