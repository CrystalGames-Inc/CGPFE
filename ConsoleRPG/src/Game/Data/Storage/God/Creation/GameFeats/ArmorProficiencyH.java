package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;

public class ArmorProficiencyH extends Feat {
    public ArmorProficiencyH(){
        setName("Armor Proficiency, Heavy");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyM());
    }
}
