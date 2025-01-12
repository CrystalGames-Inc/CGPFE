package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class Appraise extends Skill {
    public Appraise(){
        setName("Appraise");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.MONK,
                Class.ROGUE,
                Class.SORCERER,
                Class.WIZARD
        });
        setUntrained(true);
        setAbility(Attribute.INTELLIGENCE);
    }
}
