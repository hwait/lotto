package lotto.domain

import scala.util.Random

final case class Player(name: String, cards: List[Card]):
  def evaluate(balls: Set[Int]) =
    cards.map { card =>
      val found = card.card.intersect(balls).size
      val multiplier = Calc.multiplier(found)
      card.stake * multiplier
    }.sum

object Player:
  def apply(n: Int, maxCards: Int, stake: Int): Player =
    val name = s"player-$n"
    val nCards = Random.between(1, maxCards)
    val cards = (0 to nCards).toList.map { _ =>
      val numbers = Random.shuffle(1 to 36).take(6).toSet
      Card(numbers, stake)
    }
    Player(name, cards)
