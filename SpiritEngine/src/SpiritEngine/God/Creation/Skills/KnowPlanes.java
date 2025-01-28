package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowPlanes extends Skill {
    public KnowPlanes(){
        super(
                "Knowledge (Planes)",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
