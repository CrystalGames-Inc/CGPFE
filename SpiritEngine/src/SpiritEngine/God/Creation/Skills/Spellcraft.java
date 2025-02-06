package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Constants.Attribute;
import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;

public final class Spellcraft extends Skill {
    public Spellcraft(){
        super(
                "Spellcraft",
                new Class[]{
                        Class.ALCHEMIST,
                        Class.BARD,
                        Class.CLERIC,
                        Class.DRUID,
                        Class.PALADIN,
                        Class.RANGER,
                        Class.SORCERER,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}