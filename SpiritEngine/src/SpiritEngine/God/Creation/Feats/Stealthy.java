package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.EscapeArtist;
import SpiritEngine.God.Creation.Skills.Stealth;

public class Stealthy extends Feat {
    public Stealthy() {
        super("Stealthy");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new EscapeArtist(), 2),
                new SkillCheckModifier(new Stealth(), 2)
        });
    }
}
