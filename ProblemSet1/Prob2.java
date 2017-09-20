package ProblemSet1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Prob2 {
    public static void main(String[]args)
    {
        int i,yards=0;
        String text = String.format("%-10s%-10s\n%-10s%-10s\n","Yards","Inches","--------","--------");

        JTextArea textArea = new JTextArea();

        for(i=1; i<11; i++)
        {
            yards = i*36;

            text+= String.format("%-10d%-10d\n",i,yards);

        }

        textArea.append(text);

        JOptionPane.showMessageDialog(null,textArea);

    }
}
