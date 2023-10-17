package org.estoutic.solution_four;

public enum YearTime {

    SUMMER("Summer", 30, "Warm Season"),
    SPRING("Spring", 15, "Cool Season"),
    WINTER("Winter", 0, "Cold Season");

    private final String name;
    private final int averageTemperature;
    private final String description;

    YearTime(String name, int averageTemperature, String description) {
        this.name = name;
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }
}
