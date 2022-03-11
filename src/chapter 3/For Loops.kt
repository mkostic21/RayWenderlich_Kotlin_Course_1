package `chapter 3`

fun main(){
    /*
  * Challenge 1:
  * Create a range of 20 numbers, and iterate over it, printing out the numbers.
  *
  * Challenge 2:
  * Iterate over the range in Challenge 1 again, but print every third number.
  *
  * Challenge 3:
  * Create a decreasing range of 15 numbers, and print every second number.
  * */

    //challenge 1
    val numRange = 0..20
    for (number in numRange){
        print("$number ")
    }

    //challenge 2
    println()
    for(number in numRange step 3){
        print("$number ")
    }

    //challenge 3
    println()
    val decreasingNumRange = 15 downTo 0
    for(number in decreasingNumRange step 2){
        print("$number ")
    }
}