package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowLocal extends Skill {
    public KnowLocal(){
        super(
                "Knowledge (Local)",
                new Class[]{
                        Class.BARD,
                        Class.ROGUE,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
