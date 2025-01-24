package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Skills.Acrobatics;
import SpiritEngine.God.Creation.Skills.Fly;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;

public class Acrobatic extends Feat {
    public Acrobatic() {
        super("Acrobatic");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Acrobatics(), 2),
                new SkillCheckModifier(new Fly(), 2)
        });
    }
}
