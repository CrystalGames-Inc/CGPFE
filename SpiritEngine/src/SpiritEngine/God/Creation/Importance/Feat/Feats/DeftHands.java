package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.DisableDevice;
import SpiritEngine.God.Creation.Importance.Skill.Skills.SleightOfHand;

public class DeftHands extends Feat {
    public DeftHands() {
        super("Deft Hands");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new DisableDevice(), 2),
                new SkillCheckModifier(new SleightOfHand(), 2)
        });
    }
}
