package SpiritEngine.God.Creation.Importance.Feat;

import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;

public class Feat {

    private String name;
    private boolean canAcquire;
    private Type type;
    private Type[] types;
    private SkillCheckModifier[] skillModifiers;

    public Feat(String name){
        this.name = name;
    }

    public Feat(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public Feat(String name, Type[] types){
        this.name = name;
        this.types = types;
    }

    public void setCanAcquire(boolean canAcquire) {
        this.canAcquire = canAcquire;
    }

    public void setSkillModifiers(SkillCheckModifier[] skillModifiers){
        this.skillModifiers = skillModifiers;
    }

    public String getName() {
        return name;
    }

    public boolean isCanAcquire() {
        return canAcquire;
    }


    public Type getType(){
        return type;
    }

    public Type[] getTypes(){
        return types;
    }

    public SkillCheckModifier[] getSkillModifiers(){
        return skillModifiers;
    }
}
