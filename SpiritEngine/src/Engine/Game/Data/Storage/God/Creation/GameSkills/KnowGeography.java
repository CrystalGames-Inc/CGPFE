package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class KnowGeography extends Skill {
    public KnowGeography(){
        setName("Knowledge (Geography)");
        setClasses(new Class[]{
                Class.BARD,
                Class.DRUID,
                Class.RANGER,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
