package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowHistory extends Skill {
    public KnowHistory(){
        setName("Knowledge (History)");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.MONK,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
