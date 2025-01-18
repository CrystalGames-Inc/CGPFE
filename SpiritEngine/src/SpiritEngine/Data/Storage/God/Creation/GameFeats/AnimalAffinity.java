package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.Data.Storage.God.Creation.Skills;

public class AnimalAffinity extends Feat {

    Skills skills;

    public AnimalAffinity(){
        setName("Animal Affinity");
        setCombatFeat(false);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(skills.handleAnimal, 2),
                new SkillCheckModifier(skills.ride, 2)
        });
    }
}
