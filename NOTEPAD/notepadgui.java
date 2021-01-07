

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class notepadgui extends JFrame implements ActionListener{

    /**TODO
     * set title to default untitled-1, as weel as in save and save as
     * create save as
     * redo
     * undo
     * dont exit unless saved or content empty
     */
    private static final long serialVersionUID = 1L;
    JTextArea area;
    JScrollPane scroll;
    String text;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Get Help"))
        {
            
        }else if(e.getActionCommand().equals("New"))
        {
            area.setText("");
        }else if(e.getActionCommand().equals("Exit"))
        {
            
            System.exit(0);
        }else if(e.getActionCommand().equals("Print"))
        {
            try {
                area.print();
            } catch (Exception el) {
                //TODO: handle exception
            }
        }
        else {compareMenu(e.getActionCommand());}
    }
    notepadgui()
    {
        this.setDefaultCloseOperation(3);
        this.setTitle("Notepad");        
        //this.getContentPane().setBackground(Color.blue);
        //this.setSize(520,600);
        this.setMinimumSize(new Dimension(420,400));
        this.setMaximumSize(new Dimension(820,800));
        

        JMenuBar menuBar=new JMenuBar();



        JMenu file=new JMenu("File");
        JMenuItem newdoc=new JMenuItem("New");
        newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newdoc.addActionListener(this);
        JMenuItem open=new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        open.addActionListener(this);
        JMenuItem save=new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);
        JMenuItem print=new JMenuItem("Print");
        print.addActionListener(this);
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        JMenuItem exit=new JMenuItem("Exit");
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));        
        file.add(newdoc);
        file.add(open);
        file.add(save);
        file.add(print);
        file.add(exit);



        JMenu edit=new JMenu("Edit");
        JMenuItem cut=new JMenuItem("Cut");
        cut.addActionListener(this);
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        JMenuItem copy=new JMenuItem("Copy");
        copy.addActionListener(this);
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        JMenuItem paste=new JMenuItem("Paste");
        paste.addActionListener(this);
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        JMenuItem select=new JMenuItem("Select All");
        select.addActionListener(this);
        select.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(select);

        JMenu help=new JMenu("Help");
        JMenuItem direct=new JMenuItem("Get Help");
        direct.addActionListener(this);
        direct.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        help.add(direct);


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);


        area=new JTextArea();
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
        scroll=new JScrollPane(area);





        this.setJMenuBar(menuBar);
        this.add(scroll);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new notepadgui().setVisible(true);
    }


    public void compareMenu(String s)
    {
        if(s.equals("Open"))
        {
            JFileChooser ch = new JFileChooser();
            ch.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter restrict=new FileNameExtensionFilter(".txt files", "txt");
            ch.addChoosableFileFilter(restrict);
            int action=ch.showOpenDialog(this);
            if(action==JFileChooser.APPROVE_OPTION)
            {
                    File file=ch.getSelectedFile();
                    try {
                        BufferedReader reader=new BufferedReader(new FileReader(file));
                        area.read(reader, null);
                    } catch (Exception e) {
                        //.
                    }
                }


        }else if(s.equals("Save"))
        {
            JFileChooser choose = new JFileChooser();
            choose.setApproveButtonText("Save");
            int action=choose.showOpenDialog(this);
            if(action==JFileChooser.APPROVE_OPTION)
            {            
            
                File filename=new File(choose.getSelectedFile() + ".txt");
                BufferedWriter outfile=null;
                try {
                    outfile = new BufferedWriter(new FileWriter(filename));
                    area.write(outfile);
                } catch (Exception e) {
                   //.
                }
            }
            
        }else if(s.equals("Cut"))
        {
            text=area.getSelectedText();
            area.replaceSelection("");
            
        }else if(s.equals("Copy"))
        {
            text=area.getSelectedText();
            
        }else if(s.equals("Paste"))
        {
            area.insert(text, area.getCaretPosition());
            
        }else if(s.equals("Select All"))
        {
            area.selectAll();

        }

        
    }
}
