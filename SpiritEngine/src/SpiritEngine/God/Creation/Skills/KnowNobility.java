package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowNobility extends Skill {
    public KnowNobility(){
        super(
                "Knowledge (Nobility)",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.PALADIN,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
