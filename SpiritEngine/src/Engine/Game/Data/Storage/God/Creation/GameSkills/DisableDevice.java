package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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
