package Display.Windows;

import Management.WindowMgr;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    JFrame f = new JFrame("ConsoleRPG");
    JTextArea jt = new JTextArea();

    WindowMgr wMgr = WindowMgr.getInstance();

    public void newWindow(){
        JPanel p = new JPanel();
        p.setBackground(Color.darkGray);



        f.setSize(677,433);
        f.setResizable(false);
        f.setAlwaysOnTop(true);
        f.setForeground(Color.black);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void cls(){
        jt.setText("");
    }

    public void addLine(String str){
        jt.append(str);
    }

}
