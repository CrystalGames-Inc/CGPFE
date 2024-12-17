package Management;

import Game.Mechanics.Dialogue.DialogueLine;

import java.util.ArrayList;
import java.util.List;

public class DialogueMgr {

    private static DialogueMgr _instance = null;

    public int letterSpacingTime = 200;
    public List<DialogueLine> chat;

    CommandMgr cmdMgr = CommandMgr.getInstance();

    private DialogueMgr(){
        chat = new ArrayList<DialogueLine>();
    }

    public static synchronized DialogueMgr getInstance(){
        if(_instance == null)
            _instance = new DialogueMgr();

        return  _instance;
    }

    public void startChat(){
        for(DialogueLine d: chat){
            String[] letters = d.Line.split("");
            System.out.print(d.SpeakerName + ": ");
            for (int i = 0; i < d.Line.length(); i++) {
                System.out.print(letters[i]);
                cmdMgr.wait(letterSpacingTime);
            }
            cmdMgr.awaitUserInput();
        }
        resetDialogue();
    }

    public void addLine(String speakerName, String text){
        DialogueLine line = new DialogueLine(speakerName, text);
        chat.add(line);
    }

    public void resetDialogue(){
        chat = null;
    }
}
