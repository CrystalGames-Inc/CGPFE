package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowNature extends Skill {
    public KnowNature(){
        super(
                "Knowledge (Nature)",
                new Class[]{
                        Class.ALCHEMIST,
                        Class.BARBARIAN,
                        Class.BARD,
                        Class.DRUID,
                        Class.RANGER,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
