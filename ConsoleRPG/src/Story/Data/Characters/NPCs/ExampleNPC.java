package Story.Data.Characters.NPCs;

import Engine.Game.Data.Storage.God.Creation.Skills;
import Engine.God.Creation.Importance.Constants.Alignment;
import Engine.God.Creation.Importance.Constants.NPCClass;
import Engine.God.Creation.Importance.Constants.Race;
import Engine.God.Creation.NPC.NPC;
import Engine.God.Creation.NPC.NPCInfo;
import Engine.Management.DialogueMgr;

public class ExampleNPC extends NPC {
    ///This here is the example of creating an NPC, and I'm going to guide you step-by-step on everything here.
    ///
    ///This is what happens when you first declare it as a new ExampleNPC()
    public ExampleNPC(){
        setInfo(new NPCInfo(
                "Example Giver",
                Race.HUMAN,
                NPCClass.ADEPT,
                Alignment.NEUTRAL,
                new Skills().adeptSkills
        ));
    }

    ///A variable to store the amount of times the player had met with him, you can have multiple conditions

    int timesMet = 0;

    ///Here is the example of an encounter with the NPC, and he will check his dialogue and speak accordingly.
    public void onEncounter(){
        dialogueCheck();
        timesMet++;
    }

    ///This is the dialogueCheck function, where you can choose whatever you want the NPC to do when you first speak to him, or even when certain conditions are met.
    ///
    /// For the sake of simplicity, I have decided to only include dialogue lines, but please, knock yourself out.
    void dialogueCheck(){

        DialogueMgr mgr = DialogueMgr.getInstance();

        switch (timesMet){
            case 0 -> {
                mgr.addLine(this.getInfo().name, "Hello there, stranger!");
                mgr.startChat();
            }
            case 1 -> {
                mgr.addLine(this.getInfo().name, "Haven't we met before?");
                mgr.startChat();
            }
        }
    }
}
