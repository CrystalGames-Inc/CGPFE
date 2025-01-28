package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Fly extends Skill {
    public Fly(){
        super(
                "Fly",
                new Class[]{
                        Class.DRUID,
                        Class.SORCERER,
                        Class.WIZARD
                },
                true,
                Attribute.DEXTERITY
        );
    }
}
