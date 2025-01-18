package SpiritEngine.Data.Storage.God.Creation.GameFeats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;

public class TripImp extends Feat {
    public TripImp(){
        setName("Improved Trip");
        setCombatFeat(true);
        setDepFeat(new CombatExpertise());
    }
}
