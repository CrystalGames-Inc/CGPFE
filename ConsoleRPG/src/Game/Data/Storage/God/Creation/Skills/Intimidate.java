package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Intimidate extends Skill {
    public Intimidate(){
        setName("Intimidate");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.FIGHTER,
                Class.MONK,
                Class.RANGER,
                Class.ROGUE,
                Class.SORCERER
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
