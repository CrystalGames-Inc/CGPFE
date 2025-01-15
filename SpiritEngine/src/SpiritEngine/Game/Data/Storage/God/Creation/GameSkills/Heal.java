package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

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
