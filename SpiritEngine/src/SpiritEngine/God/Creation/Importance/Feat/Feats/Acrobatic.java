package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class Acrobatic extends Feat {
    public Acrobatic() {
        super("Acrobatic");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[0].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[0].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[0].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[9].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[9].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[9].bonus.miscMod + 2)
        });
    }
}
