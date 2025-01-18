package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class DisarmImp extends Feat {
    public DisarmImp(){
        setName("Improved Disarm");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
