package Game.Data.Models.God.Creation;

import God.Creation.Importance.Skills.Attribute;

public interface ISkill {
    public String name();
    public boolean barbarian();
    public boolean bard();
    public boolean cleric();
    public boolean druid();
    public boolean fighter();
    public boolean monk();
    public boolean ranger();
    public boolean rogue();
    public boolean sorcerer();
    public boolean wizard();
    public boolean untrained();
    public Attribute ability();
}