package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

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
