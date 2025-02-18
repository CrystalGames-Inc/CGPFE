package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Skill.Skills.EscapeArtist;
import SpiritEngine.God.Creation.Importance.Skill.Skills.Stealth;
import SpiritEngine.God.Creation.Importance.Skill.Skills._Skills;
import SpiritEngine.Management.PlayerDataMgr;

public class Stealthy extends Feat {
    public Stealthy() {
        super("Stealthy");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.ESCAPEARTIST.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.ESCAPEARTIST.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.ESCAPEARTIST.ordinal()].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.STEALTH.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.STEALTH.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.STEALTH.ordinal()].bonus.miscMod + 2)
        });
    }
}
