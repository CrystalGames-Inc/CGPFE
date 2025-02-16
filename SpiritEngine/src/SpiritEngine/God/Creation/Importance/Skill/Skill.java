package SpiritEngine.God.Creation.Importance.Skill;

import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public class Skill {

    private final String name;
    private final boolean untrained;
    private final Attribute ability;

    public Skill(String name, boolean untrained, Attribute ability){
        this.name = name;
        this.untrained = untrained;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public boolean isUntrained() {
        return untrained;
    }

    public Attribute getAbility() {
        return ability;
    }
}