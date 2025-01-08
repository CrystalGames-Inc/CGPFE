package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat;

public class ArcaneArmorTraining extends Feat {
    public ArcaneArmorTraining(){
        setName("Arcane Armor Training");
        setCombatFeat(true);
        setDependantFeat(new Feat[]{
                new LightArmorProficiency()
        });
    }
}
