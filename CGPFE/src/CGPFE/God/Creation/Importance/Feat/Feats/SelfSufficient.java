package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.SkillBonus;
import CGPFE.Management.PlayerDataMgr;

public class SelfSufficient extends Feat {
    public SelfSufficient() {
        super("Self-Sufficient");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[11].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[11].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[11].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[31].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[31].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[31].bonus.miscMod + 2)
        });
    }
}
