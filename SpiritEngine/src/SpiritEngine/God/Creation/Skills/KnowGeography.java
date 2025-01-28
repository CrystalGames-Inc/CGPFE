package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowGeography extends Skill {
    public KnowGeography(){
        super(
                "Knowledge (Geography)",
                new Class[]{
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
