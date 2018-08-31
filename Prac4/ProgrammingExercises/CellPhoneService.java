package ProgrammingExercises;

import java.util.Scanner;

public class CellPhoneService {

        public static void main(String [] args)
        {
            int talkMinutes, textMessages;
            double data;

            Scanner kb = new Scanner(System.in);
            System.out.println("Monthly talk minutes used: ");
            talkMinutes = kb.nextInt();
            System.out.println("Monthly text messages sent: ");
            textMessages = kb.nextInt();
            System.out.println("Monthly gigabytes of data used: ");
            data = kb.nextDouble();

            if (talkMinutes < 500)
            {
                if (textMessages == 0 && data == 0)
                {
                    System.out.println("You should get Plan A at $49 per month.");
                }
                else if (textMessages > 0)
                {
                    System.out.println("You should get Plan B at $55 per month.");
                }
            }
            if (talkMinutes >= 500)
            {
                if (data == 0 && textMessages <= 100)
                {
                    System.out.println("You should get Plan C at $61 per month.");
                }
                else if (data == 0)
                {
                    System.out.println("You should get Plan D at $70 per month.");
                }
                else if (data < 2)
                {
                    System.out.println("You should get Plan E at $79 per month.");
                }
                else if (data >= 2)
                {
                    System.out.println("You should get Plan F at $87");
                }
            }
        }
    }
