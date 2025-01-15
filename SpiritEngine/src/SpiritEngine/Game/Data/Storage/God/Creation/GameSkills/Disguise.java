package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Disguise extends Skill {
    public Disguise(){
        setName("Disguise");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
