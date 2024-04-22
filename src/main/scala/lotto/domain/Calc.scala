package lotto.domain

object Calc:
  val multipliers = Map(
    0 -> -1,
    1 -> -1,
    2 -> -1,
    3 -> 1,
    4 -> 10,
    5 -> 100,
    6 -> 1000
  )

  def multiplier(correct: Int): Int =
    multipliers.getOrElse(correct, -1)
