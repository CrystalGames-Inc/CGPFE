package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;
import SpiritEngine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import SpiritEngine.Game.Data.Storage.God.Creation.Skills;

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
