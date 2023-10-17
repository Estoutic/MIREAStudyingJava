package org.estoutic.solution_three;

import java.util.Scanner;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to shop!");

        double priceInUSD = 50.0;
        double priceInEUR = 45.0;

        System.out.println("Choose course:");
        System.out.println("1. Dollars USA (USD)");
        System.out.println("2. Euro (EUR)");

        int choice = scanner.nextInt();
        double selectedPrice = 0.0;
        String currencySymbol = "";

        if (choice == 1) {
            selectedPrice = priceInUSD;
            currencySymbol = "USD";
        } else if (choice == 2) {
            selectedPrice = priceInEUR;
            currencySymbol = "EUR";
        } else {
            System.out.println("Incorrect");
            return;
        }

        System.out.println("Enter count of product");
        int quantity = scanner.nextInt();

        double totalCost = selectedPrice * quantity;

        System.out.println("Price: " + totalCost + " " + currencySymbol);

        scanner.close();
    }
}
