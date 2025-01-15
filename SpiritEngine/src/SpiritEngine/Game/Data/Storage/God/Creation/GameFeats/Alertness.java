package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;
import SpiritEngine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import SpiritEngine.Game.Data.Storage.God.Creation.Skills;

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
