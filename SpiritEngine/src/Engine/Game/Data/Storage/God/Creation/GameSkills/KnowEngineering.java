package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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
