package Game.Data.Models.God.Creation;

public class SkillCheckModifier {
    public Skill skill;
    public int bonus;

    public SkillCheckModifier(Skill skill, int bonus){
        this.skill = skill;
        this.bonus = bonus;
    }
}
