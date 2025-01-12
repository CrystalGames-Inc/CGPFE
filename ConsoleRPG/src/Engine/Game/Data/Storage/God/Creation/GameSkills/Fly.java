package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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
