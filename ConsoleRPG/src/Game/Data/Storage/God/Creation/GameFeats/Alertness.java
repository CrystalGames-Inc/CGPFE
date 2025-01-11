package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;
import Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import Game.Data.Storage.God.Creation.Skills;

public class Alertness extends Feat {

    Skills skills;

    public Alertness(){
        setName("Alertness");
        setDepFeat(null);
        setCombatFeat(false);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(skills.perception, 2),
                new SkillCheckModifier(skills.senseMotive, 2)
        });
    }
}
