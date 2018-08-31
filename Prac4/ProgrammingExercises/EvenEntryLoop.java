package ProgrammingExercises;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        final int SENTINEL = 999;
        int num;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Even Number: ");
        num = kb.nextInt();
        while(num != SENTINEL ) {
            if (num % 2 == 0)
                System.out.println("Good Job!");
            else
                System.out.println("Error - " + num + " is not an even number");
                System.out.print("Enter Even Number: ");
                num = kb.nextInt();
        }



    }
}
