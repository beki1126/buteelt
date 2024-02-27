package buteelt;

import java.util.ArrayList;
import java.util.List;

public class GeometricProgressionAverage<T extends Number> {
    public static void main(String[] args) {
        // Define the constants
        final double COMMON_RATIO = 2.0;
        final int NUM_TERMS = 5;

        // Create a list to store the terms of the geometric progression
        List<Double> progression = new ArrayList<>();

        // Calculate the terms of the geometric progression and add them to the list
        double term = 1.0;
        for (int i = 0; i < NUM_TERMS; i++) {
            progression.add(term);
            term *= COMMON_RATIO;
        }

        // Calculate the sum of the geometric progression
        double sum = 0.0;
        for (double value : progression) {
            sum += value;
        }

        // Calculate the average
        double average = sum / NUM_TERMS;

        System.out.println("The average of the geometric progression is: " + average);
    }
}

