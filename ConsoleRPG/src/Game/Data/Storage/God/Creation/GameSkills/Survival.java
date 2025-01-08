package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Survival extends Skill {
    public Survival(){
        setName("Survival");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.DRUID,
                Class.FIGHTER,
                Class.RANGER
        });
        setUntrained(true);
        setAbility(Attribute.WISDOM);
    }
}
