package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Ride extends Skill {
    public Ride(){
        super(
                "Ride",
                new Class[]{
                        Class.BARBARIAN,
                        Class.CAVALIER,
                        Class.DRUID,
                        Class.FIGHTER,
                        Class.MONK,
                        Class.PALADIN,
                        Class.RANGER
                },
                true,
                Attribute.DEXTERITY
        );
    }
}