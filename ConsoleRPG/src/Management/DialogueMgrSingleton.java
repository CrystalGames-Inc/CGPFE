package Management;

import Game.Mechanics.Dialogue.DialogueLine;

import java.util.ArrayList;
import java.util.List;

public class DialogueMgrSingleton{

    private static DialogueMgrSingleton _instance = null;

    public List<DialogueLine> chat;

    private DialogueMgrSingleton(){
        chat = new ArrayList<DialogueLine>();
    }

    public static synchronized DialogueMgrSingleton getInstance(){
        if(_instance == null)
            _instance = new DialogueMgrSingleton();

        return  _instance;
    }

    public void startChat(){
        for(DialogueLine d: chat){
            System.out.println(d.SpeakerName + ": " + d.Line);
        }
    }

    public void addLine(String speakerName, String text){
        DialogueLine line = new DialogueLine(speakerName, text);
        chat.add(line);
    }

    public void resetDialogue(){
        chat = null;
    }
}
