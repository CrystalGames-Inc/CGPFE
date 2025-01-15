package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Bluff extends Skill {
    public Bluff() {
        setName("Bluff");
        setClasses(new Class[]{
                Class.BARD,
                Class.SORCERER
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
