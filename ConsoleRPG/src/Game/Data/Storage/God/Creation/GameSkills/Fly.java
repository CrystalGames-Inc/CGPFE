package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Fly extends Skill {
    public Fly(){
        setName("Fly");
        setClasses(new Class[]{
                Class.DRUID,
                Class.SORCERER,
                Class.WIZARD
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
