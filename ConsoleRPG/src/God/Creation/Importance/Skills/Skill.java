package God.Creation.Importance.Skills;

public class Skill {
    public String Name;
    public boolean Barbarian;
    public boolean Bard;
    public boolean Cleric;
    public boolean Druid;
    public boolean Fighter;
    public boolean Monk;
    public boolean Paladin;
    public boolean Ranger;
    public boolean Rogue;
    public boolean Sorcerer;
    public boolean Wizard;
    public boolean Untrained;
    public String Ability;

    public Skill(String name, boolean barbarian, boolean bard, boolean cleric, boolean druid, boolean fighter, boolean monk, boolean paladin, boolean ranger, boolean rogue, boolean sorcerer, boolean wizard, boolean untrained, String ability) {
        Name = name;
        Barbarian = barbarian;
        Bard = bard;
        Cleric = cleric;
        Druid = druid;
        Fighter = fighter;
        Monk = monk;
        Paladin = paladin;
        Ranger = ranger;
        Rogue = rogue;
        Sorcerer = sorcerer;
        Wizard = wizard;
        Untrained = untrained;
        Ability = ability;
    }
}
