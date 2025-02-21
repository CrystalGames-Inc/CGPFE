package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.Management.PlayerDataMgr;

public class Alertness extends Feat {
    public Alertness() {
        super("Alertness");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[23].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[23].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[23].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[27].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[27].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[27].bonus.miscMod + 2)
        });
    }
}
