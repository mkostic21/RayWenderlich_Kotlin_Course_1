fun main(){
    /**challenge:
     * properties not empty
     * userName length >= 6
     * password length >= 10
     * email contains '@' and '.'
     */
    val userName = "user123"
    val password = "asdf1234qwert"
    val email = "user123@fakemail.com"

    if(userName.isEmpty() || password.isEmpty() || email.isEmpty()){
        println("empty property error")
    } else if (userName.length < 6) {
        println("username error")
    } else if (password.length < 10) {
        println("password error")
    } else if (!(email.contains('@')) || !(email.contains("."))){
        println("email error")
    } else println("success")
}