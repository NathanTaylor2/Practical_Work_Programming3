package ProgrammingExercises;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a dollar amount: ");
        int dollarAmount = kb.nextInt();

        int numTwenties = dollarAmount/20;
        int numTens = (dollarAmount - 20*numTwenties)/10;
        int numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        int numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));

        System.out.println("You entered $" + dollarAmount );
        System.out.println("That is equivalent to " + numTwenties + " 20s, " + numTens + " 10s, " + numFives + " 5s, and " + numOnes + " 1s.");

    }

}