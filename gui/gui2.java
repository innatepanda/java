package gui;
import javax.swing.*;
import java.awt.*;

// by default frame.setLayout(new BorderLayout()); and panel.setLayout(new FlowLayout())
// flow layout- if contents do not fit in one row shifts to next row, new flowlayout(flowlayout.(options), hor spacing, ver spacing)
// borderLayout - places objects acc to north east west south and center. new borderlayout(hor(margin between east west and center),vert margin) 
// gridlayout - places components in grid of cells, each cell is same size

public class gui2 {
    
    JButton button;
    
    public gui2()
    {
        
        /*button = new JButton("prwess");        
        button.setBounds(10, 10, 100, 100);
        button.setFocusable(false);
        button.addActionListener(e-> System.err.println("poo"));//lamba exp
        button.setFont(new Font("Comic Sans", Font.BOLD,12));*/
        
        childofJFRAME frame = new childofJFRAME();
        
/*---------- grid layout -----------------------
        
        frame.setLayout(new GridLayout(3,3,10,10)); 
        //if els more than m*n, this keeps number of rows conts and inc number of columns

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        frame.add(new JButton("4"));
        --------------------------------------------grid layout -------- */
        
/*--------------------layered pane---------------*/ 
// provides a z positioning, z-index. and wont move or change z positioning depending on selection normally
//not visible unless some el added to it, pane is just an invisble panel, sorta.




        
        
        
        
        //frame.pack();
        frame.setLayout(null); //use setlayout to use bounds
        frame.setVisible(true);
    }

    public  static void main (String args[])
    {
        new gui2();
    }
   
}
