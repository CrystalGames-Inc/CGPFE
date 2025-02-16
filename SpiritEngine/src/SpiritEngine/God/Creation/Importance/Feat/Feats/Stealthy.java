package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.EscapeArtist;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Stealth;

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
