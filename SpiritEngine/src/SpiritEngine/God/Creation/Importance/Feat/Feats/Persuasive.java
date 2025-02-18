package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.God.Creation.Importance.Skill.Skills._Skills;
import SpiritEngine.Management.PlayerDataMgr;

public class Persuasive extends Feat {
    public Persuasive() {
        super("Persuasive");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.DIPLOMACY.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.DIPLOMACY.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.DIPLOMACY.ordinal()].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.INTIMIDATE.ordinal()].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.INTIMIDATE.ordinal()].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[_Skills.INTIMIDATE.ordinal()].bonus.miscMod + 2
                )
        });
    }
}
