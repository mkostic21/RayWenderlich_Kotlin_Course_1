package `chapter 2`

fun main(){
    /*
  * Create a Pair which holds information about a Bank Account.
  * A Bank Account needs to have a Credit Card connected to it, and a balance. (Hint: You can nest a Triple in a Pair)
  * A Credit Card should have a Card number, security code, and the type of the card (e.g. "Visa", "MasterCard").
  *
  * Print out the data for the Account, while hiding the security code.
  * */

    val creditCard = Triple("1234567890123456", "322", "Visa")
    val account = Pair(creditCard, 432.98)
    val (cardNumber, _, cardType) = creditCard

    println("Credit card $cardNumber, type: $cardType, balance: ${account.second}€")
}