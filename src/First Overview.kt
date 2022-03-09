fun main(){
/*
  * Challenge:
  * Create several values describing you as a person, in pieces of data. The pieces of data are as follows:
  * - Name
  * - Last name
  * - Nickname (if exists)
  * - Country
  * - Age
  *
  * Then find your year of birth using your age, and print out your data in the following format.
  *
  * Note: If you're underaged (< 18 years old), omit your `name`, and if you don't have a nickname, remove it from
  * the format.
  *
  * Format:
  * "$name '$nickname' $lastName, born on $yearOfBirth, in $country", if you have a nickname, otherwise, remove the
  * nickname from the format.
  * */

    val name = "Mislav"
    val lastName = "Kostic"
    var nickname: String? = "Mimi"
    val country = "Croatia"
    val age = 24

    val yearOfBirth = 2022 - age

    val printableName = if (age < 18) "" else name
    val printableNickanme = nickname ?: ""

    println("$printableName '$printableNickanme' $lastName, born in $yearOfBirth, in $country")
}