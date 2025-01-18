package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.Data.Storage.God.Creation.Skills;

public class Acrobatic extends Feat {

    Skills skills;

    public Acrobatic(){

        setName("Acrobatic");
        setDepFeat(null);
        setCombatFeat(false);
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(skills.acrobatics, 2),
                new SkillCheckModifier(skills.fly, 2)
        });
    }
}
