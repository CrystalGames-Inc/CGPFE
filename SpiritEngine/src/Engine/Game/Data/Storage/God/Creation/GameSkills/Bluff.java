package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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
