package Prac2.ProgrammingExercises;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        final int INCHES_TO_FEET = 12;
        int inchesNeeded;
        int feetNeeded;
        int extraInchesNeeded;

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter inches needed: ");
        inchesNeeded = kb.nextInt();

        feetNeeded = inchesNeeded / INCHES_TO_FEET;
        extraInchesNeeded = inchesNeeded % INCHES_TO_FEET;
        System.out.println(inchesNeeded + " Inches is equal to " +
                feetNeeded + " Foot " + extraInchesNeeded + " Inches.");
    }
}

