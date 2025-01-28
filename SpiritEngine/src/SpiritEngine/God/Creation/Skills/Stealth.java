package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Stealth extends Skill {
    public Stealth(){
        super(
                "Stealth",
                new Class[]{
                        Class.BARD,
                        Class.MONK,
                        Class.RANGER,
                        Class.ROGUE
                },
                true,
                Attribute.DEXTERITY
        );
    }
}
