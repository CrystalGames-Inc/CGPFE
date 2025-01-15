package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowReligion extends Skill {
    public KnowReligion(){
        setName("Knowledge (Religion)");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.MONK,
                Class.PALADIN,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
