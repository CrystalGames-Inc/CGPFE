package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class KnowPlanes extends Skill {
    public KnowPlanes(){
        setName("Knowledge (Planes)");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
