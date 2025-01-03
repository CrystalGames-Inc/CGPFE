package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class SleightOfHand extends Skill {
    public SleightOfHand(){
        setName("Sleight Of Hand");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE
        });
        setUntrained(false);
        setAbility(Attribute.DEXTERITY);
    }
}
