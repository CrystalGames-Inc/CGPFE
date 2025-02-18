package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.Data.Game.GameData;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Perception;
import SpiritEngine.God.Creation.Importance.Skill.Skills.SenseMotive;
import SpiritEngine.God.Creation.Player.PlayerSkill;
import SpiritEngine.God.Creation.Player.PlayerSkills;

public class Alertness extends Feat {
    public Alertness() {
        super("Alertness");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(Perception(), 2),
                new SkillBonus(SenseMotive(), 2)
        });
    }
}
