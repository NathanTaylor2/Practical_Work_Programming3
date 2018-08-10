package Prac2.ProgrammingExercises;

import javax.swing.*;

public class NauticalMilesInteractive {
    public static void main(String[] args)
    {
        String NauticalMilesString;
        double NauticalMiles;
        final double NMILES_TO_MILES = 1.150779;
        final double NMILES_TO_KM = 1.852;
        NauticalMilesString = JOptionPane.showInputDialog(null, "Enter the number of Nautical Miles to convert", "Nautical Miles to Miles and Kilometers",
                JOptionPane.INFORMATION_MESSAGE);
        NauticalMiles = Integer.parseInt(NauticalMilesString);
        JOptionPane.showMessageDialog(null, NauticalMiles + " Nautical Miles is equal to " + (NauticalMiles * NMILES_TO_MILES) + " Miles.\n" + NauticalMiles + " Nautical Miles is equal to " + (NauticalMiles * NMILES_TO_KM) + " Kilometers");
    }
}

