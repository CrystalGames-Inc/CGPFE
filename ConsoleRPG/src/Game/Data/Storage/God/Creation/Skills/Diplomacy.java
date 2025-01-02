package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public final class Diplomacy extends Skill {

    public Diplomacy(){
        setName("Diplomacy");
        setBarbarian(false);
        setBard(true);
        setCleric(true);
        setDruid(false);
        setFighter(false);
        setMonk(false);
        setPaladin(true);
        setRanger(false);
        setRogue(true);
        setSorcerer(false);
        setWizard(false);
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
