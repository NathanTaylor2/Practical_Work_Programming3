package Prac2.ProgrammingExercises;

import javax.swing.*;

public class NauticalMiles {
    public static void main(String[] args)
    {
        double NauticalMiles = 18;
        final double NMILES_TO_MILES = 1.150779;
        final double NMILES_TO_KM = 1.852;
        JOptionPane.showMessageDialog(null, NauticalMiles + " Nautical Miles is equal to " + (NauticalMiles * NMILES_TO_MILES) + " Miles.\n" + NauticalMiles + " Nautical Miles is equal to " + (NauticalMiles * NMILES_TO_KM) + " Kilometers");
    }
}
