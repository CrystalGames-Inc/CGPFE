package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class ArmorProficiencyM extends Feat {
    public ArmorProficiencyM(){
        setName("Armor Proficiency, Medium");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyL());
    }
}
