package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Stealth extends Skill {
    public Stealth(){
        setName("Stealth");
        setClasses(new Class[]{
                Class.BARD,
                Class.MONK,
                Class.RANGER,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
