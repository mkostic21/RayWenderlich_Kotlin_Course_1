package `chapter 6`
/*
* Challenge:
*
* Create a class which represents a Movie, a Video Game or a Song, whichever you prefer the most.
* Add appropriate properties to the class, e.g. "name", "genre", "length" if it's a movie or a song.
*
* To those classes, add methods which format the properties in a String for you to print out.
* Remember to add visibility modifiers where applicable, and get methods if needed.
*
* Create a few objects of the class type, and print out their formatted data.
* */

class Song(
    private val name: String,
    private val genre: String,
    private val length: Int
) {
    fun getPrintableData(): String {
        return "Song name: $name, genre: $genre, length: $length seconds"
    }
}

fun main() {
    val song1 = Song("creative song name 1", "genre1", 120)
    val song2 = Song("song name 2", "genre 2", 90)
    println(song1.getPrintableData())
    println(song2.getPrintableData())
}