package SpiritEngine.God.Creation.Player;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Skill.GameSkills;
import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.Management.PlayerDataMgr;

import java.util.Arrays;

public class PlayerSkill {

    public Skill skill;
    public Class[] classes;
    public SkillBonus bonus = new SkillBonus();

    public PlayerSkill(Skill skill, Class[] classes){
        this.skill = skill;
        this.classes = classes;
    }

    PlayerDataMgr pMgr = PlayerDataMgr.getInstance();

    boolean isClassSkill(PlayerSkill skill){
        return Arrays.asList(skill.classes).contains(pMgr.player.info.pClass);
    }

    //TODO Add the calculation methods
    void calculateCheckBonus(PlayerSkill skill){
        if(skill.skill.isUntrained()){

        }
        if(!skill.skill.isUntrained()){
            if(isClassSkill(skill)){

            }
            else{

            }
        }
    }

}