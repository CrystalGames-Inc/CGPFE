package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.SkillBonus;
import CGPFE.Management.PlayerDataMgr;

public class Stealthy extends Feat {
    public Stealthy() {
        super("Stealthy");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[8].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[8].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[8].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[30].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[30].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[30].bonus.miscMod + 2)
        });
    }
}
