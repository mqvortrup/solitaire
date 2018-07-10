package qm.com.solitaire.deck

enum class Suit(index : Int) {
    CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3)
}

enum class Rank(index : Int) {
    ACE(0),
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11), QUEEN(12), KING(12)
}

data class Card(val rank: Rank, val suit: Suit)

class Deck {
    val cards = List<Card>(52) {
        Card(Rank.values()[it % 4], Suit.values()[it/13])
    }

    override fun toString(): String {
        return cards.toString()
    }
}

fun main(args : Array<String>) {
    println(message = Deck())
}