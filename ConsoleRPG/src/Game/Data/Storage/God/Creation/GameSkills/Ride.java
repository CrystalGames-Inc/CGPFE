package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Ride extends Skill {
    public Ride(){
        setName("Ride");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.DRUID,
                Class.FIGHTER,
                Class.MONK,
                Class.PALADIN,
                Class.RANGER
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
