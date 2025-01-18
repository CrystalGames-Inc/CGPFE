package SpiritEngine.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

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
