package traits

object Draw {
  def apply(shape: Shape) =
    shape match {
    case Rectangle(width, height) =>
      s"A rectangle of width ${width}cm and height ${height}cm"

    case Square(length) =>
      s"A square of size ${length}cm"

    case Circle(radius) =>
      s"A circle of radius ${radius}cm"
  }
}
