package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

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
