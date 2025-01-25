package SpiritEngine.God.Creation.Importance.Feat;

import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;

public class Feat {

    private String name;
    private boolean canAcquire;
    private Type type;
    private Type[] types = new Type[2];
    private SkillCheckModifier[] skillModifiers;
    private int[] checkModifiers;

    public Feat(String name){
        this.name = name;
    }

    public Feat(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public Feat(String name, Type type1, Type type2){
        this.name = name;
        this.types[0] = type1;
        this.types[1] = type2;
    }

    public void setCanAcquire(boolean condition) {
        this.canAcquire = condition;
    }

    public void setSkillModifiers(SkillCheckModifier[] skillModifiers){
        this.skillModifiers = skillModifiers;
    }

    public void setCheckModifiers(int check, int modifier){
        checkModifiers = new int[]{check, modifier};
    }

    public String getName() {
        return name;
    }

    public boolean canAcquire() {
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

    public int[] getCheckModifiers(){
        return checkModifiers;
    }
}
