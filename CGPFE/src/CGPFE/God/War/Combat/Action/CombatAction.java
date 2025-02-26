package CGPFE.God.War.Combat.Action;

public class CombatAction {
    public final String name;
    public final Type type;
    public final boolean attackOfOpportunity;

    public CombatAction(String name, Type type, boolean attackOfOpportunity) {
        this.name = name;
        this.type = type;
        this.attackOfOpportunity = attackOfOpportunity;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isAttackOfOpportunity() {
        return attackOfOpportunity;
    }
}