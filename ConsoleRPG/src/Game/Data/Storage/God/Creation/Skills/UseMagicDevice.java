package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

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
