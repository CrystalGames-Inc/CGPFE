package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Acrobatics extends Skill {

    public Acrobatics(){
        setName("Acrobatics");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.MONK,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
