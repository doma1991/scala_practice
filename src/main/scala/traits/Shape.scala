package traits

sealed trait Shape {
  def sides: Int

  def perimeter: Double

  def area: Double

}
