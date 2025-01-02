package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public class Acrobatics extends Skill {
    public final Skill skill = new Skill();

    public Acrobatics(){
        skill.setName("Acrobatics");
        skill.setBarbarian(true);
        skill.setBard(true);
        skill.setCleric(false);
        skill.setDruid(false);
        skill.setFighter(false);
        skill.setMonk(true);
        skill.setPaladin(false);
        skill.setRanger(false);
        skill.setRogue(true);
        skill.setSorcerer(false);
        skill.setWizard(false);
        skill.setUntrained(true);
        skill.setAbility(Attribute.DEXTERITY);
    }
}
