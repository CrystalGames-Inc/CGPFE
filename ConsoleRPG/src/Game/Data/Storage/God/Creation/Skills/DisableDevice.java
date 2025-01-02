package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

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
