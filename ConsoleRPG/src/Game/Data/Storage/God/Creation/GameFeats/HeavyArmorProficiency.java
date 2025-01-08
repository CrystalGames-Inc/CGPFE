package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat;

public class HeavyArmorProficiency extends Feat {
    public HeavyArmorProficiency(){
        setName("Armor Proficiency, Heavy");
        setCombatFeat(true);
        setDependantFeat(new Feat[]{
                new MediumArmorProficiency()
        });
    }
}
