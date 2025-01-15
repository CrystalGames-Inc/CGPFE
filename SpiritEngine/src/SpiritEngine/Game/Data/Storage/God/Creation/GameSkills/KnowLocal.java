package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowLocal extends Skill {
    public KnowLocal(){
        setName("Knowledge (Local)");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
