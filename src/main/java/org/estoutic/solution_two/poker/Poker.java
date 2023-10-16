package org.estoutic.solution_two.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter players count: ");
        int numberOfPlayers = scanner.nextInt();

        if (numberOfPlayers < 1) {
            System.out.println("Players count must be > 0 ");
            return;
        } else if (numberOfPlayers > 10) {

            System.out.println("Players count must be < 10 ");
            return;

        }
        List<String> deck = createDeck();
        shuffleDeck(deck);

        int cardsPerPlayer = 5;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + ":");
            dealCards(deck, cardsPerPlayer);
            System.out.println();
        }
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♠", "♥", "♦", "♣"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    private static void dealCards(List<String> deck, int numCards) {
        for (int i = 0; i < numCards; i++) {
            System.out.println(deck.remove(0));
        }
    }
}
