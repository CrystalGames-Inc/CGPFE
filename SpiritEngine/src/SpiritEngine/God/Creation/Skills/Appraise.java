package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Appraise extends Skill {
    public Appraise(){
        super(
            "Appraise",
            new Class[]{
                    Class.ALCHEMIST,
                    Class.BARD,
                    Class.CLERIC,
                    Class.MONK,
                    Class.ROGUE,
                    Class.SORCERER,
                    Class.WIZARD
            },
            true,
            Attribute.INTELLIGENCE
        );
    }
}
