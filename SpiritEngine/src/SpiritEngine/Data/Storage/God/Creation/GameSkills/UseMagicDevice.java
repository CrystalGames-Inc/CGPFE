package SpiritEngine.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class UseMagicDevice extends Skill {
    public UseMagicDevice(){
        setName("Use Magic Device");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE,
                Class.SORCERER
        });
        setUntrained(false);
        setAbility(Attribute.CHARISMA);
    }
}
