import java.util.Scanner;                        // importing only one class
public class InOutErr
{
public static void main(String args[])
{
   Scanner scan1 = new Scanner(System.in);       // create Scanner object. Observe, System.in
 
   System.out.println("Enter Student Name:");    // start taking required inputs
   String stdName = scan1.nextLine();
 
   System.out.println("Enter Circle Radius as a whole number:");
   int radius = scan1.nextInt();
 
   System.out.println("Enter Recgtangle length, you can enter floating-point value:");
   double length = scan1.nextDouble();
 
   System.out.println("Enter Recgtangle height, you can enter floating-point value:");
   double height = scan1.nextDouble();
                                                 // display the results of computation
   System.out.println("\nStudent Name:" + stdName);
   System.out.println("Circle Perimetetr: " + 2*Math.PI*radius);        // observe, System.out
   System.err.println("Rectangle Area: " + length*height);              // observe, System.err
}
}