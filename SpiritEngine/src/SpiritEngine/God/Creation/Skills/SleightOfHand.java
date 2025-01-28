package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class SleightOfHand extends Skill {
    public SleightOfHand(){
        super(
                "Sleight Of Hand",
                new Class[]{
                        Class.BARD,
                        Class.ROGUE
                },
                false,
                Attribute.DEXTERITY
        );
    }
}
