package gui;
import javax.swing.*;
import java.awt.*;




public class gui2 {
    
    JButton button;
    public gui2()
    {
        
        button = new JButton("prwess");        
        button.setBounds(10, 10, 100, 100);
        button.setFocusable(false);
        button.addActionListener(e-> System.err.println("poo"));//lamba exp
        button.setFont(new Font("Comic Sans", Font.BOLD,12));

        childofJFRAME frame = new childofJFRAME();
        frame.add(button);
        
        //frame.pack();
        frame.setLayout(null); //use setlayout to use bounds
    }

    public  static void main (String args[])
    {
        new gui2();
    }
   
}
