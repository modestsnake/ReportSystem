# ReportSystem
My report system for my Programming 1B Test 1

Cricket Runs Scored Application
Overview
This Java application consists of two main components:

Report Generator: Generates a report displaying the total runs scored by three batsmen (Jacques Kallis, Hashim Amla, and AB de Villiers) at three stadiums (Kingsmead, St Georges, and Wanderers). It uses single and two-dimensional arrays to calculate and display totals per batsman, totals per stadium, and identifies the stadium with the highest total runs scored.
Console Application: Allows users to input a batsman's name, stadium name, and total runs scored, then prints a report with this information. It uses an object-oriented design with an interface, abstract class, and subclass.

Project Structure
The application is divided into the following Java files:

ReportGenerator.java: Generates the Highest Runs Scored Per Stadium report using arrays.
ICricket.java: Defines the ICricket interface with methods to get batsman, stadium, and runs scored.
Cricket.java: Abstract class implementing ICricket, storing batsman, stadium, and runs data.
CricketRunsScored.java: Subclass of Cricket that includes a method to print the user-input report.
RunApplication.java: Main class for the console application, handling user input and instantiating CricketRunsScored.

Running the Application
The application has two independent entry points:
Highest Runs Scored Report:
Run the ReportGenerator class:java ReportGenerator

Output: A formatted table showing runs scored by each batsman at each stadium, total runs per batsman (career totals), total runs per stadium, and the stadium with the highest total runs.

Example output:
Highest Runs Scored Per Stadium Report
--------------------------------------
Stadium         Jacques Kallis  Hashim Amla     AB de Villiers  Total (Stadium)
Kingsmead       5000           3800           4200           13000
St Georges      3500           3700           3900           11100
Wanderers       6200           5000           5200           16400
Total (Career)  14700          12500          13300

Stadium with the most runs scored: Wanderers (16400 runs)

Run the RunApplication class:java RunApplication

Follow the prompts to enter:
Batsman's name
Stadium name
Total runs scored

Output: A report displaying the entered information.

Example output:
Enter the batsman's name: Jacques Kallis
Enter the stadium name: Kingsmead
Enter the total runs scored: 5000
Batsman's Name: Jacques Kallis
Stadium Name: Kingsmead
Total Runs Scored: 5000
