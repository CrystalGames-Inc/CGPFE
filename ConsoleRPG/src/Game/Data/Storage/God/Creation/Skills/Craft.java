package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class Craft extends Skill {

    public Craft(){
        setName("Craft");
        setClasses(new Class[]{
                Class.BARBARIAN,
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
        setUntrained(true);
        setAbility(Attribute.INTELLIGENCE);
    }
}
