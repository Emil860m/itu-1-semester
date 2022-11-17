package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;
    int index;

    public Deck() {
        cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(i));
        }
        Collections.shuffle(cards);
        index = -1;
    }

    public Card draw() {
        index++;
        return cards.get(index);
    }

    public void shuffle() {
        Collections.shuffle(cards);
        index = -1;
    }
}
