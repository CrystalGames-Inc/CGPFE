package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.Heal;
import SpiritEngine.God.Creation.Skills.Survival;

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
