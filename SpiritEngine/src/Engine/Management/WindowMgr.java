package Engine.Management;

import javax.swing.*;

public class WindowMgr {

    private static WindowMgr _instance;

    private WindowMgr(){

    }

    public static synchronized WindowMgr getInstance(){
        if(_instance == null)
            _instance = new WindowMgr();

        return _instance;
    }

    void cls(JTextArea textArea){
        textArea.setText("");
    }
}
