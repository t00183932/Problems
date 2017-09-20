package ProblemSet1;

import javax.swing.*;

public class Prob1 {
    public static void main(String[]args)
    {
        double value;
        String valueString;

        valueString = JOptionPane.showInputDialog("Enter value for echange rate of british pound to euro");
        value = Double.parseDouble(valueString);

        while(value!=0){

            JOptionPane.showMessageDialog(null,value + "GBP is " + String.format("%.2fE", +
            value/1*1.13));

            valueString = JOptionPane.showInputDialog("Enter value for echange rate of british pound to euro");
            value = Double.parseDouble(valueString);

        }
    }
}
