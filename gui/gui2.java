package gui;
import javax.swing.*;
import java.awt.*;



public class gui2 {
    
    
    public gui2()
    {
        smallPanel panel = new smallPanel(Color.black,0);
        smallPanel panel2 = new smallPanel(Color.green,100);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,0,200, 100);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.yellow);
        p2.setBounds(0,100,200, 100);

        childofJFRAME frame = new childofJFRAME();
        frame.add(p1);
        frame.add(p2);
        //frame.pack();
        frame.setLayout(null);
    }

    public  static void main (String args[])
    {
        new gui2();
    }
    
}
