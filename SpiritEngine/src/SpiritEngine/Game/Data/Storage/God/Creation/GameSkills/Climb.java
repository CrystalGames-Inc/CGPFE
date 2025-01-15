package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

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