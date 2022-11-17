package BlackJack;

public class Card {
    private final int value;
    private final int suit;
    private final String valueString;
    private final String suitString;

    public Card(int index) {
        value = index % 13;
        String[] values = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        valueString = values[value];
        suit = index % 4;
        String[] suits = {"clubs", "hearts", "spades", "diamonds"};
        suitString = suits[suit];
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public String getValueString() {
        return valueString;
    }

    public String getSuitString() {
        return suitString;
    }

    @Override
    public String toString() {
        return valueString + " of " + suitString;
    }
}
