package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills.HandleAnimal;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Ride;

public class AnimalAffinity extends Feat {
    public AnimalAffinity() {
        super("Animal Affinity");
        setCanAcquire(true);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new HandleAnimal(), 2),
                new SkillCheckModifier(new Ride(), 2)
        });
    }
}
