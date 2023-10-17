package org.estoutic.solution_three;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyConverter {
    private double exchangeRate;

    public MoneyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {

        double usdToEurExchangeRate = 0.941;
        MoneyConverter usdToEurConverter = new MoneyConverter(usdToEurExchangeRate);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value in USD");

        double amountInUSD = scanner.nextDouble();

        double convertedAmount = usdToEurConverter.convert(amountInUSD);

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedAmount = df.format(convertedAmount);

        System.out.println(amountInUSD + " USD is equivalent to " + formattedAmount + " EUR");
    }
}


