package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.SkillBonus;
import CGPFE.Management.PlayerDataMgr;

public class MagicalAptitude extends Feat {
    public MagicalAptitude() {
        super("Magical Aptitude");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[29].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[29].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[29].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[33].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[33].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[33].bonus.miscMod + 2)
        });
    }
}
