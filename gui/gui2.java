package gui;
import javax.swing.*;
import java.awt.*;



public class gui2 {
    
    
    public gui2()
    {
        smallPanel panel = new smallPanel(Color.black);



        childofJFRAME frame = new childofJFRAME();
        frame.add(panel);
    }

    public  static void main (String args[])
    {
        new gui2();
    }
    
}
