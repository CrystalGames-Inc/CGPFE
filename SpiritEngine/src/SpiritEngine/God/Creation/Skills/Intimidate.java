package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Intimidate extends Skill {
    public Intimidate(){
        super(
                "Intimidate",
                new Class[]{
                        Class.BARBARIAN,
                        Class.BARD,
                        Class.FIGHTER,
                        Class.MONK,
                        Class.RANGER,
                        Class.ROGUE,
                        Class.SORCERER
                },
                true,
                Attribute.CHARISMA
        );
    }
}
