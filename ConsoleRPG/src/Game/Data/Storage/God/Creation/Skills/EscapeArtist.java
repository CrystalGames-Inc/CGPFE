package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class EscapeArtist extends Skill {
    public EscapeArtist(){
        setName("Escape Artist");
        setClasses(new Class[]{
                Class.BARD,
                Class.MONK,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
