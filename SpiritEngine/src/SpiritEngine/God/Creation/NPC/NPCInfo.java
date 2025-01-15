package SpiritEngine.God.Creation.NPC;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.NPCClass;
import SpiritEngine.God.Creation.Importance.Constants.Race;

public class NPCInfo {
    public String name;
    public Race race;
    public NPCClass eClass;
    public Alignment alignment;
    public Skill[] skills;

    public NPCInfo(String name, Race race, NPCClass eClass, Alignment alignment, Skill[] skills) {
        this.name = name;
        this.race = race;
        this.eClass = eClass;
        this.alignment = alignment;
        this.skills = skills;
    }
}
