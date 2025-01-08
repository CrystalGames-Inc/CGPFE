package Game.Data.Models.God.Creation;

public class Feat {

    private String name;
    private Feat[] dependantFeats;
    private boolean combatFeat;
    private SkillCheckModifier[] skillModifiers;

    public void setName(String name) {
        this.name = name;
    }

    public void setDependantFeat(Feat[] dependantFeats) {
        this.dependantFeats = dependantFeats;
    }

    public void setCombatFeat(boolean combatFeat) {
        this.combatFeat = combatFeat;
    }

    public void setSkillModifiers(SkillCheckModifier[] skillModifiers){
        this.skillModifiers = skillModifiers;
    }

    public String getName() {
        return name;
    }

    public Feat[] getDependantFeat() {
        return dependantFeats;
    }

    public boolean isCombatFeat() {
        return combatFeat;
    }

    public SkillCheckModifier[] getSkillModifiers(){
        return skillModifiers;
    }
}
