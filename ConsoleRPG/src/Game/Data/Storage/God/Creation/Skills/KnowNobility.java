package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class KnowNobility extends Skill {
    public KnowNobility(){
        setName("Knowledge (Nobility)");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.PALADIN,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
