fun main(args: Array<String>) {

    val footballPlayer = FootballPlayer("Football Player 1")
    val footballPlayer2 = FootballPlayer("Football Player 2")

    val baseballPlayer = FootballPlayer("Baseball Player 1")
    val baseballPlayer2 = FootballPlayer("Baseball Player 2")

    val footballTeam = Team<FootballPlayer>("Football Team", mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer2)

    val baseballTeam = Team("Baseball Team", mutableListOf(baseballPlayer))
    baseballTeam.addPlayers(baseballPlayer2)
}

class Team<T: Player>(val name:String, val players:MutableList<T>){
    fun addPlayers(player: T){
        if(players.contains(player)) {
            println("Player: ${player.name} is already in the team ${this.name}.")
        }else{
            players.add(player)
            println("Player: ${player.name} was added in the team ${this.name}.")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)