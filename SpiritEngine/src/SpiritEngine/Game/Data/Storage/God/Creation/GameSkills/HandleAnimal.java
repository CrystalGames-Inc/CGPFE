package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class HandleAnimal extends Skill {
    public HandleAnimal(){
        setName("Handle Animal");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.DRUID,
                Class.FIGHTER,
                Class.PALADIN,
                Class.RANGER
        });
        setUntrained(false);
        setAbility(Attribute.CHARISMA);
    }
}
