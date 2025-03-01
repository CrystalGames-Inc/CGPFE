package CGPFE.Mechanics.Dialogue;

public class DialogueLine {
    public String speakerName;
    public String line;
    public String[] answers;


    public DialogueLine(String speakerName, String line){
        this.speakerName = speakerName;
        this.line = line;
    }

    public DialogueLine(String speakerName, String line, String[] answers){
        this.speakerName = speakerName;
        this.line = line;
        this.answers = answers;
    }
}