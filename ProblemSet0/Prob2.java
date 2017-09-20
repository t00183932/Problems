package ProblemSet0;

import javax.swing.JOptionPane;

public class Prob2 {
    public static void main(String[] args) {
        String firstName, secondName, kmAsString;
        double km, rate;

        firstName = JOptionPane.showInputDialog("What is your first name?");

        secondName = JOptionPane.showInputDialog("What is your second name?");

        kmAsString = JOptionPane.showInputDialog("What is your distance travelled in km?");

        km = Double.parseDouble(kmAsString);

        if (km<=10)
            rate = 0.07 * km;

        else
        rate = 0.07 * 9 + 0.10 * (km - 9);

        JOptionPane.showMessageDialog(null, "Name: " + firstName + secondName +
                "\n\nDistance Travelled: " + String.format("%.0f",km) + "\n\nRate: " + String.format("%.2f",rate));

    }
}