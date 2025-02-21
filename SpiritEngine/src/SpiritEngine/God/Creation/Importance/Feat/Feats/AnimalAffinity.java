package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.Management.PlayerDataMgr;

public class AnimalAffinity extends Feat {
    public AnimalAffinity() {
        super("Animal Affinity");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[10].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[10].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[10].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[26].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[26].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[26].bonus.miscMod + 2)
        });
    }
}
