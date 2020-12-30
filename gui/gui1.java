package gui;
import java.awt.*;
import java.awt.event.*;
//swing outdated but gets the job done

import javax.swing.*;

class gui1 implements ActionListener
{
    int count=0;
    JFrame frame;
    JLabel label;

    public gui1()
    {
        frame = new JFrame();
        JButton button = new JButton("button text");
        button.setBackground(Color.gray);
        button.addActionListener(this);
        JPanel panel = new JPanel();
        label = new JLabel("Number of clicks: 0");
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("First Java GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        new gui1();
        //creating object, so that it runs constuctor
    
    }

    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText("Number of clicks: " + count);
    }
}