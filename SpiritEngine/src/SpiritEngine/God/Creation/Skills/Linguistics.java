package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Linguistics extends Skill {
    public Linguistics(){
        super(
                "Linguistics",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.ROGUE,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
