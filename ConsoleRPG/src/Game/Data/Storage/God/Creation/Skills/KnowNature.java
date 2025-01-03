package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class KnowNature extends Skill {
    public KnowNature(){
        setName("Knowledge (Nature)");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.DRUID,
                Class.RANGER,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
