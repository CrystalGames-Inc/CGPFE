package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class Diplomacy extends Skill {

    public Diplomacy(){
        setName("Diplomacy");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.PALADIN,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
