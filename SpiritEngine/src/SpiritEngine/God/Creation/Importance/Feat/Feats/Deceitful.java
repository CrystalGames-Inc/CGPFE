package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Bluff;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Disguise;

public class Deceitful extends Feat {
    public Deceitful() {
        super("Deceitful");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Bluff(), 2),
                new SkillCheckModifier(new Disguise(), 2)
        });
    }
}
