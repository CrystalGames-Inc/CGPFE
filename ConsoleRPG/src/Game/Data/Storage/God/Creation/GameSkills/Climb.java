package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Climb extends Skill {

    public Climb(){
        setName("Climb");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.DRUID,
                Class.FIGHTER,
                Class.MONK,
                Class.RANGER,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.STRENGTH);
    }

}