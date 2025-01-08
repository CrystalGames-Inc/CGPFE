package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Perception extends Skill {
    public Perception(){
        setName("Perception");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.DRUID,
                Class.MONK,
                Class.RANGER,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.WISDOM);
    }
}
