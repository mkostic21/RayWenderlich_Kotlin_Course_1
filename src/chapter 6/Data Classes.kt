package `chapter 6`

fun main() {
    /*
  * Challenge:
  *
  * Following the first challenge in this course, change the classes from the first challenge to be `data` classes
  * instead, and remove unnecessary code, such as the formatting method, to rely on `toString()` instead.
  *
  * Also make sure the class is immutable (use `val`s instead of `var`s, public modifiers for access).
  *
  * Create a copy of a certain object you created, and compare it for data equality and identity (reference equality).
  *
  * Destructure the object, and use the properties to print out its data.
  * */

    data class Song(
        val name: String,
        val genre: String,
        val length: Int
    )

    val song1 = Song("song name", "generic genre", 213)
    val song2 = song1.copy()

    println(song1 == song2)
    println(song1 === song2)

    val (name, genre, length) = song2
    println("Song name: $name, genre: $genre, length: $length seconds")
}