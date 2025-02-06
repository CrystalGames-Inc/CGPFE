package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Heal extends Skill {
    public Heal(){
        super(
                "Heal",
                new Class[]{
                        Class.ALCHEMIST,
                        Class.BARD,
                        Class.DRUID,
                        Class.PALADIN,
                        Class.RANGER
                },
                true,
                Attribute.WISDOM
        );
    }
}
