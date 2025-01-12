package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class KnowArcana extends Skill {
    public KnowArcana(){
        setName("Knowledge (Arcana)");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.SORCERER,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
