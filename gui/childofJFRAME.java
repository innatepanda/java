package gui;
import javax.swing.JFrame;
import java.awt.*;

public class childofJFRAME extends JFrame {
    childofJFRAME()
    {
        

        this.setDefaultCloseOperation(3);
        this.setTitle("Login");
        
        this.getContentPane().setBackground(Color.blue);
        //this.setSize(520,600);
        this.setMinimumSize(new Dimension(220,200));
        //this.setResizable(false);
        this.pack();
        //this.setLayout(null);
        this.setVisible(true);
    }
    
}
