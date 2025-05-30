package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.SkillBonus;
import CGPFE.Management.PlayerDataMgr;

public class DeftHands extends Feat {
    public DeftHands() {
        super("Deft Hands");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[6].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[6].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[6].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[6].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[6].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[6].bonus.miscMod + 2)
        });
    }
}
