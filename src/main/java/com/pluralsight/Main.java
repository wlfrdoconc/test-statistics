package com.pluralsight;

import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an array of 10 test scores
        // Print out the following statistics of your test scores: average, high score, and low score
        // Bonus - Calculate the median value (difference between the average and median)
        // Make methods that pass everything through

        // FindStatistics object
        FindStatistics methods = new FindStatistics();

        // Array of 10 test scores
        int[] testScores = {22, 65, 33, 45, 10, 23, 78, 60, 4, 1};

        System.out.println("===== WELCOME TO TEST STATISTICS =====");

        double averageScore = methods.calcAverageScore(testScores);
        int highestScore = methods.findHighestScore(testScores);
        int lowestScore = methods.findLowestScore(testScores);
        double medianScore = methods.findMedianScore(testScores);

        methods.printTestStatistics(averageScore, highestScore, lowestScore, medianScore);

    }
}