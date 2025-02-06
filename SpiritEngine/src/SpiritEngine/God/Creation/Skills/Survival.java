package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Survival extends Skill {
    public Survival(){
        super(
                "Survival",
                new Class[]{
                        Class.ALCHEMIST,
                        Class.BARBARIAN,
                        Class.DRUID,
                        Class.FIGHTER,
                        Class.RANGER
                },
                true,
                Attribute.WISDOM
        );
    }
}
