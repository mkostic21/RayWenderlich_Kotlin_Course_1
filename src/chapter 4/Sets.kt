package `chapter 4`

fun main() {
    /*
  * Challenge:
  * - Create a list of strings, describing items on your table. If some items appear more than once, add them multiple
  * times to the list. E.g. you have two pens or four pieces of paper.
  *
  * - Turn that list into a set, using the `list.toSet()` function, and check if the duplicate items appear.
  * - Remove an item you don't really need on your desk, e.g. car keys.
  * - Iterate over the items, and print them out.
  */

    val items = listOf("Phone", "Headphones", "Keyboard", "Mug", "Mouse", "Headphones")
    val uniqueItems= items.toMutableSet()
    println(uniqueItems)
    uniqueItems.remove("Mug")

    for(item in uniqueItems)
        println(item)
}