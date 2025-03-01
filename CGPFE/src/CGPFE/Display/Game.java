package CGPFE.Display;


import CGPFE.Management.DialogueMgr;

public class Game {

    public static void main(String[] args){
        GameStartup g = new GameStartup();
        g.skipIntro = true;
        g.skipRegister = true;

        g.startGame();

        DialogueMgr d = DialogueMgr.getInstance();

        d.addLine("Yosi", "Fanan?", new String[]{
                "Yes, Very Fanan",
                "Very Much Fanan",
                "I Cast Fireball"
        });

        d.startChat();
    }
}