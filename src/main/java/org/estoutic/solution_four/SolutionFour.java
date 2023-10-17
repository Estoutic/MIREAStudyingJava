package org.estoutic.solution_four;

import java.util.Scanner;

public class SolutionFour {

    public static void main(String[] args) {


//        YearTime yearTime = YearTime.SUMMER;
//        System.out.println(yearTime.getValue());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite season of Year please");

        YearTime season = YearTime.valueOf(scanner.next().toUpperCase());


        checkSeason(season);
        System.out.println("Average temperature: " + season.getAverageTemperature() + "°C");
        System.out.println("Description: " + season.getDescription());

        System.out.println("All seasons:");
        for (YearTime yearTime : YearTime.values()) {
            System.out.println(yearTime.getName() + " - Average temperature: " + yearTime.getAverageTemperature() + "°C, Description: " + yearTime.getDescription());
        }
    }

    public static  void checkSeason(YearTime season){

        switch (season){
            case SPRING -> System.out.println("SPRING");
            case WINTER -> System.out.println("WINTER");
            case SUMMER -> System.out.println("SUMMER");
            default -> System.out.println("wrong season try again");
        }
    }
}
