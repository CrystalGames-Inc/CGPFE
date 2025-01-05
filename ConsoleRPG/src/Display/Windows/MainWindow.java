package Display.Windows;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    JFrame f = new JFrame("ConsoleRPG");



    public void newWindow(){


        f.setSize(677,433);
        f.setResizable(false);
        f.setAlwaysOnTop(true);
        f.setForeground(Color.black);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    void cls(){

    }

}
