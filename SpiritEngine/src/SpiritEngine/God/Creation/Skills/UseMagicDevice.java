package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class UseMagicDevice extends Skill {
    public UseMagicDevice(){
        super(
                "Use Magic Device",
                new Class[]{
                        Class.BARD,
                        Class.ROGUE,
                        Class.SORCERER
                },
                false,
                Attribute.CHARISMA
        );
    }
}
