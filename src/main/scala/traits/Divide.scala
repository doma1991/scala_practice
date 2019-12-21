package traits

object Divide {
  def apply(a: Int, b: Int): DivisionResult = {
    if(b == 0) Infinite else Finite(a / b)
  }
}

sealed trait DivisionResult
final case class Finite(value: Int) extends DivisionResult
case object Infinite extends DivisionResult

//  Divide(1, 0) match {
//    case Finite(value) => s"It's finite: ${value}"
//    case Infinite      => s"It's infinite"
//  }
