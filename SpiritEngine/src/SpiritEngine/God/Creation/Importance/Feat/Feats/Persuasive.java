package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Diplomacy;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Intimidate;

public class Persuasive extends Feat {
    public Persuasive() {
        super("Persuasive");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Diplomacy(), 2),
                new SkillCheckModifier(new Intimidate(), 2)
        });
    }
}
