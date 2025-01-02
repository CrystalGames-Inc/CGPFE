package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public final class Bluff extends Skill {
    public Bluff() {
        setName("Bluff");
        setBarbarian(false);
        setBard(true);
        setCleric(false);
        setDruid(false);
        setFighter(false);
        setMonk(false);
        setPaladin(false);
        setRanger(false);
        setRogue(true);
        setSorcerer(true);
        setWizard(false);
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
