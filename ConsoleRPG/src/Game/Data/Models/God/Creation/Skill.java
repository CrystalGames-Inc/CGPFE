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
    private boolean ranger;
    private boolean rogue;
    private boolean sorcerer;
    private boolean wizard;
    private boolean untrained;
    private Attribute ability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBarbarian() {
        return barbarian;
    }

    public void setBarbarian(boolean barbarian) {
        this.barbarian = barbarian;
    }

    public boolean isBard() {
        return bard;
    }

    public void setBard(boolean bard) {
        this.bard = bard;
    }

    public boolean isCleric() {
        return cleric;
    }

    public void setCleric(boolean cleric) {
        this.cleric = cleric;
    }

    public boolean isDruid() {
        return druid;
    }

    public void setDruid(boolean druid) {
        this.druid = druid;
    }

    public boolean isFighter() {
        return fighter;
    }

    public void setFighter(boolean fighter) {
        this.fighter = fighter;
    }

    public boolean isMonk() {
        return monk;
    }

    public void setMonk(boolean monk) {
        this.monk = monk;
    }

    public boolean isRanger() {
        return ranger;
    }

    public void setRanger(boolean ranger) {
        this.ranger = ranger;
    }

    public boolean isRogue() {
        return rogue;
    }

    public void setRogue(boolean rogue) {
        this.rogue = rogue;
    }

    public boolean isSorcerer() {
        return sorcerer;
    }

    public void setSorcerer(boolean sorcerer) {
        this.sorcerer = sorcerer;
    }

    public boolean isWizard() {
        return wizard;
    }

    public void setWizard(boolean wizard) {
        this.wizard = wizard;
    }

    public boolean isUntrained() {
        return untrained;
    }

    public void setUntrained(boolean untrained) {
        this.untrained = untrained;
    }

    public Attribute getAbility() {
        return ability;
    }

    public void setAbility(Attribute ability) {
        this.ability = ability;
    }
}