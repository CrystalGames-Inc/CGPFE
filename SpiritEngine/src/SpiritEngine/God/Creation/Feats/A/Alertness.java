package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.Perception;
import SpiritEngine.God.Creation.Skills.SenseMotive;

public class Alertness extends Feat {
    public Alertness() {
        super("Alertness");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Perception(), 2),
                new SkillCheckModifier(new SenseMotive(), 2)
        });
    }
}
