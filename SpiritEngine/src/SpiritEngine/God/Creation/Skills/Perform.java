package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Perform extends Skill {
    public Perform(){
        super(
                "Perform",
                new Class[]{
                        Class.BARD,
                        Class.MONK,
                        Class.ROGUE
                },
                true,
                Attribute.CHARISMA
        );
    }
}
