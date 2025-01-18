package SpiritEngine.Data.Models.Spell;

public class Spell {
    private SpellInfo SpellInfo;
    private SpellLevels ClassLevels;

    public void setSpellInfo(SpiritEngine.Data.Models.Spell.SpellInfo spellInfo) {
        SpellInfo = spellInfo;
    }

    public void setClassLevels(SpellLevels classLevels) {
        ClassLevels = classLevels;
    }

    public SpiritEngine.Data.Models.Spell.SpellInfo getSpellInfo() {
        return SpellInfo;
    }

    public SpellLevels getClassLevels() {
        return ClassLevels;
    }
}
