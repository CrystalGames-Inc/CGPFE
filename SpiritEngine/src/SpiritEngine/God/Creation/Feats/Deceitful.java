package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.Bluff;
import SpiritEngine.God.Creation.Skills.Disguise;

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
