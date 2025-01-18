package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class FeintImp extends Feat {
    public FeintImp(){
        setName("Improved Feint");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
