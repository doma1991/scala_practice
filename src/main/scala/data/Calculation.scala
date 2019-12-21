package data

trait Calculation

case class Success(result: Int) extends Calculation
case class Fail(result: String) extends Calculation

object Calculator {
  def plus(calc: Calculation, num: Int): Calculation = {
    calc match {
      case Success(result) => Success(result + num)
      case Fail(reason) => Fail(reason)
    }
  }
  def minus(calc: Calculation, num: Int): Calculation = {
    calc match {
      case Success(result) => Success(result - num)
      case Fail(reason) => Fail(reason)
    }
  }
  def divide(calc: Calculation, num: Int): Calculation = {
    calc match {
      case Success(result) =>
        num match {
          case 0 => Fail("Division by zero")
          case _ => Success(result / num)}
      case Fail(reason) => Fail(reason)
    }
  }
}