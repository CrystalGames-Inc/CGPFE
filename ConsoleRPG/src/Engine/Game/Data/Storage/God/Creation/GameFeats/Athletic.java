package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.Feat;
import Engine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import Engine.Game.Data.Storage.God.Creation.GameSkills.Climb;
import Engine.Game.Data.Storage.God.Creation.GameSkills.Swim;

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
