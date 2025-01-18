package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.Data.Storage.God.Creation.Skills;

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
