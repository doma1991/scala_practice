package caseClass

case class DirectorCase(firstName:String, lastName: String, yearOfBirth: Int) {

  val name: String = s"firstName + lastName"

}

object DirectorCase {
  def older(director1: DirectorCase, director2: DirectorCase): DirectorCase =
    if (director1.yearOfBirth < director2.yearOfBirth) director1 else director2
}


