package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.Climb;
import SpiritEngine.God.Creation.Skills.Swim;

public class Athletic extends Feat {
    public Athletic() {
        super("Athletic");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Climb(), 2),
                new SkillCheckModifier(new Swim(), 2)
        });
    }
}
