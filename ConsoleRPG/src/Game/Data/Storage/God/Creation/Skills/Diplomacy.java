package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

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
