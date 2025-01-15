package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class SleightOfHand extends Skill {
    public SleightOfHand(){
        setName("Sleight Of Hand");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE
        });
        setUntrained(false);
        setAbility(Attribute.DEXTERITY);
    }
}
