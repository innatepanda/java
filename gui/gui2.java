package gui;
import javax.swing.*;
import java.awt.event.*;

// by default frame.setLayout(new BorderLayout()); and panel.setLayout(new FlowLayout())
// flow layout- if contents do not fit in one row shifts to next row, new flowlayout(flowlayout.(options), hor spacing, ver spacing)
// borderLayout - places objects acc to north east west south and center. new borderlayout(hor(margin between east west and center),vert margin) 
// gridlayout - places components in grid of cells, each cell is same size

public class gui2 implements ActionListener{
    
    JButton button, button2;
    //JTextField text;
    JCheckBox checkBox;
    ButtonGroup group;
    JComboBox box;
    
    public gui2()
    {
        
        button = new JButton("prwess");        
        button.setBounds(10, 80, 70, 50);
        button.setFocusable(false);
        button2 = new JButton("prwess");        
        button2.setBounds(40, 10, 100, 100);
        button2.setFocusable(false);
        /*
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
        
/*--------------------layered pane--------------- 
// provides a z positioning, z-index. and wont move or change z positioning depending on selection normally
//not visible unless some el added to it, pane is just an invisble panel, sorta.zx
        JLayeredPane pane =new JLayeredPane();
        pane.add(button, JLayeredPane.DRAG_LAYER);
        pane.add(button2, 1); //higher number, that one is at front
        pane.setBounds(10,10,200,200);

-------------------------------------------------------*/

/*...............dialogue box----------

//JOptionPane - standard dialogue box
        ImageIcon icon = new ImageIcon("prof.png");
        JOptionPane pane = new JOptionPane();
        System.err.println(pane.showConfirmDialog(null, "message", "title", JOptionPane.YES_NO_CANCEL_OPTION)); 
        System.err.println(pane.showInputDialog(null, "message", "title", JOptionPane.QUESTION_MESSAGE));
        //also .show option dialog
        //pane.showMessageDialog(null, "message", "title", JOptionPane.PLAIN_MESSAGE); //.plain msg has more options 
        -----------------------------------------------*/
        
/*------------textfield-------------------
        text =new JTextField();
        text.setBounds(10, 10,250, 70);
        text.setCaretColor(Color.green);
        ------------------------------------*/
        
/*------------------checkbox and radiobtn-----
        checkBox=new JCheckBox("this");
        checkBox.setBounds(10, 10, 100,50);
        JRadioButton radio=new JRadioButton("m");
        radio.setBounds(10, 190, 70, 30);
        JRadioButton radio2=new JRadioButton("n");
        radio2.setBounds(90, 190, 70, 30);
        radio.addActionListener(this);
        radio2.addActionListener(this);
        

        group=new ButtonGroup();
        group.add(radio);
        group.add(radio2);
        frame.add(radio);
        frame.add(radio2);        
        frame.add(checkBox);
        -------------------------------------------*/
        

        /*-----------
        String r[]={"d","e","j","m"};
        box=new JComboBox(r);  
        // -btn, drop field and text field combined
        
        box.addActionListener(this);
        ---------------------*/


        
        frame.add(box);
        //frame.setLayout(null); //use setlayout to use bounds
        frame.pack();
        frame.setVisible(true);
    
    }

    public  static void main (String args[])
    {
        new gui2();
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println(box.getSelectedItem());
    }
    
}
