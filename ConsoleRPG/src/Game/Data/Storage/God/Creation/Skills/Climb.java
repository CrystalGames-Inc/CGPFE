package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public final class Climb extends Skill {

    public Climb(){
        setName("Climb");
        setBarbarian(true);
        setBard(true);
        setCleric(false);
        setDruid(true);
        setFighter(true);
        setMonk(true);
        setPaladin(false);
        setRanger(true);
        setRogue(true);
        setSorcerer(false);
        setWizard(false);
        setUntrained(true);
        setAbility(Attribute.STRENGTH);
    }

}