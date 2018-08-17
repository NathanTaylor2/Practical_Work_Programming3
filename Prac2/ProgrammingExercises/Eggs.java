package ProgrammingExercises;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number of eggs: ");
        int eggs = kb.nextInt();

        int dozen = eggs/12;
        int remainderDozen = eggs%12;
        double dozenCost = 3.25;
        double remainderCost = 0.45;
        double totalCost = dozen*dozenCost + remainderDozen*remainderCost;

        System.out.println("You have " + dozen + " dozen eggs at $" + dozenCost + " and " + remainderDozen + " loose eggs at " + remainderCost + " cents for a total of $" + totalCost);
    }

}