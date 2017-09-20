package ProblemSet0;

import javax.swing.JOptionPane;

public class Prob3 {
    public static void main(String[] args) {
        String name, grossAsString;
        double gross, income;

        name = JOptionPane.showInputDialog("What is your name?");

        grossAsString = JOptionPane.showInputDialog("What is your gross income?");

        gross = Double.parseDouble(grossAsString);

        if (gross < 20000)
            JOptionPane.showMessageDialog(null, "No tax rate");

        else if (gross >= 20000 && gross < 36000) {
            income = gross - gross / 100 * 20;
            JOptionPane.showMessageDialog(null, "Tax rate of 20% awarded.\n\n" +
                    "Income after tax: " + income);
        } else {
            income = gross - gross / 100 * 41;
            JOptionPane.showMessageDialog(null, "Tax rate of 20% awarded.\n\n" +
                    "Income after tax: " +income);
        }
    }
}

