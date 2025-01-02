package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public class Appraise extends Skill {
    public final Skill skill = new Skill();

    public Appraise(){
        skill.setName("Appraise");
        skill.setBarbarian(false);
        skill.setBard(true);
        skill.setCleric(true);
        skill.setDruid(false);
        skill.setFighter(false);
        skill.setMonk(true);
        skill.setPaladin(false);
        skill.setRanger(false);
        skill.setRogue(true);
        skill.setSorcerer(true);
        skill.setWizard(true);
        skill.setUntrained(true);
        skill.setAbility(Attribute.INTELLIGENCE);
    }
}
