package org.estoutic.solution_one;

import java.util.Scanner;

public class SolutionOne {
    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        printConsoleArgs(args);
//        printHarmonicRow();
        System.out.println(getFactorial(4));
    }

    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < 10; i++) {
            array[i] = i + i / 2;
        }

        int sum = 0;

        for (int el : array) {
            sum += el;
        }

        System.out.printf("sum : %d \n", sum);
        System.out.printf("middle sum : %.2f \n", (double) sum / arraySize);
    }

    public static void secondTask() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();


        int[] array = new int[arraySize];

        int count = 0;
        do {
            array[count] = scanner.nextInt();
            count++;
        } while (count < arraySize);

        int sum = 0;
        count = 0;
        while (count < arraySize) {
            sum += array[count];
            count++;
        }

        int max = array[0];
        int min = array[0];
        for (count = 1; count < arraySize; count++) {
            if (array[count] > max) {
                max = array[count];
            }
            if (array[count] < min) {
                min = array[count];
            }
        }

        System.out.printf("sum : %d \n", sum);
        System.out.printf("min element :  %d \n", min);
        System.out.printf("max element :  %d \n", max);

    }

    public static void printConsoleArgs(String[] args) {
        for (String el : args) {
            System.out.println(el);
        }
    }

    public static  void printHarmonicRow(){
        double harmonicSum = 0.0;

        System.out.println("First 10 num of harmonic row : ");

        for (int i = 1; i <= 10; i++) {
            harmonicSum += 1.0 / i;
            System.out.printf("H_%d = %.4f%n", i, harmonicSum);
        }
    }
    public static long getFactorial(int num){
        if (num < 0) {
            System.out.println("Negative num");
            return -1;
        }

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
