package ProblemSet0;

import javax.swing.*;

public class Prob5 {
    public static void main(String[]args) {

        char option;
        String optionString, fNumString, sNumString;
        int firstNum, secondNum, result;

        fNumString = JOptionPane.showInputDialog("Enter first number");

        sNumString = JOptionPane.showInputDialog("Enter second number");

        firstNum = Integer.parseInt(fNumString);

        secondNum = Integer.parseInt(sNumString);

        optionString = JOptionPane.showInputDialog("Choose option A(addition), S(subtraction), M(multiplication), " +
        "D(division)");

        option = optionString.charAt(0);

        switch(option){
           case 'A': result = firstNum+secondNum;
           break;

           case 'S': result = firstNum-secondNum;
           break;

           case 'M': result = firstNum*secondNum;
           break;

           case 'D': result = firstNum/secondNum;
           break;

           default: JOptionPane.showMessageDialog(null,"Error, no such option..");
           break;
        }
        
        System.exit(0);


    }
}
