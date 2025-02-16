package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Perception;
import SpiritEngine.God.Creation.Importance.Skill.Skills.SenseMotive;

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
