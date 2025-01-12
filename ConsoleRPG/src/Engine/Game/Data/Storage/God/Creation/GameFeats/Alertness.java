package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.Feat;
import Engine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import Engine.Game.Data.Storage.God.Creation.Skills;

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
