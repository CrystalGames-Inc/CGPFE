package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowArcana extends Skill {
    public KnowArcana(){
        super(
                "Knowledge (Arcana)",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.SORCERER,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
