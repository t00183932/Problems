package ProblemSet0;

import javax.swing.JOptionPane;

public class Prob4 {
    public static void main(String[] args) {
        int count = 0, total=0, number;
        String numberString;


        numberString = JOptionPane.showInputDialog("enter a posotive, negative, or zero number");

        while(!numberString.equals("q")) {

            number = Integer.parseInt(numberString);

            total+=number;

            numberString = JOptionPane.showInputDialog("enter a posotive, negative, or zero number");

            count++;
        }

        JOptionPane.showMessageDialog(null, "The grand total you entered is " + total +
        "\nnumber of entries: " + count);

        }

        }



