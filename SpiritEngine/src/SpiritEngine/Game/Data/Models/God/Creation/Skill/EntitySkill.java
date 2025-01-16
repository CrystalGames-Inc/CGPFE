package SpiritEngine.Game.Data.Models.God.Creation.Skill;

public class EntitySkill extends Skill{
    public Skill skill;
    public int skillBonus;

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setSize(SkillBonus size) {
        this.skillBonus = size.abilityMod + size.ranks + size.miscMod;
    }

    public Skill getSkill() {
        return skill;
    }

    public int getSize() {
        return skillBonus;
    }

    public EntitySkill(){

    }

    public EntitySkill(Skill skill, int skillBonus) {
        this.skill = skill;
        this.skillBonus = skillBonus;
    }
}
