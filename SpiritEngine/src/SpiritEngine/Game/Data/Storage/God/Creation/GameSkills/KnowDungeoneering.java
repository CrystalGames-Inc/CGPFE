package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowDungeoneering extends Skill {
    public KnowDungeoneering(){
        setName("Knowledge (dungeoneering)");
        setClasses(new Class[]{
                Class.BARD,
                Class.FIGHTER,
                Class.RANGER,
                Class.ROGUE,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
