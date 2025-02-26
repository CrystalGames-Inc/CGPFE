package CGPFE.God.Creation.NPC;

import CGPFE.God.Creation.Importance.Constants.Size;
import CGPFE.God.Creation.Importance.Skill.Skill;
import CGPFE.God.Creation.Importance.Constants.Alignment;
import CGPFE.God.Creation.Importance.Constants.NPCClass;
import CGPFE.God.Creation.Importance.Constants.Race;

public class Info {
    public String name;
    public Race race;
    public NPCClass nClass;
    public Size size;
    public int level;
    public int hp;
    public int maxHp;
    public Alignment alignment;
    public Skill[] skills;

    public Info(String name, Alignment alignment, Race race, NPCClass nClass, int level, int maxHp) {
        this.name = name;
        this.race = race;
        this.nClass = nClass;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.alignment = alignment;
    }
}
