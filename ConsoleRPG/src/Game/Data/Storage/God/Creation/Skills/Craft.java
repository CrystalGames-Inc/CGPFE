package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public final class Craft extends Skill {

    public Craft(){
        setName("Craft");
        setBarbarian(true);
        setBard(true);
        setCleric(true);
        setDruid(true);
        setFighter(true);
        setMonk(true);
        setPaladin(true);
        setRanger(true);
        setRogue(true);
        setSorcerer(true);
        setWizard(true);
        setUntrained(true);
        setAbility(Attribute.INTELLIGENCE);
    }
}
