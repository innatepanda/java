package gui;
import javax.swing.*;
import java.awt.*;

public class smallLabel extends JLabel{
    smallLabel(){
    ImageIcon image = new ImageIcon(new ImageIcon("prof.png").getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
        
        this.setText("psst?");
        this.setIcon(image);
        this.setHorizontalTextPosition(0);
        this.setVerticalTextPosition(1);
        this.setForeground(Color.white);
        this.setIconTextGap(20);
        this.setVerticalAlignment(0);
        this.setHorizontalAlignment(0);
        //this.setBounds(10, 70, 400, 400);
    }
    
}
