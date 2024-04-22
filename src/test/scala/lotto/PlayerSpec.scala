package lotto.domain

class PlayerSpec extends munit.FunSuite {
  test("create player") {
    val player = Player(1, 10, 100)
    assert(player.cards.size < 10)
    assertEquals(player.name, "player-1")
    assertEquals(player.cards(0).stake, 100)
  }
  test("evaluate player's hand") {
    val card1 = Card(Set(1, 2, 3, 4, 5, 6), 100)
    val card2 = Card(Set(4, 5, 6, 7, 8, 9), 100)
    val balls = Set(2, 3, 4, 5, 8, 9)
    val player = Player("", List(card1, card2))
    assertEquals(player.evaluate(balls), 2000)
  }
}
