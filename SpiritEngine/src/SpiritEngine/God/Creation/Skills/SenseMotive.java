package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class SenseMotive extends Skill {
    public SenseMotive(){
        super(
                "Sense Motive",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.MONK,
                        Class.PALADIN,
                        Class.ROGUE
                },
                true,
                Attribute.WISDOM
        );
    }
}