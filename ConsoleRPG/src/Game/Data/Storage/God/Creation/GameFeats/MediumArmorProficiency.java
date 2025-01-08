package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat;

public class MediumArmorProficiency extends Feat {
    public MediumArmorProficiency(){
        setName("Armor Proficiency, Medium");
        setCombatFeat(true);
        setDependantFeat(new Feat[]{
                new LightArmorProficiency()
        });
    }
}
