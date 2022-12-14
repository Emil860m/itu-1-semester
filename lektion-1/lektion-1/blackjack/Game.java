package blackjack;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    Boolean game;
    public Game() {
        game = true;
    }
    
    public void GameLoop() {
        System.out.println("BlackJack game");
        // setup game
        Deck deck = new Deck();
        
        ArrayList<Card> playerHand = new ArrayList();
        ArrayList<Card> dealerHand = new ArrayList();
        
        // initial draw
        System.out.print("You draw ");
        playerHand.add(deck.draw());
        PrintLastCardDrawn(playerHand);
        System.out.print("Dealer draw ");
        dealerHand.add(deck.draw());
        PrintLastCardDrawn(dealerHand);
        System.out.print("You draw ");
        playerHand.add(deck.draw());
        PrintLastCardDrawn(playerHand);
        dealerHand.add(deck.draw());
        
        // starting game loop
        while(game) {
            System.out.println("\n\n");
            System.out.println("The dealer hand:");
            System.out.println(dealerHand.get(0).toString());
            System.out.println("Hidden card");
            
            System.out.println("\nYour hand:");
            PrintHand(playerHand);
            
            System.out.println("hit or stay");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (input.toLowerCase().equals("hit")) {
                playerHand.add(deck.draw());
                PrintLastCardDrawn(playerHand);
                int score = CalculateScore(playerHand);
                if (score > 21) GameLoss();
                else if (score == 21) GameWin();
                
                
                
            }
            else {
                
                System.out.println("\n\nDealer hand");
                PrintHand(dealerHand);
                System.out.println("\n\nYour Hand");
                PrintHand(playerHand);
                // go to end game method
                EndGame(deck, playerHand, dealerHand);
            }
            
            //game = false; // test to make sure no infinite loop, remove later
        }
    }
    
    private void EndGame(Deck deck, ArrayList<Card> playerHand, ArrayList<Card> dealerHand) {
        game = false;
        int playerScore = CalculateScore(playerHand);
        while (CalculateScore(dealerHand) < 17) {
            dealerHand.add(deck.draw());
            System.out.print("Dealer draws ");
            PrintLastCardDrawn(dealerHand);
        }
        int dealerScore = CalculateScore(dealerHand);
        System.out.println("Dealer score: " + dealerScore);
        System.out.println("Your score: " + playerScore);
        if (dealerScore > 21|| dealerScore < playerScore) GameWin();
        else GameLoss();
    }
    
    private void GameWin() {
        game = false;
        System.out.println("You win!");
    }
    
    private void GameLoss() {
        game = false;
        System.out.println("You lost!");
    }
    
    private void PrintHand(ArrayList<Card> hand) {
        for(int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.println(card.toString());
        }
    }
    
    private void PrintLastCardDrawn(ArrayList<Card> hand) {
        Card card = hand.get(hand.size()-1);
        System.out.println(card.toString());
    }
    
    private int CalculateScore(ArrayList<Card> hand) {
        int total = 0;
        int aces = 0;
        for(int i = 0; i< hand.size(); i++) {
            if (hand.get(i).getValue()>9) {
                total += 10;
            }
            else if (hand.get(i).getValue() == 0) {
                total += 11;
                aces++;
            }
            else {
                total += hand.get(i).getValue()+1;
            }
        }
        while (total > 21) {
            if (aces > 0) {
                total -= 10;
                aces--;
            }
            else {
                break;
            }
        }
        //System.out.println(total);
        return total;
    }
}
