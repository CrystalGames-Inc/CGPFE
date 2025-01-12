package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class Heal extends Skill {
    public Heal(){
        setName("Heal");
        setClasses(new Class[]{
                Class.CLERIC,
                Class.DRUID,
                Class.PALADIN,
                Class.RANGER
        });
        setUntrained(true);
        setAbility(Attribute.WISDOM);
    }
}
