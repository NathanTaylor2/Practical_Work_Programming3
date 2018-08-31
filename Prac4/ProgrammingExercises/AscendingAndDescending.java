package ProgrammingExercises;

import java.util.*;


public class AscendingAndDescending {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = Integer.parseInt(kb.next());
        System.out.print("Enter number 2: ");
        num2 = Integer.parseInt(kb.next());
        System.out.print("Enter number 3: ");
        num3 = Integer.parseInt(kb.next());
        List<Integer> intList = new ArrayList<>();
        intList.add(num1);
        intList.add(num2);
        intList.add(num3);

        System.out.println("Your list :" + intList);

        Collections.sort(intList);

        System.out.println("Ascending :" + intList);

        Collections.reverse(intList);

        System.out.println("Descending :" + intList);
    }
}
