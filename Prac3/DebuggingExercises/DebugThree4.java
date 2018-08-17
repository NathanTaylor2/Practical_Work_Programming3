package Prac3.DebuggingExercises;

// This program calculates tutition bills as credits times rate per credit hour
public class DebugThree4
{
   public static void main(String args[])
   {
      double myCredits = 13;
      double yourCredits = 17;
      double rate = 75.84;
      System.out.println("My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits, rate);
   }
   public static void tuitionBill(double myCredits, double rate)
   {
      System.out.println("Total due " + (rate*myCredits));
   }
}
