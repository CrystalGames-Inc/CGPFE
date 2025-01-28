package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class EscapeArtist extends Skill {
    public EscapeArtist(){
        super(
                "Escape Artist",
                new Class[]{
                        Class.BARD,
                        Class.MONK,
                        Class.ROGUE
                },
                true,
                Attribute.DEXTERITY
        );
    }
}
