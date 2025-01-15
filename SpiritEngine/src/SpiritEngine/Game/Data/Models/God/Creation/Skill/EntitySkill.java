package SpiritEngine.Game.Data.Models.God.Creation.Skill;

public class EntitySkill extends Skill{
    public Skill skill;
    public int size;

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Skill getSkill() {
        return skill;
    }

    public int getSize() {
        return size;
    }
}
