package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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
