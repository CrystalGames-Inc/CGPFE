package Display.Windows;

import Management.WindowMgr;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{

    JTextArea jt = new JTextArea();



    public void newWindow(){
        JPanel p = new JPanel();
        p.setBackground(Color.darkGray);


        setName("ConsoleRPG");
        setSize(677,433);
        setResizable(false);
        setAlwaysOnTop(true);
        setForeground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addLine(String str){
        jt.append(str);
    }
}