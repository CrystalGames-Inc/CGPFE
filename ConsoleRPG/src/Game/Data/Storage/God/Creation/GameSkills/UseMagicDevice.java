package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill.Skill;
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
