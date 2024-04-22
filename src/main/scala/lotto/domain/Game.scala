package lotto.domain

import scala.util.Random

final case class Game(id: String, players: List[Player] = List.empty, balls: Set[Int] = Set.empty):
  def evaluate(): Int = players.map(_.evaluate(balls)).sum

object Game:
  def apply(minPlayers: Int, maxPlayers: Int): Game =
    val id = java.util.UUID.randomUUID.toString
    val nPlayers = Random.between(minPlayers, maxPlayers)
    val players = (0 to nPlayers).toList.map(Player(_, 10, 100))
    val balls = Random.shuffle(1 to 36).take(6).toSet
    Game(id, players, balls)
