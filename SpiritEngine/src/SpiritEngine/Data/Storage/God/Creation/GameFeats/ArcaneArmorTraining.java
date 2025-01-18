package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class ArcaneArmorTraining extends Feat {
    public ArcaneArmorTraining(){
        setName("Arcane Armor Training");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyL());
    }
}
