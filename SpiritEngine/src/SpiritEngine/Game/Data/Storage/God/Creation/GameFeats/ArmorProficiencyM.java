package SpiritEngine.Game.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.Game.Data.Models.God.Creation.Feat.Feat;

public class ArmorProficiencyM extends Feat {
    public ArmorProficiencyM(){
        setName("Armor Proficiency, Medium");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyL());
    }
}
