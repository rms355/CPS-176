// Import statement for the Scanner class.
import java.util.Scanner;

/**
    Author: Ryan Stefan
    File(s): RStefanMileage.java
    Course: CPS 176 - Fall 2017
    Date: 9.9.2017
    Purpose: This program calculates gas mileage in MGP.
*/

public class RStefanMileage
{
  public static void main (String [] args)
  {
    // Create a Scanner object here.
    Scanner keyboard = new Scanner(System.in);

    // Identifier declarations
    double milesDriven;  // Number of miles driven
    double gallonsUsed;  // Number of gallons used
    double mpg;          // Calculated MPG

    // Print a line indicating this program will calculate mileage.
    System.out.println("This program will calculate mileage.");

    System.out.println(); // To leave a blank line

    // Print prompt to user asking for miles driven.
    System.out.println("How many miles were driven?");

    // Read in miles drive.
    milesDriven = keyboard.nextDouble();

    System.out.println(); // To leave a blank line

    // Print promt to user asking for gallons used.
    System.out.println("How many gallons were used?");

    // Read in gallons used.
    gallonsUsed = keyboard.nextDouble();

    System.out.println(); // To leave a blank line

    // Calculate miles per gallon by dividing miles driven by gallons used.
    mpg = milesDriven / gallonsUsed;

    // Print miles per gallon along with appropriate labels.
    System.out.println("Your milage was: " + mpg + " MPG");

    System.out.println(); // To leave a blank line

  }
}
