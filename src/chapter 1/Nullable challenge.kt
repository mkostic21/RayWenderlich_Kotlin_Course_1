fun main(){
    /*
  * Challenge:
  * Declare a variable of type String? called `password` and assign a value to it.
  * Using an if expression, check the level of password strength, and assign an appropriate message to another
  * constant named `message`. Then print out the message.
  *
  * Levels are designed as follows:
  *
  * 0 characters or `null` -> “Ehm, you need a password to keep safe!”
  * 1-5 characters -> “Weak password! Try adding a few more symbols to it!”
  * 6-10 characters -> “Medium-strength password.”
  * 11-15 characters -> “No one is getting through this!”
  * 15+ characters -> "Ironclad"
  * */

    val password: String? = "12345asdfgqweryxyz"
    val message = if (password.isNullOrEmpty()) {
        "Ehm, you need a password to keep safe!"
    } else if(password.length < 6){
        "Weak password! Try adding a few more symbols to it!"
    } else if (password.length < 11){
        "Medium-strength password."
    } else if (password.length <= 15){
        "No one is getting through this!"
    } else "Ironclad"

    println(message)
}

