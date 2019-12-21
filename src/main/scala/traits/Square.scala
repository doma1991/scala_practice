package traits

case class Square(length: Double) extends Rectangular {
  val height = length
  val width = length
}

