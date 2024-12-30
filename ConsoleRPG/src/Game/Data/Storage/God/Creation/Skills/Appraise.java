package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.ISkill;
import God.Creation.Importance.Skills.Attribute;

public class Appraise implements ISkill {
    public String name() {
        return "Appraise";
    }
    public boolean barbarian() {
        return false;
    }
    public boolean bard() {
        return true;
    }
    public boolean cleric() {
        return true;
    }
    public boolean druid() {
        return false;
    }
    public boolean fighter() {
        return false;
    }
    public boolean monk() {
        return false;
    }
    public boolean ranger() {
        return false;
    }
    public boolean rogue() {
        return true;
    }
    public boolean sorcerer() {
        return true;
    }
    public boolean wizard() {
        return true;
    }
    public boolean untrained() {
        return true;
    }
    public Attribute ability() {
        return Attribute.INTELLIGENCE;
    }
}
