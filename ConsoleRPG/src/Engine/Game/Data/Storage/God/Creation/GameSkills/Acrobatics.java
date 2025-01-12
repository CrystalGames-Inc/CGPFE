package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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
