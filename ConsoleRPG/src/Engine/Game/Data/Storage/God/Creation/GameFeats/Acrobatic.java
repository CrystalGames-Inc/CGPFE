package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.Feat;
import Engine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;
import Engine.Game.Data.Storage.God.Creation.Skills;

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
