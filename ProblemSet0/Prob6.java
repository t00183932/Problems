package ProblemSet0;

import javax.swing.*;

public class Prob6 {
    public static void main(String[] args) {

        char option;
        String optionString, fNumString, sNumString;
        int firstNum, secondNum, choice, result;

        choice = JOptionPane.showConfirmDialog(null, "Would you like to carry out a calculation?");


        while (choice == JOptionPane.YES_OPTION) {

            fNumString = JOptionPane.showInputDialog("Enter first number");

            sNumString = JOptionPane.showInputDialog("Enter second number");

            optionString = JOptionPane.showInputDialog(null,"Choose option A(addition), " +
                    "S(subtraction), M(multiplication), D(division)");

            firstNum = Integer.parseInt(fNumString);

            secondNum = Integer.parseInt(sNumString);

            option = optionString.charAt(0);

            switch (option) {
                case 'A':
                    result = firstNum + secondNum;
                    break;

                case 'S':
                    result = firstNum - secondNum;
                    break;

                case 'M':
                    result = firstNum * secondNum;
                    break;

                case 'D':
                    result = firstNum / secondNum;
                    break;

                default:
                     JOptionPane.showMessageDialog(null,"Error, no such option..Try again");

            }

            choice = JOptionPane.showConfirmDialog(null,"Would you like to do another calculation?");


        }
    }
}
