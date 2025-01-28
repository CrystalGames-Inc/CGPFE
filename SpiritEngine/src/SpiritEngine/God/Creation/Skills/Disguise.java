package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Disguise extends Skill {
    public Disguise(){
        super(
                "Disguise",
                new Class[]{
                        Class.BARD,
                        Class.ROGUE
                },
                true,
                Attribute.CHARISMA
        );
    }
}
