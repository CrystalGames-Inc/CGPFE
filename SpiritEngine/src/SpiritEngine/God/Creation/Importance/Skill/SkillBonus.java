package SpiritEngine.God.Creation.Importance.Skill;

public class SkillBonus {

    public int size;

    public int abilityMod = 0;
    public int ranks = 0;
    public int miscMod = 0;

    public SkillBonus(){

    }

    public SkillBonus(int abilityMod, int ranks, int miscMod) {
        this.abilityMod = abilityMod;
        this.ranks = ranks;
        this.miscMod = miscMod;
        this.size =  abilityMod + ranks + miscMod;
    }
}
