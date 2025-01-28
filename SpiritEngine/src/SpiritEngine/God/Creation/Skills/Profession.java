package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Profession extends Skill {
    public Profession(){
        super(
                "Profession",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.DRUID,
                        Class.FIGHTER,
                        Class.MONK,
                        Class.PALADIN,
                        Class.RANGER,
                        Class.ROGUE,
                        Class.SORCERER,
                        Class.WIZARD
                },
                false,
                Attribute.WISDOM
        );
    }
}