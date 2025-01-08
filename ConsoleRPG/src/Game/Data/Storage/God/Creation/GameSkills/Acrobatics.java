package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Acrobatics extends Skill {

    public Acrobatics(){
        setName("Acrobatics");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.MONK,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
