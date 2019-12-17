package caseClass

case class FilmCase(name: String, yearOfRelease: Int, imdbRating: Double, director: DirectorCase) {

  def directorsAge: Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director: DirectorCase) =
    this.director == director

  def copy(
            name: String = this.name,
            yearOfRelease: Int = this.yearOfRelease,
            imdbRating: Double = this.imdbRating,
            director: DirectorCase = this.director): FilmCase = FilmCase(name, yearOfRelease, imdbRating, director)

}

object FilmCase  {
  def newer(film1: FilmCase, film2: FilmCase): FilmCase =
    if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2

  def highestRating(film1: FilmCase, film2: FilmCase): Double = {
    val rating1 = film1.imdbRating
    val rating2 = film2.imdbRating
    if (rating1 > rating2) rating1 else rating2
  }

  def oldestDirectorAtTheTime(film1: FilmCase, film2: FilmCase): DirectorCase =
    if (film1.directorsAge > film2.directorsAge) film1.director else film2.director
}
