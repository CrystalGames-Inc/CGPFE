package CGPFE.God.Creation.Beasts._Beast.Properties;

import CGPFE.God.Creation.Importance.Constants.Alignment;
import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Constants.Race;
import CGPFE.God.Creation.Importance.Constants.Size;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.Skill;

public class Info {
    public String name;
    public double cr;
    public int xp;
    public Race race;
    public Class bClass;
    public int level;
    public Alignment alignment;
    public Size size;
    public Type type;
    public int initMod;

    public Skill[] skills;
    public Feat[] feats;

    public Info(String name, double cr, int xp, Race race, Class bClass, int level, Alignment alignment, Size size, Type type, int initMod) {
        this.name = name;
        this.cr = cr;
        this.xp = xp;
        this.race = race;
        this.bClass = bClass;
        this.level = level;
        this.alignment = alignment;
        this.size = size;
        this.type = type;
        this.initMod = initMod;
    }
}