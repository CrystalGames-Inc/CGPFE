package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class HandleAnimal extends Skill {
    public HandleAnimal(){
        super(
                "Handle Animal",
                new Class[]{
                        Class.BARBARIAN,
                        Class.DRUID,
                        Class.FIGHTER,
                        Class.PALADIN,
                        Class.RANGER
                },
                false,
                Attribute.CHARISMA
        );
    }
}
