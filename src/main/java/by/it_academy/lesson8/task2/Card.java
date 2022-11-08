package by.it_academy.lesson8.task2;

public class Card {
    private final int cost;
    private final Suit suit;

    public Card(Suit suit, int cost) {
        this.cost = cost;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit.toString() + " " + getVlue();

    }

    private String getVlue() {
        if (cost < 11) {
            return String.valueOf(cost);
        }
        switch (cost) {
            case 11:
                ;
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
        }
        return " ";

    }
}




