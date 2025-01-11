package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;
import Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import Game.Data.Storage.God.Creation.Skills;

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
