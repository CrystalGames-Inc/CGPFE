package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.Management.PlayerDataMgr;

public class Persuasive extends Feat {
    public Persuasive() {
        super("Persuasive");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[5].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[5].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[5].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[12].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[12].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[12].bonus.miscMod + 2
                )
        });
    }
}
