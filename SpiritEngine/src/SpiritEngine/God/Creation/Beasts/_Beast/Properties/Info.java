package SpiritEngine.God.Creation.Beasts._Beast.Properties;

import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Race;
import SpiritEngine.God.Creation.Importance.Constants.Size;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skill;

public class Info {
    public final String name;
    public final double cr; //Challenge Rating
    public final int xp;
    public final Race race;
    public final Class bClass;
    public final int level;
    public final Alignment alignment;
    public final Size size;
    public final Type type;
    public final int initMod;
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