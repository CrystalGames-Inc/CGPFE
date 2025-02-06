package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Climb extends Skill {

    public Climb(){
        super(
            "Climb",
            new Class[]{
                    Class.BARBARIAN,
                    Class.BARD,
                    Class.CAVALIER,
                    Class.DRUID,
                    Class.FIGHTER,
                    Class.MONK,
                    Class.RANGER,
                    Class.ROGUE
            },
            true,
            Attribute.STRENGTH
        );
    }

}