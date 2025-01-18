package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.Data.Storage.God.Creation.GameSkills.Climb;
import SpiritEngine.Data.Storage.God.Creation.GameSkills.Swim;

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
