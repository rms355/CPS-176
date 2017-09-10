import java.util.Scanner;  // Needed for the Scanner class

/**
   Author: Ryan Stefan
   File(s): IntroduceYourself.java
   Course:   CPS 176 - Fall 2017

   Purpose: This program helps introduce the user (instructor) to the author (student)
*/

public class IntroduceYourself
{
   public static void main(String[] args)
   {
      // Identifier declarations
      int year = 2017;
      double compKnow= 3.5; // Enter your computer knowledge on a scale of 1 (None) to 5 (Expert)
      String dateInput;

      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Display prompts and get input.
      System.out.print("Enter today's date in MM-DD format:  ");
      dateInput = keyboard.nextLine();

      // Combine the MM-DD entered by the user with the known year above.
      dateInput = dateInput + "-" + year;

      // Display the results.
      System.out.println("Todays date is: " +dateInput);;
      System.out.println("My name is: Ryan Stefan ");
      System.out.println("My major is: MEEP (Mechanical Engineering and Energy Processes) ");
      System.out.println("My computer knowledge, on a scale of - (1) Know nothing -> (5) Expert is: " + compKnow);
      System.out.println("I am taking this class because: I am thinking about getting a CS minor. Also, I am just interested in programming in general.");
   }
}
