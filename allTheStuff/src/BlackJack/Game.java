package BlackJack;

import java.util.ArrayList;

public class Game {
    private final Deck deck;
    private final ArrayList<Card> playerHand;
    private final ArrayList<Card> dealerHand;

    public Game() {
        deck = new Deck();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
    }

    public static void main(String[] args) {
        Game game = new Game();
    }

    private void gameLoop() {

    }
}
