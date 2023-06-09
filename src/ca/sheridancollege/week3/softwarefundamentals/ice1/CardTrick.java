/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Name - Preet Kaur
* Student Id - 991698080

*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
        public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(Card.generateRandomNumber());
            card.setSuit(Card.SUITS[Card.generateRandomNumber(4)]);
            hand[i] = card;
        }
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the card: ");
        int value = scanner.nextInt();

        System.out.print("Enter the suit of the card (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int suitIndex = scanner.nextInt() - 1;

        String suit = null;
        if (suitIndex >= 0 && suitIndex < 4) {
            suit = Card.SUITS[suitIndex];
        }

        Card userCard = new Card(value, suit);
        boolean found = false;

        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("The card is not in the hand.");
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Preet Kaur, nice to meet you!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("I am a programmer. In future I want to start new startup in IT field ");
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Web Designing");
        
        System.out.println();
    }
}