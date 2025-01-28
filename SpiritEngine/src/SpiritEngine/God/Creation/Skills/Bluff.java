package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Bluff extends Skill {
    public Bluff() {
        super(
            "Bluff",
            new Class[]{

                    Class.BARD,
                    Class.SORCERER
            },
            true,
            Attribute.CHARISMA
        );
    }
}
