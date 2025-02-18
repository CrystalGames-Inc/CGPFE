package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.Skills._Skills;
import SpiritEngine.Management.PlayerDataMgr;

public class Acrobatic extends Feat {
    public Acrobatic() {
        super("Acrobatic");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.ACROBATICS.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.ACROBATICS.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.ACROBATICS.ordinal()].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.FLY.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.FLY.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.FLY.ordinal()].bonus.miscMod + 2)
        });
    }
}
