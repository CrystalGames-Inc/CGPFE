package SpiritEngine.God.War.Combat.Action;

public class Action {

    private final String name;
    private final Type type;
    private final boolean attackOfOpportunity;

    public Action(String name, Type type, boolean attackOfOpportunity) {
        this.name = name;
        this.type = type;
        this.attackOfOpportunity = attackOfOpportunity;
    }

    public String getName(){
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isAttackOfOpportunity() {
        return attackOfOpportunity;
    }
}
