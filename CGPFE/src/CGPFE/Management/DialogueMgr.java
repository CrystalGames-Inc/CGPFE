package CGPFE.Management;

import CGPFE.Mechanics.Dialogue.Dialogue;
import CGPFE.Mechanics.Dialogue.DialogueLine;
import org.jetbrains.annotations.NotNull;

public class DialogueMgr {

    private static DialogueMgr _instance = null;

    public Dialogue chat;

    CommandMgr cmdMgr = CommandMgr.getInstance();

    private DialogueMgr(){
        chat = new Dialogue();
    }

    public static synchronized DialogueMgr getInstance(){
        if(_instance == null)
            _instance = new DialogueMgr();

        return  _instance;
    }

    public void startChat(){
        for(DialogueLine d: chat.dialogueLines){
            System.out.print(d.speakerName + ": " + d.line + "\n");
            if(d.answers != null)
                showAnswers(d);
            cmdMgr.awaitUserInput();
        }
        chat = new Dialogue();
    }

    public void showAnswers(@NotNull DialogueLine dialogueLine){
        for (int i = 0; i < dialogueLine.answers.length; i++) {
            System.out.println("[" + (i + 1) + "] " + dialogueLine.answers[i]);
        }
        dialogueLine.answers = new String[]{};
    }

    public void addLine(String speakerName, String text){
        DialogueLine line = new DialogueLine(speakerName, text);
        chat.dialogueLines.add(line);
    }

    public void addLine(String speakerName, String text, String[] answers){
        DialogueLine line = new DialogueLine(speakerName, text, answers);
        chat.dialogueLines.add(line);
    }
}
