package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;

public final class Spellcraft extends Skill {
    public Spellcraft(){
        setName("Spellcraft");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.DRUID,
                Class.PALADIN,
                Class.RANGER,
                Class.SORCERER,
                Class.WIZARD
        });
    }
}
