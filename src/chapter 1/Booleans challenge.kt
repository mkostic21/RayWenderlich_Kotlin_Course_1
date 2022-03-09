fun main(){
    /*
    * Challenge 1:
    * Check and store in a Boolean if a password is secure.
    * For simplicity, we can say that a password is secure if it has
    * at least 10 characters.
    * */
    println("challenge 1:")
    val securePasswordLength = 10
    val shortPass = "123"
    val longPass = "0123456789qwerty"
    var passCheck = shortPass.length >= securePasswordLength
    println(passCheck)
    passCheck = longPass.length >= securePasswordLength
    println(passCheck)

    /*
    * Challenge 2:
    * Check if two people have the same name length.
    * */
    println("challenge 2:")
    val name1 = "Mario"
    val name2 = "Marco"
    val name3 = "Tin"
    var nameCheck = name1.length == name2.length
    println(nameCheck)
    nameCheck = name2.length == name3.length
    println(nameCheck)

}