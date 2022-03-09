fun main(){
    //challenge 1: check if password is secure (length >= 10):
    println("challenge 1:")
    val securePasswordLength = 10
    val shortPass = "123"
    val longPass = "0123456789qwerty"
    var passCheck = shortPass.length >= securePasswordLength
    println(passCheck)
    passCheck = longPass.length >= securePasswordLength
    println(passCheck)

    //challenge 2: check if 2 strings are the same length
    println("challenge 2:")
    val name1 = "asdfg"
    val name2 = "qwert"
    val name3 = "xyz"
    var nameCheck = name1.length == name2.length
    println(nameCheck)
    nameCheck = name2.length == name3.length
    println(nameCheck)

}