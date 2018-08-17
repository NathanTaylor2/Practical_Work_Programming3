package Prac3.ProgrammingExercises;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args)
    {
        double input;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your number to convert to Inches and Gallons: ");
        input = kb.nextDouble();
        convertCM(input);
        convertLitres(input);
    }
    private static void convertCM(double input){
        double inches = input / 2.54;
        System.out.println(input + " centimetres converted to inches = " + inches+ " inches");

    }
    private static void convertLitres(double input){
        double gallons = input / 3.7854;
        System.out.println(input + " litres converted to gallons = " + gallons + " gallons");

    }
}
