package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;

public class Acrobatics extends Skill {
    final Skill acrobatics = new Skill();

    void setAcrobatics(){
        acrobatics.setName("Acrobatics");
        acrobatics.setBarbarian(true);
        acrobatics.setBard(true);
    }
}
