// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class
import javax.swing.JOptionPane;

/**
   Author: Ryan Stefan
   File(s):  NumericTypes.java
   Course:   CPS 176 - Fall 2017
   Purpose:  This program demonstrates how numeric types and operators behave in Java.
*/

public class Task3
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)
      Scanner keyboard = new Scanner(System.in);

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final double BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
      String firstName; // User's first name
      String lastName;  // User's last name
      String fullName;  // User's full name

      // TASK #3 declare variables used here
      char firstInitial; // User's first initial

      // TASK #4 declare variables used here
      double sphereDiameter; // User's diameter of a sphere
      double radius; //Arithmetic radius
      double volume; //Volume of a sphere
      double pi = 3.14159265359;

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      firstName =
            JOptionPane.showInputDialog("What is your first name? ");

      // Prompt the user for last name
      lastName =
            JOptionPane.showInputDialog("What is your last name? ");

      // Concatenate the user's first and last names
      fullName = firstName + " " + lastName;

      // Print out the user's full name
      JOptionPane.showMessageDialog(null, fullName);

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      firstInitial = firstName.charAt(0);

      // Print out the user's first initial
      System.out.println("First initial: " + firstInitial);

      // Convert the user's full name to uppercase
      fullName = fullName.toUpperCase();

      // Print out the user's full name in uppercase
      System.out.println("Full name in all capital: " + fullName + " with length: " + fullName.length());

      System.out.println();      // To leave a blank line

      System.exit(0);
    }
}
