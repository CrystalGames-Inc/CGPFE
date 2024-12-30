package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.ISkill;
import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public class Acrobatics implements ISkill {
    public String name() {
        return "Acrobatics";
    }
    public boolean barbarian() {
        return true;
    }
    public boolean bard() {
        return true;
    }
    public boolean cleric() {
        return false;
    }
    public boolean druid() {
        return false;
    }
    public boolean fighter() {
        return false;
    }
    public boolean monk() {
        return true;
    }
    public boolean ranger() {
        return false;
    }
    public boolean rogue() {
        return true;
    }
    public boolean sorcerer() {
        return false;
    }
    public boolean wizard() {
        return false;
    }
    public boolean untrained() {
        return true;
    }
    public Attribute ability() {
        return Attribute.DEXTERITY;
    }
}
