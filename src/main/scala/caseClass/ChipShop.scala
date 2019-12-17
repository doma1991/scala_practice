package caseClass

object ChipShop extends App {

  def willServe(cat: Cat): Unit = {
    cat match {
      case Cat(_, "fish") => println("Cat likes fish")
      case _ => println("Cat does not like fish")
    }
  }

  willServe(new Cat("black", "fish"))
  willServe(new Cat("black", "chicken"))

}
