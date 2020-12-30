package gui;
import javax.swing.*;
import java.awt.*;

public class smallPanel extends JPanel {

    smallPanel(Color c, int x)
    {
        this.setBackground(c);
        //this.setMaximumSize(new Dimension(100, 100));
        this.setBounds(x,0,200, 100);
    }
    
}
