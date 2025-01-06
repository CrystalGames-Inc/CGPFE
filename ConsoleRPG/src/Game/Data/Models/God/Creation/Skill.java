package Game.Data.Models.God.Creation;

import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public class Skill {

    private String name;
    private Class[] classes;
    private boolean untrained;
    private Attribute ability;


    //For the sake of navigation, I've separated the getters and setters
    //Here are the setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(Class[] classes){
        this.classes = classes;
    }

    public void setUntrained(boolean untrained) {
        this.untrained = untrained;
    }

    public void setAbility(Attribute ability) {
        this.ability = ability;
    }

    //And here are the getters
    public String getName() {
        return name;
    }

    public Class[] getClasses(){
        return classes;
    }

    public boolean isUntrained() {
        return untrained;
    }

    public Attribute getAbility() {
        return ability;
    }
}