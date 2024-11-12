package Game.Data.Models.Spell;

public class Spell {
    public SpellInfo SpellInfo;
    public SpellLevels ClassLevels;

    public Spell(SpellInfo spellInfo, SpellLevels classLevels){
        SpellInfo = spellInfo;
        ClassLevels = classLevels;
    }
}
