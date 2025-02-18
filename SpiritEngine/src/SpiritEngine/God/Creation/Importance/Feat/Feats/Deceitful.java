package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Skill.Skills._Skills;
import SpiritEngine.Management.PlayerDataMgr;

public class Deceitful extends Feat {
    public Deceitful() {
        super("Deceitful");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.BLUFF.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.BLUFF.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.BLUFF.ordinal()].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.DISGUISE.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.DISGUISE.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.DISGUISE.ordinal()].bonus.miscMod + 2)
        });
    }
}
