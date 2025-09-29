/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportsystem;

/**
 *
 * @author lab_services_student
 */
// CricketRunsScored.java
// Subclass extending Cricket, adds a printReport method to display the details.

public class CricketRunsScored extends Cricket {
    // Constructor calling super constructor
    public CricketRunsScored(String batsman, String stadium, int runsScored) {
        super(batsman, stadium, runsScored);
    }
    
    // Method to print the report
    public void printReport() {
        System.out.println("Batsman's Name: " + getBatsman());
        System.out.println("Stadium Name: " + getStadium());
        System.out.println("Total Runs Scored: " + getRunsScored());
    }
}