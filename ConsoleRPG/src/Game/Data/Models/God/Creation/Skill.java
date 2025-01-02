package Game.Data.Models.God.Creation;

import God.Creation.Importance.Skills.Attribute;

public class Skill {

    private String name;
    private boolean barbarian;
    private boolean bard;
    private boolean cleric;
    private boolean druid;
    private boolean fighter;
    private boolean monk;
    private boolean paladin;
    private boolean ranger;
    private boolean rogue;
    private boolean sorcerer;
    private boolean wizard;
    private boolean untrained;
    private Attribute ability;


    //For the sake of navigation, I've separated the getters and setters
    //Here are the setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBarbarian(boolean barbarian) {
        this.barbarian = barbarian;
    }

    public void setBard(boolean bard) {
        this.bard = bard;
    }

    public void setCleric(boolean cleric) {
        this.cleric = cleric;
    }

    public void setDruid(boolean druid) {
        this.druid = druid;
    }

    public void setFighter(boolean fighter) {
        this.fighter = fighter;
    }

    public void setMonk(boolean monk) {
        this.monk = monk;
    }

    public void setPaladin(boolean paladin) {
        this.paladin = paladin;
    }

    public void setRanger(boolean ranger) {
        this.ranger = ranger;
    }

    public void setRogue(boolean rogue) {
        this.rogue = rogue;
    }

    public void setSorcerer(boolean sorcerer) {
        this.sorcerer = sorcerer;
    }

    public void setWizard(boolean wizard) {
        this.wizard = wizard;
    }

    public void setUntrained(boolean untrained) {
        this.untrained = untrained;
    }

    public void setAbility(Attribute ability) {
        this.ability = ability;
    }

    //And here are the getters
    public String getName() {
        return name;
    }

    public boolean isBarbarian() {
        return barbarian;
    }

    public boolean isBard() {
        return bard;
    }

    public boolean isCleric() {
        return cleric;
    }

    public boolean isDruid() {
        return druid;
    }

    public boolean isFighter() {
        return fighter;
    }

    public boolean isMonk() {
        return monk;
    }

    public boolean isPaladin() {
        return paladin;
    }

    public boolean isRanger() {
        return ranger;
    }

    public boolean isRogue() {
        return rogue;
    }

    public boolean isSorcerer() {
        return sorcerer;
    }

    public boolean isWizard() {
        return wizard;
    }

    public boolean isUntrained() {
        return untrained;
    }

    public Attribute getAbility() {
        return ability;
    }
}