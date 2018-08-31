package ProgrammingExercises;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[])
    {
        int x;
        System.out.print("Enter a number to check if odd or even: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if ( x % 2 == 0 )
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}