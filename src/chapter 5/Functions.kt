package `chapter 5`

fun main() {
    /*
     * Challenge 1:
     *
     * Create a function which takes in two parameters - a name and a last name. Because not everyone has a last name,
     * leave the lastName parameter to be an empty String if it is not passed in.
     *
     * Then return how long the person's full name is.
     */

    fun getNameLength(name: String, lastname: String = ""): Int {
        return name.length + lastname.length
    }
    println(getNameLength("Mario"))

    /*
    * Challenge 2:
    *
    * Overload the function from the first challenge, by adding a list of Strings parameter, for middle names,
    * in case someone has one or more middle names.
    *
    * Use the function to return the full name length, for a name with and without middle names.
    * Remember to use named arguments if needed.
    * */

    fun getNameLength(name: String, middleNames: List<String>, lastname: String = ""): Int {
        val middleNamesLength = middleNames.sumOf { middleName -> middleName.length }
        return getNameLength(name, lastname) + middleNamesLength
    }
    println(getNameLength("Franz", listOf("Karl", "Ludwig", "Joseph", "Maria"), "Ferdinand"))
}