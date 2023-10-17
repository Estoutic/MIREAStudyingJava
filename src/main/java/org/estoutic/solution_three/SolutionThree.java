package org.estoutic.solution_three;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {

//        randomGenerate();
       checkUpRow();
    }

    public static void randomGenerate(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter arrays size: ");
        int arrayLength = scanner.nextInt();

        double[] firstRandomArray = new double[arrayLength];
        double[] secondRandomArray = new double[arrayLength];


        for (int i = 0; i < arrayLength; i++) {
            firstRandomArray[i] = Math.random();
        }

        for (int i = 0; i < arrayLength; i++) {
            secondRandomArray[i] = rand.nextDouble();
        }

        System.out.println("\nFirst not sorted Array: ");
        printArray(firstRandomArray);

        System.out.println("\nSecond not sorted Array: ");
        printArray(secondRandomArray);

        Arrays.sort(firstRandomArray);
        Arrays.sort(secondRandomArray);

        System.out.println("\nFirst sorted Array: ");
        printArray(firstRandomArray);

        System.out.println("\nSecond sorted Array: ");
        printArray(secondRandomArray);
    }

    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.println(element);
        }
    }

    public static void checkUpRow(){
        int arrayLength = 4;
        int[] randomArray = new int[arrayLength];
        Random rand = new Random();

        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = rand.nextInt(90) + 10;
        }

        System.out.print("Array: \n");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(randomArray[i] + " ");
        }

        boolean isIncreasing = true;
        for (int i = 1; i < arrayLength; i++) {
            if (randomArray[i] <= randomArray[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("\n True ");
        } else {
            System.out.println("\n False ");
        }
    }
}


        /*
        Таблица 3.2 Методы классов оболочек
                     Boolean Byte Character Double Float Integer Long Short isStatic
        byteValue      x        x          x      x       x          x         x        x
        doubleValue    x        x           x      x               x          x        x
        floatValue     x        x                    x          x               x
        intValue       x        x           x      x                x          x        x
        longValue      x        x           x      x                x          x        x
        shortValue     x               x           x                x
        parseXxx                x                             x
        parseXxx with radix                 x
        valueOf                     x                           x
        toString             x        x          x        x         x          x        x
        toString(primitive)        x                           x
        toString(primitive, radix)                     x
*/