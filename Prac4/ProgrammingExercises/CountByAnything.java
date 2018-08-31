package ProgrammingExercises;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Start Number: ");
        int start = kb.nextInt();
        System.out.println("Stop Number: ");
        int stop = kb.nextInt();
        int newLine = 10;
        for(int i = start; i<= stop; i+= start) {
            System.out.print(i + " ");
            if (i % newLine == 0)
                System.out.println();
        }
    }
}
