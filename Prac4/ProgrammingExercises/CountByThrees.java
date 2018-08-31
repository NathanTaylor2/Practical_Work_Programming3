package ProgrammingExercises;

public class CountByThrees {
    public static void main(String[] args) {
        int start = 3;
        int stop = 300;
        int newLine = 30;
        for(int i = start; i<= stop; i+= start) {
            System.out.print(i + " ");
            if (i % newLine == 0)
                System.out.println();
        }
    }
}
