package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class Profession extends Skill {
    public Profession(){
        setName("Profession");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.DRUID,
                Class.FIGHTER,
                Class.MONK,
                Class.PALADIN,
                Class.RANGER,
                Class.ROGUE,
                Class.SORCERER,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.WISDOM);
    }
}
