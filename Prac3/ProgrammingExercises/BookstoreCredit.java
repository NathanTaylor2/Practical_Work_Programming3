package Prac3.ProgrammingExercises;

import java.util.Scanner;
class BookstoreCredit
{
    public static void main(String[] args)
    {
        String studentName;
        double gradePointAverage;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your name: ");
        studentName = kb.next();
        System.out.print("Enter your GPA: ");
        gradePointAverage = kb.nextDouble();
        displayCredit(studentName, gradePointAverage);
    }
    private static void displayCredit(String name, double gpa)
    {
        double credit;
        final int RATE = 10;
        credit = gpa * RATE;
        System.out.print("Hello " + name + ", your GPA is " + gpa + ". Therefore your bookstore credit is $" + credit);
    }
}