package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Diplomacy extends Skill {

    public Diplomacy(){
        setName("Diplomacy");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.PALADIN,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
