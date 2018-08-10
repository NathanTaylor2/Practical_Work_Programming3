package Prac2.ProgrammingExercises;

public class InchesToFeet {
    public static void main(String[] args)
    {
        final int INCHES_TO_FEET = 12;
        int inchesNeeded = 18;
        int feetNeeded;
        int extraInchesNeeded;

        feetNeeded = inchesNeeded / INCHES_TO_FEET;
        extraInchesNeeded = inchesNeeded % INCHES_TO_FEET;

        System.out.println(inchesNeeded + " Inches is equal to " +
                feetNeeded + " Foot " + extraInchesNeeded + " Inches.");
    }
}


