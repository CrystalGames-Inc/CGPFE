package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Swim extends Skill {
    public Swim(){
        setName("Swim");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.DRUID,
                Class.FIGHTER,
                Class.MONK,
                Class.RANGER,
                Class.RANGER
        });
        setUntrained(true);
        setAbility(Attribute.STRENGTH);
    }
}
