package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class DisableDevice extends Skill {
    public DisableDevice(){
        super(
                "Disable Device",
                new Class[]{
                        Class.ROGUE
                },
                false,
                Attribute.DEXTERITY
        );
    }
}
