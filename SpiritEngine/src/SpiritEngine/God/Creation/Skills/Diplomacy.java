package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Diplomacy extends Skill {

    public Diplomacy(){
        super(
                "Diplomacy",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.PALADIN,
                        Class.ROGUE
                },
                true,
                Attribute.CHARISMA
        );
    }
}
