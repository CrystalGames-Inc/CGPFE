package SpiritEngine.God.Creation.NPC;

import SpiritEngine.God.Creation.ClassTable.Table;
import SpiritEngine.God.Creation.Importance.Constants.Size;
import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.NPCClass;
import SpiritEngine.God.Creation.Importance.Constants.Race;

public class Info {
    public String name;
    public Race race;
    public NPCClass nClass;
    public Size size;
    public int level;
    public Alignment alignment;
    public Skill[] skills;

    public Info(String name, Alignment alignment, Race race, NPCClass nClass, Size size, Skill[] skills) {
        this.name = name;
        this.race = race;
        this.nClass = nClass;
        this.size = size;
        this.alignment = alignment;
        this.skills = skills;
    }
}
