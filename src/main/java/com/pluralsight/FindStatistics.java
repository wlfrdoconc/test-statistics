package com.pluralsight;

import java.util.Arrays;

public class FindStatistics {
    // Methods
    // 1. Method to calculate the average test scores
    public static double calcAverageScore(int[] testScores) {
        // Sum of the scores
        int sumTotalScores = 0;

        // Enhanced for loop
        for (int score: testScores) { // Goes through every element in the array
            sumTotalScores += score; // Adds every element in the array together
        }

        // Finding the average
        double averageTestScore = (double) sumTotalScores / testScores.length;
        return  averageTestScore;
    }

    // 2. Method to find the highest score in the array
    public static int findHighestScore(int[] testScores) {
        int highestScore = testScores[0]; // Take the value at the 0th index and store it in highestScore

        for (int score: testScores) { // Goes through every element in the array
            if (score > highestScore) { // Keep setting the current highest score until its finished
                highestScore = score;
            }
        }
        return highestScore;
    }

    // 3. Method to find the lowest score in the array
    public static int findLowestScore(int[] testScores) {
        int lowestScore = testScores[0];

        for (int score: testScores) {
            if (score < lowestScore) {
                lowestScore = score;
            }
        }
        return lowestScore;
    }

    // 4. Method to find the median score in the array
    public static double findMedianScore(int[] testScores) {
        // Sort the array first
        Arrays.sort(testScores);

        // Finding the median score
        int middleScore = testScores.length / 2;

        if (testScores.length % 2 == 0) {
            // Even number of scores: average the two middle values
            return ((double) testScores[middleScore - 1] + testScores[middleScore]) / 2;
        } else {
            // Odd number of scores: return the middle value
            return testScores[middleScore];
        }
    }

    // 5. Method to print information
    public static void printTestStatistics(double averageScore, int highestScore, int lowestScore, double medianScore) {
        System.out.printf("The average score is: %.2f\nThe highest score is: %d\nThe lowest score is: %d\nThe median score is: %.2f", averageScore, highestScore, lowestScore, medianScore);
    }



}
