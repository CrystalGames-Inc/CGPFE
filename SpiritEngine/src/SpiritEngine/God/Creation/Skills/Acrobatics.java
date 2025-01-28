package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Acrobatics extends Skill {

    public Acrobatics(){
        super(
        "Acrobatics",
            new Class[]{
                    Class.BARBARIAN,
                    Class.BARD,
                    Class.MONK,
                    Class.ROGUE
            },
            true,
            Attribute.DEXTERITY
        );
    }
}
