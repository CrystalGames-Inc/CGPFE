package SpiritEngine.Game.Data.Models.God.Creation.Feat;

import SpiritEngine.Game.Data.Models.God.Creation.Skill.SkillCheckModifier;

public class Feat {

    private String name;
    private Feat depFeat;
    private Feat[] depFeats;
    private DepAbility depAbility;
    private DepAbility[] depAbilities;
    private boolean combatFeat;
    private SkillCheckModifier[] skillModifiers;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepFeat(Feat depFeat){
        this.depFeat = depFeat;
    }

    public void setDepFeats(Feat[] depFeats) {
        this.depFeats = depFeats;
    }

    public void setDepAbility(DepAbility depAbility){
        this.depAbility = depAbility;
    }

    public void setDepAbilities(DepAbility[] depAbilities) {
        this.depAbilities = depAbilities;
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

    public Feat getDepFeat(){
        return  depFeat;
    }

    public Feat[] getDepFeats() {
        return depFeats;
    }

    public DepAbility getDepAbility(){
        return depAbility;
    }

    public DepAbility[] getDepAbilities(){
        return depAbilities;
    }

    public boolean isCombatFeat() {
        return combatFeat;
    }

    public SkillCheckModifier[] getSkillModifiers(){
        return skillModifiers;
    }
}
