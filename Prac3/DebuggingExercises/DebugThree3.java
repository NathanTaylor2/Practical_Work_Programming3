package Prac3.DebuggingExercises;// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class DebugThree3
{
   public static void main(String args[])
   {
       String name = getName();
       displayGreeting(name);
   }
   private static String getName()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name: ");
       return (input.next());
   }
   private static void displayGreeting(String name)
   {
      System.out.println("Hello, " + name + "!");
   }
}
