package Game.Data.Models.God.Creation;

public class Feat {
    private String name;
    private Feat dependantFeat;
    private boolean combatFeat;


    public void setName(String name) {
        this.name = name;
    }

    public void setDependantFeat(Feat dependantFeat) {
        this.dependantFeat = dependantFeat;
    }

    public void setCombatFeat(boolean combatFeat) {
        this.combatFeat = combatFeat;
    }

    public String getName() {
        return name;
    }

    public Feat getDependantFeat() {
        return dependantFeat;
    }

    public boolean isCombatFeat() {
        return combatFeat;
    }
}
