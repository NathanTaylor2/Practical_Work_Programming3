package Prac3.ProgrammingExercises;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args)
    {
        int currentYear;
        int birthYear;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        currentYear = kb.nextInt();
        System.out.print("Enter your birth year: ");
        birthYear = kb.nextInt();
        calculatePremium(currentYear, birthYear);
    }
    private static void calculatePremium(int currentYear, int birthYear){
        double age = (currentYear - birthYear);
        double decade = age / 12;
        int decadeRounded = (int) Math.round(decade);
        double premium = (decadeRounded + 15) * 20;
        System.out.print("Your insurance premium is $" + premium);
    }
}
