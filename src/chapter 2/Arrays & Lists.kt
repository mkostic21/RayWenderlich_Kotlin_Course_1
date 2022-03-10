package `chapter 2`

fun main(){
    /*
  * Challenge:
  *
  * Create an Array of your five favorite games - be it board games, card games, or video games.
  * Change an element within the Array, and print out the second game.
  *
  * Transform the array to a list that can change its contents, and add two more games you'd like to play or finish.
  *
  * Then remove a game you've played most recently.
  *
  * Print out the list of games you ended up with!
  *
  * Finally, check if the removed game is still in the list!
  * */

    val favouriteGames = arrayOf("CSGO", "WoW", "Ck3", "Rocket League", "Dota2")
    favouriteGames[2] = "Ck2"
    println(favouriteGames[1])

    val mutableFavouriteGames = favouriteGames.toMutableList()
    mutableFavouriteGames.addAll(listOf("Elden Ring", "Dark Souls"))

    val lastPlayedGame = mutableFavouriteGames[0]
    mutableFavouriteGames.remove(lastPlayedGame)
    println(mutableFavouriteGames)

    println(lastPlayedGame in mutableFavouriteGames)
}