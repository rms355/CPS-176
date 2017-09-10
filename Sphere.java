import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sphere
{
    public static void main (String [] args)
    {
      Scanner keyboard = new Scanner(System.in);

      double sphereDiameter;
      double radius;
      double volume;
      double pi = 3.14159265359;

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      System.out.println("Enter the diameter of a sphere: ");

      // Read the diameter
      sphereDiameter = keyboard.nextDouble();

      // Calculate the radius
      radius = sphereDiameter / 2;

      // Calculate the volume
      volume = ( 4.0 / 3.0 ) * pi * Math.pow( radius, 3 );

      // Print out the volume
      System.out.println("The volume of the sphere is: " + volume);
    }
}
