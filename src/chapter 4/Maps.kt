package `chapter 4`

fun main() {
    /*
  * Create a map where each key is the name of a pet you have/had, and the value is the animal type that pet is.
  *
  * E.g. Key: "Max", Value: "German Shepard Dog".
  *
  * Add the values to the map, then remove a value, and finally, iterate over the map, printing out the entries.
  * */

    val pets = mutableMapOf<String, String>()
    pets["Rusta"] = "Cat"
    pets["Kimi"] = "Dog"
    pets["Greta"] = "Hamster"

    pets.remove("Rusta")

    for ((name, type) in pets) {
        println("$name is a $type")
    }
}