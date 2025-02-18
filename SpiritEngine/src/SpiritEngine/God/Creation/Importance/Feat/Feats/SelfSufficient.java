package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Skill.Skills._Skills;
import SpiritEngine.Management.PlayerDataMgr;

public class SelfSufficient extends Feat {
    public SelfSufficient() {
        super("Self-Sufficient");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.HEAL.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.HEAL.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.HEAL.ordinal()].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.SURVIVAL.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.SURVIVAL.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.SURVIVAL.ordinal()].bonus.miscMod + 2)
        });
    }
}
