package SpiritEngine.God.Creation.Beasts._Beast;

import SpiritEngine.God.Creation.Beasts._Beast.Properties.Terrain;
import SpiritEngine.God.Creation.Beasts._Beast.Properties.Type;
import SpiritEngine.God.Creation.Entity.Attributes;
import SpiritEngine.God.Creation.Importance.Constants.*;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Player.Inventory.RangedWeapon;
import SpiritEngine.God.Creation.Player.Inventory.Weapon;

public class Beast {

    //Info
    private final String name;
    private final double cr; //Challenge Rating
    private final int xp;
    private final Race race;
    private final Class bClass;
    private final int level;
    private final Alignment alignment;
    private final Size size;
    private final Type type;
    private final int initMod;

    //Defense
    private final int ac; //Armor Class
    private final int touch;
    private final int flatFooted;
    private final int hp;

    private final int fort; //Fortitude
    private final int ref; //Reflex
    private final int will;

    //Offense
    private Weapon melee;
    private RangedWeapon ranged;

    //Statistics
    private final Attributes attributes;
    private int bab; //Base Attack Bonus
    private int cmb; //Combat Maneuver Bonus
    private int cmd; //Combat Maneuver Defense
    private Feat[] feats;
    private Skill[] skills;
    private Language[] languages;

    //Ecology
    private Terrain terrain;
    private Terrain[] terrains;

    public Beast(String name, double cr, int xp, Race race, Class bClass, int level, Alignment alignment, Size size, Type type, int initMod, int ac, int touch, int flatFooted, int hp, int fort, int ref, int will, Attributes attributes) {
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
        this.ac = ac;
        this.touch = touch;
        this.flatFooted = flatFooted;
        this.hp = hp;
        this.fort = fort;
        this.ref = ref;
        this.will = will;
        this.attributes = attributes;
    }

    public void setMelee(Weapon melee) {
        this.melee = melee;
    }

    public void setRanged(RangedWeapon ranged) {
        this.ranged = ranged;
    }

    public void setBab(int bab) {
        this.bab = bab;
    }

    public void setCmb(int cmb) {
        this.cmb = cmb;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public void setFeats(Feat[] feats) {
        this.feats = feats;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public void setLanguages(Language[] languages) {
        this.languages = languages;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public void setTerrains(Terrain[] terrains) {
        this.terrains = terrains;
    }

    public String getName() {
        return name;
    }

    public double getCr() {
        return cr;
    }

    public int getXp() {
        return xp;
    }

    public Race getRace() {
        return race;
    }

    public Class getbClass() {
        return bClass;
    }

    public int getLevel() {
        return level;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Size getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

    public int getInitMod() {
        return initMod;
    }

    public int getAc() {
        return ac;
    }

    public int getTouch() {
        return touch;
    }

    public int getFlatFooted() {
        return flatFooted;
    }

    public int getHp() {
        return hp;
    }

    public int getFort() {
        return fort;
    }

    public int getRef() {
        return ref;
    }

    public int getWill() {
        return will;
    }

    public Weapon getMelee() {
        return melee;
    }

    public RangedWeapon getRanged() {
        return ranged;
    }

    public int getStrength() {
        return attributes.strength;
    }

    public int getDexterity() {
        return attributes.dexterity;
    }

    public int getConstitution() {
        return attributes.constitution;
    }

    public int getIntelligence() {
        return attributes.intelligence;
    }

    public int getWisdom() {
        return attributes.wisdom;
    }

    public int getCharisma() {
        return attributes.charisma;
    }

    public int getBab() {
        return bab;
    }

    public int getCmb() {
        return cmb;
    }

    public int getCmd() {
        return cmd;
    }

    public Feat[] getFeats() {
        return feats;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public Language[] getLanguages() {
        return languages;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public Terrain[] getTerrains() {
        return terrains;
    }
}