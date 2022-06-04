package com.bridgelabz;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
	void welcome() {
		System.out.println("welcome to the card game");
	}
     int seqeunce;
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
	String[][] deck = new String[suits.length][ranks.length];
	
    public void listOfTheCard() {
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				System.out.println(((seqeunce++)+"="+ranks[i] + "=>" + suits[j]));
			}
		}
    }	
	
    public void noOfPlayers() {
		System.out.print("\nno of player should be 4 : ");
		Scanner scanner=new Scanner(System.in);
		int player = scanner.nextInt();
		if (player == 4) {
			System.out.println("\n" + player + " players will play the game");
		} else {
			System.out.println("Please enter number of players in the Range");	
		}
	}
  
	public void cardCreation() {
        for(int i=0;i<suits.length;i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i][j] = suits[i]+ranks[j];
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                int m = random.nextInt(i+1);
                int n = random.nextInt(j+1);
                String temp = deck[i][j];
                deck[i][j] = deck[m][n];
                deck[m][n] = temp;
            }
        }
    }

    public void distribute() {
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Cards Recieved By Player "+(i+1)+ " are");
            for (int j = 0; j < 9; j++) {
                System.out.println("  "+deck[i][j]);
            }
        }
    }
//Main class
	public static void main(String[] args) {
		DeckOfCards deckOfCardsGame = new DeckOfCards();
	    deckOfCardsGame.welcome();
		deckOfCardsGame.listOfTheCard();
		deckOfCardsGame.noOfPlayers();
        deckOfCardsGame.cardCreation();
        deckOfCardsGame.shuffle();
        deckOfCardsGame.distribute();

	}
}



