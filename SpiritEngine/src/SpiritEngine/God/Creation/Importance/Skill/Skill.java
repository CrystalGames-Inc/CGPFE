package SpiritEngine.God.Creation.Importance.Skill;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public class Skill {

    private final String name;
    private final Class[] classes;
    private final boolean untrained;
    private final Attribute ability;
    private SkillBonus bonus;


    public Skill(String name, Class[] classes, boolean untrained, Attribute ability){
        this.name = name;
        this.classes = classes;
        this.untrained = untrained;
        this.ability = ability;
    }

    public void setBonus(int ranks){
        bonus = new SkillBonus(0,ranks,0);
    }

    public String getName() {
        return name;
    }

    public Class[] getClasses(){
        return classes;
    }

    public boolean isUntrained() {
        return untrained;
    }

    public Attribute getAbility() {
        return ability;
    }

    public SkillBonus getBonus(){
        return bonus;
    }

    public int getRanks(){
        return bonus.ranks;
    }

    public int getMiscMod(){
        return bonus.miscMod;
    }
}