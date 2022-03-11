package `chapter 3`

fun main() {
    /*
  * Challenge:
  *
  * Use a when expression to return which century an arbitrary year is from (as a String).
  * Cover at least the last three centuries, and return “This was looong ago!” for others.
  *
  * Then print out the returned value. Use Ranges for year comparison.
  * */
    val year = 1944
    val message = when (year) {
        in 2000..2022 -> "This was recently"
        in 1900..1999 -> "This was quite a while ago"
        in 1800..1899 -> "This was long time ago"
        else -> "This was looong ago!"
    }
    println(message)
}