package blackjack;



public class Card
{
    private int value; //0-12
    private int suit; //0-3
    private String valueString; //ace, one, two... queen, king
    private String suitString; //hearts, diamonds, clubs, spades

    public Card(int value, int suit)
    {
        this.value = value;
        this.suit = suit;
        String[] values = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
        String[] suits = {"hearts","diamonds","clubs","spades"};
        this.valueString = values[value];
        this.suitString = suits[suit];
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    public String getValueString() 
    {
        return this.valueString;
    }
    
    public int getSuit()
    {
        return this.suit;
    }
    
    public String getSuitString() 
    {
        return this.suitString;
    }
    
    public String toString() {
        return this.valueString + " of " + this.suitString;
    }
}
