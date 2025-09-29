/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reportsystem;

/**
 *
 * @author lab_services_student
 */
public class ReportGenerator {

  // ReportGenerator.java
// This class generates the Highest Runs Scored Per Stadium report using single and two-dimensional arrays.
// It displays the runs scored by each batsman at each stadium, totals per batsman (career totals),
// totals per stadium, and identifies the stadium with the most runs scored.
    public static void main(String[] args) {
        // Single-dimensional arrays for stadiums and batsmen names
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        
        // Two-dimensional array for runs scored: rows = stadiums, columns = batsmen
        int[][] runs = {
            {5000, 3800, 4200},  // Kingsmead
            {3500, 3700, 3900},  // St Georges
            {6200, 5000, 5200}   // Wanderers
        };
        
        // Calculate total runs per batsman (column sums - career totals)
        int[] totalPerBatsman = new int[3];
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                totalPerBatsman[col] += runs[row][col];
            }
        }
        
        // Calculate total runs per stadium (row sums)
        int[] totalPerStadium = new int[3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                totalPerStadium[row] += runs[row][col];
            }
        }
        
        // Find the stadium with the most runs scored
        int maxRuns = 0;
        String maxStadium = "";
        for (int i = 0; i < 3; i++) {
            if (totalPerStadium[i] > maxRuns) {
                maxRuns = totalPerStadium[i];
                maxStadium = stadiums[i];
            }
        }
        
        // Print the report
        System.out.println("Highest Runs Scored Per Stadium Report");
        System.out.println("--------------------------------------");
        
        // Print header
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Stadium", batsmen[0], batsmen[1], batsmen[2], "Total (Stadium)");
        
        // Print rows for each stadium
        for (int row = 0; row < 3; row++) {
            System.out.printf("%-15s %-15d %-15d %-15d %-15d\n", 
                stadiums[row], runs[row][0], runs[row][1], runs[row][2], totalPerStadium[row]);
        }
        
        // Print total per batsman (career totals)
        System.out.printf("%-15s %-15d %-15d %-15d\n", 
            "Total (Career)", totalPerBatsman[0], totalPerBatsman[1], totalPerBatsman[2]);
        
        // Print the stadium with the most runs
        System.out.println("\nStadium with the most runs scored: " + maxStadium + " (" + maxRuns + " runs)");
    }
}