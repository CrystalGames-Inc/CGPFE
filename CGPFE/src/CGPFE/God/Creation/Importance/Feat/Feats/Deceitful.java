package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.SkillBonus;
import CGPFE.Management.PlayerDataMgr;

public class Deceitful extends Feat {
    public Deceitful() {
        super("Deceitful");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[2].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[2].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[2].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[7].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[7].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[7].bonus.miscMod + 2)
        });
    }
}
