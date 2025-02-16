package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Heal;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Survival;

public class SelfSufficient extends Feat {
    public SelfSufficient() {
        super("Self-Sufficient");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Heal(), 2),
                new SkillCheckModifier(new Survival(), 2)
        });
    }
}
