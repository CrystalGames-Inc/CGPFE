package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

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
