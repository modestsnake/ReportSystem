/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportsystem;

/**
 *
 * @author lab_services_student
 */
// Cricket.java
// Abstract class implementing ICricket, storing batsman's name, stadium name, and total runs scored.
// Provides getter methods as per the interface.

public abstract class Cricket implements ICricket {
    private String batsman;
    private String stadium;
    private int runsScored;
    
    // Constructor to initialize the variables
    public Cricket(String batsman, String stadium, int runsScored) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }
    
    // Getter for batsman's name
    @Override
    public String getBatsman() {
        return batsman;
    }
    
    // Getter for stadium name
    @Override
    public String getStadium() {
        return stadium;
    }
    
    // Getter for runs scored
    @Override
    public int getRunsScored() {
        return runsScored;
    }
}