package SpiritEngine.God.Creation.Feats.P;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.Diplomacy;
import SpiritEngine.God.Creation.Skills.Intimidate;

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
