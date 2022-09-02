package blackjack;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> cards;
    private int index;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // initialise instance variables
        cards = new ArrayList<>();
        for (int i = 0; i<52;i++) {
            int suit = i%4;
            int value = i%13;
            Card card = new Card(value, suit);
            cards.add(card);
        }
        shuffle();
    }

    
    public void shuffle() {
        Collections.shuffle(cards);
        this.index = 0;
    }
    
    public Card draw() {
        Card card = this.cards.get(index);
        this.index++;
        return card;
    }
    
    
    public void PrintDeck() {
        for(int i = 0; i < cards.size();i++) {
            System.out.println(cards.get(i).toString());
        }
    }
}
