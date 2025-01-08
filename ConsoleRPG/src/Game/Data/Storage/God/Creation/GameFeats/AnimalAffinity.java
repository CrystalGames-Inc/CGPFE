package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat;
import Game.Data.Models.God.Creation.SkillCheckModifier;
import Game.Data.Storage.God.Creation.Skills;

public class AnimalAffinity extends Feat {
    public AnimalAffinity(){
        setName("Animal Affinity");
        setCombatFeat(false);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Skills().handleAnimal, 2),
                new SkillCheckModifier(new Skills().ride, 2)
        });
    }
}
