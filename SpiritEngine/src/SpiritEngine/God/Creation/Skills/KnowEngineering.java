package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowEngineering extends Skill {
    public KnowEngineering(){
        super(
                "Knowledge (Engineering)",
                new Class[]{
                        Class.BARD,
                        Class.FIGHTER,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
