/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportsystem;

/**
 *
 * @author lab_services_student
 */
// RunApplication.java
// Main class to handle user input and instantiate CricketRunsScored.

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the batsman's name: ");
        String batsman = scanner.nextLine();
        
        System.out.print("Enter the stadium name: ");
        String stadium = scanner.nextLine();
        
        System.out.print("Enter the total runs scored: ");
        int runsScored = scanner.nextInt();
        
        // Instantiate CricketRunsScored
        CricketRunsScored cricket = new CricketRunsScored(batsman, stadium, runsScored);
        
        // Print the report
        cricket.printReport();
        
        scanner.close();
    }
}