package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;
import SpiritEngine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import SpiritEngine.Game.Data.Storage.God.Creation.GameSkills.Climb;
import SpiritEngine.Game.Data.Storage.God.Creation.GameSkills.Swim;

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
