package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class ArmorProficiencyH extends Feat {
    public ArmorProficiencyH(){
        setName("Armor Proficiency, Heavy");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyM());
    }
}
