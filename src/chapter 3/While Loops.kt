package `chapter 3`

fun main() {
    /*
  * Challenge 1:
  * Print numbers from 1 to 15, using a while loop.
  *
  * Challenge 2:
  * Create an array or list of names. Using a do-while loop, and an iterator, print the names in a reverse order.
  * Make sure to check that the iterator is within the bounds of the array's size. (from `lastIndex` to 0).
  * */

    //challenge 1
    var i = 1
    while (i <= 15) {
        print("${i++} ")
    }

    //challenge 2
    val names = arrayOf("name1", "name2", "name3", "name4")
    i = names.lastIndex
    println()
    do {
        if (i < 0) return
        println(names[i--])
    } while (i >= 0)
}