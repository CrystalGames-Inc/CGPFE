package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class KnowEngineering extends Skill {
    public KnowEngineering(){
        setName("Knowledge (Engineering)");
        setClasses(new Class[]{
                Class.BARD,
                Class.FIGHTER,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
