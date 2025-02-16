package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Spellcraft;
import SpiritEngine.God.Creation.Importance.Skill.Skills.UseMagicDevice;

public class MagicalAptitude extends Feat {
    public MagicalAptitude() {
        super("Magical Aptitude");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Spellcraft(), 2),
                new SkillCheckModifier(new UseMagicDevice(), 2)
        });
    }
}
