package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class DisableDevice extends Skill {
    public DisableDevice(){
        setName("Disable Device");
        setClasses(new Class[]{
                Class.ROGUE
        });
        setUntrained(false);
        setAbility(Attribute.DEXTERITY);
    }
}
