package SpiritEngine.God.Creation.Importance.Feat;

import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;

public class Feat {

    private final String name;
    private boolean hasFeat;
    private boolean canAcquire;
    private Type type;
    private final Type[] types = new Type[2];
    private SkillBonus[] skillModifiers;
    private int[] checkModifiers;

    public Feat(String name){
        this.name = name;
        this.hasFeat = false;
    }

    public Feat(String name, Type type){
        this.name = name;
        this.hasFeat = false;
        this.type = type;
    }

    public Feat(String name, Type type1, Type type2){
        this.name = name;
        this.hasFeat = false;
        this.types[0] = type1;
        this.types[1] = type2;
    }

    public void setCanAcquire(boolean condition) {
        this.canAcquire = condition;
    }

    public void setHasFeat(boolean hasFeat){
        this.hasFeat = hasFeat;
    }

    public void setSkillModifiers(SkillBonus[] skillModifiers){
        this.skillModifiers = skillModifiers;
    }

    public void setCheckModifiers(int check, int modifier){
        checkModifiers = new int[]{check, modifier};
    }

    public String getName() {
        return name;
    }

    public boolean hasFeat(){
        return hasFeat;
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

    public SkillBonus[] getSkillModifiers(){
        return skillModifiers;
    }

    public int[] getCheckModifiers(){
        return checkModifiers;
    }
}
