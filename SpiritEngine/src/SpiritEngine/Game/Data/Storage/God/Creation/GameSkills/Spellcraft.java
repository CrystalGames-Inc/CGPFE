package SpiritEngine.Game.Data.Storage.God.Creation.GameSkills;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;

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
