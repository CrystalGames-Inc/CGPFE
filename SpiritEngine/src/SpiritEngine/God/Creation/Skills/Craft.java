package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Craft extends Skill {

    public Craft(){
        super(
            "Craft",
            new Class[]{
                    Class.BARBARIAN,
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
            true,
            Attribute.INTELLIGENCE
        );
    }
}
