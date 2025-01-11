package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;
import Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import Game.Data.Storage.God.Creation.GameSkills.Climb;
import Game.Data.Storage.God.Creation.GameSkills.Swim;

public class Athletic extends Feat {
    public Athletic(){
        setName("Athletic");
        setCombatFeat(false);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new Climb(), 2),
                new SkillCheckModifier(new Swim(), 2)
        });
    }
}
