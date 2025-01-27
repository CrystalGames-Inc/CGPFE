package SpiritEngine.God.Creation.Importance.Skill;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public class Skill {

    private String name;
    private Class[] classes;
    private boolean untrained;
    private Attribute ability;
    private SkillBonus bonus;


    //For the sake of navigation, I've separated the getters and setters
    //Here are the setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(Class[] classes){
        this.classes = classes;
    }

    public void setUntrained(boolean untrained) {
        this.untrained = untrained;
    }

    public void setAbility(Attribute ability) {
        this.ability = ability;
    }

    public void setBonus(int ranks){
        bonus = new SkillBonus(0,ranks,0);
    }

    //And here are the getters
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